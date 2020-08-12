package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: cT */
class C0650cT extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C0967oT f1950a;

    public C0650cT(C0967oT oTVar) {
        this.f1950a = oTVar;
    }

    public void onPageFinished(WebView webView, String str) {
        webView.loadUrl("javascript:DisplayItem_details('5','6','0')");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
