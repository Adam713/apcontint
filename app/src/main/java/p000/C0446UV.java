package p000;

/* renamed from: UV */
public class C0446UV {

    /* renamed from: a */
    public byte[] f1283a;

    public C0446UV() {
        this.f1283a = new byte[16];
        for (int i = 0; i < 16; i++) {
            this.f1283a[i] = 0;
        }
    }

    public C0446UV(byte[] bArr, int i) {
        mo1311a(bArr, i);
    }

    /* renamed from: a */
    public byte[] mo1310a() {
        return this.f1283a;
    }

    /* renamed from: a */
    public byte[] mo1311a(byte[] bArr, int i) {
        this.f1283a = new byte[16];
        byte[] bArr2 = this.f1283a;
        bArr2[0] = bArr[i + 3];
        bArr2[1] = bArr[i + 2];
        bArr2[2] = bArr[i + 1];
        bArr2[3] = bArr[i + 0];
        bArr2[4] = bArr[i + 5];
        bArr2[5] = bArr[i + 4];
        bArr2[6] = bArr[i + 7];
        bArr2[7] = bArr[i + 6];
        for (int i2 = 8; i2 < 16; i2++) {
            this.f1283a[i2] = bArr[i2 + i];
        }
        return this.f1283a;
    }

    /* renamed from: b */
    public void mo1312b(byte[] bArr, int i) {
        if (bArr.length >= 16) {
            int i2 = i + 0;
            byte[] bArr2 = this.f1283a;
            bArr[i2] = bArr2[3];
            bArr[i + 1] = bArr2[2];
            bArr[i + 2] = bArr2[1];
            bArr[i + 3] = bArr2[0];
            bArr[i + 4] = bArr2[5];
            bArr[i + 5] = bArr2[4];
            bArr[i + 6] = bArr2[7];
            bArr[i + 7] = bArr2[6];
            for (int i3 = 8; i3 < 16; i3++) {
                bArr[i3 + i] = this.f1283a[i3];
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Destination byte[] must have room for at least 16 bytes, but has a length of only ");
        sb.append(bArr.length);
        sb.append(".");
        throw new ArrayStoreException(sb.toString());
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0446UV)) {
            return false;
        }
        C0446UV uv = (C0446UV) obj;
        if (this.f1283a.length != uv.f1283a.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr = this.f1283a;
            if (i >= bArr.length) {
                return true;
            }
            if (bArr[i] != uv.f1283a[i]) {
                return false;
            }
            i++;
        }
    }

    public int hashCode() {
        return new String(this.f1283a).hashCode();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer(38);
        stringBuffer.append('{');
        for (int i = 0; i < 16; i++) {
            stringBuffer.append(Yca.m1597b(this.f1283a[i]));
            if (i == 3 || i == 5 || i == 7 || i == 9) {
                stringBuffer.append('-');
            }
        }
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
