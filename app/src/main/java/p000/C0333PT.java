package p000;

import android.graphics.Color;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.widget.AbsListView.MultiChoiceModeListener;
import com.valdio.valdioveliu.recyclerview.frag.GroupList_edit;

/* renamed from: PT */
class C0333PT implements MultiChoiceModeListener {

    /* renamed from: a */
    public final /* synthetic */ GroupList_edit f949a;

    public C0333PT(GroupList_edit groupList_edit) {
        this.f949a = groupList_edit;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.frag.GroupList_edit] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.app.Activity, com.valdio.valdioveliu.recyclerview.frag.GroupList_edit] */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.app.Activity, com.valdio.valdioveliu.recyclerview.frag.GroupList_edit] */
    /* JADX WARNING: type inference failed for: r1v5, types: [android.app.Activity, com.valdio.valdioveliu.recyclerview.frag.GroupList_edit] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.frag.GroupList_edit]
      assigns: [com.valdio.valdioveliu.recyclerview.frag.GroupList_edit]
      uses: [com.valdio.valdioveliu.recyclerview.frag.GroupList_edit, android.content.Context]
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
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onActionItemClicked(ActionMode r4, android.view.MenuItem r5) {
        /*
            r3 = this;
            int r5 = r5.getItemId()
            r0 = 0
            switch(r5) {
                case 2131296542: goto L_0x001c;
                case 2131296543: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r0
        L_0x0009:
            com.valdio.valdioveliu.recyclerview.frag.GroupList_edit r5 = r3.f949a
            SM r5 = r5.f2771r
            android.util.SparseBooleanArray r5 = r5.mo1183b()
            com.valdio.valdioveliu.recyclerview.frag.GroupList_edit r1 = r3.f949a
            r1.f2773t = r5
            r1.mo4210b()
        L_0x0018:
            r4.finish()
            return r0
        L_0x001c:
            com.valdio.valdioveliu.recyclerview.frag.GroupList_edit r5 = r3.f949a
            SM r5 = r5.f2771r
            android.util.SparseBooleanArray r5 = r5.mo1183b()
            com.valdio.valdioveliu.recyclerview.frag.GroupList_edit r1 = r3.f949a
            r1.f2773t = r5
            android.support.v7.app.AlertDialog$Builder r5 = new android.support.v7.app.AlertDialog$Builder
            r5.<init>(r1)
            com.valdio.valdioveliu.recyclerview.frag.GroupList_edit r1 = r3.f949a
            r2 = 2131755166(0x7f10009e, float:1.9141204E38)
            java.lang.String r1 = r1.getString(r2)
            r5.setMessage(r1)
            com.valdio.valdioveliu.recyclerview.frag.GroupList_edit r1 = r3.f949a
            r2 = 2131755137(0x7f100081, float:1.9141145E38)
            java.lang.String r1 = r1.getString(r2)
            LT r2 = new LT
            r2.<init>(r3)
            r5.setPositiveButton(r1, r2)
            com.valdio.valdioveliu.recyclerview.frag.GroupList_edit r1 = r3.f949a
            r2 = 2131755136(0x7f100080, float:1.9141143E38)
            java.lang.String r1 = r1.getString(r2)
            MT r2 = new MT
            r2.<init>(r3)
            r5.setNegativeButton(r1, r2)
            android.support.v7.app.AlertDialog r5 = r5.create()
            r5.show()
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0333PT.onActionItemClicked(android.view.ActionMode, android.view.MenuItem):boolean");
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getMenuInflater().inflate(2131558403, menu);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        Log.d("Back_=", "BACK#2");
        this.f949a.f2769p.setBackgroundColor(Color.parseColor("#FFFFFF"));
        this.f949a.f2771r.f1138i.clear();
        this.f949a.f2771r.mo1184c();
    }

    public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
        int checkedItemCount = this.f949a.f2769p.getCheckedItemCount();
        actionMode.invalidate();
        StringBuilder sb = new StringBuilder();
        sb.append(checkedItemCount);
        sb.append(" Selected");
        actionMode.setTitle(sb.toString());
        this.f949a.f2771r.mo1180a(i);
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (this.f949a.f2769p.getCheckedItemCount() != 1) {
            menu.findItem(2131296543).setVisible(false);
        } else {
            menu.findItem(2131296542).setVisible(true);
            menu.findItem(2131296543).setVisible(true);
        }
        return false;
    }
}
