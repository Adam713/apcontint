package p000;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: Nba */
public final class Nba implements Eba, C1217bca, Dba {

    /* renamed from: a */
    public static final C1223dca[] f824a = new C1223dca[0];

    /* renamed from: b */
    public static final C1244kca[] f825b = new C1244kca[0];

    /* renamed from: c */
    public Uba f826c;

    /* renamed from: d */
    public int f827d;

    /* renamed from: e */
    public final Bba f828e;

    /* renamed from: f */
    public C0295b f829f;

    /* renamed from: g */
    public C0294a f830g;

    /* renamed from: Nba$a */
    private static final class C0294a {

        /* renamed from: a */
        public C1223dca[] f831a;

        /* renamed from: b */
        public final Oba f832b = null;

        /* renamed from: c */
        public final String f833c = null;

        /* renamed from: d */
        public final int f834d = -1;

        /* renamed from: e */
        public final Rba f835e = null;

        /* renamed from: f */
        public final Bba f836f;

        public C0294a(Bba bba, C1223dca[] dcaArr) {
            this.f836f = bba;
            this.f831a = (C1223dca[]) dcaArr.clone();
        }

        /* renamed from: a */
        public int mo948a() {
            if (mo951c()) {
                return this.f835e == null ? this.f831a.length : ((this.f834d + this.f836f.mo84b()) - 1) / this.f836f.mo84b();
            }
            return 0;
        }

        /* renamed from: a */
        public void mo949a(OutputStream outputStream) {
            if (!mo951c()) {
                return;
            }
            if (this.f835e != null) {
                Kba kba = new Kba(outputStream, this.f834d);
                this.f835e.mo1154a(new Qba(kba, this.f832b, this.f833c, this.f834d));
                kba.mo745a(mo948a() * this.f836f.mo84b(), C1223dca.m2588a());
                return;
            }
            int i = 0;
            while (true) {
                C1223dca[] dcaArr = this.f831a;
                if (i < dcaArr.length) {
                    dcaArr[i].mo944a(outputStream);
                    i++;
                } else {
                    return;
                }
            }
        }

        /* renamed from: b */
        public C1223dca[] mo950b() {
            if (mo951c() && this.f835e != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.f834d);
                this.f835e.mo1154a(new Qba(new Kba(byteArrayOutputStream, this.f834d), this.f832b, this.f833c, this.f834d));
                this.f831a = C1223dca.m2590a(this.f836f, byteArrayOutputStream.toByteArray(), this.f834d);
            }
            return this.f831a;
        }

        /* renamed from: c */
        public boolean mo951c() {
            return this.f831a.length > 0 || this.f835e != null;
        }
    }

    /* renamed from: Nba$b */
    private static final class C0295b {

        /* renamed from: a */
        public C1244kca[] f837a;

        /* renamed from: b */
        public final Oba f838b = null;

        /* renamed from: c */
        public final String f839c = null;

        /* renamed from: d */
        public final int f840d = -1;

        /* renamed from: e */
        public final Rba f841e = null;

        /* renamed from: f */
        public final Bba f842f;

        public C0295b(Bba bba, C1244kca[] kcaArr) {
            this.f842f = bba;
            this.f837a = (C1244kca[]) kcaArr.clone();
        }

        /* renamed from: a */
        public C1244kca[] mo952a() {
            if (mo953b() && this.f841e != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(this.f840d);
                this.f841e.mo1154a(new Qba(new Kba(byteArrayOutputStream, this.f840d), this.f838b, this.f839c, this.f840d));
                this.f837a = C1244kca.m2928a(this.f842f, byteArrayOutputStream.toByteArray(), this.f840d);
            }
            return this.f837a;
        }

        /* renamed from: b */
        public boolean mo953b() {
            return this.f837a.length > 0 || this.f841e != null;
        }
    }

    public Nba(String str, Bba bba, InputStream inputStream) {
        C1223dca dca;
        ArrayList arrayList = new ArrayList();
        this.f827d = 0;
        this.f828e = bba;
        do {
            dca = new C1223dca(inputStream, bba);
            int c = dca.mo4301c();
            if (c > 0) {
                arrayList.add(dca);
                this.f827d += c;
            }
        } while (!dca.mo4300b());
        C1223dca[] dcaArr = (C1223dca[]) arrayList.toArray(new C1223dca[arrayList.size()]);
        this.f830g = new C0294a(bba, dcaArr);
        this.f826c = new Uba(str, this.f827d);
        this.f826c.mo1331a(this);
        if (this.f826c.mo1332g()) {
            this.f829f = new C0295b(bba, C1244kca.m2929a(bba, (C1217bca[]) dcaArr, this.f827d));
            this.f830g = new C0294a(bba, new C1223dca[0]);
            return;
        }
        this.f829f = new C0295b(bba, f825b);
    }

    public Nba(String str, InputStream inputStream) {
        this(str, Cba.f108a, inputStream);
    }

    /* renamed from: a */
    public int mo224a() {
        return this.f830g.mo948a();
    }

    /* renamed from: a */
    public void mo225a(int i) {
        this.f826c.mo1436e(i);
    }

    /* renamed from: a */
    public void mo944a(OutputStream outputStream) {
        this.f830g.mo949a(outputStream);
    }

    /* renamed from: b */
    public Uba mo945b() {
        return this.f826c;
    }

    /* renamed from: b */
    public C1220cca mo946b(int i) {
        int i2 = this.f827d;
        if (i < i2) {
            return this.f826c.mo1332g() ? C1244kca.m2927a(this.f829f.mo952a(), i) : C1223dca.m2589a(this.f830g.mo950b(), i);
        }
        if (i <= i2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Request for Offset ");
        sb.append(i);
        sb.append(" doc size is ");
        sb.append(this.f827d);
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: c */
    public C1217bca[] mo947c() {
        return this.f829f.mo952a();
    }
}
