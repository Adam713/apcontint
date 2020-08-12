package p000;

import android.app.Dialog;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

/* renamed from: KO */
class C0211KO implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ Dialog f532a;

    /* renamed from: b */
    public final /* synthetic */ C1134wP f533b;

    public C0211KO(C1134wP wPVar, Dialog dialog) {
        this.f533b = wPVar;
        this.f532a = dialog;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Log.d("tran_type_pos=", String.valueOf(i));
        C1134wP wPVar = this.f533b;
        wPVar.mo5315h(wPVar.f3979k);
        this.f533b.f3935B.notifyDataSetChanged();
        C1134wP wPVar2 = this.f533b;
        wPVar2.f3938E = 1;
        if (i == 0) {
            wPVar2.mo5307d();
            C1134wP wPVar3 = this.f533b;
            C0195JU ju = wPVar3.f3989p;
            ListView listView = wPVar3.f3936C;
            String K = ju.mo465K(wPVar3.f3963c);
            C1134wP wPVar4 = this.f533b;
            double a = wPVar4.mo5288a(wPVar4.f3935B.f863d);
            C1134wP wPVar5 = this.f533b;
            ju.mo507a(listView, K, a, wPVar5.f3956W, wPVar5.f3957X);
            C0195JU ju2 = this.f533b.f3989p;
            StringBuilder sb = new StringBuilder();
            C1134wP wPVar6 = this.f533b;
            sb.append(wPVar6.f3989p.mo465K(wPVar6.f3963c));
            sb.append(".pdf");
            ju2.mo484U(sb.toString());
        } else if (i == 1) {
            wPVar2.mo5307d();
            C1134wP wPVar7 = this.f533b;
            String str = "cus_details.jpg";
            this.f533b.f3989p.mo521a(wPVar7.f3989p.mo493a(wPVar7.f3936C, wPVar7.f3947N), str);
            this.f533b.f3989p.mo482T(str);
        } else if (i == 2) {
            wPVar2.f3954U = 2;
            if (wPVar2.f3967e.length() < 3) {
                C1134wP wPVar8 = this.f533b;
                C0142HH.m298a(wPVar8.f3961b, wPVar8.f3963c, wPVar8.f3967e).show(this.f533b.getActivity().getFragmentManager(), "CUSTOMER");
            } else {
                C1134wP wPVar9 = this.f533b;
                C0195JU ju3 = wPVar9.f3989p;
                ju3.mo634y(wPVar9.f3967e, ju3.mo531b(wPVar9.f3936C, wPVar9.f3963c, wPVar9.mo5288a(wPVar9.f3935B.f863d)));
            }
        }
        this.f532a.dismiss();
    }
}
