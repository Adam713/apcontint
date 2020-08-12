package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.valdio.valdioveliu.recyclerview.CustomerList;

/* renamed from: WH */
class C0473WH extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ CustomerList f1368a;

    public C0473WH(CustomerList customerList) {
        this.f1368a = customerList;
    }

    public void onPageFinished(WebView webView, String str) {
        webView.loadUrl("javascript:DisplayItem_details('2','8','7')");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
