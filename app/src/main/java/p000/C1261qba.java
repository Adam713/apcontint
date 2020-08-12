package p000;

/* renamed from: qba reason: case insensitive filesystem */
public final class C1261qba implements Aca {

    /* renamed from: a */
    public C1121vX f3643a;

    /* renamed from: b */
    public short f3644b;

    public C1261qba(short s, C1121vX vXVar) {
        this.f3643a = vXVar;
        this.f3644b = s;
    }

    /* renamed from: a */
    public short mo5041a() {
        return this.f3644b;
    }

    /* renamed from: a */
    public void mo5042a(short s) {
        this.f3643a.mo5236d(s);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1261qba)) {
            return false;
        }
        C1261qba qba = (C1261qba) obj;
        C1121vX vXVar = this.f3643a;
        if (vXVar == null) {
            if (qba.f3643a != null) {
                return false;
            }
        } else if (!vXVar.equals(qba.f3643a)) {
            return false;
        }
        return this.f3644b == qba.f3644b;
    }

    public int hashCode() {
        C1121vX vXVar = this.f3643a;
        return (((vXVar == null ? 0 : vXVar.hashCode()) + 31) * 31) + this.f3644b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("org.apache.poi.hssf.usermodel.HSSFFont{");
        sb.append(this.f3643a);
        sb.append("}");
        return sb.toString();
    }
}
