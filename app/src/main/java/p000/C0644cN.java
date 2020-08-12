package p000;

import android.util.Log;

/* renamed from: cN */
class C0644cN implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C0733dN f1944a;

    public C0644cN(C0733dN dNVar) {
        this.f1944a = dNVar;
    }

    public void run() {
        do {
        } while (System.currentTimeMillis() - this.f1944a.f2856d <= 600);
        StringBuilder sb = new StringBuilder();
        sb.append("(System.currentTimeMillis()-after)>600 ->  ");
        sb.append(System.currentTimeMillis() - this.f1944a.f2856d);
        sb.append(" > ");
        sb.append(this.f1944a.f2853a.getText().toString());
        Log.d("Debug_EditTEXT_watcher", sb.toString());
        this.f1944a.mo4278a();
        this.f1944a.f2858f = null;
    }
}
