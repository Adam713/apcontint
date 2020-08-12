package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: tca reason: case insensitive filesystem */
public final class C1271tca {

    /* renamed from: a */
    public static final String[] f3813a;

    static {
        ArrayList arrayList = new ArrayList();
        m3501a(arrayList, 0, "General");
        m3501a(arrayList, 1, "0");
        m3501a(arrayList, 2, "0.00");
        m3501a(arrayList, 3, "#,##0");
        m3501a(arrayList, 4, "#,##0.00");
        m3501a(arrayList, 5, "$#,##0_);($#,##0)");
        m3501a(arrayList, 6, "$#,##0_);[Red]($#,##0)");
        m3501a(arrayList, 7, "$#,##0.00_);($#,##0.00)");
        m3501a(arrayList, 8, "$#,##0.00_);[Red]($#,##0.00)");
        m3501a(arrayList, 9, "0%");
        m3501a(arrayList, 10, "0.00%");
        m3501a(arrayList, 11, "0.00E+00");
        m3501a(arrayList, 12, "# ?/?");
        m3501a(arrayList, 13, "# ??/??");
        m3501a(arrayList, 14, "m/d/yy");
        m3501a(arrayList, 15, "d-mmm-yy");
        m3501a(arrayList, 16, "d-mmm");
        m3501a(arrayList, 17, "mmm-yy");
        m3501a(arrayList, 18, "h:mm AM/PM");
        m3501a(arrayList, 19, "h:mm:ss AM/PM");
        m3501a(arrayList, 20, "h:mm");
        m3501a(arrayList, 21, "h:mm:ss");
        m3501a(arrayList, 22, "m/d/yy h:mm");
        for (int i = 23; i <= 36; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("reserved-0x");
            sb.append(Integer.toHexString(i));
            m3501a(arrayList, i, sb.toString());
        }
        m3501a(arrayList, 37, "#,##0_);(#,##0)");
        m3501a(arrayList, 38, "#,##0_);[Red](#,##0)");
        m3501a(arrayList, 39, "#,##0.00_);(#,##0.00)");
        m3501a(arrayList, 40, "#,##0.00_);[Red](#,##0.00)");
        m3501a(arrayList, 41, "_(*#,##0_);_(*(#,##0);_(* \"-\"_);_(@_)");
        m3501a(arrayList, 42, "_($*#,##0_);_($*(#,##0);_($* \"-\"_);_(@_)");
        m3501a(arrayList, 43, "_(*#,##0.00_);_(*(#,##0.00);_(*\"-\"??_);_(@_)");
        m3501a(arrayList, 44, "_($*#,##0.00_);_($*(#,##0.00);_($*\"-\"??_);_(@_)");
        m3501a(arrayList, 45, "mm:ss");
        m3501a(arrayList, 46, "[h]:mm:ss");
        m3501a(arrayList, 47, "mm:ss.0");
        m3501a(arrayList, 48, "##0.0E+0");
        m3501a(arrayList, 49, "@");
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        f3813a = strArr;
    }

    /* renamed from: a */
    public static void m3501a(List<String> list, int i, String str) {
        if (list.size() == i) {
            list.add(str);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("index ");
        sb.append(i);
        sb.append(" is wrong");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public static String[] m3502a() {
        return (String[]) f3813a.clone();
    }
}
