package p000;

import android.support.v7.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import com.valdio.valdioveliu.recyclerview.frag.GroupList_edit;

/* renamed from: UT */
class C0443UT implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f1262a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f1263b;

    /* renamed from: c */
    public final /* synthetic */ GroupList_edit f1264c;

    public C0443UT(GroupList_edit groupList_edit, AutoCompleteTextView autoCompleteTextView, AlertDialog alertDialog) {
        this.f1264c = groupList_edit;
        this.f1262a = autoCompleteTextView;
        this.f1263b = alertDialog;
    }

    public void onClick(View view) {
        if (C0008AO.m5a(this.f1262a)) {
            C0195JU ju = this.f1264c.f2755b;
            StringBuilder sb = new StringBuilder();
            sb.append("insert into groups  (name )  values( '");
            sb.append(this.f1262a.getText().toString());
            sb.append("'  )");
            ju.mo562d(sb.toString());
            FragmentStatePagerSupport_Main.f2451d = true;
            this.f1264c.mo4212d();
            this.f1263b.dismiss();
        }
    }
}
