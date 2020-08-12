package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.valdio.valdioveliu.recyclerview.CustomerList;

/* renamed from: fI */
class C0771fI extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ CustomerList f2946a;

    public C0771fI(CustomerList customerList) {
        this.f2946a = customerList;
    }

    public void onPageFinished(WebView webView, String str) {
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
