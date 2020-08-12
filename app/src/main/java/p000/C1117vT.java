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

/* renamed from: vT */
class C1117vT implements LoaderCallbacks<List<String>> {

    /* renamed from: a */
    public final /* synthetic */ C0216KT f3881a;

    public C1117vT(C0216KT kt) {
        this.f3881a = kt;
    }

    /* renamed from: a */
    public void onLoadFinished(Loader<List<String>> loader, List<String> list) {
        TextView textView;
        StringBuilder sb;
        this.f3881a.f552N = (ArrayList) list;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FragmentStatePagerSupport_Main.m2279h());
        String str = ":";
        sb2.append(str);
        sb2.append(this.f3881a.f559e);
        sb2.append(str);
        sb2.append(this.f3881a.f557c);
        Log.d("trace_E_Loader2_h=", sb2.toString());
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        try {
            if (this.f3881a.f552N.size() > 0) {
                String str2 = "\t";
                String str3 = "";
                if (Double.parseDouble((String) this.f3881a.f552N.get(0)) >= 0.0d) {
                    textView = this.f3881a.f573s;
                    sb = new StringBuilder();
                    sb.append(this.f3881a.f556b.mo455E());
                    sb.append(str);
                    sb.append(instance.format(Math.abs(Double.parseDouble((String) this.f3881a.f552N.get(0)))));
                    if (C0195JU.f451k) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str2);
                        sb3.append(this.f3881a.f559e);
                        str3 = sb3.toString();
                    }
                    sb.append(str3);
                } else {
                    textView = this.f3881a.f573s;
                    sb = new StringBuilder();
                    sb.append(this.f3881a.f556b.mo597m());
                    sb.append(str);
                    sb.append(instance.format(Math.abs(Double.parseDouble((String) this.f3881a.f552N.get(0)))));
                    if (C0195JU.f451k) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str2);
                        sb4.append(this.f3881a.f559e);
                        str3 = sb4.toString();
                    }
                    sb.append(str3);
                }
                textView.setText(sb.toString());
            } else {
                this.f3881a.f573s.setText(this.f3881a.getActivity().getString(2131755188));
            }
        } catch (Exception unused) {
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(FragmentStatePagerSupport_Main.m2279h());
        sb5.append(str);
        sb5.append(this.f3881a.f559e);
        sb5.append(str);
        sb5.append(this.f3881a.f557c);
        Log.d("trace_E_Loader2_g=", sb5.toString());
    }

    public Loader<List<String>> onCreateLoader(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("onCreateLoader_Footer:");
        sb.append(this.f3881a.f557c);
        String str = ":";
        sb.append(str);
        sb.append(this.f3881a.f559e);
        Log.d("Loader=", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FragmentStatePagerSupport_Main.m2279h());
        sb2.append(str);
        sb2.append(this.f3881a.f559e);
        sb2.append(str);
        sb2.append(this.f3881a.f557c);
        Log.d("trace_S_Loader2_g=", sb2.toString());
        C0011AR ar = new C0011AR(this.f3881a.getActivity(), this.f3881a.f557c, this.f3881a.f559e, this.f3881a.f556b, 1);
        return ar;
    }

    public void onLoaderReset(Loader<List<String>> loader) {
    }
}
