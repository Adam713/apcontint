package p000;

/* renamed from: CX */
public abstract class C0060CX extends C0080DY {

    /* renamed from: a */
    public boolean f104a;

    /* renamed from: b */
    public String f105b;

    public C0060CX(String str) {
        mo109a(str);
    }

    /* renamed from: a */
    public final void mo109a(String str) {
        if (str != null) {
            this.f104a = qda.m3375b(str);
            this.f105b = str;
            if (mo36g() > 8224) {
                throw new IllegalArgumentException("Header/Footer string too long (limit is 8224 bytes)");
            }
            return;
        }
        throw new IllegalArgumentException("text must not be null");
    }

    /* renamed from: a */
    public final void mo30a(jda jda) {
        if (mo111i() > 0) {
            jda.writeShort(mo111i());
            jda.writeByte(this.f104a ? 1 : 0);
            if (this.f104a) {
                qda.m3373b(this.f105b, jda);
            } else {
                qda.m3370a(this.f105b, jda);
            }
        }
    }

    /* renamed from: g */
    public final int mo36g() {
        int i = 1;
        if (mo111i() < 1) {
            return 0;
        }
        int i2 = mo111i();
        if (this.f104a) {
            i = 2;
        }
        return (i2 * i) + 3;
    }

    /* renamed from: h */
    public final String mo110h() {
        return this.f105b;
    }

    /* renamed from: i */
    public final int mo111i() {
        return this.f105b.length();
    }
}
