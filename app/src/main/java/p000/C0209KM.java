package p000;

import android.app.ProgressDialog;

/* renamed from: KM */
class C0209KM implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ProgressDialog f528a;

    /* renamed from: b */
    public final /* synthetic */ String f529b;

    /* renamed from: c */
    public final /* synthetic */ C0699a f530c;

    public C0209KM(C0699a aVar, ProgressDialog progressDialog, String str) {
        this.f530c = aVar;
        this.f528a = progressDialog;
        this.f529b = str;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v1, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.Google_drive_list]
      uses: [android.app.Activity]
      mth insns count: 11
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
    public void run() {
        /*
            r4 = this;
            android.app.ProgressDialog r0 = r4.f528a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.valdio.valdioveliu.recyclerview.Google_drive_list$a r2 = r4.f530c
            com.valdio.valdioveliu.recyclerview.Google_drive_list r2 = com.valdio.valdioveliu.recyclerview.Google_drive_list.this
            r3 = 2131755202(0x7f1000c2, float:1.9141277E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            java.lang.String r2 = r4.f529b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setMessage(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0209KM.run():void");
    }
}
