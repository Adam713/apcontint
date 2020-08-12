package p000;

import java.util.Stack;

/* renamed from: qca reason: case insensitive filesystem */
public class C1262qca {
    /* renamed from: a */
    public static String m3365a(C1265rca rca, Haa[] haaArr) {
        String a;
        if (haaArr == null || haaArr.length == 0) {
            throw new IllegalArgumentException("ptgs must not be null");
        }
        Stack stack = new Stack();
        for (C1212aaa aaa : haaArr) {
            if (!(aaa instanceof C1269taa) && !(aaa instanceof C1275vaa) && !(aaa instanceof C1272uaa)) {
                if (aaa instanceof Eaa) {
                    String str = (String) stack.pop();
                    StringBuilder sb = new StringBuilder();
                    sb.append("(");
                    sb.append(str);
                    sb.append(")");
                    a = sb.toString();
                } else if (aaa instanceof C1212aaa) {
                    C1212aaa aaa2 = aaa;
                    if (!aaa2.mo1874i() && !aaa2.mo1873h() && !aaa2.mo1876k() && !aaa2.mo1877l() && !aaa2.mo1875j()) {
                        if (aaa2.mo1878m()) {
                            a = aaa2.mo1870a(m3366a(stack, aaa2.mo1871f()));
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unexpected tAttr: ");
                            sb2.append(aaa2.toString());
                            throw new RuntimeException(sb2.toString());
                        }
                    }
                } else if (aaa instanceof C1268sca) {
                    a = ((C1268sca) aaa).mo742a(rca);
                } else if (!(aaa instanceof Daa)) {
                    a = aaa.mo81e();
                } else {
                    Daa daa = (Daa) aaa;
                    a = daa.mo52a(m3366a(stack, daa.mo53f()));
                }
                stack.push(a);
            }
        }
        if (!stack.isEmpty()) {
            String str2 = (String) stack.pop();
            if (stack.isEmpty()) {
                return str2;
            }
            throw new IllegalStateException("too much stuff left on the stack");
        }
        throw new IllegalStateException("Stack underflow");
    }

    /* renamed from: a */
    public static String[] m3366a(Stack<String> stack, int i) {
        String[] strArr = new String[i];
        int i2 = i - 1;
        while (i2 >= 0) {
            if (!stack.isEmpty()) {
                strArr[i2] = (String) stack.pop();
                i2--;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Too few arguments supplied to operation. Expected (");
                sb.append(i);
                sb.append(") operands but got (");
                sb.append((i - i2) - 1);
                sb.append(")");
                throw new IllegalStateException(sb.toString());
            }
        }
        return strArr;
    }
}
