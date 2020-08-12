package com.itextpdf.text.xml;


import com.itextpdf.text.xml.xmp.XmpWriter;
import com.itextpdf.xmp.impl.Base64;

public class XMLUtil {
    public static String escapeXML(String str, boolean z) {
        char[] charArray;
        String str2;
        char c;
        StringBuffer stringBuffer = new StringBuffer();
        for (char c2 : str.toCharArray()) {
            if (c2 == '\"') {
                str2 = "&quot;";
            } else if (c2 == '<') {
                str2 = "&lt;";
            } else if (c2 == '>') {
                str2 = "&gt;";
            } else if (c2 == '&') {
                str2 = "&amp;";
            } else if (c2 != '\'') {
                if (isValidCharacterValue((int) c2)) {
                    if (!z || c2 <= 127) {
                        c = (char) c2;
                    } else {
                        stringBuffer.append("&#");
                        stringBuffer.append(c2);
                        c = ';';
                    }
                    stringBuffer.append(c);
                }
            } else {
                str2 = "&apos;";
            }
            stringBuffer.append(str2);
        }
        return stringBuffer.toString();
    }

    public static int findInArray(char c, char[] cArr, int i) {
        while (i < cArr.length) {
            if (cArr[i] == ';') {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String getEncodingName(byte[] bArr) {
        byte b = bArr[0] & Base64.INVALID;
        byte b2 = bArr[1] & Base64.INVALID;
        String str = XmpWriter.UTF16BE;
        if (b == 254 && b2 == 255) {
            return str;
        }
        String str2 = XmpWriter.UTF16LE;
        if (b == 255 && b2 == 254) {
            return str2;
        }
        byte b3 = bArr[2] & Base64.INVALID;
        String str3 = XmpWriter.UTF8;
        if (b == 239 && b2 == 187 && b3 == 191) {
            return str3;
        }
        byte b4 = bArr[3] & Base64.INVALID;
        String str4 = "ISO-10646-UCS-4";
        return (b == 0 && b2 == 0 && b3 == 0 && b4 == 60) ? str4 : (b == 60 && b2 == 0 && b3 == 0 && b4 == 0) ? str4 : (b == 0 && b2 == 0 && b3 == 60 && b4 == 0) ? str4 : (b == 0 && b2 == 60 && b3 == 0 && b4 == 0) ? str4 : (b == 0 && b2 == 60 && b3 == 0 && b4 == 63) ? str : (b == 60 && b2 == 0 && b3 == 63 && b4 == 0) ? str2 : (b == 76 && b2 == 111 && b3 == 167 && b4 == 148) ? "CP037" : str3;
    }

    public static boolean isValidCharacterValue(int i) {
        return i == 9 || i == 10 || i == 13 || (i >= 32 && i <= 55295) || ((i >= 57344 && i <= 65533) || (i >= 65536 && i <= 1114111));
    }

    public static boolean isValidCharacterValue(String str) {
        try {
            return isValidCharacterValue(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int unescape(String str) {
        if ("apos".equals(str)) {
            return 39;
        }
        if ("quot".equals(str)) {
            return 34;
        }
        if ("lt".equals(str)) {
            return 60;
        }
        if ("gt".equals(str)) {
            return 62;
        }
        return "amp".equals(str) ? 38 : -1;
    }

    public static String unescapeXML(String str) {
        int i;
        int i2;
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        StringBuffer stringBuffer = new StringBuffer();
        int i3 = 0;
        while (i3 < length) {
            char c = charArray[i3];
            if (c == 38) {
                i = findInArray(';', charArray, i3 + 3);
                if (i > -1) {
                    String str2 = new String(charArray, i3 + 1, (i - i3) - 1);
                    if (str2.startsWith("#")) {
                        String substring = str2.substring(1);
                        if (isValidCharacterValue(substring)) {
                            i2 = (char) Integer.parseInt(substring);
                        } else {
                            i3 = i + 1;
                        }
                    } else {
                        int unescape = unescape(str2);
                        if (unescape > 0) {
                            i2 = unescape;
                        }
                    }
                    stringBuffer.append((char) i2);
                    i3 = i + 1;
                }
            }
            i = i3;
            i2 = c;
            stringBuffer.append((char) i2);
            i3 = i + 1;
        }
        return stringBuffer.toString();
    }
}
