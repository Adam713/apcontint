package p000;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import java.util.ArrayList;
import java.util.List;

/* renamed from: wR */
public class C1142wR extends AsyncTaskLoader<List<C0082EH>> {

    /* renamed from: a */
    public String f4014a;

    /* renamed from: b */
    public String f4015b;

    /* renamed from: c */
    public C0195JU f4016c;

    /* renamed from: d */
    public int[] f4017d = {2131230923, 1, 2131230855};

    /* renamed from: e */
    public double f4018e = 0.0d;

    public C1142wR(Context context, String str, String str2, C0195JU ju) {
        super(context);
        this.f4014a = str;
        this.f4016c = ju;
        this.f4015b = str2;
        StringBuilder sb = new StringBuilder();
        sb.append("Customer_Loader:");
        sb.append(str);
        String str3 = ":";
        sb.append(str3);
        sb.append(str2);
        sb.append(str3);
        sb.append(FragmentStatePagerSupport_Main.m2279h());
        Log.d("Customer_Loader:=", sb.toString());
    }

    public List<C0082EH> loadInBackground() {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append("before_db:");
        sb.append(this.f4014a);
        String str = ":";
        sb.append(str);
        sb.append(this.f4015b);
        sb.append(str);
        sb.append(FragmentStatePagerSupport_Main.m2279h());
        String str2 = "Customer_Loader:=";
        Log.d(str2, sb.toString());
        Cursor u = !C0195JU.f451k ? this.f4016c.mo621u(this.f4014a) : this.f4016c.mo591k(this.f4014a, this.f4015b);
        u.moveToFirst();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("after_db:");
        sb2.append(this.f4014a);
        sb2.append(str);
        sb2.append(this.f4015b);
        sb2.append(str);
        sb2.append(FragmentStatePagerSupport_Main.m2279h());
        Log.d(str2, sb2.toString());
        this.f4018e = 0.0d;
        arrayList.clear();
        C0780fR fRVar = new C0780fR();
        StringBuilder sb3 = new StringBuilder();
        sb3.append("before_loop:");
        sb3.append(this.f4014a);
        sb3.append(str);
        sb3.append(this.f4015b);
        sb3.append(str);
        sb3.append(FragmentStatePagerSupport_Main.m2279h());
        Log.d(str2, sb3.toString());
        while (!u.isAfterLast()) {
            C0082EH eh = new C0082EH(u.getString(fRVar.mo4360a(u, Attribute.f2026ID)), u.getString(fRVar.mo4360a(u, "_id")), u.getString(fRVar.mo4360a(u, "phone")), u.getDouble(fRVar.mo4360a(u, "amount")), this.f4017d[u.getInt(fRVar.mo4360a(u, "_in"))], 0, u.getString(fRVar.mo4360a(u, "g_name")), u.getString(fRVar.mo4360a(u, "curr_name")), u.getString(fRVar.mo4360a(u, "cnt")));
            arrayList.add(eh);
            u.moveToNext();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("after_loop:");
        sb4.append(this.f4014a);
        sb4.append(str);
        sb4.append(this.f4015b);
        sb4.append(str);
        sb4.append(FragmentStatePagerSupport_Main.m2279h());
        Log.d(str2, sb4.toString());
        fRVar.mo4361a();
        u.close();
        return arrayList;
    }
}
