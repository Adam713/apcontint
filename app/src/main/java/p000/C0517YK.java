package p000;

import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: YK */
class C0517YK implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ String[] f1490a;

    /* renamed from: b */
    public final /* synthetic */ Customer_Det_List_edit2 f1491b;

    public C0517YK(Customer_Det_List_edit2 customer_Det_List_edit2, String[] strArr) {
        this.f1491b = customer_Det_List_edit2;
        this.f1490a = strArr;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v1, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2]
      assigns: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2]
      uses: [android.content.Context]
      mth insns count: 97
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
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r6 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            boolean r6 = p000.C0760eU.m2615a(r6)     // Catch:{ Exception -> 0x00fe }
            java.lang.String[] r0 = r5.f1490a     // Catch:{ Exception -> 0x00fe }
            r0 = r0[r7]     // Catch:{ Exception -> 0x00fe }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r1 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x00fe }
            r2 = 2130903056(0x7f030010, float:1.741292E38)
            java.lang.String[] r1 = r1.getStringArray(r2)     // Catch:{ Exception -> 0x00fe }
            r3 = 0
            r1 = r1[r3]     // Catch:{ Exception -> 0x00fe }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x00fe }
            if (r0 == 0) goto L_0x003a
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r7 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r0 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x00fe }
            java.lang.String[] r0 = r0.getStringArray(r2)     // Catch:{ Exception -> 0x00fe }
            r0 = r0[r3]     // Catch:{ Exception -> 0x00fe }
            r7.f2382ka = r0     // Catch:{ Exception -> 0x00fe }
            if (r6 == 0) goto L_0x00fe
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r6 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            r6.mo3726i()     // Catch:{ Exception -> 0x00fe }
            goto L_0x00fe
        L_0x003a:
            java.lang.String[] r0 = r5.f1490a     // Catch:{ Exception -> 0x00fe }
            r0 = r0[r7]     // Catch:{ Exception -> 0x00fe }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r1 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ Exception -> 0x00fe }
            java.lang.String[] r1 = r1.getStringArray(r2)     // Catch:{ Exception -> 0x00fe }
            r4 = 1
            r1 = r1[r4]     // Catch:{ Exception -> 0x00fe }
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x00fe }
            if (r0 == 0) goto L_0x006b
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r7 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r0 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x00fe }
            java.lang.String[] r0 = r0.getStringArray(r2)     // Catch:{ Exception -> 0x00fe }
            r0 = r0[r4]     // Catch:{ Exception -> 0x00fe }
            r7.f2382ka = r0     // Catch:{ Exception -> 0x00fe }
            if (r6 == 0) goto L_0x00fe
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r6 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            r6.mo3757x()     // Catch:{ Exception -> 0x00fe }
            goto L_0x00fe
        L_0x006b:
            java.lang.String[] r6 = r5.f1490a     // Catch:{ Exception -> 0x00fe }
            r6 = r6[r7]     // Catch:{ Exception -> 0x00fe }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r0 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ Exception -> 0x00fe }
            r1 = 2130903043(0x7f030003, float:1.7412893E38)
            java.lang.String[] r0 = r0.getStringArray(r1)     // Catch:{ Exception -> 0x00fe }
            r0 = r0[r3]     // Catch:{ Exception -> 0x00fe }
            boolean r6 = r6.equals(r0)     // Catch:{ Exception -> 0x00fe }
            if (r6 == 0) goto L_0x00a9
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r6 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            JU r6 = r6.f2363b     // Catch:{ Exception -> 0x00fe }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00fe }
            r7.<init>()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r0 = p000.C0195JU.f442b     // Catch:{ Exception -> 0x00fe }
            r7.append(r0)     // Catch:{ Exception -> 0x00fe }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r0 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            android.widget.ImageView r0 = r0.f2409y     // Catch:{ Exception -> 0x00fe }
            java.lang.Object r0 = r0.getTag()     // Catch:{ Exception -> 0x00fe }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00fe }
            r7.append(r0)     // Catch:{ Exception -> 0x00fe }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00fe }
            r6.mo460H(r7)     // Catch:{ Exception -> 0x00fe }
            goto L_0x00fe
        L_0x00a9:
            java.lang.String[] r6 = r5.f1490a     // Catch:{ Exception -> 0x00fe }
            r6 = r6[r7]     // Catch:{ Exception -> 0x00fe }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r7 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ Exception -> 0x00fe }
            java.lang.String[] r7 = r7.getStringArray(r1)     // Catch:{ Exception -> 0x00fe }
            r7 = r7[r4]     // Catch:{ Exception -> 0x00fe }
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x00fe }
            if (r6 == 0) goto L_0x00fe
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r6 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            android.widget.ImageView r6 = r6.f2409y     // Catch:{ Exception -> 0x00fe }
            r7 = 0
            r6.setTag(r7)     // Catch:{ Exception -> 0x00fe }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r6 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            android.widget.ImageView r6 = r6.f2409y     // Catch:{ Exception -> 0x00fe }
            r7 = 2131230821(0x7f080065, float:1.8077706E38)
            r6.setImageResource(r7)     // Catch:{ Exception -> 0x00fe }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r6 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            android.widget.ImageView r6 = r6.f2409y     // Catch:{ Exception -> 0x00fe }
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()     // Catch:{ Exception -> 0x00fe }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r7 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ Exception -> 0x00fe }
            r0 = 2131165263(0x7f07004f, float:1.7944738E38)
            float r7 = r7.getDimension(r0)     // Catch:{ Exception -> 0x00fe }
            int r7 = (int) r7     // Catch:{ Exception -> 0x00fe }
            r6.width = r7     // Catch:{ Exception -> 0x00fe }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r6 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            android.widget.ImageView r6 = r6.f2409y     // Catch:{ Exception -> 0x00fe }
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()     // Catch:{ Exception -> 0x00fe }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r7 = r5.f1491b     // Catch:{ Exception -> 0x00fe }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ Exception -> 0x00fe }
            float r7 = r7.getDimension(r0)     // Catch:{ Exception -> 0x00fe }
            int r7 = (int) r7     // Catch:{ Exception -> 0x00fe }
            r6.height = r7     // Catch:{ Exception -> 0x00fe }
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0517YK.onClick(android.content.DialogInterface, int):void");
    }
}
