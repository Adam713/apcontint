package com.itextpdf.xmp.impl;

import com.itextpdf.text.xml.xmp.DublinCoreSchema;
import com.itextpdf.text.xml.xmp.PdfSchema;
import com.itextpdf.text.xml.xmp.XmpBasicSchema;
import com.itextpdf.xmp.XMPConst;

public class Utils implements XMPConst {
    public static final int UUID_LENGTH = 36;
    public static final int UUID_SEGMENT_COUNT = 4;
    public static boolean[] xmlNameChars;
    public static boolean[] xmlNameStartChars;

    static {
        initCharTables();
    }

    public static boolean checkUUIDFormat(String str) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        int i = 0;
        boolean z2 = true;
        int i2 = 0;
        while (i < str.length()) {
            if (str.charAt(i) == '-') {
                i2++;
                z2 = z2 && (i == 8 || i == 13 || i == 18 || i == 23);
            }
            i++;
        }
        if (z2 && 4 == i2 && 36 == i) {
            z = true;
        }
        return z;
    }

    public static String escapeXML(String str, boolean z, boolean z2) {
        boolean z3;
        String str2;
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                z3 = false;
                break;
            }
            char charAt = str.charAt(i);
            if (charAt == '<' || charAt == '>' || charAt == '&' || ((z2 && (charAt == 9 || charAt == 10 || charAt == 13)) || (z && charAt == '\"'))) {
                z3 = true;
            } else {
                i++;
            }
        }
        z3 = true;
        if (!z3) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer((str.length() * 4) / 3);
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt2 = str.charAt(i2);
            if (!z2 || !(charAt2 == 9 || charAt2 == 10 || charAt2 == 13)) {
                if (charAt2 == '\"') {
                    str2 = z ? "&quot;" : "\"";
                } else if (charAt2 == '&') {
                    str2 = "&amp;";
                } else if (charAt2 == '<') {
                    str2 = "&lt;";
                } else if (charAt2 == '>') {
                    str2 = "&gt;";
                }
                stringBuffer.append(str2);
            } else {
                stringBuffer.append("&#x");
                stringBuffer.append(Integer.toHexString(charAt2).toUpperCase());
                charAt2 = ';';
            }
            stringBuffer.append(charAt2);
        }
        return stringBuffer.toString();
    }

    public static void initCharTables() {
        xmlNameChars = new boolean[256];
        xmlNameStartChars = new boolean[256];
        char c = 0;
        while (c < xmlNameChars.length) {
            boolean z = true;
            xmlNameStartChars[c] = c == ':' || ('A' <= c && c <= 'Z') || c == '_' || (('a' <= c && c <= 'z') || ((192 <= c && c <= 214) || ((216 <= c && c <= 246) || (248 <= c && c <= 255))));
            boolean[] zArr = xmlNameChars;
            if (!xmlNameStartChars[c] && c != '-' && c != '.' && (('0' > c || c > '9') && c != 183)) {
                z = false;
            }
            zArr[c] = z;
            c = (char) (c + 1);
        }
    }

    public static boolean isControlChar(char c) {
        return ((c > 31 && c != 127) || c == 9 || c == 10 || c == 13) ? false : true;
    }

    public static boolean isInternalProperty(String str, String str2) {
        if ("http://purl.org/dc/elements/1.1/".equals(str)) {
            if (DublinCoreSchema.FORMAT.equals(str2) || DublinCoreSchema.LANGUAGE.equals(str2)) {
                return true;
            }
        } else if ("http://ns.adobe.com/xap/1.0/".equals(str)) {
            if (XmpBasicSchema.BASEURL.equals(str2) || XmpBasicSchema.CREATORTOOL.equals(str2) || "xmp:Format".equals(str2) || "xmp:Locale".equals(str2) || XmpBasicSchema.METADATADATE.equals(str2) || XmpBasicSchema.MODIFYDATE.equals(str2)) {
                return true;
            }
        } else if ("http://ns.adobe.com/pdf/1.3/".equals(str)) {
            if ("pdf:BaseURL".equals(str2) || "pdf:Creator".equals(str2) || "pdf:ModDate".equals(str2) || PdfSchema.VERSION.equals(str2) || PdfSchema.PRODUCER.equals(str2)) {
                return true;
            }
        } else if (XMPConst.NS_TIFF.equals(str)) {
            if (!"tiff:ImageDescription".equals(str2) && !"tiff:Artist".equals(str2) && !"tiff:Copyright".equals(str2)) {
                return true;
            }
        } else if (XMPConst.NS_EXIF.equals(str)) {
            if (!"exif:UserComment".equals(str2)) {
                return true;
            }
        } else if (XMPConst.NS_EXIF_AUX.equals(str)) {
            return true;
        } else {
            if (XMPConst.NS_PHOTOSHOP.equals(str)) {
                if ("photoshop:ICCProfile".equals(str2)) {
                    return true;
                }
            } else if (XMPConst.NS_CAMERARAW.equals(str)) {
                if ("crs:Version".equals(str2) || "crs:RawFileName".equals(str2) || "crs:ToneCurveName".equals(str2)) {
                    return true;
                }
            } else if (XMPConst.NS_ADOBESTOCKPHOTO.equals(str) || "http://ns.adobe.com/xap/1.0/mm/".equals(str) || XMPConst.TYPE_TEXT.equals(str) || XMPConst.TYPE_PAGEDFILE.equals(str) || XMPConst.TYPE_GRAPHICS.equals(str) || XMPConst.TYPE_IMAGE.equals(str) || XMPConst.TYPE_FONT.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNameChar(char c) {
        return (c <= 255 && xmlNameChars[c]) || isNameStartChar(c) || (c >= 768 && c <= 879) || (c >= 8255 && c <= 8256);
    }

    public static boolean isNameStartChar(char c) {
        return (c <= 255 && xmlNameStartChars[c]) || (c >= 256 && c <= 767) || ((c >= 880 && c <= 893) || ((c >= 895 && c <= 8191) || ((c >= 8204 && c <= 8205) || ((c >= 8304 && c <= 8591) || ((c >= 11264 && c <= 12271) || ((c >= 12289 && c <= 55295) || ((c >= 63744 && c <= 64975) || ((c >= 65008 && c <= 65533) || (c >= 0 && c <= 65535)))))))));
    }

    public static boolean isXMLName(String str) {
        if (str.length() > 0 && !isNameStartChar(str.charAt(0))) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            if (!isNameChar(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isXMLNameNS(String str) {
        if (str.length() > 0 && (!isNameStartChar(str.charAt(0)) || str.charAt(0) == ':')) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            if (!isNameChar(str.charAt(i)) || str.charAt(i) == ':') {
                return false;
            }
        }
        return true;
    }

    public static String normalizeLangValue(String str) {
        if ("x-default".equals(str)) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int i = 1;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt != ' ') {
                if (charAt == '-' || charAt == '_') {
                    stringBuffer.append('-');
                    i++;
                } else {
                    stringBuffer.append(i != 2 ? Character.toLowerCase(str.charAt(i2)) : Character.toUpperCase(str.charAt(i2)));
                }
            }
        }
        return stringBuffer.toString();
    }

    public static String removeControlChars(String str) {
        StringBuffer stringBuffer = new StringBuffer(str);
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (isControlChar(stringBuffer.charAt(i))) {
                stringBuffer.setCharAt(i, ' ');
            }
        }
        return stringBuffer.toString();
    }

    public static String[] splitNameAndValue(String str) {
        int indexOf = str.indexOf(61);
        String substring = str.substring(str.charAt(1) == '?' ? 2 : 1, indexOf);
        int i = indexOf + 1;
        char charAt = str.charAt(i);
        int i2 = i + 1;
        int length = str.length() - 2;
        StringBuffer stringBuffer = new StringBuffer(length - indexOf);
        while (i2 < length) {
            stringBuffer.append(str.charAt(i2));
            i2++;
            if (str.charAt(i2) == charAt) {
                i2++;
            }
        }
        return new String[]{substring, stringBuffer.toString()};
    }
}
