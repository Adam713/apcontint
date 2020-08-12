package p000;

import android.app.AlertDialog.Builder;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView.MultiChoiceModeListener;

/* renamed from: zS */
class C1204zS implements MultiChoiceModeListener {

    /* renamed from: a */
    public final /* synthetic */ C0239LS f4208a;

    public C1204zS(C0239LS ls) {
        this.f4208a = ls;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 2131296542:
                SparseBooleanArray a = this.f4208a.f670x.mo1083a();
                C0239LS ls = this.f4208a;
                ls.f672z = a;
                Builder builder = new Builder(ls.getActivity());
                builder.setMessage(this.f4208a.getString(2131755166));
                builder.setPositiveButton(this.f4208a.getString(2131755137), new C0947nS(this));
                builder.setNegativeButton(this.f4208a.getString(2131755136), new C0966oS(this));
                builder.create().show();
                break;
            case 2131296543:
                SparseBooleanArray a2 = this.f4208a.f670x.mo1083a();
                C0239LS ls2 = this.f4208a;
                ls2.f672z = a2;
                ls2.mo803f();
                break;
            default:
                return false;
        }
        actionMode.finish();
        return false;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getMenuInflater().inflate(2131558403, menu);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.f4208a.f670x.f1008i.clear();
        this.f4208a.f670x.mo1087b();
    }

    public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
        int checkedItemCount = this.f4208a.f668v.getCheckedItemCount();
        actionMode.invalidate();
        StringBuilder sb = new StringBuilder();
        sb.append(checkedItemCount);
        sb.append(" Selected");
        actionMode.setTitle(sb.toString());
        this.f4208a.f670x.mo1084a(i);
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (this.f4208a.f668v.getCheckedItemCount() != 1) {
            menu.findItem(2131296543).setVisible(false);
        } else {
            menu.findItem(2131296542).setVisible(true);
            menu.findItem(2131296543).setVisible(true);
        }
        return false;
    }
}
