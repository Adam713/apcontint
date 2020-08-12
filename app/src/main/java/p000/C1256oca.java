package p000;

/* renamed from: oca reason: case insensitive filesystem */
public class C1256oca {

    /* renamed from: a */
    public static final C1256oca f3565a = new C1256oca(new byte[0], 0);

    /* renamed from: b */
    public final byte[] f3566b;

    /* renamed from: c */
    public final int f3567c;

    public C1256oca(byte[] bArr, int i) {
        this.f3566b = bArr;
        this.f3567c = i;
    }

    /* renamed from: a */
    public static C1256oca m3285a(Haa[] haaArr) {
        if (haaArr == null || haaArr.length < 1) {
            return f3565a;
        }
        byte[] bArr = new byte[Haa.m337a(haaArr)];
        Haa.m338a(haaArr, bArr, 0);
        return new C1256oca(bArr, Haa.m343b(haaArr));
    }

    /* renamed from: a */
    public C1256oca mo4974a() {
        return this;
    }

    /* renamed from: a */
    public void mo4975a(jda jda) {
        jda.writeShort(this.f3567c);
        jda.write(this.f3566b);
    }

    /* renamed from: b */
    public int mo4976b() {
        return this.f3566b.length + 2;
    }

    /* renamed from: b */
    public void mo4977b(jda jda) {
        byte[] bArr = this.f3566b;
        int length = bArr.length;
        int i = this.f3567c;
        jda.write(bArr, i, length - i);
    }

    /* renamed from: c */
    public int mo4978c() {
        return this.f3567c;
    }

    /* renamed from: c */
    public void mo4979c(jda jda) {
        jda.write(this.f3566b, 0, this.f3567c);
    }

    /* renamed from: d */
    public C1285yba mo4980d() {
        byte[] bArr = this.f3566b;
        if (bArr.length != 5) {
            return null;
        }
        byte b = bArr[0];
        if (b == 1 || b == 2) {
            return new C1285yba(dda.m2605f(bArr, 1), dda.m2605f(bArr, 3));
        }
        return null;
    }

    /* renamed from: e */
    public Haa[] mo4981e() {
        return Haa.m341a(this.f3567c, (hda) new eda(this.f3566b));
    }
}
