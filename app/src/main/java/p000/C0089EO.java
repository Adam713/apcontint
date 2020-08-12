package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

/* renamed from: EO */
class C0089EO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0350QO f217a;

    public C0089EO(C0350QO qo) {
        this.f217a = qo;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f217a.f1017a.mo5320j();
        } catch (Exception unused) {
            Toast.makeText(this.f217a.f1017a.getActivity(), "SQL Error.", 1);
        }
    }
}
