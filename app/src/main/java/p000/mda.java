package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: mda */
public class mda {

    /* renamed from: a */
    public static Map f3414a = new HashMap();

    /* renamed from: b */
    public static nda f3415b = new lda();

    /* renamed from: c */
    public static String f3416c = null;

    /* renamed from: a */
    public static nda m3128a(Class cls) {
        return m3129a(cls.getName());
    }

    /* renamed from: a */
    public static nda m3129a(String str) {
        nda nda;
        nda nda2;
        if (f3416c == null) {
            try {
                f3416c = System.getProperty("org.apache.poi.util.POILogger");
            } catch (Exception unused) {
            }
            if (f3416c == null) {
                f3416c = f3415b.getClass().getName();
            }
        }
        if (f3416c.equals(f3415b.getClass().getName())) {
            return f3415b;
        }
        if (f3414a.containsKey(str)) {
            nda = (nda) f3414a.get(str);
        } else {
            try {
                nda2 = (nda) Class.forName(f3416c).newInstance();
                nda2.mo4704a(str);
            } catch (Exception unused2) {
                nda2 = f3415b;
            }
            f3414a.put(str, nda2);
            nda = nda2;
        }
        return nda;
    }
}
