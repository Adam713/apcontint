package p000;

/* renamed from: dX */
public final class C0743dX extends C0080DY {

    /* renamed from: a */
    public short f2867a;

    /* renamed from: b */
    public short f2868b;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo4296h());
        jda.writeShort(mo4297i());
    }

    /* renamed from: b */
    public void mo4294b(short s) {
        this.f2867a = s;
    }

    /* renamed from: c */
    public void mo4295c(short s) {
        this.f2868b = s;
    }

    public Object clone() {
        C0743dX dXVar = new C0743dX();
        dXVar.f2867a = this.f2867a;
        dXVar.f2868b = this.f2868b;
        return dXVar;
    }

    /* renamed from: e */
    public short mo34e() {
        return 549;
    }

    /* renamed from: g */
    public int mo36g() {
        return 4;
    }

    /* renamed from: h */
    public short mo4296h() {
        return this.f2867a;
    }

    /* renamed from: i */
    public short mo4297i() {
        return this.f2868b;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[DEFAULTROWHEIGHT]\n");
        stringBuffer.append("    .optionflags    = ");
        stringBuffer.append(Integer.toHexString(mo4296h()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .rowheight      = ");
        stringBuffer.append(Integer.toHexString(mo4297i()));
        stringBuffer.append(str);
        stringBuffer.append("[/DEFAULTROWHEIGHT]\n");
        return stringBuffer.toString();
    }
}
