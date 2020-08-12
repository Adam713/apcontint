package p000;

import android.view.View.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List;

/* renamed from: SI */
class C0384SI implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List f1125a;

    public C0384SI(Customer_Det_List customer_Det_List) {
        this.f1125a = customer_Det_List;
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v6, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.Customer_Det_List]
      uses: [android.app.Activity]
      mth insns count: 14
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
    public void onClick(android.view.View r3) {
        /*
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r3 = r3.getContext()
            java.lang.Class<com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit> r1 = com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit.class
            r0.<init>(r3, r1)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r3 = r2.f1125a
            java.lang.String r3 = r3.f2196f
            java.lang.String r1 = "CUS_NAME"
            r0.putExtra(r1, r3)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r3 = r2.f1125a
            java.lang.String r3 = r3.f2193c
            java.lang.String r1 = "CUS_ID"
            r0.putExtra(r1, r3)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List r3 = r2.f1125a
            r3.startActivity(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0384SI.onClick(android.view.View):void");
    }
}
