package p000;

/* renamed from: iZ */
public final class C0849iZ {

    /* renamed from: a */
    public int f3111a;

    /* renamed from: b */
    public int f3112b;

    /* renamed from: c */
    public C0420TW[][] f3113c;

    public C0849iZ() {
        this(-1, -1, new C0420TW[30][]);
    }

    public C0849iZ(int i, int i2, C0420TW[][] twArr) {
        this.f3111a = -1;
        this.f3112b = -1;
        this.f3111a = i;
        this.f3112b = i2;
        this.f3113c = twArr;
    }

    /* renamed from: a */
    public static int m2832a(C0420TW[] twArr) {
        int i = 0;
        if (twArr == null) {
            return 0;
        }
        int i2 = 0;
        while (i < twArr.length) {
            C0953nY nYVar = (C0953nY) twArr[i];
            if (nYVar != null) {
                int a = m2833a(twArr, i);
                if (a > 1) {
                    i2 += (a * 2) + 10;
                    i += a - 1;
                } else {
                    i2 += nYVar.mo163c();
                }
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m2833a(C0420TW[] twArr, int i) {
        int i2 = i;
        while (i2 < twArr.length && (twArr[i2] instanceof C0136GW)) {
            i2++;
        }
        return i2 - i;
    }

    /* renamed from: a */
    public int mo4521a(int i, int i2) {
        int i3 = 0;
        while (i <= i2) {
            C0420TW[][] twArr = this.f3113c;
            if (i >= twArr.length) {
                break;
            }
            i3 += m2832a(twArr[i]);
            i++;
        }
        return i3;
    }

    /* renamed from: a */
    public final C0401SX mo4522a(C0420TW[] twArr, int i, int i2) {
        short[] sArr = new short[i2];
        for (int i3 = 0; i3 < sArr.length; i3++) {
            sArr[i3] = twArr[i + i3].mo277a();
        }
        return new C0401SX(twArr[i].getRow(), i, sArr);
    }

    /* renamed from: a */
    public void mo4523a(int i) {
        if (i < 0 || i > 65535) {
            StringBuilder sb = new StringBuilder();
            sb.append("Specified rowIndex ");
            sb.append(i);
            sb.append(" is outside the allowable range (0..");
            sb.append(65535);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        C0420TW[][] twArr = this.f3113c;
        if (i < twArr.length) {
            twArr[i] = null;
        }
    }

    /* renamed from: a */
    public void mo4524a(int i, C0768c cVar) {
        C0420TW[] twArr = this.f3113c[i];
        if (twArr != null) {
            int i2 = 0;
            while (i2 < twArr.length) {
                C0953nY nYVar = (C0953nY) twArr[i2];
                if (nYVar != null) {
                    int a = m2833a(twArr, i2);
                    if (a > 1) {
                        cVar.mo4341a(mo4522a(twArr, i2, a));
                        i2 += a - 1;
                    } else if (nYVar instanceof C0765eZ) {
                        ((C0765eZ) nYVar).mo1812a(cVar);
                    } else {
                        cVar.mo4341a((C0933mY) nYVar);
                    }
                }
                i2++;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Row [");
        sb.append(i);
        sb.append("] is empty");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo4525a(C0420TW tw) {
        short b = tw.mo280b();
        int row = tw.getRow();
        C0420TW[][] twArr = this.f3113c;
        if (row >= twArr.length) {
            int length = twArr.length * 2;
            int i = row + 1;
            if (length < i) {
                length = i;
            }
            this.f3113c = new C0420TW[length][];
            System.arraycopy(twArr, 0, this.f3113c, 0, twArr.length);
        }
        C0420TW[] twArr2 = this.f3113c[row];
        if (twArr2 == null) {
            int i2 = b + 1;
            if (i2 < 10) {
                i2 = 10;
            }
            twArr2 = new C0420TW[i2];
            this.f3113c[row] = twArr2;
        }
        if (b >= twArr2.length) {
            int length2 = twArr2.length * 2;
            int i3 = b + 1;
            if (length2 < i3) {
                length2 = i3;
            }
            C0420TW[] twArr3 = new C0420TW[length2];
            System.arraycopy(twArr2, 0, twArr3, 0, twArr2.length);
            this.f3113c[row] = twArr3;
            twArr2 = twArr3;
        }
        twArr2[b] = tw;
        int i4 = this.f3111a;
        if (b < i4 || i4 == -1) {
            this.f3111a = b;
        }
        int i5 = this.f3112b;
        if (b > i5 || i5 == -1) {
            this.f3112b = b;
        }
    }

    /* renamed from: b */
    public void mo4526b(C0420TW tw) {
        if (tw != null) {
            int row = tw.getRow();
            C0420TW[][] twArr = this.f3113c;
            if (row < twArr.length) {
                C0420TW[] twArr2 = twArr[row];
                if (twArr2 != null) {
                    short b = tw.mo280b();
                    if (b < twArr2.length) {
                        twArr2[b] = null;
                        return;
                    }
                    throw new RuntimeException("cell column is out of range");
                }
                throw new RuntimeException("cell row is already empty");
            }
            throw new RuntimeException("cell row is out of range");
        }
        throw new IllegalArgumentException("cell must not be null");
    }

    /* renamed from: b */
    public boolean mo4527b(int i) {
        C0420TW[][] twArr = this.f3113c;
        if (i >= twArr.length) {
            return false;
        }
        C0420TW[] twArr2 = twArr[i];
        if (twArr2 == null) {
            return false;
        }
        for (C0420TW tw : twArr2) {
            if (tw != null) {
                return true;
            }
        }
        return false;
    }

    public Object clone() {
        throw new RuntimeException("clone() should not be called.  ValueRecordsAggregate should be copied via Sheet.cloneSheet()");
    }
}
