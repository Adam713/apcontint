package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

/* renamed from: SP */
class C0393SP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0736dQ f1156a;

    public C0393SP(C0736dQ dQVar) {
        this.f1156a = dQVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f1156a.f2862a.mo1621w();
        } catch (Exception unused) {
            Toast.makeText(this.f1156a.f2862a.getActivity(), "SQL Error.", 1);
        }
    }
}
