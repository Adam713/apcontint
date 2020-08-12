package p000;

import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: CL */
class C0048CL implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f87a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f88b;

    public C0048CL(Customer_Det_List_edit2 customer_Det_List_edit2, int i) {
        this.f88b = customer_Det_List_edit2;
        this.f87a = i;
    }

    public void run() {
        if (this.f87a == 4) {
            this.f88b.f2391p.selectAll();
        }
    }
}
