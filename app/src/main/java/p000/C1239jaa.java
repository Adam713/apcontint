package p000;

/* renamed from: jaa reason: case insensitive filesystem */
public final class C1239jaa extends C1221daa {

    /* renamed from: c */
    public final int f3186c;

    /* renamed from: d */
    public final int f3187d;

    public C1239jaa(hda hda) {
        this.f3186c = hda.readShort();
        this.f3187d = hda.readShort();
    }

    /* renamed from: a */
    public void mo79a(jda jda) {
        jda.writeByte(mo356a() + 1);
        jda.writeShort(this.f3186c);
        jda.writeShort(this.f3187d);
    }

    /* renamed from: c */
    public int mo80c() {
        return 5;
    }

    /* renamed from: e */
    public String mo81e() {
        throw new C1001pY("Coding Error: Expected ExpPtg to be converted from Shared to Non-Shared Formula by ValueRecordsAggregate, but it wasn't");
    }

    /* renamed from: f */
    public int mo4559f() {
        return this.f3187d;
    }

    /* renamed from: g */
    public int mo4560g() {
        return this.f3186c;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[Array Formula or Shared Formula]\n");
        stringBuffer.append("row = ");
        stringBuffer.append(mo4560g());
        String str = "\n";
        stringBuffer.append(str);
        stringBuffer.append("col = ");
        stringBuffer.append(mo4559f());
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
