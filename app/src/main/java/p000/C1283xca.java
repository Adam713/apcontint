package p000;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;

/* renamed from: xca reason: case insensitive filesystem */
public class C1283xca {

    /* renamed from: a */
    public static final Pattern f4130a = Pattern.compile(":");

    /* renamed from: b */
    public static final Pattern f4131b = Pattern.compile("^\\[\\$\\-.*?\\]");

    /* renamed from: c */
    public static final Pattern f4132c = Pattern.compile("^\\[[a-zA-Z]+\\]");

    /* renamed from: d */
    public static final Pattern f4133d = Pattern.compile("^[yYmMdDhHsS\\-/,. :\"\\\\]+0?[ampAMP/]*$");

    /* renamed from: a */
    public static Date m3843a(double d, boolean z) {
        if (!m3845a(d)) {
            return null;
        }
        int floor = (int) Math.floor(d);
        double d2 = (double) floor;
        Double.isNaN(d2);
        int i = (int) (((d - d2) * 8.64E7d) + 0.5d);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        m3844a(gregorianCalendar, floor, i, z);
        return gregorianCalendar.getTime();
    }

    /* renamed from: a */
    public static void m3844a(Calendar calendar, int i, int i2, boolean z) {
        int i3;
        int i4;
        if (z) {
            i3 = 1;
            i4 = 1904;
        } else {
            i3 = i < 61 ? 0 : -1;
            i4 = 1900;
        }
        calendar.set(i4, 0, i + i3, 0, 0, 0);
        calendar.set(14, i2);
    }

    /* renamed from: a */
    public static boolean m3845a(double d) {
        return d > -4.9E-324d;
    }

    /* renamed from: a */
    public static boolean m3846a(int i) {
        switch (i) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                break;
            default:
                switch (i) {
                    case C0776fN.AppCompatTheme_buttonStyleSmall /*45*/:
                    case C0776fN.AppCompatTheme_checkboxStyle /*46*/:
                    case C0776fN.AppCompatTheme_checkedTextViewStyle /*47*/:
                        break;
                    default:
                        return false;
                }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m3847a(int i, String str) {
        if (m3846a(i)) {
            return true;
        }
        boolean z = false;
        if (!(str == null || str.length() == 0)) {
            StringBuilder sb = new StringBuilder(str.length());
            int i2 = 0;
            while (i2 < str.length()) {
                char charAt = str.charAt(i2);
                if (i2 < str.length() - 1) {
                    int i3 = i2 + 1;
                    char charAt2 = str.charAt(i3);
                    if (charAt == '\\') {
                        if (!(charAt2 == ' ' || charAt2 == '\\')) {
                            switch (charAt2) {
                                case C0776fN.AppCompatTheme_buttonStyle /*44*/:
                                case C0776fN.AppCompatTheme_buttonStyleSmall /*45*/:
                                case C0776fN.AppCompatTheme_checkboxStyle /*46*/:
                                    break;
                            }
                        }
                        i2++;
                    } else if (charAt == ';' && charAt2 == '@') {
                        i2 = i3;
                        i2++;
                    }
                }
                sb.append(charAt);
                i2++;
            }
            String str2 = "";
            String replaceAll = f4132c.matcher(f4131b.matcher(sb.toString()).replaceAll(str2)).replaceAll(str2);
            if (replaceAll.indexOf(59) > 0 && replaceAll.indexOf(59) < replaceAll.length() - 1) {
                replaceAll = replaceAll.substring(0, replaceAll.indexOf(59));
            }
            z = f4133d.matcher(replaceAll).matches();
        }
        return z;
    }

    /* renamed from: a */
    public static boolean m3848a(C1274uca uca) {
        boolean z = false;
        if (uca == null) {
            return false;
        }
        if (m3845a(uca.mo4679b())) {
            C1277vca c = uca.mo4680c();
            if (c == null) {
                return false;
            }
            z = m3847a((int) c.mo4788b(), c.mo4782a());
        }
        return z;
    }
}
