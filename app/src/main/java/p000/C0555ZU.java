package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ZU */
public class C0555ZU {

    /* renamed from: a */
    public final String f1678a;

    /* renamed from: b */
    public final Map<String, C0584_U> f1679b;

    /* renamed from: c */
    public final Map<String, C1146wV> f1680c;

    /* renamed from: d */
    public final Set<String> f1681d;

    public C0555ZU(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Expression can not be empty");
        }
        this.f1678a = str;
        this.f1680c = new HashMap(4);
        this.f1679b = new HashMap(4);
        this.f1681d = new HashSet(4);
    }

    /* renamed from: a */
    public C0533YU mo1682a() {
        if (this.f1678a.length() != 0) {
            return new C0533YU(C0135GV.m253a(this.f1678a, this.f1679b, this.f1680c, this.f1681d), this.f1679b.keySet());
        }
        throw new IllegalArgumentException("The expression can not be empty");
    }
}
