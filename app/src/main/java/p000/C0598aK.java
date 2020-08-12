package p000;

import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: aK */
class C0598aK implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String[] f1807a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit f1808b;

    public C0598aK(Customer_Det_List_edit customer_Det_List_edit, String[] strArr) {
        this.f1808b = customer_Det_List_edit;
        this.f1807a = strArr;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v1, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context]
      assigns: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit]
      uses: [android.content.Context]
      mth insns count: 81
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
    public void onClick(android.content.DialogInterface r6, int r7) {
        /*
            r5 = this;
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r6 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            boolean r6 = p000.C0760eU.m2615a(r6)     // Catch:{ Exception -> 0x00d0 }
            java.lang.String[] r0 = r5.f1807a     // Catch:{ Exception -> 0x00d0 }
            r0 = r0[r7]     // Catch:{ Exception -> 0x00d0 }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r1 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x00d0 }
            r2 = 2130903056(0x7f030010, float:1.741292E38)
            java.lang.String[] r1 = r1.getStringArray(r2)     // Catch:{ Exception -> 0x00d0 }
            r3 = 0
            r1 = r1[r3]     // Catch:{ Exception -> 0x00d0 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x00d0 }
            if (r0 == 0) goto L_0x003a
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r7 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r0 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x00d0 }
            java.lang.String[] r0 = r0.getStringArray(r2)     // Catch:{ Exception -> 0x00d0 }
            r0 = r0[r3]     // Catch:{ Exception -> 0x00d0 }
            r7.f2300ia = r0     // Catch:{ Exception -> 0x00d0 }
            if (r6 == 0) goto L_0x00d0
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r6 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            r6.mo3628g()     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00d0
        L_0x003a:
            java.lang.String[] r0 = r5.f1807a     // Catch:{ Exception -> 0x00d0 }
            r0 = r0[r7]     // Catch:{ Exception -> 0x00d0 }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r1 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x00d0 }
            java.lang.String[] r1 = r1.getStringArray(r2)     // Catch:{ Exception -> 0x00d0 }
            r4 = 1
            r1 = r1[r4]     // Catch:{ Exception -> 0x00d0 }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x00d0 }
            if (r0 == 0) goto L_0x006a
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r7 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r0 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x00d0 }
            java.lang.String[] r0 = r0.getStringArray(r2)     // Catch:{ Exception -> 0x00d0 }
            r0 = r0[r4]     // Catch:{ Exception -> 0x00d0 }
            r7.f2300ia = r0     // Catch:{ Exception -> 0x00d0 }
            if (r6 == 0) goto L_0x00d0
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r6 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            r6.mo3657t()     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00d0
        L_0x006a:
            java.lang.String[] r6 = r5.f1807a     // Catch:{ Exception -> 0x00d0 }
            r6 = r6[r7]     // Catch:{ Exception -> 0x00d0 }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r0 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x00d0 }
            r1 = 2130903043(0x7f030003, float:1.7412893E38)
            java.lang.String[] r0 = r0.getStringArray(r1)     // Catch:{ Exception -> 0x00d0 }
            r0 = r0[r3]     // Catch:{ Exception -> 0x00d0 }
            boolean r6 = r6.equals(r0)     // Catch:{ Exception -> 0x00d0 }
            if (r6 == 0) goto L_0x00a8
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r6 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            JU r6 = r6.f2285b     // Catch:{ Exception -> 0x00d0 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d0 }
            r7.<init>()     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r0 = p000.C0195JU.f442b     // Catch:{ Exception -> 0x00d0 }
            r7.append(r0)     // Catch:{ Exception -> 0x00d0 }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r0 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            android.widget.ImageView r0 = r0.f2330y     // Catch:{ Exception -> 0x00d0 }
            java.lang.Object r0 = r0.getTag()     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00d0 }
            r7.append(r0)     // Catch:{ Exception -> 0x00d0 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00d0 }
            r6.mo460H(r7)     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00d0
        L_0x00a8:
            java.lang.String[] r6 = r5.f1807a     // Catch:{ Exception -> 0x00d0 }
            r6 = r6[r7]     // Catch:{ Exception -> 0x00d0 }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r7 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ Exception -> 0x00d0 }
            java.lang.String[] r7 = r7.getStringArray(r1)     // Catch:{ Exception -> 0x00d0 }
            r7 = r7[r4]     // Catch:{ Exception -> 0x00d0 }
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00d0 }
            if (r6 == 0) goto L_0x00d0
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r6 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            android.widget.ImageView r6 = r6.f2330y     // Catch:{ Exception -> 0x00d0 }
            r7 = 0
            r6.setTag(r7)     // Catch:{ Exception -> 0x00d0 }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r6 = r5.f1808b     // Catch:{ Exception -> 0x00d0 }
            android.widget.ImageView r6 = r6.f2330y     // Catch:{ Exception -> 0x00d0 }
            r7 = 2131230821(0x7f080065, float:1.8077706E38)
            r6.setImageResource(r7)     // Catch:{ Exception -> 0x00d0 }
        L_0x00d0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0598aK.onClick(android.content.DialogInterface, int):void");
    }
}
