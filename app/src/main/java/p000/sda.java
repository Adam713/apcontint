package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.Arrays;

/* renamed from: sda */
class sda implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C1104a f3767a;

    /* renamed from: b */
    public final /* synthetic */ int f3768b;

    /* renamed from: c */
    public final /* synthetic */ String[] f3769c;

    public sda(C1104a aVar, int i, String[] strArr) {
        this.f3767a = aVar;
        this.f3768b = i;
        this.f3769c = strArr;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f3767a.mo3824a(this.f3768b, Arrays.asList(this.f3769c));
    }
}
