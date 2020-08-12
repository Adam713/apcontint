package p000;

import com.valdio.valdioveliu.recyclerview.Report3_balance_month;
import java.util.Comparator;

/* renamed from: DN */
class C0069DN implements Comparator<C0082EH> {

    /* renamed from: a */
    public final /* synthetic */ Report3_balance_month f168a;

    public C0069DN(Report3_balance_month report3_balance_month) {
        this.f168a = report3_balance_month;
    }

    /* renamed from: a */
    public int compare(C0082EH eh, C0082EH eh2) {
        return String.valueOf(eh.mo192g()).compareTo(String.valueOf(eh2.mo192g()));
    }
}
