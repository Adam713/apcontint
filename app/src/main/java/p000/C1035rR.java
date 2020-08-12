package p000;

import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import com.valdio.valdioveliu.recyclerview.frag.CurrList_edit;

/* renamed from: rR */
class C1035rR implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f3689a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f3690b;

    /* renamed from: c */
    public final /* synthetic */ CurrList_edit f3691c;

    public C1035rR(CurrList_edit currList_edit, AutoCompleteTextView autoCompleteTextView, AlertDialog alertDialog) {
        this.f3691c = currList_edit;
        this.f3689a = autoCompleteTextView;
        this.f3690b = alertDialog;
    }

    public void onClick(View view) {
        if (C0008AO.m5a(this.f3689a)) {
            C0195JU ju = this.f3691c.f2689b;
            StringBuilder sb = new StringBuilder();
            sb.append("insert into currency  (name )  values( '");
            sb.append(this.f3689a.getText().toString());
            sb.append("'  )");
            ju.mo562d(sb.toString());
            FragmentStatePagerSupport_Main.f2451d = true;
            this.f3691c.mo4145d();
            this.f3690b.dismiss();
        }
    }
}
