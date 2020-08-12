package p000;

/* renamed from: lZ */
public final class C0913lZ {

    /* renamed from: a */
    public static final Tca f3305a = Uca.m1284a(2);

    /* renamed from: b */
    public static final Tca f3306b = Uca.m1284a(8);

    /* renamed from: c */
    public static final Tca f3307c = Uca.m1284a(16);

    /* renamed from: d */
    public static final Tca f3308d = Uca.m1284a(128);

    /* renamed from: e */
    public static final Tca f3309e = Uca.m1284a(2);

    /* renamed from: f */
    public static final Tca f3310f = Uca.m1284a(8);

    /* renamed from: g */
    public static final Tca f3311g = Uca.m1284a(16);

    /* renamed from: h */
    public static final Tca f3312h = Uca.m1284a(128);

    /* renamed from: i */
    public byte[] f3313i;

    public C0913lZ() {
        this(new byte[C0776fN.AppCompatTheme_windowMinWidthMajor]);
        mo4645c(-1);
        mo4655g(false);
        mo4654f(false);
        mo4657h(false);
        mo4659i(false);
        mo4661j(false);
        mo4633a(0);
        mo4646c(0);
        mo4640b(-1);
        mo4651e(false);
        mo4647c(false);
        mo4650d(false);
        mo4641b(false);
        mo4634a(false);
        mo4663k(false);
        mo4639b(0, 0);
        mo4632a(104, 1);
        mo4632a((int) C0776fN.AppCompatTheme_tooltipForegroundColor, 0);
        mo4632a((int) C0776fN.AppCompatTheme_windowActionBarOverlay, Integer.MAX_VALUE);
        mo4639b((int) C0776fN.AppCompatTheme_windowFixedWidthMajor, 1);
    }

    public C0913lZ(byte[] bArr) {
        this.f3313i = bArr;
    }

    /* renamed from: a */
    public final int mo4630a(int i) {
        return dda.m2601b(this.f3313i, i);
    }

    /* renamed from: a */
    public short mo4631a() {
        return mo4638b(74);
    }

    /* renamed from: a */
    public final void mo4632a(int i, int i2) {
        dda.m2597a(this.f3313i, i, i2);
    }

    /* renamed from: a */
    public void mo4633a(short s) {
        mo4639b(74, (int) s);
    }

    /* renamed from: a */
    public void mo4634a(boolean z) {
        mo4632a(92, z ^ true ? 1 : 0);
    }

    /* renamed from: a */
    public final void mo4635a(boolean z, Tca tca) {
        mo4632a(68, tca.mo1249a(mo4630a(68), z));
    }

    /* renamed from: a */
    public final boolean mo4636a(Tca tca) {
        return tca.mo1258d(mo4630a(68));
    }

    /* renamed from: b */
    public short mo4637b() {
        return (short) mo4630a(80);
    }

    /* renamed from: b */
    public final short mo4638b(int i) {
        return dda.m2603d(this.f3313i, i);
    }

    /* renamed from: b */
    public final void mo4639b(int i, int i2) {
        dda.m2599a(this.f3313i, i, (short) i2);
    }

    /* renamed from: b */
    public void mo4640b(short s) {
        mo4632a(80, (int) s);
    }

    /* renamed from: b */
    public void mo4641b(boolean z) {
        mo4642b(z, f3312h);
    }

    /* renamed from: b */
    public final void mo4642b(boolean z, Tca tca) {
        mo4632a(88, tca.mo1248a(mo4630a(88), z ^ true ? 1 : 0));
    }

    /* renamed from: b */
    public final boolean mo4643b(Tca tca) {
        return tca.mo1256c(mo4630a(88)) == 0;
    }

    /* renamed from: c */
    public int mo4644c() {
        return mo4630a(64);
    }

    /* renamed from: c */
    public void mo4645c(int i) {
        mo4632a(64, i);
    }

    /* renamed from: c */
    public void mo4646c(short s) {
        mo4639b(76, (int) s);
    }

    /* renamed from: c */
    public void mo4647c(boolean z) {
        mo4642b(z, f3310f);
    }

    public Object clone() {
        return new C0913lZ((byte[]) this.f3313i.clone());
    }

    /* renamed from: d */
    public short mo4649d() {
        return mo4638b(72);
    }

    /* renamed from: d */
    public void mo4650d(boolean z) {
        mo4642b(z, f3311g);
    }

    /* renamed from: e */
    public void mo4651e(boolean z) {
        mo4642b(z, f3309e);
    }

    /* renamed from: e */
    public byte[] mo4652e() {
        return this.f3313i;
    }

    /* renamed from: f */
    public short mo4653f() {
        return mo4638b(76);
    }

    /* renamed from: f */
    public void mo4654f(boolean z) {
        mo4632a(100, z ^ true ? 1 : 0);
    }

    /* renamed from: g */
    public void mo4655g(boolean z) {
        mo4635a(z, f3305a);
    }

    /* renamed from: g */
    public boolean mo4656g() {
        return mo4630a(92) == 0;
    }

    /* renamed from: h */
    public void mo4657h(boolean z) {
        mo4635a(z, f3306b);
    }

    /* renamed from: h */
    public boolean mo4658h() {
        return mo4643b(f3312h);
    }

    /* renamed from: i */
    public void mo4659i(boolean z) {
        mo4635a(z, f3307c);
    }

    /* renamed from: i */
    public boolean mo4660i() {
        return mo4643b(f3310f);
    }

    /* renamed from: j */
    public void mo4661j(boolean z) {
        mo4635a(z, f3308d);
    }

    /* renamed from: j */
    public boolean mo4662j() {
        return mo4643b(f3311g);
    }

    /* renamed from: k */
    public void mo4663k(boolean z) {
        mo4632a(96, z ^ true ? 1 : 0);
    }

    /* renamed from: k */
    public boolean mo4664k() {
        return mo4643b(f3309e);
    }

    /* renamed from: l */
    public boolean mo4665l() {
        return mo4636a(f3305a);
    }

    /* renamed from: m */
    public boolean mo4666m() {
        return mo4636a(f3306b);
    }

    /* renamed from: n */
    public boolean mo4667n() {
        return mo4636a(f3307c);
    }

    /* renamed from: o */
    public boolean mo4668o() {
        return mo4636a(f3308d);
    }

    /* renamed from: p */
    public boolean mo4669p() {
        return mo4630a(96) == 0;
    }

    public String toString() {
        String str;
        String str2;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\t[Font Formatting]\n");
        stringBuffer.append("\t.font height = ");
        stringBuffer.append(mo4644c());
        stringBuffer.append(" twips\n");
        String str3 = "\n";
        if (mo4664k()) {
            stringBuffer.append("\t.font posture = ");
            str = mo4665l() ? "Italic" : "Normal";
        } else {
            str = "\t.font posture = ]not modified]";
        }
        stringBuffer.append(str);
        stringBuffer.append(str3);
        if (mo4660i()) {
            stringBuffer.append("\t.font outline = ");
            stringBuffer.append(mo4666m());
            stringBuffer.append(str3);
        } else {
            stringBuffer.append("\t.font outline is not modified\n");
        }
        if (mo4662j()) {
            stringBuffer.append("\t.font shadow = ");
            stringBuffer.append(mo4667n());
            stringBuffer.append(str3);
        } else {
            stringBuffer.append("\t.font shadow is not modified\n");
        }
        if (mo4658h()) {
            stringBuffer.append("\t.font strikeout = ");
            stringBuffer.append(mo4668o());
            stringBuffer.append(str3);
        } else {
            stringBuffer.append("\t.font strikeout is not modified\n");
        }
        String str4 = "0x";
        if (mo4664k()) {
            stringBuffer.append("\t.font weight = ");
            stringBuffer.append(mo4649d());
            if (mo4649d() == 400) {
                str2 = "(Normal)";
            } else if (mo4649d() == 700) {
                str2 = "(Bold)";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str4);
                sb.append(Integer.toHexString(mo4649d()));
                str2 = sb.toString();
            }
        } else {
            str2 = "\t.font weight = ]not modified]";
        }
        stringBuffer.append(str2);
        stringBuffer.append(str3);
        if (mo4656g()) {
            stringBuffer.append("\t.escapement type = ");
            stringBuffer.append(mo4631a());
            stringBuffer.append(str3);
        } else {
            stringBuffer.append("\t.escapement type is not modified\n");
        }
        if (mo4669p()) {
            stringBuffer.append("\t.underline type = ");
            stringBuffer.append(mo4653f());
            stringBuffer.append(str3);
        } else {
            stringBuffer.append("\t.underline type is not modified\n");
        }
        stringBuffer.append("\t.color index = ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        sb2.append(Integer.toHexString(mo4637b()).toUpperCase());
        stringBuffer.append(sb2.toString());
        stringBuffer.append(str3);
        stringBuffer.append("\t[/Font Formatting]\n");
        return stringBuffer.toString();
    }
}
