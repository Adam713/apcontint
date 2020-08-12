package p000;

/* renamed from: SW */
public abstract class C0400SW extends C0080DY implements C0420TW {

    /* renamed from: a */
    public int f1166a;

    /* renamed from: b */
    public int f1167b;

    /* renamed from: c */
    public int f1168c;

    /* renamed from: a */
    public final short mo277a() {
        return (short) this.f1168c;
    }

    /* renamed from: a */
    public final void mo1204a(int i) {
        this.f1166a = i;
    }

    /* renamed from: a */
    public final void mo1205a(C0400SW sw) {
        sw.f1166a = this.f1166a;
        sw.f1167b = this.f1167b;
        sw.f1168c = this.f1168c;
    }

    /* renamed from: a */
    public abstract void mo382a(StringBuilder sb);

    /* renamed from: a */
    public final void mo30a(jda jda) {
        jda.writeShort(getRow());
        jda.writeShort(mo280b());
        jda.writeShort(mo277a());
        mo384b(jda);
    }

    /* renamed from: a */
    public final void mo279a(short s) {
        this.f1168c = s;
    }

    /* renamed from: b */
    public final short mo280b() {
        return (short) this.f1167b;
    }

    /* renamed from: b */
    public abstract void mo384b(jda jda);

    /* renamed from: b */
    public final void mo1206b(short s) {
        this.f1167b = s;
    }

    /* renamed from: g */
    public final int mo36g() {
        return mo386i() + 6;
    }

    public final int getRow() {
        return this.f1166a;
    }

    /* renamed from: h */
    public abstract String mo385h();

    /* renamed from: i */
    public abstract int mo386i();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String h = mo385h();
        sb.append("[");
        sb.append(h);
        String str = "]\n";
        sb.append(str);
        sb.append("    .row    = ");
        sb.append(Yca.m1602c(getRow()));
        String str2 = "\n";
        sb.append(str2);
        sb.append("    .col    = ");
        sb.append(Yca.m1602c((int) mo280b()));
        sb.append(str2);
        sb.append("    .xfindex= ");
        sb.append(Yca.m1602c((int) mo277a()));
        sb.append(str2);
        mo382a(sb);
        sb.append(str2);
        sb.append("[/");
        sb.append(h);
        sb.append(str);
        return sb.toString();
    }
}
