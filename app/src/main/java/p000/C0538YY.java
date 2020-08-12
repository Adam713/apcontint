package p000;

import java.util.Arrays;

/* renamed from: YY */
public final class C0538YY extends C0080DY {

    /* renamed from: a */
    public static final byte[] f1638a = new byte[C0776fN.AppCompatTheme_windowActionBarOverlay];

    /* renamed from: b */
    public String f1639b;

    static {
        Arrays.fill(f1638a, 32);
    }

    public C0538YY() {
        mo1646a("");
    }

    /* renamed from: a */
    public void mo1646a(String str) {
        if (112 - ((str.length() * (qda.m3375b(str) ? 2 : 1)) + 3) >= 0) {
            this.f1639b = str;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Name is too long: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        String h = mo1647h();
        boolean b = qda.m3375b(h);
        jda.writeShort(h.length());
        jda.writeByte(b ? 1 : 0);
        if (b) {
            qda.m3373b(h, jda);
        } else {
            qda.m3370a(h, jda);
        }
        jda.write(f1638a, 0, 112 - ((h.length() * (b ? 2 : 1)) + 3));
    }

    /* renamed from: e */
    public short mo34e() {
        return 92;
    }

    /* renamed from: g */
    public int mo36g() {
        return C0776fN.AppCompatTheme_windowActionBarOverlay;
    }

    /* renamed from: h */
    public String mo1647h() {
        return this.f1639b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[WRITEACCESS]\n");
        stringBuffer.append("    .name = ");
        stringBuffer.append(this.f1639b.toString());
        stringBuffer.append("\n");
        stringBuffer.append("[/WRITEACCESS]\n");
        return stringBuffer.toString();
    }
}
