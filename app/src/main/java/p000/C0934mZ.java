package p000;

/* renamed from: mZ */
public final class C0934mZ implements Cloneable {

    /* renamed from: a */
    public static final Tca f3403a = Uca.m1284a(64512);

    /* renamed from: b */
    public static final Tca f3404b = Uca.m1284a(127);

    /* renamed from: c */
    public static final Tca f3405c = Uca.m1284a(16256);

    /* renamed from: d */
    public int f3406d = 0;

    /* renamed from: e */
    public int f3407e = 0;

    /* renamed from: a */
    public int mo4776a() {
        return f3405c.mo1256c(this.f3407e);
    }

    /* renamed from: a */
    public void mo4777a(jda jda) {
        jda.writeShort(this.f3406d);
        jda.writeShort(this.f3407e);
    }

    /* renamed from: b */
    public int mo4778b() {
        return f3404b.mo1256c(this.f3407e);
    }

    /* renamed from: c */
    public int mo4779c() {
        return f3403a.mo1256c(this.f3406d);
    }

    public Object clone() {
        C0934mZ mZVar = new C0934mZ();
        mZVar.f3406d = this.f3406d;
        mZVar.f3407e = this.f3407e;
        return mZVar;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("    [Pattern Formatting]\n");
        stringBuffer.append("          .fillpattern= ");
        stringBuffer.append(Integer.toHexString(mo4779c()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("          .fgcoloridx= ");
        stringBuffer.append(Integer.toHexString(mo4778b()));
        stringBuffer.append(str);
        stringBuffer.append("          .bgcoloridx= ");
        stringBuffer.append(Integer.toHexString(mo4776a()));
        stringBuffer.append(str);
        stringBuffer.append("    [/Pattern Formatting]\n");
        return stringBuffer.toString();
    }
}
