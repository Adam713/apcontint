package p000;

/* renamed from: GV */
public class C0135GV {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r0.empty() != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (((p000.C0289NV) r0.peek()).mo936a() != 4) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        throw new java.lang.IllegalArgumentException("Misplaced function separator ',' or mismatched parentheses");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (((p000.C0289NV) r0.peek()).mo936a() == 4) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        r1.add(r0.pop());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        r0.pop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (r0.isEmpty() != false) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (((p000.C0289NV) r0.peek()).mo936a() != 3) goto L_0x000f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
        r5 = r0.pop();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0100, code lost:
        r1.add(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x000f, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x000f, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x000f, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.C0289NV[] m253a(String r5, java.util.Map<String, p000.C0584_U> r6, java.util.Map<String, p000.C1146wV> r7, java.util.Set<String> r8) {
        /*
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            OV r2 = new OV
            r2.<init>(r5, r6, r7, r8)
        L_0x000f:
            boolean r5 = r2.mo990a()
            r6 = 4
            if (r5 == 0) goto L_0x0105
            NV r5 = r2.mo992b()
            int r7 = r5.mo936a()
            switch(r7) {
                case 1: goto L_0x0100;
                case 2: goto L_0x0098;
                case 3: goto L_0x0093;
                case 4: goto L_0x008e;
                case 5: goto L_0x005e;
                case 6: goto L_0x0100;
                case 7: goto L_0x0029;
                default: goto L_0x0021;
            }
        L_0x0021:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Unknown Token type encountered. This should not happen"
            r5.<init>(r6)
            throw r5
        L_0x0029:
            boolean r5 = r0.empty()
            if (r5 != 0) goto L_0x0043
            java.lang.Object r5 = r0.peek()
            NV r5 = (p000.C0289NV) r5
            int r5 = r5.mo936a()
            if (r5 == r6) goto L_0x0043
            java.lang.Object r5 = r0.pop()
            r1.add(r5)
            goto L_0x0029
        L_0x0043:
            boolean r5 = r0.empty()
            if (r5 != 0) goto L_0x0056
            java.lang.Object r5 = r0.peek()
            NV r5 = (p000.C0289NV) r5
            int r5 = r5.mo936a()
            if (r5 != r6) goto L_0x0056
            goto L_0x000f
        L_0x0056:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Misplaced function separator ',' or mismatched parentheses"
            r5.<init>(r6)
            throw r5
        L_0x005e:
            java.lang.Object r5 = r0.peek()
            NV r5 = (p000.C0289NV) r5
            int r5 = r5.mo936a()
            if (r5 == r6) goto L_0x0072
            java.lang.Object r5 = r0.pop()
            r1.add(r5)
            goto L_0x005e
        L_0x0072:
            r0.pop()
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x000f
            java.lang.Object r5 = r0.peek()
            NV r5 = (p000.C0289NV) r5
            int r5 = r5.mo936a()
            r6 = 3
            if (r5 != r6) goto L_0x000f
            java.lang.Object r5 = r0.pop()
            goto L_0x0100
        L_0x008e:
            r0.push(r5)
            goto L_0x000f
        L_0x0093:
            r0.add(r5)
            goto L_0x000f
        L_0x0098:
            boolean r6 = r0.empty()
            if (r6 != 0) goto L_0x008e
            java.lang.Object r6 = r0.peek()
            NV r6 = (p000.C0289NV) r6
            int r6 = r6.mo936a()
            r7 = 2
            if (r6 != r7) goto L_0x008e
            r6 = r5
            MV r6 = (p000.C0269MV) r6
            java.lang.Object r8 = r0.peek()
            MV r8 = (p000.C0269MV) r8
            wV r3 = r6.mo900b()
            int r3 = r3.mo5364a()
            r4 = 1
            if (r3 != r4) goto L_0x00ca
            wV r3 = r8.mo900b()
            int r3 = r3.mo5364a()
            if (r3 != r7) goto L_0x00ca
            goto L_0x008e
        L_0x00ca:
            wV r7 = r6.mo900b()
            boolean r7 = r7.mo5366c()
            if (r7 == 0) goto L_0x00e6
            wV r7 = r6.mo900b()
            int r7 = r7.mo5365b()
            wV r3 = r8.mo900b()
            int r3 = r3.mo5365b()
            if (r7 <= r3) goto L_0x00f8
        L_0x00e6:
            wV r6 = r6.mo900b()
            int r6 = r6.mo5365b()
            wV r7 = r8.mo900b()
            int r7 = r7.mo5365b()
            if (r6 >= r7) goto L_0x008e
        L_0x00f8:
            java.lang.Object r6 = r0.pop()
            r1.add(r6)
            goto L_0x0098
        L_0x0100:
            r1.add(r5)
            goto L_0x000f
        L_0x0105:
            boolean r5 = r0.empty()
            if (r5 != 0) goto L_0x012a
            java.lang.Object r5 = r0.pop()
            NV r5 = (p000.C0289NV) r5
            int r7 = r5.mo936a()
            r8 = 5
            if (r7 == r8) goto L_0x0122
            int r7 = r5.mo936a()
            if (r7 == r6) goto L_0x0122
            r1.add(r5)
            goto L_0x0105
        L_0x0122:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Mismatched parentheses detected. Please check the expression"
            r5.<init>(r6)
            throw r5
        L_0x012a:
            int r5 = r1.size()
            NV[] r5 = new p000.C0289NV[r5]
            java.lang.Object[] r5 = r1.toArray(r5)
            NV[] r5 = (p000.C0289NV[]) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0135GV.m253a(java.lang.String, java.util.Map, java.util.Map, java.util.Set):NV[]");
    }
}
