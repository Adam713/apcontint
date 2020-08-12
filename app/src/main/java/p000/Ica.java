package p000;

/* renamed from: Ica */
public class Ica {

    /* renamed from: a */
    public final Mca f416a;

    /* renamed from: b */
    public final Mca f417b;

    /* renamed from: c */
    public final boolean f418c;

    public Ica(Mca mca, Mca mca2) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        short s;
        short s2;
        boolean z5 = true;
        boolean z6 = mca.mo913c() > mca2.mo913c();
        if (mca.mo912b() <= mca2.mo912b()) {
            z5 = false;
        }
        if (z6 || z5) {
            if (z6) {
                i2 = mca2.mo913c();
                z2 = mca2.mo917f();
                i = mca.mo913c();
                z = mca.mo917f();
            } else {
                i2 = mca.mo913c();
                z2 = mca.mo917f();
                i = mca2.mo913c();
                z = mca2.mo917f();
            }
            if (z5) {
                s2 = mca2.mo912b();
                boolean e = mca2.mo915e();
                s = mca.mo912b();
                boolean z7 = e;
                z3 = mca.mo915e();
                z4 = z7;
            } else {
                s2 = mca.mo912b();
                z4 = mca.mo915e();
                s = mca2.mo912b();
                z3 = mca2.mo915e();
            }
            this.f416a = new Mca(i2, s2, z2, z4);
            this.f417b = new Mca(i, s, z, z3);
        } else {
            this.f416a = mca;
            this.f417b = mca2;
        }
        this.f418c = false;
    }

    /* renamed from: a */
    public static boolean m399a(Mca mca, Mca mca2) {
        return mca.mo913c() == 0 && mca.mo917f() && mca2.mo913c() == C1247lca.f3322a.mo4697c() && mca2.mo917f();
    }

    /* renamed from: a */
    public String mo422a() {
        if (mo423b()) {
            StringBuilder sb = new StringBuilder();
            sb.append(Mca.m877a((int) this.f416a.mo912b()));
            sb.append(":");
            sb.append(Mca.m877a((int) this.f417b.mo912b()));
            return sb.toString();
        }
        StringBuffer stringBuffer = new StringBuffer(32);
        stringBuffer.append(this.f416a.mo910a());
        if (!this.f418c) {
            stringBuffer.append(':');
            if (this.f417b.mo914d() == null) {
                stringBuffer.append(this.f417b.mo910a());
            } else {
                this.f417b.mo911a(stringBuffer);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public boolean mo423b() {
        return m399a(this.f416a, this.f417b);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(64);
        stringBuffer.append(Ica.class.getName());
        stringBuffer.append(" [");
        stringBuffer.append(mo422a());
        stringBuffer.append("]");
        return stringBuffer.toString();
    }
}
