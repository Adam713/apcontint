package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bda */
public class bda<T> {

    /* renamed from: a */
    public List<T> f1930a;

    /* renamed from: b */
    public Map<T, Integer> f1931b;

    public bda() {
        this(10);
    }

    public bda(int i) {
        this.f1930a = new ArrayList(i);
        this.f1931b = new HashMap(i);
    }

    /* renamed from: a */
    public int mo1956a() {
        return this.f1930a.size();
    }

    /* renamed from: a */
    public T mo1957a(int i) {
        return this.f1930a.get(i);
    }

    /* renamed from: a */
    public boolean mo1958a(T t) {
        int size = this.f1930a.size();
        this.f1930a.add(t);
        this.f1931b.put(t, Integer.valueOf(size));
        return true;
    }

    /* renamed from: b */
    public int mo1959b(T t) {
        Integer num = (Integer) this.f1931b.get(t);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }
}
