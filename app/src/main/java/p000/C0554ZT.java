package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ZT */
public class C0554ZT extends FragmentStatePagerAdapter {

    /* renamed from: a */
    public List<C0082EH> f1663a;

    /* renamed from: b */
    public ArrayList<C0260MM> f1664b;

    /* renamed from: c */
    public int f1665c;

    /* renamed from: d */
    public Context f1666d;

    /* renamed from: e */
    public SQLiteDatabase f1667e;

    /* renamed from: f */
    public C0195JU f1668f;

    /* renamed from: g */
    public String f1669g = "";

    /* renamed from: h */
    public double f1670h = 0.0d;

    /* renamed from: i */
    public int[] f1671i = {2131230923, 1, 2131230855};

    /* renamed from: j */
    public C0523YQ f1672j;

    /* renamed from: k */
    public C0576_S f1673k;

    /* renamed from: l */
    public C0967oT f1674l;

    /* renamed from: m */
    public C0216KT f1675m;

    /* renamed from: n */
    public C0239LS f1676n;

    /* renamed from: o */
    public ArrayList<C0082EH> f1677o = new ArrayList<>();

    public C0554ZT(FragmentManager fragmentManager, ArrayList<C0260MM> arrayList, int i, Context context) {
        super(fragmentManager);
        this.f1664b = arrayList;
        this.f1665c = i;
        this.f1666d = context;
        this.f1668f = new C0195JU(this.f1667e, context);
    }

    public C0554ZT(FragmentManager fragmentManager, List<C0082EH> list, int i, Context context) {
        super(fragmentManager);
        this.f1663a = list;
        this.f1665c = i;
        this.f1666d = context;
        this.f1668f = new C0195JU(this.f1667e, context);
    }

    public int getCount() {
        int i = 0;
        if (this.f1665c == 0) {
            List<C0082EH> list = this.f1663a;
            if (list != null) {
                i = list.size();
            }
            return i;
        }
        ArrayList<C0260MM> arrayList = this.f1664b;
        if (arrayList != null) {
            i = arrayList.size();
        }
        return i;
    }

    public Fragment getItem(int i) {
        Log.d("trace_S_getitem_Frag=", FragmentStatePagerSupport_Main.m2279h());
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String str = ":";
        sb.append(str);
        sb.append(this.f1665c);
        sb.append(str);
        sb.append(FragmentStatePagerSupport_Main.f2449b);
        Log.d("Frag.Created=", sb.toString());
        int i2 = this.f1665c;
        if (i2 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append(str);
            sb2.append(this.f1665c);
            sb2.append(str);
            sb2.append(FragmentStatePagerSupport.f2424j);
            Log.d("Frag.Created2=", sb2.toString());
            C0523YQ yq = new C0523YQ((C0082EH) this.f1663a.get(i), i, getCount(), new ArrayList(), this.f1669g, false);
            this.f1672j = yq;
            return this.f1672j;
        } else if (i2 == 1) {
            this.f1673k = new C0576_S((C0260MM) this.f1664b.get(i), i, getCount(), this.f1669g);
            this.f1673k.setRetainInstance(true);
            return this.f1673k;
        } else if (i2 == 3) {
            this.f1674l = new C0967oT((C0260MM) this.f1664b.get(i), i, getCount(), this.f1669g);
            this.f1674l.setRetainInstance(true);
            return this.f1674l;
        } else if (i2 == 2) {
            this.f1676n = new C0239LS((C0260MM) this.f1664b.get(i), i, getCount(), this.f1669g);
            this.f1676n.setRetainInstance(true);
            return this.f1676n;
        } else if (i2 == 4) {
            return !C0195JU.f451k ? C0925mS.m3049a((C0260MM) this.f1664b.get(i), i, getCount(), ((C0260MM) this.f1664b.get(i)).mo890c(), ((C0260MM) this.f1664b.get(i)).mo888a()) : C0925mS.m3049a((C0260MM) this.f1664b.get(i), i, getCount(), ((C0260MM) this.f1664b.get(i)).mo890c(), ((C0260MM) this.f1664b.get(i)).mo888a());
        } else {
            if (i2 != 5) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i);
            sb3.append(str);
            sb3.append(this.f1665c);
            sb3.append(str);
            sb3.append(((C0260MM) this.f1664b.get(i)).mo888a());
            Log.d("Frag5.Created=", sb3.toString());
            this.f1675m = new C0216KT((C0260MM) this.f1664b.get(i), i, getCount(), this.f1669g);
            this.f1675m.setRetainInstance(true);
            return this.f1675m;
        }
    }

    public int getItemPosition(Object obj) {
        return -2;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }
}
