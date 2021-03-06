package com.itextpdf.xmp.impl;

import com.itextpdf.text.xml.xmp.XmpWriter;
import java.io.UnsupportedEncodingException;

public class Latin1Converter {
    public static final int STATE_START = 0;
    public static final int STATE_UTF8CHAR = 11;

    public static ByteBuffer convert(ByteBuffer byteBuffer) {
        if (!XmpWriter.UTF8.equals(byteBuffer.getEncoding())) {
            return byteBuffer;
        }
        byte[] bArr = new byte[8];
        ByteBuffer byteBuffer2 = new ByteBuffer((byteBuffer.length() * 4) / 3);
        int i = 0;
        char c = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < byteBuffer.length()) {
            int charAt = byteBuffer.charAt(i);
            if (c == 11) {
                if (i2 <= 0 || (charAt & 192) != 128) {
                    byteBuffer2.append(convertToUTF8(bArr[0]));
                    i -= i3;
                } else {
                    int i4 = i3 + 1;
                    bArr[i3] = (byte) charAt;
                    i2--;
                    if (i2 == 0) {
                        byteBuffer2.append(bArr, 0, i4);
                    } else {
                        i3 = i4;
                    }
                }
                c = 0;
                i3 = 0;
            } else if (charAt < 127) {
                byteBuffer2.append((byte) charAt);
            } else if (charAt >= 192) {
                int i5 = -1;
                int i6 = charAt;
                while (i5 < 8 && (i6 & 128) == 128) {
                    i5++;
                    i6 <<= 1;
                }
                int i7 = i3 + 1;
                bArr[i3] = (byte) charAt;
                i3 = i7;
                i2 = i5;
                c = 11;
            } else {
                byteBuffer2.append(convertToUTF8((byte) charAt));
            }
            i++;
        }
        if (c == 11) {
            for (int i8 = 0; i8 < i3; i8++) {
                byteBuffer2.append(convertToUTF8(bArr[i8]));
            }
        }
        return byteBuffer2;
    }

    public static byte[] convertToUTF8(byte b) {
        byte b2 = b & Base64.INVALID;
        if (b2 >= 128) {
            if (b2 == 129 || b2 == 141 || b2 == 143 || b2 == 144 || b2 == 157) {
                return new byte[]{32};
            }
            try {
                return new String(new byte[]{b}, "cp1252").getBytes(XmpWriter.UTF8);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new byte[]{b};
    }
}
