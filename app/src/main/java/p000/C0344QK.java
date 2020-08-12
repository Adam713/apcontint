package p000;

import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: QK */
class C0344QK implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f998a;

    public C0344QK(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f998a = customer_Det_List_edit2;
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v4, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2]
      uses: [android.app.Activity]
      mth insns count: 51
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
    public void onClick(android.content.DialogInterface r4, int r5) {
        /*
            r3 = this;
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r4 = r3.f998a     // Catch:{ Exception -> 0x008f }
            int r4 = r4.f2377i     // Catch:{ Exception -> 0x008f }
            if (r4 == 0) goto L_0x008f
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r4 = r3.f998a     // Catch:{ Exception -> 0x008f }
            JU r4 = r4.f2363b     // Catch:{ Exception -> 0x008f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008f }
            r5.<init>()     // Catch:{ Exception -> 0x008f }
            java.lang.String r0 = "delete from transactions  where id='"
            r5.append(r0)     // Catch:{ Exception -> 0x008f }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r0 = r3.f998a     // Catch:{ Exception -> 0x008f }
            int r0 = r0.f2377i     // Catch:{ Exception -> 0x008f }
            r5.append(r0)     // Catch:{ Exception -> 0x008f }
            java.lang.String r0 = "'"
            r5.append(r0)     // Catch:{ Exception -> 0x008f }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x008f }
            r4.mo562d(r5)     // Catch:{ Exception -> 0x008f }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r4 = r3.f998a     // Catch:{ Exception -> 0x008f }
            android.widget.EditText r4 = r4.f2391p     // Catch:{ Exception -> 0x008f }
            r5 = 0
            r4.setText(r5)     // Catch:{ Exception -> 0x008f }
            java.util.Calendar r4 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x008f }
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x008f }
            java.lang.String r1 = "dd-MM-yyyy"
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x008f }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x008f }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r1 = r3.f998a     // Catch:{ Exception -> 0x008f }
            android.widget.TextView r1 = r1.f2395r     // Catch:{ Exception -> 0x008f }
            java.util.Date r2 = r4.getTime()     // Catch:{ Exception -> 0x008f }
            java.lang.String r0 = r0.format(r2)     // Catch:{ Exception -> 0x008f }
            r1.setText(r0)     // Catch:{ Exception -> 0x008f }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r0 = r3.f998a     // Catch:{ Exception -> 0x008f }
            r1 = 1
            int r1 = r4.get(r1)     // Catch:{ Exception -> 0x008f }
            r0.f2381k = r1     // Catch:{ Exception -> 0x008f }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r0 = r3.f998a     // Catch:{ Exception -> 0x008f }
            r1 = 2
            int r1 = r4.get(r1)     // Catch:{ Exception -> 0x008f }
            r0.f2383l = r1     // Catch:{ Exception -> 0x008f }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r0 = r3.f998a     // Catch:{ Exception -> 0x008f }
            r1 = 5
            int r4 = r4.get(r1)     // Catch:{ Exception -> 0x008f }
            r0.f2385m = r4     // Catch:{ Exception -> 0x008f }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r4 = r3.f998a     // Catch:{ Exception -> 0x008f }
            android.widget.AutoCompleteTextView r4 = r4.f2399t     // Catch:{ Exception -> 0x008f }
            r4.setText(r5)     // Catch:{ Exception -> 0x008f }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r4 = r3.f998a     // Catch:{ Exception -> 0x008f }
            android.widget.Button r4 = r4.f2401u     // Catch:{ Exception -> 0x008f }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r5 = r3.f998a     // Catch:{ Exception -> 0x008f }
            r0 = 2131755103(0x7f10005f, float:1.9141076E38)
            java.lang.String r5 = r5.getString(r0)     // Catch:{ Exception -> 0x008f }
            r4.setText(r5)     // Catch:{ Exception -> 0x008f }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r4 = r3.f998a     // Catch:{ Exception -> 0x008f }
            r5 = 0
            r4.f2377i = r5     // Catch:{ Exception -> 0x008f }
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r4 = r3.f998a     // Catch:{ Exception -> 0x008f }
            r4.mo3758y()     // Catch:{ Exception -> 0x008f }
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0344QK.onClick(android.content.DialogInterface, int):void");
    }
}
