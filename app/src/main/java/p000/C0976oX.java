package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: oX */
public class C0976oX extends C0080DY {

    /* renamed from: a */
    public List<C0977a> f3549a = new ArrayList();

    /* renamed from: oX$a */
    private static final class C0977a {

        /* renamed from: a */
        public int f3550a;

        /* renamed from: b */
        public int f3551b;

        /* renamed from: c */
        public int f3552c;

        public C0977a(int i, int i2, int i3) {
            this.f3550a = i;
            this.f3551b = i2;
            this.f3552c = i3;
        }

        /* renamed from: a */
        public int mo4967a() {
            return this.f3550a;
        }

        /* renamed from: a */
        public void mo4968a(jda jda) {
            jda.writeShort(this.f3550a);
            jda.writeShort(this.f3551b);
            jda.writeShort(this.f3552c);
        }

        /* renamed from: b */
        public int mo4969b() {
            return this.f3551b;
        }

        /* renamed from: c */
        public int mo4970c() {
            return this.f3552c;
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("extBook=");
            stringBuffer.append(this.f3550a);
            stringBuffer.append(" firstSheet=");
            stringBuffer.append(this.f3551b);
            stringBuffer.append(" lastSheet=");
            stringBuffer.append(this.f3552c);
            return stringBuffer.toString();
        }
    }

    /* renamed from: a */
    public int mo4962a(int i) {
        return mo4966c(i).mo4967a();
    }

    /* renamed from: a */
    public int mo4963a(int i, int i2) {
        int size = this.f3549a.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0977a c = mo4966c(i3);
            if (c.mo4967a() == i && c.mo4969b() == i2 && c.mo4970c() == i2) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public int mo4964a(int i, int i2, int i3) {
        this.f3549a.add(new C0977a(i, i2, i3));
        return this.f3549a.size() - 1;
    }

    /* renamed from: a */
    public void mo30a(jda jda) {
        int size = this.f3549a.size();
        jda.writeShort(size);
        for (int i = 0; i < size; i++) {
            mo4966c(i).mo4968a(jda);
        }
    }

    /* renamed from: b */
    public int mo4965b(int i) {
        return mo4966c(i).mo4969b();
    }

    /* renamed from: c */
    public final C0977a mo4966c(int i) {
        return (C0977a) this.f3549a.get(i);
    }

    /* renamed from: e */
    public short mo34e() {
        return 23;
    }

    /* renamed from: g */
    public int mo36g() {
        return (this.f3549a.size() * 6) + 2;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int size = this.f3549a.size();
        stringBuffer.append("[EXTERNSHEET]\n");
        stringBuffer.append("   numOfRefs     = ");
        stringBuffer.append(size);
        stringBuffer.append("\n");
        for (int i = 0; i < size; i++) {
            stringBuffer.append("refrec         #");
            stringBuffer.append(i);
            stringBuffer.append(": ");
            stringBuffer.append(mo4966c(i).toString());
            stringBuffer.append(10);
        }
        stringBuffer.append("[/EXTERNSHEET]\n");
        return stringBuffer.toString();
    }
}
