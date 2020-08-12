package p000;

/* renamed from: Rca */
public class Rca {
    /* renamed from: a */
    public static void m1108a(String str) {
        if (str != null) {
            int length = str.length();
            if (length >= 1) {
                int i = 0;
                while (i < length) {
                    char charAt = str.charAt(i);
                    if (!(charAt == '*' || charAt == '/' || charAt == ':' || charAt == '?')) {
                        switch (charAt) {
                            case C0776fN.AppCompatTheme_selectableItemBackground /*91*/:
                            case C0776fN.AppCompatTheme_selectableItemBackgroundBorderless /*92*/:
                            case C0776fN.AppCompatTheme_spinnerDropDownItemStyle /*93*/:
                                break;
                            default:
                                i++;
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid char (");
                    sb.append(charAt);
                    sb.append(") found at index (");
                    sb.append(i);
                    sb.append(") in sheet name '");
                    sb.append(str);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
                if (str.charAt(0) == '\'' || str.charAt(length - 1) == '\'') {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid sheet name '");
                    sb2.append(str);
                    sb2.append("'. Sheet names must not begin or end with (').");
                    throw new IllegalArgumentException(sb2.toString());
                }
                return;
            }
            throw new IllegalArgumentException("sheetName must not be empty string");
        }
        throw new IllegalArgumentException("sheetName must not be null");
    }
}
