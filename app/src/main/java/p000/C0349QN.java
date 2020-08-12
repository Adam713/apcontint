package p000;

import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp;
import java.util.List;

/* renamed from: QN */
class C0349QN implements LoaderCallbacks<List<String>> {

    /* renamed from: a */
    public final /* synthetic */ Report3_balance_month_exp f1016a;

    public C0349QN(Report3_balance_month_exp report3_balance_month_exp) {
        this.f1016a = report3_balance_month_exp;
    }

    /* JADX WARNING: type inference failed for: r7v7, types: [com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp, android.app.Activity] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v7, types: [com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp]
      uses: [android.app.Activity]
      mth insns count: 62
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
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLoadFinished(android.support.v4.content.Loader<List<String>> r6, List<String> r7) {
        /*
            r5 = this;
            com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp r6 = r5.f1016a
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r6.f2614K = r7
            java.lang.String r6 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.m2279h()
            java.lang.String r7 = "trace_E_Loader2_h="
            android.util.Log.d(r7, r6)
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.text.NumberFormat r6 = java.text.NumberFormat.getInstance(r6)
            com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp r7 = r5.f1016a     // Catch:{ Exception -> 0x00a4 }
            java.util.ArrayList<java.lang.String> r7 = r7.f2614K     // Catch:{ Exception -> 0x00a4 }
            int r7 = r7.size()     // Catch:{ Exception -> 0x00a4 }
            if (r7 <= 0) goto L_0x0094
            com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp r7 = r5.f1016a     // Catch:{ Exception -> 0x00a4 }
            java.util.ArrayList<java.lang.String> r7 = r7.f2614K     // Catch:{ Exception -> 0x00a4 }
            r0 = 0
            java.lang.Object r7 = r7.get(r0)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x00a4 }
            double r1 = java.lang.Double.parseDouble(r7)     // Catch:{ Exception -> 0x00a4 }
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L_0x006a
            com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp r7 = r5.f1016a     // Catch:{ Exception -> 0x00a4 }
            android.widget.TextView r7 = r7.f2629n     // Catch:{ Exception -> 0x00a4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a4 }
            r1.<init>()     // Catch:{ Exception -> 0x00a4 }
            com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp r2 = r5.f1016a     // Catch:{ Exception -> 0x00a4 }
            JU r2 = r2.f2617b     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r2 = r2.mo455E()     // Catch:{ Exception -> 0x00a4 }
            r1.append(r2)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r2 = ":-"
            r1.append(r2)     // Catch:{ Exception -> 0x00a4 }
            com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp r2 = r5.f1016a     // Catch:{ Exception -> 0x00a4 }
            java.util.ArrayList<java.lang.String> r2 = r2.f2614K     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00a4 }
            double r2 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r6 = r6.format(r2)     // Catch:{ Exception -> 0x00a4 }
            r1.append(r6)     // Catch:{ Exception -> 0x00a4 }
        L_0x0062:
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x00a4 }
            r7.setText(r6)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00a4
        L_0x006a:
            com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp r7 = r5.f1016a     // Catch:{ Exception -> 0x00a4 }
            android.widget.TextView r7 = r7.f2629n     // Catch:{ Exception -> 0x00a4 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a4 }
            r1.<init>()     // Catch:{ Exception -> 0x00a4 }
            com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp r2 = r5.f1016a     // Catch:{ Exception -> 0x00a4 }
            JU r2 = r2.f2617b     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r2 = r2.mo597m()     // Catch:{ Exception -> 0x00a4 }
            r1.append(r2)     // Catch:{ Exception -> 0x00a4 }
            com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp r2 = r5.f1016a     // Catch:{ Exception -> 0x00a4 }
            java.util.ArrayList<java.lang.String> r2 = r2.f2614K     // Catch:{ Exception -> 0x00a4 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00a4 }
            double r2 = java.lang.Double.parseDouble(r0)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r6 = r6.format(r2)     // Catch:{ Exception -> 0x00a4 }
            r1.append(r6)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x0062
        L_0x0094:
            com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp r6 = r5.f1016a     // Catch:{ Exception -> 0x00a4 }
            android.widget.TextView r6 = r6.f2629n     // Catch:{ Exception -> 0x00a4 }
            com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp r7 = r5.f1016a     // Catch:{ Exception -> 0x00a4 }
            r0 = 2131755188(0x7f1000b4, float:1.9141248E38)
            java.lang.String r7 = r7.getString(r0)     // Catch:{ Exception -> 0x00a4 }
            r6.setText(r7)     // Catch:{ Exception -> 0x00a4 }
        L_0x00a4:
            java.lang.String r6 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.m2279h()
            java.lang.String r7 = "trace_E_Loader2_g="
            android.util.Log.d(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0349QN.onLoadFinished(android.support.v4.content.Loader, java.util.List):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp]
      assigns: [com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp]
      uses: [com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp, android.content.Context]
      mth insns count: 12
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
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.support.v4.content.Loader<List<String>> onCreateLoader(int r7, android.os.Bundle r8) {
        /*
            r6 = this;
            java.lang.String r7 = "Loader="
            java.lang.String r8 = "onCreateLoader_Footer:"
            android.util.Log.d(r7, r8)
            java.lang.String r7 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.m2279h()
            java.lang.String r8 = "trace_S_Loader2_g="
            android.util.Log.d(r8, r7)
            AR r7 = new AR
            com.valdio.valdioveliu.recyclerview.Report3_balance_month_exp r1 = r6.f1016a
            JU r4 = r1.f2617b
            java.lang.String r2 = ""
            java.lang.String r3 = ""
            r5 = 1
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0349QN.onCreateLoader(int, android.os.Bundle):android.support.v4.content.Loader");
    }

    public void onLoaderReset(Loader<List<String>> loader) {
    }
}
