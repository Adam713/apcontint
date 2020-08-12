package p000;

/* renamed from: PZ */
public final class C0339PZ {

    /* renamed from: a */
    public C0361QZ f980a;

    /* renamed from: b */
    public int f981b;

    /* renamed from: c */
    public int f982c;

    /* renamed from: d */
    public int f983d;

    /* renamed from: e */
    public final C0317OZ f984e;

    public C0339PZ(int i, C0317OZ oz) {
        if (i >= 1024) {
            StringBuilder sb = new StringBuilder();
            sb.append("initialOffset (");
            sb.append(i);
            sb.append(")>");
            sb.append(1024);
            sb.append(" not supported yet");
            throw new RuntimeException(sb.toString());
        }
        this.f984e = oz;
        this.f981b = 0;
        mo1062b();
        throw null;
    }

    /* renamed from: a */
    public final int mo1057a() {
        if (this.f981b >= this.f982c) {
            mo1062b();
            throw null;
        }
        this.f980a.mo1126a();
        throw null;
    }

    /* renamed from: a */
    public int mo1058a(int i) {
        mo1057a();
        throw null;
    }

    /* renamed from: a */
    public long mo1059a(long j) {
        mo1057a();
        throw null;
    }

    /* renamed from: a */
    public void mo1060a(byte[] bArr, int i, int i2) {
        int i3 = this.f982c - this.f981b;
        if (i2 <= i3) {
            this.f980a.mo1127a(bArr, i, i2);
            throw null;
        } else if (i2 > i3) {
            if (i3 > 0) {
                this.f980a.mo1127a(bArr, i, i3);
                throw null;
            } else {
                mo1062b();
                throw null;
            }
        } else if (i2 > 1024) {
            this.f980a.mo1127a(bArr, i, 1024);
            throw null;
        } else {
            this.f980a.mo1127a(bArr, i, i2);
            throw null;
        }
    }

    /* renamed from: b */
    public int mo1061b(int i) {
        mo1057a();
        throw null;
    }

    /* renamed from: b */
    public final void mo1062b() {
        this.f983d = this.f981b / 1024;
        this.f984e.mo1002a(this.f983d);
        throw null;
    }

    /* renamed from: c */
    public int mo1063c(int i) {
        mo1057a();
        throw null;
    }

    /* renamed from: c */
    public void mo1064c() {
        mo1057a();
        throw null;
    }
}
