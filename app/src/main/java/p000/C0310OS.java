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

/* renamed from: OS */
class C0310OS implements LoaderCallbacks<List<String>> {

    /* renamed from: a */
    public final /* synthetic */ C0576_S f888a;

    public C0310OS(C0576_S _s) {
        this.f888a = _s;
    }

    /* renamed from: a */
    public void onLoadFinished(Loader<List<String>> loader, List<String> list) {
        TextView textView;
        StringBuilder sb;
        this.f888a.f1741G = (ArrayList) list;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FragmentStatePagerSupport_Main.m2279h());
        String str = ":";
        sb2.append(str);
        sb2.append(this.f888a.f1748e);
        sb2.append(str);
        sb2.append(this.f888a.f1746c);
        String str2 = "trace_E_Loader2_hdr=";
        Log.d(str2, sb2.toString());
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        try {
            if (this.f888a.f1741G.size() > 0) {
                String str3 = "\t";
                String str4 = "";
                if (Double.parseDouble((String) this.f888a.f1741G.get(0)) >= 0.0d) {
                    this.f888a.f1759p.setImageResource(this.f888a.f1765v[2]);
                    textView = this.f888a.f1762s;
                    sb = new StringBuilder();
                    sb.append(this.f888a.f1745b.mo455E());
                    sb.append(instance.format(Double.parseDouble((String) this.f888a.f1741G.get(0))));
                    if (C0195JU.f451k) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str3);
                        sb3.append(this.f888a.f1748e);
                        str4 = sb3.toString();
                    }
                    sb.append(str4);
                } else {
                    this.f888a.f1759p.setImageResource(this.f888a.f1765v[0]);
                    textView = this.f888a.f1762s;
                    sb = new StringBuilder();
                    sb.append(this.f888a.f1745b.mo597m());
                    sb.append(instance.format(Double.parseDouble((String) this.f888a.f1741G.get(0))));
                    if (C0195JU.f451k) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str3);
                        sb4.append(this.f888a.f1748e);
                        str4 = sb4.toString();
                    }
                    sb.append(str4);
                }
                textView.setText(sb.toString());
            } else {
                this.f888a.f1762s.setText(this.f888a.getActivity().getString(2131755188));
            }
        } catch (Exception unused) {
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(FragmentStatePagerSupport_Main.m2279h());
        sb5.append(str);
        sb5.append(this.f888a.f1748e);
        sb5.append(str);
        sb5.append(this.f888a.f1746c);
        Log.d(str2, sb5.toString());
    }

    public Loader<List<String>> onCreateLoader(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("onCreateLoader_Footer:");
        sb.append(this.f888a.f1746c);
        String str = ":";
        sb.append(str);
        sb.append(this.f888a.f1748e);
        Log.d("Loader=", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FragmentStatePagerSupport_Main.m2279h());
        sb2.append(str);
        sb2.append(this.f888a.f1748e);
        sb2.append(str);
        sb2.append(this.f888a.f1746c);
        Log.d("trace_S_Loader2_hdr=", sb2.toString());
        C0011AR ar = new C0011AR(this.f888a.getActivity(), this.f888a.f1746c, this.f888a.f1748e, this.f888a.f1745b, 0);
        return ar;
    }

    public void onLoaderReset(Loader<List<String>> loader) {
    }
}
