package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: YX */
public final class C0537YX extends C0933mY {

    /* renamed from: a */
    public static int f1634a = 4;

    /* renamed from: b */
    public List<C0138GY> f1635b = new ArrayList(2);

    /* renamed from: c */
    public final byte[] f1636c = null;

    /* renamed from: d */
    public boolean f1637d;

    /* renamed from: a */
    public int mo162a(int i, byte[] bArr) {
        int c = mo163c();
        int i2 = c - 4;
        fda fda = new fda(bArr, i, c);
        fda.writeShort(93);
        fda.writeShort(i2);
        byte[] bArr2 = this.f1636c;
        if (bArr2 == null) {
            for (int i3 = 0; i3 < this.f1635b.size(); i3++) {
                ((C0138GY) this.f1635b.get(i3)).mo284a(fda);
            }
            int i4 = i + i2;
            while (fda.mo4400a() < i4) {
                fda.writeByte(0);
            }
        } else {
            fda.write(bArr2);
        }
        return c;
    }

    /* renamed from: a */
    public boolean mo1645a(C0138GY gy) {
        return this.f1635b.add(gy);
    }

    /* renamed from: c */
    public int mo163c() {
        byte[] bArr = this.f1636c;
        if (bArr != null) {
            return bArr.length + 4;
        }
        int i = 0;
        for (int size = this.f1635b.size() - 1; size >= 0; size--) {
            i += ((C0138GY) this.f1635b.get(size)).mo283a() + 4;
        }
        if (this.f1637d) {
            while (i % f1634a != 0) {
                i++;
            }
        } else {
            while (i % 2 != 0) {
                i++;
            }
        }
        return i + 4;
    }

    public Object clone() {
        C0537YX yx = new C0537YX();
        for (int i = 0; i < this.f1635b.size(); i++) {
            yx.mo1645a((C0138GY) ((C0138GY) this.f1635b.get(i)).clone());
        }
        return yx;
    }

    /* renamed from: e */
    public short mo34e() {
        return 93;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[OBJ]\n");
        for (int i = 0; i < this.f1635b.size(); i++) {
            C0138GY gy = (C0138GY) this.f1635b.get(i);
            stringBuffer.append("SUBRECORD: ");
            stringBuffer.append(gy.toString());
        }
        stringBuffer.append("[/OBJ]\n");
        return stringBuffer.toString();
    }
}
