package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

/* renamed from: nS */
class C0947nS implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C1204zS f3428a;

    public C0947nS(C1204zS zSVar) {
        this.f3428a = zSVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f3428a.f4208a.mo801e();
        } catch (Exception unused) {
            Toast.makeText(this.f3428a.f4208a.getActivity(), "SQL Error.", 1);
        }
    }
}
