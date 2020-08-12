package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: oY */
public final class C0978oY {

    /* renamed from: a */
    public static final Class<?>[] f3553a = {C1020qY.class};

    /* renamed from: b */
    public static final Class<? extends C0933mY>[] f3554b = {C0035BW.class, C0059CW.class, C0097EW.class, C0136GW.class, C0078DW.class, C0158HW.class, C0178IW.class, C0198JW.class, C0250LW.class, C0358QW.class, C0378RW.class, C0270MW.class, C0290NW.class, C1063sZ.class, C1123vZ.class, C0447UW.class, C0467VW.class, C0488WW.class, C0509XW.class, C0314OW.class, C0336PW.class, C0635bX.class, C0535YW.class, C0654cX.class, C0743dX.class, C0763eX.class, C0786fX.class, C0805gX.class, C0825hX.class, C0846iX.class, C0557ZW.class, C0586_W.class, C0615aX.class, C0867jX.class, C0952nX.class, C1000pX.class, C0976oX.class, C0931mX.class, C1041rX.class, C1019qX.class, C1061sX.class, C1081tX.class, C1101uX.class, C1121vX.class, C1148wX.class, C1168xX.class, C1189yX.class, C1209zX.class, C0017AX.class, C0036BX.class, C0098EX.class, C0079DX.class, C0117FX.class, C0137GX.class, C0159HX.class, C0179IX.class, C0199JX.class, C0224KX.class, C0251LX.class, C0271MX.class, C0291NX.class, C0315OX.class, C1192yZ.class, C0379RX.class, C0337PX.class, C0401SX.class, C0421TX.class, C0468VX.class, C0448UX.class, C0489WX.class, C0510XX.class, C0558ZX.class, C0537YX.class, C0616aY.class, C0636bY.class, C0655cY.class, C0744dY.class, C0764eY.class, C0787fY.class, C0806gY.class, C0826hY.class, C0868jY.class, C0848iY.class, C0912lY.class, C1042rY.class, C1062sY.class, C1082tY.class, C0887kY.class, C1102uY.class, C1191yY.class, C1210zY.class, C0018AY.class, C0019AZ.class, C0038BZ.class, C0037BY.class, C1149wY.class, C0099EY.class, C0118FY.class, C0161HY.class, C0180IY.class, C0200JY.class, C0225KY.class, C0252LY.class, C0272MY.class, C0292NY.class, C0338PY.class, C0360QY.class, C0380RY.class, C0081DZ.class, C0402SY.class, C0423TY.class, C0469VY.class, C0490WY.class, C0511XY.class, C0538YY.class, C0559ZY.class, C0449UY.class, C0954nZ.class, C1043rZ.class, C1083tZ.class, C1002pZ.class, C1103uZ.class, C1023qZ.class, C0982oZ.class, C1150wZ.class, C1170xZ.class, C1211zZ.class, C0062CZ.class, C1225eba.class, C1228fba.class, C1231gba.class, C1234hba.class, C1237iba.class, C1240jba.class, C1243kba.class};

    /* renamed from: c */
    public static final Map<Integer, C0979a> f3555c = m3268a(f3554b);

    /* renamed from: oY$a */
    private interface C0979a {
        /* renamed from: a */
        Class<? extends C0933mY> mo4972a();

        /* renamed from: a */
        C0933mY mo4973a(C1020qY qYVar);
    }

    /* renamed from: oY$b */
    private static final class C0980b implements C0979a {

        /* renamed from: a */
        public final Constructor<? extends C0933mY> f3556a;

        public C0980b(Constructor<? extends C0933mY> constructor) {
            this.f3556a = constructor;
        }

        /* renamed from: a */
        public Class<? extends C0933mY> mo4972a() {
            return this.f3556a.getDeclaringClass();
        }

        /* renamed from: a */
        public C0933mY mo4973a(C1020qY qYVar) {
            try {
                return (C0933mY) this.f3556a.newInstance(new Object[]{qYVar});
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            } catch (InstantiationException e2) {
                throw new RuntimeException(e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                throw new C1001pY("Unable to construct record instance", e4.getTargetException());
            }
        }
    }

    /* renamed from: oY$c */
    private static final class C0981c implements C0979a {

        /* renamed from: a */
        public final Method f3557a;

        public C0981c(Method method) {
            this.f3557a = method;
        }

        /* renamed from: a */
        public Class<? extends C0933mY> mo4972a() {
            return this.f3557a.getDeclaringClass();
        }

        /* renamed from: a */
        public C0933mY mo4973a(C1020qY qYVar) {
            try {
                return (C0933mY) this.f3557a.invoke(null, new Object[]{qYVar});
            } catch (IllegalArgumentException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new C1001pY("Unable to construct record instance", e3.getTargetException());
            }
        }
    }

    /* renamed from: a */
    public static C0510XX m3267a(C0887kY kYVar) {
        C0510XX xx = new C0510XX();
        xx.mo1206b(kYVar.mo280b());
        xx.mo1204a(kYVar.getRow());
        xx.mo279a(kYVar.mo277a());
        xx.mo1474a(kYVar.mo4578j());
        return xx;
    }

    /* renamed from: a */
    public static Map<Integer, C0979a> m3268a(Class<? extends C0933mY>[] clsArr) {
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet((clsArr.length * 3) / 2);
        int i = 0;
        while (i < clsArr.length) {
            Class<? extends C0933mY> cls = clsArr[i];
            String str = ")";
            if (!C0933mY.class.isAssignableFrom(cls)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid record sub-class (");
                sb.append(cls.getName());
                sb.append(str);
                throw new RuntimeException(sb.toString());
            } else if (Modifier.isAbstract(cls.getModifiers())) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Invalid record class (");
                sb2.append(cls.getName());
                sb2.append(") - must not be abstract");
                throw new RuntimeException(sb2.toString());
            } else if (hashSet.add(cls)) {
                try {
                    short s = cls.getField("sid").getShort(null);
                    Integer valueOf = Integer.valueOf(s);
                    if (!hashMap.containsKey(valueOf)) {
                        hashMap.put(valueOf, m3269a(cls));
                        i++;
                    } else {
                        Class a = ((C0979a) hashMap.get(valueOf)).mo4972a();
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("duplicate record sid 0x");
                        sb3.append(Integer.toHexString(s).toUpperCase());
                        sb3.append(" for classes (");
                        sb3.append(cls.getName());
                        sb3.append(") and (");
                        sb3.append(a.getName());
                        sb3.append(str);
                        throw new RuntimeException(sb3.toString());
                    }
                } catch (Exception unused) {
                    throw new C1001pY("Unable to determine record types");
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("duplicate record class (");
                sb4.append(cls.getName());
                sb4.append(str);
                throw new RuntimeException(sb4.toString());
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static C0979a m3269a(Class<? extends C0933mY> cls) {
        try {
            return new C0980b(cls.getConstructor(f3553a));
        } catch (NoSuchMethodException unused) {
            try {
                return new C0981c(cls.getDeclaredMethod("create", f3553a));
            } catch (NoSuchMethodException unused2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to find constructor or create method for (");
                sb.append(cls.getName());
                sb.append(").");
                throw new RuntimeException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public static C0510XX[] m3270a(C0421TX tx) {
        C0510XX[] xxArr = new C0510XX[tx.mo1235j()];
        for (int i = 0; i < tx.mo1235j(); i++) {
            C0510XX xx = new C0510XX();
            xx.mo1206b((short) (tx.mo1233h() + i));
            xx.mo1204a(tx.getRow());
            xx.mo279a(tx.mo1231b(i));
            xx.mo1474a(tx.mo1230a(i));
            xxArr[i] = xx;
        }
        return xxArr;
    }

    /* renamed from: a */
    public static C0933mY[] m3271a(C1020qY qYVar) {
        C0933mY b = m3272b(qYVar);
        if (b instanceof C0535YW) {
            return new C0933mY[]{null};
        } else if (b instanceof C0887kY) {
            return new C0933mY[]{m3267a((C0887kY) b)};
        } else if (b instanceof C0421TX) {
            return m3270a((C0421TX) b);
        } else {
            return new C0933mY[]{b};
        }
    }

    /* renamed from: b */
    public static C0933mY m3272b(C1020qY qYVar) {
        C0979a aVar = (C0979a) f3555c.get(Integer.valueOf(qYVar.mo5034c()));
        return aVar == null ? new C0316OY(qYVar) : aVar.mo4973a(qYVar);
    }
}
