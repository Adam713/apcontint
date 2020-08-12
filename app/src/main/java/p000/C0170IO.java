package p000;

import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: IO */
class C0170IO implements b<String> {

    /* renamed from: a */
    public final /* synthetic */ C1134wP f379a;

    public C0170IO(C1134wP wPVar) {
        this.f379a = wPVar;
    }

    /* renamed from: a */
    public void mo373a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.getBoolean("error")) {
                JSONArray jSONArray = jSONObject.getJSONArray("imei_cnt");
                this.f379a.f3952S = -1;
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                    this.f379a.f3952S = Integer.parseInt(jSONObject2.getString("cnt"));
                    if (this.f379a.f3952S >= 1) {
                        C0195JU ju = this.f379a.f3989p;
                        StringBuilder sb = new StringBuilder();
                        sb.append("insert into valid(imei,imei_code) values('");
                        sb.append(C0195JU.f445e);
                        sb.append("','");
                        sb.append(C0195JU.f446f);
                        sb.append("');");
                        ju.mo562d(sb.toString());
                        Toast.makeText(this.f379a.getActivity(), "Import Successful!", 0).show();
                    } else {
                        int i2 = this.f379a.f3952S;
                    }
                }
            }
            this.f379a.f3950Q.dismiss();
        } catch (JSONException unused) {
            this.f379a.f3950Q.dismiss();
        }
    }
}
