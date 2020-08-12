package p000;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;
import com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp;

/* renamed from: uN */
class C1091uN implements OnGroupClickListener {

    /* renamed from: a */
    public final /* synthetic */ Report2_customer_late_exp f3824a;

    public C1091uN(Report2_customer_late_exp report2_customer_late_exp) {
        this.f3824a = report2_customer_late_exp;
    }

    public boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        C0208KL kl = (C0208KL) this.f3824a.f2573k.get(i);
        return false;
    }
}
