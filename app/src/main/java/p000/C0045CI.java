package p000;

import android.content.DialogInterface.OnClickListener;

/* renamed from: CI */
class C0045CI implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0083EI f83a;

    public C0045CI(C0083EI ei) {
        this.f83a = ei;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v2, types: [com.valdio.valdioveliu.recyclerview.CustomerList_tmp, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.CustomerList_tmp]
      uses: [android.app.Activity]
      mth insns count: 10
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
    public void onClick(android.content.DialogInterface r2, int r3) {
        /*
            r1 = this;
            EI r2 = r1.f83a     // Catch:{ Exception -> 0x0008 }
            com.valdio.valdioveliu.recyclerview.CustomerList_tmp r2 = r2.f208a     // Catch:{ Exception -> 0x0008 }
            r2.mo3450a()     // Catch:{ Exception -> 0x0008 }
            goto L_0x0016
        L_0x0008:
            EI r2 = r1.f83a
            com.valdio.valdioveliu.recyclerview.CustomerList_tmp r2 = r2.f208a
            android.content.Context r2 = r2.getApplicationContext()
            r3 = 1
            java.lang.String r0 = "SQL Error."
            android.widget.Toast.makeText(r2, r0, r3)
        L_0x0016:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0045CI.onClick(android.content.DialogInterface, int):void");
    }
}
