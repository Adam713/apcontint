package p000;

import java.util.Comparator;

/* renamed from: LW */
public final class C0250LW extends C0080DY {

    /* renamed from: a */
    public static final Tca f675a = Uca.m1284a(1);

    /* renamed from: b */
    public static final Tca f676b = Uca.m1284a(2);

    /* renamed from: c */
    public static final Comparator<C0250LW> f677c = new C0223KW();

    /* renamed from: d */
    public int f678d;

    /* renamed from: e */
    public int f679e = 0;

    /* renamed from: f */
    public int f680f;

    /* renamed from: g */
    public String f681g;

    public C0250LW(String str) {
        mo849a(str);
    }

    /* renamed from: a */
    public void mo848a(int i) {
        this.f678d = i;
    }

    /* renamed from: a */
    public void mo849a(String str) {
        Rca.m1108a(str);
        this.f681g = str;
        this.f680f = qda.m3375b(str) ? 1 : 0;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeInt(mo850h());
        jda.writeShort(this.f679e);
        String str = this.f681g;
        jda.writeByte(str.length());
        jda.writeByte(this.f680f);
        if (mo852j()) {
            qda.m3373b(str, jda);
        } else {
            qda.m3370a(str, jda);
        }
    }

    /* renamed from: e */
    public short mo34e() {
        return 133;
    }

    /* renamed from: g */
    public int mo36g() {
        return (this.f681g.length() * (mo852j() ? 2 : 1)) + 8;
    }

    /* renamed from: h */
    public int mo850h() {
        return this.f678d;
    }

    /* renamed from: i */
    public String mo851i() {
        return this.f681g;
    }

    /* renamed from: j */
    public final boolean mo852j() {
        return (this.f680f & 1) != 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[BOUNDSHEET]\n");
        stringBuffer.append("    .bof        = ");
        stringBuffer.append(Yca.m1598b(mo850h()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .options    = ");
        stringBuffer.append(Yca.m1602c(this.f679e));
        stringBuffer.append(str);
        stringBuffer.append("    .unicodeflag= ");
        stringBuffer.append(Yca.m1596a(this.f680f));
        stringBuffer.append(str);
        stringBuffer.append("    .sheetname  = ");
        stringBuffer.append(this.f681g);
        stringBuffer.append(str);
        stringBuffer.append("[/BOUNDSHEET]\n");
        return stringBuffer.toString();
    }
}
