package p000;

import android.support.v7.app.AlertDialog;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: KJ */
class C0206KJ implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f515a;

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f516b;

    /* renamed from: c */
    public final /* synthetic */ EditText f517c;

    /* renamed from: d */
    public final /* synthetic */ AlertDialog f518d;

    /* renamed from: e */
    public final /* synthetic */ Customer_Det_List_edit f519e;

    public C0206KJ(Customer_Det_List_edit customer_Det_List_edit, EditText editText, AutoCompleteTextView autoCompleteTextView, EditText editText2, AlertDialog alertDialog) {
        this.f519e = customer_Det_List_edit;
        this.f515a = editText;
        this.f516b = autoCompleteTextView;
        this.f517c = editText2;
        this.f518d = alertDialog;
    }

    /* JADX WARNING: type inference failed for: r2v17, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r2v34, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r6v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r5v10, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.content.Context] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v17, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit]
      uses: [android.app.Activity]
      mth insns count: 152
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
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
            r7 = this;
            android.widget.EditText r8 = r7.f515a
            boolean r8 = p000.C0008AO.m5a(r8)
            android.widget.AutoCompleteTextView r0 = r7.f516b
            boolean r0 = p000.C0008AO.m5a(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            r8 = 0
        L_0x0010:
            r0 = 1
            if (r8 == 0) goto L_0x007a
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r2 = r7.f519e
            JU r2 = r2.f2285b
            android.widget.AutoCompleteTextView r3 = r7.f516b
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            android.database.Cursor r2 = r2.mo629x(r3)
            int r2 = r2.getCount()
            if (r2 != 0) goto L_0x007a
            android.widget.AutoCompleteTextView r2 = r7.f516b
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r2.trim()
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x007a
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r2 = r7.f519e
            android.widget.AutoCompleteTextView r3 = r7.f516b
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r2.f2308ma = r3
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r2 = r7.f519e
            r3 = 2131755420(0x7f10019c, float:1.9141719E38)
            java.lang.String r4 = r2.getString(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r6 = r7.f519e
            java.lang.String r3 = r6.getString(r3)
            r5.append(r3)
            java.lang.String r3 = "#"
            r5.append(r3)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r3 = r7.f519e
            java.lang.String r3 = r3.f2308ma
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r5 = r7.f519e
            r2.mo3616b(r4, r3, r5)
            goto L_0x007b
        L_0x007a:
            r1 = 1
        L_0x007b:
            if (r1 != 0) goto L_0x0086
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r1 = r7.f519e
            boolean r1 = r1.f2304ka
            if (r1 != 0) goto L_0x0086
            return
        L_0x0086:
            if (r8 == 0) goto L_0x01b8
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r8 = r7.f519e
            java.lang.String r1 = r8.f2289d
            if (r1 == 0) goto L_0x01b3
            JU r8 = r8.f2285b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "update customers set name='"
            r1.append(r2)
            android.widget.EditText r2 = r7.f517c
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "',gsm='"
            r1.append(r2)
            android.widget.EditText r2 = r7.f515a
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "',g_id=(select b.id from groups b where b.name='"
            r1.append(r2)
            android.widget.AutoCompleteTextView r2 = r7.f516b
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "') where id=(select b.id from customers b where b.name='"
            r1.append(r2)
            android.widget.EditText r2 = r7.f517c
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "')"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r8.mo562d(r1)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r8 = r7.f519e
            android.widget.EditText r1 = r7.f515a
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r8.f2297h = r1
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r8 = r7.f519e
            int r1 = r8.f2296ga
            if (r1 != r0) goto L_0x010e
            JU r8 = r8.f2285b
            android.widget.EditText r0 = r7.f515a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r8.mo541b(r0)
            goto L_0x01b3
        L_0x010e:
            r0 = 2
            if (r1 != r0) goto L_0x0136
            JU r8 = r8.f2285b
            android.widget.EditText r0 = r7.f515a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r1 = r7.f519e
            JU r2 = r1.f2285b
            android.widget.ListView r3 = r1.f2259C
            java.lang.String r4 = r1.f2289d
            OM r5 = r1.f2267K
            java.util.List<LL> r5 = r5.f863d
            double r5 = r1.mo3592a(r5)
            java.lang.String r1 = r2.mo531b(r3, r4, r5)
        L_0x0131:
            r8.mo634y(r0, r1)
            goto L_0x01b3
        L_0x0136:
            r0 = 3
            if (r1 != r0) goto L_0x015e
            JU r8 = r8.f2285b
            android.widget.EditText r0 = r7.f515a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r1 = r7.f519e
            JU r2 = r1.f2285b
            LL r1 = r1.mo3656s()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r3 = r7.f519e
            java.lang.String r4 = r3.f2289d
            OM r5 = r3.f2267K
            java.util.List<LL> r5 = r5.f863d
            double r5 = r3.mo3592a(r5)
            java.lang.String r1 = r2.mo498a(r1, r4, r5)
            goto L_0x0131
        L_0x015e:
            r0 = 4
            if (r1 != r0) goto L_0x0189
            JU r8 = r8.f2285b
            android.widget.EditText r0 = r7.f515a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r1 = r7.f519e
            JU r2 = r1.f2285b
            LL r1 = r1.mo3656s()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r3 = r7.f519e
            java.lang.String r4 = r3.f2289d
            OM r5 = r3.f2267K
            java.util.List<LL> r5 = r5.f863d
            double r5 = r3.mo3592a(r5)
            java.lang.String r1 = r2.mo498a(r1, r4, r5)
            r8.mo637z(r0, r1)
            goto L_0x01b3
        L_0x0189:
            JU r8 = r8.f2285b
            android.widget.EditText r0 = r7.f515a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r2 = r7.f519e
            r3 = 2131755382(0x7f100176, float:1.9141642E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit r2 = r7.f519e
            java.lang.String r2 = r2.f2295g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x0131
        L_0x01b3:
            android.support.v7.app.AlertDialog r8 = r7.f518d
            r8.dismiss()
        L_0x01b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0206KJ.onClick(android.view.View):void");
    }
}
