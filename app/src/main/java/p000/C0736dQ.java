package p000;

import android.graphics.Color;
import android.support.v7.app.AlertDialog.Builder;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AbsListView.MultiChoiceModeListener;

/* renamed from: dQ */
class C0736dQ implements MultiChoiceModeListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f2862a;

    public C0736dQ(C0523YQ yq) {
        this.f2862a = yq;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 2131296542:
                SparseBooleanArray a = this.f2862a.f1524N.mo963a();
                C0523YQ yq = this.f2862a;
                yq.f1528P = a;
                Builder builder = new Builder(yq.getActivity());
                builder.setMessage(this.f2862a.getActivity().getString(2131755166));
                builder.setPositiveButton(this.f2862a.getActivity().getString(2131755137), new C0393SP(this));
                builder.setNegativeButton(this.f2862a.getActivity().getString(2131755136), new C0413TP(this));
                builder.create().show();
                break;
            case 2131296543:
                SparseBooleanArray a2 = this.f2862a.f1524N.mo963a();
                C0523YQ yq2 = this.f2862a;
                yq2.f1528P = a2;
                yq2.mo1623y();
                break;
            case 2131296546:
                SparseBooleanArray a3 = this.f2862a.f1524N.mo963a();
                C0523YQ yq3 = this.f2862a;
                yq3.f1528P = a3;
                yq3.mo1530L();
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
        this.f2862a.f1526O.setBackgroundColor(Color.parseColor("#FFFFFF"));
        this.f2862a.f1524N.f868i.clear();
        this.f2862a.f1524N.mo967b();
    }

    public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
        int checkedItemCount = this.f2862a.f1526O.getCheckedItemCount();
        actionMode.invalidate();
        StringBuilder sb = new StringBuilder();
        sb.append(checkedItemCount);
        sb.append(" Selected");
        actionMode.setTitle(sb.toString());
        this.f2862a.f1524N.mo964a(i);
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (this.f2862a.f1526O.getCheckedItemCount() != 1) {
            menu.findItem(2131296543).setVisible(false);
        } else {
            menu.findItem(2131296543).setVisible(true);
        }
        return false;
    }
}
