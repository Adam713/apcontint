package p000;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vU */
class C1118vU implements b<String> {

    /* renamed from: a */
    public final /* synthetic */ String f3882a;

    /* renamed from: b */
    public final /* synthetic */ String f3883b;

    /* renamed from: c */
    public final /* synthetic */ C0195JU f3884c;

    public C1118vU(C0195JU ju, String str, String str2) {
        this.f3884c = ju;
        this.f3882a = str;
        this.f3883b = str2;
    }

    /* renamed from: a */
    public void mo5231a(String str) {
        C0195JU ju;
        String str2 = "black_list";
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.getBoolean("error")) {
                JSONArray jSONArray = jSONObject.getJSONArray(str2);
                this.f3884c.f474M = -1;
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                    this.f3884c.f474M = Integer.parseInt(jSONObject2.getString("cnt"));
                    String str3 = "black_date_done";
                    String str4 = "black_date";
                    if (this.f3884c.f474M >= 1) {
                        this.f3884c.mo543b(str2, true);
                        this.f3884c.mo631x(str4, this.f3882a);
                        ju = this.f3884c;
                    } else if (this.f3884c.f474M == 0) {
                        this.f3884c.mo543b(str2, false);
                        this.f3884c.mo631x(str4, this.f3882a);
                        ju = this.f3884c;
                    }
                    ju.mo631x(str3, this.f3883b);
                }
            }
        } catch (JSONException unused) {
        }
    }
}
