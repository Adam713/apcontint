package p000;

import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport;

/* renamed from: dM */
class C0732dM implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ FragmentStatePagerSupport f2852a;

    public C0732dM(FragmentStatePagerSupport fragmentStatePagerSupport) {
        this.f2852a = fragmentStatePagerSupport;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport, android.app.Activity] */
    /* JADX WARNING: type inference failed for: r2v4, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport] */
    /* JADX WARNING: type inference failed for: r2v5, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport] */
    /* JADX WARNING: type inference failed for: r2v6, types: [android.app.Activity] */
    /* JADX WARNING: type inference failed for: r2v13, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport] */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1, types: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport, android.app.Activity]
      assigns: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport]
      uses: [com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport, android.app.Activity]
      mth insns count: 45
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
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            int r0 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport.f2424j
            if (r0 == 0) goto L_0x000b
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport r1 = r5.f2852a
            android.support.v4.view.ViewPager r1 = r1.f2435n
            r1.setCurrentItem(r0)
        L_0x000b:
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport r0 = r5.f2852a
            int r1 = r0.f2430D
            if (r1 != 0) goto L_0x0023
            java.util.ArrayList<EH> r1 = r0.f2439r
            int r2 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport.f2424j
            java.lang.Object r1 = r1.get(r2)
            EH r1 = (p000.C0082EH) r1
            java.lang.String r1 = r1.mo192g()
        L_0x001f:
            r0.setTitle(r1)
            goto L_0x007b
        L_0x0023:
            r2 = 1
            java.lang.String r3 = "#"
            if (r1 != r2) goto L_0x0054
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport r2 = r5.f2852a
            r4 = 2131755060(0x7f100034, float:1.9140989E38)
        L_0x0032:
            java.lang.String r2 = r2.getString(r4)
            r1.append(r2)
            r1.append(r3)
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport r2 = r5.f2852a
            java.util.ArrayList<MM> r2 = r2.f2440s
            int r3 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport.f2424j
            java.lang.Object r2 = r2.get(r3)
            MM r2 = (p000.C0260MM) r2
            java.lang.String r2 = r2.mo890c()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x001f
        L_0x0054:
            r2 = 2
            if (r1 != r2) goto L_0x0062
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport r2 = r5.f2852a
            r4 = 2131755061(0x7f100035, float:1.914099E38)
            goto L_0x0032
        L_0x0062:
            r2 = 3
            if (r1 != r2) goto L_0x0070
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport r2 = r5.f2852a
            r4 = 2131755059(0x7f100033, float:1.9140987E38)
            goto L_0x0032
        L_0x0070:
            r2 = 5
            if (r1 != r2) goto L_0x007b
            r1 = 2131755056(0x7f100030, float:1.914098E38)
            java.lang.String r1 = r0.getString(r1)
            goto L_0x001f
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0732dM.run():void");
    }
}
