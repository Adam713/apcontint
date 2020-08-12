package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

/* renamed from: sS */
class C1056sS implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0239LS f3740a;

    public C1056sS(C0239LS ls) {
        this.f3740a = ls;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            if (this.f3740a.f653g != 0) {
                C0195JU ju = this.f3740a.f648b;
                StringBuilder sb = new StringBuilder();
                sb.append("delete from transactions  where id='");
                sb.append(this.f3740a.f653g);
                sb.append("'");
                ju.mo562d(sb.toString());
                this.f3740a.mo807h();
            }
        } catch (Exception unused) {
            Toast.makeText(this.f3740a.getActivity(), this.f3740a.getString(2131755389), 1);
        }
    }
}
