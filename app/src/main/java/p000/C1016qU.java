package p000;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: qU */
class C1016qU implements b<String> {

    /* renamed from: a */
    public final /* synthetic */ int f3613a;

    /* renamed from: b */
    public final /* synthetic */ Context f3614b;

    /* renamed from: c */
    public final /* synthetic */ Handler f3615c;

    /* renamed from: d */
    public final /* synthetic */ C0195JU f3616d;

    public C1016qU(C0195JU ju, int i, Context context, Handler handler) {
        this.f3616d = ju;
        this.f3613a = i;
        this.f3614b = context;
        this.f3615c = handler;
    }

    /* renamed from: a */
    public void mo5030a(String str) {
        String str2 = "','";
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.getBoolean("error")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("user");
                String string = jSONObject2.getString("imei");
                String string2 = jSONObject2.getString("date_");
                String string3 = jSONObject2.getString("status");
                String string4 = jSONObject2.getString(Attribute.NAME);
                String string5 = jSONObject2.getString("phone");
                String string6 = jSONObject2.getString("country");
                String string7 = jSONObject2.getString("email");
                String string8 = jSONObject2.getString("reply");
                String string9 = jSONObject2.getString("reply_from");
                String string10 = jSONObject2.getString("user_reply");
                this.f3616d.mo562d("delete from act_req ");
                C0195JU ju = this.f3616d;
                StringBuilder sb = new StringBuilder();
                sb.append("insert into act_req(imei,date_,status,name,phone,country,email,reply,user_reply,reply_from) values ('");
                sb.append(string);
                sb.append(str2);
                sb.append(string2);
                sb.append(str2);
                sb.append(string3);
                sb.append(str2);
                sb.append(string4);
                sb.append(str2);
                sb.append(string5);
                sb.append(str2);
                sb.append(string6);
                sb.append(str2);
                sb.append(string7);
                sb.append(str2);
                sb.append(string8);
                sb.append(str2);
                sb.append(string10);
                sb.append(str2);
                sb.append(string9);
                sb.append("')");
                ju.mo562d(sb.toString());
                if (this.f3613a == 0) {
                    Toast.makeText(this.f3614b, this.f3614b.getString(2131755072), 1).show();
                }
                this.f3616d.f476O = true;
                this.f3615c.sendMessage(this.f3615c.obtainMessage());
            } else {
                this.f3616d.f476O = false;
                this.f3615c.sendMessage(this.f3615c.obtainMessage());
                Context context = this.f3614b;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(jSONObject.getString("message"));
                Toast.makeText(context, sb2.toString(), 1).show();
            }
            this.f3616d.f472K.dismiss();
        } catch (JSONException e) {
            Log.d("json parsing error: ", e.getMessage());
            this.f3616d.f476O = false;
            Handler handler = this.f3615c;
            handler.sendMessage(handler.obtainMessage());
            this.f3616d.f472K.dismiss();
        }
    }
}
