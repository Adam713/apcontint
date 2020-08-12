package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.valdio.valdioveliu.recyclerview.CustomerList_tmp;

/* renamed from: GI */
class C0122GI extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ CustomerList_tmp f273a;

    public C0122GI(CustomerList_tmp customerList_tmp) {
        this.f273a = customerList_tmp;
    }

    public void onPageFinished(WebView webView, String str) {
        webView.loadUrl("javascript:DisplayItem_details('2','8','7')");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
