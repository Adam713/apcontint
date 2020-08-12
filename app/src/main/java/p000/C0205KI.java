package p000;

import com.valdio.valdioveliu.recyclerview.Customer_Det_List;
import java.util.Comparator;

/* renamed from: KI */
class C0205KI implements Comparator<C0232LL> {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List f514a;

    public C0205KI(Customer_Det_List customer_Det_List) {
        this.f514a = customer_Det_List;
    }

    /* renamed from: a */
    public int compare(C0232LL ll, C0232LL ll2) {
        return String.valueOf(ll.mo780k()).compareTo(String.valueOf(ll2.mo780k()));
    }
}
