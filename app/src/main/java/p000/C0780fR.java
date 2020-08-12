package p000;

import android.database.Cursor;
import android.support.v4.util.ArrayMap;

/* renamed from: fR */
public class C0780fR {

    /* renamed from: a */
    public ArrayMap<String, Integer> f2964a = new ArrayMap<>();

    /* renamed from: a */
    public int mo4360a(Cursor cursor, String str) {
        if (!this.f2964a.containsKey(str)) {
            this.f2964a.put(str, Integer.valueOf(cursor.getColumnIndex(str)));
        }
        return ((Integer) this.f2964a.get(str)).intValue();
    }

    /* renamed from: a */
    public void mo4361a() {
        this.f2964a.clear();
    }
}
