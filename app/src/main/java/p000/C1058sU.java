package p000;

import com.itextpdf.tool.xml.html.HTML.Attribute;
import java.util.HashMap;
import java.util.Map;

/* renamed from: sU */
class C1058sU extends pa {

    /* renamed from: o */
    public final /* synthetic */ String f3742o;

    /* renamed from: p */
    public final /* synthetic */ String f3743p;

    /* renamed from: q */
    public final /* synthetic */ String f3744q;

    /* renamed from: r */
    public final /* synthetic */ String f3745r;

    /* renamed from: s */
    public final /* synthetic */ String f3746s;

    /* renamed from: t */
    public final /* synthetic */ String f3747t;

    /* renamed from: u */
    public final /* synthetic */ C0195JU f3748u;

    public C1058sU(C0195JU ju, int i, String str, b bVar, a aVar, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f3748u = ju;
        this.f3742o = str2;
        this.f3743p = str3;
        this.f3744q = str4;
        this.f3745r = str5;
        this.f3746s = str6;
        this.f3747t = str7;
        super(i, str, bVar, aVar);
    }

    /* renamed from: g */
    public Map<String, String> mo5099g() {
        HashMap hashMap = new HashMap();
        hashMap.put("imei", this.f3742o);
        hashMap.put(Attribute.NAME, this.f3743p);
        hashMap.put("phone", this.f3744q);
        hashMap.put("country", this.f3745r);
        hashMap.put("email", this.f3746s);
        hashMap.put("user_reply", this.f3747t);
        return hashMap;
    }
}
