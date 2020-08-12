package p000;

import java.util.HashMap;
import java.util.Map;

/* renamed from: Bca */
public enum Bca {
    NULL(0, "#NULL!"),
    DIV0(7, "#DIV/0!"),
    VALUE(15, "#VALUE!"),
    REF(23, "#REF!"),
    NAME(29, "#NAME?"),
    NUM(36, "#NUM!"),
    NA(42, "#N/A");
    

    /* renamed from: h */
    public static Map<String, Bca> f77h;

    /* renamed from: i */
    public static Map<Byte, Bca> f78i;

    /* renamed from: k */
    public byte f80k;

    /* renamed from: l */
    public String f81l;

    static {
        int i;
        Bca[] values;
        f77h = new HashMap();
        f78i = new HashMap();
        for (Bca bca : values()) {
            f78i.put(Byte.valueOf(bca.mo88a()), bca);
            f77h.put(bca.mo89b(), bca);
        }
    }

    /* access modifiers changed from: public */
    Bca(int i, String str) {
        this.f80k = (byte) i;
        this.f81l = str;
    }

    /* renamed from: a */
    public byte mo88a() {
        return this.f80k;
    }

    /* renamed from: b */
    public String mo89b() {
        return this.f81l;
    }
}
