package p000;

import java.util.Comparator;

/* renamed from: bW */
class C0634bW implements Comparator<C0785fW> {

    /* renamed from: a */
    public final /* synthetic */ C0653cW f1910a;

    public C0634bW(C0653cW cWVar) {
        this.f1910a = cWVar;
    }

    /* renamed from: a */
    public int compare(C0785fW fWVar, C0785fW fWVar2) {
        if (fWVar.mo4365a() < fWVar2.mo4365a()) {
            return -1;
        }
        return fWVar.mo4365a() == fWVar2.mo4365a() ? 0 : 1;
    }
}
