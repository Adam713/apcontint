package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.frag.GroupList_edit;

/* renamed from: WT */
class C0485WT implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f1386a;

    /* renamed from: b */
    public final /* synthetic */ GroupList_edit f1387b;

    public C0485WT(GroupList_edit groupList_edit, AutoCompleteTextView autoCompleteTextView) {
        this.f1387b = groupList_edit;
        this.f1386a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f1386a.showDropDown();
        return false;
    }
}
