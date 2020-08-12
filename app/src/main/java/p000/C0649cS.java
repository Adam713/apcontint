package p000;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.util.Log;
import android.widget.TextView;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: cS */
class C0649cS implements LoaderCallbacks<List<String>> {

    /* renamed from: a */
    public final /* synthetic */ C0925mS f1949a;

    public C0649cS(C0925mS mSVar) {
        this.f1949a = mSVar;
    }

    /* renamed from: a */
    public void onLoadFinished(Loader<List<String>> loader, List<String> list) {
        String str;
        this.f1949a.f3364U = (ArrayList) list;
        StringBuilder sb = new StringBuilder();
        sb.append(FragmentStatePagerSupport_Main.m2279h());
        String str2 = ":";
        sb.append(str2);
        sb.append(this.f1949a.f3380k);
        sb.append(str2);
        sb.append(this.f1949a.f3378i);
        String str3 = "trace_E_Loader2=";
        Log.d(str3, sb.toString());
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        C0925mS mSVar = this.f1949a;
        mSVar.f3388s.setText(mSVar.f3347D);
        try {
            TextView textView = this.f1949a.f3388s;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f1949a.f3348E);
            sb2.append(instance.format(Double.parseDouble((String) this.f1949a.f3364U.get(0))));
            sb2.append(" ");
            sb2.append(this.f1949a.f3349F);
            sb2.append(instance.format(Double.parseDouble((String) this.f1949a.f3364U.get(1))));
            if (!C0195JU.f451k) {
                str = "";
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\n");
                sb3.append(this.f1949a.f3380k);
                str = sb3.toString();
            }
            sb2.append(str);
            textView.setText(sb2.toString());
            this.f1949a.mo4743e();
        } catch (Exception unused) {
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(FragmentStatePagerSupport_Main.m2279h());
        sb4.append(str2);
        sb4.append(this.f1949a.f3380k);
        sb4.append(str2);
        sb4.append(this.f1949a.f3378i);
        Log.d(str3, sb4.toString());
    }

    public Loader<List<String>> onCreateLoader(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("onCreateLoader_Footer:");
        sb.append(this.f1949a.f3378i);
        String str = ":";
        sb.append(str);
        sb.append(this.f1949a.f3380k);
        Log.d("Loader=", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FragmentStatePagerSupport_Main.m2279h());
        sb2.append(str);
        sb2.append(this.f1949a.f3380k);
        sb2.append(str);
        sb2.append(this.f1949a.f3378i);
        Log.d("trace_S_Loader2=", sb2.toString());
        FragmentActivity activity = this.f1949a.getActivity();
        C0925mS mSVar = this.f1949a;
        return new C1203zR(activity, mSVar.f3378i, mSVar.f3380k, mSVar.f3372c);
    }

    public void onLoaderReset(Loader<List<String>> loader) {
    }
}
