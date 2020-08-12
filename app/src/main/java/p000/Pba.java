package p000;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Pba */
public class Pba implements Dba {

    /* renamed from: a */
    public static final nda f985a = mda.m3128a(Pba.class);

    /* renamed from: b */
    public Xba f986b = new Xba(this.f989e);

    /* renamed from: c */
    public List f987c = new ArrayList();

    /* renamed from: d */
    public Gba f988d = null;

    /* renamed from: e */
    public Bba f989e = Cba.f108a;

    /* renamed from: a */
    public Gba mo1065a() {
        if (this.f988d == null) {
            this.f988d = new Gba(this.f986b.mo1506b(), this, null);
        }
        return this.f988d;
    }

    /* renamed from: a */
    public Hba mo1066a(InputStream inputStream, String str) {
        return mo1065a().mo258a(str, inputStream);
    }

    /* renamed from: a */
    public void mo1067a(Nba nba) {
        this.f987c.add(nba);
        this.f986b.mo1505a((Wba) nba.mo945b());
    }

    /* renamed from: a */
    public void mo1068a(Tba tba) {
        this.f986b.mo1505a((Wba) tba);
    }

    /* renamed from: a */
    public void mo1069a(OutputStream outputStream) {
        this.f986b.mo1508d();
        C1241jca jca = new C1241jca(this.f989e, this.f987c, this.f986b.mo1506b());
        C1214aca aca = new C1214aca(this.f989e);
        ArrayList<Eba> arrayList = new ArrayList<>();
        arrayList.addAll(this.f987c);
        arrayList.add(this.f986b);
        arrayList.add(jca);
        arrayList.add(jca.mo4561b());
        for (Eba eba : arrayList) {
            int a = eba.mo224a();
            if (a != 0) {
                eba.mo225a(aca.mo1882b(a));
            }
        }
        int b = aca.mo1881b();
        C1229fca fca = new C1229fca(this.f989e);
        Zba[] a2 = fca.mo4397a(aca.mo224a(), b);
        fca.mo4396a(this.f986b.mo1507c());
        fca.mo4399c(jca.mo4561b().mo1883c());
        fca.mo4398b(jca.mo4562c());
        ArrayList<C1217bca> arrayList2 = new ArrayList<>();
        arrayList2.add(fca);
        arrayList2.addAll(this.f987c);
        arrayList2.add(this.f986b);
        arrayList2.add(jca);
        arrayList2.add(jca.mo4561b());
        arrayList2.add(aca);
        for (Zba add : a2) {
            arrayList2.add(add);
        }
        for (C1217bca a3 : arrayList2) {
            a3.mo944a(outputStream);
        }
    }
}
