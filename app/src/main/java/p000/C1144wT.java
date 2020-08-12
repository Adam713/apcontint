package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: wT */
class C1144wT extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C0216KT f4020a;

    public C1144wT(C0216KT kt) {
        this.f4020a = kt;
    }

    public void onPageFinished(WebView webView, String str) {
        webView.loadUrl("javascript:DisplayItem_details('5','6','0')");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
