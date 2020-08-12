package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;

/* renamed from: VP */
class C0460VP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f1315a;

    public C0460VP(C0523YQ yq) {
        this.f1315a = yq;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (!this.f1315a.f1606v.mo528b(this.f1315a.f1571h).equals("0")) {
                this.f1315a.f1580k = this.f1315a.f1606v.mo548c(this.f1315a.f1571h);
                this.f1315a.f1594p = this.f1315a.f1556c;
                this.f1315a.f1592o = this.f1315a.f1606v.mo565e(this.f1315a.f1571h);
                if (this.f1315a.f1592o.equals(this.f1315a.f1556c)) {
                    this.f1315a.f1594p = this.f1315a.f1606v.mo497a(this.f1315a.f1571h);
                }
                this.f1315a.mo1558b(false);
                return;
            }
            this.f1315a.mo1548a(false);
        } catch (Exception e) {
            Log.d("View_item_error=", e.getMessage());
        }
    }
}
