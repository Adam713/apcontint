package p000;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import java.util.ArrayList;
import java.util.List;

/* renamed from: OL */
public class C0301OL extends AsyncTaskLoader<List<C0232LL>> {

    /* renamed from: a */
    public String f855a;

    /* renamed from: b */
    public String f856b;

    /* renamed from: c */
    public C0195JU f857c;

    /* renamed from: d */
    public int[] f858d = {2131230923, 1, 2131230855};

    /* renamed from: e */
    public double f859e = 0.0d;

    public C0301OL(Context context, String str, String str2, C0195JU ju) {
        super(context);
        this.f855a = str;
        this.f857c = ju;
        this.f856b = str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Data_Loader:");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        Log.d("Data_Loader:=", sb.toString());
    }

    public List<C0232LL> loadInBackground() {
        ArrayList arrayList = new ArrayList();
        Cursor l = !C0195JU.f451k ? this.f857c.mo593l(this.f855a) : this.f857c.mo570f(this.f855a, this.f856b);
        StringBuilder sb = new StringBuilder();
        sb.append("before_db:");
        sb.append(this.f855a);
        String str = ":";
        sb.append(str);
        sb.append(FragmentStatePagerSupport_Main.m2279h());
        String str2 = "Data_Loader:=";
        Log.d(str2, sb.toString());
        l.moveToFirst();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("after_db:");
        sb2.append(this.f855a);
        sb2.append(str);
        sb2.append(FragmentStatePagerSupport_Main.m2279h());
        Log.d(str2, sb2.toString());
        this.f859e = 0.0d;
        arrayList.clear();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("before_loop:");
        sb3.append(this.f855a);
        sb3.append(str);
        sb3.append(FragmentStatePagerSupport_Main.m2279h());
        Log.d(str2, sb3.toString());
        C0780fR fRVar = new C0780fR();
        while (!l.isAfterLast()) {
            String string = l.getString(fRVar.mo4360a(l, "_id"));
            String string2 = l.getString(fRVar.mo4360a(l, "date_"));
            StringBuilder sb4 = new StringBuilder();
            String str3 = "";
            sb4.append(str3);
            sb4.append(l.getDouble(fRVar.mo4360a(l, "amount")));
            String sb5 = sb4.toString();
            String str4 = "remarks";
            String string3 = l.getString(fRVar.mo4360a(l, str4)) != null ? l.getString(fRVar.mo4360a(l, str4)) : str3;
            String str5 = "_in";
            int i = this.f858d[l.getInt(fRVar.mo4360a(l, str5))];
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str3);
            sb6.append(l.getInt(fRVar.mo4360a(l, str5)));
            C0232LL ll = new C0232LL(string, string2, sb5, string3, i, sb6.toString(), l.getString(fRVar.mo4360a(l, "param1")), l.getString(fRVar.mo4360a(l, "curr_name")));
            arrayList.add(ll);
            l.moveToNext();
        }
        fRVar.mo4361a();
        l.close();
        StringBuilder sb7 = new StringBuilder();
        sb7.append("after_loop:");
        sb7.append(this.f855a);
        sb7.append(str);
        sb7.append(FragmentStatePagerSupport_Main.m2279h());
        Log.d(str2, sb7.toString());
        return arrayList;
    }
}
