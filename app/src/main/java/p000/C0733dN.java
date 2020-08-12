package p000;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import java.util.StringTokenizer;

/* renamed from: dN */
public class C0733dN implements TextWatcher {

    /* renamed from: a */
    public EditText f2853a;

    /* renamed from: b */
    public boolean f2854b;

    /* renamed from: c */
    public final Handler f2855c = new Handler();

    /* renamed from: d */
    public long f2856d;

    /* renamed from: e */
    public boolean f2857e = true;

    /* renamed from: f */
    public Thread f2858f;

    /* renamed from: g */
    public Runnable f2859g = new C0644cN(this);

    public C0733dN(EditText editText) {
        this.f2853a = editText;
        this.f2854b = false;
    }

    /* renamed from: a */
    public static String m2561a(String str) {
        String str2;
        if (str.length() <= 3) {
            return str;
        }
        String str3 = ".";
        StringTokenizer stringTokenizer = new StringTokenizer(str, str3);
        String str4 = "";
        if (stringTokenizer.countTokens() > 1) {
            str = stringTokenizer.nextToken();
            str2 = stringTokenizer.nextToken();
        } else {
            str2 = str4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        Log.d("str1:2=", sb.toString());
        int length = str.length() - 1;
        if (str.charAt(str.length() - 1) == '.') {
            length--;
            str4 = str3;
        }
        String str5 = str4;
        int i = 0;
        while (length >= 0) {
            if (i == 3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(",");
                sb2.append(str5);
                str5 = sb2.toString();
                i = 0;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str.charAt(length));
            sb3.append(str5);
            str5 = sb3.toString();
            i++;
            length--;
        }
        if (str2.length() > 0) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str5);
            sb4.append(str3);
            sb4.append(str2);
            str5 = sb4.toString();
        }
        return str5;
    }

    /* renamed from: a */
    public void mo4278a() {
        try {
            this.f2853a.removeTextChangedListener(this);
            C0288NU.m892a().mo934a(new C0356QU(17, this.f2853a, new C0334PU()));
            this.f2853a.addTextChangedListener(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void afterTextChanged(Editable editable) {
        this.f2856d = System.currentTimeMillis();
        if (this.f2858f == null) {
            this.f2858f = new Thread(this.f2859g);
            this.f2858f.start();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
