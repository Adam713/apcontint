package p000;

/* renamed from: Taa */
public final class Taa extends C1221daa {

    /* renamed from: c */
    public final int f1201c;

    /* renamed from: d */
    public final int f1202d;

    public Taa(hda hda) {
        this.f1201c = hda.mo401a();
        this.f1202d = hda.mo401a();
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 2);
        jda.writeShort(this.f1201c);
        jda.writeShort(this.f1202d);
    }

    /* renamed from: c */
    public int mo80c() {
        return 5;
    }

    /* renamed from: e */
    public String mo81e() {
        throw new C1001pY("Table and Arrays are not yet supported");
    }

    /* renamed from: f */
    public int mo1237f() {
        return this.f1202d;
    }

    /* renamed from: g */
    public int mo1238g() {
        return this.f1201c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[Data Table - Parent cell is an interior cell in a data table]\n");
        stringBuffer.append("top left row = ");
        stringBuffer.append(mo1238g());
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("top left col = ");
        stringBuffer.append(mo1237f());
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
