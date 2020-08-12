package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

/* renamed from: CO */
public class C0051CO {

    /* renamed from: a */
    public String f91a = C0051CO.class.getSimpleName();

    /* renamed from: b */
    public SharedPreferences f92b;

    /* renamed from: c */
    public Editor f93c;

    /* renamed from: d */
    public Context f94d;

    /* renamed from: e */
    public int f95e = 0;

    public C0051CO(Context context) {
        this.f94d = context;
        this.f92b = this.f94d.getSharedPreferences("androidhive_gcm", this.f95e);
        this.f93c = this.f92b.edit();
    }

    /* renamed from: a */
    public String mo99a() {
        return this.f92b.getString("notifications", null);
    }

    /* renamed from: a */
    public void mo100a(String str) {
        String a = mo99a();
        if (a != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("|");
            sb.append(str);
            str = sb.toString();
        }
        this.f93c.putString("notifications", str);
        this.f93c.commit();
    }
}
