package p000;

import android.app.Dialog;
import android.widget.AdapterView.OnItemClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List;

/* renamed from: TI */
class C0406TI implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ Dialog f1177a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List f1178b;

    public C0406TI(Customer_Det_List customer_Det_List, Dialog dialog) {
        this.f1178b = customer_Det_List;
        this.f1177a = dialog;
    }

    /* JADX WARNING: type inference failed for: r9v9, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v9, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.Customer_Det_List]
      uses: [android.app.Activity]
      mth insns count: 84
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
        /*
            r7 = this;
            java.lang.String r8 = java.lang.String.valueOf(r10)
            java.lang.String r9 = "tran_type_pos="
            android.util.Log.d(r9, r8)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r8 = r7.f1178b
            java.util.List<LL> r9 = r8.f2213w
            r8.mo3500h(r9)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r8 = r7.f1178b
            OM r8 = r8.f2212v
            r8.notifyDataSetChanged()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r8 = r7.f1178b
            r9 = 1
            r8.f2199i = r9
            if (r10 != 0) goto L_0x0068
            r8.mo3484b()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r8 = r7.f1178b
            JU r0 = r8.f2192b
            android.widget.ListView r1 = r8.f2210t
            java.lang.String r8 = r8.f2196f
            java.lang.String r2 = r0.mo465K(r8)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r8 = r7.f1178b
            OM r9 = r8.f2212v
            java.util.List<LL> r9 = r9.f863d
            double r3 = r8.mo3479a(r9)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r8 = r7.f1178b
            java.lang.String r5 = r8.f2187P
            java.lang.String r6 = r8.f2188Q
            r0.mo507a(r1, r2, r3, r5, r6)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r8 = r7.f1178b
            JU r8 = r8.f2192b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r10 = r7.f1178b
            JU r11 = r10.f2192b
            java.lang.String r10 = r10.f2196f
            java.lang.String r10 = r11.mo465K(r10)
            r9.append(r10)
            java.lang.String r10 = ".pdf"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.mo484U(r9)
            goto L_0x00df
        L_0x0068:
            if (r10 != r9) goto L_0x008a
            r8.mo3484b()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r8 = r7.f1178b
            JU r9 = r8.f2192b
            android.widget.ListView r10 = r8.f2210t
            android.widget.LinearLayout r8 = r8.f2211u
            android.graphics.Bitmap r8 = r9.mo493a(r10, r8)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r9 = r7.f1178b
            JU r9 = r9.f2192b
            java.lang.String r10 = "cus_details.jpg"
            r9.mo521a(r8, r10)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r8 = r7.f1178b
            JU r8 = r8.f2192b
            r8.mo482T(r10)
            goto L_0x00df
        L_0x008a:
            r9 = 2
            if (r10 != r9) goto L_0x00df
            r8.f2182K = r9
            java.lang.String r8 = r8.f2195e
            int r8 = r8.length()
            r9 = 3
            if (r8 >= r9) goto L_0x00bc
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r8 = r7.f1178b
            java.lang.String r8 = r8.f2193c
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r9 = r7.f1178b
            java.lang.String r9 = r9.f2196f
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r10 = r7.f1178b
            java.lang.String r10 = r10.f2195e
            HH r8 = p000.C0142HH.m298a(r8, r9, r10)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r9 = r7.f1178b
            android.app.FragmentManager r9 = r9.getFragmentManager()
            java.lang.String r10 = "CUSTOMER"
            r8.show(r9, r10)
            goto L_0x00df
        L_0x00bc:
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r8 = r7.f1178b
            JU r9 = r8.f2192b
            java.lang.String r8 = r8.f2195e
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r10 = r7.f1178b
            JU r11 = r10.f2192b
            android.widget.ListView r12 = r10.f2210t
            java.lang.String r10 = r10.f2196f
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r0 = r7.f1178b
            OM r1 = r0.f2212v
            java.util.List<LL> r1 = r1.f863d
            double r0 = r0.mo3479a(r1)
            java.lang.String r10 = r11.mo531b(r12, r10, r0)
            r9.mo634y(r8, r10)
        L_0x00df:
            android.app.Dialog r8 = r7.f1177a
            r8.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0406TI.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
