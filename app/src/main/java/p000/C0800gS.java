package p000;

import android.graphics.Color;
import android.support.v7.app.AlertDialog.Builder;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.AbsListView.MultiChoiceModeListener;

/* renamed from: gS */
class C0800gS implements MultiChoiceModeListener {

    /* renamed from: a */
    public final /* synthetic */ C0925mS f3022a;

    public C0800gS(C0925mS mSVar) {
        this.f3022a = mSVar;
    }

    public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case 2131296542:
                SparseBooleanArray b = this.f3022a.f3383n.mo1183b();
                C0925mS mSVar = this.f3022a;
                mSVar.f3386q = b;
                Builder builder = new Builder(mSVar.getActivity());
                builder.setMessage(this.f3022a.getActivity().getString(2131755167));
                builder.setPositiveButton(this.f3022a.getActivity().getString(2131755137), new C0758eS(this));
                builder.setNegativeButton(this.f3022a.getActivity().getString(2131755136), new C0781fS(this));
                builder.create().show();
                break;
            case 2131296543:
                SparseBooleanArray b2 = this.f3022a.f3383n.mo1183b();
                C0925mS mSVar2 = this.f3022a;
                mSVar2.f3386q = b2;
                mSVar2.mo4742d();
                break;
            case 2131296544:
                SparseBooleanArray b3 = this.f3022a.f3383n.mo1183b();
                C0925mS mSVar3 = this.f3022a;
                mSVar3.f3386q = b3;
                mSVar3.mo4746h();
                break;
            case 2131296545:
                SparseBooleanArray b4 = this.f3022a.f3383n.mo1183b();
                C0925mS mSVar4 = this.f3022a;
                mSVar4.f3386q = b4;
                mSVar4.mo4745g();
                break;
            default:
                return false;
        }
        actionMode.finish();
        return false;
    }

    public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        MenuInflater menuInflater;
        int i;
        if (!C0195JU.f451k) {
            menuInflater = actionMode.getMenuInflater();
            i = 2131558405;
        } else {
            menuInflater = actionMode.getMenuInflater();
            i = 2131558406;
        }
        menuInflater.inflate(i, menu);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionMode) {
        this.f3022a.f3381l.setBackgroundColor(Color.parseColor("#FFFFFF"));
        this.f3022a.f3383n.f1138i.clear();
        this.f3022a.f3383n.mo1184c();
    }

    public void onItemCheckedStateChanged(ActionMode actionMode, int i, long j, boolean z) {
        int checkedItemCount = this.f3022a.f3381l.getCheckedItemCount();
        actionMode.invalidate();
        StringBuilder sb = new StringBuilder();
        sb.append(checkedItemCount);
        sb.append(" Selected");
        actionMode.setTitle(sb.toString());
        this.f3022a.f3383n.mo1180a(i);
    }

    public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (this.f3022a.f3381l.getCheckedItemCount() != 1) {
            menu.findItem(2131296543).setVisible(false);
            if (C0195JU.f451k) {
                menu.findItem(2131296545).setVisible(false);
            }
        } else {
            menu.findItem(2131296542).setVisible(true);
            menu.findItem(2131296543).setVisible(true);
            if (C0195JU.f451k) {
                menu.findItem(2131296545).setVisible(true);
            }
        }
        return false;
    }
}
