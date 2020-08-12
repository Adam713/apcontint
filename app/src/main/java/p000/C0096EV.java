package p000;

/* renamed from: EV */
class C0096EV extends C1146wV {
    public C0096EV(String str, int i, boolean z, int i2) {
        super(str, i, z, i2);
    }

    /* renamed from: a */
    public double mo23a(double... dArr) {
        if (dArr[1] != 0.0d) {
            return dArr[0] % dArr[1];
        }
        throw new ArithmeticException("Division by zero!");
    }
}
