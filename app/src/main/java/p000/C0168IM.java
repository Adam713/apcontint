package p000;

import android.content.DialogInterface.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Google_drive_list;

/* renamed from: IM */
class C0168IM implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ Google_drive_list f377a;

    public C0168IM(Google_drive_list google_drive_list) {
        this.f377a = google_drive_list;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v1, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.Google_drive_list]
      uses: [android.app.Activity, android.content.Context]
      mth insns count: 7
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
            com.valdio.valdioveliu.recyclerview.Google_drive_list r2 = r1.f377a     // Catch:{ Exception -> 0x0006 }
            r2.mo3837j()     // Catch:{ Exception -> 0x0006 }
            goto L_0x0013
        L_0x0006:
            com.valdio.valdioveliu.recyclerview.Google_drive_list r2 = r1.f377a
            r3 = 2131755389(0x7f10017d, float:1.9141656E38)
            java.lang.String r3 = r2.getString(r3)
            r0 = 1
            android.widget.Toast.makeText(r2, r3, r0)
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0168IM.onClick(android.content.DialogInterface, int):void");
    }
}
