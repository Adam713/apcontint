package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: PS */
class C0332PS extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C0576_S f948a;

    public C0332PS(C0576_S _s) {
        this.f948a = _s;
    }

    public void onPageFinished(WebView webView, String str) {
        webView.loadUrl("javascript:DisplayItem_details('5','6','0')");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
