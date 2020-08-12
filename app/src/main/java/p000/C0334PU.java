package p000;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: PU */
public class C0334PU implements Runnable {

    /* renamed from: a */
    public int f950a;

    /* renamed from: b */
    public int f951b;

    /* renamed from: c */
    public ArrayAdapter<String> f952c;

    /* renamed from: d */
    public ArrayList<String> f953d = new ArrayList<>();

    /* renamed from: e */
    public Context f954e;

    /* renamed from: f */
    public LinearLayout f955f = null;

    /* renamed from: g */
    public Button f956g = null;

    /* renamed from: h */
    public AutoCompleteTextView f957h = null;

    /* renamed from: i */
    public AutoCompleteTextView f958i = null;

    /* renamed from: j */
    public AutoCompleteTextView f959j = null;

    /* renamed from: k */
    public ArrayList<Map<String, String>> f960k = new ArrayList<>();

    /* renamed from: l */
    public AutoCompleteTextView f961l = null;

    /* renamed from: m */
    public AutoCompleteTextView f962m = null;

    /* renamed from: n */
    public ArrayAdapter<String> f963n;

    /* renamed from: o */
    public C0651cU f964o;

    /* renamed from: p */
    public C0302OM f965p;

    /* renamed from: q */
    public EditText f966q = null;

    /* renamed from: r */
    public String[] f967r = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: s */
    public int f968s;

    /* renamed from: t */
    public String f969t;

    /* renamed from: u */
    public TextView f970u = null;

    /* renamed from: a */
    public void mo1047a() {
        SimpleAdapter simpleAdapter = new SimpleAdapter(this.f954e, this.f960k, 2131492919, new String[]{"Name", "Phone", "Type"}, new int[]{2131296360, 2131296361, 2131296362});
        this.f959j.setAdapter(simpleAdapter);
        this.f959j.setThreshold(1);
        if (this.f959j.hasFocus()) {
            this.f959j.showDropDown();
        }
    }

    /* renamed from: a */
    public void mo1048a(ArrayList<String> arrayList) {
        LayoutInflater layoutInflater = (LayoutInflater) this.f954e.getSystemService("layout_inflater");
        int size = arrayList.size();
        if (this.f955f.getChildCount() > 0) {
            this.f955f.removeAllViews();
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            if (arrayList.get(i2) != null) {
                i++;
                if (i < 4) {
                    RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(2131492907, null);
                    new LayoutParams(-2, -2);
                    Button button = (Button) relativeLayout.findViewById(2131296352);
                    button.setText((CharSequence) arrayList.get(i2));
                    button.setOnClickListener(new C0312OU(this, (String) arrayList.get(i2)));
                    this.f955f.addView(relativeLayout);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo1049b() {
        AutoCompleteTextView autoCompleteTextView;
        this.f963n = new ArrayAdapter<>(this.f954e, 17367050, this.f967r);
        int i = this.f951b;
        if (i == 1 || i == 3) {
            autoCompleteTextView = this.f958i;
        } else if (i == 2) {
            autoCompleteTextView = this.f957h;
        } else {
            return;
        }
        autoCompleteTextView.setAdapter(this.f963n);
    }

    /* renamed from: c */
    public void mo1050c() {
        this.f964o = new C0651cU(this.f954e, 17367050, this.f953d);
        this.f961l.setThreshold(1);
        if (this.f950a == 2) {
            this.f962m.setThreshold(1);
            this.f962m.setAdapter(this.f952c);
        }
        this.f961l.setAdapter(this.f952c);
        mo1048a(this.f953d);
    }

    public void run() {
        String str = "";
        String str2 = ",";
        try {
            if (this.f950a != 1) {
                if (this.f950a != 2) {
                    if (this.f950a != 3) {
                        if (this.f950a == 4) {
                            mo1049b();
                            return;
                        } else if (this.f950a == 5) {
                            mo1047a();
                            return;
                        } else if (this.f950a == 13) {
                            if (this.f968s > 0) {
                                SpannableString spannableString = new SpannableString(this.f970u.getText().toString());
                                spannableString.setSpan(new UnderlineSpan(), this.f970u.getText().toString().length() - this.f969t.length(), this.f970u.getText().toString().length(), 0);
                                this.f970u.setText(spannableString);
                                return;
                            }
                            return;
                        } else if (this.f950a == 16) {
                            this.f965p.notifyDataSetChanged();
                            return;
                        } else if (this.f950a == 17) {
                            if (!this.f966q.getText().toString().equals(C0733dN.m2561a(this.f966q.getText().toString().replaceAll(str2, str)))) {
                                this.f966q.setText(C0733dN.m2561a(this.f966q.getText().toString().replaceAll(str2, str)));
                                this.f966q.setSelection(this.f966q.getText().toString().length());
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    }
                }
                mo1050c();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
