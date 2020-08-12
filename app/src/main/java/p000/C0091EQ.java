package p000;

import android.support.v7.widget.SearchView.OnQueryTextListener;
import android.text.TextUtils;

/* renamed from: EQ */
class C0091EQ implements OnQueryTextListener {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f219a;

    public C0091EQ(C0523YQ yq) {
        this.f219a = yq;
    }

    public boolean onQueryTextChange(String str) {
        if (TextUtils.isEmpty(str)) {
            try {
                if (this.f219a.f1558cb.size() > 0) {
                    this.f219a.mo1553b(1);
                }
            } catch (Exception unused) {
            }
        }
        this.f219a.mo1563c(str);
        if (!TextUtils.isEmpty(str)) {
            this.f219a.mo1553b(2);
        }
        return false;
    }

    public boolean onQueryTextSubmit(String str) {
        try {
            this.f219a.mo1553b(2);
        } catch (Exception unused) {
        }
        return false;
    }
}
