package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;

/* renamed from: aS */
class C0610aS implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ C0925mS f1842a;

    public C0610aS(C0925mS mSVar) {
        this.f1842a = mSVar;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onQueryTextChange(String r3) {
        /*
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0011 }
            if (r0 == 0) goto L_0x000c
            mS r0 = r2.f1842a     // Catch:{ Exception -> 0x000c }
            r1 = 1
            r0.mo4736b(r1)     // Catch:{ Exception -> 0x000c }
        L_0x000c:
            mS r0 = r2.f1842a     // Catch:{ Exception -> 0x0011 }
            r0.mo4739b(r3)     // Catch:{ Exception -> 0x0011 }
        L_0x0011:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0610aS.onQueryTextChange(java.lang.String):boolean");
    }

    public boolean onQueryTextSubmit(String str) {
        try {
            this.f1842a.mo4736b(2);
        } catch (Exception unused) {
        }
        return false;
    }
}
