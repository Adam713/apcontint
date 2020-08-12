package com.itextpdf.xmp;

import com.itextpdf.xmp.impl.Utils;
import com.itextpdf.xmp.impl.xpath.XMPPath;
import com.itextpdf.xmp.impl.xpath.XMPPathParser;

public final class XMPPathFactory {
    public static void assertFieldNS(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty field namespace URI", 101);
        }
    }

    public static void assertFieldName(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty f name", 102);
        }
    }

    public static void assertQualNS(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty qualifier namespace URI", 101);
        }
    }

    public static void assertQualName(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty qualifier name", 102);
        }
    }

    public static String composeArrayItemPath(String str, int i) {
        if (i > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('[');
            sb.append(i);
            sb.append(']');
            return sb.toString();
        } else if (i == -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("[last()]");
            return sb2.toString();
        } else {
            throw new XMPException("Array index must be larger than zero", 104);
        }
    }

    public static String composeFieldSelector(String str, String str2, String str3, String str4) {
        XMPPath expandXPath = XMPPathParser.expandXPath(str2, str3);
        if (expandXPath.size() == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('[');
            sb.append(expandXPath.getSegment(1).getName());
            sb.append("=\"");
            sb.append(str4);
            sb.append("\"]");
            return sb.toString();
        }
        throw new XMPException("The fieldName name must be simple", 102);
    }

    public static String composeLangSelector(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("[?xml:lang=\"");
        sb.append(Utils.normalizeLangValue(str2));
        sb.append("\"]");
        return sb.toString();
    }

    public static String composeQualifierPath(String str, String str2) {
        assertQualNS(str);
        assertQualName(str2);
        XMPPath expandXPath = XMPPathParser.expandXPath(str, str2);
        if (expandXPath.size() == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("/?");
            sb.append(expandXPath.getSegment(1).getName());
            return sb.toString();
        }
        throw new XMPException("The qualifier name must be simple", 102);
    }

    public static String composeStructFieldPath(String str, String str2) {
        assertFieldNS(str);
        assertFieldName(str2);
        XMPPath expandXPath = XMPPathParser.expandXPath(str, str2);
        if (expandXPath.size() == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append('/');
            sb.append(expandXPath.getSegment(1).getName());
            return sb.toString();
        }
        throw new XMPException("The field name must be simple", 102);
    }
}
