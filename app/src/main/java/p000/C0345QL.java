package p000;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: QL */
public class C0345QL implements InputFilter {

    /* renamed from: a */
    public final int f999a;

    public C0345QL(int i) {
        this.f999a = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = spanned.length();
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                i5 = -1;
                break;
            } else if (spanned.charAt(i5) == '.') {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            String str = "";
            if (charSequence.equals(".")) {
                return str;
            }
            if (i4 > i5 && length - i5 > this.f999a) {
                return str;
            }
        }
        return null;
    }
}
