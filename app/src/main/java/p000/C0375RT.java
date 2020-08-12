package p000;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.AutoCompleteTextView;
import com.valdio.valdioveliu.recyclerview.frag.GroupList_edit;

/* renamed from: RT */
class C0375RT implements OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f1087a;

    /* renamed from: b */
    public final /* synthetic */ GroupList_edit f1088b;

    public C0375RT(GroupList_edit groupList_edit, AutoCompleteTextView autoCompleteTextView) {
        this.f1088b = groupList_edit;
        this.f1087a = autoCompleteTextView;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        this.f1087a.showDropDown();
        return false;
    }
}
