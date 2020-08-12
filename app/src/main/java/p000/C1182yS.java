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

/* renamed from: yS */
class C1182yS implements LoaderCallbacks<List<String>> {

    /* renamed from: a */
    public final /* synthetic */ C0239LS f4155a;

    public C1182yS(C0239LS ls) {
        this.f4155a = ls;
    }

    /* renamed from: a */
    public void onLoadFinished(Loader<List<String>> loader, List<String> list) {
        TextView textView;
        StringBuilder sb;
        this.f4155a.f643U = (ArrayList) list;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FragmentStatePagerSupport_Main.m2279h());
        String str = ":";
        sb2.append(str);
        sb2.append(this.f4155a.f651e);
        sb2.append(str);
        sb2.append(this.f4155a.f649c);
        String str2 = "trace_E_Loader2_hdr=";
        Log.d(str2, sb2.toString());
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        try {
            if (this.f4155a.f643U.size() > 0) {
                String str3 = "\t";
                String str4 = "";
                if (Double.parseDouble((String) this.f4155a.f643U.get(0)) >= 0.0d) {
                    this.f4155a.f659m.setImageResource(this.f4155a.f625C[2]);
                    textView = this.f4155a.f658l;
                    sb = new StringBuilder();
                    sb.append(this.f4155a.f632J);
                    sb.append(instance.format(Double.parseDouble((String) this.f4155a.f643U.get(0))));
                    if (C0195JU.f451k) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str3);
                        sb3.append(this.f4155a.f651e);
                        str4 = sb3.toString();
                    }
                    sb.append(str4);
                } else {
                    this.f4155a.f659m.setImageResource(this.f4155a.f625C[0]);
                    textView = this.f4155a.f658l;
                    sb = new StringBuilder();
                    sb.append(this.f4155a.f631I);
                    sb.append(instance.format(Double.parseDouble((String) this.f4155a.f643U.get(0))));
                    if (C0195JU.f451k) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str3);
                        sb4.append(this.f4155a.f651e);
                        str4 = sb4.toString();
                    }
                    sb.append(str4);
                }
                textView.setText(sb.toString());
            } else {
                this.f4155a.f658l.setText(this.f4155a.getActivity().getString(2131755188));
            }
        } catch (Exception unused) {
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(FragmentStatePagerSupport_Main.m2279h());
        sb5.append(str);
        sb5.append(this.f4155a.f651e);
        sb5.append(str);
        sb5.append(this.f4155a.f649c);
        Log.d(str2, sb5.toString());
    }

    public Loader<List<String>> onCreateLoader(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("onCreateLoader_Footer:");
        sb.append(this.f4155a.f649c);
        String str = ":";
        sb.append(str);
        sb.append(this.f4155a.f651e);
        Log.d("Loader=", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FragmentStatePagerSupport_Main.m2279h());
        sb2.append(str);
        sb2.append(this.f4155a.f651e);
        sb2.append(str);
        sb2.append(this.f4155a.f649c);
        Log.d("trace_S_Loader2_hdr=", sb2.toString());
        C0011AR ar = new C0011AR(this.f4155a.getActivity(), this.f4155a.f649c, this.f4155a.f651e, this.f4155a.f648b, 0);
        return ar;
    }

    public void onLoaderReset(Loader<List<String>> loader) {
    }
}
