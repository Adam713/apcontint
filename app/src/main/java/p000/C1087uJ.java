package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_All;

/* renamed from: uJ */
class C1087uJ implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_All f3819a;

    public C1087uJ(Customer_Det_List_All customer_Det_List_All) {
        this.f3819a = customer_Det_List_All;
    }

    public boolean onQueryTextChange(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f3819a.mo3533a(1);
        }
        this.f3819a.setSupportProgressBarIndeterminateVisibility(true);
        this.f3819a.mo3537b(str);
        this.f3819a.setSupportProgressBarIndeterminateVisibility(false);
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        this.f3819a.mo3533a(2);
        return false;
    }
}
