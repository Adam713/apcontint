package p000;

import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: Wba */
public abstract class Wba implements Sba, Dba {

    /* renamed from: a */
    public String f1410a;

    /* renamed from: b */
    public pda f1411b;

    /* renamed from: c */
    public Vca f1412c;

    /* renamed from: d */
    public Vca f1413d;

    /* renamed from: e */
    public cda f1414e;

    /* renamed from: f */
    public cda f1415f;

    /* renamed from: g */
    public cda f1416g;

    /* renamed from: h */
    public C0446UV f1417h;

    /* renamed from: i */
    public cda f1418i;

    /* renamed from: j */
    public cda f1419j;

    /* renamed from: k */
    public cda f1420k;

    /* renamed from: l */
    public cda f1421l;

    /* renamed from: m */
    public cda f1422m;

    /* renamed from: n */
    public cda f1423n;

    /* renamed from: o */
    public cda f1424o;

    /* renamed from: p */
    public byte[] f1425p = new byte[128];

    /* renamed from: q */
    public int f1426q;

    /* renamed from: r */
    public Sba f1427r;

    /* renamed from: s */
    public Sba f1428s;

    public Wba() {
        Arrays.fill(this.f1425p, 0);
        this.f1411b = new pda(64);
        this.f1412c = new Vca(66);
        this.f1413d = new Vca(67);
        this.f1414e = new cda(68, -1, this.f1425p);
        this.f1415f = new cda(72, -1, this.f1425p);
        this.f1416g = new cda(76, -1, this.f1425p);
        this.f1417h = new C0446UV(this.f1425p, 80);
        this.f1418i = new cda(96, 0, this.f1425p);
        this.f1419j = new cda(100, 0, this.f1425p);
        this.f1420k = new cda(104, 0, this.f1425p);
        this.f1421l = new cda(C0776fN.AppCompatTheme_tooltipForegroundColor, 0, this.f1425p);
        this.f1422m = new cda(C0776fN.AppCompatTheme_windowActionBarOverlay, 0, this.f1425p);
        this.f1423n = new cda(C0776fN.AppCompatTheme_windowFixedWidthMajor);
        this.f1424o = new cda(C0776fN.AppCompatTheme_windowNoTitle, 0, this.f1425p);
        this.f1426q = -1;
        mo1427a("");
        mo1424a((Sba) null);
        mo1431b((Sba) null);
    }

    /* renamed from: a */
    public static boolean m1377a(int i) {
        return i < 4096;
    }

    /* renamed from: a */
    public int mo1422a() {
        return this.f1426q;
    }

    /* renamed from: a */
    public void mo1423a(byte b) {
        this.f1413d.mo1394a(b, this.f1425p);
    }

    /* renamed from: a */
    public void mo1424a(Sba sba) {
        this.f1427r = sba;
        this.f1415f.mo2005a(sba == null ? -1 : ((Wba) sba).mo1422a(), this.f1425p);
    }

    /* renamed from: a */
    public void mo1425a(C0446UV uv) {
        this.f1417h = uv;
        if (uv == null) {
            Arrays.fill(this.f1425p, 80, 96, 0);
        } else {
            uv.mo1312b(this.f1425p, 80);
        }
    }

    /* renamed from: a */
    public void mo1426a(OutputStream outputStream) {
        outputStream.write(this.f1425p);
    }

    /* renamed from: a */
    public void mo1427a(String str) {
        char[] charArray = str.toCharArray();
        int min = Math.min(charArray.length, 31);
        this.f1410a = new String(charArray, 0, min);
        int i = 0;
        short s = 0;
        while (i < min) {
            new pda(s, (short) charArray[i], this.f1425p);
            s = (short) (s + 2);
            i++;
        }
        while (i < 32) {
            new pda(s, 0, this.f1425p);
            s = (short) (s + 2);
            i++;
        }
        this.f1411b.mo5012a((short) ((min + 1) * 2), this.f1425p);
    }

    /* renamed from: b */
    public String mo1428b() {
        return this.f1410a;
    }

    /* renamed from: b */
    public void mo1429b(byte b) {
        this.f1412c.mo1394a(b, this.f1425p);
    }

    /* renamed from: b */
    public void mo1430b(int i) {
        this.f1416g.mo2005a(i, this.f1425p);
    }

    /* renamed from: b */
    public void mo1431b(Sba sba) {
        this.f1428s = sba;
        this.f1414e.mo2005a(sba == null ? -1 : ((Wba) sba).mo1422a(), this.f1425p);
    }

    /* renamed from: c */
    public int mo1432c() {
        return this.f1424o.mo2004a();
    }

    /* renamed from: c */
    public void mo1433c(int i) {
        this.f1426q = i;
    }

    /* renamed from: d */
    public C0446UV mo1434d() {
        return this.f1417h;
    }

    /* renamed from: d */
    public void mo1435d(int i) {
        this.f1424o.mo2005a(i, this.f1425p);
    }

    /* renamed from: e */
    public void mo1436e(int i) {
        this.f1423n.mo2005a(i, this.f1425p);
    }

    /* renamed from: e */
    public abstract boolean mo1240e();

    /* renamed from: f */
    public abstract void mo1241f();

    /* renamed from: g */
    public boolean mo1332g() {
        return m1377a(this.f1424o.mo2004a());
    }
}
