package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.XMPConst;
import com.itextpdf.xmp.XMPException;
import com.itextpdf.xmp.XMPMeta;

public class ParameterAsserts implements XMPConst {
    public static void assertArrayName(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty array name", 4);
        }
    }

    public static void assertImplementation(XMPMeta xMPMeta) {
        if (xMPMeta == null) {
            throw new XMPException("Parameter must not be null", 4);
        } else if (!(xMPMeta instanceof XMPMetaImpl)) {
            throw new XMPException("The XMPMeta-object is not compatible with this implementation", 4);
        }
    }

    public static void assertNotNull(Object obj) {
        if (obj == null) {
            throw new XMPException("Parameter must not be null", 4);
        } else if ((obj instanceof String) && ((String) obj).length() == 0) {
            throw new XMPException("Parameter must not be null or empty", 4);
        }
    }

    public static void assertPrefix(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty prefix", 4);
        }
    }

    public static void assertPropName(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty property name", 4);
        }
    }

    public static void assertSchemaNS(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty schema namespace URI", 4);
        }
    }

    public static void assertSpecificLang(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty specific language", 4);
        }
    }

    public static void assertStructName(String str) {
        if (str == null || str.length() == 0) {
            throw new XMPException("Empty array name", 4);
        }
    }
}
