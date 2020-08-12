package p000;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.itextpdf.tool.xml.css.CSS.Value;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: QU */
public class C0356QU implements Runnable {

    /* renamed from: A */
    public ArrayList<Map<String, String>> f1027A = new ArrayList<>();

    /* renamed from: a */
    public C0334PU f1028a;

    /* renamed from: b */
    public ArrayList<String> f1029b = new ArrayList<>();

    /* renamed from: c */
    public ArrayAdapter<String> f1030c;

    /* renamed from: d */
    public AutoCompleteTextView f1031d = null;

    /* renamed from: e */
    public AutoCompleteTextView f1032e = null;

    /* renamed from: f */
    public AutoCompleteTextView f1033f = null;

    /* renamed from: g */
    public C0651cU f1034g;

    /* renamed from: h */
    public Context f1035h;

    /* renamed from: i */
    public LinearLayout f1036i = null;

    /* renamed from: j */
    public Button f1037j = null;

    /* renamed from: k */
    public int f1038k;

    /* renamed from: l */
    public C0195JU f1039l;

    /* renamed from: m */
    public EditText f1040m = null;

    /* renamed from: n */
    public C0302OM f1041n;

    /* renamed from: o */
    public List<C0232LL> f1042o = new ArrayList();

    /* renamed from: p */
    public String[] f1043p = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

    /* renamed from: q */
    public ArrayAdapter<String> f1044q;

    /* renamed from: r */
    public AutoCompleteTextView f1045r = null;

    /* renamed from: s */
    public int f1046s = 0;

    /* renamed from: t */
    public AutoCompleteTextView f1047t = null;

    /* renamed from: u */
    public TextView f1048u = null;

    /* renamed from: v */
    public String f1049v;

    /* renamed from: w */
    public String f1050w;

    /* renamed from: x */
    public String f1051x;

    /* renamed from: y */
    public int f1052y = 0;

    /* renamed from: z */
    public int f1053z = 0;

    public C0356QU(int i, C0195JU ju, Context context) {
        this.f1038k = i;
        this.f1039l = ju;
        this.f1035h = context;
    }

    public C0356QU(int i, C0195JU ju, AutoCompleteTextView autoCompleteTextView, AutoCompleteTextView autoCompleteTextView2, AutoCompleteTextView autoCompleteTextView3, Context context, LinearLayout linearLayout, int i2, Button button, C0334PU pu) {
        this.f1038k = i;
        this.f1039l = ju;
        this.f1031d = autoCompleteTextView;
        this.f1033f = autoCompleteTextView2;
        this.f1045r = autoCompleteTextView3;
        this.f1035h = context;
        this.f1036i = linearLayout;
        this.f1046s = i2;
        this.f1037j = button;
        this.f1028a = pu;
    }

    public C0356QU(int i, C0195JU ju, AutoCompleteTextView autoCompleteTextView, AutoCompleteTextView autoCompleteTextView2, AutoCompleteTextView autoCompleteTextView3, Context context, LinearLayout linearLayout, Button button, C0334PU pu) {
        this.f1038k = i;
        this.f1039l = ju;
        this.f1031d = autoCompleteTextView;
        this.f1032e = autoCompleteTextView2;
        this.f1033f = autoCompleteTextView3;
        this.f1035h = context;
        this.f1036i = linearLayout;
        this.f1037j = button;
        this.f1028a = pu;
    }

    public C0356QU(int i, C0195JU ju, TextView textView, String str, String str2, String str3, int i2, C0334PU pu) {
        this.f1038k = i;
        this.f1039l = ju;
        this.f1048u = textView;
        this.f1049v = str;
        this.f1050w = str2;
        this.f1051x = str3;
        this.f1052y = i2;
        this.f1028a = pu;
    }

    public C0356QU(int i, C0302OM om, List<C0232LL> list, C0334PU pu) {
        this.f1038k = i;
        this.f1041n = om;
        this.f1042o = list;
        StringBuilder sb = new StringBuilder();
        sb.append(list.size());
        sb.append(Attribute.SIZE);
        Log.d("net_bal=", sb.toString());
        this.f1028a = pu;
    }

    public C0356QU(int i, EditText editText, C0334PU pu) {
        this.f1038k = i;
        this.f1040m = editText;
        this.f1028a = pu;
    }

    /* renamed from: a */
    public final void mo1110a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1042o.size());
        sb.append(Attribute.SIZE);
        String str = "net_bal=";
        Log.d(str, sb.toString());
        double d = 0.0d;
        for (int size = this.f1042o.size() - 1; size >= 0; size--) {
            String str2 = "";
            String str3 = ",";
            d += Double.parseDouble(((C0232LL) this.f1042o.get(size)).mo775f().replaceAll(str3, str2)) * (Double.parseDouble(((C0232LL) this.f1042o.get(size)).mo770c().replaceAll(str3, str2)) - 1.0d);
            Log.d(str, String.valueOf(d));
            C0232LL ll = (C0232LL) this.f1042o.get(size);
            ll.mo769b(String.valueOf(d));
            this.f1042o.set(size, ll);
        }
    }

    /* renamed from: a */
    public void mo1111a(Context context) {
        String str;
        StringBuilder sb;
        Cursor cursor;
        this.f1027A.clear();
        String str2 = "people_cnt=";
        String str3 = "data2";
        String str4 = "display_name";
        String str5 = "data1";
        if (this.f1047t.getText() == null || this.f1047t.getText().length() <= 0) {
            cursor = context.getContentResolver().query(Phone.CONTENT_URI, new String[]{str5, str4, str3}, null, null, null);
            sb = new StringBuilder();
            sb.append(cursor.getCount());
            str = "#2";
        } else {
            Uri withAppendedPath = Uri.withAppendedPath(Phone.CONTENT_FILTER_URI, Uri.encode(this.f1047t.getText().toString()));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f1047t.getText().toString());
            sb2.append("#SSS");
            Log.d(str2, sb2.toString());
            String[] strArr = {str5, str4, str3};
            int i = VERSION.SDK_INT;
            StringBuilder sb3 = new StringBuilder();
            String str6 = Value.PERCENTAGE;
            sb3.append(str6);
            sb3.append(this.f1047t.getText().toString());
            sb3.append(str6);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str6);
            sb4.append(this.f1047t.getText().toString());
            sb4.append(str6);
            String[] strArr2 = {sb3.toString(), sb4.toString()};
            cursor = context.getContentResolver().query(withAppendedPath, strArr, null, null, null);
            sb = new StringBuilder();
            sb.append(cursor.getCount());
            str = "#1";
        }
        sb.append(str);
        Log.d(str2, sb.toString());
        while (cursor.moveToNext()) {
            Log.d("people_name=", cursor.getString(cursor.getColumnIndex(str4)));
            Log.d("people_number=", cursor.getString(cursor.getColumnIndex(str5)));
            String string = cursor.getString(cursor.getColumnIndex(str4));
            String string2 = cursor.getString(cursor.getColumnIndex(str5));
            String string3 = cursor.getString(cursor.getColumnIndex(str3));
            if (string2.length() > 0) {
                String str7 = "";
                string2 = string2.replaceAll("-", str7).replaceAll(" ", str7);
            }
            HashMap hashMap = new HashMap();
            String str8 = "Name";
            hashMap.put(str8, string);
            String str9 = "Phone";
            hashMap.put(str9, string2);
            String str10 = "Type";
            String str11 = string3.equals("0") ? "Work" : string3.equals("1") ? "Home" : string3.equals("2") ? "Mobile" : "Other";
            hashMap.put(str10, str11);
            this.f1027A.add(hashMap);
            hashMap.put(str8, string);
            hashMap.put(str9, string2);
        }
        cursor.close();
    }

    /* renamed from: b */
    public void mo1112b() {
        Cursor C = this.f1039l.mo451C(this.f1031d.getText().toString());
        int count = C.getCount();
        StringBuilder sb = new StringBuilder();
        sb.append(count);
        sb.append(":");
        sb.append(this.f1031d.getText().toString());
        Log.d("Remarks_CNT=", sb.toString());
        this.f1043p = new String[count];
        if (C.moveToFirst()) {
            int i = 0;
            do {
                this.f1043p[i] = C.getString(C.getColumnIndex("remarks"));
                i++;
            } while (C.moveToNext());
        }
        C.close();
    }

    /* renamed from: c */
    public void mo1113c() {
        ArrayList<String> p;
        C0195JU ju;
        String obj;
        StringBuilder sb;
        AutoCompleteTextView autoCompleteTextView;
        int i = this.f1038k;
        String str = Value.PERCENTAGE;
        if (i == 2) {
            this.f1030c = new ArrayAdapter<>(this.f1035h, 17367050, this.f1039l.mo598m(this.f1031d.getText().toString(), this.f1032e.getText().toString()));
            if (this.f1033f.getText().toString().length() > 0) {
                C0195JU ju2 = this.f1039l;
                String obj2 = this.f1031d.getText().toString();
                String obj3 = this.f1032e.getText().toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(this.f1033f.getText().toString());
                sb2.append(str);
                p = ju2.mo559d(obj2, obj3, sb2.toString());
            } else {
                p = this.f1039l.mo607p(this.f1031d.getText().toString(), this.f1032e.getText().toString());
            }
        } else if (i == 3) {
            String str2 = "";
            this.f1030c = new ArrayAdapter<>(this.f1035h, 17367050, this.f1039l.mo598m(this.f1031d.getText().toString(), str2));
            if (this.f1046s == 2) {
                AutoCompleteTextView autoCompleteTextView2 = this.f1033f;
                if (autoCompleteTextView2 != null && autoCompleteTextView2.getText().toString().length() > 0) {
                    ju = this.f1039l;
                    obj = this.f1031d.getText().toString();
                    sb = new StringBuilder();
                    sb.append(str);
                    autoCompleteTextView = this.f1033f;
                    sb.append(autoCompleteTextView.getText().toString());
                    sb.append(str);
                    p = ju.mo559d(obj, str2, sb.toString());
                }
            }
            if (this.f1046s != 2) {
                AutoCompleteTextView autoCompleteTextView3 = this.f1045r;
                if (autoCompleteTextView3 != null && autoCompleteTextView3.getText().toString().length() > 0) {
                    ju = this.f1039l;
                    obj = this.f1031d.getText().toString();
                    sb = new StringBuilder();
                    sb.append(str);
                    autoCompleteTextView = this.f1045r;
                    sb.append(autoCompleteTextView.getText().toString());
                    sb.append(str);
                    p = ju.mo559d(obj, str2, sb.toString());
                }
            }
            p = this.f1039l.mo607p(this.f1031d.getText().toString(), str2);
        } else {
            return;
        }
        this.f1029b = p;
    }

    public void run() {
        int count;
        try {
            if (this.f1038k != 1) {
                if (this.f1038k != 2) {
                    if (this.f1038k != 3) {
                        if (this.f1038k == 4) {
                            mo1112b();
                        } else if (this.f1038k == 5) {
                            mo1111a(this.f1035h);
                        } else if (this.f1038k == 6) {
                            this.f1039l.mo592k();
                        } else if (this.f1038k == 7) {
                            this.f1039l.mo479S();
                        } else if (this.f1038k == 8) {
                            this.f1039l.mo551c(this.f1035h);
                        } else if (this.f1038k != 9) {
                            if (this.f1038k != 10) {
                                if (this.f1038k == 11) {
                                    this.f1039l.mo544ba();
                                } else if (this.f1038k != 12) {
                                    if (this.f1038k == 13) {
                                        if (this.f1052y == 0) {
                                            count = this.f1039l.mo546c(this.f1049v, this.f1050w, this.f1051x).getCount();
                                        } else if (this.f1052y == 1) {
                                            count = this.f1039l.mo555d(this.f1049v, this.f1051x).getCount();
                                        }
                                        this.f1053z = count;
                                    } else if (this.f1038k == 14) {
                                        this.f1039l.mo589j();
                                    } else if (this.f1038k != 15) {
                                        if (this.f1038k == 16) {
                                            mo1110a();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                mo1113c();
            }
            if (this.f1028a != null) {
                this.f1028a.f950a = this.f1038k;
                this.f1028a.f951b = this.f1046s;
                this.f1028a.f954e = this.f1035h;
                this.f1028a.f952c = this.f1030c;
                this.f1028a.f963n = this.f1044q;
                this.f1028a.f960k = this.f1027A;
                this.f1028a.f959j = this.f1047t;
                this.f1028a.f967r = this.f1043p;
                this.f1028a.f955f = this.f1036i;
                this.f1028a.f956g = this.f1037j;
                this.f1028a.f961l = this.f1031d;
                this.f1028a.f962m = this.f1032e;
                this.f1028a.f953d = this.f1029b;
                this.f1028a.f957h = this.f1033f;
                this.f1028a.f958i = this.f1045r;
                this.f1028a.f964o = this.f1034g;
                this.f1028a.f968s = this.f1053z;
                this.f1028a.f969t = this.f1051x;
                this.f1028a.f970u = this.f1048u;
                this.f1028a.f965p = this.f1041n;
                this.f1028a.f966q = this.f1040m;
                C0288NU.m892a().mo935b().execute(this.f1028a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
