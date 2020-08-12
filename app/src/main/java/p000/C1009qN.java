package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.valdio.valdioveliu.recyclerview.Report2_customer_late_exp;

/* renamed from: qN */
class C1009qN extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ Report2_customer_late_exp f3605a;

    public C1009qN(Report2_customer_late_exp report2_customer_late_exp) {
        this.f3605a = report2_customer_late_exp;
    }

    public void onPageFinished(WebView webView, String str) {
        webView.loadUrl("javascript:DisplayItem_details('5','6','0')");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
