package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: SM */
public class C0388SM extends ArrayAdapter<C0082EH> implements Filterable {

    /* renamed from: a */
    public Context f1130a;

    /* renamed from: b */
    public LayoutInflater f1131b;

    /* renamed from: c */
    public int f1132c;

    /* renamed from: d */
    public List<C0082EH> f1133d;

    /* renamed from: e */
    public List<C0082EH> f1134e;

    /* renamed from: f */
    public C0389a f1135f;

    /* renamed from: g */
    public String f1136g = "";

    /* renamed from: h */
    public SparseBooleanArray f1137h = new SparseBooleanArray();

    /* renamed from: i */
    public ArrayList<Integer> f1138i = new ArrayList<>();

    /* renamed from: j */
    public Bitmap f1139j;

    /* renamed from: k */
    public Bitmap f1140k;

    /* renamed from: l */
    public int[] f1141l = {2131230923, 1, 2131230855};

    /* renamed from: SM$a */
    private class C0389a extends Filter {
        public C0389a() {
        }

        public /* synthetic */ C0389a(C0388SM sm, C0368RM rm) {
            this();
        }

        public FilterResults performFiltering(CharSequence charSequence) {
            Object obj;
            FilterResults filterResults = new FilterResults();
            C0388SM.this.f1136g = charSequence.toString();
            if (charSequence == null || charSequence.length() <= 0) {
                filterResults.count = C0388SM.this.f1134e.size();
                obj = C0388SM.this.f1134e;
            } else {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                String str = "";
                String str2 = ",";
                if (C0195JU.f452l.size() == 0) {
                    while (i < C0388SM.this.f1134e.size()) {
                        if (((C0082EH) C0388SM.this.f1134e.get(i)).mo192g().toUpperCase().contains(charSequence.toString().toUpperCase()) || ((((C0082EH) C0388SM.this.f1134e.get(i)).mo189e() != null && ((C0082EH) C0388SM.this.f1134e.get(i)).mo189e().toUpperCase().contains(charSequence.toString().toUpperCase())) || ((C0082EH) C0388SM.this.f1134e.get(i)).mo180a().replaceAll(str2, str).toUpperCase().contains(charSequence.toString().toUpperCase()))) {
                            C0082EH eh = new C0082EH(((C0082EH) C0388SM.this.f1134e.get(i)).mo191f(), ((C0082EH) C0388SM.this.f1134e.get(i)).mo192g(), ((C0082EH) C0388SM.this.f1134e.get(i)).mo189e(), Double.valueOf(((C0082EH) C0388SM.this.f1134e.get(i)).mo180a().replaceAll(str2, str)).doubleValue(), ((C0082EH) C0388SM.this.f1134e.get(i)).mo193h(), ((C0082EH) C0388SM.this.f1134e.get(i)).mo185c(), ((C0082EH) C0388SM.this.f1134e.get(i)).mo187d(), ((C0082EH) C0388SM.this.f1134e.get(i)).mo183b());
                            arrayList.add(eh);
                        }
                        i++;
                    }
                } else {
                    while (i < C0195JU.f452l.size()) {
                        if (((C0082EH) C0195JU.f452l.get(i)).mo192g().toUpperCase().contains(charSequence.toString().toUpperCase()) || ((((C0082EH) C0195JU.f452l.get(i)).mo189e() != null && ((C0082EH) C0195JU.f452l.get(i)).mo189e().toUpperCase().contains(charSequence.toString().toUpperCase())) || ((C0082EH) C0195JU.f452l.get(i)).mo180a().replaceAll(str2, str).toUpperCase().contains(charSequence.toString().toUpperCase()))) {
                            Log.d("cusList_all_name=", ((C0082EH) C0195JU.f452l.get(i)).mo192g().toUpperCase());
                            StringBuilder sb = new StringBuilder();
                            sb.append(((C0082EH) C0195JU.f452l.get(i)).mo183b().toUpperCase());
                            sb.append(":");
                            Log.d("cusList_all_curr=", sb.toString());
                            C0082EH eh2 = new C0082EH(((C0082EH) C0195JU.f452l.get(i)).mo191f(), ((C0082EH) C0195JU.f452l.get(i)).mo192g(), ((C0082EH) C0195JU.f452l.get(i)).mo189e(), Double.valueOf(((C0082EH) C0195JU.f452l.get(i)).mo180a().replaceAll(str2, str)).doubleValue(), ((C0082EH) C0195JU.f452l.get(i)).mo193h(), ((C0082EH) C0195JU.f452l.get(i)).mo185c(), ((C0082EH) C0195JU.f452l.get(i)).mo187d(), ((C0082EH) C0195JU.f452l.get(i)).mo183b());
                            arrayList.add(eh2);
                        }
                        i++;
                    }
                }
                filterResults.count = arrayList.size();
                obj = arrayList;
            }
            filterResults.values = obj;
            return filterResults;
        }

        public void publishResults(CharSequence charSequence, FilterResults filterResults) {
            try {
                C0388SM.this.f1133d = (ArrayList) filterResults.values;
                C0388SM.this.notifyDataSetChanged();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: SM$b */
    private static class C0390b {

        /* renamed from: a */
        public TextView f1143a;

        /* renamed from: b */
        public TextView f1144b;

        /* renamed from: c */
        public TextView f1145c;

        /* renamed from: d */
        public TextView f1146d;

        /* renamed from: e */
        public ImageView f1147e;

        /* renamed from: f */
        public ImageView f1148f;

        /* renamed from: g */
        public TextView f1149g;

        /* renamed from: h */
        public TextView f1150h;

        /* renamed from: i */
        public String f1151i;

        /* renamed from: j */
        public String f1152j;

        /* renamed from: k */
        public int f1153k;

        public C0390b() {
        }

        public /* synthetic */ C0390b(C0368RM rm) {
            this();
        }
    }

    public C0388SM(Context context, int i, List<C0082EH> list) {
        super(context, i, list);
        this.f1130a = context;
        this.f1133d = list;
        this.f1134e = list;
        this.f1132c = i;
        this.f1131b = LayoutInflater.from(context);
        this.f1139j = ((BitmapDrawable) context.getResources().getDrawable(this.f1141l[0])).getBitmap();
        this.f1140k = ((BitmapDrawable) context.getResources().getDrawable(this.f1141l[2])).getBitmap();
    }

    /* renamed from: a */
    public int mo1179a() {
        return this.f1137h.size();
    }

    /* renamed from: a */
    public void mo1180a(int i) {
        if (this.f1138i.contains(Integer.valueOf(i))) {
            this.f1138i.remove(Integer.valueOf(i));
        } else {
            this.f1138i.add(Integer.valueOf(i));
        }
        mo1181a(i, !this.f1137h.get(i));
    }

    /* renamed from: a */
    public void mo1181a(int i, boolean z) {
        if (z) {
            this.f1137h.put(i, z);
        } else {
            this.f1137h.delete(i);
        }
        notifyDataSetChanged();
    }

    /* renamed from: a */
    public void remove(C0082EH eh) {
        this.f1133d.remove(eh);
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public SparseBooleanArray mo1183b() {
        return this.f1137h;
    }

    /* renamed from: c */
    public void mo1184c() {
        this.f1137h = new SparseBooleanArray();
        notifyDataSetChanged();
    }

    public int getCount() {
        List<C0082EH> list = this.f1133d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public Filter getFilter() {
        if (this.f1135f == null) {
            this.f1135f = new C0389a(this, null);
        }
        return this.f1135f;
    }

    public C0082EH getItem(int i) {
        return (C0082EH) this.f1133d.get(i);
    }

    public long getItemId(int i) {
        return (long) this.f1133d.indexOf(getItem(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0468 A[Catch:{ Exception -> 0x0481 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0479 A[Catch:{ Exception -> 0x0481 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r17, android.view.View r18, android.view.ViewGroup r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f1132c     // Catch:{ Exception -> 0x047f }
            r3 = 2131492938(0x7f0c004a, float:1.8609342E38)
            r4 = 2131296389(0x7f090085, float:1.8210693E38)
            r5 = 2131296385(0x7f090081, float:1.8210685E38)
            r6 = 2131296394(0x7f09008a, float:1.8210703E38)
            java.lang.String r7 = "#FFFFFF"
            r8 = 0
            if (r2 != r3) goto L_0x007b
            SM$b r2 = new SM$b     // Catch:{ Exception -> 0x047f }
            r2.<init>(r8)     // Catch:{ Exception -> 0x047f }
            android.view.LayoutInflater r3 = r0.f1131b     // Catch:{ Exception -> 0x047f }
            int r9 = r0.f1132c     // Catch:{ Exception -> 0x047f }
            android.view.View r3 = r3.inflate(r9, r8)     // Catch:{ Exception -> 0x047f }
            android.view.View r5 = r3.findViewById(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0481 }
            r2.f1143a = r5     // Catch:{ Exception -> 0x0481 }
            android.view.View r5 = r3.findViewById(r6)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0481 }
            r2.f1144b = r5     // Catch:{ Exception -> 0x0481 }
            android.view.View r4 = r3.findViewById(r4)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0481 }
            r2.f1145c = r4     // Catch:{ Exception -> 0x0481 }
            r3.setTag(r2)     // Catch:{ Exception -> 0x0481 }
            int r4 = android.graphics.Color.parseColor(r7)     // Catch:{ Exception -> 0x0481 }
            r3.setBackgroundColor(r4)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = r2.f1143a     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.mo191f()     // Catch:{ Exception -> 0x0481 }
            r4.setText(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = r2.f1144b     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.mo192g()     // Catch:{ Exception -> 0x0481 }
            r4.setText(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r2 = r2.f1145c     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r4 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r4 = (p000.C0082EH) r4     // Catch:{ Exception -> 0x0481 }
        L_0x0072:
            java.lang.String r4 = r4.mo189e()     // Catch:{ Exception -> 0x0481 }
        L_0x0076:
            r2.setText(r4)     // Catch:{ Exception -> 0x0481 }
            goto L_0x045c
        L_0x007b:
            int r2 = r0.f1132c     // Catch:{ Exception -> 0x047f }
            r3 = 2131492982(0x7f0c0076, float:1.8609431E38)
            if (r2 != r3) goto L_0x0108
            SM$b r2 = new SM$b     // Catch:{ Exception -> 0x047f }
            r2.<init>(r8)     // Catch:{ Exception -> 0x047f }
            android.view.LayoutInflater r3 = r0.f1131b     // Catch:{ Exception -> 0x047f }
            int r4 = r0.f1132c     // Catch:{ Exception -> 0x047f }
            android.view.View r3 = r3.inflate(r4, r8)     // Catch:{ Exception -> 0x047f }
            r4 = 2131296455(0x7f0900c7, float:1.8210827E38)
            android.view.View r4 = r3.findViewById(r4)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0481 }
            r2.f1143a = r4     // Catch:{ Exception -> 0x0481 }
            r4 = 2131296664(0x7f090198, float:1.8211251E38)
            android.view.View r4 = r3.findViewById(r4)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0481 }
            r2.f1144b = r4     // Catch:{ Exception -> 0x0481 }
            r4 = 2131296322(0x7f090042, float:1.8210557E38)
            android.view.View r4 = r3.findViewById(r4)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0481 }
            r2.f1145c = r4     // Catch:{ Exception -> 0x0481 }
            r4 = 2131296323(0x7f090043, float:1.821056E38)
            android.view.View r4 = r3.findViewById(r4)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0481 }
            r2.f1146d = r4     // Catch:{ Exception -> 0x0481 }
            r3.setTag(r2)     // Catch:{ Exception -> 0x0481 }
            int r4 = android.graphics.Color.parseColor(r7)     // Catch:{ Exception -> 0x0481 }
            r3.setBackgroundColor(r4)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = r2.f1143a     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.mo191f()     // Catch:{ Exception -> 0x0481 }
            r4.setText(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = r2.f1144b     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.mo192g()     // Catch:{ Exception -> 0x0481 }
            r4.setText(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = r2.f1145c     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.mo189e()     // Catch:{ Exception -> 0x0481 }
            r4.setText(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r2 = r2.f1146d     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r4 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r4 = (p000.C0082EH) r4     // Catch:{ Exception -> 0x0481 }
            java.lang.String r4 = r4.mo187d()     // Catch:{ Exception -> 0x0481 }
            goto L_0x0076
        L_0x0108:
            int r2 = r0.f1132c     // Catch:{ Exception -> 0x047f }
            r3 = 2131492978(0x7f0c0072, float:1.8609423E38)
            if (r2 != r3) goto L_0x0159
            SM$b r2 = new SM$b     // Catch:{ Exception -> 0x047f }
            r2.<init>(r8)     // Catch:{ Exception -> 0x047f }
            android.view.LayoutInflater r3 = r0.f1131b     // Catch:{ Exception -> 0x047f }
            int r4 = r0.f1132c     // Catch:{ Exception -> 0x047f }
            android.view.View r3 = r3.inflate(r4, r8)     // Catch:{ Exception -> 0x047f }
            r4 = 2131296475(0x7f0900db, float:1.8210868E38)
            android.view.View r4 = r3.findViewById(r4)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0481 }
            r2.f1143a = r4     // Catch:{ Exception -> 0x0481 }
            r4 = 2131296474(0x7f0900da, float:1.8210866E38)
            android.view.View r4 = r3.findViewById(r4)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0481 }
            r2.f1144b = r4     // Catch:{ Exception -> 0x0481 }
            r3.setTag(r2)     // Catch:{ Exception -> 0x0481 }
            int r4 = android.graphics.Color.parseColor(r7)     // Catch:{ Exception -> 0x0481 }
            r3.setBackgroundColor(r4)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = r2.f1143a     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.mo192g()     // Catch:{ Exception -> 0x0481 }
            r4.setText(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r2 = r2.f1144b     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r4 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r4 = (p000.C0082EH) r4     // Catch:{ Exception -> 0x0481 }
            goto L_0x0072
        L_0x0159:
            int r2 = r0.f1132c     // Catch:{ Exception -> 0x047f }
            r3 = 2131492935(0x7f0c0047, float:1.8609336E38)
            r9 = 2131296495(0x7f0900ef, float:1.8210908E38)
            r10 = 2131296317(0x7f09003d, float:1.8210547E38)
            r11 = 33
            r12 = -65536(0xffffffffffff0000, float:NaN)
            java.lang.String r13 = ","
            java.lang.String r14 = ""
            if (r2 != r3) goto L_0x0314
            SM$b r2 = new SM$b     // Catch:{ Exception -> 0x047f }
            r2.<init>(r8)     // Catch:{ Exception -> 0x047f }
            android.view.LayoutInflater r3 = r0.f1131b     // Catch:{ Exception -> 0x047f }
            int r15 = r0.f1132c     // Catch:{ Exception -> 0x047f }
            android.view.View r3 = r3.inflate(r15, r8)     // Catch:{ Exception -> 0x047f }
            android.view.View r5 = r3.findViewById(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0481 }
            r2.f1143a = r5     // Catch:{ Exception -> 0x0481 }
            android.view.View r5 = r3.findViewById(r6)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0481 }
            r2.f1144b = r5     // Catch:{ Exception -> 0x0481 }
            android.view.View r4 = r3.findViewById(r4)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0481 }
            r2.f1145c = r4     // Catch:{ Exception -> 0x0481 }
            android.view.View r4 = r3.findViewById(r10)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0481 }
            r2.f1146d = r4     // Catch:{ Exception -> 0x0481 }
            android.view.View r4 = r3.findViewById(r9)     // Catch:{ Exception -> 0x0481 }
            android.widget.ImageView r4 = (android.widget.ImageView) r4     // Catch:{ Exception -> 0x0481 }
            r2.f1148f = r4     // Catch:{ Exception -> 0x0481 }
            r2.f1151i = r14     // Catch:{ Exception -> 0x0481 }
            r2.f1152j = r14     // Catch:{ Exception -> 0x0481 }
            r4 = 2131296496(0x7f0900f0, float:1.821091E38)
            android.view.View r4 = r3.findViewById(r4)     // Catch:{ Exception -> 0x0481 }
            android.widget.ImageView r4 = (android.widget.ImageView) r4     // Catch:{ Exception -> 0x0481 }
            r2.f1147e = r4     // Catch:{ Exception -> 0x0481 }
            android.widget.ImageView r4 = r2.f1147e     // Catch:{ Exception -> 0x0481 }
            RM r5 = new RM     // Catch:{ Exception -> 0x0481 }
            r5.<init>(r0, r2)     // Catch:{ Exception -> 0x0481 }
            r4.setOnClickListener(r5)     // Catch:{ Exception -> 0x0481 }
            r4 = 2131296377(0x7f090079, float:1.8210669E38)
            android.view.View r4 = r3.findViewById(r4)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = (android.widget.TextView) r4     // Catch:{ Exception -> 0x0481 }
            r2.f1150h = r4     // Catch:{ Exception -> 0x0481 }
            r3.setTag(r2)     // Catch:{ Exception -> 0x0481 }
            int r4 = android.graphics.Color.parseColor(r7)     // Catch:{ Exception -> 0x0481 }
            r3.setBackgroundColor(r4)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = r2.f1143a     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.mo191f()     // Catch:{ Exception -> 0x0481 }
            r4.setText(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = r2.f1144b     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.mo192g()     // Catch:{ Exception -> 0x0481 }
            r4.setText(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = r2.f1145c     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.mo189e()     // Catch:{ Exception -> 0x0481 }
            r4.setText(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = r2.f1146d     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.mo180a()     // Catch:{ Exception -> 0x0481 }
            r4.setText(r5)     // Catch:{ Exception -> 0x0481 }
            r2.f1153k = r1     // Catch:{ Exception -> 0x0481 }
            android.content.Context r4 = r0.f1130a     // Catch:{ Exception -> 0x0481 }
            lH r4 = p000.C0889lH.m2935a(r4)     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            int r5 = r5.mo193h()     // Catch:{ Exception -> 0x0481 }
            sH r4 = r4.mo4598a(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.ImageView r5 = r2.f1148f     // Catch:{ Exception -> 0x0481 }
            r4.mo5081a(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = r2.f1150h     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.mo194i()     // Catch:{ Exception -> 0x0481 }
            r4.setText(r5)     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r4 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r4 = (p000.C0082EH) r4     // Catch:{ Exception -> 0x0481 }
            java.lang.String r4 = r4.mo187d()     // Catch:{ Exception -> 0x0481 }
            r2.f1151i = r4     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r4 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r4 = (p000.C0082EH) r4     // Catch:{ Exception -> 0x0481 }
            java.lang.String r4 = r4.mo183b()     // Catch:{ Exception -> 0x0481 }
            r2.f1152j = r4     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r4 = r2.f1144b     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.mo183b()     // Catch:{ Exception -> 0x0481 }
            r4.setTag(r5)     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r4 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r4 = (p000.C0082EH) r4     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r4.mo192g()     // Catch:{ Exception -> 0x0481 }
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.toLowerCase(r6)     // Catch:{ Exception -> 0x0481 }
            java.lang.String r6 = r0.f1136g     // Catch:{ Exception -> 0x0481 }
            boolean r6 = r5.contains(r6)     // Catch:{ Exception -> 0x0481 }
            if (r6 == 0) goto L_0x02b6
            java.lang.String r6 = r0.f1136g     // Catch:{ Exception -> 0x0481 }
            int r5 = r5.indexOf(r6)     // Catch:{ Exception -> 0x0481 }
            java.lang.String r6 = r0.f1136g     // Catch:{ Exception -> 0x0481 }
            int r6 = r6.length()     // Catch:{ Exception -> 0x0481 }
            int r6 = r6 + r5
            android.text.Spannable$Factory r8 = android.text.Spannable.Factory.getInstance()     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r9 = r2.f1144b     // Catch:{ Exception -> 0x0481 }
            java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x0481 }
            android.text.Spannable r8 = r8.newSpannable(r9)     // Catch:{ Exception -> 0x0481 }
            android.text.style.ForegroundColorSpan r9 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x0481 }
            r9.<init>(r12)     // Catch:{ Exception -> 0x0481 }
            r8.setSpan(r9, r5, r6, r11)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r5 = r2.f1144b     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView$BufferType r6 = android.widget.TextView.BufferType.SPANNABLE     // Catch:{ Exception -> 0x0481 }
            r5.setText(r8, r6)     // Catch:{ Exception -> 0x0481 }
        L_0x02b6:
            java.lang.String r4 = r4.mo180a()     // Catch:{ Exception -> 0x0481 }
            java.lang.String r4 = r4.replaceAll(r13, r14)     // Catch:{ Exception -> 0x0481 }
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0481 }
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r0.f1136g     // Catch:{ Exception -> 0x0481 }
            boolean r5 = r4.contains(r5)     // Catch:{ Exception -> 0x0481 }
            if (r5 == 0) goto L_0x045c
            java.lang.String r5 = r0.f1136g     // Catch:{ Exception -> 0x0481 }
            int r4 = r4.indexOf(r5)     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r0.f1136g     // Catch:{ Exception -> 0x0481 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x0481 }
            int r5 = r5 + r4
            android.widget.TextView r6 = r2.f1146d     // Catch:{ Exception -> 0x0481 }
            java.lang.CharSequence r6 = r6.getText()     // Catch:{ Exception -> 0x0481 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0481 }
            int r8 = r6.length()     // Catch:{ Exception -> 0x0481 }
            java.lang.String r9 = r6.replaceAll(r13, r14)     // Catch:{ Exception -> 0x0481 }
            int r9 = r9.length()     // Catch:{ Exception -> 0x0481 }
            int r8 = r8 - r9
            java.lang.String r9 = r0.f1136g     // Catch:{ Exception -> 0x0481 }
            int r9 = r9.length()     // Catch:{ Exception -> 0x0481 }
            if (r9 <= 0) goto L_0x045c
            android.text.Spannable$Factory r9 = android.text.Spannable.Factory.getInstance()     // Catch:{ Exception -> 0x0481 }
            android.text.Spannable r6 = r9.newSpannable(r6)     // Catch:{ Exception -> 0x0481 }
            android.text.style.ForegroundColorSpan r9 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x0481 }
            r9.<init>(r12)     // Catch:{ Exception -> 0x0481 }
            int r5 = r5 + r8
            r6.setSpan(r9, r4, r5, r11)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r2 = r2.f1146d     // Catch:{ Exception -> 0x0481 }
        L_0x030d:
            android.widget.TextView$BufferType r4 = android.widget.TextView.BufferType.SPANNABLE     // Catch:{ Exception -> 0x0481 }
            r2.setText(r6, r4)     // Catch:{ Exception -> 0x0481 }
            goto L_0x045c
        L_0x0314:
            int r2 = r0.f1132c     // Catch:{ Exception -> 0x047f }
            r3 = 2131493006(0x7f0c008e, float:1.860948E38)
            r4 = 2131493009(0x7f0c0091, float:1.8609486E38)
            if (r2 == r3) goto L_0x0327
            int r2 = r0.f1132c     // Catch:{ Exception -> 0x047f }
            if (r2 != r4) goto L_0x0323
            goto L_0x0327
        L_0x0323:
            r3 = r18
            goto L_0x045c
        L_0x0327:
            SM$b r2 = new SM$b     // Catch:{ Exception -> 0x047f }
            r2.<init>(r8)     // Catch:{ Exception -> 0x047f }
            android.view.LayoutInflater r3 = r0.f1131b     // Catch:{ Exception -> 0x047f }
            int r5 = r0.f1132c     // Catch:{ Exception -> 0x047f }
            android.view.View r3 = r3.inflate(r5, r8)     // Catch:{ Exception -> 0x047f }
            android.view.View r5 = r3.findViewById(r6)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0481 }
            r2.f1144b = r5     // Catch:{ Exception -> 0x0481 }
            android.view.View r5 = r3.findViewById(r10)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0481 }
            r2.f1146d = r5     // Catch:{ Exception -> 0x0481 }
            android.view.View r5 = r3.findViewById(r9)     // Catch:{ Exception -> 0x0481 }
            android.widget.ImageView r5 = (android.widget.ImageView) r5     // Catch:{ Exception -> 0x0481 }
            r2.f1148f = r5     // Catch:{ Exception -> 0x0481 }
            r5 = 2131296397(0x7f09008d, float:1.821071E38)
            android.view.View r5 = r3.findViewById(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch:{ Exception -> 0x0481 }
            r2.f1149g = r5     // Catch:{ Exception -> 0x0481 }
            r3.setTag(r2)     // Catch:{ Exception -> 0x0481 }
            int r5 = android.graphics.Color.parseColor(r7)     // Catch:{ Exception -> 0x0481 }
            r3.setBackgroundColor(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r5 = r2.f1144b     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r6 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r6 = r6.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r6 = (p000.C0082EH) r6     // Catch:{ Exception -> 0x0481 }
            java.lang.String r6 = r6.mo192g()     // Catch:{ Exception -> 0x0481 }
            r5.setText(r6)     // Catch:{ Exception -> 0x0481 }
            int r5 = r0.f1132c     // Catch:{ Exception -> 0x0481 }
            if (r5 != r4) goto L_0x0388
            android.widget.TextView r4 = r2.f1149g     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.mo195j()     // Catch:{ Exception -> 0x0481 }
        L_0x0384:
            r4.setText(r5)     // Catch:{ Exception -> 0x0481 }
            goto L_0x039b
        L_0x0388:
            android.widget.TextView r4 = r2.f1149g     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            int r5 = r5.mo185c()     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0481 }
            goto L_0x0384
        L_0x039b:
            android.widget.TextView r4 = r2.f1146d     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.mo180a()     // Catch:{ Exception -> 0x0481 }
            r4.setText(r5)     // Catch:{ Exception -> 0x0481 }
            android.widget.ImageView r4 = r2.f1148f     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r5 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r5 = (p000.C0082EH) r5     // Catch:{ Exception -> 0x0481 }
            int r5 = r5.mo193h()     // Catch:{ Exception -> 0x0481 }
            r4.setImageResource(r5)     // Catch:{ Exception -> 0x0481 }
            java.util.List<EH> r4 = r0.f1133d     // Catch:{ Exception -> 0x0481 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ Exception -> 0x0481 }
            EH r4 = (p000.C0082EH) r4     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r4.mo192g()     // Catch:{ Exception -> 0x0481 }
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r5.toLowerCase(r6)     // Catch:{ Exception -> 0x0481 }
            java.lang.String r6 = r0.f1136g     // Catch:{ Exception -> 0x0481 }
            boolean r6 = r5.contains(r6)     // Catch:{ Exception -> 0x0481 }
            if (r6 == 0) goto L_0x0403
            java.lang.String r6 = r0.f1136g     // Catch:{ Exception -> 0x0481 }
            int r5 = r5.indexOf(r6)     // Catch:{ Exception -> 0x0481 }
            java.lang.String r6 = r0.f1136g     // Catch:{ Exception -> 0x0481 }
            int r6 = r6.length()     // Catch:{ Exception -> 0x0481 }
            int r6 = r6 + r5
            android.text.Spannable$Factory r8 = android.text.Spannable.Factory.getInstance()     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r9 = r2.f1144b     // Catch:{ Exception -> 0x0481 }
            java.lang.CharSequence r9 = r9.getText()     // Catch:{ Exception -> 0x0481 }
            android.text.Spannable r8 = r8.newSpannable(r9)     // Catch:{ Exception -> 0x0481 }
            android.text.style.ForegroundColorSpan r9 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x0481 }
            r9.<init>(r12)     // Catch:{ Exception -> 0x0481 }
            r8.setSpan(r9, r5, r6, r11)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r5 = r2.f1144b     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView$BufferType r6 = android.widget.TextView.BufferType.SPANNABLE     // Catch:{ Exception -> 0x0481 }
            r5.setText(r8, r6)     // Catch:{ Exception -> 0x0481 }
        L_0x0403:
            java.lang.String r4 = r4.mo180a()     // Catch:{ Exception -> 0x0481 }
            java.lang.String r4 = r4.replaceAll(r13, r14)     // Catch:{ Exception -> 0x0481 }
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0481 }
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r0.f1136g     // Catch:{ Exception -> 0x0481 }
            boolean r5 = r4.contains(r5)     // Catch:{ Exception -> 0x0481 }
            if (r5 == 0) goto L_0x045c
            java.lang.String r5 = r0.f1136g     // Catch:{ Exception -> 0x0481 }
            int r4 = r4.indexOf(r5)     // Catch:{ Exception -> 0x0481 }
            java.lang.String r5 = r0.f1136g     // Catch:{ Exception -> 0x0481 }
            int r5 = r5.length()     // Catch:{ Exception -> 0x0481 }
            int r5 = r5 + r4
            android.widget.TextView r6 = r2.f1146d     // Catch:{ Exception -> 0x0481 }
            java.lang.CharSequence r6 = r6.getText()     // Catch:{ Exception -> 0x0481 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0481 }
            int r8 = r6.length()     // Catch:{ Exception -> 0x0481 }
            java.lang.String r9 = r6.replaceAll(r13, r14)     // Catch:{ Exception -> 0x0481 }
            int r9 = r9.length()     // Catch:{ Exception -> 0x0481 }
            int r8 = r8 - r9
            java.lang.String r9 = r0.f1136g     // Catch:{ Exception -> 0x0481 }
            int r9 = r9.length()     // Catch:{ Exception -> 0x0481 }
            if (r9 <= 0) goto L_0x045c
            android.text.Spannable$Factory r9 = android.text.Spannable.Factory.getInstance()     // Catch:{ Exception -> 0x0481 }
            android.text.Spannable r6 = r9.newSpannable(r6)     // Catch:{ Exception -> 0x0481 }
            android.text.style.ForegroundColorSpan r9 = new android.text.style.ForegroundColorSpan     // Catch:{ Exception -> 0x0481 }
            r9.<init>(r12)     // Catch:{ Exception -> 0x0481 }
            int r5 = r5 + r8
            r6.setSpan(r9, r4, r5, r11)     // Catch:{ Exception -> 0x0481 }
            android.widget.TextView r2 = r2.f1146d     // Catch:{ Exception -> 0x0481 }
            goto L_0x030d
        L_0x045c:
            java.util.ArrayList<java.lang.Integer> r2 = r0.f1138i     // Catch:{ Exception -> 0x0481 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x0481 }
            boolean r1 = r2.contains(r1)     // Catch:{ Exception -> 0x0481 }
            if (r1 == 0) goto L_0x0479
            android.content.Context r1 = r0.f1130a     // Catch:{ Exception -> 0x0481 }
            r2 = 2131755101(0x7f10005d, float:1.9141072E38)
            java.lang.String r1 = r1.getString(r2)     // Catch:{ Exception -> 0x0481 }
            int r1 = android.graphics.Color.parseColor(r1)     // Catch:{ Exception -> 0x0481 }
        L_0x0475:
            r3.setBackgroundColor(r1)     // Catch:{ Exception -> 0x0481 }
            goto L_0x047e
        L_0x0479:
            int r1 = android.graphics.Color.parseColor(r7)     // Catch:{ Exception -> 0x0481 }
            goto L_0x0475
        L_0x047e:
            return r3
        L_0x047f:
            r3 = r18
        L_0x0481:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0388SM.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
