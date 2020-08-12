package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: _X */
public abstract class C0587_X extends C0080DY {

    /* renamed from: a */
    public static final int[] f1781a = new int[0];

    /* renamed from: b */
    public List<C0588a> f1782b = new ArrayList();

    /* renamed from: c */
    public Map<Integer, C0588a> f1783c = new HashMap();

    /* renamed from: _X$a */
    public static final class C0588a {

        /* renamed from: a */
        public int f1784a;

        /* renamed from: b */
        public int f1785b;

        /* renamed from: c */
        public int f1786c;

        public C0588a(int i, int i2, int i3) {
            this.f1784a = i;
            this.f1785b = i2;
            this.f1786c = i3;
        }

        /* renamed from: a */
        public void mo1810a(jda jda) {
            jda.writeShort(this.f1784a + 1);
            jda.writeShort(this.f1785b);
            jda.writeShort(this.f1786c);
        }
    }

    /* renamed from: a */
    public void mo1806a(int i, int i2, int i3) {
        Integer valueOf = Integer.valueOf(i);
        C0588a aVar = (C0588a) this.f1783c.get(valueOf);
        if (aVar == null) {
            C0588a aVar2 = new C0588a(i, i2, i3);
            this.f1783c.put(valueOf, aVar2);
            this.f1782b.add(aVar2);
            return;
        }
        aVar.f1784a = i;
        aVar.f1785b = i2;
        aVar.f1786c = i3;
    }

    /* renamed from: a */
    public final void mo30a(jda jda) {
        int size = this.f1782b.size();
        jda.writeShort(size);
        for (int i = 0; i < size; i++) {
            ((C0588a) this.f1782b.get(i)).mo1810a(jda);
        }
    }

    /* renamed from: g */
    public int mo36g() {
        return (this.f1782b.size() * 6) + 2;
    }

    /* renamed from: h */
    public final Iterator<C0588a> mo1807h() {
        return this.f1782b.iterator();
    }

    /* renamed from: i */
    public int mo1808i() {
        return this.f1782b.size();
    }

    /* renamed from: j */
    public boolean mo1809j() {
        return this.f1782b.isEmpty();
    }

    public String toString() {
        String str;
        String str2;
        StringBuffer stringBuffer = new StringBuffer();
        String str3 = "row";
        if (mo34e() == 27) {
            str2 = "HORIZONTALPAGEBREAK";
            str = "col";
        } else {
            str2 = "VERTICALPAGEBREAK";
            str = str3;
            str3 = "column";
        }
        StringBuilder sb = new StringBuilder();
        String str4 = "[";
        sb.append(str4);
        sb.append(str2);
        String str5 = "]";
        sb.append(str5);
        stringBuffer.append(sb.toString());
        String str6 = "\n";
        stringBuffer.append(str6);
        stringBuffer.append("     .sid        =");
        stringBuffer.append(mo34e());
        stringBuffer.append(str6);
        stringBuffer.append("     .numbreaks =");
        stringBuffer.append(mo1808i());
        stringBuffer.append(str6);
        Iterator h = mo1807h();
        for (int i = 0; i < mo1808i(); i++) {
            C0588a aVar = (C0588a) h.next();
            String str7 = "     .";
            stringBuffer.append(str7);
            stringBuffer.append(str3);
            stringBuffer.append(" (zero-based) =");
            stringBuffer.append(aVar.f1784a);
            stringBuffer.append(str6);
            stringBuffer.append(str7);
            stringBuffer.append(str);
            stringBuffer.append("From    =");
            stringBuffer.append(aVar.f1785b);
            stringBuffer.append(str6);
            stringBuffer.append(str7);
            stringBuffer.append(str);
            stringBuffer.append("To      =");
            stringBuffer.append(aVar.f1786c);
            stringBuffer.append(str6);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str4);
        sb2.append(str2);
        sb2.append(str5);
        stringBuffer.append(sb2.toString());
        stringBuffer.append(str6);
        return stringBuffer.toString();
    }
}
