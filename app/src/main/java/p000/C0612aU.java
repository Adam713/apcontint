package p000;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import java.util.ArrayList;

/* renamed from: aU */
public class C0612aU extends AsyncTaskLoader<ArrayList<C0777fO>> {

    /* renamed from: a */
    public String f1844a;

    /* renamed from: b */
    public String f1845b;

    /* renamed from: c */
    public C0195JU f1846c;

    /* renamed from: d */
    public int[] f1847d = {2131230923, 1, 2131230855};

    /* renamed from: e */
    public double f1848e = 0.0d;

    /* renamed from: f */
    public int f1849f = 0;

    public C0612aU(Context context, String str, String str2, C0195JU ju, int i) {
        super(context);
        this.f1844a = str;
        this.f1846c = ju;
        this.f1845b = str2;
        this.f1849f = i;
        StringBuilder sb = new StringBuilder();
        sb.append("Customer_Loader:");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        Log.d("Customer_hdr_Loader:=", sb.toString());
    }

    public ArrayList<C0777fO> loadInBackground() {
        ArrayList<C0777fO> arrayList = new ArrayList<>();
        if (this.f1849f == 1) {
            Cursor X = !C0195JU.f451k ? this.f1846c.mo488X() : this.f1846c.mo469M(this.f1845b);
            X.getCount();
            arrayList.clear();
            C0780fR fRVar = new C0780fR();
            X.moveToFirst();
            while (!X.isAfterLast()) {
                C0777fO fOVar = new C0777fO(X.getString(fRVar.mo4360a(X, Attribute.f2026ID)), X.getString(fRVar.mo4360a(X, "_id")), "", X.getString(fRVar.mo4360a(X, "cr_amount")), X.getString(fRVar.mo4360a(X, "db_amount")), X.getString(fRVar.mo4360a(X, "net_balance")), !C0195JU.f451k ? "" : X.getString(X.getColumnIndex("curr_name")));
                arrayList.add(fOVar);
                X.moveToNext();
            }
            fRVar.mo4361a();
            X.close();
        }
        return arrayList;
    }
}
