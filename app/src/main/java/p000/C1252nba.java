package p000;

import java.util.Vector;

/* renamed from: nba reason: case insensitive filesystem */
public final class C1252nba implements C1280wca {

    /* renamed from: a */
    public static final String[] f3482a = C1271tca.m3502a();

    /* renamed from: b */
    public final Vector<String> f3483b = new Vector<>();

    /* renamed from: c */
    public final C1167xW f3484c;

    /* renamed from: d */
    public boolean f3485d = false;

    public C1252nba(C1167xW xWVar) {
        this.f3484c = xWVar;
        for (C1168xX xXVar : xWVar.mo5424C()) {
            if (this.f3483b.size() < xXVar.mo5450i() + 1) {
                this.f3483b.setSize(xXVar.mo5450i() + 1);
            }
            this.f3483b.set(xXVar.mo5450i(), xXVar.mo5449h());
        }
    }

    /* renamed from: a */
    public String mo4892a(short s) {
        if (!this.f3485d) {
            String[] strArr = f3482a;
            if (strArr.length > s && strArr[s] != null) {
                return strArr[s];
            }
        }
        return (String) this.f3483b.get(s);
    }
}
