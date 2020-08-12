package p000;

import android.widget.AdapterView.OnItemClickListener;
import com.valdio.valdioveliu.recyclerview.CustomerList;

/* renamed from: bI */
class C0620bI implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ CustomerList f1897a;

    public C0620bI(CustomerList customerList) {
        this.f1897a = customerList;
    }

    /* JADX WARNING: type inference failed for: r3v14, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v14, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.CustomerList]
      uses: [android.app.Activity]
      mth insns count: 38
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
    public void onItemClick(android.widget.AdapterView<?> r3, android.view.View r4, int r5, long r6) {
        /*
            r2 = this;
            r3 = 2131296385(0x7f090081, float:1.8210685E38)
            android.view.View r3 = r4.findViewById(r3)     // Catch:{ Exception -> 0x007a }
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ Exception -> 0x007a }
            java.lang.CharSequence r3 = r3.getText()     // Catch:{ Exception -> 0x007a }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x007a }
            r5 = 2131296317(0x7f09003d, float:1.8210547E38)
            android.view.View r5 = r4.findViewById(r5)     // Catch:{ Exception -> 0x007a }
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x007a }
            java.lang.CharSequence r5 = r5.getText()     // Catch:{ Exception -> 0x007a }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x007a }
            r6 = 2131296389(0x7f090085, float:1.8210693E38)
            android.view.View r6 = r4.findViewById(r6)     // Catch:{ Exception -> 0x007a }
            android.widget.TextView r6 = (android.widget.TextView) r6     // Catch:{ Exception -> 0x007a }
            java.lang.CharSequence r6 = r6.getText()     // Catch:{ Exception -> 0x007a }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x007a }
            r7 = 2131296394(0x7f09008a, float:1.8210703E38)
            android.view.View r7 = r4.findViewById(r7)     // Catch:{ Exception -> 0x007a }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x007a }
            java.lang.CharSequence r7 = r7.getText()     // Catch:{ Exception -> 0x007a }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x007a }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x007a }
            android.content.Context r4 = r4.getContext()     // Catch:{ Exception -> 0x007a }
            java.lang.Class<com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport> r1 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport.class
            r0.<init>(r4, r1)     // Catch:{ Exception -> 0x007a }
            java.lang.String r4 = "CUS_ID"
            r0.putExtra(r4, r3)     // Catch:{ Exception -> 0x007a }
            java.lang.String r3 = "CUS_BAL"
            r0.putExtra(r3, r5)     // Catch:{ Exception -> 0x007a }
            java.lang.String r3 = "CUS_GSM"
            r0.putExtra(r3, r6)     // Catch:{ Exception -> 0x007a }
            java.lang.String r3 = "CUS_NAME"
            r0.putExtra(r3, r7)     // Catch:{ Exception -> 0x007a }
            com.valdio.valdioveliu.recyclerview.CustomerList r3 = r2.f1897a     // Catch:{ Exception -> 0x007a }
            android.os.Bundle r3 = r3.f2085G     // Catch:{ Exception -> 0x007a }
            r0.putExtras(r3)     // Catch:{ Exception -> 0x007a }
            com.valdio.valdioveliu.recyclerview.CustomerList r3 = r2.f1897a     // Catch:{ Exception -> 0x007a }
            android.widget.ListView r3 = r3.f2094h     // Catch:{ Exception -> 0x007a }
            int r3 = r3.getFirstVisiblePosition()     // Catch:{ Exception -> 0x007a }
            com.valdio.valdioveliu.recyclerview.CustomerList.f2078a = r3     // Catch:{ Exception -> 0x007a }
            com.valdio.valdioveliu.recyclerview.CustomerList r3 = r2.f1897a     // Catch:{ Exception -> 0x007a }
            r3.startActivity(r0)     // Catch:{ Exception -> 0x007a }
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0620bI.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
