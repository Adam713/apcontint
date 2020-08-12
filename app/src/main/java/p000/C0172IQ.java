package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: IQ */
class C0172IQ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CharSequence[] f382a;

    /* renamed from: b */
    public final /* synthetic */ C0523YQ f383b;

    public C0172IQ(C0523YQ yq, CharSequence[] charSequenceArr) {
        this.f383b = yq;
        this.f382a = charSequenceArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            boolean a = C0760eU.m2615a(this.f383b.getActivity());
            if (i == 0) {
                this.f383b.f1582kb = this.f383b.getActivity().getResources().getStringArray(2130903056)[0];
                if (a) {
                    this.f383b.mo1591m();
                }
            } else if (i == 1) {
                this.f383b.f1582kb = this.f383b.getActivity().getResources().getStringArray(2130903056)[1];
                if (a) {
                    this.f383b.mo1523D();
                }
            } else if (this.f382a[i].equals("Cancel")) {
                dialogInterface.dismiss();
            }
        } catch (Exception unused) {
        }
    }
}
