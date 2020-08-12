package p000;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.Loader;
import android.util.Log;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import java.util.ArrayList;
import java.util.List;

/* renamed from: AP */
class C0009AP implements LoaderCallbacks<List<String>> {

    /* renamed from: a */
    public final /* synthetic */ C0523YQ f12a;

    public C0009AP(C0523YQ yq) {
        this.f12a = yq;
    }

    /* renamed from: a */
    public void onLoadFinished(Loader<List<String>> loader, List<String> list) {
        this.f12a.f1558cb = (ArrayList) list;
        StringBuilder sb = new StringBuilder();
        sb.append(FragmentStatePagerSupport_Main.m2279h());
        String str = ":";
        sb.append(str);
        sb.append(this.f12a.f1553b);
        sb.append(str);
        sb.append(this.f12a.f1562e);
        sb.append(str);
        sb.append(this.f12a.f1558cb.size());
        sb.append(str);
        sb.append(list.size());
        Log.d("trace_E_Loader_footer=", sb.toString());
        try {
            this.f12a.mo1553b(1);
        } catch (Exception e) {
            Log.d("footer_err=", e.getMessage());
        }
    }

    public Loader<List<String>> onCreateLoader(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(FragmentStatePagerSupport_Main.m2279h());
        String str = ":";
        sb.append(str);
        sb.append(this.f12a.f1553b);
        sb.append(str);
        sb.append(this.f12a.f1562e);
        Log.d("trace_S_Loader_footer=", sb.toString());
        FragmentActivity activity = this.f12a.getActivity();
        C0523YQ yq = this.f12a;
        return new C0643cM(activity, yq.f1556c, yq.f1562e, yq.f1606v);
    }

    public void onLoaderReset(Loader<List<String>> loader) {
    }
}
