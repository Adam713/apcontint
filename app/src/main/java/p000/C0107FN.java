package p000;

import com.valdio.valdioveliu.recyclerview.Report3_balance_month;
import java.util.Comparator;

/* renamed from: FN */
class C0107FN implements Comparator<C0082EH> {

    /* renamed from: a */
    public final /* synthetic */ Report3_balance_month f245a;

    public C0107FN(Report3_balance_month report3_balance_month) {
        this.f245a = report3_balance_month;
    }

    /* renamed from: a */
    public int compare(C0082EH eh, C0082EH eh2) {
        return String.valueOf(eh.mo193h()).compareTo(String.valueOf(eh2.mo193h()));
    }
}
