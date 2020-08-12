package p000;

/* renamed from: HZ */
public final class C0162HZ {

    /* renamed from: a */
    public static final Object f367a = null;

    /* renamed from: a */
    public static int m330a(Object obj) {
        if (obj == f367a) {
            return 8;
        }
        Class<C0181IZ> cls = obj.getClass();
        if (cls == Boolean.class || cls == Double.class || cls == C0181IZ.class) {
            return 8;
        }
        return qda.m3367a((String) obj);
    }

    /* renamed from: a */
    public static int m331a(Object[] objArr) {
        int length = objArr.length * 1;
        for (Object a : objArr) {
            length += m330a(a);
        }
        return length;
    }

    /* renamed from: a */
    public static Object m332a(hda hda) {
        byte readByte = hda.readByte();
        if (readByte == 0) {
            hda.readLong();
            return f367a;
        } else if (readByte == 1) {
            return new Double(hda.readDouble());
        } else {
            if (readByte == 2) {
                return qda.m3368a(hda);
            }
            if (readByte == 4) {
                return m336b(hda);
            }
            if (readByte == 16) {
                int a = hda.mo401a();
                hda.mo401a();
                hda.readInt();
                return C0181IZ.m384a(a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown grbit value (");
            sb.append(readByte);
            sb.append(")");
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m333a(jda jda, Object obj) {
        long j = 0;
        if (obj == f367a) {
            jda.writeByte(0);
            jda.writeLong(0);
        } else if (obj instanceof Boolean) {
            Boolean bool = (Boolean) obj;
            jda.writeByte(4);
            if (bool.booleanValue()) {
                j = 1;
            }
            jda.writeLong(j);
        } else if (obj instanceof Double) {
            Double d = (Double) obj;
            jda.writeByte(1);
            jda.writeDouble(d.doubleValue());
        } else if (obj instanceof String) {
            String str = (String) obj;
            jda.writeByte(2);
            qda.m3371a(jda, str);
        } else if (obj instanceof C0181IZ) {
            C0181IZ iz = (C0181IZ) obj;
            jda.writeByte(16);
            jda.writeLong((long) iz.mo398a());
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected value type (");
            sb.append(obj.getClass().getName());
            sb.append("'");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m334a(jda jda, Object[] objArr) {
        for (Object a : objArr) {
            m333a(jda, a);
        }
    }

    /* renamed from: a */
    public static Object[] m335a(hda hda, int i) {
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < objArr.length; i2++) {
            objArr[i2] = m332a(hda);
        }
        return objArr;
    }

    /* renamed from: b */
    public static Object m336b(hda hda) {
        byte readLong = (byte) ((int) hda.readLong());
        if (readLong == 0) {
            return Boolean.FALSE;
        }
        if (readLong == 1) {
            return Boolean.TRUE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unexpected boolean encoding (");
        sb.append(readLong);
        sb.append(")");
        throw new RuntimeException(sb.toString());
    }
}
