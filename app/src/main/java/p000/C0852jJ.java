package p000;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_All;

/* renamed from: jJ */
class C0852jJ extends WebViewClient {

    /* renamed from: a */
    public final /* synthetic */ Customer_Det_List_All f3148a;

    public C0852jJ(Customer_Det_List_All customer_Det_List_All) {
        this.f3148a = customer_Det_List_All;
    }

    public void onPageFinished(WebView webView, String str) {
        webView.loadUrl("javascript:DisplayItem_details('5','6','8')");
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str);
        return true;
    }
}
