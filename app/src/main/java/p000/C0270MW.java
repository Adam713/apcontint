package p000;

/* renamed from: MW */
public final class C0270MW extends C0080DY {

    /* renamed from: a */
    public int f729a;

    /* renamed from: b */
    public int f730b;

    /* renamed from: c */
    public Jca f731c;

    /* renamed from: d */
    public Lca f732d = new Lca();

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f729a);
        jda.writeShort(this.f730b);
        this.f731c.mo647a(jda);
        this.f732d.mo873a(jda);
    }

    public Object clone() {
        C0270MW mw = new C0270MW();
        mw.f729a = this.f729a;
        mw.f730b = this.f730b;
        mw.f731c = this.f731c;
        mw.f732d = this.f732d.mo871a();
        return mw;
    }

    /* renamed from: e */
    public short mo34e() {
        return 432;
    }

    /* renamed from: g */
    public int mo36g() {
        return this.f732d.mo875c() + 12;
    }

    /* renamed from: h */
    public Jca mo901h() {
        return this.f731c;
    }

    /* renamed from: i */
    public boolean mo902i() {
        return this.f730b == 1;
    }

    /* renamed from: j */
    public int mo903j() {
        return this.f729a;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[CFHEADER]\n");
        stringBuffer.append("\t.id\t\t= ");
        stringBuffer.append(Integer.toHexString(432));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("\t.numCF\t\t\t= ");
        stringBuffer.append(mo903j());
        stringBuffer.append(str);
        stringBuffer.append("\t.needRecalc\t   = ");
        stringBuffer.append(mo902i());
        stringBuffer.append(str);
        stringBuffer.append("\t.enclosingCellRange= ");
        stringBuffer.append(mo901h());
        stringBuffer.append(str);
        stringBuffer.append("\t.cfranges=[");
        int i = 0;
        while (i < this.f732d.mo874b()) {
            stringBuffer.append(i == 0 ? "" : ",");
            stringBuffer.append(this.f732d.mo870a(i).toString());
            i++;
        }
        stringBuffer.append("]\n");
        stringBuffer.append("[/CFHEADER]\n");
        return stringBuffer.toString();
    }
}
