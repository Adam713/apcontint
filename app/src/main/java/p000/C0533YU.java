package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/* renamed from: YU */
public class C0533YU {

    /* renamed from: a */
    public final C0289NV[] f1627a;

    /* renamed from: b */
    public final Map<String, Double> f1628b = new HashMap(4);

    /* renamed from: c */
    public final Set<String> f1629c;

    public C0533YU(C0289NV[] nvArr, Set<String> set) {
        this.f1627a = nvArr;
        this.f1629c = set;
    }

    /* renamed from: a */
    public double mo1641a() {
        double a;
        Stack stack = new Stack();
        int i = 0;
        while (true) {
            C0289NV[] nvArr = this.f1627a;
            if (i < nvArr.length) {
                C0289NV nv = nvArr[i];
                if (nv.mo936a() == 1) {
                    a = ((C0222KV) nv).mo731b();
                } else {
                    if (nv.mo936a() == 6) {
                        String b = ((C0335PV) nv).mo1052b();
                        Double d = (Double) this.f1628b.get(b);
                        if (d != null) {
                            stack.push(d);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("No value has been set for the setVariable '");
                            sb.append(b);
                            sb.append("'.");
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else if (nv.mo936a() == 2) {
                        C0269MV mv = (C0269MV) nv;
                        if (stack.size() < mv.mo900b().mo5364a()) {
                            throw new IllegalArgumentException("Invalid number of operands available");
                        } else if (mv.mo900b().mo5364a() == 2) {
                            double doubleValue = ((Double) stack.pop()).doubleValue();
                            double doubleValue2 = ((Double) stack.pop()).doubleValue();
                            a = mv.mo900b().mo23a(doubleValue2, doubleValue);
                        } else if (mv.mo900b().mo5364a() == 1) {
                            double doubleValue3 = ((Double) stack.pop()).doubleValue();
                            a = mv.mo900b().mo23a(doubleValue3);
                        }
                    } else if (nv.mo936a() == 3) {
                        C0197JV jv = (C0197JV) nv;
                        if (stack.size() >= jv.mo641b().mo1796a()) {
                            double[] dArr = new double[jv.mo641b().mo1796a()];
                            for (int i2 = 0; i2 < jv.mo641b().mo1796a(); i2++) {
                                dArr[i2] = ((Double) stack.pop()).doubleValue();
                            }
                            C0584_U b2 = jv.mo641b();
                            mo1642a(dArr);
                            a = b2.mo1795a(dArr);
                        } else {
                            throw new IllegalArgumentException("Invalid number of arguments available");
                        }
                    } else {
                        continue;
                    }
                    i++;
                }
                stack.push(Double.valueOf(a));
                i++;
            } else if (stack.size() <= 1) {
                return ((Double) stack.pop()).doubleValue();
            } else {
                throw new IllegalArgumentException("Invalid number of items on the output queue. Might be caused by an invalid number of arguments for a function.");
            }
        }
    }

    /* renamed from: a */
    public final double[] mo1642a(double[] dArr) {
        int length = dArr.length;
        for (int i = 0; i < length / 2; i++) {
            double d = dArr[i];
            int i2 = (length - i) - 1;
            dArr[i] = dArr[i2];
            dArr[i2] = d;
        }
        return dArr;
    }
}
