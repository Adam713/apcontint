package p000;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import java.util.ArrayList;
import java.util.List;

/* renamed from: NL */
public class C0279NL extends AsyncTaskLoader<List<C0259ML>> {

    /* renamed from: a */
    public String f761a;

    /* renamed from: b */
    public String f762b;

    /* renamed from: c */
    public C0195JU f763c;

    /* renamed from: d */
    public int[] f764d = {2131230923, 1, 2131230855};

    public C0279NL(Context context, String str, C0195JU ju, String str2) {
        super(context);
        this.f761a = str;
        this.f762b = str2;
        this.f763c = ju;
        StringBuilder sb = new StringBuilder();
        sb.append("Data_All_Loader:");
        sb.append(str);
        Log.d("Data_All_Loader:=", sb.toString());
    }

    public List<C0259ML> loadInBackground() {
        ArrayList arrayList = new ArrayList();
        Cursor n = !C0195JU.f451k ? this.f763c.mo599n(this.f761a) : this.f763c.mo574g(this.f761a, this.f762b);
        arrayList.clear();
        n.moveToFirst();
        while (!n.isAfterLast()) {
            C0259ML ml = new C0259ML(n.getString(n.getColumnIndex("_id")), n.getString(n.getColumnIndex("date_")), String.valueOf(n.getDouble(n.getColumnIndex("amount"))), n.getString(n.getColumnIndex("remarks")), this.f764d[n.getInt(n.getColumnIndex("_in"))], n.getString(n.getColumnIndex(Attribute.NAME)));
            arrayList.add(ml);
            n.moveToNext();
        }
        n.close();
        return arrayList;
    }
}
