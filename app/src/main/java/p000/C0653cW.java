package p000;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* renamed from: cW */
public class C0653cW extends C0865jW {

    /* renamed from: g */
    public boolean f1957g;

    /* renamed from: h */
    public List<C0785fW> f1958h;

    /* renamed from: i */
    public byte[] f1959i;

    public C0653cW() {
        this.f1957g = true;
        this.f1957g = true;
        this.f3170b = null;
        this.f3171c = -1;
        this.f1958h = new LinkedList();
    }

    public C0653cW(C0865jW jWVar) {
        this.f1957g = true;
        mo1981a(jWVar.mo4550c());
        C0785fW[] e = jWVar.mo1986e();
        C0585_V[] _vArr = new C0585_V[e.length];
        for (int i = 0; i < e.length; i++) {
            _vArr[i] = new C0585_V(e[i]);
        }
        mo1984a((C0785fW[]) _vArr);
        mo1983a(jWVar.mo4549b());
    }

    /* renamed from: a */
    public static int m1882a(OutputStream outputStream, Map<Long, String> map, int i) {
        int b = C0930mW.m3086b(outputStream, (long) map.size());
        for (Long l : map.keySet()) {
            String str = (String) map.get(l);
            if (i == 1200) {
                int length = str.length() + 1;
                if (length % 2 == 1) {
                    length++;
                }
                b = b + C0930mW.m3086b(outputStream, l.longValue()) + C0930mW.m3086b(outputStream, (long) length);
                byte[] bytes = str.getBytes(C1040rW.m3392a(i));
                for (int i2 = 2; i2 < bytes.length; i2 += 2) {
                    outputStream.write(bytes[i2 + 1]);
                    outputStream.write(bytes[i2]);
                    b += 2;
                }
                for (int length2 = length - str.length(); length2 > 0; length2--) {
                    outputStream.write(0);
                    outputStream.write(0);
                    b += 2;
                }
            } else {
                int b2 = b + C0930mW.m3086b(outputStream, l.longValue()) + C0930mW.m3086b(outputStream, (long) (str.length() + 1));
                byte[] bytes2 = str.getBytes(C1040rW.m3392a(i));
                int i3 = b2;
                for (byte write : bytes2) {
                    outputStream.write(write);
                    i3++;
                }
                outputStream.write(0);
                b = i3 + 1;
            }
        }
        return b;
    }

    /* renamed from: a */
    public int mo1978a(OutputStream outputStream) {
        int i;
        int a;
        if (!this.f1957g) {
            byte[] bArr = this.f1959i;
            if (bArr != null) {
                outputStream.write(bArr);
                return this.f1959i.length;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        int f = (mo1987f() * 2 * 4) + 8 + 0;
        if (mo1979a(0) != null) {
            Object a2 = mo1979a(1);
            if (a2 == null) {
                mo1980a(1, 2, (Object) Integer.valueOf(1200));
            } else if (!(a2 instanceof Integer)) {
                throw new C0534YV("The codepage property (ID = 1) must be an Integer object.");
            }
            i = mo4547a();
        } else {
            i = -1;
        }
        Collections.sort(this.f1958h, new C0634bW(this));
        ListIterator listIterator = this.f1958h.listIterator();
        while (listIterator.hasNext()) {
            C0585_V _v = (C0585_V) listIterator.next();
            long a3 = _v.mo4365a();
            C0930mW.m3086b(byteArrayOutputStream2, _v.mo4365a());
            C0930mW.m3086b(byteArrayOutputStream2, (long) f);
            if (a3 != 0) {
                a = _v.mo1797a(byteArrayOutputStream, mo4547a());
            } else if (i != -1) {
                a = m1882a((OutputStream) byteArrayOutputStream, this.f3169a, i);
            } else {
                throw new C0534YV("Codepage (property 1) is undefined.");
            }
            f += a;
        }
        byteArrayOutputStream.close();
        byteArrayOutputStream2.close();
        byte[] byteArray = byteArrayOutputStream2.toByteArray();
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        C0930mW.m3082a(outputStream, byteArray.length + 8 + byteArray2.length);
        C0930mW.m3082a(outputStream, mo1987f());
        outputStream.write(byteArray);
        outputStream.write(byteArray2);
        return byteArray.length + 8 + byteArray2.length;
    }

    /* renamed from: a */
    public Object mo1979a(long j) {
        mo1986e();
        return super.mo1979a(j);
    }

    /* renamed from: a */
    public void mo1980a(int i, long j, Object obj) {
        C0585_V _v = new C0585_V();
        _v.mo1798a((long) i);
        _v.mo1800b(j);
        _v.mo1799a(obj);
        mo1982a((C0785fW) _v);
        this.f1957g = true;
    }

    /* renamed from: a */
    public void mo1981a(C0446UV uv) {
        this.f3170b = uv;
    }

    /* renamed from: a */
    public void mo1982a(C0785fW fWVar) {
        mo1985b(fWVar.mo4365a());
        this.f1958h.add(fWVar);
        this.f1957g = true;
    }

    /* renamed from: a */
    public void mo1983a(Map<Long, String> map) {
        if (map != null) {
            this.f3169a = map;
            mo1980a(0, -1, (Object) map);
            if (((Integer) mo1979a(1)) == null) {
                mo1980a(1, 2, (Object) Integer.valueOf(1200));
                return;
            }
            return;
        }
        mo1985b(0);
    }

    /* renamed from: a */
    public void mo1984a(C0785fW[] fWVarArr) {
        this.f3173e = fWVarArr;
        this.f1958h = new LinkedList();
        for (C0785fW add : fWVarArr) {
            this.f1958h.add(add);
        }
        this.f1957g = true;
    }

    /* renamed from: b */
    public void mo1985b(long j) {
        Iterator it = this.f1958h.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C0785fW) it.next()).mo4365a() == j) {
                    it.remove();
                    break;
                }
            } else {
                break;
            }
        }
        this.f1957g = true;
    }

    /* renamed from: e */
    public C0785fW[] mo1986e() {
        this.f3173e = (C0785fW[]) this.f1958h.toArray(new C0785fW[0]);
        return this.f3173e;
    }

    /* renamed from: f */
    public int mo1987f() {
        return this.f1958h.size();
    }

    /* renamed from: g */
    public int mo1988g() {
        if (this.f1957g) {
            try {
                this.f3172d = mo1989h();
                this.f1957g = false;
            } catch (C0508XV e) {
                throw e;
            } catch (Exception e2) {
                throw new C0508XV((Throwable) e2);
            }
        }
        return this.f3172d;
    }

    /* renamed from: h */
    public final int mo1989h() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo1978a((OutputStream) byteArrayOutputStream);
        byteArrayOutputStream.close();
        this.f1959i = C0999pW.m3306a(byteArrayOutputStream.toByteArray());
        return this.f1959i.length;
    }
}
