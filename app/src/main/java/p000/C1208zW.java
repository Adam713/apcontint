package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: zW */
public final class C1208zW implements Iterable<C0933mY> {

    /* renamed from: a */
    public List<C0933mY> f4213a = new ArrayList();

    /* renamed from: b */
    public int f4214b = 0;

    /* renamed from: c */
    public int f4215c = 0;

    /* renamed from: d */
    public int f4216d = 0;

    /* renamed from: e */
    public int f4217e = 0;

    /* renamed from: f */
    public int f4218f = 0;

    /* renamed from: g */
    public int f4219g = 0;

    /* renamed from: h */
    public int f4220h = 0;

    /* renamed from: i */
    public int f4221i = 0;

    /* renamed from: j */
    public int f4222j = 0;

    /* renamed from: k */
    public int f4223k = -1;

    /* renamed from: a */
    public void mo5558a(int i, C0933mY mYVar) {
        this.f4213a.add(i, mYVar);
        if (mo5572h() >= i) {
            mo5575i(this.f4214b + 1);
        }
        if (mo5561c() >= i) {
            mo5564d(this.f4215c + 1);
        }
        if (mo5577j() >= i) {
            mo5580k(this.f4216d + 1);
        }
        if (mo5565e() >= i) {
            mo5568f(this.f4217e + 1);
        }
        if (mo5579k() >= i) {
            mo5581l(this.f4218f + 1);
        }
        if (mo5560b() >= i) {
            mo5562c(this.f4219g + 1);
        }
        if (mo5567f() >= i) {
            mo5570g(this.f4220h + 1);
        }
        if (mo5574i() >= i) {
            mo5578j(this.f4221i + 1);
        }
        if (mo5569g() != -1 && mo5569g() >= i) {
            mo5573h(this.f4223k + 1);
        }
        if (mo5563d() >= i) {
            mo5566e(mo5563d() + 1);
        }
    }

    /* renamed from: a */
    public void mo5559a(List<C0933mY> list) {
        this.f4213a = list;
    }

    /* renamed from: b */
    public int mo5560b() {
        return this.f4219g;
    }

    /* renamed from: c */
    public int mo5561c() {
        return this.f4215c;
    }

    /* renamed from: c */
    public void mo5562c(int i) {
        this.f4219g = i;
    }

    /* renamed from: d */
    public int mo5563d() {
        return this.f4222j;
    }

    /* renamed from: d */
    public void mo5564d(int i) {
        this.f4215c = i;
    }

    /* renamed from: e */
    public int mo5565e() {
        return this.f4217e;
    }

    /* renamed from: e */
    public void mo5566e(int i) {
        this.f4222j = i;
    }

    /* renamed from: f */
    public int mo5567f() {
        return this.f4220h;
    }

    /* renamed from: f */
    public void mo5568f(int i) {
        this.f4217e = i;
    }

    /* renamed from: g */
    public int mo5569g() {
        return this.f4223k;
    }

    /* renamed from: g */
    public void mo5570g(int i) {
        this.f4220h = i;
    }

    public C0933mY get(int i) {
        return (C0933mY) this.f4213a.get(i);
    }

    /* renamed from: h */
    public int mo5572h() {
        return this.f4214b;
    }

    /* renamed from: h */
    public void mo5573h(int i) {
        this.f4223k = i;
    }

    /* renamed from: i */
    public int mo5574i() {
        return this.f4221i;
    }

    /* renamed from: i */
    public void mo5575i(int i) {
        this.f4214b = i;
    }

    public Iterator<C0933mY> iterator() {
        return this.f4213a.iterator();
    }

    /* renamed from: j */
    public int mo5577j() {
        return this.f4216d;
    }

    /* renamed from: j */
    public void mo5578j(int i) {
        this.f4221i = i;
    }

    /* renamed from: k */
    public int mo5579k() {
        return this.f4218f;
    }

    /* renamed from: k */
    public void mo5580k(int i) {
        this.f4216d = i;
    }

    /* renamed from: l */
    public void mo5581l(int i) {
        this.f4218f = i;
    }

    public int size() {
        return this.f4213a.size();
    }
}
