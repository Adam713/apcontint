package p000;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import java.util.ArrayList;

/* renamed from: xR */
public class C1162xR extends AsyncTaskLoader<ArrayList<C0208KL>> {

    /* renamed from: a */
    public String f4095a;

    /* renamed from: b */
    public String f4096b;

    /* renamed from: c */
    public C0195JU f4097c;

    /* renamed from: d */
    public int[] f4098d = {2131230923, 1, 2131230855};

    /* renamed from: e */
    public double f4099e = 0.0d;

    /* renamed from: f */
    public int f4100f = 0;

    public C1162xR(Context context, String str, String str2, C0195JU ju, int i) {
        super(context);
        this.f4095a = str;
        this.f4097c = ju;
        this.f4096b = str2;
        this.f4100f = i;
        StringBuilder sb = new StringBuilder();
        sb.append("Customer_Loader:");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        Log.d("Customer_hdr_Loader:=", sb.toString());
    }

    public ArrayList<C0208KL> loadInBackground() {
        ArrayList<C0208KL> arrayList = new ArrayList<>();
        int i = this.f4100f;
        String str = "days_late";
        String str2 = "amount";
        String str3 = "phone";
        String str4 = "_id";
        String str5 = "_in";
        if (i == 1) {
            Cursor L = !C0195JU.f451k ? this.f4097c.mo468L(this.f4095a) : this.f4097c.mo611r(this.f4095a, this.f4096b);
            arrayList.clear();
            C0780fR fRVar = new C0780fR();
            L.moveToFirst();
            while (!L.isAfterLast()) {
                C0208KL kl = new C0208KL(L.getString(fRVar.mo4360a(L, Attribute.f2026ID)), L.getString(fRVar.mo4360a(L, str4)), L.getString(fRVar.mo4360a(L, str3)), String.valueOf(L.getDouble(fRVar.mo4360a(L, str2))), this.f4098d[L.getInt(fRVar.mo4360a(L, str5))], L.getString(fRVar.mo4360a(L, str)));
                arrayList.add(kl);
                L.moveToNext();
            }
            fRVar.mo4361a();
            L.close();
            return arrayList;
        }
        if (i == 2) {
            Cursor O = !C0195JU.f451k ? this.f4097c.mo472O(this.f4095a) : this.f4097c.mo622u(this.f4095a, this.f4096b);
            arrayList.clear();
            C0780fR fRVar2 = new C0780fR();
            O.moveToFirst();
            while (!O.isAfterLast()) {
                C0208KL kl2 = new C0208KL(O.getString(fRVar2.mo4360a(O, str5)), O.getString(fRVar2.mo4360a(O, str4)), O.getString(fRVar2.mo4360a(O, str3)), String.valueOf(O.getDouble(fRVar2.mo4360a(O, str2))), this.f4098d[O.getInt(fRVar2.mo4360a(O, str5))], O.getString(fRVar2.mo4360a(O, str)));
                arrayList.add(kl2);
                O.moveToNext();
            }
            fRVar2.mo4361a();
            O.close();
            this.f4099e = 0.0d;
            for (int i2 = 0; i2 <= arrayList.size() - 1; i2++) {
                this.f4099e += Double.parseDouble(((C0208KL) arrayList.get(i2)).mo668a().replaceAll(",", "")) * (Double.parseDouble(((C0208KL) arrayList.get(i2)).mo674e()) - 1.0d);
                C0208KL kl3 = (C0208KL) arrayList.get(i2);
                kl3.mo669a(String.valueOf(this.f4099e));
                arrayList.set(i2, kl3);
            }
        }
        return arrayList;
    }
}
