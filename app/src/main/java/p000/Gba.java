package p000;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: Gba */
public class Gba extends Mba implements Fba, Dba, Iterable<Lba> {

    /* renamed from: c */
    public Map<String, Lba> f306c;

    /* renamed from: d */
    public ArrayList<Lba> f307d;

    /* renamed from: e */
    public Pba f308e;

    /* renamed from: f */
    public Oba f309f;

    public Gba(Tba tba, Pba pba, Gba gba) {
        super(tba, gba);
        if (gba == null) {
            this.f309f = new Oba();
        } else {
            this.f309f = new Oba(gba.f309f, new String[]{tba.mo1428b()});
        }
        this.f308e = pba;
        this.f306c = new HashMap();
        this.f307d = new ArrayList<>();
        Iterator h = tba.mo1242h();
        while (h.hasNext()) {
            Wba wba = (Wba) h.next();
            Lba gba2 = wba.mo1240e() ? new Gba((Tba) wba, this.f308e, this) : new Jba((Uba) wba, this);
            this.f307d.add(gba2);
            this.f306c.put(gba2.getName(), gba2);
        }
    }

    /* renamed from: a */
    public Fba mo257a(String str) {
        Tba tba = new Tba(str);
        Gba gba = new Gba(tba, this.f308e, this);
        ((Tba) mo909e()).mo1239a(tba);
        this.f308e.mo1068a(tba);
        this.f307d.add(gba);
        this.f306c.put(str, gba);
        return gba;
    }

    /* renamed from: a */
    public Hba mo313a(Nba nba) {
        Uba b = nba.mo945b();
        Jba jba = new Jba(b, this);
        ((Tba) mo909e()).mo1239a(b);
        this.f308e.mo1067a(nba);
        this.f307d.add(jba);
        this.f306c.put(b.mo1428b(), jba);
        return jba;
    }

    /* renamed from: a */
    public Hba mo258a(String str, InputStream inputStream) {
        return mo313a(new Nba(str, inputStream));
    }

    /* renamed from: a */
    public Iterator<Lba> mo259a() {
        return this.f307d.iterator();
    }

    /* renamed from: a */
    public void mo314a(C0446UV uv) {
        mo909e().mo1425a(uv);
    }

    /* renamed from: b */
    public Iba mo315b(String str) {
        Lba c = mo317c(str);
        if (c.mo645c()) {
            return new Iba((Hba) c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Entry '");
        sb.append(str);
        sb.append("' is not a DocumentEntry");
        throw new IOException(sb.toString());
    }

    /* renamed from: b */
    public boolean mo316b() {
        return true;
    }

    /* renamed from: c */
    public Lba mo317c(String str) {
        Lba lba = str != null ? (Lba) this.f306c.get(str) : null;
        if (lba != null) {
            return lba;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("no such entry: \"");
        sb.append(str);
        sb.append("\"");
        throw new FileNotFoundException(sb.toString());
    }

    /* renamed from: f */
    public C0446UV mo318f() {
        return mo909e().mo1434d();
    }

    public Iterator<Lba> iterator() {
        return mo259a();
    }
}
