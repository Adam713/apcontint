package p000;

import android.os.Bundle;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.util.Log;
import android.widget.TextView;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bT */
class C0631bT implements LoaderCallbacks<List<String>> {

    /* renamed from: a */
    public final /* synthetic */ C0967oT f1908a;

    public C0631bT(C0967oT oTVar) {
        this.f1908a = oTVar;
    }

    /* renamed from: a */
    public void onLoadFinished(Loader<List<String>> loader, List<String> list) {
        TextView textView;
        StringBuilder sb;
        this.f1908a.f3519G = (ArrayList) list;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FragmentStatePagerSupport_Main.m2279h());
        String str = ":";
        sb2.append(str);
        sb2.append(this.f1908a.f3526e);
        sb2.append(str);
        sb2.append(this.f1908a.f3524c);
        String str2 = "trace_E_Loader2_mon=";
        Log.d(str2, sb2.toString());
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        try {
            if (this.f1908a.f3519G.size() > 0) {
                String str3 = "\t";
                String str4 = "";
                if (Double.parseDouble((String) this.f1908a.f3519G.get(0)) >= 0.0d) {
                    this.f1908a.f3537p.setImageResource(this.f1908a.f3543v[2]);
                    textView = this.f1908a.f3540s;
                    sb = new StringBuilder();
                    sb.append(this.f1908a.f3523b.mo455E());
                    sb.append(":-");
                    sb.append(instance.format(Double.parseDouble((String) this.f1908a.f3519G.get(0))));
                    if (C0195JU.f451k) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str3);
                        sb3.append(this.f1908a.f3526e);
                        str4 = sb3.toString();
                    }
                    sb.append(str4);
                } else {
                    this.f1908a.f3537p.setImageResource(this.f1908a.f3543v[0]);
                    textView = this.f1908a.f3540s;
                    sb = new StringBuilder();
                    sb.append(this.f1908a.f3523b.mo597m());
                    sb.append(instance.format(Double.parseDouble((String) this.f1908a.f3519G.get(0))));
                    if (C0195JU.f451k) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str3);
                        sb4.append(this.f1908a.f3526e);
                        str4 = sb4.toString();
                    }
                    sb.append(str4);
                }
                textView.setText(sb.toString());
            } else {
                this.f1908a.f3540s.setText(this.f1908a.getActivity().getString(2131755188));
            }
        } catch (Exception unused) {
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(FragmentStatePagerSupport_Main.m2279h());
        sb5.append(str);
        sb5.append(this.f1908a.f3526e);
        sb5.append(str);
        sb5.append(this.f1908a.f3524c);
        Log.d(str2, sb5.toString());
    }

    public Loader<List<String>> onCreateLoader(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("onCreateLoader_Footer:");
        sb.append(this.f1908a.f3524c);
        String str = ":";
        sb.append(str);
        sb.append(this.f1908a.f3526e);
        Log.d("Loader=", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FragmentStatePagerSupport_Main.m2279h());
        sb2.append(str);
        sb2.append(this.f1908a.f3526e);
        sb2.append(str);
        sb2.append(this.f1908a.f3524c);
        Log.d("trace_S_Loader2_hdr=", sb2.toString());
        C0011AR ar = new C0011AR(this.f1908a.getActivity(), this.f1908a.f3524c, this.f1908a.f3526e, this.f1908a.f3523b, 0);
        return ar;
    }

    public void onLoaderReset(Loader<List<String>> loader) {
    }
}
