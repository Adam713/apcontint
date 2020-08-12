package p000;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.AsyncTaskLoader;
import java.util.ArrayList;

/* renamed from: YT */
public class C0532YT extends AsyncTaskLoader<ArrayList<C0260MM>> {

    /* renamed from: a */
    public C0195JU f1624a;

    /* renamed from: b */
    public int[] f1625b = {2131230923, 1, 2131230855};

    /* renamed from: c */
    public double f1626c = 0.0d;

    public C0532YT(Context context, C0195JU ju) {
        super(context);
        this.f1624a = ju;
    }

    public ArrayList<C0260MM> loadInBackground() {
        ArrayList<C0260MM> arrayList = new ArrayList<>();
        Cursor z = !C0195JU.f451k ? this.f1624a.mo635z() : this.f1624a.mo444A();
        z.getCount();
        arrayList.clear();
        z.moveToFirst();
        while (!z.isAfterLast()) {
            arrayList.add(new C0260MM(z.getString(z.getColumnIndex("_id")), z.getString(z.getColumnIndex("g_name")), !C0195JU.f451k ? "" : z.getString(z.getColumnIndex("curr_name"))));
            z.moveToNext();
        }
        z.close();
        return arrayList;
    }
}
