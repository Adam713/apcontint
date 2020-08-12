package p000;

import android.graphics.Color;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.widget.AbsListView.MultiChoiceModeListener;
import com.valdio.valdioveliu.recyclerview.Google_drive_list;

/* renamed from: DM */
class C0068DM implements MultiChoiceModeListener {

    /* renamed from: a */
    public final /* synthetic */ Google_drive_list f167a;

    public C0068DM(Google_drive_list google_drive_list) {
        this.f167a = google_drive_list;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list] */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r1v6, types: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v1, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Google_drive_list]
      assigns: [com.valdio.valdioveliu.recyclerview.Google_drive_list]
      uses: [com.valdio.valdioveliu.recyclerview.Google_drive_list, android.content.Context]
      mth insns count: 24
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
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onActionItemClicked(ActionMode r4, android.view.MenuItem r5) {
        /*
            r3 = this;
            int r5 = r5.getItemId()
            r0 = 0
            r1 = 2131296542(0x7f09011e, float:1.8211004E38)
            if (r5 == r1) goto L_0x000b
            return r0
        L_0x000b:
            com.valdio.valdioveliu.recyclerview.Google_drive_list r5 = r3.f167a
            SM r5 = r5.f2504p
            android.util.SparseBooleanArray r5 = r5.mo1183b()
            com.valdio.valdioveliu.recyclerview.Google_drive_list r1 = r3.f167a
            r1.f2508t = r5
            android.support.v7.app.AlertDialog$Builder r5 = new android.support.v7.app.AlertDialog$Builder
            r5.<init>(r1)
            com.valdio.valdioveliu.recyclerview.Google_drive_list r1 = r3.f167a
            r2 = 2131755166(0x7f10009e, float:1.9141204E38)
            java.lang.String r1 = r1.getString(r2)
            r5.setMessage(r1)
            com.valdio.valdioveliu.recyclerview.Google_drive_list r1 = r3.f167a
            r2 = 2131755137(0x7f100081, float:1.9141145E38)
            java.lang.String r1 = r1.getString(r2)
            BM r2 = new BM
            r2.<init>(r3)
            r5.setPositiveButton(r1, r2)
            com.valdio.valdioveliu.recyclerview.Google_drive_list r1 = r3.f167a
            r2 = 2131755136(0x7f100080, float:1.9141143E38)
            java.lang.String r1 = r1.getString(r2)
            CM r2 = new CM
            r2.<init>(r3)
            r5.setNegativeButton(r1, r2)
            android.support.v7.app.AlertDialog r5 = r5.create()
            r5.show()
            r4.finish()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0068DM.onActionItemClicked(android.view.ActionMode, android.view.MenuItem):boolean");
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getMenuInflater().inflate(2131558404, menu);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        Log.d("Back_=", "BACK#2");
        this.f167a.f2503o.setBackgroundColor(Color.parseColor("#FFFFFF"));
        this.f167a.f2504p.f1138i.clear();
        this.f167a.f2504p.mo1184c();
    }

    public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
        int checkedItemCount = this.f167a.f2503o.getCheckedItemCount();
        actionMode.invalidate();
        StringBuilder sb = new StringBuilder();
        sb.append(checkedItemCount);
        sb.append(" Selected");
        actionMode.setTitle(sb.toString());
        this.f167a.f2504p.mo1180a(i);
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }
}
