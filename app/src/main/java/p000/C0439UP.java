package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ImageView;
import android.widget.Toast;

/* renamed from: UP */
class C0439UP implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ImageView f1256a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f1257b;

    public C0439UP(C0523YQ yq, ImageView imageView) {
        this.f1257b = yq;
        this.f1256a = imageView;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            C0195JU ju = this.f1257b.f1606v;
            StringBuilder sb = new StringBuilder();
            sb.append(C0195JU.f442b);
            sb.append(this.f1256a.getTag().toString());
            ju.mo460H(sb.toString());
        } catch (Exception unused) {
            Toast.makeText(this.f1257b.getActivity(), "SQL Error.", 1);
        }
    }
}
