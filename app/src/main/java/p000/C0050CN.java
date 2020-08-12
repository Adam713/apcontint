package p000;

import com.valdio.valdioveliu.recyclerview.Report3_balance_month;
import java.util.Comparator;

/* renamed from: CN */
class C0050CN implements Comparator<C0082EH> {

    /* renamed from: a */
    public final /* synthetic */ Report3_balance_month f90a;

    public C0050CN(Report3_balance_month report3_balance_month) {
        this.f90a = report3_balance_month;
    }

    /* renamed from: a */
    public int compare(C0082EH eh, C0082EH eh2) {
        return String.valueOf(eh2.mo192g()).compareTo(String.valueOf(eh.mo192g()));
    }
}
