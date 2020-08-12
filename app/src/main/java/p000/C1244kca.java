package p000;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

/* renamed from: kca reason: case insensitive filesystem */
public final class C1244kca implements C1217bca, C1232gca {

    /* renamed from: a */
    public byte[] f3236a;

    /* renamed from: b */
    public final int f3237b;

    /* renamed from: c */
    public final Bba f3238c;

    public C1244kca(Bba bba) {
        this.f3238c = bba;
        this.f3237b = m2925a(bba);
        this.f3236a = new byte[64];
    }

    public C1244kca(Bba bba, byte[] bArr, int i) {
        this(bba);
        System.arraycopy(bArr, i * 64, this.f3236a, 0, 64);
    }

    /* renamed from: a */
    public static int m2924a(int i) {
        return i * 64;
    }

    /* renamed from: a */
    public static int m2925a(Bba bba) {
        return bba.mo84b() / 64;
    }

    /* renamed from: a */
    public static int m2926a(Bba bba, List list) {
        int a = m2925a(bba);
        int size = list.size();
        int i = ((size + a) - 1) / a;
        int i2 = a * i;
        while (size < i2) {
            list.add(m2931b(bba));
            size++;
        }
        return i;
    }

    /* renamed from: a */
    public static C1220cca m2927a(C1244kca[] kcaArr, int i) {
        int i2 = i >> 6;
        return new C1220cca(kcaArr[i2].f3236a, i & 63);
    }

    /* renamed from: a */
    public static C1244kca[] m2928a(Bba bba, byte[] bArr, int i) {
        C1244kca[] kcaArr = new C1244kca[(((i + 64) - 1) / 64)];
        int i2 = 0;
        for (int i3 = 0; i3 < kcaArr.length; i3++) {
            kcaArr[i3] = new C1244kca(bba);
            if (i2 < bArr.length) {
                int min = Math.min(64, bArr.length - i2);
                System.arraycopy(bArr, i2, kcaArr[i3].f3236a, 0, min);
                if (min != 64) {
                    Arrays.fill(kcaArr[i3].f3236a, min, 64, -1);
                }
            } else {
                Arrays.fill(kcaArr[i3].f3236a, -1);
            }
            i2 += 64;
        }
        return kcaArr;
    }

    /* renamed from: a */
    public static C1244kca[] m2929a(Bba bba, C1217bca[] bcaArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (C1217bca a : bcaArr) {
            a.mo944a(byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C1244kca[] kcaArr = new C1244kca[m2930b(i)];
        for (int i2 = 0; i2 < kcaArr.length; i2++) {
            kcaArr[i2] = new C1244kca(bba, byteArray, i2);
        }
        return kcaArr;
    }

    /* renamed from: b */
    public static int m2930b(int i) {
        return ((i + 64) - 1) / 64;
    }

    /* renamed from: b */
    public static C1244kca m2931b(Bba bba) {
        C1244kca kca = new C1244kca(bba);
        Arrays.fill(kca.f3236a, -1);
        return kca;
    }

    /* renamed from: a */
    public void mo944a(OutputStream outputStream) {
        outputStream.write(this.f3236a);
    }
}
