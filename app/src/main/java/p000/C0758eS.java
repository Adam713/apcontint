package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

/* renamed from: eS */
class C0758eS implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0800gS f2918a;

    public C0758eS(C0800gS gSVar) {
        this.f2918a = gSVar;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f2918a.f3022a.mo4735b();
        } catch (Exception unused) {
            Toast.makeText(this.f2918a.f3022a.getActivity(), "SQL Error.", 1);
        }
    }
}
