package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: Uca */
public class Uca {

    /* renamed from: a */
    public static Map f1304a = new HashMap();

    /* renamed from: a */
    public static Tca m1284a(int i) {
        Tca tca = (Tca) f1304a.get(Integer.valueOf(i));
        if (tca != null) {
            return tca;
        }
        Tca tca2 = new Tca(i);
        f1304a.put(Integer.valueOf(i), tca2);
        return tca2;
    }
}
