package p000;

import android.database.Cursor;
import android.view.View;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter.ViewBinder;
import android.widget.TextView;
import com.valdio.valdioveliu.recyclerview.Report1_customer_bal;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: gN */
class C0795gN implements ViewBinder {

    /* renamed from: a */
    public final /* synthetic */ Report1_customer_bal f3016a;

    public C0795gN(Report1_customer_bal report1_customer_bal) {
        this.f3016a = report1_customer_bal;
    }

    public boolean setViewValue(View view, Cursor cursor, int i) {
        if (i == cursor.getColumnIndex("amount")) {
            ((TextView) view).setText(NumberFormat.getInstance(Locale.ENGLISH).format((long) cursor.getInt(i)));
            return true;
        } else if (i != cursor.getColumnIndex("_in")) {
            return false;
        } else {
            ((ImageView) view).setImageResource(this.f3016a.f2545l[cursor.getInt(i)]);
            return true;
        }
    }
}
