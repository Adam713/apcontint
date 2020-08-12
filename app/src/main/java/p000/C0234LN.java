package p000;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp;

/* renamed from: LN */
class C0234LN implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AlertDialog f617a;

    /* renamed from: b */
    public final /* synthetic */ Report3_balance_month_exp f618b;

    public C0234LN(Report3_balance_month_exp report3_balance_month_exp, AlertDialog alertDialog) {
        this.f618b = report3_balance_month_exp;
        this.f617a = alertDialog;
    }

    public void onClick(View view) {
        Report3_balance_month_exp report3_balance_month_exp;
        try {
            this.f618b.f2608E = 1;
            String str = "";
            if (this.f618b.f2611H.getText() == null) {
                this.f618b.f2609F = str;
            } else {
                this.f618b.f2609F = this.f618b.f2611H.getText().toString();
            }
            if (this.f618b.f2612I.getText() == null) {
                report3_balance_month_exp = this.f618b;
            } else {
                report3_balance_month_exp = this.f618b;
                str = this.f618b.f2612I.getText().toString();
            }
            report3_balance_month_exp.f2610G = str;
            this.f618b.mo4014e();
        } catch (Exception unused) {
        }
        this.f617a.dismiss();
    }
}
