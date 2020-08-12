package p000;

import com.valdio.valdioveliu.recyclerview.Customer_Det_List;
import java.util.Comparator;

/* renamed from: LI */
class C0229LI implements Comparator<C0232LL> {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List f601a;

    public C0229LI(Customer_Det_List customer_Det_List) {
        this.f601a = customer_Det_List;
    }

    /* renamed from: a */
    public int compare(C0232LL ll, C0232LL ll2) {
        return String.valueOf(ll2.mo779j()).compareTo(String.valueOf(ll.mo779j()));
    }
}
