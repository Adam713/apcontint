package p000;

import android.widget.ExpandableListView.OnGroupExpandListener;
import com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp;

/* renamed from: sN */
class C1051sN implements OnGroupExpandListener {

    /* renamed from: a */
    public int f3732a = -1;

    /* renamed from: b */
    public final /* synthetic */ Report2_customer_late_exp f3733b;

    public C1051sN(Report2_customer_late_exp report2_customer_late_exp) {
        this.f3733b = report2_customer_late_exp;
    }

    public void onGroupExpand(int i) {
        if (i != this.f3732a) {
            this.f3733b.f2571i.collapseGroup(this.f3732a);
        }
        this.f3732a = i;
    }
}
