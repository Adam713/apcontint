package p000;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Qaa */
public final class Qaa {

    /* renamed from: a */
    public static final Pattern f1062a = Pattern.compile("([A-Za-z]+)([0-9]+)");

    /* renamed from: a */
    public static void m1064a(StringBuffer stringBuffer, String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\'') {
                stringBuffer.append('\'');
            }
            stringBuffer.append(charAt);
        }
    }

    /* renamed from: a */
    public static void m1065a(StringBuffer stringBuffer, String str, String str2) {
        if (m1071c(str) || m1071c(str2)) {
            stringBuffer.append('\'');
            stringBuffer.append('[');
            m1064a(stringBuffer, str.replace('[', '(').replace(']', ')'));
            stringBuffer.append(']');
            m1064a(stringBuffer, str2);
            stringBuffer.append('\'');
            return;
        }
        stringBuffer.append('[');
        stringBuffer.append(str);
        stringBuffer.append(']');
        stringBuffer.append(str2);
    }

    /* renamed from: a */
    public static boolean m1066a(char c) {
        if (Character.isLetterOrDigit(c)) {
            return false;
        }
        if (c != 9 && c != 10 && c != 13) {
            return (c == '.' || c == '_') ? false : true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal character (0x");
        sb.append(Integer.toHexString(c));
        sb.append(") found in sheet name");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: a */
    public static boolean m1067a(String str) {
        String str2;
        char charAt = str.charAt(0);
        if (charAt != 'F') {
            if (charAt != 'T') {
                if (charAt != 'f') {
                    if (charAt != 't') {
                        return false;
                    }
                }
            }
            str2 = "TRUE";
            return str2.equalsIgnoreCase(str);
        }
        str2 = "FALSE";
        return str2.equalsIgnoreCase(str);
    }

    /* renamed from: a */
    public static boolean m1068a(String str, String str2) {
        return Mca.m878a(str, str2, C1247lca.EXCEL97);
    }

    /* renamed from: b */
    public static void m1069b(StringBuffer stringBuffer, String str) {
        if (m1071c(str)) {
            stringBuffer.append('\'');
            m1064a(stringBuffer, str);
            stringBuffer.append('\'');
            return;
        }
        stringBuffer.append(str);
    }

    /* renamed from: b */
    public static boolean m1070b(String str) {
        Matcher matcher = f1062a.matcher(str);
        if (!matcher.matches()) {
            return false;
        }
        return m1068a(matcher.group(1), matcher.group(2));
    }

    /* renamed from: c */
    public static boolean m1071c(String str) {
        int length = str.length();
        if (length < 1) {
            throw new RuntimeException("Zero length string is an invalid sheet name");
        } else if (Character.isDigit(str.charAt(0))) {
            return true;
        } else {
            for (int i = 0; i < length; i++) {
                if (m1066a(str.charAt(i))) {
                    return true;
                }
            }
            return (Character.isLetter(str.charAt(0)) && Character.isDigit(str.charAt(length - 1)) && m1070b(str)) || m1067a(str);
        }
    }
}
