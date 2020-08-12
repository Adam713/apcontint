package p000;

/* renamed from: pba reason: case insensitive filesystem */
public final class C1258pba implements C1265rca, C1250mca, C1259pca {

    /* renamed from: a */
    public final C1279wba f3596a;

    /* renamed from: b */
    public final C1167xW f3597b;

    public C1258pba(C1279wba wba) {
        this.f3596a = wba;
        this.f3597b = wba.mo5399k();
    }

    /* renamed from: a */
    public static C1258pba m3325a(C1279wba wba) {
        if (wba == null) {
            return null;
        }
        return new C1258pba(wba);
    }

    /* renamed from: a */
    public String mo5008a(int i) {
        return this.f3597b.mo5440f(i);
    }

    /* renamed from: a */
    public String mo5009a(C1284yaa yaa) {
        return this.f3597b.mo5445k(yaa.getIndex()).mo1365n();
    }

    /* renamed from: a */
    public String mo5010a(C1287zaa zaa) {
        return this.f3597b.mo5434a(zaa.mo5592h(), zaa.mo5591g());
    }

    /* renamed from: b */
    public C0935a mo5011b(int i) {
        return this.f3597b.mo5443i(i);
    }
}
