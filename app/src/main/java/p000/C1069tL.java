package p000;

import android.text.Editable;
import android.text.TextWatcher;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: tL */
class C1069tL implements TextWatcher {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_edit2 f3777a;

    public C1069tL(Customer_Det_List_edit2 customer_Det_List_edit2) {
        this.f3777a = customer_Det_List_edit2;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v4, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2]
      assigns: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2]
      uses: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.content.Context]
      mth insns count: 17
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
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(CharSequence r2, int r3, int r4, int r5) {
        /*
            r1 = this;
            int r2 = r2.length()
            r3 = 2
            r4 = 0
            if (r2 <= 0) goto L_0x0021
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r2 = r1.f3777a
            android.widget.AutoCompleteTextView r5 = r2.f2389o
            r0 = 17301594(0x108005a, float:2.4979507E-38)
            android.graphics.drawable.Drawable r2 = android.support.v4.content.ContextCompat.getDrawable(r2, r0)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r0 = r1.f3777a
            android.widget.AutoCompleteTextView r0 = r0.f2389o
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawables()
            r3 = r0[r3]
            r5.setCompoundDrawablesWithIntrinsicBounds(r2, r4, r3, r4)
            goto L_0x002e
        L_0x0021:
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r2 = r1.f3777a
            android.widget.AutoCompleteTextView r2 = r2.f2389o
            android.graphics.drawable.Drawable[] r5 = r2.getCompoundDrawables()
            r3 = r5[r3]
            r2.setCompoundDrawablesWithIntrinsicBounds(r4, r4, r3, r4)
        L_0x002e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1069tL.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
