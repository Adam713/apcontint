package p000;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.SearchManager;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract.CommonDataKinds.Phone;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Audio;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.app.LoaderManager.LoaderCallbacks;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.Loader;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.SearchView;
import android.text.InputFilter;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import com.itextpdf.tool.xml.css.CSS.Property;
import com.itextpdf.tool.xml.css.CSS.Value;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import com.itextpdf.tool.xml.html.HTML.Tag;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import com.valdio.valdioveliu.recyclerview.frag.Calculator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

@SuppressLint({"ValidFragment"})
/* renamed from: YQ */
public class C0523YQ extends Fragment implements OnClickListener, LoaderCallbacks<List<C0232LL>> {

    /* renamed from: a */
    public static double f1497a;

    /* renamed from: A */
    public Boolean f1498A;

    /* renamed from: Aa */
    public TextView f1499Aa;

    /* renamed from: B */
    public Boolean f1500B;

    /* renamed from: Ba */
    public AutoCompleteTextView f1501Ba;

    /* renamed from: C */
    public TextView f1502C;

    /* renamed from: Ca */
    public AutoCompleteTextView f1503Ca;

    /* renamed from: D */
    public ImageView f1504D;

    /* renamed from: Da */
    public EditText f1505Da;

    /* renamed from: E */
    public ImageView f1506E;

    /* renamed from: Ea */
    public TextView f1507Ea;

    /* renamed from: F */
    public ImageView f1508F;

    /* renamed from: Fa */
    public TextView f1509Fa;

    /* renamed from: G */
    public ImageView f1510G;

    /* renamed from: Ga */
    public AutoCompleteTextView f1511Ga;

    /* renamed from: H */
    public ImageView f1512H;

    /* renamed from: Ha */
    public AutoCompleteTextView f1513Ha;

    /* renamed from: I */
    public TextView f1514I;

    /* renamed from: Ia */
    public Button f1515Ia;

    /* renamed from: J */
    public TextView f1516J;

    /* renamed from: Ja */
    public Button f1517Ja;

    /* renamed from: K */
    public TextView f1518K;

    /* renamed from: Ka */
    public Button f1519Ka;

    /* renamed from: L */
    public TextView f1520L;

    /* renamed from: La */
    public ImageView f1521La;

    /* renamed from: M */
    public TextView f1522M;

    /* renamed from: Ma */
    public ImageView f1523Ma;

    /* renamed from: N */
    public C0302OM f1524N;

    /* renamed from: Na */
    public RadioGroup f1525Na;

    /* renamed from: O */
    public ListView f1526O;

    /* renamed from: Oa */
    public RadioButton f1527Oa;

    /* renamed from: P */
    public SparseBooleanArray f1528P;

    /* renamed from: Pa */
    public RadioButton f1529Pa;

    /* renamed from: Q */
    public int f1530Q;

    /* renamed from: Qa */
    public LinearLayout f1531Qa;

    /* renamed from: R */
    public int f1532R;

    /* renamed from: Ra */
    public LinearLayout f1533Ra;

    /* renamed from: S */
    public int f1534S;

    /* renamed from: Sa */
    public LinearLayout f1535Sa;

    /* renamed from: T */
    public int f1536T;

    /* renamed from: Ta */
    public LinearLayout f1537Ta;

    /* renamed from: U */
    public String[] f1538U;

    /* renamed from: Ua */
    public LinearLayout f1539Ua;

    /* renamed from: V */
    public TypedArray f1540V;

    /* renamed from: Va */
    public LinearLayout f1541Va;

    /* renamed from: W */
    public List<C0796gO> f1542W;

    /* renamed from: Wa */
    public RadioGroup f1543Wa;

    /* renamed from: X */
    public C0063DH f1544X;

    /* renamed from: Xa */
    public ArrayList<HashMap<String, String>> f1545Xa;

    /* renamed from: Y */
    public int[] f1546Y;

    /* renamed from: Ya */
    public ArrayAdapter<String> f1547Ya;

    /* renamed from: Z */
    public LinearLayout f1548Z;

    /* renamed from: Za */
    public String[] f1549Za;

    /* renamed from: _a */
    public OnDateSetListener f1550_a;

    /* renamed from: aa */
    public LoaderCallbacks<List<String>> f1551aa;

    /* renamed from: ab */
    public OnDateSetListener f1552ab;

    /* renamed from: b */
    public String f1553b = null;

    /* renamed from: ba */
    public String f1554ba;

    /* renamed from: bb */
    public OnDateSetListener f1555bb;

    /* renamed from: c */
    public String f1556c = null;

    /* renamed from: ca */
    public String f1557ca;

    /* renamed from: cb */
    public ArrayList<String> f1558cb;

    /* renamed from: d */
    public String f1559d = null;

    /* renamed from: da */
    public String f1560da;

    /* renamed from: db */
    public ProgressDialog f1561db;

    /* renamed from: e */
    public String f1562e = null;

    /* renamed from: ea */
    public String f1563ea;

    /* renamed from: eb */
    public Handler f1564eb;

    /* renamed from: f */
    public String f1565f = null;

    /* renamed from: fa */
    public String f1566fa;

    /* renamed from: fb */
    public String f1567fb;

    /* renamed from: g */
    public String f1568g = null;

    /* renamed from: ga */
    public int f1569ga;

    /* renamed from: gb */
    public EditText f1570gb;

    /* renamed from: h */
    public int f1571h;

    /* renamed from: ha */
    public String f1572ha;

    /* renamed from: hb */
    public EditText f1573hb;

    /* renamed from: i */
    public String f1574i;

    /* renamed from: ia */
    public String f1575ia;

    /* renamed from: ib */
    public int f1576ib;

    /* renamed from: j */
    public String f1577j;

    /* renamed from: ja */
    public String[] f1578ja;

    /* renamed from: jb */
    public int f1579jb;

    /* renamed from: k */
    public String f1580k;

    /* renamed from: ka */
    public TypedArray f1581ka;

    /* renamed from: kb */
    public String f1582kb;

    /* renamed from: l */
    public String f1583l;

    /* renamed from: la */
    public SwipeRefreshLayout f1584la;

    /* renamed from: lb */
    public Uri f1585lb;

    /* renamed from: m */
    public int f1586m;

    /* renamed from: ma */
    public Activity f1587ma;

    /* renamed from: mb */
    public String f1588mb;

    /* renamed from: n */
    public String f1589n;

    /* renamed from: na */
    public int f1590na;

    /* renamed from: nb */
    public boolean f1591nb;

    /* renamed from: o */
    public String f1592o;

    /* renamed from: oa */
    public OnClickListener f1593oa;

    /* renamed from: p */
    public String f1594p;

    /* renamed from: pa */
    public boolean f1595pa;

    /* renamed from: q */
    public List<C0232LL> f1596q;

    /* renamed from: qa */
    public boolean f1597qa;

    /* renamed from: r */
    public String f1598r;

    /* renamed from: ra */
    public boolean f1599ra;

    /* renamed from: s */
    public int f1600s;

    /* renamed from: sa */
    public int f1601sa;

    /* renamed from: t */
    public int f1602t;

    /* renamed from: ta */
    public String f1603ta;

    /* renamed from: u */
    public SQLiteDatabase f1604u;

    /* renamed from: ua */
    public Snackbar f1605ua;

    /* renamed from: v */
    public C0195JU f1606v;

    /* renamed from: va */
    public int f1607va;

    /* renamed from: w */
    public String[] f1608w;

    /* renamed from: wa */
    public int f1609wa;

    /* renamed from: x */
    public boolean f1610x;

    /* renamed from: xa */
    public String f1611xa;

    /* renamed from: y */
    public String f1612y;

    /* renamed from: ya */
    public String f1613ya;

    /* renamed from: z */
    public boolean f1614z;

    /* renamed from: za */
    public TextView f1615za;

    /* renamed from: YQ$a */
    private class C0524a implements Comparator<C0232LL> {
        public C0524a() {
        }

        public /* synthetic */ C0524a(C0523YQ yq, C0009AP ap) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            try {
                int compareTo = simpleDateFormat.parse(ll.mo777h()).compareTo(simpleDateFormat.parse(ll2.mo777h()));
                return compareTo == 0 ? Integer.valueOf(ll.mo778i()).compareTo(Integer.valueOf(ll2.mo778i())) : compareTo;
            } catch (ParseException unused) {
                return 0;
            }
        }
    }

    /* renamed from: YQ$b */
    private class C0525b implements Comparator<C0232LL> {
        public C0525b() {
        }

        public /* synthetic */ C0525b(C0523YQ yq, C0009AP ap) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            try {
                int compareTo = simpleDateFormat.parse(ll2.mo777h()).compareTo(simpleDateFormat.parse(ll.mo777h()));
                return compareTo == 0 ? Integer.valueOf(ll2.mo778i()).compareTo(Integer.valueOf(ll.mo778i())) : compareTo;
            } catch (ParseException unused) {
                return 0;
            }
        }
    }

    /* renamed from: YQ$c */
    private class C0526c implements Comparator<C0232LL> {
        public C0526c() {
        }

        public /* synthetic */ C0526c(C0523YQ yq, C0009AP ap) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ll.mo770c().replaceAll(str2, str)).compareTo(Double.valueOf(ll2.mo770c().replaceAll(str2, str)));
        }
    }

    /* renamed from: YQ$d */
    private class C0527d implements Comparator<C0232LL> {
        public C0527d() {
        }

        public /* synthetic */ C0527d(C0523YQ yq, C0009AP ap) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ll2.mo770c().replaceAll(str2, str)).compareTo(Double.valueOf(ll.mo770c().replaceAll(str2, str)));
        }
    }

    /* renamed from: YQ$e */
    private class C0528e implements Comparator<C0232LL> {
        public C0528e() {
        }

        public /* synthetic */ C0528e(C0523YQ yq, C0009AP ap) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ll.mo775f().replaceAll(str2, str)).compareTo(Double.valueOf(ll2.mo775f().replaceAll(str2, str)));
        }
    }

    /* renamed from: YQ$f */
    private class C0529f implements Comparator<C0232LL> {
        public C0529f() {
        }

        public /* synthetic */ C0529f(C0523YQ yq, C0009AP ap) {
            this();
        }

        /* renamed from: a */
        public int compare(C0232LL ll, C0232LL ll2) {
            String str = "";
            String str2 = ",";
            return Double.valueOf(ll2.mo775f().replaceAll(str2, str)).compareTo(Double.valueOf(ll.mo775f().replaceAll(str2, str)));
        }
    }

    public C0523YQ() {
        Boolean valueOf = Boolean.valueOf(false);
        this.f1571h = 0;
        this.f1574i = null;
        this.f1577j = null;
        this.f1580k = null;
        this.f1583l = null;
        this.f1586m = 0;
        this.f1589n = null;
        this.f1592o = null;
        this.f1594p = null;
        this.f1596q = new ArrayList();
        this.f1598r = null;
        String str = "January";
        String str2 = "February";
        String str3 = "March";
        String str4 = "April";
        String str5 = "May";
        String str6 = "June";
        this.f1608w = new String[]{str, str2, str3, str4, str5, str6, "July", "August", "September", "October", "November", "December"};
        this.f1610x = false;
        String str7 = "";
        this.f1612y = str7;
        this.f1614z = false;
        this.f1498A = valueOf;
        this.f1500B = valueOf;
        this.f1502C = null;
        this.f1504D = null;
        this.f1506E = null;
        this.f1508F = null;
        this.f1510G = null;
        this.f1512H = null;
        this.f1514I = null;
        this.f1516J = null;
        this.f1518K = null;
        this.f1520L = null;
        this.f1522M = null;
        this.f1530Q = 0;
        this.f1546Y = new int[]{2131230923, 1, 2131230855};
        this.f1548Z = null;
        this.f1551aa = new C0009AP(this);
        this.f1554ba = str7;
        this.f1557ca = str7;
        this.f1560da = str7;
        this.f1563ea = str7;
        this.f1566fa = str7;
        this.f1569ga = 0;
        this.f1572ha = str7;
        this.f1575ia = str7;
        this.f1590na = -1;
        this.f1593oa = new C1180yQ(this);
        this.f1599ra = false;
        this.f1601sa = 0;
        this.f1603ta = str7;
        this.f1607va = 0;
        this.f1609wa = 0;
        this.f1611xa = Value.PERCENTAGE;
        this.f1613ya = Value.PERCENTAGE;
        this.f1615za = null;
        this.f1499Aa = null;
        this.f1501Ba = null;
        this.f1503Ca = null;
        this.f1505Da = null;
        this.f1507Ea = null;
        this.f1509Fa = null;
        this.f1511Ga = null;
        this.f1513Ha = null;
        this.f1515Ia = null;
        this.f1517Ja = null;
        this.f1519Ka = null;
        this.f1521La = null;
        this.f1523Ma = null;
        this.f1525Na = null;
        this.f1527Oa = null;
        this.f1529Pa = null;
        this.f1531Qa = null;
        this.f1533Ra = null;
        this.f1535Sa = null;
        this.f1537Ta = null;
        this.f1539Ua = null;
        this.f1541Va = null;
        this.f1543Wa = null;
        this.f1545Xa = new ArrayList<>();
        this.f1549Za = new String[]{str, str2, str3, str4, str5, str6, "July", "August", "September", "October", "November", "December"};
        this.f1550_a = new C0859jQ(this);
        this.f1552ab = new C0879kQ(this);
        this.f1555bb = new C0904lQ(this);
        this.f1558cb = new ArrayList<>();
        this.f1564eb = new C0130GQ(this);
        this.f1567fb = str7;
        this.f1576ib = 3;
        this.f1579jb = 4;
        this.f1588mb = str7;
        this.f1591nb = false;
    }

    public C0523YQ(C0082EH eh, int i, int i2, ArrayList<C0232LL> arrayList, String str, boolean z) {
        Boolean valueOf = Boolean.valueOf(false);
        this.f1571h = 0;
        this.f1574i = null;
        this.f1577j = null;
        this.f1580k = null;
        this.f1583l = null;
        this.f1586m = 0;
        this.f1589n = null;
        this.f1592o = null;
        this.f1594p = null;
        this.f1596q = new ArrayList();
        this.f1598r = null;
        String str2 = "January";
        String str3 = "February";
        String str4 = "March";
        String str5 = "April";
        String str6 = "May";
        String str7 = "June";
        this.f1608w = new String[]{str2, str3, str4, str5, str6, str7, "July", "August", "September", "October", "November", "December"};
        this.f1610x = false;
        String str8 = "";
        this.f1612y = str8;
        this.f1614z = false;
        this.f1498A = valueOf;
        this.f1500B = valueOf;
        this.f1502C = null;
        this.f1504D = null;
        this.f1506E = null;
        this.f1508F = null;
        this.f1510G = null;
        this.f1512H = null;
        this.f1514I = null;
        this.f1516J = null;
        this.f1518K = null;
        this.f1520L = null;
        this.f1522M = null;
        this.f1530Q = 0;
        this.f1546Y = new int[]{2131230923, 1, 2131230855};
        this.f1548Z = null;
        this.f1551aa = new C0009AP(this);
        this.f1554ba = str8;
        this.f1557ca = str8;
        this.f1560da = str8;
        this.f1563ea = str8;
        this.f1566fa = str8;
        this.f1569ga = 0;
        this.f1572ha = str8;
        this.f1575ia = str8;
        this.f1590na = -1;
        this.f1593oa = new C1180yQ(this);
        this.f1599ra = false;
        this.f1601sa = 0;
        this.f1603ta = str8;
        this.f1607va = 0;
        this.f1609wa = 0;
        this.f1611xa = Value.PERCENTAGE;
        this.f1613ya = Value.PERCENTAGE;
        this.f1615za = null;
        this.f1499Aa = null;
        this.f1501Ba = null;
        this.f1503Ca = null;
        this.f1505Da = null;
        this.f1507Ea = null;
        this.f1509Fa = null;
        this.f1511Ga = null;
        this.f1513Ha = null;
        this.f1515Ia = null;
        this.f1517Ja = null;
        this.f1519Ka = null;
        this.f1521La = null;
        this.f1523Ma = null;
        this.f1525Na = null;
        this.f1527Oa = null;
        this.f1529Pa = null;
        this.f1531Qa = null;
        this.f1533Ra = null;
        this.f1535Sa = null;
        this.f1537Ta = null;
        this.f1539Ua = null;
        this.f1541Va = null;
        this.f1543Wa = null;
        this.f1545Xa = new ArrayList<>();
        this.f1549Za = new String[]{str2, str3, str4, str5, str6, str7, "July", "August", "September", "October", "November", "December"};
        this.f1550_a = new C0859jQ(this);
        this.f1552ab = new C0879kQ(this);
        this.f1555bb = new C0904lQ(this);
        this.f1558cb = new ArrayList<>();
        this.f1564eb = new C0130GQ(this);
        this.f1567fb = str8;
        this.f1576ib = 3;
        this.f1579jb = 4;
        this.f1588mb = str8;
        this.f1591nb = false;
        Bundle bundle = new Bundle();
        bundle.putString("cus_id", eh.mo191f());
        bundle.putString("cus_name", eh.mo192g());
        bundle.putString("cus_bal", eh.mo180a());
        bundle.putString("cus_gsm", eh.mo189e());
        bundle.putString("g_name", eh.mo187d());
        bundle.putString("curr_name", eh.mo183b());
        bundle.putInt(Property.POSITION, i);
        bundle.putInt(Attribute.SIZE, i2);
        bundle.putString("searchString", str);
        bundle.putBoolean("show_move_tr", z);
        bundle.putSerializable("cus_det", arrayList);
        setArguments(bundle);
    }

    /* renamed from: E */
    public static String m1461E() {
        return new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
    }

    /* renamed from: a */
    public static String m1463a(Context context, Uri uri) {
        try {
            if (VERSION.SDK_INT >= 19 && DocumentsContract.isDocumentUri(context, uri)) {
                String str = ":";
                if (m1471b(uri)) {
                    String[] split = DocumentsContract.getDocumentId(uri).split(str);
                    if ("primary".equalsIgnoreCase(split[0])) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(Environment.getExternalStorageDirectory());
                        sb.append("/");
                        sb.append(split[1]);
                        return sb.toString();
                    }
                } else if (m1468a(uri)) {
                    return m1464a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), (String) null, (String[]) null);
                } else if (m1473c(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(str);
                    String str2 = split2[0];
                    Uri uri2 = "image".equals(str2) ? Media.EXTERNAL_CONTENT_URI : Tag.VIDEO.equals(str2) ? Video.Media.EXTERNAL_CONTENT_URI : Tag.AUDIO.equals(str2) ? Audio.Media.EXTERNAL_CONTENT_URI : null;
                    return m1464a(context, uri2, "_id=?", new String[]{split2[1]});
                }
                return null;
            } else if ("content".equalsIgnoreCase(uri.getScheme())) {
                return m1464a(context, uri, (String) null, (String[]) null);
            } else {
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
                return null;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static String m1464a(Context r8, Uri r9, String r10, String[] r11) {
        /*
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = "_data"
            r1 = 0
            r3[r1] = r0
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ all -> 0x0033 }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0033 }
            if (r8 == 0) goto L_0x002d
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x002b }
            if (r9 == 0) goto L_0x002d
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002b }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x002b }
            if (r8 == 0) goto L_0x002a
            r8.close()
        L_0x002a:
            return r9
        L_0x002b:
            r9 = move-exception
            goto L_0x0035
        L_0x002d:
            if (r8 == 0) goto L_0x0032
            r8.close()
        L_0x0032:
            return r7
        L_0x0033:
            r9 = move-exception
            r8 = r7
        L_0x0035:
            if (r8 == 0) goto L_0x003a
            r8.close()
        L_0x003a:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0523YQ.m1464a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m1468a(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: b */
    public static boolean m1471b(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static boolean m1473c(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    private void sort_date_click(View view) {
        int i;
        if (this.f1530Q == 0) {
            mo1581h(this.f1596q);
            this.f1524N.notifyDataSetChanged();
            i = 1;
        } else {
            mo1557b(this.f1596q);
            this.f1524N.notifyDataSetChanged();
            i = 0;
        }
        this.f1530Q = i;
    }

    /* renamed from: A */
    public void mo1520A() {
        C0302OM om = this.f1524N;
        if (om == null) {
            this.f1524N = new C0302OM(getActivity(), 2131492929, this.f1596q);
        } else {
            om.f868i.clear();
            this.f1524N.notifyDataSetChanged();
            mo1557b(this.f1596q);
            this.f1524N.notifyDataSetChanged();
        }
        this.f1526O.setAdapter(this.f1524N);
    }

    /* renamed from: B */
    public final C0232LL mo1521B() {
        Cursor z = this.f1606v.mo636z(this.f1556c);
        z.moveToFirst();
        C0232LL ll = null;
        while (!z.isAfterLast()) {
            String str = "_in";
            ll = new C0232LL(z.getString(z.getColumnIndex("_id")), z.getString(z.getColumnIndex("date_")), z.getString(z.getColumnIndex("amount")), z.getString(z.getColumnIndex("remarks")), this.f1546Y[z.getInt(z.getColumnIndex(str))], String.valueOf(z.getInt(z.getColumnIndex(str))), z.getString(z.getColumnIndex("param1")), z.getString(z.getColumnIndex("curr_name")));
            z.moveToNext();
        }
        z.close();
        return ll;
    }

    /* renamed from: C */
    public void mo1522C() {
        try {
            C0356QU qu = new C0356QU(13, this.f1606v, this.f1502C, this.f1553b, "", this.f1562e, 1, new C0334PU());
            C0288NU.m892a().mo934a(qu);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: D */
    public final void mo1523D() {
        mo1573e();
        Intent intent = new Intent();
        intent.setType("image/*");
        intent.setAction("android.intent.action.GET_CONTENT");
        startActivityForResult(Intent.createChooser(intent, "Select File"), this.f1579jb);
    }

    /* renamed from: F */
    public void mo1524F() {
        Cursor cursor;
        boolean z = C0195JU.f451k;
        String str = Value.PERCENTAGE;
        if (!z) {
            if (this.f1609wa == 0) {
                this.f1611xa = str;
                this.f1613ya = str;
                cursor = this.f1606v.mo593l(this.f1553b);
            } else {
                this.f1611xa = this.f1611xa.isEmpty() ? str : this.f1611xa;
                if (!this.f1613ya.isEmpty()) {
                    str = this.f1613ya;
                }
                this.f1613ya = str;
                cursor = this.f1606v.mo492a(this.f1553b, this.f1611xa, this.f1613ya);
            }
        } else if (this.f1609wa == 0) {
            this.f1611xa = str;
            this.f1613ya = str;
            cursor = this.f1606v.mo570f(this.f1553b, this.f1562e);
        } else {
            this.f1611xa = this.f1611xa.isEmpty() ? str : this.f1611xa;
            if (!this.f1613ya.isEmpty()) {
                str = this.f1613ya;
            }
            this.f1613ya = str;
            cursor = this.f1606v.mo527b(this.f1553b, this.f1611xa, this.f1613ya, this.f1562e);
        }
        cursor.getCount();
        f1497a = 0.0d;
        this.f1596q.clear();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            List<C0232LL> list = this.f1596q;
            String string = cursor.getString(cursor.getColumnIndex("_id"));
            String string2 = cursor.getString(cursor.getColumnIndex("date_"));
            StringBuilder sb = new StringBuilder();
            String str2 = "";
            sb.append(str2);
            sb.append(cursor.getDouble(cursor.getColumnIndex("amount")));
            String sb2 = sb.toString();
            String str3 = "remarks";
            String string3 = cursor.getString(cursor.getColumnIndex(str3)) != null ? cursor.getString(cursor.getColumnIndex(str3)) : str2;
            String str4 = "_in";
            C0232LL ll = new C0232LL(string, string2, sb2, string3, this.f1546Y[cursor.getInt(cursor.getColumnIndex(str4))], String.valueOf(cursor.getInt(cursor.getColumnIndex(str4))), cursor.getString(cursor.getColumnIndex("param1")), cursor.getString(cursor.getColumnIndex("curr_name")));
            list.add(ll);
            cursor.moveToNext();
        }
        cursor.close();
        C0302OM om = this.f1524N;
        if (om != null) {
            om.notifyDataSetChanged();
        }
        try {
            if (this.f1609wa == 0) {
                mo1620v();
            }
            mo1538a(1, 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: G */
    public void mo1525G() {
        try {
            this.f1501Ba.requestFocus();
            this.f1511Ga.setText(null);
            this.f1523Ma.setTag(null);
            Toast.makeText(getActivity(), getActivity().getString(2131755249), 0).show();
        } catch (Exception e) {
            Toast.makeText(getActivity(), e.getMessage(), 1).show();
            Log.d("move_transaction", e.getMessage());
        }
    }

    /* renamed from: H */
    public void mo1526H() {
        mo1578f(true);
        new Thread(new C0152HQ(this)).start();
    }

    /* renamed from: I */
    public final void mo1527I() {
        try {
            if (C0195JU.f451k) {
                if (this.f1545Xa.size() == 0) {
                    this.f1545Xa = this.f1606v.mo605p();
                }
                int i = 0;
                while (i < this.f1545Xa.size()) {
                    if (this.f1590na >= this.f1545Xa.size() - 1) {
                        this.f1590na = -1;
                    }
                    this.f1590na++;
                    String str = (String) ((HashMap) this.f1545Xa.get(this.f1590na)).get(Attribute.NAME);
                    if (str.equals("") || this.f1606v.mo545c(this.f1553b, str).getCount() <= 0 || str.equals(this.f1562e)) {
                        i++;
                    } else {
                        this.f1562e = str;
                        mo1524F();
                        return;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: J */
    public void mo1528J() {
        C0356QU qu = new C0356QU(2, this.f1606v, this.f1501Ba, this.f1503Ca, this.f1511Ga, getActivity(), this.f1537Ta, this.f1515Ia, new C0334PU());
        C0288NU.m892a().mo934a(qu);
    }

    /* renamed from: K */
    public final void mo1529K() {
        String[] stringArray = getActivity().getResources().getStringArray(2130903056);
        Builder builder = new Builder(getActivity());
        builder.setItems(stringArray, new C0172IQ(this, stringArray));
        AlertDialog create = builder.create();
        ListView listView = create.getListView();
        listView.setDivider(new ColorDrawable(-7829368));
        listView.setDividerHeight(1);
        create.show();
    }

    /* renamed from: L */
    public void mo1530L() {
        String str;
        String str2;
        int i;
        FragmentActivity fragmentActivity;
        int i2;
        FragmentActivity fragmentActivity2;
        StringBuilder sb = new StringBuilder();
        int size = this.f1528P.size();
        while (true) {
            size--;
            str = "\n";
            str2 = " ";
            if (size < 0) {
                break;
            } else if (this.f1528P.valueAt(size)) {
                C0232LL item = this.f1524N.getItem(this.f1528P.keyAt(size));
                if (item.mo780k() == this.f1546Y[0]) {
                    fragmentActivity2 = getActivity();
                    i2 = 2131755142;
                } else {
                    fragmentActivity2 = getActivity();
                    i2 = 2131755160;
                }
                sb.append(fragmentActivity2.getString(i2));
                sb.append(str2);
                sb.append(item.mo775f());
                sb.append(str2);
                sb.append(item.mo779j());
                sb.append(str2);
                sb.append(getActivity().getString(2131755159));
                sb.append(str2);
                sb.append(item.mo777h().substring(0, 5));
                sb.append(str);
            }
        }
        double a = mo1536a(this.f1524N.f863d);
        if (a >= 0.0d) {
            sb.append(str);
            fragmentActivity = getActivity();
            i = 2131755255;
        } else {
            sb.append(str);
            fragmentActivity = getActivity();
            i = 2131755253;
        }
        sb.append(fragmentActivity.getString(i));
        sb.append(str2);
        sb.append(this.f1606v.mo448B(String.valueOf(a)));
        this.f1606v.mo486V(sb.toString());
    }

    /* renamed from: M */
    public void mo1531M() {
        Dialog dialog = new Dialog(getActivity());
        LinearLayout linearLayout = new LinearLayout(getActivity());
        String[] stringArray = getActivity().getResources().getStringArray(2130903059);
        TypedArray obtainTypedArray = getActivity().getResources().obtainTypedArray(2130903046);
        ListView listView = new ListView(getActivity());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < stringArray.length; i++) {
            arrayList.add(new C0796gO(stringArray[i], obtainTypedArray.getResourceId(i, -1)));
        }
        obtainTypedArray.recycle();
        listView.setAdapter(new C0063DH(getActivity(), arrayList));
        listView.setOnItemClickListener(new C0171IP(this, dialog));
        linearLayout.setFocusable(true);
        listView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        listView.setDividerHeight(0);
        linearLayout.addView(listView, -1, -1);
        dialog.requestWindowFeature(1);
        dialog.setContentView(linearLayout);
        dialog.show();
    }

    /* renamed from: N */
    public void mo1532N() {
        Dialog dialog = new Dialog(getActivity());
        LinearLayout linearLayout = new LinearLayout(getActivity());
        this.f1538U = getActivity().getResources().getStringArray(2130903058);
        this.f1540V = getActivity().getResources().obtainTypedArray(2130903045);
        ListView listView = new ListView(getActivity());
        this.f1542W = new ArrayList();
        int i = 0;
        while (true) {
            String[] strArr = this.f1538U;
            if (i < strArr.length) {
                this.f1542W.add(new C0796gO(strArr[i], this.f1540V.getResourceId(i, -1)));
                i++;
            } else {
                this.f1540V.recycle();
                this.f1544X = new C0063DH(getActivity(), this.f1542W);
                listView.setAdapter(this.f1544X);
                listView.setOnItemClickListener(new C0151HP(this, dialog));
                linearLayout.setFocusable(true);
                listView.setBackgroundColor(Color.parseColor("#FFFFFF"));
                listView.setDividerHeight(0);
                linearLayout.addView(listView, -1, -1);
                dialog.requestWindowFeature(1);
                dialog.setContentView(linearLayout);
                dialog.show();
                return;
            }
        }
    }

    /* renamed from: O */
    public void mo1533O() {
        if (this.f1606v.mo524a("prefAutoSMS", false)) {
            try {
                mo1579g();
                return;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.f1606v.mo524a("prefAutoNotify", true)) {
            TextView textView = (TextView) this.f1605ua.getView().findViewById(2131296631);
            C0232LL B = mo1521B();
            StringBuilder sb = new StringBuilder();
            sb.append(B.mo780k() == this.f1546Y[0] ? this.f1560da : this.f1563ea);
            String str = " ";
            sb.append(str);
            sb.append(B.mo775f());
            sb.append(str);
            sb.append(B.mo779j());
            this.f1605ua.setText(sb.toString());
            this.f1605ua.setAction(this.f1575ia, new C0052CP(this));
            textView.setCompoundDrawablesWithIntrinsicBounds(ContextCompat.getDrawable(getActivity(), 17301586), null, null, null);
            textView.setOnClickListener(new C0071DP(this));
            ViewCompat.setLayoutDirection(this.f1605ua.getView(), 1);
            this.f1605ua.show();
            new Handler().postDelayed(new C0090EP(this), (long) 5000);
        }
    }

    /* renamed from: P */
    public void mo1534P() {
        mo1520A();
        if (this.f1609wa == 1) {
            mo1553b(1);
            mo1581h(this.f1596q);
            this.f1524N.notifyDataSetChanged();
            this.f1530Q = 1;
        }
    }

    /* renamed from: Q */
    public void mo1535Q() {
        try {
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492934, null);
            builder.setView(inflate);
            TextView textView = (TextView) inflate.findViewById(2131296431);
            TextView textView2 = (TextView) inflate.findViewById(2131296433);
            TextView textView3 = (TextView) inflate.findViewById(2131296683);
            ImageView imageView = (ImageView) inflate.findViewById(2131296344);
            ImageView imageView2 = (ImageView) inflate.findViewById(2131296685);
            ((TextView) inflate.findViewById(2131296435)).setText(this.f1580k);
            textView2.setText(this.f1574i);
            textView.setText(this.f1577j);
            textView3.setText(this.f1606v.mo557d(this.f1571h));
            if (C0195JU.f451k) {
                ((TableRow) inflate.findViewById(2131296678)).setVisibility(0);
                ((TextView) inflate.findViewById(2131296432)).setText(this.f1589n);
            }
            imageView2.setImageResource(this.f1586m);
            if (!this.f1583l.equals("")) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0195JU.f442b);
                sb.append(this.f1583l);
                imageView.setImageBitmap(C0195JU.m414a(sb.toString(), 300, 300));
                imageView.setTag(this.f1583l);
                imageView.getLayoutParams().width = 200;
                imageView.getLayoutParams().height = 200;
            } else {
                imageView.setVisibility(8);
            }
            builder.setCancelable(true);
            if (imageView.getTag() != null) {
                builder.setNeutralButton(getString(2131755422), new C0439UP(this, imageView));
            }
            builder.setPositiveButton(getString(2131755170), new C0460VP(this));
            builder.setNegativeButton(getString(2131755359), new C0481WP(this));
            AlertDialog create = builder.create();
            create.setTitle(this.f1556c);
            create.show();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":");
            sb2.append(e.getMessage());
            Log.d("adv_search_error=", sb2.toString());
        }
    }

    /* renamed from: a */
    public double mo1536a(List<C0232LL> list) {
        if (this.f1609wa == 1) {
            double d = f1497a;
            this.f1609wa = 0;
            return d;
        }
        double d2 = 0.0d;
        for (int size = list.size() - 1; size >= 0; size--) {
            int i = ((C0232LL) list.get(size)).mo780k() == this.f1546Y[0] ? -1 : ((C0232LL) list.get(size)).mo780k() == this.f1546Y[2] ? 1 : 0;
            double parseDouble = Double.parseDouble(((C0232LL) list.get(size)).mo775f().replaceAll(",", ""));
            double d3 = (double) i;
            Double.isNaN(d3);
            d2 += parseDouble * d3;
        }
        return d2;
    }

    /* renamed from: a */
    public void mo1537a() {
        C0195JU ju = this.f1606v;
        StringBuilder sb = new StringBuilder();
        sb.append("insert into customers (name,gsm) values('");
        sb.append(this.f1501Ba.getText());
        sb.append("','0')");
        ju.mo562d(sb.toString());
    }

    /* renamed from: a */
    public void mo1538a(int i, int i2) {
        try {
            new Handler().postDelayed(new C0053CQ(this, i), (long) i2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo1539a(Intent intent) {
        try {
            File file = new File(C0195JU.f442b);
            if (!file.exists()) {
                file.mkdirs();
            }
            String str = C0195JU.f442b;
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            sb.append(".jpg");
            File file2 = new File(str, sb.toString());
            file2.createNewFile();
            mo1545a(VERSION.SDK_INT >= 24 ? new File(C0195JU.f461u) : new File(m1463a((Context) getActivity(), this.f1585lb)), file2);
            mo1570d(file2.getName());
        } catch (Exception e) {
            Toast.makeText(getActivity(), e.getMessage(), 1).show();
        }
    }

    /* renamed from: a */
    public void onLoadFinished(Loader<List<C0232LL>> loader, List<C0232LL> list) {
        StringBuilder sb = new StringBuilder();
        sb.append("onLoadFinished:");
        sb.append(this.f1553b);
        String str = ":";
        sb.append(str);
        sb.append(this.f1556c);
        sb.append(str);
        sb.append(isResumed());
        sb.append(str);
        sb.append(this.f1498A);
        sb.append(str);
        sb.append(getUserVisibleHint());
        Log.d("Loader=", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(FragmentStatePagerSupport_Main.m2279h());
        sb2.append(str);
        sb2.append(this.f1553b);
        sb2.append(str);
        sb2.append(this.f1562e);
        Log.d("trace_E_Loader_cus=", sb2.toString());
        try {
            this.f1596q = list;
            this.f1526O.setEmptyView(this.f1522M);
            this.f1524N = new C0302OM(getActivity(), 2131492929, this.f1596q);
            this.f1526O.setAdapter(this.f1524N);
            mo1590l();
            if (this.f1610x && this.f1612y.equals(this.f1556c)) {
                this.f1606v.mo631x("show_move_tr", "0");
                mo1565c(true);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo1541a(View view) {
        mo1565c(true);
    }

    /* renamed from: a */
    public void mo1542a(View view, boolean z) {
        if (z) {
            mo1529K();
        } else {
            mo1622x();
        }
    }

    /* renamed from: a */
    public void mo1543a(ArrayAdapter<String> arrayAdapter, AutoCompleteTextView autoCompleteTextView) {
        Dialog dialog = new Dialog(getActivity());
        LinearLayout linearLayout = new LinearLayout(getActivity());
        ListView listView = new ListView(getActivity());
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new C0308OQ(this, autoCompleteTextView, dialog));
        linearLayout.setFocusable(true);
        listView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        linearLayout.addView(listView, -1, -1);
        dialog.setContentView(linearLayout);
        dialog.setTitle(getString(2131755308));
        dialog.show();
    }

    /* renamed from: a */
    public final void mo1544a(ImageView imageView) {
        imageView.setTag(null);
        imageView.setImageResource(2131230821);
        imageView.getLayoutParams().width = this.f1569ga;
        imageView.getLayoutParams().height = this.f1569ga;
    }

    /* renamed from: a */
    public final void mo1545a(File file, File file2) {
        if (file.exists()) {
            FileChannel channel = new FileInputStream(file).getChannel();
            FileChannel channel2 = new FileOutputStream(file2).getChannel();
            if (!(channel2 == null || channel == null)) {
                channel2.transferFrom(channel, 0, channel.size());
            }
            if (channel != null) {
                channel.close();
            }
            if (channel2 != null) {
                channel2.close();
            }
        }
    }

    /* renamed from: a */
    public final void mo1546a(String str) {
        new Builder(getActivity()).setTitle("Permission Request").setMessage(str).setCancelable(false).setPositiveButton(17039379, new C0072DQ(this)).show();
    }

    /* renamed from: a */
    public void mo1547a(String str, String str2, String str3, String str4) {
        try {
            FragmentStatePagerSupport_Main.f2451d = true;
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492955, null);
            builder.setView(inflate);
            EditText editText = (EditText) inflate.findViewById(2131296387);
            EditText editText2 = (EditText) inflate.findViewById(2131296389);
            ImageView imageView = (ImageView) inflate.findViewById(2131296498);
            ImageView imageView2 = (ImageView) inflate.findViewById(2131296499);
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) inflate.findViewById(2131296384);
            editText.setText(str2);
            editText2.setText(str3);
            autoCompleteTextView.setText(str4);
            ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), 17367049, this.f1606v.mo457G());
            autoCompleteTextView.setThreshold(1);
            autoCompleteTextView.setAdapter(arrayAdapter);
            autoCompleteTextView.setOnItemClickListener(new C0330PQ(this, autoCompleteTextView));
            autoCompleteTextView.setOnTouchListener(new C0352QQ(this, autoCompleteTextView));
            this.f1570gb = editText2;
            editText2.requestFocus();
            imageView.setOnClickListener(new C0372RQ(this));
            imageView2.setOnClickListener(new C0394SQ(this, arrayAdapter, autoCompleteTextView));
            builder.setPositiveButton(getActivity().getString(2131755359), new C0414TQ(this));
            builder.setNegativeButton(getActivity().getString(2131755358), new C0461VQ(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            Button button = create.getButton(-1);
            C0482WQ wq = new C0482WQ(this, editText2, autoCompleteTextView, str, editText, create);
            button.setOnClickListener(wq);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo1548a(boolean z) {
        try {
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492922, null);
            builder.setView(inflate);
            this.f1505Da = (EditText) inflate.findViewById(2131296431);
            this.f1573hb = this.f1505Da;
            this.f1505Da.setFilters(new InputFilter[]{new C0345QL(2)});
            this.f1505Da.addTextChangedListener(new C0733dN(this.f1505Da));
            this.f1505Da.requestFocus();
            this.f1507Ea = (TextView) inflate.findViewById(2131296433);
            this.f1515Ia = (Button) inflate.findViewById(2131296349);
            this.f1517Ja = (Button) inflate.findViewById(2131296347);
            this.f1519Ka = (Button) inflate.findViewById(2131296348);
            this.f1606v.mo505a(this.f1517Ja, this.f1519Ka);
            this.f1521La = (ImageView) inflate.findViewById(2131296346);
            this.f1523Ma = (ImageView) inflate.findViewById(2131296344);
            this.f1525Na = (RadioGroup) inflate.findViewById(2131296583);
            this.f1527Oa = (RadioButton) inflate.findViewById(2131296581);
            this.f1529Pa = (RadioButton) inflate.findViewById(2131296582);
            this.f1606v.mo509a(this.f1527Oa, this.f1529Pa);
            this.f1525Na.check(2131296582);
            this.f1511Ga = (AutoCompleteTextView) inflate.findViewById(2131296435);
            this.f1531Qa = (LinearLayout) inflate.findViewById(2131296416);
            this.f1533Ra = (LinearLayout) inflate.findViewById(2131296417);
            this.f1535Sa = (LinearLayout) inflate.findViewById(2131296418);
            if (!z) {
                this.f1535Sa.setVisibility(0);
            }
            this.f1539Ua = (LinearLayout) inflate.findViewById(2131296420);
            this.f1541Va = (LinearLayout) inflate.findViewById(2131296424);
            this.f1543Wa = (RadioGroup) inflate.findViewById(2131296584);
            this.f1505Da.requestFocus();
            mo1572d(z);
            builder.setCancelable(true);
            AlertDialog create = builder.create();
            create.setTitle(this.f1556c);
            create.getWindow().setSoftInputMode(4);
            this.f1517Ja.setOnClickListener(new C0502XP(this, create));
            this.f1519Ka.setOnClickListener(new C0522YP(this, create));
            this.f1515Ia.setOnClickListener(new C0550ZP(this, create));
            this.f1521La.setOnClickListener(new C0573_P(this));
            this.f1523Ma.setOnClickListener(new C0608aQ(this, z));
            create.show();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(":");
            sb.append(e.getMessage());
            Log.d("edit_item_error=", sb.toString());
        }
    }

    /* renamed from: a */
    public boolean mo1549a(int i) {
        String str;
        String str2;
        int i2 = i;
        int i3 = i2 == 2131296347 ? -1 : i2 == 2131296348 ? 1 : 0;
        mo1609p();
        if (mo1592n() && i3 != 0) {
            try {
                String str3 = "')";
                String str4 = " )";
                String str5 = "(select id from currency where name='";
                String str6 = "0";
                String str7 = "',";
                String str8 = "',strftime('%Y-%m-%d','now'),'";
                String str9 = ",'";
                String str10 = "-";
                String str11 = "'),";
                String str12 = "','";
                String str13 = "";
                String str14 = ",";
                if (this.f1523Ma.getTag() == null) {
                    C0195JU ju = this.f1606v;
                    StringBuilder sb = new StringBuilder();
                    String str15 = str6;
                    sb.append("insert into transactions (cus_id,out,[in],date_,remarks,now_,param2,curr_id) values((select b.id from customers as b where b.name='");
                    sb.append(this.f1556c);
                    sb.append(str11);
                    sb.append(this.f1505Da.getText().toString().replaceAll(str14, str13).replaceAll(str10, str13));
                    sb.append(str14);
                    sb.append(i3);
                    sb.append(str9);
                    sb.append(this.f1507Ea.getText());
                    sb.append(str12);
                    sb.append(this.f1511Ga.getText());
                    sb.append(str8);
                    sb.append(this.f1606v.mo470M());
                    sb.append(str7);
                    if (this.f1543Wa.getTag() == null) {
                        str2 = str15;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str5);
                        sb2.append(this.f1543Wa.getTag().toString());
                        sb2.append(str3);
                        str2 = sb2.toString();
                    }
                    sb.append(str2);
                    sb.append(str4);
                    ju.mo562d(sb.toString());
                } else {
                    String str16 = str6;
                    C0195JU ju2 = this.f1606v;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("insert into transactions (cus_id,out,[in],date_,remarks,now_,param1,param2,curr_id) values((select b.id from customers as b where b.name='");
                    sb3.append(this.f1556c);
                    sb3.append(str11);
                    sb3.append(this.f1505Da.getText().toString().replaceAll(str14, str13).replaceAll(str10, str13));
                    sb3.append(str14);
                    sb3.append(i3);
                    sb3.append(str9);
                    sb3.append(this.f1507Ea.getText());
                    sb3.append(str12);
                    sb3.append(this.f1511Ga.getText());
                    sb3.append(str8);
                    sb3.append(this.f1523Ma.getTag().toString());
                    sb3.append(str12);
                    sb3.append(this.f1606v.mo470M());
                    sb3.append(str7);
                    if (this.f1543Wa.getTag() == null) {
                        str = str16;
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str5);
                        sb4.append(this.f1543Wa.getTag().toString());
                        sb4.append(str3);
                        str = sb4.toString();
                    }
                    sb3.append(str);
                    sb3.append(str4);
                    ju2.mo562d(sb3.toString());
                }
                this.f1505Da.setText(null);
                Calendar instance = Calendar.getInstance();
                this.f1507Ea.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(instance.getTime()));
                this.f1532R = instance.get(1);
                this.f1534S = instance.get(2);
                this.f1536T = instance.get(5);
                mo1544a(this.f1523Ma);
                this.f1511Ga.setText(null);
                this.f1505Da.requestFocus();
                try {
                    FragmentStatePagerSupport_Main.f2451d = true;
                } catch (Exception unused) {
                }
                return true;
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo1550a(String str, String str2, Context context) {
        C0191JQ jq = new C0191JQ(this);
        Builder builder = new Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(getActivity().getString(2131755137), new C0440UQ(this, jq));
        builder.setNegativeButton(getActivity().getString(2131755136), new C0503XQ(this, jq));
        builder.show();
        try {
            Looper.loop();
        } catch (RuntimeException unused) {
        }
        return this.f1595pa;
    }

    public void amount_add_btn(View view) {
        mo1548a(true);
    }

    /* renamed from: b */
    public void mo1552b() {
        C0195JU ju = this.f1606v;
        StringBuilder sb = new StringBuilder();
        sb.append("insert into customers (name,gsm) values('");
        sb.append(this.f1503Ca.getText());
        sb.append("','0')");
        ju.mo562d(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0064, code lost:
        if (p000.C0195JU.f451k == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0085, code lost:
        if (p000.C0195JU.f451k == false) goto L_0x008a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1553b(int r11) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r10.f1556c
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            r0.append(r11)
            r0.append(r1)
            int r1 = r10.f1609wa
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "footer_update="
            android.util.Log.d(r1, r0)
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance(r0)
            int r1 = r10.f1609wa
            r2 = 1
            r3 = 0
            r5 = 2
            r6 = 0
            java.lang.String r7 = ""
            if (r1 != r2) goto L_0x0093
            OM r11 = r10.f1524N
            java.util.List<LL> r11 = r11.f863d
            double r1 = r10.mo1536a(r11)
            java.lang.String r11 = r0.format(r1)
            r10.f1565f = r11
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 < 0) goto L_0x0067
            android.widget.ImageView r11 = r10.f1504D
            int[] r3 = r10.f1546Y
            r3 = r3[r5]
            r11.setImageResource(r3)
            android.widget.TextView r11 = r10.f1502C
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r10.f1566fa
            r3.append(r4)
            java.lang.String r0 = r0.format(r1)
            r3.append(r0)
            boolean r0 = p000.C0195JU.f451k
            if (r0 != 0) goto L_0x0088
            goto L_0x008a
        L_0x0067:
            android.widget.ImageView r11 = r10.f1504D
            int[] r3 = r10.f1546Y
            r3 = r3[r6]
            r11.setImageResource(r3)
            android.widget.TextView r11 = r10.f1502C
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r10.f1557ca
            r3.append(r4)
            java.lang.String r0 = r0.format(r1)
            r3.append(r0)
            boolean r0 = p000.C0195JU.f451k
            if (r0 != 0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            java.lang.String r7 = r10.f1562e
        L_0x008a:
            r3.append(r7)
            java.lang.String r0 = r3.toString()
            goto L_0x021e
        L_0x0093:
            java.lang.String r1 = " "
            if (r11 != r2) goto L_0x01aa
            java.util.ArrayList<java.lang.String> r11 = r10.f1558cb     // Catch:{ Exception -> 0x017e }
            int r11 = r11.size()     // Catch:{ Exception -> 0x017e }
            if (r11 <= 0) goto L_0x0153
            java.util.ArrayList<java.lang.String> r11 = r10.f1558cb     // Catch:{ Exception -> 0x017e }
            java.lang.Object r11 = r11.get(r6)     // Catch:{ Exception -> 0x017e }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x017e }
            double r8 = java.lang.Double.parseDouble(r11)     // Catch:{ Exception -> 0x017e }
            java.lang.String r11 = r0.format(r8)     // Catch:{ Exception -> 0x017e }
            r10.f1565f = r11     // Catch:{ Exception -> 0x017e }
            java.util.ArrayList<java.lang.String> r11 = r10.f1558cb     // Catch:{ Exception -> 0x017e }
            java.lang.Object r11 = r11.get(r6)     // Catch:{ Exception -> 0x017e }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x017e }
            double r8 = java.lang.Double.parseDouble(r11)     // Catch:{ Exception -> 0x017e }
            int r11 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r11 < 0) goto L_0x010c
            android.widget.ImageView r11 = r10.f1504D     // Catch:{ Exception -> 0x017e }
            int[] r2 = r10.f1546Y     // Catch:{ Exception -> 0x017e }
            r2 = r2[r5]     // Catch:{ Exception -> 0x017e }
            r11.setImageResource(r2)     // Catch:{ Exception -> 0x017e }
            android.widget.TextView r11 = r10.f1502C     // Catch:{ Exception -> 0x017e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017e }
            r2.<init>()     // Catch:{ Exception -> 0x017e }
            java.lang.String r3 = r10.f1566fa     // Catch:{ Exception -> 0x017e }
            r2.append(r3)     // Catch:{ Exception -> 0x017e }
            java.util.ArrayList<java.lang.String> r3 = r10.f1558cb     // Catch:{ Exception -> 0x017e }
            java.lang.Object r3 = r3.get(r6)     // Catch:{ Exception -> 0x017e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x017e }
            double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x017e }
            java.lang.String r0 = r0.format(r3)     // Catch:{ Exception -> 0x017e }
            r2.append(r0)     // Catch:{ Exception -> 0x017e }
            boolean r0 = p000.C0195JU.f451k     // Catch:{ Exception -> 0x017e }
            if (r0 != 0) goto L_0x00ef
            r0 = r7
            goto L_0x0100
        L_0x00ef:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017e }
            r0.<init>()     // Catch:{ Exception -> 0x017e }
            r0.append(r1)     // Catch:{ Exception -> 0x017e }
            java.lang.String r3 = r10.f1562e     // Catch:{ Exception -> 0x017e }
            r0.append(r3)     // Catch:{ Exception -> 0x017e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x017e }
        L_0x0100:
            r2.append(r0)     // Catch:{ Exception -> 0x017e }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x017e }
        L_0x0107:
            r11.setText(r0)     // Catch:{ Exception -> 0x017e }
            goto L_0x0221
        L_0x010c:
            android.widget.ImageView r11 = r10.f1504D     // Catch:{ Exception -> 0x017e }
            int[] r2 = r10.f1546Y     // Catch:{ Exception -> 0x017e }
            r2 = r2[r6]     // Catch:{ Exception -> 0x017e }
            r11.setImageResource(r2)     // Catch:{ Exception -> 0x017e }
            android.widget.TextView r11 = r10.f1502C     // Catch:{ Exception -> 0x017e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017e }
            r2.<init>()     // Catch:{ Exception -> 0x017e }
            java.lang.String r3 = r10.f1557ca     // Catch:{ Exception -> 0x017e }
            r2.append(r3)     // Catch:{ Exception -> 0x017e }
            java.util.ArrayList<java.lang.String> r3 = r10.f1558cb     // Catch:{ Exception -> 0x017e }
            java.lang.Object r3 = r3.get(r6)     // Catch:{ Exception -> 0x017e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x017e }
            double r3 = java.lang.Double.parseDouble(r3)     // Catch:{ Exception -> 0x017e }
            java.lang.String r0 = r0.format(r3)     // Catch:{ Exception -> 0x017e }
            r2.append(r0)     // Catch:{ Exception -> 0x017e }
            boolean r0 = p000.C0195JU.f451k     // Catch:{ Exception -> 0x017e }
            if (r0 != 0) goto L_0x013a
            r0 = r7
            goto L_0x014b
        L_0x013a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017e }
            r0.<init>()     // Catch:{ Exception -> 0x017e }
            r0.append(r1)     // Catch:{ Exception -> 0x017e }
            java.lang.String r3 = r10.f1562e     // Catch:{ Exception -> 0x017e }
            r0.append(r3)     // Catch:{ Exception -> 0x017e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x017e }
        L_0x014b:
            r2.append(r0)     // Catch:{ Exception -> 0x017e }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x017e }
            goto L_0x0107
        L_0x0153:
            android.widget.TextView r11 = r10.f1502C     // Catch:{ Exception -> 0x017e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017e }
            r0.<init>()     // Catch:{ Exception -> 0x017e }
            java.lang.String r2 = r10.f1554ba     // Catch:{ Exception -> 0x017e }
            r0.append(r2)     // Catch:{ Exception -> 0x017e }
            boolean r2 = p000.C0195JU.f451k     // Catch:{ Exception -> 0x017e }
            if (r2 != 0) goto L_0x0165
            r2 = r7
            goto L_0x0176
        L_0x0165:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017e }
            r2.<init>()     // Catch:{ Exception -> 0x017e }
            r2.append(r1)     // Catch:{ Exception -> 0x017e }
            java.lang.String r3 = r10.f1562e     // Catch:{ Exception -> 0x017e }
            r2.append(r3)     // Catch:{ Exception -> 0x017e }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x017e }
        L_0x0176:
            r0.append(r2)     // Catch:{ Exception -> 0x017e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x017e }
            goto L_0x0107
        L_0x017e:
            android.widget.TextView r11 = r10.f1502C
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r10.f1554ba
            r0.append(r2)
            boolean r2 = p000.C0195JU.f451k
            if (r2 != 0) goto L_0x0190
            goto L_0x01a1
        L_0x0190:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = r10.f1562e
            r2.append(r1)
            java.lang.String r7 = r2.toString()
        L_0x01a1:
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            goto L_0x021e
        L_0x01aa:
            if (r11 != r5) goto L_0x0221
            OM r11 = r10.f1524N
            java.util.List<LL> r11 = r11.f863d
            double r8 = r10.mo1536a(r11)
            java.lang.String r11 = r0.format(r8)
            r10.f1565f = r11
            int r11 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r11 < 0) goto L_0x01e5
            android.widget.ImageView r11 = r10.f1504D
            int[] r2 = r10.f1546Y
            r2 = r2[r5]
            r11.setImageResource(r2)
            android.widget.TextView r11 = r10.f1502C
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r10.f1566fa
            r2.append(r3)
            java.lang.String r0 = r0.format(r8)
            r2.append(r0)
            boolean r0 = p000.C0195JU.f451k
            if (r0 != 0) goto L_0x01df
            goto L_0x0217
        L_0x01df:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x020b
        L_0x01e5:
            android.widget.ImageView r11 = r10.f1504D
            int[] r2 = r10.f1546Y
            r2 = r2[r6]
            r11.setImageResource(r2)
            android.widget.TextView r11 = r10.f1502C
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r10.f1557ca
            r2.append(r3)
            java.lang.String r0 = r0.format(r8)
            r2.append(r0)
            boolean r0 = p000.C0195JU.f451k
            if (r0 != 0) goto L_0x0206
            goto L_0x0217
        L_0x0206:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x020b:
            r0.append(r1)
            java.lang.String r1 = r10.f1562e
            r0.append(r1)
            java.lang.String r7 = r0.toString()
        L_0x0217:
            r2.append(r7)
            java.lang.String r0 = r2.toString()
        L_0x021e:
            r11.setText(r0)
        L_0x0221:
            r10.mo1522C()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0523YQ.mo1553b(int):void");
    }

    /* renamed from: b */
    public final void mo1554b(Intent intent) {
        if (intent != null) {
            try {
                File file = new File(C0195JU.f442b);
                if (!file.exists()) {
                    file.mkdirs();
                }
                String str = C0195JU.f442b;
                StringBuilder sb = new StringBuilder();
                sb.append(System.currentTimeMillis());
                sb.append(".jpg");
                File file2 = new File(str, sb.toString());
                file2.createNewFile();
                mo1545a(new File(this.f1606v.mo530b((Context) getActivity(), intent.getData())), file2);
                mo1570d(file2.getName());
            } catch (IOException | Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo1555b(View view) {
        RadioButton radioButton = (RadioButton) view;
        if (radioButton.isChecked()) {
            this.f1543Wa.setTag(radioButton.getText().toString());
            Log.d("radio_checked:=", radioButton.getText().toString());
            if (this.f1543Wa.getTag() != null) {
                this.f1562e = this.f1543Wa.getTag().toString();
            }
        }
    }

    /* renamed from: b */
    public void mo1556b(String str) {
        C0082EH t = this.f1606v.mo617t(str);
        if (!t.mo191f().equals("")) {
            this.f1553b = t.mo191f();
            this.f1556c = t.mo192g();
            this.f1568g = t.mo189e();
            this.f1565f = "0";
            this.f1559d = t.mo187d();
            getActivity().setTitle(this.f1556c);
        }
    }

    /* renamed from: b */
    public final void mo1557b(List<C0232LL> list) {
        Collections.sort(this.f1596q, new C0525b(this, null));
    }

    /* renamed from: b */
    public void mo1558b(boolean z) {
        try {
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492923, null);
            builder.setView(inflate);
            this.f1501Ba = (AutoCompleteTextView) inflate.findViewById(2131296470);
            this.f1503Ca = (AutoCompleteTextView) inflate.findViewById(2131296667);
            this.f1505Da = (EditText) inflate.findViewById(2131296431);
            this.f1573hb = this.f1505Da;
            this.f1505Da.setFilters(new InputFilter[]{new C0345QL(2)});
            this.f1505Da.addTextChangedListener(new C0733dN(this.f1505Da));
            this.f1505Da.requestFocus();
            this.f1507Ea = (TextView) inflate.findViewById(2131296433);
            this.f1515Ia = (Button) inflate.findViewById(2131296349);
            this.f1521La = (ImageView) inflate.findViewById(2131296346);
            this.f1523Ma = (ImageView) inflate.findViewById(2131296344);
            this.f1511Ga = (AutoCompleteTextView) inflate.findViewById(2131296435);
            this.f1531Qa = (LinearLayout) inflate.findViewById(2131296416);
            this.f1533Ra = (LinearLayout) inflate.findViewById(2131296417);
            this.f1537Ta = (LinearLayout) inflate.findViewById(2131296419);
            this.f1541Va = (LinearLayout) inflate.findViewById(2131296424);
            this.f1543Wa = (RadioGroup) inflate.findViewById(2131296584);
            this.f1505Da.requestFocus();
            mo1575e(z);
            builder.setCancelable(true);
            AlertDialog create = builder.create();
            StringBuilder sb = new StringBuilder();
            sb.append(getActivity().getString(2131755193));
            sb.append("#");
            sb.append(this.f1594p);
            create.setTitle(sb.toString());
            create.getWindow().setSoftInputMode(4);
            this.f1515Ia.setOnClickListener(new C0628bQ(this, create));
            this.f1521La.setOnClickListener(new C0647cQ(this));
            this.f1523Ma.setOnClickListener(new C0756eQ(this, z));
            create.show();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":");
            sb2.append(e.getMessage());
            Log.d("edit_move_error=", sb2.toString());
        }
    }

    /* renamed from: b */
    public boolean mo1559b(String str, String str2, Context context) {
        C0237LQ lq = new C0237LQ(this);
        Builder builder = new Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(getActivity().getString(2131755137), new C0264MQ(this, lq));
        builder.setNegativeButton(getActivity().getString(2131755136), new C0284NQ(this, lq));
        builder.show();
        try {
            Looper.loop();
        } catch (RuntimeException unused) {
        }
        return this.f1595pa;
    }

    /* renamed from: c */
    public void mo1560c() {
        try {
            this.f1609wa = 0;
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492918, null);
            builder.setView(inflate);
            this.f1615za = (TextView) inflate.findViewById(2131296451);
            this.f1499Aa = (TextView) inflate.findViewById(2131296647);
            this.f1615za.setOnClickListener(new C0190JP(this));
            this.f1499Aa.setOnClickListener(new C0212KP(this));
            builder.setPositiveButton(getActivity().getString(2131755109), new C0236LP(this));
            builder.setNegativeButton(getActivity().getString(2131755106), new C0263MP(this));
            AlertDialog create = builder.create();
            create.getWindow().setSoftInputMode(4);
            create.show();
            create.getButton(-1).setOnClickListener(new C0283NP(this, create));
        } catch (Exception e) {
            Log.d("adv_search_error=", e.getMessage());
        }
    }

    /* renamed from: c */
    public void mo1561c(int i) {
        String str;
        String str2;
        C0195JU ju;
        StringBuilder sb;
        C0195JU ju2;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        String str3;
        C0195JU ju3;
        StringBuilder sb5;
        C0195JU ju4;
        String str4;
        int i2 = i;
        String str5 = this.f1565f;
        String str6 = this.f1568g;
        if (str6 == null || str6.length() < 3) {
            if (i2 == 2) {
                this.f1607va = 5;
            }
            mo1547a(this.f1553b, this.f1556c, this.f1568g, this.f1559d);
            return;
        }
        String str7 = "-";
        String str8 = "";
        String str9 = "\t";
        String str10 = ":";
        String str11 = ".pdf";
        String str12 = "prefSMS_header";
        String str13 = "0";
        if (str5.contains(str7)) {
            if (i2 == 1) {
                ju3 = this.f1606v;
                str3 = this.f1568g;
                sb4 = new StringBuilder();
                sb4.append((this.f1606v.mo609q(str12, str13).equals(str13) || this.f1606v.mo609q(str12, str13).length() == 0) ? getActivity().getString(2131755142) : this.f1606v.mo609q(str12, str13));
                sb4.append(str10);
                sb4.append(str5);
                if (C0195JU.f451k) {
                    sb5 = new StringBuilder();
                }
                sb4.append(str8);
                ju3.mo634y(str3, sb4.toString());
            }
            mo1573e();
            if (!C0195JU.f451k) {
                C0195JU ju5 = this.f1606v;
                ju5.mo507a(this.f1526O, ju5.mo465K(this.f1556c), mo1536a(this.f1524N.f863d), this.f1611xa, this.f1613ya);
                ju = this.f1606v;
                str2 = this.f1568g;
                sb3 = new StringBuilder();
                sb3.append(this.f1606v.mo465K(this.f1556c));
                sb3.append(str11);
                str = sb3.toString();
                ju.mo446A(str2, str);
                return;
            }
            C0195JU ju6 = this.f1606v;
            ListView listView = this.f1526O;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.f1556c);
            sb6.append(str7);
            sb6.append(this.f1562e);
            ju6.mo508a(listView, ju6.mo465K(sb6.toString()), mo1536a(this.f1524N.f863d), this.f1562e, this.f1611xa, this.f1613ya);
            ju4 = this.f1606v;
            str4 = this.f1568g;
            sb2 = new StringBuilder();
            ju2 = this.f1606v;
            sb = new StringBuilder();
            sb.append(this.f1556c);
            sb.append(str7);
            sb.append(this.f1562e);
            sb2.append(ju2.mo465K(sb.toString()));
            sb2.append(str11);
            str = sb2.toString();
            ju.mo446A(str2, str);
            return;
        } else if (i2 == 1) {
            ju3 = this.f1606v;
            str3 = this.f1568g;
            sb4 = new StringBuilder();
            sb4.append((this.f1606v.mo609q(str12, str13).equals(str13) || this.f1606v.mo609q(str12, str13).length() == 0) ? getActivity().getString(2131755160) : this.f1606v.mo609q(str12, str13));
            sb4.append(str10);
            sb4.append(str5);
            if (C0195JU.f451k) {
                sb5 = new StringBuilder();
            }
            sb4.append(str8);
            ju3.mo634y(str3, sb4.toString());
        } else {
            mo1573e();
            if (!C0195JU.f451k) {
                C0195JU ju7 = this.f1606v;
                ju7.mo507a(this.f1526O, ju7.mo465K(this.f1556c), mo1536a(this.f1524N.f863d), this.f1611xa, this.f1613ya);
                ju = this.f1606v;
                str2 = this.f1568g;
                sb3 = new StringBuilder();
                sb3.append(this.f1606v.mo465K(this.f1556c));
                sb3.append(str11);
                str = sb3.toString();
                ju.mo446A(str2, str);
                return;
            }
            C0195JU ju8 = this.f1606v;
            ListView listView2 = this.f1526O;
            StringBuilder sb7 = new StringBuilder();
            sb7.append(this.f1556c);
            sb7.append(str7);
            sb7.append(this.f1562e);
            ju8.mo508a(listView2, ju8.mo465K(sb7.toString()), mo1536a(this.f1524N.f863d), this.f1562e, this.f1611xa, this.f1613ya);
            ju4 = this.f1606v;
            str4 = this.f1568g;
            sb2 = new StringBuilder();
            ju2 = this.f1606v;
            sb = new StringBuilder();
            sb.append(this.f1556c);
            sb.append(str7);
            sb.append(this.f1562e);
            sb2.append(ju2.mo465K(sb.toString()));
            sb2.append(str11);
            str = sb2.toString();
            ju.mo446A(str2, str);
            return;
        }
        sb5.append(str9);
        sb5.append(this.f1562e);
        str8 = sb5.toString();
        sb4.append(str8);
        ju3.mo634y(str3, sb4.toString());
    }

    /* renamed from: c */
    public void mo1562c(View view) {
        startActivityForResult(new Intent("android.intent.action.PICK", Phone.CONTENT_URI), 1);
    }

    /* renamed from: c */
    public void mo1563c(String str) {
        try {
            this.f1524N.getFilter().filter(str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final void mo1564c(List<C0232LL> list) {
        Collections.sort(this.f1596q, new C0527d(this, null));
    }

    /* renamed from: c */
    public void mo1565c(boolean z) {
        AutoCompleteTextView autoCompleteTextView;
        try {
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492923, null);
            builder.setView(inflate);
            this.f1501Ba = (AutoCompleteTextView) inflate.findViewById(2131296470);
            this.f1503Ca = (AutoCompleteTextView) inflate.findViewById(2131296667);
            if (!this.f1610x || !this.f1612y.equals(this.f1556c)) {
                this.f1501Ba.setText(this.f1556c);
                autoCompleteTextView = this.f1503Ca;
            } else {
                this.f1501Ba.setText("");
                autoCompleteTextView = this.f1501Ba;
            }
            autoCompleteTextView.requestFocus();
            this.f1505Da = (EditText) inflate.findViewById(2131296431);
            this.f1573hb = this.f1505Da;
            this.f1505Da.setFilters(new InputFilter[]{new C0345QL(2)});
            this.f1505Da.addTextChangedListener(new C0733dN(this.f1505Da));
            this.f1507Ea = (TextView) inflate.findViewById(2131296433);
            this.f1515Ia = (Button) inflate.findViewById(2131296349);
            this.f1521La = (ImageView) inflate.findViewById(2131296346);
            this.f1523Ma = (ImageView) inflate.findViewById(2131296344);
            this.f1511Ga = (AutoCompleteTextView) inflate.findViewById(2131296435);
            this.f1531Qa = (LinearLayout) inflate.findViewById(2131296416);
            this.f1533Ra = (LinearLayout) inflate.findViewById(2131296417);
            this.f1537Ta = (LinearLayout) inflate.findViewById(2131296419);
            this.f1541Va = (LinearLayout) inflate.findViewById(2131296424);
            this.f1543Wa = (RadioGroup) inflate.findViewById(2131296584);
            mo1575e(z);
            builder.setCancelable(true);
            AlertDialog create = builder.create();
            create.setTitle(getActivity().getString(2131755052));
            create.getWindow().setSoftInputMode(4);
            this.f1515Ia.setOnClickListener(new C0779fQ(this, create));
            this.f1521La.setOnClickListener(new C0798gQ(this));
            this.f1523Ma.setOnClickListener(new C0818hQ(this, z));
            create.getWindow().getAttributes().gravity = 48;
            create.show();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append(":");
            sb.append(e.getMessage());
            Log.d("move_transaction_error=", sb.toString());
        }
    }

    /* renamed from: c */
    public boolean mo1566c(String str, String str2, Context context) {
        C1160xP xPVar = new C1160xP(this);
        Builder builder = new Builder(context);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(getActivity().getString(2131755137), new C1179yP(this, xPVar));
        builder.setNegativeButton(getActivity().getString(2131755136), new C1201zP(this, xPVar));
        builder.show();
        try {
            Looper.loop();
        } catch (RuntimeException unused) {
        }
        return this.f1597qa;
    }

    public void calc_pick_btn(View view) {
        Intent intent = new Intent(view.getContext(), Calculator.class);
        intent.putExtra("tr_amount", this.f1573hb.getText().toString());
        startActivityForResult(intent, 2);
    }

    public void call_btn(View view) {
        String str = this.f1568g;
        if (str == null || str.length() < 3) {
            this.f1607va = 1;
            mo1547a(this.f1553b, this.f1556c, this.f1568g, this.f1559d);
            return;
        }
        this.f1606v.mo541b(this.f1568g);
    }

    /* renamed from: d */
    public void mo1569d() {
        String str = "android.permission.SEND_SMS";
        if (!(ContextCompat.checkSelfPermission(getActivity(), str) == 0)) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{str}, C0776fN.AppCompatTheme_windowFixedHeightMajor);
        }
    }

    /* renamed from: d */
    public void mo1570d(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(C0195JU.f442b);
            sb.append(str);
            Bitmap a = C0195JU.m414a(sb.toString(), 300, 300);
            this.f1523Ma.getLayoutParams().width = (int) getActivity().getResources().getDimension(2131165264);
            this.f1523Ma.getLayoutParams().height = (int) getActivity().getResources().getDimension(2131165261);
            this.f1523Ma.setImageBitmap(a);
            this.f1523Ma.setTag(str);
        } catch (Exception e) {
            Toast.makeText(getActivity(), e.getMessage(), 1).show();
        }
    }

    /* renamed from: d */
    public final void mo1571d(List<C0232LL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0029BQ(this)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x00af  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1572d(boolean r8) {
        /*
            r7 = this;
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.String r3 = "dd-MM-yyyy"
            r1.<init>(r3, r2)
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            android.support.v4.app.FragmentActivity r3 = r7.getActivity()
            JU r4 = r7.f1606v
            java.lang.String r5 = r7.f1556c
            java.lang.String r6 = ""
            java.util.ArrayList r4 = r4.mo607p(r5, r6)
            r5 = 17367050(0x109000a, float:2.5162954E-38)
            r2.<init>(r3, r5, r4)
            r7.f1547Ya = r2
            android.widget.AutoCompleteTextView r2 = r7.f1511Ga
            r3 = 1
            r2.setThreshold(r3)
            android.widget.AutoCompleteTextView r2 = r7.f1511Ga
            android.widget.ArrayAdapter<java.lang.String> r4 = r7.f1547Ya
            r2.setAdapter(r4)
            r2 = 8
            r4 = 0
            if (r8 == 0) goto L_0x0062
            android.widget.LinearLayout r8 = r7.f1533Ra
            r8.setVisibility(r2)
            android.widget.LinearLayout r8 = r7.f1539Ua
            r8.setVisibility(r4)
            android.widget.LinearLayout r8 = r7.f1541Va
            r8.setVisibility(r4)
            r7.mo1624z()
            android.widget.TextView r8 = r7.f1507Ea
            java.util.Date r0 = r0.getTime()
            java.lang.String r0 = r1.format(r0)
            r8.setText(r0)
            android.widget.TextView r8 = r7.f1507Ea
            mQ r0 = new mQ
            r0.<init>(r7)
        L_0x005d:
            r8.setOnClickListener(r0)
            goto L_0x0107
        L_0x0062:
            android.widget.LinearLayout r8 = r7.f1539Ua
            r8.setVisibility(r2)
            android.widget.LinearLayout r8 = r7.f1533Ra
            r8.setVisibility(r4)
            android.widget.Button r8 = r7.f1515Ia
            android.support.v4.app.FragmentActivity r0 = r7.getActivity()
            r1 = 2131755108(0x7f100064, float:1.9141086E38)
            java.lang.String r0 = r0.getString(r1)
            r8.setText(r0)
            android.widget.AutoCompleteTextView r8 = r7.f1511Ga
            java.lang.String r0 = r7.f1580k
            r8.setText(r0)
            android.widget.TextView r8 = r7.f1507Ea
            java.lang.String r0 = r7.f1574i
            r8.setText(r0)
            android.widget.EditText r8 = r7.f1505Da
            java.lang.String r0 = r7.f1577j
            r8.setText(r0)
            int r8 = r7.f1586m
            int[] r0 = r7.f1546Y
            r1 = r0[r4]
            if (r8 != r1) goto L_0x009f
            android.widget.RadioButton r8 = r7.f1527Oa
        L_0x009b:
            r8.setChecked(r3)
            goto L_0x00a7
        L_0x009f:
            r1 = 2
            r0 = r0[r1]
            if (r8 != r0) goto L_0x00a7
            android.widget.RadioButton r8 = r7.f1529Pa
            goto L_0x009b
        L_0x00a7:
            java.lang.String r8 = r7.f1583l
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x00e6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = p000.C0195JU.f442b
            r8.append(r0)
            java.lang.String r0 = r7.f1583l
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r0 = 100
            android.graphics.Bitmap r8 = p000.C0195JU.m414a(r8, r0, r0)
            android.widget.ImageView r1 = r7.f1523Ma
            r1.setImageBitmap(r8)
            android.widget.ImageView r8 = r7.f1523Ma
            java.lang.String r1 = r7.f1583l
            r8.setTag(r1)
            android.widget.ImageView r8 = r7.f1523Ma
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            r8.width = r0
            android.widget.ImageView r8 = r7.f1523Ma
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            r0 = 70
            r8.height = r0
        L_0x00e6:
            android.widget.EditText r8 = r7.f1505Da
            r8.selectAll()
            android.widget.EditText r8 = r7.f1505Da
            r8.requestFocus()
            r8 = 4
            r0 = 500(0x1f4, float:7.0E-43)
            r7.mo1538a(r8, r0)
            android.widget.LinearLayout r8 = r7.f1541Va
            r8.setVisibility(r4)
            r7.mo1624z()
            android.widget.TextView r8 = r7.f1507Ea
            nQ r0 = new nQ
            r0.<init>(r7)
            goto L_0x005d
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0523YQ.mo1572d(boolean):void");
    }

    /* renamed from: e */
    public void mo1573e() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        if (!(ContextCompat.checkSelfPermission(getActivity(), str) == 0)) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{str}, C0776fN.AppCompatTheme_windowActionBarOverlay);
        }
    }

    /* renamed from: e */
    public final void mo1574e(List<C0232LL> list) {
        Collections.sort(list, Collections.reverseOrder(new C1202zQ(this)));
    }

    /* renamed from: e */
    public void mo1575e(boolean z) {
        Calendar instance = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        this.f1501Ba.setThreshold(1);
        this.f1503Ca.setThreshold(1);
        this.f1511Ga.setThreshold(1);
        mo1528J();
        this.f1501Ba.setOnItemClickListener(new C0993pQ(this));
        this.f1503Ca.setOnItemClickListener(new C1012qQ(this));
        this.f1501Ba.setOnTouchListener(new C1034rQ(this));
        this.f1501Ba.addTextChangedListener(new C1054sQ(this));
        this.f1503Ca.setOnTouchListener(new C1074tQ(this));
        this.f1503Ca.addTextChangedListener(new C1094uQ(this));
        this.f1511Ga.addTextChangedListener(new C1114vQ(this));
        this.f1507Ea.setText(simpleDateFormat.format(instance.getTime()));
        this.f1541Va.setVisibility(0);
        mo1624z();
        this.f1507Ea.setOnClickListener(new C1141wQ(this));
        if (!z) {
            this.f1501Ba.setText(this.f1594p);
            this.f1503Ca.setText(this.f1592o);
            this.f1511Ga.setText(this.f1580k);
            this.f1507Ea.setText(this.f1574i);
            this.f1505Da.setText(this.f1577j);
            if (!this.f1583l.equals("")) {
                StringBuilder sb = new StringBuilder();
                sb.append(C0195JU.f442b);
                sb.append(this.f1583l);
                this.f1523Ma.setImageBitmap(C0195JU.m414a(sb.toString(), 100, 100));
                this.f1523Ma.setTag(this.f1583l);
                this.f1523Ma.getLayoutParams().width = 100;
                this.f1523Ma.getLayoutParams().height = 70;
            }
            this.f1505Da.selectAll();
            this.f1505Da.requestFocus();
            mo1538a(4, 500);
        }
    }

    /* renamed from: f */
    public void mo1576f() {
        String str = "android.permission.WRITE_CONTACTS";
        if (!(ContextCompat.checkSelfPermission(getActivity(), str) == 0)) {
            ActivityCompat.requestPermissions(getActivity(), new String[]{str}, C0776fN.AppCompatTheme_windowActionModeOverlay);
        }
    }

    /* renamed from: f */
    public final void mo1577f(List<C0232LL> list) {
        Collections.sort(this.f1596q, new C0529f(this, null));
    }

    /* renamed from: f */
    public void mo1578f(boolean z) {
        if (z) {
            this.f1561db = new ProgressDialog(getActivity());
            this.f1561db.setMessage(getString(2131755205));
            this.f1561db.show();
            return;
        }
        this.f1561db.hide();
    }

    /* renamed from: g */
    public void mo1579g() {
        mo1569d();
        this.f1607va = 3;
        String str = this.f1568g;
        if (str == null || str.length() < 3) {
            mo1547a(this.f1553b, this.f1556c, this.f1568g, this.f1559d);
            return;
        }
        C0232LL e = this.f1606v.mo563e(this.f1556c);
        C0195JU ju = this.f1606v;
        ju.mo516a(this.f1568g, ju.mo529b(e, this.f1556c, Double.parseDouble(e.mo768b())));
        if (!e.mo774e().equals("") && e.mo776g().length() > 8) {
            this.f1606v.mo516a(e.mo776g(), this.f1606v.mo549c(e, e.mo774e(), Double.parseDouble(e.mo772d())));
        }
    }

    /* renamed from: g */
    public final void mo1580g(List<C0232LL> list) {
        Collections.sort(this.f1596q, new C0528e(this, null));
    }

    /* renamed from: h */
    public final void mo1581h(List<C0232LL> list) {
        Collections.sort(this.f1596q, new C0524a(this, null));
    }

    /* renamed from: h */
    public boolean mo1582h() {
        boolean z;
        C0195JU ju;
        String str;
        String sb;
        String str2;
        mo1610q();
        if (!mo1594o()) {
            return false;
        }
        try {
            String str3 = "')";
            String str4 = " )";
            String str5 = "(select id from currency where name='";
            String str6 = "0";
            String str7 = "',";
            String str8 = "',strftime('%Y-%m-%d','now'),'";
            String str9 = ",'";
            String str10 = "-";
            String str11 = "'),";
            String str12 = "'),(select b.id from customers as b where b.name='";
            String str13 = "','";
            String str14 = "";
            String str15 = ",";
            if (this.f1523Ma.getTag() == null) {
                ju = this.f1606v;
                StringBuilder sb2 = new StringBuilder();
                String str16 = str6;
                sb2.append("insert into transactions (cus_id,t_cus_id,out,[in],date_,remarks,now_,param2,curr_id) values((select b.id from customers as b where b.name='");
                sb2.append(this.f1501Ba.getText().toString());
                sb2.append(str12);
                sb2.append(this.f1503Ca.getText().toString());
                sb2.append(str11);
                sb2.append(this.f1505Da.getText().toString().replaceAll(str15, str14).replaceAll(str10, str14));
                sb2.append(str15);
                sb2.append(1);
                sb2.append(str9);
                sb2.append(this.f1507Ea.getText());
                sb2.append(str13);
                sb2.append(this.f1511Ga.getText());
                sb2.append(str8);
                sb2.append(this.f1606v.mo470M());
                sb2.append(this.f1606v.mo470M());
                sb2.append(str7);
                if (this.f1543Wa.getTag() == null) {
                    str2 = str16;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str5);
                    sb3.append(this.f1543Wa.getTag().toString());
                    sb3.append(str3);
                    str2 = sb3.toString();
                }
                sb2.append(str2);
                sb2.append(str4);
                sb = sb2.toString();
            } else {
                String str17 = str6;
                ju = this.f1606v;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("insert into transactions (cus_id,t_cus_id,out,[in],date_,remarks,now_,param1,param2,curr_id) values((select b.id from customers as b where b.name='");
                sb4.append(this.f1501Ba.getText().toString());
                sb4.append(str12);
                sb4.append(this.f1503Ca.getText().toString());
                sb4.append(str11);
                sb4.append(this.f1505Da.getText().toString().replaceAll(str15, str14).replaceAll(str10, str14));
                sb4.append(str15);
                sb4.append(1);
                sb4.append(str9);
                sb4.append(this.f1507Ea.getText());
                sb4.append(str13);
                sb4.append(this.f1511Ga.getText());
                sb4.append(str8);
                sb4.append(this.f1523Ma.getTag().toString());
                sb4.append(str13);
                sb4.append(this.f1606v.mo470M());
                sb4.append(str7);
                if (this.f1543Wa.getTag() == null) {
                    str = str17;
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(str5);
                    sb5.append(this.f1543Wa.getTag().toString());
                    sb5.append(str3);
                    str = sb5.toString();
                }
                sb4.append(str);
                sb4.append(str4);
                sb = sb4.toString();
            }
            ju.mo562d(sb);
            mo1556b(this.f1501Ba.getText().toString());
            this.f1501Ba.setText(null);
            this.f1503Ca.setText(null);
            this.f1505Da.setText(null);
            Calendar instance = Calendar.getInstance();
            this.f1507Ea.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(instance.getTime()));
            this.f1532R = instance.get(1);
            this.f1534S = instance.get(2);
            this.f1536T = instance.get(5);
            mo1544a(this.f1523Ma);
            this.f1511Ga.setText(null);
            try {
                FragmentStatePagerSupport_Main.f2451d = true;
                return true;
            } catch (Exception unused) {
                z = true;
                return z;
            }
        } catch (Exception unused2) {
            z = false;
            return z;
        }
    }

    public void help_btn(View view) {
        mo1561c(((Integer) view.getTag()).intValue());
    }

    /* renamed from: i */
    public final void mo1584i(List<C0232LL> list) {
        Collections.sort(this.f1596q, new C0526c(this, null));
    }

    /* renamed from: i */
    public boolean mo1585i() {
        boolean z;
        boolean z2;
        int i = this.f1527Oa.isChecked() ? -1 : this.f1529Pa.isChecked() ? 1 : 0;
        mo1609p();
        if (!mo1611r()) {
            return false;
        }
        try {
            if (!this.f1515Ia.getText().equals(getActivity().getString(2131755108)) || this.f1571h == 0) {
                z2 = true;
                z = false;
            } else {
                String str = "')";
                String str2 = "'";
                String str3 = " where id='";
                String str4 = "(select id from currency where name='";
                String str5 = "0";
                String str6 = "',remarks='";
                String str7 = "',date_='";
                String str8 = "',[in]='";
                String str9 = "-";
                String str10 = ",";
                String str11 = "update transactions set out='";
                String str12 = "";
                if (this.f1523Ma.getTag() == null) {
                    try {
                        C0195JU ju = this.f1606v;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str11);
                        sb.append(this.f1505Da.getText().toString().replaceAll(str10, str12).replaceAll(str9, str12));
                        sb.append(str8);
                        sb.append(i);
                        sb.append(str7);
                        sb.append(this.f1507Ea.getText());
                        sb.append(str6);
                        sb.append(this.f1511Ga.getText());
                        sb.append("',param1='',curr_id=");
                        if (this.f1543Wa.getTag() != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str4);
                            sb2.append(this.f1543Wa.getTag().toString());
                            sb2.append(str);
                            str5 = sb2.toString();
                        }
                        sb.append(str5);
                        sb.append(str3);
                        sb.append(this.f1571h);
                        sb.append(str2);
                        ju.mo562d(sb.toString());
                    } catch (Exception unused) {
                        z = false;
                        Toast.makeText(getActivity(), getActivity().getString(2131755389), 1);
                        return z;
                    }
                } else {
                    C0195JU ju2 = this.f1606v;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str11);
                    sb3.append(this.f1505Da.getText().toString().replaceAll(str10, str12).replaceAll(str9, str12));
                    sb3.append(str8);
                    sb3.append(i);
                    sb3.append(str7);
                    sb3.append(this.f1507Ea.getText());
                    sb3.append(str6);
                    sb3.append(this.f1511Ga.getText());
                    sb3.append("',param1='");
                    sb3.append(this.f1523Ma.getTag().toString());
                    sb3.append("',curr_id=");
                    if (this.f1543Wa.getTag() != null) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str4);
                        sb4.append(this.f1543Wa.getTag().toString());
                        sb4.append(str);
                        str5 = sb4.toString();
                    }
                    sb3.append(str5);
                    sb3.append(str3);
                    sb3.append(this.f1571h);
                    sb3.append(str2);
                    ju2.mo562d(sb3.toString());
                }
                this.f1505Da.setText(null);
                Calendar instance = Calendar.getInstance();
                this.f1507Ea.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(instance.getTime()));
                this.f1532R = instance.get(1);
                this.f1534S = instance.get(2);
                this.f1536T = instance.get(5);
                this.f1511Ga.setText(null);
                mo1544a(this.f1523Ma);
                this.f1515Ia.setText(getActivity().getString(2131755103));
                this.f1571h = 0;
                z2 = true;
                z = true;
            }
            try {
                FragmentStatePagerSupport_Main.f2451d = z2;
                return z;
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            z = false;
            Toast.makeText(getActivity(), getActivity().getString(2131755389), 1);
            return z;
        }
    }

    /* renamed from: j */
    public final void mo1586j(List<C0232LL> list) {
        Collections.sort(list, Collections.reverseOrder(new C0010AQ(this)));
    }

    /* renamed from: j */
    public boolean mo1587j() {
        boolean z;
        C0195JU ju;
        String sb;
        int i = this.f1586m;
        int[] iArr = this.f1546Y;
        if (i != iArr[0]) {
            int i2 = iArr[2];
        }
        mo1610q();
        if (!mo1594o()) {
            return false;
        }
        try {
            if (!this.f1515Ia.getText().equals(getActivity().getString(2131755108)) || this.f1571h == 0) {
                z = false;
            } else {
                String str = " where id='";
                String str2 = "(select id from currency where name='";
                String str3 = "0";
                String str4 = "') ,curr_id=";
                String str5 = "') ,cus_id=(select id from customers where name='";
                String str6 = "',remarks='";
                String str7 = "',date_='";
                String str8 = "-";
                String str9 = ",";
                String str10 = "update transactions set out='";
                String str11 = "";
                if (this.f1523Ma.getTag() == null) {
                    ju = this.f1606v;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str10);
                    sb2.append(this.f1505Da.getText().toString().replaceAll(str9, str11).replaceAll(str8, str11));
                    sb2.append(str7);
                    sb2.append(this.f1507Ea.getText());
                    sb2.append(str6);
                    sb2.append(this.f1511Ga.getText());
                    sb2.append("',param1='',t_cus_id=(select id from customers where name='");
                    sb2.append(this.f1503Ca.getText().toString());
                    sb2.append(str5);
                    sb2.append(this.f1501Ba.getText().toString());
                    sb2.append(str4);
                    if (this.f1543Wa.getTag() != null) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(str2);
                        sb3.append(this.f1543Wa.getTag().toString());
                        sb3.append("')");
                        str3 = sb3.toString();
                    }
                    sb2.append(str3);
                    sb2.append(str);
                    sb2.append(this.f1571h);
                    sb2.append("'");
                    sb = sb2.toString();
                } else {
                    ju = this.f1606v;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str10);
                    sb4.append(this.f1505Da.getText().toString().replaceAll(str9, str11).replaceAll(str8, str11));
                    sb4.append(str7);
                    sb4.append(this.f1507Ea.getText());
                    sb4.append(str6);
                    sb4.append(this.f1511Ga.getText());
                    sb4.append("',param1='");
                    sb4.append(this.f1523Ma.getTag().toString());
                    sb4.append("',t_cus_id=(select id from customers where name='");
                    sb4.append(this.f1503Ca.getText().toString());
                    sb4.append(str5);
                    sb4.append(this.f1501Ba.getText().toString());
                    sb4.append(str4);
                    if (this.f1543Wa.getTag() != null) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str2);
                        sb5.append(this.f1543Wa.getTag().toString());
                        sb5.append("')");
                        str3 = sb5.toString();
                    }
                    sb4.append(str3);
                    sb4.append(str);
                    sb4.append(this.f1571h);
                    sb4.append("'");
                    sb = sb4.toString();
                }
                ju.mo562d(sb);
                this.f1501Ba.setText(null);
                this.f1505Da.setText(null);
                Calendar instance = Calendar.getInstance();
                this.f1507Ea.setText(new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(instance.getTime()));
                this.f1532R = instance.get(1);
                this.f1534S = instance.get(2);
                this.f1536T = instance.get(5);
                this.f1511Ga.setText(null);
                mo1544a(this.f1523Ma);
                z = true;
            }
            try {
                FragmentStatePagerSupport_Main.f2451d = true;
                return z;
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            z = false;
            Toast.makeText(getActivity(), getActivity().getString(2131755389), 1);
            return z;
        }
    }

    /* renamed from: k */
    public void mo1588k() {
        f1497a = 0.0d;
        for (int size = this.f1596q.size() - 1; size >= 0; size--) {
            String str = "";
            String str2 = ",";
            f1497a += Double.parseDouble(((C0232LL) this.f1596q.get(size)).mo775f().replaceAll(str2, str)) * (Double.parseDouble(((C0232LL) this.f1596q.get(size)).mo770c().replaceAll(str2, str)) - 1.0d);
            C0232LL ll = (C0232LL) this.f1596q.get(size);
            ll.mo769b(String.valueOf(f1497a));
            this.f1596q.set(size, ll);
        }
    }

    /* renamed from: k */
    public final void mo1589k(List<C0232LL> list) {
        Collections.sort(list, Collections.reverseOrder(new C1161xQ(this)));
    }

    /* renamed from: l */
    public void mo1590l() {
        C0288NU.m892a().mo934a(new C0356QU(16, this.f1524N, this.f1596q, new C0334PU()));
    }

    /* renamed from: m */
    public final void mo1591m() {
        mo1573e();
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        this.f1585lb = this.f1606v.mo494a((Context) getActivity(), intent);
        intent.putExtra(Tag.OUTPUT, this.f1585lb);
        startActivityForResult(intent, this.f1576ib);
    }

    /* renamed from: n */
    public final boolean mo1592n() {
        boolean a = C0008AO.m5a(this.f1505Da);
        if (!C0008AO.m5a(this.f1511Ga)) {
            a = false;
        }
        if (this.f1606v.mo519a()) {
            mo1618t();
            this.f1515Ia.setError(getActivity().getString(2131755238));
            return false;
        }
        this.f1515Ia.setError(null);
        return a;
    }

    public void no_result_btn(View view) {
        this.f1609wa = 0;
        mo1524F();
    }

    /* renamed from: o */
    public final boolean mo1594o() {
        boolean a = C0008AO.m5a(this.f1501Ba);
        if (!C0008AO.m5a(this.f1503Ca)) {
            a = false;
        }
        if (!C0008AO.m5a(this.f1505Da)) {
            a = false;
        }
        if (!C0008AO.m5a(this.f1511Ga)) {
            a = false;
        }
        if (this.f1606v.mo519a()) {
            mo1618t();
            this.f1515Ia.setError(getActivity().getString(2131755238));
            return false;
        }
        this.f1515Ia.setError(null);
        return a;
    }

    public void onActivityCreated(Bundle bundle) {
        C0523YQ.super.onActivityCreated(bundle);
        this.f1605ua = Snackbar.make(this.f1526O, "", -2);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str = "display_name";
        String str2 = "data1";
        try {
            getActivity();
            if (i2 == 0) {
                return;
            }
            if (i == 1) {
                getActivity();
                if (i2 == -1) {
                    Cursor query = getActivity().getContentResolver().query(intent.getData(), new String[]{str2, str}, null, null, null);
                    query.moveToFirst();
                    String string = query.getString(query.getColumnIndex(str2));
                    query.getString(query.getColumnIndex(str));
                    this.f1570gb.setText(string);
                    query.close();
                }
            } else if (i == 2) {
                if (intent != null) {
                    this.f1573hb.setText(intent.getStringExtra("calc_result"));
                }
            } else if (i == this.f1579jb) {
                mo1554b(intent);
            } else if (i == this.f1576ib) {
                mo1539a(intent);
            }
        } catch (Exception e) {
            Toast.makeText(getActivity(), e.getMessage(), 1).show();
        }
    }

    public void onAttach(Context context) {
        C0523YQ.super.onAttach(context);
        if (context instanceof Activity) {
            this.f1587ma = (Activity) context;
        }
    }

    public void onClick(View view) {
        this.f1596q = this.f1524N.f863d;
        switch (view.getId()) {
            case 2131296495:
                sort_tr_type_click(view);
                return;
            case 2131296675:
                sort_amount_click(view);
                return;
            case 2131296676:
                sort_net_bal_click(view);
                return;
            case 2131296679:
                sort_date_click(view);
                return;
            case 2131296682:
                sort_remarks_click(view);
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        C0523YQ.super.onCreate(bundle);
        try {
            String str = "";
            this.f1553b = getArguments() != null ? getArguments().getString("cus_id") : str;
            this.f1556c = getArguments() != null ? getArguments().getString("cus_name") : str;
            Log.d("cus_name_oncreate=", this.f1556c);
            this.f1568g = getArguments() != null ? getArguments().getString("cus_gsm") : str;
            this.f1559d = getArguments() != null ? getArguments().getString("g_name") : str;
            this.f1562e = getArguments() != null ? getArguments().getString("curr_name") : str;
            this.f1565f = getArguments() != null ? getArguments().getString("cus_bal") : str;
            List<C0232LL> list = null;
            this.f1600s = (getArguments() != null ? Integer.valueOf(getArguments().getInt(Property.POSITION)) : null).intValue();
            this.f1602t = (getArguments() != null ? Integer.valueOf(getArguments().getInt(Attribute.SIZE)) : null).intValue();
            this.f1598r = getArguments() != null ? getArguments().getString("searchString") : str;
            this.f1606v = new C0195JU(this.f1604u, getActivity());
            this.f1610x = this.f1606v.mo609q("show_move_tr", "0").equals("1");
            this.f1612y = this.f1606v.mo609q("show_move_tr_name", str);
            if (getArguments() != null) {
                list = (List) getArguments().getSerializable("cus_det");
            }
            this.f1596q = list;
            Calendar instance = Calendar.getInstance();
            new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
            this.f1532R = instance.get(1);
            this.f1534S = instance.get(2);
            this.f1536T = instance.get(5);
        } catch (Exception unused) {
        }
    }

    public Loader<List<C0232LL>> onCreateLoader(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append(FragmentStatePagerSupport_Main.m2279h());
        String str = ":";
        sb.append(str);
        sb.append(this.f1553b);
        sb.append(str);
        sb.append(this.f1562e);
        Log.d("trace_S_Loader_cus=", sb.toString());
        if (this.f1609wa == 0) {
            String str2 = Value.PERCENTAGE;
            this.f1611xa = str2;
            this.f1613ya = str2;
        }
        return new C0301OL(getActivity(), this.f1553b, this.f1562e, this.f1606v);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (menu != null) {
            menu.clear();
        }
        menuInflater.inflate(2131558409, menu);
        MenuItem findItem = menu.findItem(2131296605);
        SearchView actionView = MenuItemCompat.getActionView(findItem);
        actionView.setSearchableInfo(((SearchManager) getActivity().getSystemService("search")).getSearchableInfo(getActivity().getComponentName()));
        actionView.setQueryHint(getActivity().getString(2131755371));
        actionView.setOnQueryTextListener(new C0091EQ(this));
        MenuItemCompat.setOnActionExpandListener(findItem, new C0110FQ(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x027f A[Catch:{ Exception -> 0x0283 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, Bundle r8) {
        /*
            r5 = this;
            java.lang.String r8 = ":"
            r0 = 2131492894(0x7f0c001e, float:1.8609253E38)
            r1 = 0
            android.view.View r6 = r6.inflate(r0, r7, r1)     // Catch:{ Exception -> 0x028e }
            java.lang.String r7 = "onCreateView"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x028e }
            r0.<init>()     // Catch:{ Exception -> 0x028e }
            java.lang.String r2 = m1461E()     // Catch:{ Exception -> 0x028e }
            r0.append(r2)     // Catch:{ Exception -> 0x028e }
            java.lang.String r2 = "#"
            r0.append(r2)     // Catch:{ Exception -> 0x028e }
            java.lang.String r2 = r5.f1556c     // Catch:{ Exception -> 0x028e }
            r0.append(r2)     // Catch:{ Exception -> 0x028e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x028e }
            android.util.Log.d(r7, r0)     // Catch:{ Exception -> 0x028e }
            r7 = 1
            r5.setHasOptionsMenu(r7)     // Catch:{ Exception -> 0x028e }
            android.support.v4.app.FragmentActivity r0 = r5.getActivity()     // Catch:{ Exception -> 0x028e }
            r5.f1587ma = r0     // Catch:{ Exception -> 0x028e }
            r0 = -1
            r5.f1590na = r0     // Catch:{ Exception -> 0x028e }
            r2 = 2131296466(0x7f0900d2, float:1.821085E38)
            android.view.View r2 = r6.findViewById(r2)     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch:{ Exception -> 0x028e }
            r5.f1502C = r2     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r2 = r5.f1502C     // Catch:{ Exception -> 0x028e }
            FP r3 = new FP     // Catch:{ Exception -> 0x028e }
            r3.<init>(r5)     // Catch:{ Exception -> 0x028e }
            r2.setOnClickListener(r3)     // Catch:{ Exception -> 0x028e }
            r2 = 2131296495(0x7f0900ef, float:1.8210908E38)
            android.view.View r2 = r6.findViewById(r2)     // Catch:{ Exception -> 0x028e }
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch:{ Exception -> 0x028e }
            r5.f1504D = r2     // Catch:{ Exception -> 0x028e }
            r2 = 2131296497(0x7f0900f1, float:1.8210912E38)
            android.view.View r2 = r6.findViewById(r2)     // Catch:{ Exception -> 0x028e }
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch:{ Exception -> 0x028e }
            r5.f1506E = r2     // Catch:{ Exception -> 0x028e }
            r2 = 2131296502(0x7f0900f6, float:1.8210922E38)
            android.view.View r2 = r6.findViewById(r2)     // Catch:{ Exception -> 0x028e }
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch:{ Exception -> 0x028e }
            r5.f1508F = r2     // Catch:{ Exception -> 0x028e }
            r2 = 2131296498(0x7f0900f2, float:1.8210914E38)
            android.view.View r2 = r6.findViewById(r2)     // Catch:{ Exception -> 0x028e }
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch:{ Exception -> 0x028e }
            r5.f1510G = r2     // Catch:{ Exception -> 0x028e }
            r2 = 2131296503(0x7f0900f7, float:1.8210925E38)
            android.view.View r2 = r6.findViewById(r2)     // Catch:{ Exception -> 0x028e }
            android.widget.ImageView r2 = (android.widget.ImageView) r2     // Catch:{ Exception -> 0x028e }
            r5.f1512H = r2     // Catch:{ Exception -> 0x028e }
            JU r2 = r5.f1606v     // Catch:{ Exception -> 0x028e }
            java.lang.String r3 = "prefOthers_whats_bus"
            boolean r2 = r2.mo524a(r3, r1)     // Catch:{ Exception -> 0x028e }
            r3 = 2
            if (r2 == 0) goto L_0x00a7
            android.widget.ImageView r7 = r5.f1512H     // Catch:{ Exception -> 0x028e }
            android.support.v4.app.FragmentActivity r1 = r5.getActivity()     // Catch:{ Exception -> 0x028e }
            r2 = 2131230927(0x7f0800cf, float:1.807792E38)
            android.graphics.drawable.Drawable r1 = android.support.v4.content.ContextCompat.getDrawable(r1, r2)     // Catch:{ Exception -> 0x028e }
            r7.setImageDrawable(r1)     // Catch:{ Exception -> 0x028e }
            android.widget.ImageView r7 = r5.f1512H     // Catch:{ Exception -> 0x028e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x028e }
        L_0x00a3:
            r7.setTag(r1)     // Catch:{ Exception -> 0x028e }
            goto L_0x00e1
        L_0x00a7:
            JU r2 = r5.f1606v     // Catch:{ Exception -> 0x028e }
            java.lang.String r4 = "prefOthers_whats"
            boolean r1 = r2.mo524a(r4, r1)     // Catch:{ Exception -> 0x028e }
            if (r1 == 0) goto L_0x00c8
            android.widget.ImageView r7 = r5.f1512H     // Catch:{ Exception -> 0x028e }
            android.support.v4.app.FragmentActivity r1 = r5.getActivity()     // Catch:{ Exception -> 0x028e }
            r2 = 2131230926(0x7f0800ce, float:1.8077919E38)
            android.graphics.drawable.Drawable r1 = android.support.v4.content.ContextCompat.getDrawable(r1, r2)     // Catch:{ Exception -> 0x028e }
            r7.setImageDrawable(r1)     // Catch:{ Exception -> 0x028e }
            android.widget.ImageView r7 = r5.f1512H     // Catch:{ Exception -> 0x028e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x028e }
            goto L_0x00a3
        L_0x00c8:
            android.widget.ImageView r1 = r5.f1512H     // Catch:{ Exception -> 0x028e }
            android.support.v4.app.FragmentActivity r2 = r5.getActivity()     // Catch:{ Exception -> 0x028e }
            r3 = 2131230911(0x7f0800bf, float:1.8077888E38)
            android.graphics.drawable.Drawable r2 = android.support.v4.content.ContextCompat.getDrawable(r2, r3)     // Catch:{ Exception -> 0x028e }
            r1.setImageDrawable(r2)     // Catch:{ Exception -> 0x028e }
            android.widget.ImageView r1 = r5.f1512H     // Catch:{ Exception -> 0x028e }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x028e }
            r1.setTag(r7)     // Catch:{ Exception -> 0x028e }
        L_0x00e1:
            android.widget.ImageView r7 = r5.f1506E     // Catch:{ Exception -> 0x028e }
            android.view.View$OnClickListener r1 = r5.f1593oa     // Catch:{ Exception -> 0x028e }
            r7.setOnClickListener(r1)     // Catch:{ Exception -> 0x028e }
            android.widget.ImageView r7 = r5.f1508F     // Catch:{ Exception -> 0x028e }
            android.view.View$OnClickListener r1 = r5.f1593oa     // Catch:{ Exception -> 0x028e }
            r7.setOnClickListener(r1)     // Catch:{ Exception -> 0x028e }
            android.widget.ImageView r7 = r5.f1510G     // Catch:{ Exception -> 0x028e }
            android.view.View$OnClickListener r1 = r5.f1593oa     // Catch:{ Exception -> 0x028e }
            r7.setOnClickListener(r1)     // Catch:{ Exception -> 0x028e }
            android.widget.ImageView r7 = r5.f1512H     // Catch:{ Exception -> 0x028e }
            android.view.View$OnClickListener r1 = r5.f1593oa     // Catch:{ Exception -> 0x028e }
            r7.setOnClickListener(r1)     // Catch:{ Exception -> 0x028e }
            r7 = 2131296679(0x7f0901a7, float:1.8211281E38)
            android.view.View r7 = r6.findViewById(r7)     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x028e }
            r5.f1514I = r7     // Catch:{ Exception -> 0x028e }
            r7 = 2131296675(0x7f0901a3, float:1.8211273E38)
            android.view.View r7 = r6.findViewById(r7)     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x028e }
            r5.f1516J = r7     // Catch:{ Exception -> 0x028e }
            r7 = 2131296682(0x7f0901aa, float:1.8211288E38)
            android.view.View r7 = r6.findViewById(r7)     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x028e }
            r5.f1518K = r7     // Catch:{ Exception -> 0x028e }
            r7 = 2131296676(0x7f0901a4, float:1.8211275E38)
            android.view.View r7 = r6.findViewById(r7)     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x028e }
            r5.f1520L = r7     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r7 = r5.f1514I     // Catch:{ Exception -> 0x028e }
            r7.setOnClickListener(r5)     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r7 = r5.f1516J     // Catch:{ Exception -> 0x028e }
            r7.setOnClickListener(r5)     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r7 = r5.f1518K     // Catch:{ Exception -> 0x028e }
            r7.setOnClickListener(r5)     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r7 = r5.f1520L     // Catch:{ Exception -> 0x028e }
            r7.setOnClickListener(r5)     // Catch:{ Exception -> 0x028e }
            android.widget.ImageView r7 = r5.f1504D     // Catch:{ Exception -> 0x028e }
            r7.setOnClickListener(r5)     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r7 = r5.f1514I     // Catch:{ Exception -> 0x028e }
            r7.setTextColor(r0)     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r7 = r5.f1516J     // Catch:{ Exception -> 0x028e }
            r7.setTextColor(r0)     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r7 = r5.f1518K     // Catch:{ Exception -> 0x028e }
            r7.setTextColor(r0)     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r7 = r5.f1520L     // Catch:{ Exception -> 0x028e }
            r7.setTextColor(r0)     // Catch:{ Exception -> 0x028e }
            r7 = 2131296413(0x7f09009d, float:1.8210742E38)
            android.view.View r7 = r6.findViewById(r7)     // Catch:{ Exception -> 0x028e }
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7     // Catch:{ Exception -> 0x028e }
            r5.f1548Z = r7     // Catch:{ Exception -> 0x028e }
            r7 = 16908298(0x102000a, float:2.3877257E-38)
            android.view.View r7 = r6.findViewById(r7)     // Catch:{ Exception -> 0x028e }
            android.widget.ListView r7 = (android.widget.ListView) r7     // Catch:{ Exception -> 0x028e }
            r5.f1526O = r7     // Catch:{ Exception -> 0x028e }
            r7 = 2131296303(0x7f09002f, float:1.8210519E38)
            android.view.View r7 = r6.findViewById(r7)     // Catch:{ Exception -> 0x028e }
            android.support.v4.widget.SwipeRefreshLayout r7 = (android.support.v4.widget.SwipeRefreshLayout) r7     // Catch:{ Exception -> 0x028e }
            r5.f1584la = r7     // Catch:{ Exception -> 0x028e }
            android.support.v4.widget.SwipeRefreshLayout r7 = r5.f1584la     // Catch:{ Exception -> 0x028e }
            RP r0 = new RP     // Catch:{ Exception -> 0x028e }
            r0.<init>(r5)     // Catch:{ Exception -> 0x028e }
            r7.setOnRefreshListener(r0)     // Catch:{ Exception -> 0x028e }
            r7 = 16908292(0x1020004, float:2.387724E-38)
            android.view.View r7 = r6.findViewById(r7)     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x028e }
            r5.f1522M = r7     // Catch:{ Exception -> 0x028e }
            android.widget.TextView r7 = r5.f1522M     // Catch:{ Exception -> 0x028e }
            android.view.View$OnClickListener r0 = r5.f1593oa     // Catch:{ Exception -> 0x028e }
            r7.setOnClickListener(r0)     // Catch:{ Exception -> 0x028e }
            android.support.v4.app.FragmentActivity r7 = r5.getActivity()     // Catch:{ Exception -> 0x028e }
            r0 = 2131755188(0x7f1000b4, float:1.9141248E38)
            java.lang.String r7 = r7.getString(r0)     // Catch:{ Exception -> 0x028e }
            r5.f1554ba = r7     // Catch:{ Exception -> 0x028e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x028e }
            r7.<init>()     // Catch:{ Exception -> 0x028e }
            JU r0 = r5.f1606v     // Catch:{ Exception -> 0x028e }
            java.lang.String r0 = r0.mo597m()     // Catch:{ Exception -> 0x028e }
            r7.append(r0)     // Catch:{ Exception -> 0x028e }
            java.lang.String r0 = ":- "
            r7.append(r0)     // Catch:{ Exception -> 0x028e }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x028e }
            r5.f1557ca = r7     // Catch:{ Exception -> 0x028e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x028e }
            r7.<init>()     // Catch:{ Exception -> 0x028e }
            JU r0 = r5.f1606v     // Catch:{ Exception -> 0x028e }
            java.lang.String r0 = r0.mo455E()     // Catch:{ Exception -> 0x028e }
            r7.append(r0)     // Catch:{ Exception -> 0x028e }
            java.lang.String r0 = ":-"
            r7.append(r0)     // Catch:{ Exception -> 0x028e }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x028e }
            r5.f1566fa = r7     // Catch:{ Exception -> 0x028e }
            JU r7 = r5.f1606v     // Catch:{ Exception -> 0x028e }
            java.lang.String r7 = r7.mo597m()     // Catch:{ Exception -> 0x028e }
            r5.f1560da = r7     // Catch:{ Exception -> 0x028e }
            JU r7 = r5.f1606v     // Catch:{ Exception -> 0x028e }
            java.lang.String r7 = r7.mo455E()     // Catch:{ Exception -> 0x028e }
            r5.f1563ea = r7     // Catch:{ Exception -> 0x028e }
            android.support.v4.app.FragmentActivity r7 = r5.getActivity()     // Catch:{ Exception -> 0x028e }
            r0 = 2131755380(0x7f100174, float:1.9141638E38)
            java.lang.String r7 = r7.getString(r0)     // Catch:{ Exception -> 0x028e }
            r5.f1572ha = r7     // Catch:{ Exception -> 0x028e }
            android.support.v4.app.FragmentActivity r7 = r5.getActivity()     // Catch:{ Exception -> 0x028e }
            r0 = 2131755224(0x7f1000d8, float:1.9141321E38)
            java.lang.String r7 = r7.getString(r0)     // Catch:{ Exception -> 0x028e }
            r5.f1575ia = r7     // Catch:{ Exception -> 0x028e }
            android.support.v4.app.FragmentActivity r7 = r5.getActivity()     // Catch:{ Exception -> 0x028e }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ Exception -> 0x028e }
            r0 = 2131165263(0x7f07004f, float:1.7944738E38)
            float r7 = r7.getDimension(r0)     // Catch:{ Exception -> 0x028e }
            int r7 = (int) r7     // Catch:{ Exception -> 0x028e }
            r5.f1569ga = r7     // Catch:{ Exception -> 0x028e }
            android.support.v4.app.FragmentActivity r7 = r5.getActivity()     // Catch:{ Exception -> 0x028e }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ Exception -> 0x028e }
            r0 = 2130903059(0x7f030013, float:1.7412925E38)
            java.lang.String[] r7 = r7.getStringArray(r0)     // Catch:{ Exception -> 0x028e }
            r5.f1578ja = r7     // Catch:{ Exception -> 0x028e }
            android.support.v4.app.FragmentActivity r7 = r5.getActivity()     // Catch:{ Exception -> 0x028e }
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ Exception -> 0x028e }
            r0 = 2130903046(0x7f030006, float:1.7412899E38)
            android.content.res.TypedArray r7 = r7.obtainTypedArray(r0)     // Catch:{ Exception -> 0x028e }
            r5.f1581ka = r7     // Catch:{ Exception -> 0x028e }
            android.widget.ListView r7 = r5.f1526O     // Catch:{ Exception -> 0x028e }
            r0 = 3
            r7.setChoiceMode(r0)     // Catch:{ Exception -> 0x028e }
            android.widget.ListView r7 = r5.f1526O     // Catch:{ Exception -> 0x028e }
            dQ r0 = new dQ     // Catch:{ Exception -> 0x028e }
            r0.<init>(r5)     // Catch:{ Exception -> 0x028e }
            r7.setMultiChoiceModeListener(r0)     // Catch:{ Exception -> 0x028e }
            android.widget.ListView r7 = r5.f1526O     // Catch:{ Exception -> 0x028e }
            oQ r0 = new oQ     // Catch:{ Exception -> 0x028e }
            r0.<init>(r5)     // Catch:{ Exception -> 0x028e }
            r7.setOnItemClickListener(r0)     // Catch:{ Exception -> 0x028e }
            java.lang.String r7 = "trace_view_V="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0283 }
            r0.<init>()     // Catch:{ Exception -> 0x0283 }
            boolean r1 = r5.getUserVisibleHint()     // Catch:{ Exception -> 0x0283 }
            r0.append(r1)     // Catch:{ Exception -> 0x0283 }
            r0.append(r8)     // Catch:{ Exception -> 0x0283 }
            java.lang.String r1 = r5.f1556c     // Catch:{ Exception -> 0x0283 }
            r0.append(r1)     // Catch:{ Exception -> 0x0283 }
            r0.append(r8)     // Catch:{ Exception -> 0x0283 }
            boolean r1 = r5.f1591nb     // Catch:{ Exception -> 0x0283 }
            r0.append(r1)     // Catch:{ Exception -> 0x0283 }
            r0.append(r8)     // Catch:{ Exception -> 0x0283 }
            boolean r8 = r5.isResumed()     // Catch:{ Exception -> 0x0283 }
            r0.append(r8)     // Catch:{ Exception -> 0x0283 }
            java.lang.String r8 = r0.toString()     // Catch:{ Exception -> 0x0283 }
            android.util.Log.d(r7, r8)     // Catch:{ Exception -> 0x0283 }
            boolean r7 = r5.getUserVisibleHint()     // Catch:{ Exception -> 0x0283 }
            if (r7 == 0) goto L_0x028d
            r5.mo1619u()     // Catch:{ Exception -> 0x0283 }
            goto L_0x028d
        L_0x0283:
            r7 = move-exception
            java.lang.String r8 = "details_oncreate"
            java.lang.String r7 = r7.getMessage()     // Catch:{ Exception -> 0x028e }
            android.util.Log.d(r8, r7)     // Catch:{ Exception -> 0x028e }
        L_0x028d:
            return r6
        L_0x028e:
            r6 = move-exception
            java.lang.String r7 = r6.getMessage()
            java.lang.String r8 = "oncreateview_err="
            android.util.Log.d(r8, r7)
            r6.printStackTrace()
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0523YQ.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDetach() {
        C0523YQ.super.onDetach();
        this.f1587ma = null;
        this.f1591nb = false;
    }

    public void onLoaderReset(Loader<List<C0232LL>> loader) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131296268) {
            mo1532N();
            return true;
        }
        if (itemId == 2131296272) {
            mo1560c();
        } else if (itemId == 2131296271) {
            mo1573e();
            if (this.f1606v.mo524a("prefPrintSort", true)) {
                mo1581h(this.f1596q);
                this.f1524N.notifyDataSetChanged();
                this.f1530Q = 1;
            }
            mo1526H();
            return true;
        } else if (itemId == 2131296269) {
            mo1561c(1);
            return true;
        } else if (itemId == 2131296270) {
            mo1612s();
            return true;
        } else if (itemId == 16908332) {
            getActivity().finish();
            return true;
        } else if (itemId == 2131296293) {
            mo1565c(true);
            return true;
        }
        return C0523YQ.super.onOptionsItemSelected(menuItem);
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        FragmentActivity activity;
        int i2;
        if (i == 112) {
            if (iArr.length != 1 || iArr[0] != 0) {
                activity = getActivity();
                i2 = 2131755273;
            } else {
                return;
            }
        } else if (i != 113) {
            return;
        } else {
            if (iArr.length != 1 || iArr[0] != 0) {
                activity = getActivity();
                i2 = 2131755272;
            } else {
                return;
            }
        }
        mo1546a(activity.getString(i2));
    }

    public void onStart() {
        C0523YQ.super.onStart();
        this.f1498A = Boolean.valueOf(true);
        if (this.f1500B.booleanValue()) {
            this.f1498A.booleanValue();
        }
    }

    /* renamed from: p */
    public final void mo1609p() {
        if (this.f1606v.mo590k(this.f1556c) == 0 && this.f1556c.length() >= 1 && this.f1515Ia.getText().toString().equals(getActivity().getString(2131755103))) {
            String string = getActivity().getString(2131755419);
            StringBuilder sb = new StringBuilder();
            sb.append(getActivity().getString(2131755419));
            sb.append(this.f1556c);
            mo1550a(string, sb.toString(), getActivity());
        }
    }

    /* renamed from: q */
    public final void mo1610q() {
        if (this.f1606v.mo590k(this.f1503Ca.getText().toString()) == 0 && this.f1503Ca.getText().toString().length() >= 1 && this.f1515Ia.getText().toString().equals(getActivity().getString(2131755108))) {
            String string = getActivity().getString(2131755419);
            StringBuilder sb = new StringBuilder();
            sb.append(getActivity().getString(2131755419));
            sb.append(this.f1503Ca.getText().toString());
            mo1566c(string, sb.toString(), getActivity());
        }
        if (this.f1606v.mo590k(this.f1501Ba.getText().toString()) == 0 && this.f1501Ba.getText().toString().length() >= 1 && this.f1515Ia.getText().toString().equals(getActivity().getString(2131755108))) {
            String string2 = getActivity().getString(2131755419);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getActivity().getString(2131755419));
            sb2.append(this.f1501Ba.getText().toString());
            mo1550a(string2, sb2.toString(), getActivity());
        }
    }

    /* renamed from: r */
    public final boolean mo1611r() {
        boolean a = C0008AO.m5a(this.f1505Da);
        if (!C0008AO.m5a(this.f1511Ga)) {
            a = false;
        }
        if (this.f1606v.mo519a()) {
            mo1618t();
            return false;
        }
        this.f1515Ia.setError(null);
        return a;
    }

    /* renamed from: s */
    public void mo1612s() {
        try {
            Builder builder = new Builder(getActivity());
            View inflate = getActivity().getLayoutInflater().inflate(2131492918, null);
            builder.setView(inflate);
            this.f1615za = (TextView) inflate.findViewById(2131296451);
            this.f1615za.setVisibility(8);
            this.f1499Aa = (TextView) inflate.findViewById(2131296647);
            this.f1499Aa.setOnClickListener(new C0307OP(this));
            builder.setMessage(getActivity().getString(2131755116));
            builder.setPositiveButton(getActivity().getString(2131755137), new C0329PP(this));
            builder.setNegativeButton(getActivity().getString(2131755136), new C0351QP(this));
            AlertDialog create = builder.create();
            create.show();
            create.getWindow().setSoftInputMode(4);
        } catch (Exception e) {
            Log.d("closing_balance_error=", e.getMessage());
        }
    }

    public void setUserVisibleHint(boolean z) {
        C0523YQ.super.setUserVisibleHint(z);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1556c);
        String str = ":";
        sb.append(str);
        sb.append(getUserVisibleHint());
        sb.append(str);
        sb.append(z);
        sb.append(str);
        sb.append(this.f1591nb);
        sb.append(str);
        sb.append(isResumed());
        Log.d("trace_view_S=", sb.toString());
        if (z && this.f1556c != null && isResumed()) {
            mo1619u();
        }
    }

    public void sort_amount_click(View view) {
        int i;
        if (this.f1530Q == 0) {
            mo1580g(this.f1596q);
            this.f1524N.notifyDataSetChanged();
            i = 1;
        } else {
            mo1577f(this.f1596q);
            this.f1524N.notifyDataSetChanged();
            i = 0;
        }
        this.f1530Q = i;
    }

    public void sort_net_bal_click(View view) {
        int i;
        if (this.f1530Q == 0) {
            mo1584i(this.f1596q);
            this.f1524N.notifyDataSetChanged();
            i = 1;
        } else {
            mo1564c(this.f1596q);
            this.f1524N.notifyDataSetChanged();
            i = 0;
        }
        this.f1530Q = i;
    }

    public void sort_remarks_click(View view) {
        int i;
        if (this.f1530Q == 0) {
            mo1586j(this.f1596q);
            this.f1524N.notifyDataSetChanged();
            i = 1;
        } else {
            mo1571d(this.f1596q);
            this.f1524N.notifyDataSetChanged();
            i = 0;
        }
        this.f1530Q = i;
    }

    public void sort_tr_type_click(View view) {
        int i;
        if (this.f1530Q == 0) {
            mo1589k(this.f1596q);
            this.f1524N.notifyDataSetChanged();
            i = 1;
        } else {
            mo1574e(this.f1596q);
            this.f1524N.notifyDataSetChanged();
            i = 0;
        }
        this.f1530Q = i;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|(3:4|5|6)|7|8|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0024 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1618t() {
        /*
            r4 = this;
            java.lang.String r0 = ""
            JU r1 = r4.f1606v     // Catch:{ Exception -> 0x0031 }
            java.lang.String r2 = "black_list"
            r3 = 0
            boolean r1 = r1.mo524a(r2, r3)     // Catch:{ Exception -> 0x0031 }
            if (r1 == 0) goto L_0x0024
            JU r1 = r4.f1606v     // Catch:{ Exception -> 0x0031 }
            java.lang.String r2 = "black_date"
            r1.mo631x(r2, r0)     // Catch:{ Exception -> 0x0031 }
            JU r1 = r4.f1606v     // Catch:{ Exception -> 0x0031 }
            java.lang.String r2 = "black_date_done"
            r1.mo631x(r2, r0)     // Catch:{ Exception -> 0x0031 }
            JU r0 = r4.f1606v     // Catch:{ Exception -> 0x0024 }
            android.support.v4.app.FragmentActivity r1 = r4.getActivity()     // Catch:{ Exception -> 0x0024 }
            r0.mo551c(r1)     // Catch:{ Exception -> 0x0024 }
        L_0x0024:
            r4.mo1576f()     // Catch:{ Exception -> 0x0031 }
            JU r0 = r4.f1606v     // Catch:{ Exception -> 0x0031 }
            android.support.v4.app.FragmentActivity r1 = r4.getActivity()     // Catch:{ Exception -> 0x0031 }
            r0.mo582h(r1)     // Catch:{ Exception -> 0x0031 }
            goto L_0x003b
        L_0x0031:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "adv_search_error="
            android.util.Log.d(r1, r0)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0523YQ.mo1618t():void");
    }

    /* renamed from: u */
    public final void mo1619u() {
        int i = Calendar.getInstance().get(14);
        getActivity().getSupportLoaderManager().initLoader(Integer.parseInt(this.f1553b) * i * 1000000, null, this.f1551aa).forceLoad();
        getActivity().getSupportLoaderManager().initLoader(Integer.parseInt(this.f1553b) * i, null, this).forceLoad();
    }

    /* renamed from: v */
    public final void mo1620v() {
        int i = Calendar.getInstance().get(14);
        StringBuilder sb = new StringBuilder();
        sb.append("Start...");
        sb.append(Integer.parseInt(this.f1553b) * i * 1000000);
        String str = ":";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        boolean z = false;
        int i2 = 1;
        sb.append((C0195JU.f451k) & (this.f1590na > 0) ? this.f1590na : 1);
        Log.d("data_loader2", sb.toString());
        LoaderManager supportLoaderManager = getActivity().getSupportLoaderManager();
        int parseInt = Integer.parseInt(this.f1553b) * i * 1000000;
        boolean z2 = C0195JU.f451k;
        if (this.f1590na > 0) {
            z = true;
        }
        if (z2 && z) {
            i2 = this.f1590na;
        }
        supportLoaderManager.initLoader(parseInt + i2, null, this.f1551aa).forceLoad();
    }

    /* renamed from: w */
    public void mo1621w() {
        for (int size = this.f1528P.size() - 1; size >= 0; size--) {
            if (this.f1528P.valueAt(size)) {
                C0232LL item = this.f1524N.getItem(this.f1528P.keyAt(size));
                this.f1524N.remove(item);
                C0195JU ju = this.f1606v;
                StringBuilder sb = new StringBuilder();
                sb.append("delete from transactions where id=");
                sb.append(item.mo778i());
                ju.mo562d(sb.toString());
            }
        }
        FragmentStatePagerSupport_Main.f2451d = true;
        mo1524F();
    }

    /* renamed from: x */
    public final void mo1622x() {
        int i;
        Resources resources;
        if (this.f1523Ma.getTag() != null) {
            resources = getActivity().getResources();
            i = 2130903043;
        } else {
            resources = getActivity().getResources();
            i = 2130903056;
        }
        String[] stringArray = resources.getStringArray(i);
        Builder builder = new Builder(getActivity());
        builder.setItems(stringArray, new C0213KQ(this, stringArray));
        AlertDialog create = builder.create();
        ListView listView = create.getListView();
        listView.setDivider(new ColorDrawable(-7829368));
        listView.setDividerHeight(1);
        create.show();
    }

    /* renamed from: y */
    public void mo1623y() {
        int size = this.f1528P.size() - 1;
        if (this.f1528P.valueAt(size)) {
            C0232LL item = this.f1524N.getItem(this.f1528P.keyAt(size));
            try {
                this.f1571h = Integer.parseInt(item.mo778i());
                this.f1574i = item.mo777h();
                this.f1577j = item.mo775f();
                this.f1580k = item.mo779j();
                this.f1583l = item.mo776g() != null ? item.mo776g().toString() : "";
                this.f1586m = item.mo780k();
                this.f1589n = item.mo766a();
                if (!this.f1606v.mo528b(this.f1571h).equals("0")) {
                    this.f1580k = this.f1606v.mo548c(this.f1571h);
                    this.f1594p = this.f1556c;
                    this.f1592o = this.f1606v.mo565e(this.f1571h);
                    if (this.f1592o.equals(this.f1556c)) {
                        this.f1594p = this.f1606v.mo497a(this.f1571h);
                    }
                    mo1558b(false);
                    return;
                }
                mo1548a(false);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: z */
    public void mo1624z() {
        if (C0195JU.f451k) {
            this.f1545Xa = this.f1606v.mo605p();
            RadioButton[] radioButtonArr = new RadioButton[this.f1545Xa.size()];
            this.f1543Wa.setTag(null);
            this.f1543Wa.removeAllViews();
            for (int i = 0; i < this.f1545Xa.size(); i++) {
                radioButtonArr[i] = new RadioButton(getActivity());
                RadioButton radioButton = radioButtonArr[i];
                HashMap hashMap = (HashMap) this.f1545Xa.get(i);
                String str = Attribute.NAME;
                radioButton.setText((CharSequence) hashMap.get(str));
                radioButtonArr[i].setId(Integer.parseInt((String) ((HashMap) this.f1545Xa.get(i)).get(Attribute.f2026ID)) + 100);
                radioButtonArr[i].setOnClickListener(new C0839iQ(this));
                this.f1543Wa.addView(radioButtonArr[i]);
                String str2 = this.f1589n;
                if (str2 != null && str2.equals(((HashMap) this.f1545Xa.get(i)).get(str))) {
                    this.f1543Wa.check(radioButtonArr[i].getId());
                    this.f1543Wa.setTag(((HashMap) this.f1545Xa.get(i)).get(str));
                }
                String str3 = this.f1562e;
                if (str3 != null && str3.equals(((HashMap) this.f1545Xa.get(i)).get(str))) {
                    this.f1543Wa.check(radioButtonArr[i].getId());
                    this.f1543Wa.setTag(((HashMap) this.f1545Xa.get(i)).get(str));
                }
            }
        }
    }
}
