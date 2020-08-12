package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: zba reason: case insensitive filesystem */
public class C1288zba {

    /* renamed from: a */
    public final List<byte[]> f4235a = new ArrayList(1);

    /* renamed from: a */
    public byte[] mo5593a() {
        if (this.f4235a.isEmpty()) {
            return null;
        }
        if (this.f4235a.size() > 1) {
            int i = 0;
            for (byte[] length : this.f4235a) {
                i += length.length;
            }
            byte[] bArr = new byte[i];
            int i2 = 0;
            for (byte[] bArr2 : this.f4235a) {
                System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
                i2 += bArr2.length;
            }
            this.f4235a.clear();
            this.f4235a.add(bArr);
        }
        return (byte[]) this.f4235a.get(0);
    }
}
