package p000;

import java.io.OutputStream;
import java.util.Arrays;

/* renamed from: fca reason: case insensitive filesystem */
public class C1229fca extends _ba implements C1226eca {

    /* renamed from: b */
    public cda f2997b;

    /* renamed from: c */
    public cda f2998c;

    /* renamed from: d */
    public cda f2999d;

    /* renamed from: e */
    public cda f3000e;

    /* renamed from: f */
    public cda f3001f;

    /* renamed from: g */
    public cda f3002g;

    /* renamed from: h */
    public byte[] f3003h;

    public C1229fca(Bba bba) {
        super(bba);
        this.f3003h = new byte[bba.mo84b()];
        Arrays.fill(this.f3003h, -1);
        new kda(0, -2226271756974174256L, this.f3003h);
        new cda(8, 0, this.f3003h);
        new cda(12, 0, this.f3003h);
        new cda(16, 0, this.f3003h);
        new cda(20, 0, this.f3003h);
        new pda(24, 59, this.f3003h);
        new pda(26, 3, this.f3003h);
        new pda(28, -2, this.f3003h);
        new pda(30, bba.mo85c(), this.f3003h);
        if (bba.mo84b() == 4096) {
            int i = 512;
            while (true) {
                byte[] bArr = this.f3003h;
                if (i >= bArr.length) {
                    break;
                }
                bArr[i] = 0;
                i++;
            }
        }
        new cda(32, 6, this.f3003h);
        new cda(36, 0, this.f3003h);
        new cda(40, 0, this.f3003h);
        this.f2997b = new cda(44, 0, this.f3003h);
        this.f2998c = new cda(48, -2, this.f3003h);
        new cda(52, 0, this.f3003h);
        new cda(56, 4096, this.f3003h);
        this.f2999d = new cda(60, -2, this.f3003h);
        this.f3000e = new cda(64, 0, this.f3003h);
        this.f3001f = new cda(68, -2, this.f3003h);
        this.f3002g = new cda(72, 0, this.f3003h);
    }

    /* renamed from: a */
    public static int m2701a(Bba bba, int i) {
        if (i > 109) {
            return Zba.m1642b(bba, i - C0776fN.AppCompatTheme_tooltipFrameBackground);
        }
        return 0;
    }

    /* renamed from: a */
    public void mo4396a(int i) {
        this.f2998c.mo2005a(i, this.f3003h);
    }

    /* renamed from: a */
    public Zba[] mo4397a(int i, int i2) {
        Zba[] zbaArr;
        this.f2997b.mo2005a(i, this.f3003h);
        int min = Math.min(i, C0776fN.AppCompatTheme_tooltipFrameBackground);
        int i3 = 76;
        for (int i4 = 0; i4 < min; i4++) {
            new cda(i3, i2 + i4, this.f3003h);
            i3 += 4;
        }
        if (i > 109) {
            int i5 = i - 109;
            int[] iArr = new int[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                iArr[i6] = i2 + i6 + C0776fN.AppCompatTheme_tooltipFrameBackground;
            }
            int i7 = i2 + i;
            zbaArr = Zba.m1641a(this.f1798a, iArr, i7);
            this.f3001f.mo2005a(i7, this.f3003h);
        } else {
            zbaArr = Zba.m1641a(this.f1798a, new int[0], 0);
            this.f3001f.mo2005a(-2, this.f3003h);
        }
        this.f3002g.mo2005a(zbaArr.length, this.f3003h);
        return zbaArr;
    }

    /* renamed from: b */
    public void mo4398b(int i) {
        this.f3000e.mo2005a(i, this.f3003h);
    }

    /* renamed from: b */
    public void mo1704b(OutputStream outputStream) {
        mo1821a(outputStream, this.f3003h);
    }

    /* renamed from: c */
    public void mo4399c(int i) {
        this.f2999d.mo2005a(i, this.f3003h);
    }
}
