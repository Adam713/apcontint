package p000;

import android.util.Log;
import android.widget.EditText;
import java.util.regex.Pattern;

/* renamed from: AO */
public class C0008AO {
    /* renamed from: a */
    public static boolean m5a(EditText editText) {
        String trim = editText.getText().toString().trim();
        editText.setError(null);
        if (trim.length() != 0) {
            return true;
        }
        editText.setError("required");
        return false;
    }

    /* renamed from: a */
    public static boolean m6a(EditText editText, String str, String str2, boolean z) {
        String trim = editText.getText().toString().trim();
        editText.setError(null);
        if (!z || m5a(editText)) {
            Pattern.compile(str);
            if (!z || Pattern.matches(str, trim)) {
                StringBuilder sb = new StringBuilder();
                sb.append(trim);
                String str3 = ":";
                sb.append(str3);
                sb.append(str);
                sb.append(str3);
                sb.append(String.valueOf(Pattern.matches(str, trim)));
                Log.d("Matched:", sb.toString());
                return true;
            }
            editText.setError(str2);
            return false;
        }
        editText.setError(str2);
        return false;
    }

    /* renamed from: a */
    public static boolean m7a(EditText editText, boolean z) {
        return m6a(editText, "(\\d+)", "Number", z);
    }
}
