package p000;

/* renamed from: nda */
public abstract class nda {

    /* renamed from: a */
    public static int f3486a = 1;

    /* renamed from: b */
    public static int f3487b = 3;

    /* renamed from: c */
    public static int f3488c = 5;

    /* renamed from: a */
    public abstract void mo4700a(int i, Object obj);

    /* renamed from: a */
    public void mo4701a(int i, Object obj, Object obj2) {
        if (mo4705a(i)) {
            StringBuffer stringBuffer = new StringBuffer(32);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            mo4700a(i, stringBuffer);
        }
    }

    /* renamed from: a */
    public void mo4702a(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        if (mo4705a(i)) {
            StringBuffer stringBuffer = new StringBuffer(64);
            stringBuffer.append(obj);
            stringBuffer.append(obj2);
            stringBuffer.append(obj3);
            stringBuffer.append(obj4);
            mo4700a(i, stringBuffer);
        }
    }

    /* renamed from: a */
    public abstract void mo4703a(int i, Object obj, Throwable th);

    /* renamed from: a */
    public abstract void mo4704a(String str);

    /* renamed from: a */
    public abstract boolean mo4705a(int i);
}
