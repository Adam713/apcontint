package p000;

/* renamed from: wY */
public final class C1149wY extends C0201JZ {

    /* renamed from: a */
    public static final C0139GZ f4045a = new C0139GZ("");

    /* renamed from: b */
    public int f4046b = 0;

    /* renamed from: c */
    public int f4047c = 0;

    /* renamed from: d */
    public bda<C0139GZ> f4048d = new bda<>();

    /* renamed from: e */
    public C1122vY f4049e = new C1122vY(this.f4048d);

    /* renamed from: f */
    public int[] f4050f;

    /* renamed from: g */
    public int[] f4051g;

    /* renamed from: a */
    public int mo5382a(C0139GZ gz) {
        this.f4046b++;
        if (gz == null) {
            gz = f4045a;
        }
        int b = this.f4048d.mo1959b(gz);
        if (b != -1) {
            return b;
        }
        int a = this.f4048d.mo1956a();
        this.f4047c++;
        C1122vY.m3586a(this.f4048d, gz);
        return a;
    }

    /* renamed from: a */
    public C0931mX mo5383a(int i) {
        int[] iArr = this.f4050f;
        if (iArr == null || iArr == null) {
            throw new IllegalStateException("SST record has not yet been serialized.");
        }
        C0931mX mXVar = new C0931mX();
        mXVar.mo4770b(8);
        int[] iArr2 = (int[]) this.f4050f.clone();
        int[] iArr3 = (int[]) this.f4051g.clone();
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            iArr2[i2] = iArr2[i2] + i;
        }
        mXVar.mo4769a(iArr2, iArr3);
        return mXVar;
    }

    /* renamed from: a */
    public void mo218a(C0253LZ lz) {
        C1169xY xYVar = new C1169xY(this.f4048d, mo5386h(), mo5387i());
        xYVar.mo5452a(lz);
        this.f4050f = xYVar.mo5453a();
        this.f4051g = xYVar.mo5454b();
    }

    /* renamed from: b */
    public C0139GZ mo5384b(int i) {
        return (C0139GZ) this.f4048d.mo1957a(i);
    }

    /* renamed from: e */
    public short mo34e() {
        return 252;
    }

    /* renamed from: g */
    public int mo5385g() {
        return C0931mX.m3088b(this.f4048d.mo1956a());
    }

    /* renamed from: h */
    public int mo5386h() {
        return this.f4046b;
    }

    /* renamed from: i */
    public int mo5387i() {
        return this.f4047c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[SST]\n");
        stringBuffer.append("    .numstrings     = ");
        stringBuffer.append(Integer.toHexString(mo5386h()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .uniquestrings  = ");
        stringBuffer.append(Integer.toHexString(mo5387i()));
        stringBuffer.append(str);
        for (int i = 0; i < this.f4048d.mo1956a(); i++) {
            C0139GZ gz = (C0139GZ) this.f4048d.mo1957a(i);
            StringBuilder sb = new StringBuilder();
            sb.append("    .string_");
            sb.append(i);
            sb.append("      = ");
            stringBuffer.append(sb.toString());
            stringBuffer.append(gz.mo292b());
            stringBuffer.append(str);
        }
        stringBuffer.append("[/SST]\n");
        return stringBuffer.toString();
    }
}
