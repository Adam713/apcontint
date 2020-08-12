package p000;

import android.app.AlertDialog;
import android.view.View.OnClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.valdio.valdioveliu.recyclerview.CustomerList;

/* renamed from: RH */
class C0363RH implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f1068a;

    /* renamed from: b */
    public final /* synthetic */ AutoCompleteTextView f1069b;

    /* renamed from: c */
    public final /* synthetic */ String f1070c;

    /* renamed from: d */
    public final /* synthetic */ EditText f1071d;

    /* renamed from: e */
    public final /* synthetic */ AlertDialog f1072e;

    /* renamed from: f */
    public final /* synthetic */ CustomerList f1073f;

    public C0363RH(CustomerList customerList, EditText editText, AutoCompleteTextView autoCompleteTextView, String str, EditText editText2, AlertDialog alertDialog) {
        this.f1073f = customerList;
        this.f1068a = editText;
        this.f1069b = autoCompleteTextView;
        this.f1070c = str;
        this.f1071d = editText2;
        this.f1072e = alertDialog;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r6v0, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.CustomerList] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v11, types: [com.valdio.valdioveliu.recyclerview.CustomerList, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.CustomerList]
      uses: [android.app.Activity, com.valdio.valdioveliu.recyclerview.CustomerList]
      mth insns count: 76
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
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r8) {
        /*
            r7 = this;
            android.widget.EditText r8 = r7.f1068a
            boolean r8 = p000.C0008AO.m5a(r8)
            android.widget.AutoCompleteTextView r0 = r7.f1069b
            boolean r0 = p000.C0008AO.m5a(r0)
            r1 = 0
            if (r0 != 0) goto L_0x0010
            r8 = 0
        L_0x0010:
            com.valdio.valdioveliu.recyclerview.CustomerList r0 = r7.f1073f
            JU r0 = r0.f2089c
            android.widget.AutoCompleteTextView r2 = r7.f1069b
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            android.database.Cursor r0 = r0.mo629x(r2)
            int r0 = r0.getCount()
            r2 = 1
            if (r0 != 0) goto L_0x005f
            com.valdio.valdioveliu.recyclerview.CustomerList r0 = r7.f1073f
            android.widget.AutoCompleteTextView r3 = r7.f1069b
            android.text.Editable r3 = r3.getText()
            java.lang.String r3 = r3.toString()
            r0.f2084F = r3
            com.valdio.valdioveliu.recyclerview.CustomerList r0 = r7.f1073f
            r3 = 2131755420(0x7f10019c, float:1.9141719E38)
            java.lang.String r4 = r0.getString(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            com.valdio.valdioveliu.recyclerview.CustomerList r6 = r7.f1073f
            java.lang.String r3 = r6.getString(r3)
            r5.append(r3)
            com.valdio.valdioveliu.recyclerview.CustomerList r3 = r7.f1073f
            java.lang.String r3 = r3.f2084F
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.valdio.valdioveliu.recyclerview.CustomerList r5 = r7.f1073f
            r0.mo3374a(r4, r3, r5)
            goto L_0x0060
        L_0x005f:
            r1 = 1
        L_0x0060:
            if (r1 != 0) goto L_0x006b
            com.valdio.valdioveliu.recyclerview.CustomerList r0 = r7.f1073f
            boolean r0 = r0.f2083E
            if (r0 != 0) goto L_0x006b
            return
        L_0x006b:
            if (r8 == 0) goto L_0x00d2
            java.lang.String r8 = r7.f1070c
            if (r8 == 0) goto L_0x00cd
            com.valdio.valdioveliu.recyclerview.CustomerList r8 = r7.f1073f
            JU r8 = r8.f2089c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "update customers set name='"
            r0.append(r1)
            android.widget.EditText r1 = r7.f1071d
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "',gsm='"
            r0.append(r1)
            android.widget.EditText r1 = r7.f1068a
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "',g_id=(select b.id from groups b where b.name='"
            r0.append(r1)
            android.widget.AutoCompleteTextView r1 = r7.f1069b
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "') where id='"
            r0.append(r1)
            com.valdio.valdioveliu.recyclerview.CustomerList r1 = r7.f1073f
            int r1 = r1.f2093g
            r0.append(r1)
            java.lang.String r1 = "'"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.mo562d(r0)
            com.valdio.valdioveliu.recyclerview.CustomerList r8 = r7.f1073f
            r8.mo3381c(r2)
        L_0x00cd:
            android.app.AlertDialog r8 = r7.f1072e
            r8.dismiss()
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0363RH.onClick(android.view.View):void");
    }
}
