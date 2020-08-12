package com.itextpdf.xmp;

import com.itextpdf.xmp.impl.Base64;
import com.itextpdf.xmp.impl.ISO8601Converter;
import com.itextpdf.xmp.impl.XMPUtilsImpl;
import com.itextpdf.xmp.options.PropertyOptions;

public class XMPUtils {
    public static void appendProperties(XMPMeta xMPMeta, XMPMeta xMPMeta2, boolean z, boolean z2) {
        appendProperties(xMPMeta, xMPMeta2, z, z2, false);
    }

    public static void appendProperties(XMPMeta xMPMeta, XMPMeta xMPMeta2, boolean z, boolean z2, boolean z3) {
        XMPUtilsImpl.appendProperties(xMPMeta, xMPMeta2, z, z2, z3);
    }

    public static String catenateArrayItems(XMPMeta xMPMeta, String str, String str2, String str3, String str4, boolean z) {
        return XMPUtilsImpl.catenateArrayItems(xMPMeta, str, str2, str3, str4, z);
    }

    public static String convertFromBoolean(boolean z) {
        return z ? XMPConst.TRUESTR : XMPConst.FALSESTR;
    }

    public static String convertFromDate(XMPDateTime xMPDateTime) {
        return ISO8601Converter.render(xMPDateTime);
    }

    public static String convertFromDouble(double d) {
        return String.valueOf(d);
    }

    public static String convertFromInteger(int i) {
        return String.valueOf(i);
    }

    public static String convertFromLong(long j) {
        return String.valueOf(j);
    }

    public static boolean convertToBoolean(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty convert-string", 5);
        }
        String lowerCase = str.toLowerCase();
        boolean z = true;
        try {
            if (Integer.parseInt(lowerCase) == 0) {
                z = false;
            }
            return z;
        } catch (NumberFormatException unused) {
            if (!"true".equals(lowerCase) && !"t".equals(lowerCase) && !"on".equals(lowerCase) && !"yes".equals(lowerCase)) {
                z = false;
            }
            return z;
        }
    }

    public static XMPDateTime convertToDate(String str) {
        if (str != null && str.length() != 0) {
            return ISO8601Converter.parse(str);
        }
        throw new XMPException("Empty convert-string", 5);
    }

    public static double convertToDouble(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return Double.parseDouble(str);
                }
            } catch (NumberFormatException unused) {
                throw new XMPException("Invalid double string", 5);
            }
        }
        throw new XMPException("Empty convert-string", 5);
    }

    public static int convertToInteger(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str);
                }
            } catch (NumberFormatException unused) {
                throw new XMPException("Invalid integer string", 5);
            }
        }
        throw new XMPException("Empty convert-string", 5);
    }

    public static long convertToLong(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    return str.startsWith("0x") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
                }
            } catch (NumberFormatException unused) {
                throw new XMPException("Invalid long string", 5);
            }
        }
        throw new XMPException("Empty convert-string", 5);
    }

    public static byte[] decodeBase64(String str) {
        try {
            return Base64.decode(str.getBytes());
        } catch (Throwable th) {
            throw new XMPException("Invalid base64 string", 5, th);
        }
    }

    public static String encodeBase64(byte[] bArr) {
        return new String(Base64.encode(bArr));
    }

    public static void removeProperties(XMPMeta xMPMeta, String str, String str2, boolean z, boolean z2) {
        XMPUtilsImpl.removeProperties(xMPMeta, str, str2, z, z2);
    }

    public static void separateArrayItems(XMPMeta xMPMeta, String str, String str2, String str3, PropertyOptions propertyOptions, boolean z) {
        XMPUtilsImpl.separateArrayItems(xMPMeta, str, str2, str3, propertyOptions, z);
    }
}
