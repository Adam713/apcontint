package p000;

import android.app.AlertDialog.Builder;
import android.graphics.Color;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView.MultiChoiceModeListener;

/* renamed from: QO */
class C0350QO implements MultiChoiceModeListener {

    /* renamed from: a */
    public final /* synthetic */ C1134wP f1017a;

    public C0350QO(C1134wP wPVar) {
        this.f1017a = wPVar;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 2131296542:
                SparseBooleanArray a = this.f1017a.f3935B.mo963a();
                C1134wP wPVar = this.f1017a;
                wPVar.f3937D = a;
                Builder builder = new Builder(wPVar.getActivity());
                builder.setMessage(this.f1017a.getString(2131755166));
                builder.setPositiveButton(this.f1017a.getString(2131755137), new C0089EO(this));
                builder.setNegativeButton(this.f1017a.getString(2131755136), new C0108FO(this));
                builder.create().show();
                break;
            case 2131296543:
                SparseBooleanArray a2 = this.f1017a.f3935B.mo963a();
                C1134wP wPVar2 = this.f1017a;
                wPVar2.f3937D = a2;
                wPVar2.mo5322k();
                break;
            default:
                return false;
        }
        actionMode.finish();
        return false;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getMenuInflater().inflate(2131558401, menu);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        Log.d("Back_=", "BACK#2");
        this.f1017a.f3936C.setBackgroundColor(Color.parseColor("#FFFFFF"));
        this.f1017a.f3935B.f868i.clear();
        this.f1017a.f3935B.mo967b();
    }

    public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
        int checkedItemCount = this.f1017a.f3936C.getCheckedItemCount();
        actionMode.invalidate();
        StringBuilder sb = new StringBuilder();
        sb.append(checkedItemCount);
        sb.append(" Selected");
        actionMode.setTitle(sb.toString());
        this.f1017a.f3935B.mo964a(i);
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (this.f1017a.f3936C.getCheckedItemCount() != 1) {
            menu.findItem(2131296543).setVisible(false);
        }
        return false;
    }
}
