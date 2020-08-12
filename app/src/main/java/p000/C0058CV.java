package p000;

/* renamed from: CV */
class C0058CV extends C1146wV {
    public C0058CV(String str, int i, boolean z, int i2) {
        super(str, i, z, i2);
    }

    /* renamed from: a */
    public double mo23a(double... dArr) {
        if (dArr[1] != 0.0d) {
            return dArr[0] / dArr[1];
        }
        throw new ArithmeticException("Division by zero!");
    }
}
