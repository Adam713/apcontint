package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: TL */
class C0409TL implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0431UL f1182a;

    public C0409TL(C0431UL ul) {
        this.f1182a = ul;
    }

    public void onClick(View view) {
        String absolutePath = this.f1182a.f1227i.getAbsolutePath();
        String obj = this.f1182a.f1224f.getText().toString();
        if (this.f1182a.f1220b.mo1271d(absolutePath, obj)) {
            this.f1182a.dismiss();
            this.f1182a.f1220b.mo1270c(absolutePath, obj);
        }
    }
}
