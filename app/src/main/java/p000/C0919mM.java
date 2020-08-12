package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;

/* renamed from: mM */
class C0919mM extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ FragmentStatePagerSupport_Main f3337a;

    public C0919mM(FragmentStatePagerSupport_Main fragmentStatePagerSupport_Main) {
        this.f3337a = fragmentStatePagerSupport_Main;
    }

    public void onPageFinished(WebView webView, String str) {
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
