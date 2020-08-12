package p000;

/* renamed from: _W */
public final class C0586_W extends C0080DY {

    /* renamed from: a */
    public short f1776a;

    /* renamed from: b */
    public int f1777b;

    /* renamed from: c */
    public int f1778c;

    /* renamed from: d */
    public int f1779d = -1;

    /* renamed from: e */
    public int f1780e = 0;

    /* renamed from: a */
    public void mo30a(jda jda) {
        jda.writeShort(mo1804k());
        jda.writeInt(mo1802i());
        jda.writeInt(mo1805l());
        jda.writeInt(mo1803j());
        jda.writeInt(mo1801h());
    }

    public Object clone() {
        C0586_W _w = new C0586_W();
        _w.f1776a = this.f1776a;
        _w.f1777b = this.f1777b;
        _w.f1778c = this.f1778c;
        _w.f1779d = this.f1779d;
        _w.f1780e = this.f1780e;
        return _w;
    }

    /* renamed from: e */
    public short mo34e() {
        return 434;
    }

    /* renamed from: g */
    public int mo36g() {
        return 18;
    }

    /* renamed from: h */
    public int mo1801h() {
        return this.f1780e;
    }

    /* renamed from: i */
    public int mo1802i() {
        return this.f1777b;
    }

    /* renamed from: j */
    public int mo1803j() {
        return this.f1779d;
    }

    /* renamed from: k */
    public short mo1804k() {
        return this.f1776a;
    }

    /* renamed from: l */
    public int mo1805l() {
        return this.f1778c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[DVAL]\n");
        stringBuffer.append("    .options      = ");
        stringBuffer.append(mo1804k());
        stringBuffer.append(10);
        stringBuffer.append("    .horizPos     = ");
        stringBuffer.append(mo1802i());
        stringBuffer.append(10);
        stringBuffer.append("    .vertPos      = ");
        stringBuffer.append(mo1805l());
        stringBuffer.append(10);
        stringBuffer.append("    .comboObjectID   = ");
        stringBuffer.append(Integer.toHexString(mo1803j()));
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("    .DVRecordsNumber = ");
        stringBuffer.append(Integer.toHexString(mo1801h()));
        stringBuffer.append(str);
        stringBuffer.append("[/DVAL]\n");
        return stringBuffer.toString();
    }
}
