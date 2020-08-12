package p000;

import com.itextpdf.text.pdf.qrcode.Encoder;
import com.itextpdf.text.xml.xmp.XmpWriter;
import java.io.UnsupportedEncodingException;

/* renamed from: qda */
public class qda {
    /* renamed from: a */
    public static int m3367a(String str) {
        return (str.length() * (m3375b(str) ? 2 : 1)) + 3;
    }

    /* renamed from: a */
    public static String m3368a(hda hda) {
        int a = hda.mo401a();
        return (hda.readByte() & 1) == 0 ? m3369a(hda, a) : m3372b(hda, a);
    }

    /* renamed from: a */
    public static String m3369a(hda hda, int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < cArr.length; i2++) {
            cArr[i2] = (char) hda.mo404b();
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static void m3370a(String str, jda jda) {
        try {
            jda.write(str.getBytes(Encoder.DEFAULT_BYTE_MODE_ENCODING));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static void m3371a(jda jda, String str) {
        jda.writeShort(str.length());
        boolean b = m3375b(str);
        jda.writeByte(b ? 1 : 0);
        if (b) {
            m3373b(str, jda);
        } else {
            m3370a(str, jda);
        }
    }

    /* renamed from: b */
    public static String m3372b(hda hda, int i) {
        char[] cArr = new char[i];
        for (int i2 = 0; i2 < cArr.length; i2++) {
            cArr[i2] = (char) hda.mo401a();
        }
        return new String(cArr);
    }

    /* renamed from: b */
    public static void m3373b(String str, jda jda) {
        try {
            jda.write(str.getBytes(XmpWriter.UTF16LE));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public static void m3374b(jda jda, String str) {
        boolean b = m3375b(str);
        jda.writeByte(b ? 1 : 0);
        if (b) {
            m3373b(str, jda);
        } else {
            m3370a(str, jda);
        }
    }

    /* renamed from: b */
    public static boolean m3375b(String str) {
        if (str == null) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 255) {
                return true;
            }
        }
        return false;
    }
}
