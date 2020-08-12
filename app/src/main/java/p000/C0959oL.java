package p000;

import android.graphics.Color;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.widget.AbsListView.MultiChoiceModeListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: oL */
class C0959oL implements MultiChoiceModeListener {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f3500a;

    public C0959oL(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f3500a = customer_Det_List_edit2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r1v3, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r1v5, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2]
      assigns: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2]
      uses: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.content.Context]
      mth insns count: 36
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
                case 2131296542: goto L_0x002c;
                case 2131296543: goto L_0x001c;
                case 2131296544: goto L_0x0008;
                case 2131296545: goto L_0x0008;
                case 2131296546: goto L_0x0009;
                default: goto L_0x0008;
            }
        L_0x0008:
            return r0
        L_0x0009:
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r5 = r3.f3500a
            OM r5 = r5.f2345K
            android.util.SparseBooleanArray r5 = r5.mo963a()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r1 = r3.f3500a
            r1.f2347M = r5
            r1.mo3680M()
        L_0x0018:
            r4.finish()
            return r0
        L_0x001c:
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r5 = r3.f3500a
            OM r5 = r5.f2345K
            android.util.SparseBooleanArray r5 = r5.mo963a()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r1 = r3.f3500a
            r1.f2347M = r5
            r1.mo3753t()
            goto L_0x0018
        L_0x002c:
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r5 = r3.f3500a
            OM r5 = r5.f2345K
            android.util.SparseBooleanArray r5 = r5.mo963a()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r1 = r3.f3500a
            r1.f2347M = r5
            android.support.v7.app.AlertDialog$Builder r5 = new android.support.v7.app.AlertDialog$Builder
            r5.<init>(r1)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r1 = r3.f3500a
            r2 = 2131755166(0x7f10009e, float:1.9141204E38)
            java.lang.String r1 = r1.getString(r2)
            r5.setMessage(r1)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r1 = r3.f3500a
            r2 = 2131755137(0x7f100081, float:1.9141145E38)
            java.lang.String r1 = r1.getString(r2)
            fL r2 = new fL
            r2.<init>(r3)
            r5.setPositiveButton(r1, r2)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r1 = r3.f3500a
            r2 = 2131755136(0x7f100080, float:1.9141143E38)
            java.lang.String r1 = r1.getString(r2)
            gL r2 = new gL
            r2.<init>(r3)
            r5.setNegativeButton(r1, r2)
            android.support.v7.app.AlertDialog r5 = r5.create()
            r5.show()
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0959oL.onActionItemClicked(android.view.ActionMode, android.view.MenuItem):boolean");
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getMenuInflater().inflate(2131558401, menu);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        Log.d("Back_=", "BACK#2");
        this.f3500a.f2337C.setBackgroundColor(Color.parseColor("#FFFFFF"));
        this.f3500a.f2345K.f868i.clear();
        this.f3500a.f2345K.mo967b();
    }

    public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
        int checkedItemCount = this.f3500a.f2337C.getCheckedItemCount();
        actionMode.invalidate();
        StringBuilder sb = new StringBuilder();
        sb.append(checkedItemCount);
        sb.append(" Selected");
        actionMode.setTitle(sb.toString());
        this.f3500a.f2345K.mo964a(i);
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        int checkedItemCount = this.f3500a.f2337C.getCheckedItemCount();
        menu.findItem(2131296543).setVisible(false);
        return false;
    }
}
