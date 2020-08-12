package p000;

import com.itextpdf.xmp.XMPError;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aY */
public final class C0616aY extends C0080DY {

    /* renamed from: a */
    public final List<C0617a> f1870a;

    /* renamed from: aY$a */
    private static final class C0617a {

        /* renamed from: a */
        public int f1871a;

        /* renamed from: b */
        public int f1872b;

        /* renamed from: c */
        public int f1873c;

        public C0617a(int i, int i2, int i3) {
            this.f1871a = i;
            this.f1872b = i2;
            this.f1873c = i3;
        }

        /* renamed from: a */
        public void mo1868a(jda jda) {
            jda.writeByte(this.f1871a);
            jda.writeByte(this.f1872b);
            jda.writeByte(this.f1873c);
            jda.writeByte(0);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("  red   = ");
            stringBuffer.append(this.f1871a & 255);
            stringBuffer.append(10);
            stringBuffer.append("  green = ");
            stringBuffer.append(this.f1872b & 255);
            stringBuffer.append(10);
            stringBuffer.append("  blue  = ");
            stringBuffer.append(this.f1873c & 255);
            stringBuffer.append(10);
            return stringBuffer.toString();
        }
    }

    public C0616aY() {
        C0617a[] h = m1782h();
        this.f1870a = new ArrayList(h.length);
        for (C0617a add : h) {
            this.f1870a.add(add);
        }
    }

    /* renamed from: a */
    public static C0617a m1781a(int i, int i2, int i3) {
        return new C0617a(i, i2, i3);
    }

    /* renamed from: h */
    public static C0617a[] m1782h() {
        return new C0617a[]{m1781a(0, 0, 0), m1781a(255, 255, 255), m1781a(255, 0, 0), m1781a(0, 255, 0), m1781a(0, 0, 255), m1781a(255, 255, 0), m1781a(255, 0, 255), m1781a(0, 255, 255), m1781a(128, 0, 0), m1781a(0, 128, 0), m1781a(0, 0, 128), m1781a(128, 128, 0), m1781a(128, 0, 128), m1781a(0, 128, 128), m1781a(192, 192, 192), m1781a(128, 128, 128), m1781a(153, 153, 255), m1781a(153, 51, 102), m1781a(255, 255, XMPError.BADSTREAM), m1781a(XMPError.BADSTREAM, 255, 255), m1781a(102, 0, 102), m1781a(255, 128, 128), m1781a(0, 102, XMPError.BADSTREAM), m1781a(XMPError.BADSTREAM, XMPError.BADSTREAM, 255), m1781a(0, 0, 128), m1781a(255, 0, 255), m1781a(255, 255, 0), m1781a(0, 255, 255), m1781a(128, 0, 128), m1781a(128, 0, 0), m1781a(0, 128, 128), m1781a(0, 0, 255), m1781a(0, XMPError.BADSTREAM, 255), m1781a(XMPError.BADSTREAM, 255, 255), m1781a(XMPError.BADSTREAM, 255, XMPError.BADSTREAM), m1781a(255, 255, 153), m1781a(153, XMPError.BADSTREAM, 255), m1781a(255, 153, XMPError.BADSTREAM), m1781a(XMPError.BADSTREAM, 153, 255), m1781a(255, XMPError.BADSTREAM, 153), m1781a(51, 102, 255), m1781a(51, XMPError.BADSTREAM, XMPError.BADSTREAM), m1781a(153, XMPError.BADSTREAM, 0), m1781a(255, XMPError.BADSTREAM, 0), m1781a(255, 153, 0), m1781a(255, 102, 0), m1781a(102, 102, 153), m1781a(150, 150, 150), m1781a(0, 51, 102), m1781a(51, 153, 102), m1781a(0, 51, 0), m1781a(51, 51, 0), m1781a(153, 51, 0), m1781a(153, 51, 102), m1781a(51, 51, 153), m1781a(51, 51, 51)};
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(this.f1870a.size());
        for (int i = 0; i < this.f1870a.size(); i++) {
            ((C0617a) this.f1870a.get(i)).mo1868a(jda);
        }
    }

    /* renamed from: e */
    public short mo34e() {
        return 146;
    }

    /* renamed from: g */
    public int mo36g() {
        return (this.f1870a.size() * 4) + 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[PALETTE]\n");
        stringBuffer.append("  numcolors     = ");
        stringBuffer.append(this.f1870a.size());
        stringBuffer.append(10);
        for (int i = 0; i < this.f1870a.size(); i++) {
            C0617a aVar = (C0617a) this.f1870a.get(i);
            stringBuffer.append("* colornum      = ");
            stringBuffer.append(i);
            stringBuffer.append(10);
            stringBuffer.append(aVar.toString());
            stringBuffer.append("/*colornum      = ");
            stringBuffer.append(i);
            stringBuffer.append(10);
        }
        stringBuffer.append("[/PALETTE]\n");
        return stringBuffer.toString();
    }
}
