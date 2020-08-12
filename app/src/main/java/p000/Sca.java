package p000;

/* renamed from: Sca */
public class Sca {
    /* renamed from: a */
    public static void m1169a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        if (i >= 0) {
            String str = " but the array length is ";
            if (i < bArr.length) {
                int i4 = i + i3;
                String str2 = " actual end at ";
                if (i4 > bArr.length) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("src_position + length would overrun the src array.  Expected end at ");
                    sb.append(i4);
                    sb.append(str2);
                    sb.append(bArr.length);
                    throw new IllegalArgumentException(sb.toString());
                } else if (i2 < 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("dst_position was less than 0.  Actual value ");
                    sb2.append(i2);
                    throw new IllegalArgumentException(sb2.toString());
                } else if (i2 < bArr2.length) {
                    int i5 = i2 + i3;
                    if (i5 <= bArr2.length) {
                        System.arraycopy(bArr, i, bArr2, i2, i3);
                        return;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("dst_position + length would overrun the dst array.  Expected end at ");
                    sb3.append(i5);
                    sb3.append(str2);
                    sb3.append(bArr2.length);
                    throw new IllegalArgumentException(sb3.toString());
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("dst_position was greater than dst array size.  Tried to write starting at position ");
                    sb4.append(i2);
                    sb4.append(str);
                    sb4.append(bArr2.length);
                    throw new IllegalArgumentException(sb4.toString());
                }
            } else {
                StringBuilder sb5 = new StringBuilder();
                sb5.append("src_position was greater than src array size.  Tried to write starting at position ");
                sb5.append(i);
                sb5.append(str);
                sb5.append(bArr.length);
                throw new IllegalArgumentException(sb5.toString());
            }
        } else {
            StringBuilder sb6 = new StringBuilder();
            sb6.append("src_position was less than 0.  Actual value ");
            sb6.append(i);
            throw new IllegalArgumentException(sb6.toString());
        }
    }
}
