package p000;

import java.io.File;

/* renamed from: Oba */
public class Oba {

    /* renamed from: a */
    public String[] f913a;

    /* renamed from: b */
    public int f914b;

    public Oba() {
        this.f914b = 0;
        this.f913a = new String[0];
    }

    public Oba(Oba oba, String[] strArr) {
        this.f914b = 0;
        if (strArr == null) {
            this.f913a = new String[oba.f913a.length];
        } else {
            this.f913a = new String[(oba.f913a.length + strArr.length)];
        }
        int i = 0;
        while (true) {
            String[] strArr2 = oba.f913a;
            if (i >= strArr2.length) {
                break;
            }
            this.f913a[i] = strArr2[i];
            i++;
        }
        if (strArr != null) {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (strArr[i2] == null || strArr[i2].length() == 0) {
                    throw new IllegalArgumentException("components cannot contain null or empty strings");
                }
                this.f913a[oba.f913a.length + i2] = strArr[i2];
            }
        }
    }

    /* renamed from: a */
    public int mo1014a() {
        return this.f913a.length;
    }

    /* renamed from: a */
    public String mo1015a(int i) {
        return this.f913a[i];
    }

    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == Oba.class) {
            if (this == obj) {
                return true;
            }
            Oba oba = (Oba) obj;
            if (oba.f913a.length == this.f913a.length) {
                int i = 0;
                while (true) {
                    String[] strArr = this.f913a;
                    if (i >= strArr.length) {
                        return true;
                    }
                    if (!oba.f913a[i].equals(strArr[i])) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f914b == 0) {
            int i = 0;
            while (true) {
                String[] strArr = this.f913a;
                if (i >= strArr.length) {
                    break;
                }
                this.f914b += strArr[i].hashCode();
                i++;
            }
        }
        return this.f914b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        int a = mo1014a();
        stringBuffer.append(File.separatorChar);
        for (int i = 0; i < a; i++) {
            stringBuffer.append(mo1015a(i));
            if (i < a - 1) {
                stringBuffer.append(File.separatorChar);
            }
        }
        return stringBuffer.toString();
    }
}
