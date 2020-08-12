package p000;

import com.valdio.valdioveliu.recyclerview.Report2_customer_late;
import java.util.Comparator;

/* renamed from: mN */
class C0920mN implements Comparator<C0082EH> {

    /* renamed from: a */
    public final /* synthetic */ Report2_customer_late f3338a;

    public C0920mN(Report2_customer_late report2_customer_late) {
        this.f3338a = report2_customer_late;
    }

    /* renamed from: a */
    public int compare(C0082EH eh, C0082EH eh2) {
        return String.valueOf(eh2.mo193h()).compareTo(String.valueOf(eh.mo193h()));
    }
}
