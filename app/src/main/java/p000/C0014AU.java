package p000;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/* renamed from: AU */
class C0014AU implements b<String> {

    /* renamed from: a */
    public final /* synthetic */ Context f22a;

    /* renamed from: b */
    public final /* synthetic */ C0195JU f23b;

    public C0014AU(C0195JU ju, Context context) {
        this.f23b = ju;
        this.f22a = context;
    }

    /* renamed from: a */
    public void mo21a(String str) {
        String str2 = "api_sms_resp: ";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("=");
            sb.append(str);
            Log.d(str2, sb.toString());
            if (str != null) {
                Toast.makeText(this.f22a, str, 0).show();
            }
        } catch (Exception e) {
            String str3 = this.f23b.f471J;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("api_error: ");
            sb2.append(e.getMessage());
            String str4 = "";
            sb2.append(str4);
            Log.e(str3, sb2.toString());
            Context context = this.f22a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e.getMessage());
            sb3.append(str4);
            Toast.makeText(context, sb3.toString(), 1).show();
            e.printStackTrace();
        }
    }
}
