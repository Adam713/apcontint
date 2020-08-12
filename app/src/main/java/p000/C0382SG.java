package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.NetworkInfo;
import com.itextpdf.tool.xml.css.parser.CssSelectorParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: SG */
public class C0382SG implements Runnable {

    /* renamed from: a */
    public static final Object f1101a = new Object();

    /* renamed from: b */
    public static final ThreadLocal<StringBuilder> f1102b = new C0254MG();

    /* renamed from: c */
    public static final AtomicInteger f1103c = new AtomicInteger();

    /* renamed from: d */
    public static final C1064tH f1104d = new C0274NG();

    /* renamed from: e */
    public final int f1105e = f1103c.incrementAndGet();

    /* renamed from: f */
    public final C0889lH f1106f;

    /* renamed from: g */
    public final C0561_G f1107g;

    /* renamed from: h */
    public final C0426UG f1108h;

    /* renamed from: i */
    public final C1125wH f1109i;

    /* renamed from: j */
    public final String f1110j;

    /* renamed from: k */
    public final C1024rH f1111k;

    /* renamed from: l */
    public final int f1112l;

    /* renamed from: m */
    public int f1113m;

    /* renamed from: n */
    public final C1064tH f1114n;

    /* renamed from: o */
    public C0202KG f1115o;

    /* renamed from: p */
    public List<C0202KG> f1116p;

    /* renamed from: q */
    public Bitmap f1117q;

    /* renamed from: r */
    public Future<?> f1118r;

    /* renamed from: s */
    public C0893d f1119s;

    /* renamed from: t */
    public Exception f1120t;

    /* renamed from: u */
    public int f1121u;

    /* renamed from: v */
    public int f1122v;

    /* renamed from: w */
    public C0894e f1123w;

    public C0382SG(C0889lH lHVar, C0561_G _g, C0426UG ug, C1125wH wHVar, C0202KG kg, C1064tH tHVar) {
        this.f1106f = lHVar;
        this.f1107g = _g;
        this.f1108h = ug;
        this.f1109i = wHVar;
        this.f1115o = kg;
        this.f1110j = kg.mo653c();
        this.f1111k = kg.mo658h();
        this.f1123w = kg.mo657g();
        this.f1112l = kg.mo654d();
        this.f1113m = kg.mo655e();
        this.f1114n = tHVar;
        this.f1122v = tHVar.mo4500a();
    }

    /* renamed from: a */
    public static C0382SG m1109a(C0889lH lHVar, C0561_G _g, C0426UG ug, C1125wH wHVar, C0202KG kg) {
        C1024rH h = kg.mo658h();
        List a = lHVar.mo4596a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            C1064tH tHVar = (C1064tH) a.get(i);
            if (tHVar.mo760a(h)) {
                C0382SG sg = new C0382SG(lHVar, _g, ug, wHVar, kg, tHVar);
                return sg;
            }
        }
        C0382SG sg2 = new C0382SG(lHVar, _g, ug, wHVar, kg, f1104d);
        return sg2;
    }

    /* renamed from: a */
    public static Bitmap m1110a(InputStream inputStream, C1024rH rHVar) {
        C0747eH eHVar = new C0747eH(inputStream);
        long a = eHVar.mo4302a((int) CssSelectorParser.f2021a);
        Options b = C1064tH.m3456b(rHVar);
        boolean a2 = C1064tH.m3455a(b);
        boolean b2 = C0039CH.m104b((InputStream) eHVar);
        eHVar.mo4303a(a);
        if (b2) {
            byte[] c = C0039CH.m106c((InputStream) eHVar);
            if (a2) {
                BitmapFactory.decodeByteArray(c, 0, c.length, b);
                C1064tH.m3454a(rHVar.f3653i, rHVar.f3654j, b, rHVar);
            }
            return BitmapFactory.decodeByteArray(c, 0, c.length, b);
        }
        if (a2) {
            BitmapFactory.decodeStream(eHVar, null, b);
            C1064tH.m3454a(rHVar.f3653i, rHVar.f3654j, b, rHVar);
            eHVar.mo4303a(a);
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(eHVar, null, b);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    /* renamed from: a */
    public static Bitmap m1111a(List<C1171yH> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            C1171yH yHVar = (C1171yH) list.get(i);
            try {
                Bitmap a = yHVar.mo5456a(bitmap);
                if (a == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(yHVar.key());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (C1171yH key : list) {
                        sb.append(key.key());
                        sb.append(10);
                    }
                    C0889lH.f3241a.post(new C0320PG(sb));
                    return null;
                } else if (a == bitmap && bitmap.isRecycled()) {
                    C0889lH.f3241a.post(new C0340QG(yHVar));
                    return null;
                } else if (a == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = a;
                } else {
                    C0889lH.f3241a.post(new C0362RG(yHVar));
                    return null;
                }
            } catch (RuntimeException e) {
                C0889lH.f3241a.post(new C0296OG(yHVar, e));
                return null;
            }
        }
        return bitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static Bitmap m1112a(p000.C1024rH r13, Bitmap r14, int r15) {
        /*
            int r0 = r14.getWidth()
            int r1 = r14.getHeight()
            boolean r2 = r13.f3657m
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            boolean r3 = r13.mo5050e()
            r4 = 0
            if (r3 == 0) goto L_0x00af
            int r3 = r13.f3653i
            int r5 = r13.f3654j
            float r6 = r13.f3658n
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 == 0) goto L_0x0030
            boolean r7 = r13.f3661q
            if (r7 == 0) goto L_0x002d
            float r7 = r13.f3659o
            float r9 = r13.f3660p
            r8.setRotate(r6, r7, r9)
            goto L_0x0030
        L_0x002d:
            r8.setRotate(r6)
        L_0x0030:
            boolean r6 = r13.f3655k
            if (r6 == 0) goto L_0x0074
            float r13 = (float) r3
            float r6 = (float) r0
            float r7 = r13 / r6
            float r9 = (float) r5
            float r10 = (float) r1
            float r11 = r9 / r10
            int r12 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x0054
            float r11 = r11 / r7
            float r10 = r10 * r11
            double r10 = (double) r10
            double r10 = java.lang.Math.ceil(r10)
            int r13 = (int) r10
            int r6 = r1 - r13
            int r6 = r6 / 2
            float r10 = (float) r13
            float r11 = r9 / r10
            r9 = r13
            r13 = r7
            r7 = r0
            goto L_0x0067
        L_0x0054:
            float r7 = r7 / r11
            float r6 = r6 * r7
            double r6 = (double) r6
            double r6 = java.lang.Math.ceil(r6)
            int r6 = (int) r6
            int r7 = r0 - r6
            int r7 = r7 / 2
            float r9 = (float) r6
            float r13 = r13 / r9
            r9 = r1
            r4 = r7
            r7 = r6
            r6 = 0
        L_0x0067:
            boolean r0 = m1114a(r2, r0, r1, r3, r5)
            if (r0 == 0) goto L_0x0070
            r8.preScale(r13, r11)
        L_0x0070:
            r5 = r6
            r6 = r7
            r7 = r9
            goto L_0x00b2
        L_0x0074:
            boolean r13 = r13.f3656l
            if (r13 == 0) goto L_0x008e
            float r13 = (float) r3
            float r6 = (float) r0
            float r13 = r13 / r6
            float r6 = (float) r5
            float r7 = (float) r1
            float r6 = r6 / r7
            int r7 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r13 = r6
        L_0x0084:
            boolean r2 = m1114a(r2, r0, r1, r3, r5)
            if (r2 == 0) goto L_0x00af
            r8.preScale(r13, r13)
            goto L_0x00af
        L_0x008e:
            if (r3 != 0) goto L_0x0092
            if (r5 == 0) goto L_0x00af
        L_0x0092:
            if (r3 != r0) goto L_0x0096
            if (r5 == r1) goto L_0x00af
        L_0x0096:
            if (r3 == 0) goto L_0x009b
            float r13 = (float) r3
            float r6 = (float) r0
            goto L_0x009d
        L_0x009b:
            float r13 = (float) r5
            float r6 = (float) r1
        L_0x009d:
            float r13 = r13 / r6
            if (r5 == 0) goto L_0x00a3
            float r6 = (float) r5
            float r7 = (float) r1
            goto L_0x00a5
        L_0x00a3:
            float r6 = (float) r3
            float r7 = (float) r0
        L_0x00a5:
            float r6 = r6 / r7
            boolean r2 = m1114a(r2, r0, r1, r3, r5)
            if (r2 == 0) goto L_0x00af
            r8.preScale(r13, r6)
        L_0x00af:
            r6 = r0
            r7 = r1
            r5 = 0
        L_0x00b2:
            if (r15 == 0) goto L_0x00b8
            float r13 = (float) r15
            r8.preRotate(r13)
        L_0x00b8:
            r9 = 1
            r3 = r14
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)
            if (r13 == r14) goto L_0x00c4
            r14.recycle()
            goto L_0x00c5
        L_0x00c4:
            r13 = r14
        L_0x00c5:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0382SG.m1112a(rH, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    /* renamed from: a */
    public static void m1113a(C1024rH rHVar) {
        String a = rHVar.mo5046a();
        StringBuilder sb = (StringBuilder) f1102b.get();
        sb.ensureCapacity(a.length() + 8);
        sb.replace(8, sb.length(), a);
        Thread.currentThread().setName(sb.toString());
    }

    /* renamed from: a */
    public static boolean m1114a(boolean z, int i, int i2, int i3, int i4) {
        return !z || i > i3 || i2 > i4;
    }

    /* renamed from: a */
    public void mo1155a(C0202KG kg) {
        String str;
        String str2;
        boolean z = this.f1106f.f3256p;
        C1024rH rHVar = kg.f501b;
        String str3 = "to ";
        String str4 = "joined";
        String str5 = "Hunter";
        if (this.f1115o == null) {
            this.f1115o = kg;
            if (z) {
                List<C0202KG> list = this.f1116p;
                if (list == null || list.isEmpty()) {
                    str = rHVar.mo5049d();
                    str2 = "to empty hunter";
                } else {
                    str = rHVar.mo5049d();
                    str2 = C0039CH.m92a(this, str3);
                }
                C0039CH.m99a(str5, str4, str, str2);
            }
            return;
        }
        if (this.f1116p == null) {
            this.f1116p = new ArrayList(3);
        }
        this.f1116p.add(kg);
        if (z) {
            C0039CH.m99a(str5, str4, rHVar.mo5049d(), C0039CH.m92a(this, str3));
        }
        C0894e g = kg.mo657g();
        if (g.ordinal() > this.f1123w.ordinal()) {
            this.f1123w = g;
        }
    }

    /* renamed from: a */
    public boolean mo1156a() {
        if (this.f1115o != null) {
            return false;
        }
        List<C0202KG> list = this.f1116p;
        if (list != null && !list.isEmpty()) {
            return false;
        }
        Future<?> future = this.f1118r;
        return future != null && future.cancel(false);
    }

    /* renamed from: a */
    public boolean mo1157a(boolean z, NetworkInfo networkInfo) {
        if (!(this.f1122v > 0)) {
            return false;
        }
        this.f1122v--;
        return this.f1114n.mo4501a(z, networkInfo);
    }

    /* renamed from: b */
    public final C0894e mo1158b() {
        C0894e eVar = C0894e.LOW;
        List<C0202KG> list = this.f1116p;
        boolean z = true;
        boolean z2 = list != null && !list.isEmpty();
        if (this.f1115o == null && !z2) {
            z = false;
        }
        if (!z) {
            return eVar;
        }
        C0202KG kg = this.f1115o;
        if (kg != null) {
            eVar = kg.mo657g();
        }
        if (z2) {
            int size = this.f1116p.size();
            for (int i = 0; i < size; i++) {
                C0894e g = ((C0202KG) this.f1116p.get(i)).mo657g();
                if (g.ordinal() > eVar.ordinal()) {
                    eVar = g;
                }
            }
        }
        return eVar;
    }

    /* renamed from: b */
    public void mo1159b(C0202KG kg) {
        boolean z;
        if (this.f1115o == kg) {
            this.f1115o = null;
            z = true;
        } else {
            List<C0202KG> list = this.f1116p;
            z = list != null ? list.remove(kg) : false;
        }
        if (z && kg.mo657g() == this.f1123w) {
            this.f1123w = mo1158b();
        }
        if (this.f1106f.f3256p) {
            C0039CH.m99a("Hunter", "removed", kg.f501b.mo5049d(), C0039CH.m92a(this, "from "));
        }
    }

    /* renamed from: c */
    public C0202KG mo1160c() {
        return this.f1115o;
    }

    /* renamed from: d */
    public List<C0202KG> mo1161d() {
        return this.f1116p;
    }

    /* renamed from: e */
    public C1024rH mo1162e() {
        return this.f1111k;
    }

    /* renamed from: f */
    public Exception mo1163f() {
        return this.f1120t;
    }

    /* renamed from: g */
    public String mo1164g() {
        return this.f1110j;
    }

    /* renamed from: h */
    public C0893d mo1165h() {
        return this.f1119s;
    }

    /* renamed from: i */
    public int mo1166i() {
        return this.f1112l;
    }

    /* renamed from: j */
    public C0889lH mo1167j() {
        return this.f1106f;
    }

    /* renamed from: k */
    public C0894e mo1168k() {
        return this.f1123w;
    }

    /* renamed from: l */
    public Bitmap mo1169l() {
        return this.f1117q;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: m */
    public Bitmap mo1170m() {
        Bitmap bitmap;
        if (C0789gH.m2710a(this.f1112l)) {
            bitmap = this.f1108h.get(this.f1110j);
            if (bitmap != null) {
                this.f1109i.mo5272b();
                this.f1119s = C0893d.MEMORY;
                if (this.f1106f.f3256p) {
                    C0039CH.m99a("Hunter", "decoded", this.f1111k.mo5049d(), "from cache");
                }
                return bitmap;
            }
        } else {
            bitmap = null;
        }
        this.f1111k.f3648d = this.f1122v == 0 ? C0809hH.OFFLINE.f3040e : this.f1113m;
        C1065a a = this.f1114n.mo759a(this.f1111k, this.f1113m);
        if (a != null) {
            this.f1119s = a.mo5122c();
            this.f1121u = a.mo5121b();
            bitmap = a.mo5120a();
            if (bitmap == null) {
                InputStream d = a.mo5123d();
                try {
                    Bitmap a2 = m1110a(d, this.f1111k);
                    C0039CH.m97a(d);
                    bitmap = a2;
                } catch (Throwable th) {
                    C0039CH.m97a(d);
                    throw th;
                }
            }
        }
        if (bitmap != null) {
            if (this.f1106f.f3256p) {
                C0039CH.m98a("Hunter", "decoded", this.f1111k.mo5049d());
            }
            this.f1109i.mo5269a(bitmap);
            if (this.f1111k.mo5051f() || this.f1121u != 0) {
                synchronized (f1101a) {
                    if (this.f1111k.mo5050e() || this.f1121u != 0) {
                        bitmap = m1112a(this.f1111k, bitmap, this.f1121u);
                        if (this.f1106f.f3256p) {
                            C0039CH.m98a("Hunter", "transformed", this.f1111k.mo5049d());
                        }
                    }
                    if (this.f1111k.mo5047b()) {
                        bitmap = m1111a(this.f1111k.f3652h, bitmap);
                        if (this.f1106f.f3256p) {
                            C0039CH.m99a("Hunter", "transformed", this.f1111k.mo5049d(), "from custom transformations");
                        }
                    }
                }
                if (bitmap != null) {
                    this.f1109i.mo5274b(bitmap);
                }
            }
        }
        return bitmap;
    }

    /* renamed from: n */
    public boolean mo1171n() {
        Future<?> future = this.f1118r;
        return future != null && future.isCancelled();
    }

    /* renamed from: o */
    public boolean mo1172o() {
        return this.f1114n.mo4502b();
    }

    public void run() {
        C0561_G _g;
        C0561_G _g2;
        String str = "Picasso-Idle";
        try {
            m1113a(this.f1111k);
            if (this.f1106f.f3256p) {
                C0039CH.m98a("Hunter", "executing", C0039CH.m91a(this));
            }
            this.f1117q = mo1170m();
            if (this.f1117q == null) {
                this.f1107g.mo1722c(this);
            } else {
                this.f1107g.mo1717b(this);
            }
        } catch (C0595b e) {
            if (!e.f1803a || e.f1804b != 504) {
                this.f1120t = e;
            }
            _g = this.f1107g;
        } catch (C0830a e2) {
            this.f1120t = e2;
            _g2 = this.f1107g;
            _g2.mo1724d(this);
            Thread.currentThread().setName(str);
        } catch (IOException e3) {
            this.f1120t = e3;
            _g2 = this.f1107g;
            _g2.mo1724d(this);
            Thread.currentThread().setName(str);
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            this.f1109i.mo5267a().mo5402a(new PrintWriter(stringWriter));
            this.f1120t = new RuntimeException(stringWriter.toString(), e4);
            _g = this.f1107g;
        } catch (Exception e5) {
            this.f1120t = e5;
            _g = this.f1107g;
        } catch (Throwable th) {
            Thread.currentThread().setName(str);
            throw th;
        }
        Thread.currentThread().setName(str);
        _g.mo1722c(this);
        Thread.currentThread().setName(str);
    }
}
