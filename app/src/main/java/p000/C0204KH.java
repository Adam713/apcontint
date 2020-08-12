package p000;

import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.CustomerList;

/* renamed from: KH */
class C0204KH implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ CustomerList f513a;

    public C0204KH(CustomerList customerList) {
        this.f513a = customerList;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v1, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList]
      assigns: [com.valdio.valdioveliu.recyclerview.CustomerList]
      uses: [android.content.Context]
      mth insns count: 9
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
            android.content.Intent r2 = new android.content.Intent
            com.valdio.valdioveliu.recyclerview.CustomerList r3 = r1.f513a
            java.lang.Class<com.valdio.valdioveliu.recyclerview.Google_drive_list> r0 = com.valdio.valdioveliu.recyclerview.Google_drive_list.class
            r2.<init>(r3, r0)
            java.lang.String r3 = "bk_flag"
            java.lang.String r0 = "1"
            r2.putExtra(r3, r0)
            com.valdio.valdioveliu.recyclerview.CustomerList r3 = r1.f513a
            r0 = 1
            r3.startActivityForResult(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0204KH.onClick(android.content.DialogInterface, int):void");
    }
}
