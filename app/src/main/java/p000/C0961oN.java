package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.valdio.valdioveliu.recyclerview.Report2_customer_late;

/* renamed from: oN */
class C0961oN extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ Report2_customer_late f3502a;

    public C0961oN(Report2_customer_late report2_customer_late) {
        this.f3502a = report2_customer_late;
    }

    public void onPageFinished(WebView webView, String str) {
        webView.loadUrl("javascript:DisplayItem_details('5','6','0')");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
