package p000;

import android.support.v7.app.AlertDialog;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2;

/* renamed from: HK */
class C0146HK implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f321a;

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f322b;

    /* renamed from: c */
    public final /* synthetic */ EditText f323c;

    /* renamed from: d */
    public final /* synthetic */ AlertDialog f324d;

    /* renamed from: e */
    public final /* synthetic */ Customer_Det_List_edit2 f325e;

    public C0146HK(Customer_Det_List_edit2 customer_Det_List_edit2, EditText editText, AutoCompleteTextView autoCompleteTextView, EditText editText2, AlertDialog alertDialog) {
        this.f325e = customer_Det_List_edit2;
        this.f321a = editText;
        this.f322b = autoCompleteTextView;
        this.f323c = editText2;
        this.f324d = alertDialog;
    }

    /* JADX WARNING: type inference failed for: r2v17, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r2v33, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r6v0, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r5v10, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v17, types: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2]
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
            android.widget.EditText r8 = r7.f321a
            boolean r8 = p000.C0008AO.m5a(r8)
            android.widget.AutoCompleteTextView r0 = r7.f322b
            boolean r0 = p000.C0008AO.m5a(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            r8 = 0
        L_0x0010:
            r0 = 1
            if (r8 == 0) goto L_0x0078
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r2 = r7.f325e
            JU r2 = r2.f2363b
            android.widget.AutoCompleteTextView r3 = r7.f322b
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            android.database.Cursor r2 = r2.mo629x(r3)
            int r2 = r2.getCount()
            if (r2 != 0) goto L_0x0078
            android.widget.AutoCompleteTextView r2 = r7.f322b
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0078
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r2 = r7.f325e
            android.widget.AutoCompleteTextView r3 = r7.f322b
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r2.f2390oa = r3
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r2 = r7.f325e
            r3 = 2131755420(0x7f10019c, float:1.9141719E38)
            java.lang.String r4 = r2.getString(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r6 = r7.f325e
            java.lang.String r3 = r6.getString(r3)
            r5.append(r3)
            java.lang.String r3 = "#"
            r5.append(r3)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r3 = r7.f325e
            java.lang.String r3 = r3.f2390oa
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r5 = r7.f325e
            r2.mo3712b(r4, r3, r5)
            goto L_0x0079
        L_0x0078:
            r1 = 1
        L_0x0079:
            if (r1 != 0) goto L_0x0084
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r1 = r7.f325e
            boolean r1 = r1.f2386ma
            if (r1 != 0) goto L_0x0084
            return
        L_0x0084:
            if (r8 == 0) goto L_0x01b6
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r8 = r7.f325e
            java.lang.String r1 = r8.f2367d
            if (r1 == 0) goto L_0x01b1
            JU r8 = r8.f2363b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "update customers set name='"
            r1.append(r2)
            android.widget.EditText r2 = r7.f323c
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "',gsm='"
            r1.append(r2)
            android.widget.EditText r2 = r7.f321a
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "',g_id=(select b.id from groups b where b.name='"
            r1.append(r2)
            android.widget.AutoCompleteTextView r2 = r7.f322b
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "') where id=(select b.id from customers b where b.name='"
            r1.append(r2)
            android.widget.EditText r2 = r7.f323c
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r2 = "')"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r8.mo562d(r1)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r8 = r7.f325e
            android.widget.EditText r1 = r7.f321a
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r8.f2375h = r1
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r8 = r7.f325e
            int r1 = r8.f2378ia
            if (r1 != r0) goto L_0x010c
            JU r8 = r8.f2363b
            android.widget.EditText r0 = r7.f321a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r8.mo541b(r0)
            goto L_0x01b1
        L_0x010c:
            r0 = 2
            if (r1 != r0) goto L_0x0134
            JU r8 = r8.f2363b
            android.widget.EditText r0 = r7.f321a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r1 = r7.f325e
            JU r2 = r1.f2363b
            android.widget.ListView r3 = r1.f2337C
            java.lang.String r4 = r1.f2367d
            OM r5 = r1.f2345K
            java.util.List<LL> r5 = r5.f863d
            double r5 = r1.mo3687a(r5)
            java.lang.String r1 = r2.mo531b(r3, r4, r5)
        L_0x012f:
            r8.mo634y(r0, r1)
            goto L_0x01b1
        L_0x0134:
            r0 = 3
            if (r1 != r0) goto L_0x015c
            JU r8 = r8.f2363b
            android.widget.EditText r0 = r7.f321a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r1 = r7.f325e
            JU r2 = r1.f2363b
            LL r1 = r1.mo3756w()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r3 = r7.f325e
            java.lang.String r4 = r3.f2367d
            OM r5 = r3.f2345K
            java.util.List<LL> r5 = r5.f863d
            double r5 = r3.mo3687a(r5)
            java.lang.String r1 = r2.mo498a(r1, r4, r5)
            goto L_0x012f
        L_0x015c:
            r0 = 4
            if (r1 != r0) goto L_0x0187
            JU r8 = r8.f2363b
            android.widget.EditText r0 = r7.f321a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r1 = r7.f325e
            JU r2 = r1.f2363b
            LL r1 = r1.mo3756w()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r3 = r7.f325e
            java.lang.String r4 = r3.f2367d
            OM r5 = r3.f2345K
            java.util.List<LL> r5 = r5.f863d
            double r5 = r3.mo3687a(r5)
            java.lang.String r1 = r2.mo498a(r1, r4, r5)
            r8.mo637z(r0, r1)
            goto L_0x01b1
        L_0x0187:
            JU r8 = r8.f2363b
            android.widget.EditText r0 = r7.f321a
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r2 = r7.f325e
            r3 = 2131755382(0x7f100176, float:1.9141642E38)
            java.lang.String r2 = r2.getString(r3)
            r1.append(r2)
            com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit2 r2 = r7.f325e
            java.lang.String r2 = r2.f2373g
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x012f
        L_0x01b1:
            android.support.v7.app.AlertDialog r8 = r7.f324d
            r8.dismiss()
        L_0x01b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0146HK.onClick(android.view.View):void");
    }
}
