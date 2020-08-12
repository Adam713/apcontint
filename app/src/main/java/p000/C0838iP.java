package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

/* renamed from: iP */
class C0838iP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C1134wP f3099a;

    public C0838iP(C1134wP wPVar) {
        this.f3099a = wPVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f3099a.f3989p.mo542b(this.f3099a.f3961b, this.f3099a.getString(2131755066));
        } catch (Exception unused) {
            Toast.makeText(this.f3099a.getActivity(), "SQL Error.", 1);
        }
    }
}
