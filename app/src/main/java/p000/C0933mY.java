package p000;

import java.io.ByteArrayInputStream;

/* renamed from: mY */
public abstract class C0933mY extends C0953nY {
    public Object clone() {
        StringBuilder sb = new StringBuilder();
        sb.append("The class ");
        sb.append(getClass().getName());
        sb.append(" needs to define a clone method");
        throw new RuntimeException(sb.toString());
    }

    /* renamed from: d */
    public C0933mY mo4774d() {
        C1020qY qYVar = new C1020qY(new ByteArrayInputStream(mo4775f()));
        qYVar.mo5037f();
        C0933mY[] a = C0978oY.m3271a(qYVar);
        if (a.length == 1) {
            return a[0];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Re-serialised a record to clone it, but got ");
        sb.append(a.length);
        sb.append(" records back!");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public abstract short mo34e();

    /* renamed from: f */
    public final byte[] mo4775f() {
        byte[] bArr = new byte[mo163c()];
        mo162a(0, bArr);
        return bArr;
    }

    public String toString() {
        return super.toString();
    }
}
