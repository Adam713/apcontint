package p000;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: aW */
public class C0614aW extends C0804gW {

    /* renamed from: h */
    public final int f1850h;

    public C0614aW() {
        this.f1850h = C0804gW.f3026a.length + C0804gW.f3027b.length + 4 + 16 + 4;
        this.f3028c = dda.m2595a(C0804gW.f3026a);
        this.f3029d = dda.m2595a(C0804gW.f3027b);
        this.f3030e = 133636;
        this.f3031f = new C0446UV();
        this.f3032g = new LinkedList();
        this.f3032g.add(new C0653cW());
    }

    public C0614aW(C0804gW gWVar) {
        this.f1850h = C0804gW.f3026a.length + C0804gW.f3027b.length + 4 + 16 + 4;
        this.f3028c = gWVar.mo4422a();
        this.f3029d = gWVar.mo4425c();
        this.f3030e = gWVar.mo4426d();
        mo1864a(gWVar.mo4424b());
        mo1867i();
        if (this.f3032g == null) {
            this.f3032g = new LinkedList();
        }
        for (C0865jW cWVar : gWVar.mo4429f()) {
            mo1865a((C0865jW) new C0653cW(cWVar));
        }
    }

    /* renamed from: a */
    public void mo1864a(C0446UV uv) {
        this.f3031f = uv;
    }

    /* renamed from: a */
    public void mo1865a(C0865jW jWVar) {
        if (this.f3032g == null) {
            this.f3032g = new LinkedList();
        }
        this.f3032g.add(jWVar);
    }

    /* renamed from: a */
    public void mo1866a(OutputStream outputStream) {
        int size = this.f3032g.size();
        C0930mW.m3085a(outputStream, (short) mo4422a());
        C0930mW.m3085a(outputStream, (short) mo4425c());
        C0930mW.m3082a(outputStream, mo4426d());
        C0930mW.m3084a(outputStream, mo4424b());
        C0930mW.m3082a(outputStream, size);
        int i = this.f1850h + (size * 20);
        ListIterator listIterator = this.f3032g.listIterator();
        while (listIterator.hasNext()) {
            C0653cW cWVar = (C0653cW) listIterator.next();
            if (cWVar.mo4550c() != null) {
                C0930mW.m3084a(outputStream, cWVar.mo4550c());
                C0930mW.m3086b(outputStream, (long) i);
                try {
                    i += cWVar.mo1988g();
                } catch (C0508XV e) {
                    Throwable a = e.mo1466a();
                    if (a instanceof UnsupportedEncodingException) {
                        throw new C0534YV(a);
                    }
                    throw e;
                }
            } else {
                throw new C0742dW();
            }
        }
        ListIterator listIterator2 = this.f3032g.listIterator();
        while (listIterator2.hasNext()) {
            ((C0653cW) listIterator2.next()).mo1978a(outputStream);
        }
    }

    /* renamed from: i */
    public void mo1867i() {
        this.f3032g = null;
    }
}
