package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: pS */
class C0995pS extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C0239LS f3580a;

    public C0995pS(C0239LS ls) {
        this.f3580a = ls;
    }

    public void onPageFinished(WebView webView, String str) {
        webView.loadUrl("javascript:DisplayItem_details('5','6','8')");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
