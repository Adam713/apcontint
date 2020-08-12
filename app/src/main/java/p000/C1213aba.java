package p000;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: aba reason: case insensitive filesystem */
public final class C1213aba {

    /* renamed from: a */
    public int f1886a = -1;

    /* renamed from: b */
    public final Map f1887b;

    /* renamed from: c */
    public final Map f1888c;

    /* renamed from: d */
    public final Set f1889d;

    public C1213aba(int i) {
        int i2 = (i * 3) / 2;
        this.f1887b = new HashMap(i2);
        this.f1888c = new HashMap(i2);
        this.f1889d = new HashSet();
    }

    /* renamed from: a */
    public C1222dba mo1879a() {
        C1216bba[] bbaArr = new C1216bba[this.f1887b.size()];
        this.f1887b.values().toArray(bbaArr);
        C1216bba[] bbaArr2 = new C1216bba[(this.f1886a + 1)];
        for (C1216bba bba : bbaArr) {
            bbaArr2[bba.mo1950a()] = bba;
        }
        return new C1222dba(bbaArr2, this.f1887b);
    }

    /* renamed from: a */
    public void mo1880a(int i, String str, int i2, int i3, byte b, byte[] bArr, boolean z) {
        C1216bba bba = new C1216bba(i, str, i2, i3, b, bArr);
        Integer valueOf = Integer.valueOf(i);
        if (i > this.f1886a) {
            this.f1886a = i;
        }
        C1216bba bba2 = (C1216bba) this.f1887b.get(str);
        if (bba2 != null) {
            if (!z || !this.f1889d.contains(valueOf)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Multiple entries for function name '");
                sb.append(str);
                sb.append("'");
                throw new RuntimeException(sb.toString());
            }
            this.f1888c.remove(Integer.valueOf(bba2.mo1950a()));
        }
        C1216bba bba3 = (C1216bba) this.f1888c.get(valueOf);
        if (bba3 != null) {
            if (!z || !this.f1889d.contains(valueOf)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Multiple entries for function index (");
                sb2.append(i);
                sb2.append(")");
                throw new RuntimeException(sb2.toString());
            }
            this.f1887b.remove(bba3.mo1952c());
        }
        if (z) {
            this.f1889d.add(valueOf);
        }
        this.f1888c.put(valueOf, bba);
        this.f1887b.put(str, bba);
    }
}
