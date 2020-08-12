package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: AW */
public abstract class C0016AW extends C0933mY {

    /* renamed from: a */
    public static boolean f24a;

    /* renamed from: b */
    public List<C0377RV> f25b = new ArrayList();

    /* renamed from: c */
    public C1288zba f26c = new C1288zba();

    static {
        try {
            f24a = System.getProperty("poi.deserialize.escher") != null;
        } catch (SecurityException unused) {
            f24a = false;
        }
    }

    public Object clone() {
        return mo4774d();
    }

    /* renamed from: g */
    public void mo25g() {
        this.f25b.clear();
    }

    /* renamed from: h */
    public List<C0377RV> mo26h() {
        return this.f25b;
    }

    /* renamed from: i */
    public byte[] mo27i() {
        return this.f26c.mo5593a();
    }

    /* renamed from: j */
    public abstract String mo28j();

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String property = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(mo28j());
        sb.append(']');
        sb.append(property);
        stringBuffer.append(sb.toString());
        if (this.f25b.size() == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No Escher Records Decoded");
            sb2.append(property);
            stringBuffer.append(sb2.toString());
        }
        for (C0377RV obj : this.f25b) {
            stringBuffer.append(obj.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[/");
        sb3.append(mo28j());
        sb3.append(']');
        sb3.append(property);
        stringBuffer.append(sb3.toString());
        return stringBuffer.toString();
    }
}
