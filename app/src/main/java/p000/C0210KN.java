package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp;

/* renamed from: KN */
class C0210KN implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Report3_balance_month_exp f531a;

    public C0210KN(Report3_balance_month_exp report3_balance_month_exp) {
        this.f531a = report3_balance_month_exp;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            this.f531a.f2608E = 0;
            this.f531a.mo4014e();
        } catch (Exception unused) {
        }
    }
}
