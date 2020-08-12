package p000;

/* renamed from: bY */
public final class C0636bY extends C0080DY {

    /* renamed from: a */
    public short f1912a;

    /* renamed from: b */
    public short f1913b;

    /* renamed from: c */
    public short f1914c;

    /* renamed from: d */
    public short f1915d;

    /* renamed from: e */
    public short f1916e;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f1912a);
        jda.writeShort(this.f1913b);
        jda.writeShort(this.f1914c);
        jda.writeShort(this.f1915d);
        jda.writeShort(this.f1916e);
    }

    /* renamed from: b */
    public void mo1927b(short s) {
        this.f1916e = s;
    }

    /* renamed from: c */
    public void mo1928c(short s) {
        this.f1915d = s;
    }

    public Object clone() {
        C0636bY bYVar = new C0636bY();
        bYVar.f1912a = this.f1912a;
        bYVar.f1913b = this.f1913b;
        bYVar.f1914c = this.f1914c;
        bYVar.f1915d = this.f1915d;
        bYVar.f1916e = this.f1916e;
        return bYVar;
    }

    /* renamed from: d */
    public void mo1929d(short s) {
        this.f1914c = s;
    }

    /* renamed from: e */
    public short mo34e() {
        return 65;
    }

    /* renamed from: e */
    public void mo1930e(short s) {
        this.f1912a = s;
    }

    /* renamed from: f */
    public void mo1931f(short s) {
        this.f1913b = s;
    }

    /* renamed from: g */
    public int mo36g() {
        return 10;
    }

    /* renamed from: h */
    public short mo1932h() {
        return this.f1916e;
    }

    /* renamed from: i */
    public short mo1933i() {
        return this.f1915d;
    }

    /* renamed from: j */
    public short mo1934j() {
        return this.f1914c;
    }

    /* renamed from: k */
    public short mo1935k() {
        return this.f1912a;
    }

    /* renamed from: l */
    public short mo1936l() {
        return this.f1913b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[PANE]\n");
        stringBuffer.append("    .x                    = ");
        String str = "0x";
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo1935k()));
        String str2 = " (";
        stringBuffer.append(str2);
        stringBuffer.append(mo1935k());
        String str3 = " )";
        stringBuffer.append(str3);
        String str4 = "line.separator";
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .y                    = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo1936l()));
        stringBuffer.append(str2);
        stringBuffer.append(mo1936l());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .topRow               = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo1934j()));
        stringBuffer.append(str2);
        stringBuffer.append(mo1934j());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .leftColumn           = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo1933i()));
        stringBuffer.append(str2);
        stringBuffer.append(mo1933i());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("    .activePane           = ");
        stringBuffer.append(str);
        stringBuffer.append(Yca.m1593a(mo1932h()));
        stringBuffer.append(str2);
        stringBuffer.append(mo1932h());
        stringBuffer.append(str3);
        stringBuffer.append(System.getProperty(str4));
        stringBuffer.append("[/PANE]\n");
        return stringBuffer.toString();
    }
}
