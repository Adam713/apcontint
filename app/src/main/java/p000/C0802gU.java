package p000;

import android.content.Context;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: gU */
class C0802gU implements b<String> {

    /* renamed from: a */
    public final /* synthetic */ Context f3024a;

    /* renamed from: b */
    public final /* synthetic */ C0195JU f3025b;

    public C0802gU(C0195JU ju, Context context) {
        this.f3025b = ju;
        this.f3024a = context;
    }

    /* renamed from: a */
    public void mo4420a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.getBoolean("error")) {
                JSONArray jSONArray = jSONObject.getJSONArray("imei_cnt");
                this.f3025b.f474M = -1;
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                    this.f3025b.f474M = Integer.parseInt(jSONObject2.getString("cnt"));
                    if (this.f3025b.f474M >= 1) {
                        C0195JU ju = this.f3025b;
                        StringBuilder sb = new StringBuilder();
                        sb.append("insert into valid(imei,imei_code) values('");
                        sb.append(C0195JU.f445e);
                        sb.append("','");
                        sb.append(C0195JU.f446f);
                        sb.append("');");
                        ju.mo562d(sb.toString());
                        Toast.makeText(this.f3024a, this.f3024a.getString(2131755168), 0).show();
                    } else {
                        int i2 = this.f3025b.f474M;
                    }
                }
            }
            this.f3025b.f472K.dismiss();
        } catch (JSONException unused) {
            this.f3025b.f472K.dismiss();
        }
    }
}
