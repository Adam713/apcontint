package p000;

/* renamed from: IX */
public class C0179IX extends C0080DY {

    /* renamed from: a */
    public int f394a;

    /* renamed from: b */
    public int f395b;

    /* renamed from: c */
    public int f396c;

    /* renamed from: d */
    public ada f397d;

    /* renamed from: c */
    public static int m369c(int i) {
        return (i * 4) + 20;
    }

    /* renamed from: a */
    public void mo390a(int i) {
        if (this.f397d == null) {
            this.f397d = new ada();
        }
        this.f397d.mo1887a(i);
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeInt(0);
        jda.writeInt(mo394h());
        jda.writeInt(mo395i());
        jda.writeInt(this.f396c);
        for (int i = 0; i < mo396j(); i++) {
            jda.writeInt(mo391b(i));
        }
    }

    /* renamed from: b */
    public int mo391b(int i) {
        return this.f397d.mo1889b(i);
    }

    public Object clone() {
        C0179IX ix = new C0179IX();
        ix.f394a = this.f394a;
        ix.f395b = this.f395b;
        ix.f396c = this.f396c;
        ix.f397d = new ada();
        ix.f397d.mo1888a(this.f397d);
        return ix;
    }

    /* renamed from: d */
    public void mo392d(int i) {
        this.f394a = i;
    }

    /* renamed from: e */
    public short mo34e() {
        return 523;
    }

    /* renamed from: e */
    public void mo393e(int i) {
        this.f395b = i;
    }

    /* renamed from: g */
    public int mo36g() {
        return (mo396j() * 4) + 16;
    }

    /* renamed from: h */
    public int mo394h() {
        return this.f394a;
    }

    /* renamed from: i */
    public int mo395i() {
        return this.f395b;
    }

    /* renamed from: j */
    public int mo396j() {
        ada ada = this.f397d;
        if (ada == null) {
            return 0;
        }
        return ada.mo1885a();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[INDEX]\n");
        stringBuffer.append("    .firstrow       = ");
        stringBuffer.append(Integer.toHexString(mo394h()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .lastrowadd1    = ");
        stringBuffer.append(Integer.toHexString(mo395i()));
        stringBuffer.append(str);
        for (int i = 0; i < mo396j(); i++) {
            stringBuffer.append("    .dbcell_");
            stringBuffer.append(i);
            stringBuffer.append(" = ");
            stringBuffer.append(Integer.toHexString(mo391b(i)));
            stringBuffer.append(str);
        }
        stringBuffer.append("[/INDEX]\n");
        return stringBuffer.toString();
    }
}
