package p000;

import android.database.Cursor;
import android.view.View;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter.ViewBinder;
import android.widget.TextView;
import com.valdio.valdioveliu.recyclerview.Report3_customer_date;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: cO */
class C0645cO implements ViewBinder {

    /* renamed from: a */
    public final /* synthetic */ Report3_customer_date f1945a;

    public C0645cO(Report3_customer_date report3_customer_date) {
        this.f1945a = report3_customer_date;
    }

    public boolean setViewValue(View view, Cursor cursor, int i) {
        if (i == cursor.getColumnIndex("amount")) {
            ((TextView) view).setText(NumberFormat.getInstance(Locale.ENGLISH).format((long) cursor.getInt(i)));
            return true;
        } else if (i != cursor.getColumnIndex("_in")) {
            return false;
        } else {
            ((ImageView) view).setImageResource(this.f1945a.f2656o[cursor.getInt(i)]);
            return true;
        }
    }
}
