package p000;

import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import com.valdio.valdioveliu.recyclerview.frag.GroupList_edit;

/* renamed from: OT */
class C0311OT implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f889a;

    /* renamed from: b */
    public final /* synthetic */ String f890b;

    /* renamed from: c */
    public final /* synthetic */ AlertDialog f891c;

    /* renamed from: d */
    public final /* synthetic */ GroupList_edit f892d;

    public C0311OT(GroupList_edit groupList_edit, AutoCompleteTextView autoCompleteTextView, String str, AlertDialog alertDialog) {
        this.f892d = groupList_edit;
        this.f889a = autoCompleteTextView;
        this.f890b = str;
        this.f891c = alertDialog;
    }

    public void onClick(View view) {
        if (C0008AO.m5a(this.f889a)) {
            C0195JU ju = this.f892d.f2755b;
            StringBuilder sb = new StringBuilder();
            sb.append("update groups  set name = '");
            sb.append(this.f889a.getText().toString());
            sb.append("'  where name='");
            sb.append(this.f890b);
            sb.append("'");
            ju.mo562d(sb.toString());
            FragmentStatePagerSupport_Main.f2451d = true;
            this.f892d.mo4212d();
        }
        this.f891c.dismiss();
    }
}
