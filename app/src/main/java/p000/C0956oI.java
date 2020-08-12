package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.valdio.valdioveliu.recyclerview.CustomerList2;

/* renamed from: oI */
class C0956oI extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ CustomerList2 f3497a;

    public C0956oI(CustomerList2 customerList2) {
        this.f3497a = customerList2;
    }

    public void onPageFinished(WebView webView, String str) {
        webView.loadUrl("javascript:DisplayItem_details('2','8','7')");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
