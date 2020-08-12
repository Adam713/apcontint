package p000;

import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import com.valdio.valdioveliu.recyclerview.frag.CurrList_edit;

/* renamed from: lR */
class C0905lR implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f3290a;

    /* renamed from: b */
    public final /* synthetic */ String f3291b;

    /* renamed from: c */
    public final /* synthetic */ AlertDialog f3292c;

    /* renamed from: d */
    public final /* synthetic */ CurrList_edit f3293d;

    public C0905lR(CurrList_edit currList_edit, AutoCompleteTextView autoCompleteTextView, String str, AlertDialog alertDialog) {
        this.f3293d = currList_edit;
        this.f3290a = autoCompleteTextView;
        this.f3291b = str;
        this.f3292c = alertDialog;
    }

    public void onClick(View view) {
        if (C0008AO.m5a(this.f3290a)) {
            C0195JU ju = this.f3293d.f2689b;
            StringBuilder sb = new StringBuilder();
            sb.append("update currency  set name = '");
            sb.append(this.f3290a.getText().toString());
            sb.append("'  where name='");
            sb.append(this.f3291b);
            sb.append("'");
            ju.mo562d(sb.toString());
            FragmentStatePagerSupport_Main.f2451d = true;
            this.f3293d.mo4145d();
        }
        this.f3292c.dismiss();
    }
}
