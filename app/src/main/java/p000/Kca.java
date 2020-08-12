package p000;

/* renamed from: Kca */
public abstract class Kca {

    /* renamed from: a */
    public int f594a;

    /* renamed from: b */
    public int f595b;

    /* renamed from: c */
    public int f596c;

    /* renamed from: d */
    public int f597d;

    public Kca(int i, int i2, int i3, int i4) {
        this.f594a = i;
        this.f596c = i2;
        this.f595b = i3;
        this.f597d = i4;
    }

    /* renamed from: a */
    public static void m728a(int i, C1247lca lca) {
        int a = lca.mo4695a();
        if (i > a) {
            StringBuilder sb = new StringBuilder();
            sb.append("Maximum column number is ");
            sb.append(a);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 0) {
            throw new IllegalArgumentException("Minimum column number is 0");
        }
    }

    /* renamed from: b */
    public static void m729b(int i, C1247lca lca) {
        int c = lca.mo4697c();
        if (i > c) {
            StringBuilder sb = new StringBuilder();
            sb.append("Maximum row number is ");
            sb.append(c);
            throw new IllegalArgumentException(sb.toString());
        } else if (i < 0) {
            throw new IllegalArgumentException("Minumum row number is 0");
        }
    }

    /* renamed from: a */
    public final int mo751a() {
        return this.f595b;
    }

    /* renamed from: a */
    public void mo752a(C1247lca lca) {
        m729b(this.f594a, lca);
        m729b(this.f596c, lca);
        m728a(this.f595b, lca);
        m728a(this.f597d, lca);
    }

    /* renamed from: a */
    public boolean mo753a(int i, int i2) {
        return this.f594a <= i && i <= this.f596c && this.f595b <= i2 && i2 <= this.f597d;
    }

    /* renamed from: b */
    public final int mo754b() {
        return this.f594a;
    }

    /* renamed from: c */
    public final int mo755c() {
        return this.f597d;
    }

    /* renamed from: d */
    public final int mo756d() {
        return this.f596c;
    }

    /* renamed from: e */
    public int mo757e() {
        return ((this.f596c - this.f594a) + 1) * ((this.f597d - this.f595b) + 1);
    }

    public final String toString() {
        Mca mca = new Mca(this.f594a, this.f595b);
        Mca mca2 = new Mca(this.f596c, this.f597d);
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(" [");
        sb.append(mca.mo910a());
        sb.append(":");
        sb.append(mca2.mo910a());
        sb.append("]");
        return sb.toString();
    }
}
