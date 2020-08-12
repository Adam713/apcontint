package p000;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp;

/* renamed from: tN */
class C1071tN implements OnChildClickListener {

    /* renamed from: a */
    public final /* synthetic */ Report2_customer_late_exp f3779a;

    public C1071tN(Report2_customer_late_exp report2_customer_late_exp) {
        this.f3779a = report2_customer_late_exp;
    }

    public boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        C0186JL jl = (C0186JL) ((C0208KL) this.f3779a.f2573k.get(i)).mo671b().get(i2);
        return false;
    }
}
