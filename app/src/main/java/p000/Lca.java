package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Lca */
public class Lca {

    /* renamed from: a */
    public final List f702a = new ArrayList();

    /* renamed from: b */
    public static int m828b(int i) {
        return Jca.m647a(i) + 2;
    }

    /* renamed from: a */
    public Jca mo870a(int i) {
        return (Jca) this.f702a.get(i);
    }

    /* renamed from: a */
    public Lca mo871a() {
        Lca lca = new Lca();
        int size = this.f702a.size();
        for (int i = 0; i < size; i++) {
            lca.mo872a(((Jca) this.f702a.get(i)).mo648f());
        }
        return lca;
    }

    /* renamed from: a */
    public void mo872a(Jca jca) {
        this.f702a.add(jca);
    }

    /* renamed from: a */
    public void mo873a(jda jda) {
        int size = this.f702a.size();
        jda.writeShort(size);
        for (int i = 0; i < size; i++) {
            ((Jca) this.f702a.get(i)).mo647a(jda);
        }
    }

    /* renamed from: b */
    public int mo874b() {
        return this.f702a.size();
    }

    /* renamed from: c */
    public int mo875c() {
        return m828b(this.f702a.size());
    }
}
