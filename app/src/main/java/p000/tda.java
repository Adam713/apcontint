package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: tda */
class tda implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Object f3814a;

    /* renamed from: b */
    public final /* synthetic */ String[] f3815b;

    /* renamed from: c */
    public final /* synthetic */ int f3816c;

    public tda(Object obj, String[] strArr, int i) {
        this.f3814a = obj;
        this.f3815b = strArr;
        this.f3816c = i;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        uda.m3556b(this.f3814a, this.f3815b, this.f3816c);
    }
}
