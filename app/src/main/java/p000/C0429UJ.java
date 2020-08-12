package p000;

import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: UJ */
class C0429UJ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ AutoCompleteTextView f1211a;

    /* renamed from: b */
    public final /* synthetic */ AlertDialog f1212b;

    /* renamed from: c */
    public final /* synthetic */ String f1213c;

    /* renamed from: d */
    public final /* synthetic */ EditText f1214d;

    /* renamed from: e */
    public final /* synthetic */ EditText f1215e;

    /* renamed from: f */
    public final /* synthetic */ Handler f1216f;

    /* renamed from: g */
    public final /* synthetic */ Customer_Det_List_edit f1217g;

    public C0429UJ(Customer_Det_List_edit customer_Det_List_edit, AutoCompleteTextView autoCompleteTextView, AlertDialog alertDialog, String str, EditText editText, EditText editText2, Handler handler) {
        this.f1217g = customer_Det_List_edit;
        this.f1211a = autoCompleteTextView;
        this.f1212b = alertDialog;
        this.f1213c = str;
        this.f1214d = editText;
        this.f1215e = editText2;
        this.f1216f = handler;
    }

    /* JADX WARNING: type inference failed for: r2v16, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r6v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v16, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit]
      uses: [android.app.Activity, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit]
      mth insns count: 96
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
            r7 = this;
            android.widget.AutoCompleteTextView r8 = r7.f1211a
            boolean r8 = p000.C0008AO.m5a(r8)
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L_0x0076
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r2 = r7.f1217g
            JU r2 = r2.f2285b
            android.widget.AutoCompleteTextView r3 = r7.f1211a
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            android.database.Cursor r2 = r2.mo629x(r3)
            int r2 = r2.getCount()
            if (r2 != 0) goto L_0x0076
            android.widget.AutoCompleteTextView r2 = r7.f1211a
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0076
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r2 = r7.f1217g
            android.widget.AutoCompleteTextView r3 = r7.f1211a
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r2.f2308ma = r3
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r2 = r7.f1217g
            r3 = 2131755420(0x7f10019c, float:1.9141719E38)
            java.lang.String r4 = r2.getString(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r6 = r7.f1217g
            java.lang.String r3 = r6.getString(r3)
            r5.append(r3)
            java.lang.String r3 = "#"
            r5.append(r3)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r3 = r7.f1217g
            java.lang.String r3 = r3.f2308ma
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.support.v7.app.AlertDialog r5 = r7.f1212b
            android.content.Context r5 = r5.getContext()
            r2.mo3616b(r4, r3, r5)
            r2 = 0
            goto L_0x0077
        L_0x0076:
            r2 = 1
        L_0x0077:
            if (r2 != 0) goto L_0x0082
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r2 = r7.f1217g
            boolean r2 = r2.f2306la
            if (r2 != 0) goto L_0x0082
            return
        L_0x0082:
            if (r8 == 0) goto L_0x0112
            java.lang.String r8 = r7.f1213c
            if (r8 == 0) goto L_0x010d
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r8 = r7.f1217g
            JU r8 = r8.f2285b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "insert into customers (name,gsm,g_id) values('"
            r2.append(r3)
            android.widget.EditText r3 = r7.f1214d
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r3 = "','"
            r2.append(r3)
            android.widget.EditText r3 = r7.f1215e
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r3 = "',(select b.id from groups b where b.name='"
            r2.append(r3)
            android.widget.AutoCompleteTextView r3 = r7.f1211a
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r3 = "') )"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r8.mo562d(r2)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r8 = r7.f1217g
            r8.f2298ha = r0
            r8.f2304ka = r1
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r8 = r7.f1217g
            android.widget.EditText r0 = r7.f1214d
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r8.f2289d = r0
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r8 = r7.f1217g
            android.widget.EditText r0 = r7.f1215e
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r8.f2297h = r0
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r8 = r7.f1217g
            android.widget.AutoCompleteTextView r0 = r7.f1211a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r8.f2291e = r0
            android.os.Handler r8 = r7.f1216f
            android.os.Message r0 = r8.obtainMessage()
            r8.sendMessage(r0)
        L_0x010d:
            android.support.v7.app.AlertDialog r8 = r7.f1212b
            r8.dismiss()
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0429UJ.onClick(android.view.View):void");
    }
}
