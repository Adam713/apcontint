package p000;

import android.widget.AdapterView.OnItemClickListener;
import com.valdio.valdioveliu.recyclerview.CustomerList2;

/* renamed from: kI */
class C0871kI implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ CustomerList2 f3197a;

    public C0871kI(CustomerList2 customerList2) {
        this.f3197a = customerList2;
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [com.valdio.valdioveliu.recyclerview.CustomerList2, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v9, types: [com.valdio.valdioveliu.recyclerview.CustomerList2, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.CustomerList2]
      uses: [android.app.Activity]
      mth insns count: 30
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onItemClick(android.widget.AdapterView<?> r3, android.view.View r4, int r5, long r6) {
        /*
            r2 = this;
            r3 = 2131296385(0x7f090081, float:1.8210685E38)
            android.view.View r3 = r4.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.CharSequence r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r5 = 2131296317(0x7f09003d, float:1.8210547E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            java.lang.CharSequence r5 = r5.getText()
            java.lang.String r5 = r5.toString()
            r6 = 2131296389(0x7f090085, float:1.8210693E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            java.lang.CharSequence r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            r7 = 2131296394(0x7f09008a, float:1.8210703E38)
            android.view.View r7 = r4.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.CharSequence r7 = r7.getText()
            java.lang.String r7 = r7.toString()
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r4 = r4.getContext()
            java.lang.Class<com.valdio.valdioveliu.recyclerview.Customer_Det_List> r1 = com.valdio.valdioveliu.recyclerview.Customer_Det_List.class
            r0.<init>(r4, r1)
            java.lang.String r4 = "CUS_ID"
            r0.putExtra(r4, r3)
            java.lang.String r3 = "CUS_BAL"
            r0.putExtra(r3, r5)
            java.lang.String r3 = "CUS_GSM"
            r0.putExtra(r3, r6)
            java.lang.String r3 = "CUS_NAME"
            r0.putExtra(r3, r7)
            com.valdio.valdioveliu.recyclerview.CustomerList2 r3 = r2.f3197a
            r3.startActivity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0871kI.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
