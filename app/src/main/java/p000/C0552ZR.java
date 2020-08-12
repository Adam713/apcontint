package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: ZR */
class C0552ZR extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ C0925mS f1661a;

    public C0552ZR(C0925mS mSVar) {
        this.f1661a = mSVar;
    }

    public void onPageFinished(WebView webView, String str) {
        webView.loadUrl("javascript:DisplayItem_details('2','8','7')");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
