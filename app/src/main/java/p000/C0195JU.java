package p000;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.ContentProviderOperation;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.Looper;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.provider.ContactsContract.Data;
import android.provider.ContactsContract.RawContacts;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Audio;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.telephony.PhoneNumberUtils;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;
import android.text.format.Formatter;
import android.text.method.LinkMovementMethod;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import com.google.firebase.iid.FirebaseInstanceId;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.ElementList;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import com.itextpdf.tool.xml.css.CSS.Value;
import com.itextpdf.tool.xml.html.HTML.Attribute;
import com.itextpdf.tool.xml.html.HTML.Tag;
import com.itextpdf.xmp.options.PropertyOptions;
import com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: JU */
public class C0195JU {

    /* renamed from: a */
    public static String f441a;

    /* renamed from: b */
    public static String f442b;

    /* renamed from: c */
    public static String f443c;

    /* renamed from: d */
    public static String f444d;

    /* renamed from: e */
    public static String f445e;

    /* renamed from: f */
    public static String f446f;

    /* renamed from: g */
    public static String f447g;

    /* renamed from: h */
    public static boolean f448h = false;

    /* renamed from: i */
    public static String f449i;

    /* renamed from: j */
    public static String f450j;

    /* renamed from: k */
    public static boolean f451k = false;

    /* renamed from: l */
    public static List<C0082EH> f452l = new ArrayList();

    /* renamed from: m */
    public static List<C0082EH> f453m = new ArrayList();

    /* renamed from: n */
    public static ArrayList<C0082EH> f454n = new ArrayList<>();

    /* renamed from: o */
    public static ArrayList<C0260MM> f455o = new ArrayList<>();

    /* renamed from: p */
    public static List<C0208KL> f456p = new ArrayList();

    /* renamed from: q */
    public static String f457q = "L";

    /* renamed from: r */
    public static boolean f458r = false;

    /* renamed from: s */
    public static boolean f459s = false;

    /* renamed from: t */
    public static boolean f460t = false;

    /* renamed from: u */
    public static String f461u;

    /* renamed from: A */
    public String f462A;

    /* renamed from: B */
    public String f463B;

    /* renamed from: C */
    public String f464C;

    /* renamed from: D */
    public String f465D;

    /* renamed from: E */
    public int f466E;

    /* renamed from: F */
    public Boolean f467F;

    /* renamed from: G */
    public Boolean f468G;

    /* renamed from: H */
    public ArrayList f469H;

    /* renamed from: I */
    public ArrayList f470I;

    /* renamed from: J */
    public String f471J;

    /* renamed from: K */
    public ProgressDialog f472K;

    /* renamed from: L */
    public String f473L;

    /* renamed from: M */
    public int f474M;

    /* renamed from: N */
    public String f475N;

    /* renamed from: O */
    public boolean f476O;

    /* renamed from: v */
    public SQLiteDatabase f477v;

    /* renamed from: w */
    public Context f478w;

    /* renamed from: x */
    public int[] f479x = {2131230923, 1, 2131230855};

    /* renamed from: y */
    public String f480y;

    /* renamed from: z */
    public String f481z;

    /* renamed from: JU$a */
    class C0196a extends PdfPageEventHelper {

        /* renamed from: a */
        public Font f482a = new Font(FontFamily.UNDEFINED, 10.0f, 2);

        public C0196a() {
        }

        public void onCloseDocument(PdfWriter pdfWriter, Document document) {
            PdfContentByte directContent = pdfWriter.getDirectContent();
            StringBuilder sb = new StringBuilder();
            sb.append(pdfWriter.getCurrentPageNumber());
            sb.append("/");
            sb.append(pdfWriter.getPageNumber());
            ColumnText.showTextAligned(directContent, 1, new Phrase(sb.toString(), this.f482a), ((document.right() - document.left()) / 2.0f) + document.leftMargin(), document.bottom() - 10.0f, 0.0f);
        }

        public void onEndPage(PdfWriter pdfWriter, Document document) {
            PdfContentByte directContent = pdfWriter.getDirectContent();
            Phrase phrase = new Phrase(C0195JU.this.mo608q(), this.f482a);
            Font font = FontFactory.getFont("assets/fonts/NotoNaskhArabic-Regular.ttf", "Identity-H", true);
            String str = "<i> بواسطة <a href='https://play.google.com/store/apps/details?id=com.valdio.valdioveliu.recyclerview'>دفترالحسابات</a></i>";
            new Phrase(str, this.f482a);
            StringBuilder sb = new StringBuilder();
            sb.append(pdfWriter.getCurrentPageNumber());
            String str2 = "";
            sb.append(str2);
            Phrase phrase2 = new Phrase(sb.toString(), this.f482a);
            try {
                ColumnText columnText = new ColumnText(pdfWriter.getDirectContent());
                columnText.setSimpleColumn(document.left() + document.leftMargin() + 100.0f, document.bottom() + 5.0f, document.rightMargin(), 0.0f);
                columnText.setRunDirection(2);
                ElementList parseToElementList = XMLWorkerHelper.parseToElementList(str, null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(parseToElementList.size());
                sb2.append(str2);
                Log.d("List=", sb2.toString());
                Iterator it = parseToElementList.iterator();
                while (it.hasNext()) {
                    Element element = (Element) it.next();
                    List chunks = element.getChunks();
                    for (int i = 0; i < chunks.size(); i++) {
                        ((Chunk) chunks.get(i)).setFont(font);
                    }
                    columnText.addElement(element);
                }
                columnText.go();
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("error");
                sb3.append(e.getMessage());
                sb3.append(":");
                sb3.append(str);
                Log.d("Print_name=", sb3.toString());
            }
            ColumnText.showTextAligned(directContent, 1, phrase2, ((document.right() - document.left()) / 2.0f) + document.leftMargin(), document.bottom() - 10.0f, 0.0f);
            if (C0195JU.this.f468G.booleanValue()) {
                ColumnText.showTextAligned(directContent, 0, phrase, (((document.right() - document.left()) - 60.0f) / 1.0f) + document.leftMargin(), document.bottom() - 10.0f, 0.0f);
            }
        }

        public void onStartPage(PdfWriter pdfWriter, Document document) {
            pdfWriter.getDirectContent();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        String str = "/Market_Customers/";
        sb.append(str);
        f441a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f441a);
        sb2.append("/Pictures/");
        f442b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        sb3.append(str);
        f443c = sb3.toString();
        String str2 = "0";
        f444d = str2;
        String str3 = "";
        f445e = str3;
        f446f = str3;
        f447g = str3;
        f449i = str2;
        f450j = str3;
    }

    public C0195JU(SQLiteDatabase sQLiteDatabase, Context context) {
        String str = "";
        this.f480y = str;
        this.f481z = str;
        this.f462A = str;
        this.f463B = str;
        this.f464C = str;
        this.f465D = str;
        this.f466E = 1;
        Boolean valueOf = Boolean.valueOf(false);
        this.f467F = valueOf;
        this.f468G = valueOf;
        this.f471J = "ExelLog";
        this.f474M = 0;
        this.f475N = str;
        this.f477v = C0325PL.m994a(context).getWritableDatabase();
        this.f478w = context;
    }

    /* renamed from: F */
    public static File m409F(String str) {
        return new File(f442b, str);
    }

    /* renamed from: N */
    public static boolean m410N() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: O */
    public static boolean m411O() {
        return "mounted_ro".equals(Environment.getExternalStorageState());
    }

    /* renamed from: W */
    public static FileOutputStream m412W(String str) {
        StringBuilder sb;
        String message;
        String str2 = "Error saving image file: ";
        String str3 = "TAG";
        File file = new File(f441a);
        file.mkdirs();
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(file.toString());
            sb2.append(File.separator);
            sb2.append(str);
            return new FileOutputStream(sb2.toString());
        } catch (FileNotFoundException e) {
            sb = new StringBuilder();
            sb.append(str2);
            message = e.getMessage();
            sb.append(message);
            Log.w(str3, sb.toString());
            return null;
        } catch (Exception e2) {
            sb = new StringBuilder();
            sb.append(str2);
            message = e2.getMessage();
            sb.append(message);
            Log.w(str3, sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static int m413a(Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    /* renamed from: a */
    public static Bitmap m414a(String str, int i, int i2) {
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inSampleSize = m413a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(str, options);
    }

    /* renamed from: a */
    public static String m415a(long j) {
        if (j <= 0) {
            return "0";
        }
        String[] strArr = {"B", "kB", "MB", "GB", "TB"};
        double d = (double) j;
        int log10 = (int) (Math.log10(d) / Math.log10(1024.0d));
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.#");
        double pow = Math.pow(1024.0d, (double) log10);
        Double.isNaN(d);
        sb.append(decimalFormat.format(d / pow));
        sb.append("");
        sb.append(strArr[log10]);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m416a(Context context, Uri uri) {
        String str = null;
        if (uri.getScheme().equals("content")) {
            Cursor query = context.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndex("_display_name"));
                    }
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
        }
        if (str != null) {
            return str;
        }
        String path = uri.getPath();
        int lastIndexOf = path.lastIndexOf(47);
        return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
    }

    /* renamed from: a */
    public static String m417a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    /* renamed from: a */
    public static boolean m421a(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    /* renamed from: b */
    public static String m422b(Context context, String str, int i) {
        String str2 = "";
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        try {
            Object invoke = Class.forName(telephonyManager.getClass().getName()).getMethod(str, new Class[]{Integer.TYPE}).invoke(telephonyManager, new Object[]{Integer.valueOf(i)});
            return invoke != null ? invoke.toString() : str2;
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: b */
    public static boolean m423b(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    /* renamed from: c */
    public static Bitmap m424c(String str) {
        byte[] decode = Base64.decode(str, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    /* renamed from: c */
    public static File m425c(Context context, Uri uri) {
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        int available = openInputStream.available();
        File F = m409F(m416a(context, uri));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(openInputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(F, false));
        byte[] bArr = new byte[available];
        bufferedInputStream.read(bArr);
        do {
            bufferedOutputStream.write(bArr);
        } while (bufferedInputStream.read(bArr) != -1);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        bufferedInputStream.close();
        return F;
    }

    /* renamed from: c */
    public static boolean m426c(Uri uri) {
        return uri.getAuthority().equalsIgnoreCase("com.google.android.apps.docs.storage");
    }

    /* renamed from: d */
    public static boolean m427d(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static boolean m428d(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* renamed from: h */
    public static File m429h() {
        String str = "CameraDemo";
        try {
            f461u = null;
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), str);
            if (file.exists() || file.mkdirs()) {
                String format = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
                StringBuilder sb = new StringBuilder();
                sb.append(file.getPath());
                sb.append(File.separator);
                sb.append("IMG_");
                sb.append(format);
                sb.append(".jpg");
                File file2 = new File(sb.toString());
                f461u = file2.getAbsolutePath();
                return file2;
            }
            Log.d(str, "failed to create directory");
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: A */
    public Cursor mo444A() {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery(" select distinct _id,g_name,curr_name from ( SELECT distinct c.id as _id, c.name g_name,ifnull( d.name, (select name from currency where id=0)) curr_name ,max(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d, ifnull(max(a.id),0) max_id  FROM groups c left join customers AS b on c.id=b.g_id     left join transactions a on a.cus_id=b.id  left join currency d on a.curr_id=d.id  group by c.id,c.name,d.id,d.name  ORDER BY d DESC,max_id desc,c.id,d.id )  ", null);
        mo532b();
        return rawQuery;
    }

    /* renamed from: A */
    public Cursor mo445A(String str) {
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        return sQLiteDatabase.rawQuery("SELECT a.ID as _id, a.date_ as date_,abs(a.out * a.[in]) as amount ,a.remarks,(a.[in]+1) as _in,0 as bal, strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d,substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1, d.name curr_name ,ifnull((select name from customers where id=a.t_cus_id),'') t_cus_name,a.t_cus_id,ifnull((select gsm from customers where id=a.t_cus_id),'') t_gsm  FROM transactions AS a, customers AS b,currency d  WHERE a.cus_id = b.id  and (a.cus_id=? or b.name=?) and a.curr_id=d.id  ORDER BY (d2)  desc,1 desc LIMIT 1 OFFSET 0 ", new String[]{sb.toString(), sb2.toString()});
    }

    /* renamed from: A */
    public void mo446A(String str, String str2) {
        Uri uri;
        try {
            if (str.length() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(str.trim().length());
                sb.append(":");
                sb.append(f447g);
                Log.d("to_length=", sb.toString());
                String str3 = "";
                if (str.trim().length() <= 9) {
                    if (f447g == null || f447g.equals(str3)) {
                        try {
                            f447g = mo558d(this.f478w);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (f447g != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(f447g);
                        sb2.append(str.trim());
                        str = sb2.toString();
                    }
                }
                Intent intent = new Intent("android.intent.action.SEND");
                String str4 = "com.whatsapp.ContactPicker";
                intent.setComponent(mo524a("prefOthers_whats_bus", false) ? new ComponentName("com.whatsapp.w4b", str4) : new ComponentName("com.whatsapp", str4));
                intent.setType("application/pdf");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(f441a);
                sb3.append("/");
                sb3.append(str2);
                File file = new File(sb3.toString());
                if (VERSION.SDK_INT >= 24) {
                    Context context = this.f478w;
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.f478w.getApplicationContext().getPackageName());
                    sb4.append(".provider");
                    uri = FileProvider.getUriForFile(context, sb4.toString(), file);
                    intent.addFlags(PropertyOptions.SEPARATE_NODE);
                    intent.addFlags(1);
                } else {
                    uri = Uri.fromFile(file);
                }
                intent.putExtra("android.intent.extra.STREAM", uri);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(PhoneNumberUtils.stripSeparators(str.replace("+", str3)));
                sb5.append("@s.whatsapp.net");
                intent.putExtra("jid", sb5.toString());
                this.f478w.startActivity(intent);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: B */
    public Cursor mo447B() {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT b.name as _id ,ifnull( abs(SUM(a.out * a.[in])),0) AS amount,  (case when SUM(a.out * a.[in])>= 0 then  1+1 else -1+1 end ) as _in ,b.id as id,b.gsm as phone ,max(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d,( (select julianday(strftime('%Y-%m-%d','now')) -julianday(max(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) ))) from transactions as c where c.cus_id=b.id) ) as days_late,ifnull(max(a.id),0) max_id,(case when length(count(*))=1 then '  '||count(*)||'  ' else ' '||count(*)||' ' end) cnt,b.g_id, c.name g_name  FROM groups c inner join customers AS b on c.id=b.g_id  left join transactions AS a   on a.cus_id = b.id GROUP BY b.name, b.id   ORDER BY d DESC,max_id desc  ", null);
        mo532b();
        return rawQuery;
    }

    /* renamed from: B */
    public String mo448B(String str) {
        return NumberFormat.getInstance(Locale.ENGLISH).format(Double.parseDouble(str));
    }

    /* renamed from: B */
    public void mo449B(String str, String str2) {
        this.f477v.beginTransaction();
        try {
            SQLiteDatabase sQLiteDatabase = this.f477v;
            StringBuilder sb = new StringBuilder();
            sb.append("insert into transactions([cus_id],t_cus_id, [in], out ,  remarks,date_,curr_id) SELECT [cus_id],t_cus_id, [in], sum(out) AS Amount, 'رصيد إفتتاحي' AS remarks, strftime('%d-%m-%Y',date(strftime('%Y-%m-%d','");
            sb.append(str2);
            sb.append("'))) as date_,curr_id  FROM transactions  WHERE date(strftime('%Y-%m-%d',substr(date_,7,4)||'-' ||substr(date_,4,2)||'-'||substr(date_,1,2) ))<='");
            sb.append(str);
            sb.append("'  GROUP BY [cus_id],t_cus_id, [in],curr_id");
            sQLiteDatabase.execSQL(sb.toString());
            SQLiteDatabase sQLiteDatabase2 = this.f477v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Delete FROM transactions  WHERE  date(strftime('%Y-%m-%d',substr(date_,7,4)||'-' ||substr(date_,4,2)||'-'||substr(date_,1,2) ))<='");
            sb2.append(str);
            sb2.append("'");
            sQLiteDatabase2.execSQL(sb2.toString());
            this.f477v.setTransactionSuccessful();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f477v.endTransaction();
            throw th;
        }
        this.f477v.endTransaction();
    }

    /* renamed from: C */
    public Cursor mo450C() {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("select a.id as id,a.name as _id,a.gsm phone,a.balance amount,(case when a.balance>=0 then 2 else 0 end) as _in,a.curr as curr_name,a.g_name,0 cnt ,a.* from cus_curr a ", null);
        mo532b();
        return rawQuery;
    }

    /* renamed from: C */
    public Cursor mo451C(String str) {
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        return sQLiteDatabase.rawQuery("select  a.remarks,count(*) cnt from transactions a where a.cus_id=(select b.id from customers b where b.name=?)group by a.remarks order by 2 desc  ", new String[]{sb.toString()});
    }

    /* renamed from: D */
    public int mo452D(String str) {
        int i = 0;
        try {
            Cursor rawQuery = this.f477v.rawQuery(str, null);
            i = rawQuery.getCount();
            rawQuery.close();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    /* renamed from: D */
    public Cursor mo453D() {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT b.name as _id,b.id,b.gsm from customers AS b order by b.name   ", null);
        mo532b();
        return rawQuery;
    }

    /* renamed from: E */
    public Intent mo454E(String str) {
        String str2 = "android.intent.extra.TEXT";
        String str3 = "text/plain";
        String str4 = "android.intent.action.SEND";
        Intent intent = m427d(this.f478w.getApplicationContext(), "org.telegram.messenger") ? new Intent(str4) : new Intent(str4);
        intent.setType(str3);
        intent.putExtra(str2, str);
        return intent;
    }

    /* renamed from: E */
    public String mo455E() {
        return mo609q("pref_debit", this.f478w.getString(2131755162));
    }

    /* renamed from: F */
    public String mo456F() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f478w.getString(2131755251));
        sb.append(" - ");
        sb.append(mo609q("pref_debit", this.f478w.getString(2131755162)));
        return sb.toString();
    }

    /* renamed from: G */
    public ArrayList<String> mo457G() {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f477v.rawQuery("SELECT a.name as _id  FROM groups a  ", null);
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            arrayList.add(rawQuery.getString(rawQuery.getColumnIndex("_id")));
            rawQuery.moveToNext();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(arrayList.size());
        sb.append("");
        Log.d("messageArrayList_cnt=", sb.toString());
        return arrayList;
    }

    /* renamed from: G */
    public void mo458G(String str) {
        Uri uri;
        StringBuilder sb = new StringBuilder();
        sb.append(f441a);
        sb.append("/");
        sb.append(str);
        File file = new File(sb.toString());
        if (file.exists()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(268435456);
            if (VERSION.SDK_INT >= 24) {
                Context context = this.f478w;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f478w.getApplicationContext().getPackageName());
                sb2.append(".provider");
                uri = FileProvider.getUriForFile(context, sb2.toString(), file);
                intent.addFlags(PropertyOptions.SEPARATE_NODE);
                intent.addFlags(1);
            } else {
                uri = Uri.fromFile(file);
            }
            intent.setDataAndType(uri, "application/xls");
            this.f478w.startActivity(intent);
        }
    }

    /* renamed from: H */
    public Cursor mo459H() {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT distinct c.id as _id, c.name,(select count(*) from customers a where a.g_id=c.id) cnt   FROM groups c      ORDER BY c.id  ", null);
        mo532b();
        return rawQuery;
    }

    /* renamed from: H */
    public void mo460H(String str) {
        Uri uri;
        File file = new File(str);
        if (file.exists()) {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (VERSION.SDK_INT >= 24) {
                Context context = this.f478w;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f478w.getApplicationContext().getPackageName());
                sb.append(".provider");
                uri = FileProvider.getUriForFile(context, sb.toString(), file);
                intent.addFlags(PropertyOptions.SEPARATE_NODE);
                intent.addFlags(1);
            } else {
                uri = Uri.fromFile(file);
                intent.setFlags(67108864);
            }
            intent.setDataAndType(uri, "image/*");
            try {
                this.f478w.startActivity(intent);
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(e.getMessage());
                Log.e("error", sb2.toString());
            }
        }
    }

    /* renamed from: I */
    public int mo461I() {
        Cursor rawQuery = this.f477v.rawQuery("select count(*) as _id  from valid  ", null);
        rawQuery.moveToFirst();
        int i = 0;
        while (!rawQuery.isAfterLast()) {
            i = rawQuery.getInt(rawQuery.getColumnIndex("_id"));
            rawQuery.moveToNext();
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: I */
    public void mo462I(String str) {
        Uri uri;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(f441a);
            sb.append("/");
            sb.append(str);
            File file = new File(sb.toString());
            if (file.exists()) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setFlags(268435456);
                if (VERSION.SDK_INT >= 24) {
                    Context context = this.f478w;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f478w.getApplicationContext().getPackageName());
                    sb2.append(".provider");
                    uri = FileProvider.getUriForFile(context, sb2.toString(), file);
                    intent.addFlags(PropertyOptions.SEPARATE_NODE);
                    intent.addFlags(1);
                } else {
                    uri = Uri.fromFile(file);
                }
                intent.setDataAndType(uri, "application/pdf");
                this.f478w.startActivity(intent);
            }
        } catch (Exception e) {
            Context context2 = this.f478w;
            Toast.makeText(context2, context2.getString(2131755259), 0).show();
            Context context3 = this.f478w;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(e.getMessage());
            sb3.append("");
            Toast.makeText(context3, sb3.toString(), 1).show();
        }
    }

    /* renamed from: J */
    public String mo463J() {
        return Formatter.formatIpAddress(((WifiManager) this.f478w.getSystemService("wifi")).getConnectionInfo().getIpAddress());
    }

    /* renamed from: J */
    public String mo464J(String str) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f478w.getAssets().open(str), Charset.forName("windows-1256")));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
            } else {
                bufferedReader.close();
                return sb.toString();
            }
        }
    }

    /* renamed from: K */
    public String mo465K(String str) {
        return str.replaceAll("/", "-");
    }

    /* renamed from: K */
    public void mo466K() {
        f457q = "L";
    }

    /* renamed from: L */
    public Cursor mo467L() {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("select * from transactions where curr_id<>0 limit 1 ", null);
        mo532b();
        return rawQuery;
    }

    /* renamed from: L */
    public Cursor mo468L(String str) {
        mo477R();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT a.b_name as _id ,ifnull( abs(sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end)),0) AS amount,  (case when sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end)>= 0 then  1+1 else -1+1 end ) as _in ,a.b_id as id,a.gsm as phone ,max(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d,( (select julianday(strftime('%Y-%m-%d','now')) -julianday(max(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) ))) from transactions as c where (c.cus_id=a.b_id or c.t_cus_id=a.b_id)) ) as days_late ,a.c_id g_id,a.c_name g_name  FROM cus_tr_curr_view a where a.c_id=? GROUP BY a.b_name, a.b_id having ifnull( abs(sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end)),0)<>0  ORDER BY amount DESC,_in desc  ", new String[]{sb.toString()});
        mo532b();
        return rawQuery;
    }

    /* renamed from: M */
    public Cursor mo469M(String str) {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT a.id as id, ifnull((sum(case when (c.t_cus_id=b.id) then -1*c.out else  (c.[in]*c.out) end))*1  ,0) as net_balance                 ,sum(case  when c.[in] = 1 and (c.t_cus_id<>b.id or c.t_cus_id is null) then c.out else 0 end)*1.0 as cr_amount ,                sum(case when not(c.[in] = 1 and (c.t_cus_id<>b.id or c.t_cus_id is null)) then c.out else 0 end )*1.0 as db_amount ,a.name as _id ,ifnull( d.name, (select name from currency where id=0))  curr_name                 from groups a inner join customers b on (a.id=b.g_id)                 inner join transactions c on (c.cus_id = b.id or c.t_cus_id=b.id)  inner join currency d on c.curr_id=d.id   where d.name=? group by a.name,a.id,d.id,d.name  order by 2 ", new String[]{str});
        mo532b();
        return rawQuery;
    }

    /* renamed from: M */
    public String mo470M() {
        Calendar instance = Calendar.getInstance();
        int i = instance.get(11);
        int i2 = instance.get(12);
        StringBuilder sb = new StringBuilder();
        Object[] objArr = {Integer.valueOf(i)};
        String str = "%02d";
        sb.append(String.format(str, objArr));
        sb.append(":");
        sb.append(String.format(str, new Object[]{Integer.valueOf(i2)}));
        String sb2 = sb.toString();
        return sb2 == null ? "" : sb2;
    }

    /* renamed from: N */
    public Cursor mo471N(String str) {
        mo477R();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT b.name id, substr(a.date_,7,4)||'-' ||substr(a.date_,4,2) _id, ifnull((sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end))*1  ,0) AS amount,     (case when sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end)>= 0 then  1+1 else -1+1 end ) as _in,0 days_late,0 phone   FROM customers b, transactions AS a    where (a.cus_id = b.id or a.t_cus_id=b.id) and b.name=?   GROUP BY substr(a.date_,7,4)||'-' ||substr(a.date_,4,2),b.name  order by 2  ", new String[]{sb.toString()});
        mo532b();
        return rawQuery;
    }

    /* renamed from: O */
    public Cursor mo472O(String str) {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT 0 id, substr(a.date_,7,4)||'-' ||substr(a.date_,4,2) _id, ifnull( abs(sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end)),0) AS amount,     (case when sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end)>= 0 then  1+1 else -1+1 end ) as _in,0 days_late,0 phone   FROM customers b, transactions AS a    where (a.cus_id = b.id or a.t_cus_id = b.id ) and b.g_id=?   GROUP BY substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)  order by 2  ", new String[]{str});
        mo532b();
        return rawQuery;
    }

    /* renamed from: P */
    public Cursor mo473P(String str) {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT 0 as id,  sum(case when a.[in] = 1 and (a.t_cus_id<>a.b_id or a.t_cus_id is null) then -1*a.out else a.out*1 end)*-1.0 as net_balance , a.b_name as _id,a.gsm as gsm, sum(case  when a.[in] = 1 and (a.t_cus_id<>a.b_id or a.t_cus_id is null) then a.out else 0 end)*1.0 as cr_amount , sum(case when not(a.[in] = 1 and (a.t_cus_id<>a.b_id or a.t_cus_id is null))  then a.out else 0 end )*1.0 as db_amount  FROM cus_tr_curr_view a where a.g_id=? group by a.b_name,a.b_id,a.gsm order by a.b_name  ", new String[]{str});
        mo532b();
        return rawQuery;
    }

    /* renamed from: P */
    public boolean mo474P() {
        String str = "dd-MM-yyyy";
        String format = new SimpleDateFormat(str, Locale.ENGLISH).format(Calendar.getInstance().getTime());
        StringBuilder sb = new StringBuilder();
        String str2 = "0";
        String str3 = "db_data_changed";
        sb.append(mo609q(str3, str2));
        sb.append(":");
        String str4 = "";
        String str5 = "auto_drive_date_save";
        sb.append(mo609q(str5, str4));
        sb.append("#");
        sb.append(format);
        Log.d("job_ser_on", sb.toString());
        if (!mo609q(str3, str2).equals("1") || mo609q(str5, str4).equals(format)) {
            f460t = false;
            return false;
        }
        f460t = true;
        return true;
    }

    /* renamed from: Q */
    public Cursor mo475Q(String str) {
        mo477R();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT         b.name AS _id, abs((a.out * a.[in]))  AS amount , (case when (a.out * a.[in])>= 0 then  1+1 else -1+1 end ) as _in,a.remarks,a.date_ ,strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d                 FROM            transactions AS a, customers AS b                  WHERE        a.cus_id = b.id   and a.date_ =?   order by date(d) desc  ", new String[]{sb.toString()});
        mo532b();
        return rawQuery;
    }

    /* renamed from: Q */
    public boolean mo476Q() {
        Calendar instance = Calendar.getInstance();
        String str = "0";
        int parseInt = Integer.parseInt(mo609q("prefBackup_time_h", str));
        int parseInt2 = Integer.parseInt(mo609q("prefBackup_time_m", str));
        instance.set(11, parseInt);
        instance.set(12, parseInt2);
        instance.set(13, 0);
        String format = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(Calendar.getInstance().getTime());
        StringBuilder sb = new StringBuilder();
        String str2 = "db_data_changed";
        sb.append(mo609q(str2, str));
        String str3 = ":";
        sb.append(str3);
        String str4 = "";
        String str5 = "auto_drive_date_save";
        sb.append(mo609q(str5, str4));
        sb.append(str3);
        sb.append(mo609q("bk_drive_flag", str));
        Log.d("drive=_old_job", sb.toString());
        return instance.getTimeInMillis() < System.currentTimeMillis() && mo609q(str2, str).equals("1") && !mo609q(str5, str4).equals(format);
    }

    /* renamed from: R */
    public final void mo477R() {
    }

    /* renamed from: R */
    public void mo478R(String str) {
        Uri uri;
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("application/vnd.ms-excel");
            StringBuilder sb = new StringBuilder();
            sb.append(f441a);
            sb.append("/");
            sb.append(str);
            File file = new File(sb.toString());
            if (VERSION.SDK_INT >= 24) {
                Context context = this.f478w;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f478w.getApplicationContext().getPackageName());
                sb2.append(".provider");
                uri = FileProvider.getUriForFile(context, sb2.toString(), file);
                intent.addFlags(PropertyOptions.SEPARATE_NODE);
                intent.addFlags(1);
            } else {
                uri = Uri.fromFile(file);
            }
            intent.putExtra("android.intent.extra.STREAM", uri);
            this.f478w.startActivity(Intent.createChooser(intent, "Share Excel!"));
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Error saving csv file: ");
            sb3.append(e.getMessage());
            Log.w("TAG", sb3.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9 A[Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b4 A[Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017e A[Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x018b A[Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }] */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public String mo479S() {
        /*
            r11 = this;
            java.lang.String r0 = "getImei"
            java.lang.String r1 = "getDeviceId"
            java.lang.String r2 = ""
            java.lang.String r3 = "0"
            android.content.Context r4 = r11.f478w
            java.lang.String r5 = "phone"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            r6 = 26
            if (r5 < r6) goto L_0x001d
            java.lang.String r5 = r4.getImei()     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            goto L_0x0021
        L_0x001d:
            java.lang.String r5 = r11.mo576g()     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
        L_0x0021:
            boolean r7 = r5.equals(r2)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r7 != 0) goto L_0x0029
            if (r5 != 0) goto L_0x002d
        L_0x0029:
            java.lang.String r5 = r4.getDeviceId()     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
        L_0x002d:
            r7 = 14
            r8 = 0
            java.lang.String r5 = r5.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            f445e = r5     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = p000.C0753eN.m2610a(r5)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            f446f = r5     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            int r5 = r11.mo461I()     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r5 != 0) goto L_0x0045
            return r2
        L_0x0045:
            java.lang.String r5 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = r11.mo587j(r5)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            boolean r5 = r5.equals(r3)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r5 == 0) goto L_0x01b2
            java.lang.String r5 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            int r5 = r11.mo579h(r5)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r5 <= 0) goto L_0x005a
            return r2
        L_0x005a:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            r9 = 1
            if (r5 < r6) goto L_0x00d7
            java.lang.String r5 = r4.getDeviceId(r8)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = r5.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = r11.mo587j(r5)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            boolean r5 = r5.equals(r3)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r5 != 0) goto L_0x007c
            java.lang.String r5 = r4.getDeviceId(r8)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = r5.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
        L_0x0079:
            f445e = r5     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            goto L_0x0097
        L_0x007c:
            java.lang.String r5 = r4.getDeviceId(r9)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = r5.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = r11.mo587j(r5)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            boolean r5 = r5.equals(r3)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r5 != 0) goto L_0x0097
            java.lang.String r5 = r4.getDeviceId(r9)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = r5.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            goto L_0x0079
        L_0x0097:
            java.lang.String r5 = r4.getImei(r8)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = r5.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = r11.mo587j(r5)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            boolean r5 = r5.equals(r3)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r5 != 0) goto L_0x00b4
            java.lang.String r5 = r4.getImei(r8)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = r5.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
        L_0x00b1:
            f445e = r5     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            goto L_0x00cf
        L_0x00b4:
            java.lang.String r5 = r4.getImei(r9)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = r5.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = r11.mo587j(r5)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            boolean r5 = r5.equals(r3)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r5 != 0) goto L_0x00cf
            java.lang.String r5 = r4.getImei(r9)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = r5.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            goto L_0x00b1
        L_0x00cf:
            java.lang.String r5 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r5 = p000.C0753eN.m2610a(r5)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            f446f = r5     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
        L_0x00d7:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            r10 = 23
            if (r5 < r10) goto L_0x012a
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r5 >= r6) goto L_0x012a
            java.lang.String r0 = r4.getDeviceId(r8)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = r0.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = r11.mo587j(r0)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            boolean r0 = r0.equals(r3)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r0 != 0) goto L_0x0107
            java.lang.String r0 = r4.getDeviceId(r8)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = r0.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            f445e = r0     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = p000.C0753eN.m2610a(r0)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
        L_0x0103:
            f446f = r0     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            goto L_0x01b2
        L_0x0107:
            java.lang.String r0 = r4.getDeviceId(r9)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = r0.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = r11.mo587j(r0)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            boolean r0 = r0.equals(r3)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r0 != 0) goto L_0x01b2
            java.lang.String r0 = r4.getDeviceId(r9)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = r0.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            f445e = r0     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = p000.C0753eN.m2610a(r0)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            goto L_0x0103
        L_0x012a:
            android.content.Context r4 = r11.f478w     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r4 = m422b(r4, r1, r8)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r4 = r4.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r4 = r11.mo587j(r4)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            boolean r4 = r4.equals(r3)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r4 != 0) goto L_0x014b
            android.content.Context r4 = r11.f478w     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r1 = m422b(r4, r1, r8)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r1 = r1.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
        L_0x0148:
            f445e = r1     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            goto L_0x016a
        L_0x014b:
            android.content.Context r4 = r11.f478w     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r4 = m422b(r4, r1, r9)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r4 = r4.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r4 = r11.mo587j(r4)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            boolean r4 = r4.equals(r3)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r4 != 0) goto L_0x016a
            android.content.Context r4 = r11.f478w     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r1 = m422b(r4, r1, r9)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r1 = r1.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            goto L_0x0148
        L_0x016a:
            android.content.Context r1 = r11.f478w     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r1 = m422b(r1, r0, r8)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r1 = r1.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r1 = r11.mo587j(r1)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            boolean r1 = r1.equals(r3)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r1 != 0) goto L_0x018b
            android.content.Context r1 = r11.f478w     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = m422b(r1, r0, r8)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = r0.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
        L_0x0188:
            f445e = r0     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            goto L_0x01aa
        L_0x018b:
            android.content.Context r1 = r11.f478w     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r1 = m422b(r1, r0, r9)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r1 = r1.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r1 = r11.mo587j(r1)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            boolean r1 = r1.equals(r3)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r1 != 0) goto L_0x01aa
            android.content.Context r1 = r11.f478w     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = m422b(r1, r0, r9)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = r0.substring(r8, r7)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            goto L_0x0188
        L_0x01aa:
            java.lang.String r0 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = p000.C0753eN.m2610a(r0)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            goto L_0x0103
        L_0x01b2:
            java.lang.String r0 = "imei_service="
            java.lang.String r1 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r1 != 0) goto L_0x01ba
            r1 = r2
            goto L_0x01bc
        L_0x01ba:
            java.lang.String r1 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
        L_0x01bc:
            android.util.Log.d(r0, r1)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r0 == 0) goto L_0x01cb
            java.lang.String r0 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            boolean r0 = r0.equals(r2)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r0 == 0) goto L_0x01d7
        L_0x01cb:
            java.lang.String r0 = android.os.Build.SERIAL     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            f445e = r0     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = p000.C0753eN.m2610a(r0)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            f446f = r0     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
        L_0x01d7:
            java.lang.String r0 = "imei_service_serial="
            java.lang.String r1 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r1 != 0) goto L_0x01df
            r1 = r2
            goto L_0x01e1
        L_0x01df:
            java.lang.String r1 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
        L_0x01e1:
            android.util.Log.d(r0, r1)     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            java.lang.String r0 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
            if (r0 != 0) goto L_0x01e9
            goto L_0x01eb
        L_0x01e9:
            java.lang.String r2 = f445e     // Catch:{ SecurityException -> 0x01f8, Exception -> 0x01ec }
        L_0x01eb:
            return r2
        L_0x01ec:
            java.lang.String r0 = f445e
            if (r0 != 0) goto L_0x01f2
            r0 = r2
        L_0x01f2:
            java.lang.String r1 = "imei_service_catch="
        L_0x01f4:
            android.util.Log.d(r1, r0)
            return r2
        L_0x01f8:
            java.lang.String r0 = f445e
            if (r0 != 0) goto L_0x01fe
            r0 = r2
        L_0x01fe:
            java.lang.String r1 = "imei_security_catch="
            goto L_0x01f4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo479S():java.lang.String");
    }

    /* renamed from: S */
    public void mo480S(String str) {
        Uri uri;
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("application/x-sqlite3");
        StringBuilder sb = new StringBuilder();
        sb.append(f441a);
        sb.append("/");
        sb.append(str);
        File file = new File(sb.toString());
        if (VERSION.SDK_INT >= 24) {
            Context context = this.f478w;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f478w.getApplicationContext().getPackageName());
            sb2.append(".provider");
            uri = FileProvider.getUriForFile(context, sb2.toString(), file);
            intent.addFlags(PropertyOptions.SEPARATE_NODE);
            intent.addFlags(1);
        } else {
            uri = Uri.fromFile(file);
        }
        intent.putExtra("android.intent.extra.STREAM", uri);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f478w.getString(2131755049));
        String str2 = "-";
        sb3.append(str2);
        sb3.append(mo608q());
        intent.putExtra("android.intent.extra.SUBJECT", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f478w.getString(2131755049));
        sb4.append(str2);
        sb4.append(mo608q());
        intent.putExtra("android.intent.extra.TEXT", sb4.toString());
        intent.putExtra("android.intent.extra.EMAIL", new String[]{mo609q("PREF_ACCOUNT_NAME", "")});
        this.f478w.startActivity(Intent.createChooser(intent, "Share File!"));
    }

    /* renamed from: T */
    public void mo481T() {
        C0288NU.m892a().mo934a(new C0356QU(7, this, this.f478w));
    }

    /* renamed from: T */
    public void mo482T(String str) {
        Uri uri;
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            StringBuilder sb = new StringBuilder();
            sb.append(f441a);
            sb.append("/");
            sb.append(str);
            File file = new File(sb.toString());
            if (VERSION.SDK_INT >= 24) {
                Context context = this.f478w;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f478w.getApplicationContext().getPackageName());
                sb2.append(".provider");
                uri = FileProvider.getUriForFile(context, sb2.toString(), file);
                intent.addFlags(PropertyOptions.SEPARATE_NODE);
                intent.addFlags(1);
            } else {
                uri = Uri.fromFile(file);
            }
            intent.putExtra("android.intent.extra.STREAM", uri);
            this.f478w.startActivity(Intent.createChooser(intent, "Share Image!"));
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Error saving image file: ");
            sb3.append(e.getMessage());
            Log.w("TAG", sb3.toString());
        }
    }

    /* renamed from: U */
    public void mo483U() {
        this.f477v.beginTransaction();
        try {
            this.f477v.execSQL("create table transactions_bk4 as select * from transactions;");
            this.f477v.execSQL("drop table transactions;");
            this.f477v.execSQL("CREATE TABLE transactions (  `ID` INTEGER PRIMARY KEY AUTOINCREMENT,  `cus_id` INTEGER,  `in` TEXT,  `out` TEXT,  `date_` TEXT,  `remarks` TEXT,  `now_` TEXT,  `param1` TEXT,  `param2` TEXT,  `t_cus_id` INTEGER,  `f1` TEXT,  `f2` TEXT,  `f3` TEXT,                         curr_id INTEGER default 0                     );");
            this.f477v.execSQL("insert into transactions select * from transactions_bk4;");
            this.f477v.execSQL("update transactions set param1=param2,param2=now_  where param2 like '%.j%';");
            this.f477v.execSQL("update transactions set param1=now_  where now_ like '%.j%';");
            this.f477v.setTransactionSuccessful();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f477v.endTransaction();
            throw th;
        }
        this.f477v.endTransaction();
    }

    /* renamed from: U */
    public void mo484U(String str) {
        Uri uri;
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("application/pdf");
            StringBuilder sb = new StringBuilder();
            sb.append(f441a);
            sb.append("/");
            sb.append(str);
            File file = new File(sb.toString());
            if (VERSION.SDK_INT >= 24) {
                Context context = this.f478w;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f478w.getApplicationContext().getPackageName());
                sb2.append(".provider");
                uri = FileProvider.getUriForFile(context, sb2.toString(), file);
                intent.addFlags(PropertyOptions.SEPARATE_NODE);
                intent.addFlags(1);
            } else {
                uri = Uri.fromFile(file);
            }
            intent.putExtra("android.intent.extra.STREAM", uri);
            this.f478w.startActivity(Intent.createChooser(intent, "Share PDF!"));
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Error saving pdf file: ");
            sb3.append(e.getMessage());
            Log.w("TAG", sb3.toString());
        }
    }

    /* renamed from: V */
    public Cursor mo485V() {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT b.name as _id , abs(SUM(a.out * a.[in])) AS amount,  (case when SUM(a.out * a.[in])>= 0 then  1+1 else -1+1 end ) as _in,b.gsm as phone  FROM transactions AS a, customers AS b  WHERE a.cus_id = b.id   GROUP BY b.name, b.id   ORDER BY 3 Desc ,2 DESC  ", null);
        mo532b();
        return rawQuery;
    }

    /* renamed from: V */
    public void mo486V(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", str);
        Context context = this.f478w;
        context.startActivity(Intent.createChooser(intent, context.getResources().getString(2131755381)));
    }

    /* renamed from: W */
    public Cursor mo487W() {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT b.name as _id ,ifnull( abs(SUM(a.out * a.[in])),0) AS amount,  (case when SUM(a.out * a.[in])>= 0 then  1+1 else -1+1 end ) as _in ,b.id as id,b.gsm as phone ,max(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d,( (select julianday(strftime('%Y-%m-%d','now')) -julianday(max(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) ))) from transactions as c where c.cus_id=b.id) ) as days_late  FROM customers AS b  left join transactions AS a   on a.cus_id = b.id GROUP BY b.name, b.id having ifnull( abs(SUM(a.out * a.[in])),0)<>0  ORDER BY amount DESC,_in desc  ", null);
        mo532b();
        return rawQuery;
    }

    /* renamed from: X */
    public Cursor mo488X() {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT a.id as id, ifnull((sum(case when (c.t_cus_id=b.id) then -1*c.out else  (c.[in]*c.out) end))*1  ,0) as net_balance                 ,sum(case  when c.[in] = 1 and (c.t_cus_id<>b.id or c.t_cus_id is null) then c.out else 0 end)*1.0 as cr_amount ,                sum(case when not(c.[in] = 1 and (c.t_cus_id<>b.id or c.t_cus_id is null)) then c.out else 0 end )*1.0 as db_amount ,a.name as _id                from groups a left join customers b on (a.id=b.g_id)                 left join transactions c on (c.cus_id = b.id or c.t_cus_id=b.id)                  group by a.name,a.id  order by 2", null);
        mo532b();
        return rawQuery;
    }

    /* renamed from: X */
    public String mo489X(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                return str.substring(i);
            }
        }
        return "";
    }

    /* renamed from: Y */
    public Cursor mo490Y() {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT 0 id, substr(a.date_,7,4)||'-' ||substr(a.date_,4,2) _id, ifnull((sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end))*-1  ,0) AS amount,     (case when SUM(a.out * a.[in])>= 0 then  1+1 else -1+1 end ) as _in,0 days_late,0 phone   FROM customers b, transactions AS a    where a.cus_id = b.id or a.t_cus_id=b.id   GROUP BY substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)  order by 2  ", null);
        mo532b();
        return rawQuery;
    }

    /* renamed from: Z */
    public void mo491Z() {
        String str = "1";
        mo631x("db_data_changed", str);
        mo631x("db_cus_changed", str);
    }

    /* renamed from: a */
    public Cursor mo492a(String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        StringBuilder sb = new StringBuilder();
        String str7 = "";
        sb.append(str7);
        sb.append(str4);
        String str8 = ":";
        sb.append(str8);
        sb.append(str5);
        sb.append(str8);
        sb.append(str6);
        Log.d("Inputs:=", sb.toString());
        String str9 = Value.PERCENTAGE;
        String str10 = " ORDER BY (d2) desc ,1 desc ";
        if (!str5.equals(str9) || !str6.equals(str9)) {
            String str11 = " ";
            if (str5.equals(str9) && !str6.equals(str9)) {
                SQLiteDatabase sQLiteDatabase = this.f477v;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" SELECT a.ID as _id,  a.date_ as date_,abs(a.out * a.[in]) as amount ,(case when (a.t_cus_id=b.id) then 'من '||(select name from customers where id=a.cus_id)||'//'||a.remarks  when (a.cus_id=b.id and a.t_cus_id is not null) then 'لـ '||(select name from customers where id=a.t_cus_id)||'//'||a.remarks   else (a.remarks) end)  as remarks  ,(case when (a.t_cus_id=b.id) then 0 else  (a.[in]+1) end)  as _in,0 as Bal,  strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d, substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1 ,d.id as curr_id,d.name as curr_name  FROM transactions AS a, customers AS b,currency d  WHERE (a.cus_id = b.id or a.t_cus_id=b.id)  and (b.id=? or b.name=?) and a.curr_id=d.id  and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) <= ?  ");
                sb2.append(str11);
                sb2.append(str10);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str7);
                sb4.append(str4);
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str7);
                sb5.append(str4);
                return sQLiteDatabase.rawQuery(sb3, new String[]{sb4.toString(), sb5.toString(), str6});
            } else if (str5.equals(str9) || !str6.equals(str9)) {
                SQLiteDatabase sQLiteDatabase2 = this.f477v;
                StringBuilder sb6 = new StringBuilder();
                sb6.append("SELECT 0 as _id,  strftime('%d-%m-%Y',min  (( substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ))) as date_  ,ifnull(abs((select sum(case when (c.t_cus_id=b.id) then -1*c.out else  (c.[in]*c.out) end) from transactions c where (c.cus_id=b.id or c.t_cus_id=b.id)    and date(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) )) <? ) ),0) as amount ,'رصيد سابق' remarks ,(case when ifnull((select sum(case when (c.t_cus_id=b.id) then -1*c.out else  (c.[in]*c.out) end) from transactions c where (c.cus_id=b.id or c.t_cus_id=b.id)    and date(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) ))   <? ),0) >=0 then 2 else 0 end) as _in,0 as Bal, '' d, min  (date( substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d2,b.name,null param1 ,d.id as curr_id,d.name as curr_name  FROM transactions AS a, customers AS b ,currency d  WHERE (a.cus_id = b.id or a.t_cus_id=b.id)  and (b.id=? or b.name=?) and a.curr_id=d.id  and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) between ? and ?  group by b.name ,d.id,d.name  union all  SELECT a.ID as _id,  a.date_ as date_,abs(a.out * a.[in]) as amount ,(case when (a.t_cus_id=b.id) then 'من '||(select name from customers where id=a.cus_id)||'//'||a.remarks  when (a.cus_id=b.id and a.t_cus_id is not null) then 'لـ '||(select name from customers where id=a.t_cus_id)||'//'||a.remarks   else (a.remarks) end)  as remarks  ,(case when (a.t_cus_id=b.id) then 0 else  (a.[in]+1) end)  as _in,0 as Bal,  strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d, substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1 ,d.id as curr_id,d.name as curr_name  FROM transactions AS a, customers AS b,currency d  WHERE (a.cus_id = b.id or a.t_cus_id=b.id)  and (b.id=? or b.name=?) and a.curr_id=d.id   and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) between ? and ? ");
                sb6.append(str11);
                sb6.append(str10);
                String sb7 = sb6.toString();
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str7);
                sb8.append(str4);
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str7);
                sb9.append(str4);
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str7);
                sb10.append(str4);
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str7);
                sb11.append(str4);
                return sQLiteDatabase2.rawQuery(sb7, new String[]{str5, str5, sb8.toString(), sb9.toString(), str5, str6, sb10.toString(), sb11.toString(), str5, str6});
            } else {
                SQLiteDatabase sQLiteDatabase3 = this.f477v;
                StringBuilder sb12 = new StringBuilder();
                sb12.append("SELECT 0 as _id,  strftime('%d-%m-%Y',min  (( substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ))) as date_  ,ifnull(abs((select sum(case when (c.t_cus_id=b.id) then -1*c.out else  (c.[in]*c.out) end) from transactions c where (c.cus_id=b.id or c.t_cus_id=b.id)    and date(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) )) <? ) ),0) as amount ,'رصيد سابق' remarks ,(case when ifnull((select sum(case when (c.t_cus_id=b.id) then -1*c.out else  (c.[in]*c.out) end) from transactions c where (c.cus_id=b.id or c.t_cus_id=b.id)    and date(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) ))   <? ),0) >=0 then 2 else 0 end) as _in,0 as Bal, '' d, min  (date( substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d2,b.name,null param1 ,d.id as curr_id,d.name as curr_name  FROM transactions AS a, customers AS b ,currency d  WHERE (a.cus_id = b.id or a.t_cus_id=b.id)  and (b.id=? or b.name=?) and a.curr_id=d.id  and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) >=?  group by b.name,d.id,d.name  union all  SELECT a.ID as _id,  a.date_ as date_,abs(a.out * a.[in]) as amount ,(case when (a.t_cus_id=b.id) then 'من '||(select name from customers where id=a.cus_id)||'//'||a.remarks  when (a.cus_id=b.id and a.t_cus_id is not null) then 'لـ '||(select name from customers where id=a.t_cus_id)||'//'||a.remarks   else (a.remarks) end)  as remarks  ,(case when (a.t_cus_id=b.id) then 0 else  (a.[in]+1) end)  as _in,0 as Bal,  strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d, substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1 ,d.id as curr_id,d.name as curr_name  FROM transactions AS a, customers AS b,currency d  WHERE (a.cus_id = b.id or a.t_cus_id=b.id)  and (b.id=? or b.name=?) and a.curr_id=d.id  and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) >= ?  ");
                sb12.append(str11);
                sb12.append(str10);
                String sb13 = sb12.toString();
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str7);
                sb14.append(str4);
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str7);
                sb15.append(str4);
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str7);
                sb16.append(str4);
                StringBuilder sb17 = new StringBuilder();
                sb17.append(str7);
                sb17.append(str4);
                return sQLiteDatabase3.rawQuery(sb13, new String[]{str5, str5, sb14.toString(), sb15.toString(), str5, sb16.toString(), sb17.toString(), str5});
            }
        } else {
            SQLiteDatabase sQLiteDatabase4 = this.f477v;
            StringBuilder sb18 = new StringBuilder();
            sb18.append("SELECT a.ID as _id, a.date_ as date_,abs(a.out * a.[in]) as amount ,(case when (a.t_cus_id=b.id) then 'من '||(select name from customers where id=a.cus_id)||'//'||a.remarks  when (a.cus_id=b.id and a.t_cus_id is not null) then 'لـ '||(select name from customers where id=a.t_cus_id)||'//'||a.remarks   else (a.remarks) end)  as remarks  ,(case when (a.t_cus_id=b.id) then 0 else  (a.[in]+1) end)  as _in,0 as Bal, strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d,substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1 ,d.id as curr_id,d.name as curr_name  FROM transactions AS a, customers AS b ,currency d");
            sb18.append(" WHERE (a.cus_id = b.id or a.t_cus_id=b.id)  and (b.id=? or b.name=?) and a.curr_id=d.id   ");
            sb18.append(str10);
            String sb19 = sb18.toString();
            StringBuilder sb20 = new StringBuilder();
            sb20.append(str7);
            sb20.append(str4);
            sb20.append(str7);
            StringBuilder sb21 = new StringBuilder();
            sb21.append(str7);
            sb21.append(str4);
            sb21.append(str7);
            return sQLiteDatabase4.rawQuery(sb19, new String[]{sb20.toString(), sb21.toString()});
        }
    }

    /* renamed from: a */
    public Bitmap mo493a(ListView listView, LinearLayout linearLayout) {
        ListAdapter adapter = listView.getAdapter();
        int count = adapter.getCount();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < 1; i2++) {
            linearLayout.measure(MeasureSpec.makeMeasureSpec(linearLayout.getWidth(), PropertyOptions.SEPARATE_NODE), MeasureSpec.makeMeasureSpec(0, 0));
            linearLayout.layout(0, 0, linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
            linearLayout.setDrawingCacheEnabled(true);
            linearLayout.buildDrawingCache();
            arrayList.add(linearLayout.getDrawingCache());
            i += linearLayout.getMeasuredHeight();
        }
        for (int i3 = 0; i3 < count; i3++) {
            View view = adapter.getView(i3, null, listView);
            view.measure(MeasureSpec.makeMeasureSpec(listView.getWidth(), PropertyOptions.SEPARATE_NODE), MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.setDrawingCacheEnabled(true);
            view.buildDrawingCache();
            arrayList.add(view.getDrawingCache());
            i += view.getMeasuredHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(listView.getMeasuredWidth(), i, Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            Bitmap bitmap = (Bitmap) arrayList.get(i5);
            canvas.drawBitmap(bitmap, 0.0f, (float) i4, paint);
            i4 += bitmap.getHeight();
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* renamed from: a */
    public Uri mo494a(Context context, Intent intent) {
        Uri uri;
        try {
            if (VERSION.SDK_INT >= 24) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f478w.getApplicationContext().getPackageName());
                sb.append(".provider");
                uri = FileProvider.getUriForFile(context, sb.toString(), m429h());
                intent.addFlags(1);
                intent.addFlags(2);
            } else {
                uri = Uri.fromFile(m429h());
            }
            return uri;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public PdfPCell mo495a(Font font, Font font2, String str, String str2, String str3, int i) {
        String str4;
        String str5;
        String str6 = str2;
        String str7 = str3;
        String str8 = "";
        String str9 = Value.PERCENTAGE;
        try {
            PdfPTable pdfPTable = new PdfPTable(new float[]{3.0f, 3.0f, 3.0f});
            pdfPTable.setWidthPercentage(100.0f);
            Font font3 = font;
            pdfPTable.addCell(mo496a(font, str8, 3));
            if (!str6.equals(str9) || !str7.equals(str9)) {
                String str10 = ":";
                String str11 = "\n";
                if (!str6.equals(str9)) {
                    if (!str7.equals(str9)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str11);
                        sb.append(this.f478w.getString(2131755178));
                        sb.append(str10);
                        sb.append(str6);
                        sb.append("        ");
                        sb.append(this.f478w.getString(2131755393));
                        sb.append(str10);
                        sb.append(str7);
                        sb.append(str11);
                        str5 = sb.toString();
                        str4 = str5;
                        mo514a(pdfPTable, str, str4, 1, 3, font, font2);
                    }
                }
                String str12 = "        \n";
                if (!str6.equals(str9)) {
                    if (str7.equals(str9)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str11);
                        sb2.append(this.f478w.getString(2131755178));
                        sb2.append(str10);
                        sb2.append(str6);
                        sb2.append(str12);
                        str5 = sb2.toString();
                        str4 = str5;
                        mo514a(pdfPTable, str, str4, 1, 3, font, font2);
                    }
                }
                if (!str6.equals(str9) || str7.equals(str9)) {
                    str4 = str8;
                    mo514a(pdfPTable, str, str4, 1, 3, font, font2);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str11);
                    sb3.append(this.f478w.getString(2131755393));
                    sb3.append(str10);
                    sb3.append(str7);
                    sb3.append(str12);
                    str5 = sb3.toString();
                    str4 = str5;
                    mo514a(pdfPTable, str, str4, 1, 3, font, font2);
                }
            } else {
                mo510a(pdfPTable, str, 1, 3, font);
            }
            PdfPCell pdfPCell = new PdfPCell(pdfPTable);
            pdfPCell.setColspan(i);
            return pdfPCell;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public PdfPCell mo496a(Font font, String str, int i) {
        PdfPTable pdfPTable = new PdfPTable(new float[]{3.0f, 3.0f, 3.0f});
        pdfPTable.setWidthPercentage(100.0f);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f478w);
        String str2 = "";
        this.f480y = defaultSharedPreferences.getString("prefUsername", str2);
        this.f481z = defaultSharedPreferences.getString("prefUsername_en", str2);
        this.f462A = defaultSharedPreferences.getString("prefAddress", str2);
        this.f463B = defaultSharedPreferences.getString("prefAddress_en", str2);
        this.f464C = defaultSharedPreferences.getString("prefPhone", str2);
        this.f467F = Boolean.valueOf(defaultSharedPreferences.getBoolean("prefPrintUser", false));
        this.f468G = Boolean.valueOf(defaultSharedPreferences.getBoolean("prefPrintDate", false));
        this.f466E = Integer.parseInt(defaultSharedPreferences.getString("prefSyncFrequency", "1"));
        String str3 = "0";
        this.f465D = mo609q("ImageDecode", str3);
        for (int i2 = 0; i2 < this.f466E - 1; i2++) {
            mo510a(pdfPTable, "", 0, 3, font);
        }
        if (this.f467F.booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f481z);
            String str4 = "\n\n";
            sb.append(str4);
            sb.append(this.f463B);
            sb.append(str4);
            mo540b(pdfPTable, sb.toString(), 2, 3, font, true);
            if (!this.f465D.equals(str3)) {
                PdfPTable pdfPTable2 = pdfPTable;
                mo512a(pdfPTable2, "", 1, 3, font, this.f465D);
            } else {
                mo539b(pdfPTable, "", 1, 3, font, 2131623937);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f480y);
            sb2.append(str4);
            sb2.append(this.f462A);
            sb2.append(str4);
            sb2.append(this.f464C);
            mo540b(pdfPTable, sb2.toString(), 0, 3, font, true);
        }
        if (!str.equals(str2)) {
            mo510a(pdfPTable, str, 1, 3, font);
        }
        PdfPCell pdfPCell = new PdfPCell(pdfPTable);
        pdfPCell.setColspan(i);
        return pdfPCell;
    }

    /* renamed from: a */
    public String mo497a(int i) {
        mo477R();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        Cursor rawQuery = sQLiteDatabase.rawQuery("select (select name from customers where id=cus_id) as _id from transactions  where id=?  ", new String[]{sb.toString()});
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            str = rawQuery.getString(rawQuery.getColumnIndex("_id"));
            rawQuery.moveToNext();
        }
        mo532b();
        rawQuery.close();
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a7, code lost:
        if (f451k == true) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00cd, code lost:
        if (f451k == true) goto L_0x00cf;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public String mo498a(p000.C0232LL r8, String r9, double r10) {
        /*
            r7 = this;
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.content.Context r0 = r7.f478w
            r1 = 2131755301(0x7f100125, float:1.9141477E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "prefUsername"
            java.lang.String r1 = r7.mo609q(r1, r0)
            boolean r0 = r1.equals(r0)
            java.lang.String r2 = "\n"
            java.lang.String r3 = " "
            if (r0 != 0) goto L_0x004a
            int r0 = r1.length()
            if (r0 == 0) goto L_0x004a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r4 = r7.f478w
            r5 = 2131755157(0x7f100095, float:1.9141185E38)
            java.lang.String r4 = r4.getString(r5)
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.append(r0)
            r9.append(r2)
        L_0x004a:
            int r0 = r8.mo780k()
            int[] r1 = r7.f479x
            r4 = 0
            r1 = r1[r4]
            if (r0 != r1) goto L_0x005b
            android.content.Context r0 = r7.f478w
            r1 = 2131755142(0x7f100086, float:1.9141155E38)
            goto L_0x0060
        L_0x005b:
            android.content.Context r0 = r7.f478w
            r1 = 2131755160(0x7f100098, float:1.9141191E38)
        L_0x0060:
            java.lang.String r0 = r0.getString(r1)
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = r8.mo775f()
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = r8.mo779j()
            r9.append(r0)
            r0 = 0
            java.lang.String r4 = ""
            r5 = 1
            int r6 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r6 < 0) goto L_0x00aa
            r9.append(r2)
            android.content.Context r0 = r7.f478w
            r1 = 2131755255(0x7f1000f7, float:1.9141384E38)
            java.lang.String r0 = r0.getString(r1)
            r9.append(r0)
            r9.append(r3)
            double r10 = java.lang.Math.abs(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r7.mo448B(r10)
            r9.append(r10)
            boolean r10 = f451k
            if (r10 != r5) goto L_0x00d3
            goto L_0x00cf
        L_0x00aa:
            r9.append(r2)
            android.content.Context r0 = r7.f478w
            r1 = 2131755253(0x7f1000f5, float:1.914138E38)
            java.lang.String r0 = r0.getString(r1)
            r9.append(r0)
            r9.append(r3)
            double r10 = java.lang.Math.abs(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r7.mo448B(r10)
            r9.append(r10)
            boolean r10 = f451k
            if (r10 != r5) goto L_0x00d3
        L_0x00cf:
            java.lang.String r4 = r8.mo766a()
        L_0x00d3:
            r9.append(r4)
            java.lang.String r8 = r9.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo498a(LL, java.lang.String, double):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r11 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        if (r11 != null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public String mo499a(Context r10, Uri r11, String r12, String[] r13) {
        /*
            r9 = this;
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r7 = "_data"
            r1 = 0
            r3[r1] = r7
            r8 = 0
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            r6 = 0
            r2 = r11
            r4 = r12
            r5 = r13
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0036, all -> 0x0033 }
            if (r11 == 0) goto L_0x002d
            boolean r12 = r11.moveToFirst()     // Catch:{ Exception -> 0x002b }
            if (r12 == 0) goto L_0x002d
            int r12 = r11.getColumnIndexOrThrow(r7)     // Catch:{ Exception -> 0x002b }
            java.lang.String r10 = r11.getString(r12)     // Catch:{ Exception -> 0x002b }
            if (r11 == 0) goto L_0x002a
            r11.close()
        L_0x002a:
            return r10
        L_0x002b:
            r12 = move-exception
            goto L_0x0038
        L_0x002d:
            if (r11 == 0) goto L_0x0046
        L_0x002f:
            r11.close()
            goto L_0x0046
        L_0x0033:
            r10 = move-exception
            r11 = r8
            goto L_0x0048
        L_0x0036:
            r12 = move-exception
            r11 = r8
        L_0x0038:
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0047 }
            android.widget.Toast r10 = android.widget.Toast.makeText(r10, r12, r0)     // Catch:{ all -> 0x0047 }
            r10.show()     // Catch:{ all -> 0x0047 }
            if (r11 == 0) goto L_0x0046
            goto L_0x002f
        L_0x0046:
            return r8
        L_0x0047:
            r10 = move-exception
        L_0x0048:
            if (r11 == 0) goto L_0x004d
            r11.close()
        L_0x004d:
            goto L_0x004f
        L_0x004e:
            throw r10
        L_0x004f:
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo499a(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* renamed from: a */
    public final void mo500a(Context context) {
        this.f473L = "";
        this.f472K = new ProgressDialog(context);
        this.f472K.setProgressStyle(0);
        this.f472K.setCancelable(false);
        this.f472K.setButton(-2, "Cancel", new C0997pU(this));
        this.f472K.show();
        this.f473L = context.getString(2131755423);
        this.f472K.setMessage(this.f473L);
    }

    /* renamed from: a */
    public void mo501a(Context context, AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new C1165xU(this, autoCompleteTextView));
        autoCompleteTextView.addTextChangedListener(new C1206zU(this, autoCompleteTextView, context));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:9|10|11|12|14|15|(2:17|18)|19|20|(2:22|(1:24)(3:25|27|(1:29)(1:30)))|26|27|(0)(0)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00b8 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00bd A[Catch:{ Exception -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5 A[Catch:{ Exception -> 0x0125 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d9 A[Catch:{ Exception -> 0x0125 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo502a(Context r15, String r16) {
        /*
            r14 = this;
            r9 = r14
            r5 = r15
            java.lang.String r0 = "PREF_ACCOUNT_NAME"
            java.lang.String r1 = ""
            android.support.v7.app.AlertDialog$Builder r2 = new android.support.v7.app.AlertDialog$Builder     // Catch:{ Exception -> 0x0125 }
            r2.<init>(r15)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r3 = "layout_inflater"
            java.lang.Object r3 = r15.getSystemService(r3)     // Catch:{ Exception -> 0x0125 }
            android.view.LayoutInflater r3 = (android.view.LayoutInflater) r3     // Catch:{ Exception -> 0x0125 }
            r4 = 2131492965(0x7f0c0065, float:1.8609397E38)
            r6 = 0
            android.view.View r3 = r3.inflate(r4, r6)     // Catch:{ Exception -> 0x0125 }
            r2.setView(r3)     // Catch:{ Exception -> 0x0125 }
            r4 = 2131296387(0x7f090083, float:1.821069E38)
            android.view.View r4 = r3.findViewById(r4)     // Catch:{ Exception -> 0x0125 }
            android.widget.EditText r4 = (android.widget.EditText) r4     // Catch:{ Exception -> 0x0125 }
            r6 = 2131296389(0x7f090085, float:1.8210693E38)
            android.view.View r6 = r3.findViewById(r6)     // Catch:{ Exception -> 0x0125 }
            android.widget.EditText r6 = (android.widget.EditText) r6     // Catch:{ Exception -> 0x0125 }
            r7 = 2131296379(0x7f09007b, float:1.8210673E38)
            android.view.View r7 = r3.findViewById(r7)     // Catch:{ Exception -> 0x0125 }
            android.widget.EditText r7 = (android.widget.EditText) r7     // Catch:{ Exception -> 0x0125 }
            r8 = 2131296382(0x7f09007e, float:1.821068E38)
            android.view.View r8 = r3.findViewById(r8)     // Catch:{ Exception -> 0x0125 }
            android.widget.EditText r8 = (android.widget.EditText) r8     // Catch:{ Exception -> 0x0125 }
            r10 = 2131296390(0x7f090086, float:1.8210695E38)
            android.view.View r3 = r3.findViewById(r10)     // Catch:{ Exception -> 0x0125 }
            r10 = r3
            android.widget.EditText r10 = (android.widget.EditText) r10     // Catch:{ Exception -> 0x0125 }
            r3 = r16
            android.database.Cursor r3 = r14.mo569f(r3)     // Catch:{ Exception -> 0x0125 }
            int r11 = r3.getCount()     // Catch:{ Exception -> 0x0125 }
            if (r11 == 0) goto L_0x009d
            r3.moveToFirst()     // Catch:{ Exception -> 0x0125 }
        L_0x005b:
            boolean r0 = r3.isAfterLast()     // Catch:{ Exception -> 0x0125 }
            if (r0 != 0) goto L_0x0099
            java.lang.String r0 = "_id"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x0125 }
            r4.setText(r0)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r0 = "phone"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x0125 }
            r6.setText(r0)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r0 = "country"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x0125 }
            r7.setText(r0)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r0 = "email"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x0125 }
            r8.setText(r0)     // Catch:{ Exception -> 0x0125 }
            r3.moveToNext()     // Catch:{ Exception -> 0x0125 }
            goto L_0x005b
        L_0x0099:
            r10.requestFocus()     // Catch:{ Exception -> 0x0125 }
            goto L_0x00e0
        L_0x009d:
            r4.requestFocus()     // Catch:{ Exception -> 0x0125 }
            r14.mo578g(r15)     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            r3 = 8
            r10.setVisibility(r3)     // Catch:{ Exception -> 0x0125 }
            java.lang.String r3 = f447g     // Catch:{ Exception -> 0x0125 }
            boolean r3 = r3.equals(r1)     // Catch:{ Exception -> 0x0125 }
            if (r3 == 0) goto L_0x00b8
            android.content.Context r3 = r9.f478w     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r3 = r14.mo558d(r3)     // Catch:{ Exception -> 0x00b8 }
            f447g = r3     // Catch:{ Exception -> 0x00b8 }
        L_0x00b8:
            java.lang.String r3 = f447g     // Catch:{ Exception -> 0x0125 }
            r11 = 0
            if (r3 == 0) goto L_0x00c8
            java.lang.String r3 = f447g     // Catch:{ Exception -> 0x0125 }
            if (r3 != r1) goto L_0x00c2
            goto L_0x00c8
        L_0x00c2:
            java.lang.String r3 = f447g     // Catch:{ Exception -> 0x0125 }
            r7.setText(r3)     // Catch:{ Exception -> 0x0125 }
            goto L_0x00cb
        L_0x00c8:
            r7.setVisibility(r11)     // Catch:{ Exception -> 0x0125 }
        L_0x00cb:
            java.lang.String r3 = r14.mo609q(r0, r1)     // Catch:{ Exception -> 0x0125 }
            boolean r3 = r3.equals(r1)     // Catch:{ Exception -> 0x0125 }
            if (r3 == 0) goto L_0x00d9
            r8.setVisibility(r11)     // Catch:{ Exception -> 0x0125 }
            goto L_0x00e0
        L_0x00d9:
            java.lang.String r0 = r14.mo609q(r0, r1)     // Catch:{ Exception -> 0x0125 }
            r8.setText(r0)     // Catch:{ Exception -> 0x0125 }
        L_0x00e0:
            r0 = 2131755359(0x7f10015f, float:1.9141595E38)
            java.lang.String r0 = r15.getString(r0)     // Catch:{ Exception -> 0x0125 }
            lU r1 = new lU     // Catch:{ Exception -> 0x0125 }
            r1.<init>(r14)     // Catch:{ Exception -> 0x0125 }
            r2.setPositiveButton(r0, r1)     // Catch:{ Exception -> 0x0125 }
            r0 = 2131755358(0x7f10015e, float:1.9141593E38)
            java.lang.String r0 = r15.getString(r0)     // Catch:{ Exception -> 0x0125 }
            mU r1 = new mU     // Catch:{ Exception -> 0x0125 }
            r1.<init>(r14)     // Catch:{ Exception -> 0x0125 }
            r2.setNegativeButton(r0, r1)     // Catch:{ Exception -> 0x0125 }
            android.support.v7.app.AlertDialog r11 = r2.create()     // Catch:{ Exception -> 0x0125 }
            r0 = 2131755076(0x7f100044, float:1.9141021E38)
            java.lang.String r0 = r15.getString(r0)     // Catch:{ Exception -> 0x0125 }
            r11.setTitle(r0)     // Catch:{ Exception -> 0x0125 }
            r11.show()     // Catch:{ Exception -> 0x0125 }
            r0 = -1
            android.widget.Button r12 = r11.getButton(r0)     // Catch:{ Exception -> 0x0125 }
            nU r13 = new nU     // Catch:{ Exception -> 0x0125 }
            r0 = r13
            r1 = r14
            r2 = r4
            r3 = r6
            r4 = r7
            r5 = r15
            r6 = r8
            r7 = r10
            r8 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0125 }
            r12.setOnClickListener(r13)     // Catch:{ Exception -> 0x0125 }
        L_0x0125:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo502a(android.content.Context, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo503a(Context context, String str, int i) {
        Dialog dialog = new Dialog(context);
        LinearLayout linearLayout = new LinearLayout(context);
        String[] stringArray = context.getResources().getStringArray(2130903061);
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(2130903048);
        ListView listView = new ListView(context);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < stringArray.length; i2++) {
            arrayList.add(new C0796gO(stringArray[i2], obtainTypedArray.getResourceId(i2, -1)));
        }
        obtainTypedArray.recycle();
        listView.setAdapter(new C0063DH(context, arrayList));
        C1078tU tUVar = new C1078tU(this, i, context, str, dialog);
        listView.setOnItemClickListener(tUVar);
        linearLayout.setFocusable(true);
        listView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        listView.setDividerHeight(0);
        linearLayout.addView(listView, -1, -1);
        dialog.requestWindowFeature(1);
        dialog.setContentView(linearLayout);
        dialog.show();
    }

    /* renamed from: a */
    public void mo504a(Context context, String str, String str2) {
        String str3 = "";
        try {
            if (str.length() >= 8) {
                if (str2.length() >= 3) {
                    V a = qa.a(context);
                    String e = mo567e(mo609q("pref_bulk_sms", str3), str, str2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("=");
                    sb.append(e);
                    Log.d("api_url: ", sb.toString());
                    pa paVar = new pa(1, e, new C0014AU(this, context), new C0033BU(this, context));
                    a.a().clear();
                    paVar.a(false);
                    a.a(paVar);
                }
            }
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e2.getMessage());
            sb2.append(str3);
            Log.d("api_error=", sb2.toString());
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo505a(Button button, Button button2) {
        button.setText(mo609q("pref_credit", this.f478w.getString(2131755144)));
        button2.setText(mo609q("pref_debit", this.f478w.getString(2131755162)));
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo506a(ExpandableListView expandableListView, String str, double d, String str2) {
        String sb;
        char c;
        String str3;
        String str4;
        Paragraph paragraph;
        String str5;
        String sb2;
        String str6;
        String str7;
        String string;
        String str8;
        String string2;
        String string3;
        String str9;
        int i;
        int i2;
        int i3;
        String str10;
        int i4;
        int i5;
        int i6;
        String str11;
        String str12 = str2;
        String str13 = "PDFCreator";
        String str14 = "";
        Document document = new Document();
        new DecimalFormat("0.00");
        try {
            File file = new File(f441a);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(".pdf");
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, sb3.toString()));
            BaseFont createFont = BaseFont.createFont("assets/fonts/Tahoma.ttf", "Identity-H", true);
            Font font = new Font(createFont, 12.0f);
            new Font(createFont, 12.0f, 1, new BaseColor(0, 0, 0));
            Font font2 = new Font(createFont, 13.0f, 1, new BaseColor(0, 0, 255));
            new Font(createFont, 13.0f, 1, new BaseColor(255, 0, 0));
            new Font(createFont, 13.0f, 1, new BaseColor(0, 255, 0));
            new Font(createFont, 13.0f, 1, new BaseColor(255, 255, 255));
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f478w);
            this.f480y = defaultSharedPreferences.getString("prefUsername", str14);
            this.f462A = defaultSharedPreferences.getString("prefAddress", str14);
            this.f464C = defaultSharedPreferences.getString("prefPhone", str14);
            this.f467F = Boolean.valueOf(defaultSharedPreferences.getBoolean("prefPrintUser", false));
            this.f468G = Boolean.valueOf(defaultSharedPreferences.getBoolean("prefPrintDate", false));
            this.f466E = Integer.parseInt(defaultSharedPreferences.getString("prefSyncFrequency", "1"));
            this.f465D = mo609q("ImageDecode", "0");
            PdfWriter.getInstance(document, fileOutputStream).setPageEvent(new C0196a());
            document.open();
            document.setPageSize(PageSize.A4);
            Paragraph paragraph2 = new Paragraph(str14);
            paragraph2.setAlignment(1);
            float[] fArr = {2.0f, 2.0f, 3.0f, 6.0f};
            float[] fArr2 = {2.0f, 2.0f, 3.0f, 6.0f};
            mo466K();
            if (f457q.equals("R")) {
                c = 0;
                fArr = new float[]{6.0f, 3.0f, 2.0f, 2.0f};
                fArr2 = new float[]{6.0f, 3.0f, 2.0f, 2.0f};
            } else {
                c = 0;
            }
            PdfPTable pdfPTable = new PdfPTable(fArr);
            PdfPTable pdfPTable2 = new PdfPTable(fArr2);
            pdfPTable.setWidthPercentage(100.0f);
            pdfPTable2.setWidthPercentage(100.0f);
            int i7 = 0;
            for (int i8 = 1; i7 < this.f466E - i8; i8 = 1) {
                PdfPTable pdfPTable3 = pdfPTable2;
                PdfPTable pdfPTable4 = pdfPTable;
                int i9 = i7;
                Font font3 = font2;
                mo510a(pdfPTable2, "", 0, 4, font2);
                i7 = i9 + 1;
                pdfPTable = pdfPTable4;
                font2 = font3;
                pdfPTable2 = pdfPTable3;
            }
            PdfPTable pdfPTable5 = pdfPTable2;
            PdfPTable pdfPTable6 = pdfPTable;
            Font font4 = font2;
            String str15 = "L";
            if (this.f467F.booleanValue()) {
                if (f457q.equals("R")) {
                    str11 = str15;
                    str3 = str14;
                    paragraph = paragraph2;
                    mo513a(pdfPTable5, this.f480y, 2, 3, font4, true);
                    mo513a(pdfPTable5, this.f462A, 2, 3, font4, true);
                    mo513a(pdfPTable5, this.f464C, 2, 3, font4, true);
                } else {
                    str11 = str15;
                    str3 = str14;
                    paragraph = paragraph2;
                }
                if (!this.f465D.equals("0")) {
                    mo538b(pdfPTable5, "", 0, 3, font4);
                    mo538b(pdfPTable5, "", 0, 3, font4);
                    mo512a(pdfPTable5, "", 0, 3, font4, this.f465D);
                } else {
                    mo538b(pdfPTable5, "", 0, 3, font4);
                    mo538b(pdfPTable5, "", 0, 3, font4);
                    mo539b(pdfPTable5, "", 0, 3, font4, 2131623937);
                }
                String str16 = str11;
                if (f457q.equals(str16)) {
                    str4 = str16;
                    mo513a(pdfPTable5, this.f480y, 0, 3, font4, true);
                    mo513a(pdfPTable5, this.f462A, 0, 3, font4, true);
                    mo513a(pdfPTable5, this.f464C, 0, 3, font4, true);
                } else {
                    str4 = str16;
                }
                mo513a(pdfPTable5, "", 0, 4, font4, true);
            } else {
                str4 = str15;
                str3 = str14;
                paragraph = paragraph2;
            }
            mo510a(pdfPTable5, str, 1, 4, font4);
            PdfPCell pdfPCell = new PdfPCell(pdfPTable5);
            pdfPCell.setColspan(4);
            pdfPTable6.addCell(pdfPCell);
            if (f457q.equals(str4)) {
                mo510a(pdfPTable6, this.f478w.getString(2131755413), 1, 1, font4);
                mo510a(pdfPTable6, this.f478w.getString(2131755407), 1, 1, font4);
                if (d >= 0.0d) {
                    str10 = "";
                    i4 = 1;
                    i5 = 1;
                    i6 = this.f479x[2];
                } else {
                    str10 = "";
                    i4 = 1;
                    i5 = 1;
                    i6 = this.f479x[c];
                }
                mo511a(pdfPTable6, str10, i4, i5, font4, i6);
                mo510a(pdfPTable6, this.f478w.getString(2131755154), 0, 1, font4);
            } else {
                mo510a(pdfPTable6, this.f478w.getString(2131755154), 2, 1, font4);
                if (d >= 0.0d) {
                    str9 = "";
                    i = 1;
                    i2 = 1;
                    i3 = this.f479x[2];
                } else {
                    str9 = "";
                    i = 1;
                    i2 = 1;
                    i3 = this.f479x[c];
                }
                mo511a(pdfPTable6, str9, i, i2, font4, i3);
                mo510a(pdfPTable6, this.f478w.getString(2131755407), 1, 1, font4);
                mo510a(pdfPTable6, this.f478w.getString(2131755413), 1, 1, font4);
            }
            pdfPTable6.setHeaderRows(this.f466E + 1);
            for (int i10 = 0; i10 < expandableListView.getAdapter().getCount(); i10++) {
                C0208KL kl = (C0208KL) expandableListView.getAdapter().getItem(i10);
                if (f457q.equals(str4)) {
                    mo510a(pdfPTable6, kl.mo672c(), 1, 1, font);
                    mo510a(pdfPTable6, kl.mo668a(), 0, 1, font);
                    if (kl.mo676g() == this.f479x[2]) {
                        string3 = this.f478w.getString(2131755143);
                    } else {
                        if (kl.mo676g() == this.f479x[c]) {
                            string3 = this.f478w.getString(2131755161);
                        }
                        mo510a(pdfPTable6, kl.mo675f(), 0, 1, font);
                    }
                    mo510a(pdfPTable6, string3, 1, 1, font);
                    mo510a(pdfPTable6, kl.mo675f(), 0, 1, font);
                } else {
                    mo510a(pdfPTable6, kl.mo675f(), 2, 1, font);
                    if (kl.mo676g() == this.f479x[2]) {
                        string2 = this.f478w.getString(2131755143);
                    } else {
                        if (kl.mo676g() == this.f479x[c]) {
                            string2 = this.f478w.getString(2131755161);
                        }
                        mo510a(pdfPTable6, kl.mo668a(), 2, 1, font);
                        mo510a(pdfPTable6, kl.mo672c(), 1, 1, font);
                    }
                    mo510a(pdfPTable6, string2, 1, 1, font);
                    mo510a(pdfPTable6, kl.mo668a(), 2, 1, font);
                    mo510a(pdfPTable6, kl.mo672c(), 1, 1, font);
                }
            }
            String str17 = " ";
            if (f457q.equals(str4)) {
                if (d >= 0.0d) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(mo448B(String.valueOf(Math.abs(d))));
                    if (!f451k) {
                        str8 = str3;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str17);
                        sb5.append(str12);
                        str8 = sb5.toString();
                    }
                    sb4.append(str8);
                    mo510a(pdfPTable6, sb4.toString(), 1, 2, font4);
                    string = this.f478w.getString(2131755254);
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(mo448B(String.valueOf(Math.abs(d))));
                    if (!f451k) {
                        str7 = str3;
                    } else {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str17);
                        sb7.append(str12);
                        str7 = sb7.toString();
                    }
                    sb6.append(str7);
                    mo510a(pdfPTable6, sb6.toString(), 1, 2, font4);
                    string = this.f478w.getString(2131755252);
                }
                mo510a(pdfPTable6, string, 0, 2, font4);
            } else {
                if (d >= 0.0d) {
                    mo510a(pdfPTable6, this.f478w.getString(2131755254), 2, 2, font4);
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(mo448B(String.valueOf(Math.abs(d))));
                    if (!f451k) {
                        str6 = str3;
                    } else {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(str17);
                        sb9.append(str12);
                        str6 = sb9.toString();
                    }
                    sb8.append(str6);
                    sb2 = sb8.toString();
                } else {
                    mo510a(pdfPTable6, this.f478w.getString(2131755252), 2, 2, font4);
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(mo448B(String.valueOf(Math.abs(d))));
                    if (!f451k) {
                        str5 = str3;
                    } else {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append(str17);
                        sb11.append(str12);
                        str5 = sb11.toString();
                    }
                    sb10.append(str5);
                    sb2 = sb10.toString();
                }
                mo510a(pdfPTable6, sb2, 1, 2, font4);
            }
            paragraph.add(pdfPTable6);
            document.add(paragraph);
            document.close();
            return;
        } catch (DocumentException e) {
            DocumentException documentException = e;
            StringBuilder sb12 = new StringBuilder();
            sb12.append("DocumentException:");
            sb12.append(documentException);
            sb = sb12.toString();
        } catch (IOException e2) {
            IOException iOException = e2;
            StringBuilder sb13 = new StringBuilder();
            sb13.append("ioException:");
            sb13.append(iOException);
            sb = sb13.toString();
        } catch (Throwable th) {
            throw th;
        }
        Log.e(str13, sb);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x04e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x04e8, code lost:
        r1 = r0;
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x04eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x04ec, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x04ee, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0509, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x050a, code lost:
        r2 = r9;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0520, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x04e7 A[ExcHandler: DocumentException (r0v4 'e' com.itextpdf.text.DocumentException A[CUSTOM_DECLARE]), PHI: r9 
      PHI: (r9v2 java.lang.String) = (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v3 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String) binds: [B:3:0x0018, B:10:0x002d, B:15:0x013a, B:28:0x0254, B:20:0x01d1, B:18:0x017b, B:19:?, B:13:0x0127, B:14:?, B:6:0x0023, B:7:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:10:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x04ee A[ExcHandler: IOException (e java.io.IOException), PHI: r9 
      PHI: (r9v1 'th' java.lang.String) = (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v0 java.lang.String), (r9v3 java.lang.String), (r9v0 java.lang.String) binds: [B:1:0x0016, B:2:?, B:3:0x0018, B:10:0x002d, B:15:0x013a, B:28:0x0254, B:20:0x01d1] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0016] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo507a(ListView r28, String r29, double r30, String r32, String r33) {
        /*
            r27 = this;
            r8 = r27
            r1 = r29
            java.lang.String r9 = "PDFCreator"
            java.lang.String r10 = "L"
            java.lang.String r11 = ""
            com.itextpdf.text.Document r12 = new com.itextpdf.text.Document
            r12.<init>()
            java.text.DecimalFormat r2 = new java.text.DecimalFormat
            java.lang.String r3 = "0.00"
            r2.<init>(r3)
            java.lang.String r2 = f441a     // Catch:{ DocumentException -> 0x0509, IOException -> 0x04ee }
            java.io.File r3 = new java.io.File     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r3.<init>(r2)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            boolean r2 = r3.exists()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            if (r2 != 0) goto L_0x002d
            r3.mkdirs()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            goto L_0x002d
        L_0x0027:
            r0 = move-exception
            r1 = r0
            r26 = r9
            goto L_0x04f2
        L_0x002d:
            java.io.File r2 = new java.io.File     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r4.<init>()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r4.append(r1)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r5 = ".pdf"
            r4.append(r5)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r4 = r4.toString()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r2.<init>(r3, r4)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r3.<init>(r2)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r2 = "assets/fonts/Tahoma.ttf"
            java.lang.String r4 = "Identity-H"
            r13 = 1
            com.itextpdf.text.pdf.BaseFont r2 = com.itextpdf.text.pdf.BaseFont.createFont(r2, r4, r13)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            com.itextpdf.text.Font r14 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r4 = 1094713344(0x41400000, float:12.0)
            r14.<init>(r2, r4)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            com.itextpdf.text.Font r5 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            com.itextpdf.text.BaseColor r6 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r15 = 0
            r6.<init>(r15, r15, r15)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r5.<init>(r2, r4, r13, r6)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            com.itextpdf.text.Font r7 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            com.itextpdf.text.BaseColor r4 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r5 = 255(0xff, float:3.57E-43)
            r4.<init>(r15, r15, r5)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r6 = 1095761920(0x41500000, float:13.0)
            r7.<init>(r2, r6, r13, r4)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            com.itextpdf.text.Font r4 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            com.itextpdf.text.BaseColor r6 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r6.<init>(r5, r15, r15)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r5 = 1095761920(0x41500000, float:13.0)
            r4.<init>(r2, r5, r13, r6)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            com.itextpdf.text.Font r4 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            com.itextpdf.text.BaseColor r6 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r5 = 255(0xff, float:3.57E-43)
            r6.<init>(r15, r5, r15)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r15 = 1095761920(0x41500000, float:13.0)
            r4.<init>(r2, r15, r13, r6)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            com.itextpdf.text.Font r6 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            com.itextpdf.text.BaseColor r4 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r4.<init>(r5, r5, r5)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r6.<init>(r2, r15, r13, r4)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            android.content.Context r2 = r8.f478w     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            android.content.SharedPreferences r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r4 = "prefUsername"
            java.lang.String r4 = r2.getString(r4, r11)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r8.f480y = r4     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r4 = "prefAddress"
            java.lang.String r4 = r2.getString(r4, r11)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r8.f462A = r4     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r4 = "prefPhone"
            java.lang.String r4 = r2.getString(r4, r11)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r8.f464C = r4     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r4 = "prefPrintUser"
            r5 = 0
            boolean r4 = r2.getBoolean(r4, r5)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r8.f467F = r4     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r4 = "prefPrintDate"
            boolean r4 = r2.getBoolean(r4, r5)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r8.f468G = r4     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r4 = "prefSyncFrequency"
            java.lang.String r5 = "1"
            java.lang.String r2 = r2.getString(r4, r5)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r8.f466E = r2     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r2 = "ImageDecode"
            java.lang.String r4 = "0"
            java.lang.String r2 = r8.mo609q(r2, r4)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r8.f465D = r2     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            com.itextpdf.text.pdf.PdfWriter r2 = com.itextpdf.text.pdf.PdfWriter.getInstance(r12, r3)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            JU$a r3 = new JU$a     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r3.<init>()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r2.setPageEvent(r3)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r12.open()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            com.itextpdf.text.Rectangle r2 = com.itextpdf.text.PageSize.A4     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r12.setPageSize(r2)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            com.itextpdf.text.Paragraph r15 = new com.itextpdf.text.Paragraph     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r15.<init>(r11)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r15.setAlignment(r13)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r2 = 5
            float[] r3 = new float[r2]     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r4 = 1075838976(0x40200000, float:2.5)
            r5 = 0
            r3[r5] = r4     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r5 = 1073741824(0x40000000, float:2.0)
            r3[r13] = r5     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r16 = 2
            r3[r16] = r5     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r18 = 1086324736(0x40c00000, float:6.0)
            r19 = 3
            r3[r19] = r18     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r18 = 4
            r3[r18] = r4     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r27.mo466K()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r5 = f457q     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r13 = "R"
            boolean r5 = r5.equals(r13)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            if (r5 == 0) goto L_0x013a
            float[] r3 = new float[r2]     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            r2 = 0
            r3[r2] = r4     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            r2 = 1086324736(0x40c00000, float:6.0)
            r5 = 1
            r3[r5] = r2     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            r2 = 1073741824(0x40000000, float:2.0)
            r3[r16] = r2     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            r3[r19] = r2     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            r2 = 4
            r3[r2] = r4     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
        L_0x013a:
            com.itextpdf.text.pdf.PdfPTable r13 = new com.itextpdf.text.pdf.PdfPTable     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r13.<init>(r3)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r2 = 1120403456(0x42c80000, float:100.0)
            r13.setWidthPercentage(r2)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r2.<init>()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            android.content.Context r3 = r8.f478w     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r4 = 2131755151(0x7f10008f, float:1.9141173E38)
            java.lang.String r3 = r3.getString(r4)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r2.append(r3)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r2.append(r1)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r4 = r2.toString()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r16 = 5
            r1 = r27
            r2 = r7
            r3 = r14
            r5 = r32
            r18 = r6
            r6 = r33
            r19 = r7
            r7 = r16
            com.itextpdf.text.pdf.PdfPCell r1 = r1.mo495a(r2, r3, r4, r5, r6, r7)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r13.addCell(r1)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r1 = f457q     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            boolean r1 = r1.equals(r10)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            if (r1 == 0) goto L_0x01d1
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            r2 = 2131755409(0x7f100191, float:1.9141696E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            java.lang.String r3 = r27.mo597m()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            java.lang.String r3 = r27.mo455E()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            r2 = 2131755415(0x7f100197, float:1.9141709E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            r4 = 0
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            r2 = 2131755411(0x7f100193, float:1.91417E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            r4 = 0
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x0027 }
            goto L_0x0226
        L_0x01d1:
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r2 = 2131755411(0x7f100193, float:1.91417E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r4 = 2
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r2 = 2131755415(0x7f100197, float:1.9141709E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r4 = 2
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r3 = r27.mo455E()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r3 = r27.mo597m()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r2 = 2131755409(0x7f100191, float:1.9141696E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
        L_0x0226:
            int r1 = r8.f466E     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r2 = 1
            int r1 = r1 + r2
            r13.setHeaderRows(r1)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r20 = 0
            r22 = r20
            r24 = r22
            r7 = 0
        L_0x0234:
            android.widget.ListAdapter r1 = r28.getAdapter()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            int r1 = r1.getCount()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            if (r7 >= r1) goto L_0x0367
            android.widget.ListAdapter r1 = r28.getAdapter()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.Object r1 = r1.getItem(r7)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r16 = r1
            LL r16 = (p000.C0232LL) r16     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r1 = f457q     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            boolean r1 = r1.equals(r10)     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            java.lang.String r6 = ","
            if (r1 == 0) goto L_0x02dc
            java.lang.String r3 = r16.mo770c()     // Catch:{ DocumentException -> 0x04e7, IOException -> 0x04ee }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r26 = r9
            r9 = r6
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            int r1 = r16.mo780k()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            int[] r2 = r8.f479x     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r3 = 0
            r2 = r2[r3]     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            if (r1 != r2) goto L_0x0297
            java.lang.String r3 = r16.mo775f()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r3 = "0"
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r18
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r16.mo775f()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r1.replaceAll(r9, r11)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            double r22 = r22 + r1
            goto L_0x02be
        L_0x0297:
            java.lang.String r3 = "0"
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r18
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r3 = r16.mo775f()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r16.mo775f()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r1.replaceAll(r9, r11)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            double r24 = r24 + r1
        L_0x02be:
            java.lang.String r3 = r16.mo779j()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 0
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r3 = r16.mo777h()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 0
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r17 = 0
            goto L_0x0361
        L_0x02dc:
            r26 = r9
            r9 = r6
            java.lang.String r3 = r16.mo777h()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 2
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r3 = r16.mo779j()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 2
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            int r1 = r16.mo780k()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            int[] r2 = r8.f479x     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r17 = 0
            r2 = r2[r17]     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            if (r1 != r2) goto L_0x032d
            java.lang.String r3 = "0"
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r18
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r3 = r16.mo775f()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r16.mo775f()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r1.replaceAll(r9, r11)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            double r22 = r22 + r1
            goto L_0x0354
        L_0x032d:
            java.lang.String r3 = r16.mo775f()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r3 = "0"
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r18
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r16.mo775f()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r1.replaceAll(r9, r11)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            double r24 = r24 + r1
        L_0x0354:
            java.lang.String r3 = r16.mo770c()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
        L_0x0361:
            int r7 = r7 + 1
            r9 = r26
            goto L_0x0234
        L_0x0367:
            r26 = r9
            java.lang.String r1 = f457q     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            boolean r1 = r1.equals(r10)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            if (r1 == 0) goto L_0x03b5
            java.lang.String r3 = "-"
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r18
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = java.lang.String.valueOf(r22)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r3 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = java.lang.String.valueOf(r24)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r3 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r2 = 2131755405(0x7f10018d, float:1.9141688E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 0
            r5 = 2
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            goto L_0x03f8
        L_0x03b5:
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r2 = 2131755405(0x7f10018d, float:1.9141688E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 2
            r5 = 2
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = java.lang.String.valueOf(r24)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r3 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = java.lang.String.valueOf(r22)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r3 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r3 = "-"
            r4 = 1
            r5 = 1
            r1 = r27
            r2 = r13
            r6 = r18
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
        L_0x03f8:
            java.lang.String r1 = f457q     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            boolean r1 = r1.equals(r10)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            if (r1 == 0) goto L_0x045a
            int r1 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r1 < 0) goto L_0x0438
            double r1 = java.lang.Math.abs(r30)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r2 = 1
            r3 = 3
            r28 = r27
            r29 = r13
            r30 = r1
            r31 = r2
            r32 = r3
            r33 = r19
            r28.mo510a(r29, r30, r31, r32, r33)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r27.mo456F()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
        L_0x0425:
            r2 = 0
            r3 = 2
            r28 = r27
            r29 = r13
            r30 = r1
            r31 = r2
            r32 = r3
            r33 = r19
            r28.mo510a(r29, r30, r31, r32, r33)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            goto L_0x04a5
        L_0x0438:
            double r1 = java.lang.Math.abs(r30)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r2 = 1
            r3 = 3
            r28 = r27
            r29 = r13
            r30 = r1
            r31 = r2
            r32 = r3
            r33 = r19
            r28.mo510a(r29, r30, r31, r32, r33)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r27.mo601n()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            goto L_0x0425
        L_0x045a:
            int r1 = (r30 > r20 ? 1 : (r30 == r20 ? 0 : -1))
            if (r1 < 0) goto L_0x048a
            java.lang.String r3 = r27.mo456F()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 2
            r5 = 2
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            double r1 = java.lang.Math.abs(r30)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
        L_0x0478:
            r2 = 1
            r3 = 3
            r28 = r27
            r29 = r13
            r30 = r1
            r31 = r2
            r32 = r3
            r33 = r19
            r28.mo510a(r29, r30, r31, r32, r33)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            goto L_0x04a5
        L_0x048a:
            java.lang.String r3 = r27.mo601n()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 0
            r5 = 2
            r1 = r27
            r2 = r13
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            double r1 = java.lang.Math.abs(r30)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            goto L_0x0478
        L_0x04a5:
            java.lang.String r1 = "pref_print_remarks"
            java.lang.String r1 = r8.mo609q(r1, r11)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r1 = r1.trim()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            int r1 = r1.length()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            if (r1 == 0) goto L_0x04d6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r1.<init>()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r2 = "* "
            r1.append(r2)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r2 = "pref_print_remarks"
            java.lang.String r2 = r8.mo609q(r2, r11)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r1.append(r2)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            java.lang.String r3 = r1.toString()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r4 = 0
            r5 = 5
            r7 = 1
            r1 = r27
            r2 = r13
            r6 = r14
            r1.mo513a(r2, r3, r4, r5, r6, r7)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
        L_0x04d6:
            r15.add(r13)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r12.add(r15)     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            r12.close()     // Catch:{ DocumentException -> 0x04e2, IOException -> 0x04e0 }
            goto L_0x051e
        L_0x04e0:
            r0 = move-exception
            goto L_0x04f1
        L_0x04e2:
            r0 = move-exception
            r1 = r0
            r2 = r26
            goto L_0x050c
        L_0x04e7:
            r0 = move-exception
            r1 = r0
            r2 = r9
            goto L_0x050c
        L_0x04eb:
            r0 = move-exception
            r1 = r0
            goto L_0x051f
        L_0x04ee:
            r0 = move-exception
            r26 = r9
        L_0x04f1:
            r1 = r0
        L_0x04f2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x04eb }
            r2.<init>()     // Catch:{ all -> 0x04eb }
            java.lang.String r3 = "ioException:"
            r2.append(r3)     // Catch:{ all -> 0x04eb }
            r2.append(r1)     // Catch:{ all -> 0x04eb }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x04eb }
            r2 = r26
        L_0x0505:
            android.util.Log.e(r2, r1)     // Catch:{ all -> 0x04eb }
            goto L_0x051e
        L_0x0509:
            r0 = move-exception
            r2 = r9
            r1 = r0
        L_0x050c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x04eb }
            r3.<init>()     // Catch:{ all -> 0x04eb }
            java.lang.String r4 = "DocumentException:"
            r3.append(r4)     // Catch:{ all -> 0x04eb }
            r3.append(r1)     // Catch:{ all -> 0x04eb }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x04eb }
            goto L_0x0505
        L_0x051e:
            return
        L_0x051f:
            goto L_0x0521
        L_0x0520:
            throw r1
        L_0x0521:
            goto L_0x0520
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo507a(android.widget.ListView, java.lang.String, double, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x050c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x050d, code lost:
        r1 = r0;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0510, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0511, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0513, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x052e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x052f, code lost:
        r2 = r10;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0545, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x050c A[ExcHandler: DocumentException (r0v4 'e' com.itextpdf.text.DocumentException A[CUSTOM_DECLARE]), PHI: r10 
      PHI: (r10v2 java.lang.String) = (r10v0 java.lang.String), (r10v0 java.lang.String), (r10v0 java.lang.String), (r10v3 'th' java.lang.String), (r10v3 'th' java.lang.String), (r10v3 'th' java.lang.String), (r10v0 java.lang.String), (r10v0 java.lang.String), (r10v0 java.lang.String), (r10v0 java.lang.String), (r10v0 java.lang.String), (r10v0 java.lang.String), (r10v0 java.lang.String) binds: [B:3:0x001a, B:10:0x002f, B:16:0x014a, B:29:0x0267, B:30:?, B:32:0x0285, B:21:0x01e4, B:19:0x018e, B:20:?, B:13:0x0132, B:14:?, B:6:0x0025, B:7:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:10:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0513 A[ExcHandler: IOException (e java.io.IOException), PHI: r10 
      PHI: (r10v1 'th' java.lang.String) = (r10v0 java.lang.String), (r10v0 java.lang.String), (r10v0 java.lang.String), (r10v0 java.lang.String), (r10v0 java.lang.String), (r10v3 'th' java.lang.String), (r10v3 'th' java.lang.String), (r10v0 java.lang.String) binds: [B:1:0x0018, B:2:?, B:3:0x001a, B:10:0x002f, B:16:0x014a, B:29:0x0267, B:30:?, B:21:0x01e4] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0018] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo508a(ListView r29, String r30, double r31, String r33, String r34, String r35) {
        /*
            r28 = this;
            r8 = r28
            r1 = r30
            r9 = r33
            java.lang.String r10 = "PDFCreator"
            java.lang.String r11 = "L"
            java.lang.String r12 = ""
            com.itextpdf.text.Document r13 = new com.itextpdf.text.Document
            r13.<init>()
            java.text.DecimalFormat r2 = new java.text.DecimalFormat
            java.lang.String r3 = "0.00"
            r2.<init>(r3)
            java.lang.String r2 = f441a     // Catch:{ DocumentException -> 0x052e, IOException -> 0x0513 }
            java.io.File r3 = new java.io.File     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r3.<init>(r2)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            boolean r2 = r3.exists()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            if (r2 != 0) goto L_0x002f
            r3.mkdirs()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            goto L_0x002f
        L_0x0029:
            r0 = move-exception
            r1 = r0
            r27 = r10
            goto L_0x0517
        L_0x002f:
            java.io.File r2 = new java.io.File     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r4.<init>()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r4.append(r1)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r5 = ".pdf"
            r4.append(r5)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r4 = r4.toString()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r2.<init>(r3, r4)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r3.<init>(r2)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r2 = "assets/fonts/Tahoma.ttf"
            java.lang.String r4 = "Identity-H"
            r14 = 1
            com.itextpdf.text.pdf.BaseFont r2 = com.itextpdf.text.pdf.BaseFont.createFont(r2, r4, r14)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            com.itextpdf.text.Font r15 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r4 = 1094713344(0x41400000, float:12.0)
            r15.<init>(r2, r4)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            com.itextpdf.text.Font r5 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            com.itextpdf.text.BaseColor r6 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r7 = 0
            r6.<init>(r7, r7, r7)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r5.<init>(r2, r4, r14, r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            com.itextpdf.text.Font r6 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            com.itextpdf.text.BaseColor r4 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r5 = 255(0xff, float:3.57E-43)
            r4.<init>(r7, r7, r5)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r5 = 1095761920(0x41500000, float:13.0)
            r6.<init>(r2, r5, r14, r4)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            com.itextpdf.text.Font r4 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            com.itextpdf.text.BaseColor r5 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r14 = 255(0xff, float:3.57E-43)
            r5.<init>(r14, r7, r7)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r7 = 1095761920(0x41500000, float:13.0)
            r14 = 1
            r4.<init>(r2, r7, r14, r5)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            com.itextpdf.text.Font r4 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            com.itextpdf.text.BaseColor r5 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r7 = 255(0xff, float:3.57E-43)
            r14 = 0
            r5.<init>(r14, r7, r14)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r7 = 1
            r14 = 1095761920(0x41500000, float:13.0)
            r4.<init>(r2, r14, r7, r5)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            com.itextpdf.text.Font r5 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            com.itextpdf.text.BaseColor r4 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r7 = 255(0xff, float:3.57E-43)
            r4.<init>(r7, r7, r7)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r7 = 1
            r5.<init>(r2, r14, r7, r4)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            android.content.Context r2 = r8.f478w     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            android.content.SharedPreferences r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r4 = "prefUsername"
            java.lang.String r4 = r2.getString(r4, r12)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r8.f480y = r4     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r4 = "prefAddress"
            java.lang.String r4 = r2.getString(r4, r12)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r8.f462A = r4     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r4 = "prefPhone"
            java.lang.String r4 = r2.getString(r4, r12)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r8.f464C = r4     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r4 = "prefPrintUser"
            r7 = 0
            boolean r4 = r2.getBoolean(r4, r7)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r8.f467F = r4     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r4 = "prefPrintDate"
            boolean r4 = r2.getBoolean(r4, r7)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r8.f468G = r4     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r4 = "prefSyncFrequency"
            java.lang.String r7 = "1"
            java.lang.String r2 = r2.getString(r4, r7)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r8.f466E = r2     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r2 = "ImageDecode"
            java.lang.String r4 = "0"
            java.lang.String r2 = r8.mo609q(r2, r4)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r8.f465D = r2     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            com.itextpdf.text.pdf.PdfWriter r2 = com.itextpdf.text.pdf.PdfWriter.getInstance(r13, r3)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            JU$a r3 = new JU$a     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r3.<init>()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r2.setPageEvent(r3)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r13.open()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            com.itextpdf.text.Rectangle r2 = com.itextpdf.text.PageSize.A4     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r13.setPageSize(r2)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            com.itextpdf.text.Paragraph r14 = new com.itextpdf.text.Paragraph     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r14.<init>(r12)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r2 = 1
            r14.setAlignment(r2)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r3 = 5
            float[] r4 = new float[r3]     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r7 = 1075838976(0x40200000, float:2.5)
            r16 = 0
            r4[r16] = r7     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r17 = 1073741824(0x40000000, float:2.0)
            r4[r2] = r17     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r2 = 2
            r4[r2] = r17     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r19 = 3
            r20 = 1086324736(0x40c00000, float:6.0)
            r4[r19] = r20     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r19 = 4
            r4[r19] = r7     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r28.mo466K()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r2 = f457q     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r7 = "R"
            boolean r2 = r2.equals(r7)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            if (r2 == 0) goto L_0x0149
            float[] r4 = new float[r3]     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r2 = 1075838976(0x40200000, float:2.5)
            r7 = 0
            r4[r7] = r2     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r3 = 1086324736(0x40c00000, float:6.0)
            r16 = 1
            r4[r16] = r3     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r3 = 2
            r4[r3] = r17     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r3 = 3
            r4[r3] = r17     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r3 = 4
            r4[r3] = r2     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            goto L_0x014a
        L_0x0149:
            r7 = 0
        L_0x014a:
            com.itextpdf.text.pdf.PdfPTable r3 = new com.itextpdf.text.pdf.PdfPTable     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r3.<init>(r4)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r2 = 1120403456(0x42c80000, float:100.0)
            r3.setWidthPercentage(r2)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r2.<init>()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            android.content.Context r4 = r8.f478w     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r7 = 2131755151(0x7f10008f, float:1.9141173E38)
            java.lang.String r4 = r4.getString(r7)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r2.append(r4)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r2.append(r1)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r4 = r2.toString()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r7 = 5
            r1 = r28
            r2 = r6
            r21 = r3
            r3 = r15
            r17 = r5
            r5 = r34
            r19 = r6
            r6 = r35
            r16 = 0
            com.itextpdf.text.pdf.PdfPCell r1 = r1.mo495a(r2, r3, r4, r5, r6, r7)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r7 = r21
            r7.addCell(r1)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r1 = f457q     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            boolean r1 = r1.equals(r11)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            if (r1 == 0) goto L_0x01e4
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r2 = 2131755409(0x7f100191, float:1.9141696E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            java.lang.String r3 = r28.mo597m()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            java.lang.String r3 = r28.mo455E()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r2 = 2131755415(0x7f100197, float:1.9141709E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r4 = 0
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r2 = 2131755411(0x7f100193, float:1.91417E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r4 = 0
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            goto L_0x0239
        L_0x01e4:
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r2 = 2131755411(0x7f100193, float:1.91417E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r4 = 2
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r2 = 2131755415(0x7f100197, float:1.9141709E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r4 = 2
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r3 = r28.mo455E()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r3 = r28.mo597m()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r2 = 2131755409(0x7f100191, float:1.9141696E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
        L_0x0239:
            int r1 = r8.f466E     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r2 = 1
            int r1 = r1 + r2
            r7.setHeaderRows(r1)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r20 = 0
            r22 = r20
            r24 = r22
            r6 = 0
        L_0x0247:
            android.widget.ListAdapter r1 = r29.getAdapter()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            int r1 = r1.getCount()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            if (r6 >= r1) goto L_0x0384
            android.widget.ListAdapter r1 = r29.getAdapter()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.Object r1 = r1.getItem(r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r18 = r1
            LL r18 = (p000.C0232LL) r18     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r1 = f457q     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            boolean r1 = r1.equals(r11)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            java.lang.String r5 = ","
            if (r1 == 0) goto L_0x02f9
            java.lang.String r3 = r18.mo770c()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r4 = 1
            r26 = 1
            r1 = r28
            r2 = r7
            r27 = r5
            r5 = r26
            r26 = r6
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            int r1 = r18.mo780k()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            int[] r2 = r8.f479x     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            r2 = r2[r16]     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0513 }
            if (r1 != r2) goto L_0x02b1
            java.lang.String r3 = r18.mo775f()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            java.lang.String r3 = "0"
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r17
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            java.lang.String r1 = r18.mo775f()     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            r6 = r27
            java.lang.String r1 = r1.replaceAll(r6, r12)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ DocumentException -> 0x050c, IOException -> 0x0029 }
            double r22 = r22 + r1
            r27 = r10
            goto L_0x02dd
        L_0x02b1:
            r6 = r27
            java.lang.String r3 = "0"
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r27 = r10
            r10 = r6
            r6 = r17
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r3 = r18.mo775f()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = r18.mo775f()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = r1.replaceAll(r10, r12)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            double r24 = r24 + r1
        L_0x02dd:
            java.lang.String r3 = r18.mo779j()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r4 = 0
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r3 = r18.mo777h()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r4 = 0
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            goto L_0x037e
        L_0x02f9:
            r26 = r6
            r27 = r10
            r10 = r5
            java.lang.String r3 = r18.mo777h()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r4 = 2
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r3 = r18.mo779j()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r4 = 2
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            int r1 = r18.mo780k()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            int[] r2 = r8.f479x     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r2 = r2[r16]     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            if (r1 != r2) goto L_0x034a
            java.lang.String r3 = "0"
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r17
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r3 = r18.mo775f()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = r18.mo775f()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = r1.replaceAll(r10, r12)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            double r22 = r22 + r1
            goto L_0x0371
        L_0x034a:
            java.lang.String r3 = r18.mo775f()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r3 = "0"
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r17
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = r18.mo775f()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = r1.replaceAll(r10, r12)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            double r24 = r24 + r1
        L_0x0371:
            java.lang.String r3 = r18.mo770c()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
        L_0x037e:
            int r6 = r26 + 1
            r10 = r27
            goto L_0x0247
        L_0x0384:
            r27 = r10
            java.lang.String r3 = "-"
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r17
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = java.lang.String.valueOf(r22)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r3 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = java.lang.String.valueOf(r24)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r3 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r2 = 2131755405(0x7f10018d, float:1.9141688E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r4 = 0
            r5 = 2
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = f457q     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            boolean r1 = r1.equals(r11)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r10 = " "
            if (r1 == 0) goto L_0x0451
            int r1 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r1 < 0) goto L_0x041d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.<init>()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            double r2 = java.lang.Math.abs(r31)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r2 = r8.mo448B(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.append(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.append(r10)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.append(r9)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = r1.toString()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r2 = 1
            r3 = 3
            r29 = r28
            r30 = r7
            r31 = r1
            r32 = r2
            r33 = r3
            r34 = r19
            r29.mo510a(r30, r31, r32, r33, r34)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = r28.mo456F()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
        L_0x040a:
            r2 = 0
            r3 = 2
            r29 = r28
            r30 = r7
            r31 = r1
            r32 = r2
            r33 = r3
            r34 = r19
            r29.mo510a(r30, r31, r32, r33, r34)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            goto L_0x04c0
        L_0x041d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.<init>()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            double r2 = java.lang.Math.abs(r31)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r2 = r8.mo448B(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.append(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.append(r10)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.append(r9)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = r1.toString()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r2 = 1
            r3 = 3
            r29 = r28
            r30 = r7
            r31 = r1
            r32 = r2
            r33 = r3
            r34 = r19
            r29.mo510a(r30, r31, r32, r33, r34)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = r28.mo601n()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            goto L_0x040a
        L_0x0451:
            int r1 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r1 < 0) goto L_0x0493
            java.lang.String r3 = r28.mo456F()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r4 = 0
            r5 = 2
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.<init>()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            double r2 = java.lang.Math.abs(r31)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r2 = r8.mo448B(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.append(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.append(r10)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.append(r9)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = r1.toString()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
        L_0x0481:
            r2 = 1
            r3 = 3
            r29 = r28
            r30 = r7
            r31 = r1
            r32 = r2
            r33 = r3
            r34 = r19
            r29.mo510a(r30, r31, r32, r33, r34)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            goto L_0x04c0
        L_0x0493:
            java.lang.String r3 = r28.mo601n()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r4 = 0
            r5 = 2
            r1 = r28
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.<init>()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            double r2 = java.lang.Math.abs(r31)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r2 = r8.mo448B(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.append(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.append(r10)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.append(r9)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = r1.toString()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            goto L_0x0481
        L_0x04c0:
            java.lang.String r1 = "pref_print_remarks"
            java.lang.String r1 = r8.mo609q(r1, r12)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = r1.trim()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            int r1 = r1.length()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            if (r1 == 0) goto L_0x04fb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.<init>()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r2 = "* "
            r1.append(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r2 = "pref_print_remarks"
            java.lang.String r2 = r8.mo609q(r2, r12)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r1.append(r2)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            java.lang.String r1 = r1.toString()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r2 = 0
            r3 = 5
            r4 = 1
            r29 = r28
            r30 = r7
            r31 = r1
            r32 = r2
            r33 = r3
            r34 = r15
            r35 = r4
            r29.mo513a(r30, r31, r32, r33, r34, r35)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
        L_0x04fb:
            r14.add(r7)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r13.add(r14)     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            r13.close()     // Catch:{ DocumentException -> 0x0507, IOException -> 0x0505 }
            goto L_0x0543
        L_0x0505:
            r0 = move-exception
            goto L_0x0516
        L_0x0507:
            r0 = move-exception
            r1 = r0
            r2 = r27
            goto L_0x0531
        L_0x050c:
            r0 = move-exception
            r1 = r0
            r2 = r10
            goto L_0x0531
        L_0x0510:
            r0 = move-exception
            r1 = r0
            goto L_0x0544
        L_0x0513:
            r0 = move-exception
            r27 = r10
        L_0x0516:
            r1 = r0
        L_0x0517:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0510 }
            r2.<init>()     // Catch:{ all -> 0x0510 }
            java.lang.String r3 = "ioException:"
            r2.append(r3)     // Catch:{ all -> 0x0510 }
            r2.append(r1)     // Catch:{ all -> 0x0510 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0510 }
            r2 = r27
        L_0x052a:
            android.util.Log.e(r2, r1)     // Catch:{ all -> 0x0510 }
            goto L_0x0543
        L_0x052e:
            r0 = move-exception
            r2 = r10
            r1 = r0
        L_0x0531:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0510 }
            r3.<init>()     // Catch:{ all -> 0x0510 }
            java.lang.String r4 = "DocumentException:"
            r3.append(r4)     // Catch:{ all -> 0x0510 }
            r3.append(r1)     // Catch:{ all -> 0x0510 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0510 }
            goto L_0x052a
        L_0x0543:
            return
        L_0x0544:
            goto L_0x0546
        L_0x0545:
            throw r1
        L_0x0546:
            goto L_0x0545
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo508a(android.widget.ListView, java.lang.String, double, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public void mo509a(RadioButton radioButton, RadioButton radioButton2) {
        radioButton.setText(mo609q("pref_credit", this.f478w.getString(2131755144)));
        radioButton2.setText(mo609q("pref_debit", this.f478w.getString(2131755162)));
    }

    /* renamed from: a */
    public final void mo510a(PdfPTable pdfPTable, String str, int i, int i2, Font font) {
        PdfPCell pdfPCell = new PdfPCell(new Phrase(str.trim(), font));
        pdfPCell.setRunDirection(3);
        pdfPCell.setHorizontalAlignment(i);
        pdfPCell.setVerticalAlignment(5);
        pdfPCell.setPadding(5.0f);
        pdfPCell.setColspan(i2);
        String str2 = "";
        if (str.trim().equalsIgnoreCase(str2)) {
            pdfPCell.setMinimumHeight(10.0f);
            pdfPCell.setBorder(0);
        } else if (str.trim().equalsIgnoreCase("#")) {
            pdfPCell.setPhrase(new Phrase(str2, font));
        }
        pdfPTable.addCell(pdfPCell);
    }

    /* renamed from: a */
    public final void mo511a(PdfPTable pdfPTable, String str, int i, int i2, Font font, int i3) {
        Image image;
        Bitmap bitmap = ((BitmapDrawable) this.f478w.getResources().getDrawable(i3)).getBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        try {
            image = Image.getInstance(byteArrayOutputStream.toByteArray());
        } catch (BadElementException | IOException unused) {
            image = null;
        }
        image.scaleToFit(12.0f, 10.0f);
        image.setAlignment(5);
        PdfPCell pdfPCell = new PdfPCell(image);
        pdfPCell.setRunDirection(3);
        pdfPCell.setHorizontalAlignment(i);
        pdfPCell.setVerticalAlignment(5);
        pdfPCell.setColspan(i2);
        pdfPTable.addCell(pdfPCell);
    }

    /* renamed from: a */
    public final void mo512a(PdfPTable pdfPTable, String str, int i, int i2, Font font, String str2) {
        Image image;
        Bitmap c = m424c(str2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        try {
            image = Image.getInstance(byteArrayOutputStream.toByteArray());
        } catch (BadElementException | IOException unused) {
            image = null;
        }
        image.scaleToFit(80.0f, 80.0f);
        image.setAlignment(5);
        PdfPCell pdfPCell = new PdfPCell(image);
        pdfPCell.setRunDirection(3);
        pdfPCell.setHorizontalAlignment(i);
        pdfPCell.setVerticalAlignment(5);
        pdfPCell.setRowspan(i2);
        pdfPCell.setBorder(0);
        pdfPTable.addCell(pdfPCell);
    }

    /* renamed from: a */
    public final void mo513a(PdfPTable pdfPTable, String str, int i, int i2, Font font, boolean z) {
        PdfPCell pdfPCell = new PdfPCell(new Phrase(str.trim(), font));
        pdfPCell.setRunDirection(3);
        pdfPCell.setHorizontalAlignment(i);
        pdfPCell.setVerticalAlignment(5);
        pdfPCell.setPadding(5.0f);
        pdfPCell.setColspan(i2);
        if (str.trim().equalsIgnoreCase("")) {
            pdfPCell.setMinimumHeight(10.0f);
            pdfPCell.setBorder(0);
        }
        if (z) {
            pdfPCell.setBorder(0);
        }
        pdfPTable.addCell(pdfPCell);
    }

    /* renamed from: a */
    public final void mo514a(PdfPTable pdfPTable, String str, String str2, int i, int i2, Font font, Font font2) {
        PdfPCell pdfPCell = new PdfPCell();
        Phrase phrase = new Phrase();
        phrase.add(new Chunk(str, font));
        phrase.add(new Chunk(str2, font2));
        Paragraph paragraph = new Paragraph();
        paragraph.add(phrase);
        paragraph.setAlignment(i);
        pdfPCell.addElement(paragraph);
        pdfPCell.setRunDirection(3);
        pdfPCell.setHorizontalAlignment(i);
        pdfPCell.setVerticalAlignment(5);
        pdfPCell.setPadding(5.0f);
        pdfPCell.setColspan(i2);
        if (str.trim().equalsIgnoreCase("")) {
            pdfPCell.setMinimumHeight(10.0f);
            pdfPCell.setBorder(0);
        }
        pdfPTable.addCell(pdfPCell);
    }

    /* renamed from: a */
    public void mo515a(String str) {
        String str2 = "'";
        this.f477v.beginTransaction();
        try {
            SQLiteDatabase sQLiteDatabase = this.f477v;
            StringBuilder sb = new StringBuilder();
            sb.append("delete from customers where id='");
            sb.append(str);
            sb.append(str2);
            sQLiteDatabase.execSQL(sb.toString());
            SQLiteDatabase sQLiteDatabase2 = this.f477v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("delete from transactions where cus_id='");
            sb2.append(str);
            sb2.append("' or t_cus_id='");
            sb2.append(str);
            sb2.append(str2);
            sQLiteDatabase2.execSQL(sb2.toString());
            this.f477v.setTransactionSuccessful();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f477v.endTransaction();
            throw th;
        }
        this.f477v.endTransaction();
    }

    /* renamed from: a */
    public void mo516a(String str, String str2) {
        String str3 = "0";
        String str4 = "PREF_ACCOUNT_NAME";
        if (str.length() != 0) {
            try {
                if (!mo524a("prefAutoSMS_API", false) || (!mo609q(str4, str3).equals("nv.q@hotmail.com") && !mo609q(str4, str3).equals("ahmed0598831095@gmail.com") && !mo609q(str4, str3).equals("engmogh@gmail.com"))) {
                    SmsManager smsManager = SmsManager.getDefault();
                    smsManager.sendMultipartTextMessage(str, null, smsManager.divideMessage(str2), null, null);
                    return;
                }
                mo504a(this.f478w, str, str2);
            } catch (Exception e) {
                Log.d("auto_sms=", e.getMessage());
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo517a(String str, String str2, String str3, String str4) {
        String str5 = "'  and curr_id=ifnull((select d.id from currency d where d.name='";
        this.f477v.beginTransaction();
        try {
            SQLiteDatabase sQLiteDatabase = this.f477v;
            StringBuilder sb = new StringBuilder();
            sb.append("insert into transactions (cus_id,out,[in],remarks,date_,curr_id)select  cus_id, abs(sum([in]*out)) out, (case when sum([in]*out)>=0 then 1 else -1 end ) [in], '");
            sb.append(str2);
            sb.append("',strftime('%d-%m-%Y','");
            sb.append(str3);
            sb.append("'),curr_id  from transactions a  where a.cus_id='");
            sb.append(str);
            sb.append("' and a.t_cus_id is  null  and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) <= '");
            sb.append(str3);
            sb.append(str5);
            sb.append(str4);
            sb.append("' ),0) group by cus_id,curr_id");
            sQLiteDatabase.execSQL(sb.toString());
            SQLiteDatabase sQLiteDatabase2 = this.f477v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("delete   from  transactions   where cus_id='");
            sb2.append(str);
            sb2.append("' and t_cus_id is  null and date(strftime('%Y-%m-%d',substr(date_,7,4)||'-' ||substr(date_,4,2)||'-'||substr(date_,1,2) )) <= '");
            sb2.append(str3);
            sb2.append(str5);
            sb2.append(str4);
            sb2.append("' ),0) and id <>(select max(id) from transactions  where cus_id='");
            sb2.append(str);
            sb2.append(str5);
            sb2.append(str4);
            sb2.append("' ),0))");
            sQLiteDatabase2.execSQL(sb2.toString());
            this.f477v.setTransactionSuccessful();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f477v.endTransaction();
            throw th;
        }
        this.f477v.endTransaction();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x03fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x03fe, code lost:
        r1 = r0;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0401, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0402, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0404, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x041f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0420, code lost:
        r2 = r10;
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0436, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x03fd A[ExcHandler: DocumentException (r0v4 'e' com.itextpdf.text.DocumentException A[CUSTOM_DECLARE]), Splitter:B:3:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0404 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:1:0x0016] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo518a(List<p000.C0232LL> r26, String r27, double r28) {
        /*
            r25 = this;
            r8 = r25
            r9 = r27
            java.lang.String r7 = "0"
            java.lang.String r10 = "PDFCreator"
            java.lang.String r11 = ""
            com.itextpdf.text.Document r12 = new com.itextpdf.text.Document
            r12.<init>()
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "0.00"
            r1.<init>(r2)
            java.lang.String r1 = f441a     // Catch:{ DocumentException -> 0x041f, IOException -> 0x0404 }
            java.io.File r2 = new java.io.File     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r2.<init>(r1)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            boolean r1 = r2.exists()     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            if (r1 != 0) goto L_0x002d
            r2.mkdirs()     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0027 }
            goto L_0x002d
        L_0x0027:
            r0 = move-exception
            r1 = r0
            r20 = r10
            goto L_0x0408
        L_0x002d:
            java.io.File r1 = new java.io.File     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r3.<init>()     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r3.append(r9)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            java.lang.String r4 = ".pdf"
            r3.append(r4)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            java.lang.String r3 = r3.toString()     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r1.<init>(r2, r3)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r2.<init>(r1)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            java.lang.String r1 = "assets/fonts/Tahoma.ttf"
            java.lang.String r3 = "Identity-H"
            r13 = 1
            com.itextpdf.text.pdf.BaseFont r1 = com.itextpdf.text.pdf.BaseFont.createFont(r1, r3, r13)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.Font r14 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r3 = 1094713344(0x41400000, float:12.0)
            r14.<init>(r1, r3)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.Font r15 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.BaseColor r4 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r6 = 0
            r4.<init>(r6, r6, r6)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r15.<init>(r1, r3, r13, r4)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.Font r5 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.BaseColor r3 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r4 = 255(0xff, float:3.57E-43)
            r3.<init>(r6, r6, r4)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r4 = 1095761920(0x41500000, float:13.0)
            r5.<init>(r1, r4, r13, r3)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.Font r3 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.BaseColor r4 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r13 = 255(0xff, float:3.57E-43)
            r4.<init>(r13, r6, r6)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r6 = 1095761920(0x41500000, float:13.0)
            r13 = 1
            r3.<init>(r1, r6, r13, r4)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.Font r3 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.BaseColor r4 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r6 = 255(0xff, float:3.57E-43)
            r13 = 0
            r4.<init>(r13, r6, r13)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r6 = 1
            r13 = 1095761920(0x41500000, float:13.0)
            r3.<init>(r1, r13, r6, r4)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.Font r4 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.BaseColor r3 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r6 = 255(0xff, float:3.57E-43)
            r3.<init>(r6, r6, r6)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r6 = 1
            r4.<init>(r1, r13, r6, r3)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            android.content.SharedPreferences r1 = android.preference.PreferenceManager.getDefaultSharedPreferences(r1)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            java.lang.String r3 = "prefUsername"
            java.lang.String r3 = r1.getString(r3, r11)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r8.f480y = r3     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            java.lang.String r3 = "prefAddress"
            java.lang.String r3 = r1.getString(r3, r11)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r8.f462A = r3     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            java.lang.String r3 = "prefPhone"
            java.lang.String r3 = r1.getString(r3, r11)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r8.f464C = r3     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            java.lang.String r3 = "prefPrintUser"
            r6 = 0
            boolean r3 = r1.getBoolean(r3, r6)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r8.f467F = r3     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            java.lang.String r3 = "prefPrintDate"
            boolean r3 = r1.getBoolean(r3, r6)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r8.f468G = r3     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            java.lang.String r3 = "prefSyncFrequency"
            java.lang.String r6 = "1"
            java.lang.String r1 = r1.getString(r3, r6)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r8.f466E = r1     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            java.lang.String r1 = "ImageDecode"
            java.lang.String r1 = r8.mo609q(r1, r7)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r8.f465D = r1     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.pdf.PdfWriter r1 = com.itextpdf.text.pdf.PdfWriter.getInstance(r12, r2)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            JU$a r2 = new JU$a     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r2.<init>()     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r1.setPageEvent(r2)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r12.open()     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.Rectangle r1 = com.itextpdf.text.PageSize.A4     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r12.setPageSize(r1)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.Paragraph r13 = new com.itextpdf.text.Paragraph     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r13.<init>(r11)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r1 = 1
            r13.setAlignment(r1)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r6 = 5
            float[] r2 = new float[r6]     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r3 = 1075838976(0x40200000, float:2.5)
            r16 = 0
            r2[r16] = r3     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r17 = 1073741824(0x40000000, float:2.0)
            r2[r1] = r17     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r1 = 2
            r2[r1] = r17     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r19 = 1086324736(0x40c00000, float:6.0)
            r20 = 3
            r2[r20] = r19     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r21 = 4
            r2[r21] = r3     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            float[] r1 = new float[r6]     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r16 = 0
            r1[r16] = r3     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r18 = 1
            r1[r18] = r17     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r21 = 2
            r1[r21] = r17     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r1[r20] = r19     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r17 = 4
            r1[r17] = r3     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.pdf.PdfPTable r3 = new com.itextpdf.text.pdf.PdfPTable     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r3.<init>(r2)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            com.itextpdf.text.pdf.PdfPTable r2 = new com.itextpdf.text.pdf.PdfPTable     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r2.<init>(r1)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r1 = 1120403456(0x42c80000, float:100.0)
            r3.setWidthPercentage(r1)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r1 = 1120403456(0x42c80000, float:100.0)
            r2.setWidthPercentage(r1)     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r1 = 0
        L_0x014a:
            int r6 = r8.f466E     // Catch:{ DocumentException -> 0x03fd, IOException -> 0x0404 }
            r18 = 1
            int r6 = r6 + -1
            if (r1 >= r6) goto L_0x017d
            java.lang.String r6 = ""
            r19 = 0
            r20 = 5
            r21 = r1
            r1 = r25
            r22 = r2
            r23 = r3
            r3 = r6
            r24 = r4
            r4 = r19
            r19 = r5
            r5 = r20
            r20 = r10
            r10 = 5
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            int r1 = r21 + 1
            r5 = r19
            r10 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            goto L_0x014a
        L_0x017d:
            r22 = r2
            r23 = r3
            r24 = r4
            r19 = r5
            r20 = r10
            r10 = 5
            java.lang.Boolean r1 = r8.f467F     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            boolean r1 = r1.booleanValue()     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            if (r1 == 0) goto L_0x0224
            java.lang.String r1 = r8.f465D     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            boolean r1 = r1.equals(r7)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            if (r1 != 0) goto L_0x01c2
            java.lang.String r3 = ""
            r4 = 0
            r5 = 3
            r1 = r25
            r2 = r22
            r6 = r19
            r1.mo538b(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = ""
            r4 = 0
            r5 = 3
            r1 = r25
            r2 = r22
            r6 = r19
            r1.mo538b(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = ""
            r4 = 1
            r5 = 3
            java.lang.String r7 = r8.f465D     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r1 = r25
            r2 = r22
            r6 = r19
            r1.mo512a(r2, r3, r4, r5, r6, r7)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            goto L_0x01ec
        L_0x01c2:
            java.lang.String r3 = ""
            r4 = 0
            r5 = 3
            r1 = r25
            r2 = r22
            r6 = r19
            r1.mo538b(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = ""
            r4 = 0
            r5 = 3
            r1 = r25
            r2 = r22
            r6 = r19
            r1.mo538b(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = ""
            r4 = 1
            r5 = 3
            r7 = 2131623937(0x7f0e0001, float:1.887504E38)
            r1 = r25
            r2 = r22
            r6 = r19
            r1.mo539b(r2, r3, r4, r5, r6, r7)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
        L_0x01ec:
            java.lang.String r3 = r8.f480y     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 0
            r5 = 2
            r7 = 1
            r1 = r25
            r2 = r22
            r6 = r19
            r1.mo513a(r2, r3, r4, r5, r6, r7)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = r8.f462A     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 0
            r5 = 2
            r7 = 1
            r1 = r25
            r2 = r22
            r6 = r19
            r1.mo513a(r2, r3, r4, r5, r6, r7)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = r8.f464C     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 0
            r5 = 2
            r7 = 1
            r1 = r25
            r2 = r22
            r6 = r19
            r1.mo513a(r2, r3, r4, r5, r6, r7)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = ""
            r4 = 0
            r5 = 5
            r7 = 1
            r1 = r25
            r2 = r22
            r6 = r19
            r1.mo513a(r2, r3, r4, r5, r6, r7)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
        L_0x0224:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r1.<init>()     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            android.content.Context r2 = r8.f478w     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r3 = 2131755151(0x7f10008f, float:1.9141173E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r1.append(r2)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r1.append(r9)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = r1.toString()     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 1
            r5 = 5
            r1 = r25
            r2 = r22
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            com.itextpdf.text.pdf.PdfPCell r1 = new com.itextpdf.text.pdf.PdfPCell     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r2 = r22
            r1.<init>(r2)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r1.setColspan(r10)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r7 = r23
            r7.addCell(r1)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r2 = 2131755409(0x7f100191, float:1.9141696E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 1
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r2 = 2131755356(0x7f10015c, float:1.9141589E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 1
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r2 = 2131755357(0x7f10015d, float:1.914159E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 1
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r2 = 2131755415(0x7f100197, float:1.9141709E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 0
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r2 = 2131755411(0x7f100193, float:1.91417E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 0
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            int r1 = r8.f466E     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r2 = 1
            int r1 = r1 + r2
            r7.setHeaderRows(r1)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r9 = 0
            r17 = r9
            r21 = r17
            r15 = 0
        L_0x02c3:
            int r1 = r26.size()     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            if (r15 >= r1) goto L_0x035b
            r6 = r26
            java.lang.Object r1 = r6.get(r15)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r23 = r1
            LL r23 = (p000.C0232LL) r23     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = r23.mo770c()     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 1
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            int r1 = r23.mo780k()     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            int[] r2 = r8.f479x     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r2 = r2[r16]     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            if (r1 != r2) goto L_0x0314
            java.lang.String r3 = r23.mo775f()     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 1
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = "0"
            r4 = 1
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r24
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r1 = r23.mo775f()     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r2 = ","
            java.lang.String r1 = r1.replaceAll(r2, r11)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            double r17 = r17 + r1
            goto L_0x033d
        L_0x0314:
            java.lang.String r3 = "0"
            r4 = 1
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r24
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = r23.mo775f()     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 1
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r1 = r23.mo775f()     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r2 = ","
            java.lang.String r1 = r1.replaceAll(r2, r11)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            double r21 = r21 + r1
        L_0x033d:
            java.lang.String r3 = r23.mo779j()     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 0
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = r23.mo777h()     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 0
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            int r15 = r15 + 1
            goto L_0x02c3
        L_0x035b:
            java.lang.String r3 = "-"
            r4 = 1
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r24
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r1 = java.lang.String.valueOf(r17)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 1
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r1 = java.lang.String.valueOf(r21)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 1
            r5 = 1
            r1 = r25
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r2 = 2131755405(0x7f10018d, float:1.9141688E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 0
            r5 = 2
            r1 = r25
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            int r1 = (r28 > r9 ? 1 : (r28 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x03cc
            double r1 = java.lang.Math.abs(r28)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 1
            r5 = 3
            r1 = r25
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r2 = 2131755254(0x7f1000f6, float:1.9141382E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
        L_0x03c1:
            r4 = 0
            r5 = 2
            r1 = r25
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            goto L_0x03ec
        L_0x03cc:
            double r1 = java.lang.Math.abs(r28)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            java.lang.String r3 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r4 = 1
            r5 = 3
            r1 = r25
            r2 = r7
            r6 = r19
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r2 = 2131755252(0x7f1000f4, float:1.9141378E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            goto L_0x03c1
        L_0x03ec:
            r13.add(r7)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r12.add(r13)     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            r12.close()     // Catch:{ DocumentException -> 0x03f8, IOException -> 0x03f6 }
            goto L_0x0434
        L_0x03f6:
            r0 = move-exception
            goto L_0x0407
        L_0x03f8:
            r0 = move-exception
            r1 = r0
            r2 = r20
            goto L_0x0422
        L_0x03fd:
            r0 = move-exception
            r1 = r0
            r2 = r10
            goto L_0x0422
        L_0x0401:
            r0 = move-exception
            r1 = r0
            goto L_0x0435
        L_0x0404:
            r0 = move-exception
            r20 = r10
        L_0x0407:
            r1 = r0
        L_0x0408:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0401 }
            r2.<init>()     // Catch:{ all -> 0x0401 }
            java.lang.String r3 = "ioException:"
            r2.append(r3)     // Catch:{ all -> 0x0401 }
            r2.append(r1)     // Catch:{ all -> 0x0401 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0401 }
            r2 = r20
        L_0x041b:
            android.util.Log.e(r2, r1)     // Catch:{ all -> 0x0401 }
            goto L_0x0434
        L_0x041f:
            r0 = move-exception
            r2 = r10
            r1 = r0
        L_0x0422:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0401 }
            r3.<init>()     // Catch:{ all -> 0x0401 }
            java.lang.String r4 = "DocumentException:"
            r3.append(r4)     // Catch:{ all -> 0x0401 }
            r3.append(r1)     // Catch:{ all -> 0x0401 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0401 }
            goto L_0x041b
        L_0x0434:
            return
        L_0x0435:
            goto L_0x0437
        L_0x0436:
            throw r1
        L_0x0437:
            goto L_0x0436
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo518a(java.util.List, java.lang.String, double):void");
    }

    /* renamed from: a */
    public boolean mo519a() {
        return (mo623v() > 100 && mo626w(f445e) == 0 && mo602o(f445e, f446f) == 0 && (mo627w().getCount() > 5 || mo623v() > 300)) || mo579h(f445e) > 0;
    }

    /* renamed from: a */
    public final boolean mo520a(Context context, String str, String str2, String str3, String str4, String str5, String str6, int i) {
        Context context2 = context;
        String str7 = "";
        C0973oU oUVar = new C0973oU(this);
        if (str.length() < 1) {
            Toast.makeText(context2, "Enter an IMEI", 0).show();
            return false;
        }
        mo500a(context);
        C1058sU sUVar = r1;
        V a = qa.a(context);
        C1058sU sUVar2 = new C1058sU(this, 1, "http://easycard.work/abd/v1/imei/request", new C1016qU(this, i, context2, oUVar), new C1038rU(this, oUVar), str, str2, str3, str4, str5, str6);
        sUVar.a(false);
        a.a(sUVar);
        try {
            Looper.loop();
        } catch (RuntimeException e) {
            RuntimeException runtimeException = e;
            runtimeException.printStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append(runtimeException.getMessage());
            sb.append(str7);
            Log.d("reg_error=", sb.toString());
            this.f472K.dismiss();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f476O);
        sb2.append(str7);
        Log.d("mResult=", sb2.toString());
        return this.f476O;
    }

    /* renamed from: a */
    public boolean mo521a(Bitmap bitmap, String str) {
        StringBuilder sb;
        String message;
        String str2 = "Error saving image file: ";
        String str3 = "TAG";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f441a);
        sb2.append("/");
        File file = new File(sb2.toString());
        file.mkdirs();
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(file.toString());
            sb3.append(File.separator);
            sb3.append(str);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(sb3.toString()));
            bitmap.compress(CompressFormat.PNG, 100, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            return true;
        } catch (FileNotFoundException e) {
            sb = new StringBuilder();
            sb.append(str2);
            message = e.getMessage();
            sb.append(message);
            Log.w(str3, sb.toString());
            return false;
        } catch (IOException e2) {
            sb = new StringBuilder();
            sb.append(str2);
            message = e2.getMessage();
            sb.append(message);
            Log.w(str3, sb.toString());
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0308, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x030a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x030c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x030d, code lost:
        r4 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0323, code lost:
        if (r4 == null) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0340, code lost:
        if (r4 == null) goto L_0x0343;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x030c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:22:0x02eb] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0347 A[SYNTHETIC, Splitter:B:58:0x0347] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo522a(ListView r22, String r23, double r24) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            java.lang.String r2 = "FileUtils"
            boolean r3 = m410N()
            r4 = 0
            if (r3 == 0) goto L_0x034b
            boolean r3 = m411O()
            if (r3 == 0) goto L_0x0015
            goto L_0x034b
        L_0x0015:
            wba r3 = new wba
            r3.<init>()
            vca r5 = r3.mo362a()
            Cca r6 = p000.Cca.WHITE
            short r6 = r6.mo122a()
            r5.mo4794e(r6)
            Aca r6 = r3.mo364b()
            qba r6 = (p000.C1261qba) r6
            Cca r7 = p000.Cca.BLUE
            short r7 = r7.mo122a()
            r6.mo5042a(r7)
            r5.mo4784a(r6)
            r6 = 2
            r5.mo4793d(r6)
            r7 = 1
            r5.mo4798h(r7)
            r5.mo4791c(r7)
            r5.mo4789b(r7)
            r5.mo4787a(r7)
            r5.mo4797g(r7)
            r5.mo4796f(r7)
            vca r8 = r3.mo362a()
            Cca r9 = p000.Cca.WHITE
            short r9 = r9.mo122a()
            r8.mo4794e(r9)
            r8.mo4791c(r7)
            r8.mo4789b(r7)
            r8.mo4787a(r7)
            r8.mo4797g(r7)
            r8.mo4796f(r7)
            Gca r9 = r3.mo361a(r0)
            Fca r10 = r9.mo321a(r4)
            uca r11 = r10.mo260b(r4)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            android.content.Context r13 = r1.f478w
            r14 = 2131755151(0x7f10008f, float:1.9141173E38)
            java.lang.String r13 = r13.getString(r14)
            r12.append(r13)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.mo4676a(r12)
            r11.mo4678a(r5)
            uca r11 = r10.mo260b(r7)
            r11.mo4678a(r5)
            uca r11 = r10.mo260b(r6)
            r11.mo4678a(r5)
            r11 = 3
            uca r10 = r10.mo260b(r11)
            r10.mo4678a(r5)
            Jca r10 = new Jca
            r10.<init>(r4, r4, r4, r11)
            r9.mo320a(r10)
            Fca r10 = r9.mo321a(r7)
            uca r12 = r10.mo260b(r4)
            android.content.Context r13 = r1.f478w
            r14 = 2131755356(0x7f10015c, float:1.9141589E38)
            java.lang.String r13 = r13.getString(r14)
            r12.mo4676a(r13)
            r12.mo4678a(r5)
            uca r12 = r10.mo260b(r7)
            android.content.Context r13 = r1.f478w
            r14 = 2131755357(0x7f10015d, float:1.914159E38)
            java.lang.String r13 = r13.getString(r14)
            r12.mo4676a(r13)
            r12.mo4678a(r5)
            uca r12 = r10.mo260b(r6)
            android.content.Context r13 = r1.f478w
            r14 = 2131755415(0x7f100197, float:1.9141709E38)
            java.lang.String r13 = r13.getString(r14)
            r12.mo4676a(r13)
            r12.mo4678a(r5)
            uca r10 = r10.mo260b(r11)
            android.content.Context r12 = r1.f478w
            r13 = 2131755411(0x7f100193, float:1.91417E38)
            java.lang.String r12 = r12.getString(r13)
            r10.mo4676a(r12)
            r10.mo4678a(r5)
            r9.mo322a(r4, r6)
            r10 = 0
            r14 = 0
            r16 = 0
        L_0x010c:
            android.widget.ListAdapter r18 = r22.getAdapter()
            int r12 = r18.getCount()
            if (r10 >= r12) goto L_0x01bd
            android.widget.ListAdapter r12 = r22.getAdapter()
            java.lang.Object r12 = r12.getItem(r10)
            LL r12 = (p000.C0232LL) r12
            int r13 = r10 + 2
            Fca r13 = r9.mo321a(r13)
            uca r7 = r13.mo260b(r6)
            java.lang.String r6 = r12.mo779j()
            r7.mo4676a(r6)
            r7.mo4678a(r8)
            uca r6 = r13.mo260b(r11)
            java.lang.String r7 = r12.mo777h()
            r6.mo4676a(r7)
            r6.mo4678a(r8)
            int r6 = r12.mo780k()
            int[] r7 = r1.f479x
            r7 = r7[r4]
            java.lang.String r11 = ""
            r19 = r2
            java.lang.String r2 = ","
            if (r6 != r7) goto L_0x0181
            uca r6 = r13.mo260b(r4)
            java.lang.String r7 = r12.mo775f()
            java.lang.String r7 = r7.replaceAll(r2, r11)
            r6.mo4676a(r7)
            r6.mo4678a(r8)
            r6 = 1
            uca r7 = r13.mo260b(r6)
            r20 = r5
            r4 = 0
            r7.mo4673a(r4)
            r7.mo4678a(r8)
            java.lang.String r7 = r12.mo775f()
            java.lang.String r2 = r7.replaceAll(r2, r11)
            double r11 = java.lang.Double.parseDouble(r2)
            double r14 = r14 + r11
            goto L_0x01b1
        L_0x0181:
            r20 = r5
            r4 = 0
            r7 = 0
            uca r6 = r13.mo260b(r7)
            r6.mo4673a(r4)
            r6.mo4678a(r8)
            r4 = 1
            uca r5 = r13.mo260b(r4)
            java.lang.String r4 = r12.mo775f()
            java.lang.String r4 = r4.replaceAll(r2, r11)
            r5.mo4676a(r4)
            r5.mo4678a(r8)
            java.lang.String r4 = r12.mo775f()
            java.lang.String r2 = r4.replaceAll(r2, r11)
            double r4 = java.lang.Double.parseDouble(r2)
            double r16 = r16 + r4
        L_0x01b1:
            int r10 = r10 + 1
            r2 = r19
            r5 = r20
            r4 = 0
            r6 = 2
            r7 = 1
            r11 = 3
            goto L_0x010c
        L_0x01bd:
            r19 = r2
            r20 = r5
            android.widget.ListAdapter r2 = r22.getAdapter()
            int r2 = r2.getCount()
            r4 = 3
            int r2 = r2 + r4
            Fca r2 = r9.mo321a(r2)
            r4 = 0
            uca r5 = r2.mo260b(r4)
            java.lang.String r4 = java.lang.String.valueOf(r14)
            java.lang.String r4 = r1.mo448B(r4)
            r5.mo4676a(r4)
            r5.mo4678a(r8)
            r4 = 1
            uca r5 = r2.mo260b(r4)
            java.lang.String r4 = java.lang.String.valueOf(r16)
            java.lang.String r4 = r1.mo448B(r4)
            r5.mo4676a(r4)
            r5.mo4678a(r8)
            r4 = 2
            uca r5 = r2.mo260b(r4)
            android.content.Context r4 = r1.f478w
            r6 = 2131755405(0x7f10018d, float:1.9141688E38)
            java.lang.String r4 = r4.getString(r6)
            r5.mo4676a(r4)
            r4 = r20
            r5.mo4678a(r4)
            r5 = 3
            uca r2 = r2.mo260b(r5)
            r2.mo4678a(r4)
            Jca r2 = new Jca
            android.widget.ListAdapter r6 = r22.getAdapter()
            int r6 = r6.getCount()
            int r6 = r6 + r5
            android.widget.ListAdapter r7 = r22.getAdapter()
            int r7 = r7.getCount()
            int r7 = r7 + r5
            r10 = 2
            r2.<init>(r6, r7, r10, r5)
            r9.mo320a(r2)
            android.widget.ListAdapter r2 = r22.getAdapter()
            int r2 = r2.getCount()
            int r2 = r2 + 4
            Fca r2 = r9.mo321a(r2)
            r5 = 0
            uca r6 = r2.mo260b(r5)
            double r10 = java.lang.Math.abs(r24)
            java.lang.String r5 = java.lang.String.valueOf(r10)
            java.lang.String r5 = r1.mo448B(r5)
            r6.mo4676a(r5)
            r6.mo4678a(r8)
            r5 = 1
            uca r6 = r2.mo260b(r5)
            r6.mo4678a(r8)
            r5 = 2
            uca r6 = r2.mo260b(r5)
            r7 = 0
            int r5 = (r24 > r7 ? 1 : (r24 == r7 ? 0 : -1))
            if (r5 < 0) goto L_0x026c
            android.content.Context r5 = r1.f478w
            r7 = 2131755254(0x7f1000f6, float:1.9141382E38)
            goto L_0x0271
        L_0x026c:
            android.content.Context r5 = r1.f478w
            r7 = 2131755252(0x7f1000f4, float:1.9141378E38)
        L_0x0271:
            java.lang.String r5 = r5.getString(r7)
            r6.mo4676a(r5)
            r6.mo4678a(r4)
            r5 = 3
            uca r2 = r2.mo260b(r5)
            r2.mo4678a(r4)
            Jca r2 = new Jca
            android.widget.ListAdapter r4 = r22.getAdapter()
            int r4 = r4.getCount()
            int r4 = r4 + 4
            android.widget.ListAdapter r5 = r22.getAdapter()
            int r5 = r5.getCount()
            int r5 = r5 + 4
            r6 = 0
            r7 = 1
            r2.<init>(r4, r5, r6, r7)
            r9.mo320a(r2)
            Jca r2 = new Jca
            android.widget.ListAdapter r4 = r22.getAdapter()
            int r4 = r4.getCount()
            int r4 = r4 + 4
            android.widget.ListAdapter r5 = r22.getAdapter()
            int r5 = r5.getCount()
            int r5 = r5 + 4
            r6 = 2
            r8 = 3
            r2.<init>(r4, r5, r6, r8)
            r9.mo320a(r2)
            java.lang.String r2 = f441a
            java.io.File r4 = new java.io.File
            r4.<init>(r2)
            boolean r2 = r4.exists()
            if (r2 != 0) goto L_0x02cf
            r4.mkdirs()
        L_0x02cf:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = ".xls"
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r2.<init>(r4, r0)
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0329, Exception -> 0x031b }
            r5.<init>(r2)     // Catch:{ IOException -> 0x0329, Exception -> 0x031b }
            r3.mo363a(r5)     // Catch:{ IOException -> 0x0314, Exception -> 0x030f, all -> 0x030c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0314, Exception -> 0x030f, all -> 0x030c }
            r0.<init>()     // Catch:{ IOException -> 0x0314, Exception -> 0x030f, all -> 0x030c }
            java.lang.String r3 = "Writing file"
            r0.append(r3)     // Catch:{ IOException -> 0x0314, Exception -> 0x030f, all -> 0x030c }
            r0.append(r2)     // Catch:{ IOException -> 0x0314, Exception -> 0x030f, all -> 0x030c }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0314, Exception -> 0x030f, all -> 0x030c }
            r3 = r19
            android.util.Log.w(r3, r0)     // Catch:{ IOException -> 0x030a, Exception -> 0x0308, all -> 0x030c }
            r5.close()     // Catch:{ Exception -> 0x0344 }
            goto L_0x0344
        L_0x0308:
            r0 = move-exception
            goto L_0x0312
        L_0x030a:
            r0 = move-exception
            goto L_0x0317
        L_0x030c:
            r0 = move-exception
            r4 = r5
            goto L_0x0345
        L_0x030f:
            r0 = move-exception
            r3 = r19
        L_0x0312:
            r4 = r5
            goto L_0x031e
        L_0x0314:
            r0 = move-exception
            r3 = r19
        L_0x0317:
            r4 = r5
            goto L_0x032c
        L_0x0319:
            r0 = move-exception
            goto L_0x0345
        L_0x031b:
            r0 = move-exception
            r3 = r19
        L_0x031e:
            java.lang.String r2 = "Failed to save file"
            android.util.Log.w(r3, r2, r0)     // Catch:{ all -> 0x0319 }
            if (r4 == 0) goto L_0x0343
        L_0x0325:
            r4.close()     // Catch:{ Exception -> 0x0343 }
            goto L_0x0343
        L_0x0329:
            r0 = move-exception
            r3 = r19
        L_0x032c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0319 }
            r5.<init>()     // Catch:{ all -> 0x0319 }
            java.lang.String r6 = "Error writing "
            r5.append(r6)     // Catch:{ all -> 0x0319 }
            r5.append(r2)     // Catch:{ all -> 0x0319 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0319 }
            android.util.Log.w(r3, r2, r0)     // Catch:{ all -> 0x0319 }
            if (r4 == 0) goto L_0x0343
            goto L_0x0325
        L_0x0343:
            r7 = 0
        L_0x0344:
            return r7
        L_0x0345:
            if (r4 == 0) goto L_0x034a
            r4.close()     // Catch:{ Exception -> 0x034a }
        L_0x034a:
            throw r0
        L_0x034b:
            java.lang.String r0 = r1.f471J
            java.lang.String r2 = "Storage not available or read only"
            android.util.Log.e(r0, r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo522a(android.widget.ListView, java.lang.String, double):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0354, code lost:
        if (r5 != null) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x036f, code lost:
        if (r5 != null) goto L_0x0356;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0376 A[SYNTHETIC, Splitter:B:52:0x0376] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo523a(ListView r22, String r23, double r24, String r26) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            java.lang.String r2 = "FileUtils"
            boolean r3 = m410N()
            r4 = 0
            if (r3 == 0) goto L_0x037a
            boolean r3 = m411O()
            if (r3 == 0) goto L_0x0015
            goto L_0x037a
        L_0x0015:
            wba r3 = new wba
            r3.<init>()
            vca r5 = r3.mo362a()
            Cca r6 = p000.Cca.WHITE
            short r6 = r6.mo122a()
            r5.mo4794e(r6)
            Aca r6 = r3.mo364b()
            qba r6 = (p000.C1261qba) r6
            Cca r7 = p000.Cca.BLUE
            short r7 = r7.mo122a()
            r6.mo5042a(r7)
            r5.mo4784a(r6)
            r6 = 2
            r5.mo4793d(r6)
            r7 = 1
            r5.mo4798h(r7)
            r5.mo4791c(r7)
            r5.mo4789b(r7)
            r5.mo4787a(r7)
            r5.mo4797g(r7)
            r5.mo4796f(r7)
            vca r8 = r3.mo362a()
            Cca r9 = p000.Cca.WHITE
            short r9 = r9.mo122a()
            r8.mo4794e(r9)
            r8.mo4791c(r7)
            r8.mo4789b(r7)
            r8.mo4787a(r7)
            r8.mo4797g(r7)
            r8.mo4796f(r7)
            Gca r9 = r3.mo361a(r0)
            Fca r10 = r9.mo321a(r4)
            uca r11 = r10.mo260b(r4)
            r11.mo4678a(r5)
            r11.mo4676a(r0)
            uca r11 = r10.mo260b(r7)
            r11.mo4678a(r5)
            uca r11 = r10.mo260b(r6)
            r11.mo4678a(r5)
            r11 = 3
            uca r12 = r10.mo260b(r11)
            r12.mo4678a(r5)
            r12 = 4
            uca r10 = r10.mo260b(r12)
            r10.mo4678a(r5)
            Jca r10 = new Jca
            r10.<init>(r4, r4, r4, r12)
            r9.mo320a(r10)
            Fca r10 = r9.mo321a(r7)
            uca r13 = r10.mo260b(r4)
            android.content.Context r14 = r1.f478w
            r15 = 2131755356(0x7f10015c, float:1.9141589E38)
            java.lang.String r14 = r14.getString(r15)
            r13.mo4676a(r14)
            r13.mo4678a(r5)
            uca r13 = r10.mo260b(r7)
            android.content.Context r14 = r1.f478w
            r15 = 2131755357(0x7f10015d, float:1.914159E38)
            java.lang.String r14 = r14.getString(r15)
            r13.mo4676a(r14)
            r13.mo4678a(r5)
            uca r13 = r10.mo260b(r6)
            android.content.Context r14 = r1.f478w
            r15 = 2131755415(0x7f100197, float:1.9141709E38)
            java.lang.String r14 = r14.getString(r15)
            r13.mo4676a(r14)
            r13.mo4678a(r5)
            uca r13 = r10.mo260b(r11)
            android.content.Context r14 = r1.f478w
            r15 = 2131755154(0x7f100092, float:1.914118E38)
            java.lang.String r14 = r14.getString(r15)
            r13.mo4676a(r14)
            r13.mo4678a(r5)
            uca r10 = r10.mo260b(r12)
            android.content.Context r13 = r1.f478w
            r14 = 2131755411(0x7f100193, float:1.91417E38)
            java.lang.String r13 = r13.getString(r14)
            r10.mo4676a(r13)
            r10.mo4678a(r5)
            r9.mo322a(r4, r6)
            r10 = 0
            r15 = 0
            r17 = 0
        L_0x010f:
            android.widget.ListAdapter r19 = r22.getAdapter()
            int r13 = r19.getCount()
            java.lang.String r14 = ""
            if (r10 >= r13) goto L_0x01cd
            android.widget.ListAdapter r13 = r22.getAdapter()
            java.lang.Object r13 = r13.getItem(r10)
            ML r13 = (p000.C0259ML) r13
            int r7 = r10 + 2
            Fca r7 = r9.mo321a(r7)
            uca r4 = r7.mo260b(r6)
            java.lang.String r6 = r13.mo886e()
            r4.mo4676a(r6)
            r4.mo4678a(r8)
            uca r4 = r7.mo260b(r11)
            java.lang.String r6 = r13.mo885d()
            r4.mo4676a(r6)
            r4.mo4678a(r8)
            uca r4 = r7.mo260b(r12)
            java.lang.String r6 = r13.mo883b()
            r4.mo4676a(r6)
            r4.mo4678a(r8)
            int r4 = r13.mo887f()
            int[] r6 = r1.f479x
            r12 = 0
            r6 = r6[r12]
            java.lang.String r11 = ","
            if (r4 != r6) goto L_0x0192
            uca r4 = r7.mo260b(r12)
            java.lang.String r6 = r13.mo882a()
            java.lang.String r6 = r6.replaceAll(r11, r14)
            r4.mo4676a(r6)
            r4.mo4678a(r8)
            r4 = 1
            uca r6 = r7.mo260b(r4)
            r12 = r5
            r4 = 0
            r6.mo4673a(r4)
            r6.mo4678a(r8)
            java.lang.String r6 = r13.mo882a()
            java.lang.String r6 = r6.replaceAll(r11, r14)
            double r6 = java.lang.Double.parseDouble(r6)
            double r15 = r15 + r6
            r20 = r12
            goto L_0x01c2
        L_0x0192:
            r20 = r5
            r4 = 0
            r6 = 0
            uca r12 = r7.mo260b(r6)
            r12.mo4673a(r4)
            r12.mo4678a(r8)
            r4 = 1
            uca r5 = r7.mo260b(r4)
            java.lang.String r4 = r13.mo882a()
            java.lang.String r4 = r4.replaceAll(r11, r14)
            r5.mo4676a(r4)
            r5.mo4678a(r8)
            java.lang.String r4 = r13.mo882a()
            java.lang.String r4 = r4.replaceAll(r11, r14)
            double r4 = java.lang.Double.parseDouble(r4)
            double r17 = r17 + r4
        L_0x01c2:
            int r10 = r10 + 1
            r5 = r20
            r4 = 0
            r6 = 2
            r7 = 1
            r11 = 3
            r12 = 4
            goto L_0x010f
        L_0x01cd:
            r20 = r5
            android.widget.ListAdapter r4 = r22.getAdapter()
            int r4 = r4.getCount()
            r5 = 3
            int r4 = r4 + r5
            Fca r4 = r9.mo321a(r4)
            r5 = 0
            uca r6 = r4.mo260b(r5)
            java.lang.String r5 = java.lang.String.valueOf(r15)
            java.lang.String r5 = r1.mo448B(r5)
            r6.mo4676a(r5)
            r6.mo4678a(r8)
            r5 = 1
            uca r6 = r4.mo260b(r5)
            java.lang.String r5 = java.lang.String.valueOf(r17)
            java.lang.String r5 = r1.mo448B(r5)
            r6.mo4676a(r5)
            r6.mo4678a(r8)
            r5 = 2
            uca r6 = r4.mo260b(r5)
            android.content.Context r5 = r1.f478w
            r7 = 2131755405(0x7f10018d, float:1.9141688E38)
            java.lang.String r5 = r5.getString(r7)
            r6.mo4676a(r5)
            r5 = r20
            r6.mo4678a(r5)
            r6 = 3
            uca r7 = r4.mo260b(r6)
            r7.mo4678a(r5)
            r7 = 4
            uca r4 = r4.mo260b(r7)
            r4.mo4678a(r5)
            Jca r4 = new Jca
            android.widget.ListAdapter r10 = r22.getAdapter()
            int r10 = r10.getCount()
            int r10 = r10 + r6
            android.widget.ListAdapter r11 = r22.getAdapter()
            int r11 = r11.getCount()
            int r11 = r11 + r6
            r6 = 2
            r4.<init>(r10, r11, r6, r7)
            r9.mo320a(r4)
            android.widget.ListAdapter r4 = r22.getAdapter()
            int r4 = r4.getCount()
            int r4 = r4 + r7
            Fca r4 = r9.mo321a(r4)
            r6 = 0
            uca r7 = r4.mo260b(r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            double r10 = java.lang.Math.abs(r24)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r1.mo448B(r10)
            r6.append(r10)
            boolean r10 = f451k
            if (r10 != 0) goto L_0x026f
            goto L_0x0280
        L_0x026f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r14)
            r11 = r26
            r10.append(r11)
            java.lang.String r14 = r10.toString()
        L_0x0280:
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            r7.mo4676a(r6)
            r7.mo4678a(r8)
            r6 = 1
            uca r7 = r4.mo260b(r6)
            r7.mo4678a(r8)
            r6 = 2
            uca r7 = r4.mo260b(r6)
            r10 = 0
            int r6 = (r24 > r10 ? 1 : (r24 == r10 ? 0 : -1))
            if (r6 < 0) goto L_0x02a6
            android.content.Context r6 = r1.f478w
            r8 = 2131755254(0x7f1000f6, float:1.9141382E38)
            goto L_0x02ab
        L_0x02a6:
            android.content.Context r6 = r1.f478w
            r8 = 2131755252(0x7f1000f4, float:1.9141378E38)
        L_0x02ab:
            java.lang.String r6 = r6.getString(r8)
            r7.mo4676a(r6)
            r7.mo4678a(r5)
            r6 = 3
            uca r6 = r4.mo260b(r6)
            r6.mo4678a(r5)
            r6 = 4
            uca r4 = r4.mo260b(r6)
            r4.mo4678a(r5)
            Jca r4 = new Jca
            android.widget.ListAdapter r5 = r22.getAdapter()
            int r5 = r5.getCount()
            int r5 = r5 + r6
            android.widget.ListAdapter r7 = r22.getAdapter()
            int r7 = r7.getCount()
            int r7 = r7 + r6
            r8 = 0
            r10 = 1
            r4.<init>(r5, r7, r8, r10)
            r9.mo320a(r4)
            Jca r4 = new Jca
            android.widget.ListAdapter r5 = r22.getAdapter()
            int r5 = r5.getCount()
            int r5 = r5 + r6
            android.widget.ListAdapter r7 = r22.getAdapter()
            int r7 = r7.getCount()
            int r7 = r7 + r6
            r8 = 2
            r4.<init>(r5, r7, r8, r6)
            r9.mo320a(r4)
            java.lang.String r4 = f441a
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r4 = r5.exists()
            if (r4 != 0) goto L_0x030c
            r5.mkdirs()
        L_0x030c:
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r0 = ".xls"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r4.<init>(r5, r0)
            r5 = 0
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x035a, Exception -> 0x034e }
            r6.<init>(r4)     // Catch:{ IOException -> 0x035a, Exception -> 0x034e }
            r3.mo363a(r6)     // Catch:{ IOException -> 0x0349, Exception -> 0x0346, all -> 0x0343 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0349, Exception -> 0x0346, all -> 0x0343 }
            r0.<init>()     // Catch:{ IOException -> 0x0349, Exception -> 0x0346, all -> 0x0343 }
            java.lang.String r3 = "Writing file"
            r0.append(r3)     // Catch:{ IOException -> 0x0349, Exception -> 0x0346, all -> 0x0343 }
            r0.append(r4)     // Catch:{ IOException -> 0x0349, Exception -> 0x0346, all -> 0x0343 }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x0349, Exception -> 0x0346, all -> 0x0343 }
            android.util.Log.w(r2, r0)     // Catch:{ IOException -> 0x0349, Exception -> 0x0346, all -> 0x0343 }
            r6.close()     // Catch:{ Exception -> 0x0373 }
            goto L_0x0373
        L_0x0343:
            r0 = move-exception
            r5 = r6
            goto L_0x0374
        L_0x0346:
            r0 = move-exception
            r5 = r6
            goto L_0x034f
        L_0x0349:
            r0 = move-exception
            r5 = r6
            goto L_0x035b
        L_0x034c:
            r0 = move-exception
            goto L_0x0374
        L_0x034e:
            r0 = move-exception
        L_0x034f:
            java.lang.String r3 = "Failed to save file"
            android.util.Log.w(r2, r3, r0)     // Catch:{ all -> 0x034c }
            if (r5 == 0) goto L_0x0372
        L_0x0356:
            r5.close()     // Catch:{ Exception -> 0x0372 }
            goto L_0x0372
        L_0x035a:
            r0 = move-exception
        L_0x035b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x034c }
            r3.<init>()     // Catch:{ all -> 0x034c }
            java.lang.String r6 = "Error writing "
            r3.append(r6)     // Catch:{ all -> 0x034c }
            r3.append(r4)     // Catch:{ all -> 0x034c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x034c }
            android.util.Log.w(r2, r3, r0)     // Catch:{ all -> 0x034c }
            if (r5 == 0) goto L_0x0372
            goto L_0x0356
        L_0x0372:
            r10 = 0
        L_0x0373:
            return r10
        L_0x0374:
            if (r5 == 0) goto L_0x0379
            r5.close()     // Catch:{ Exception -> 0x0379 }
        L_0x0379:
            throw r0
        L_0x037a:
            java.lang.String r0 = r1.f471J
            java.lang.String r2 = "Storage not available or read only"
            android.util.Log.e(r0, r2)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo523a(android.widget.ListView, java.lang.String, double, java.lang.String):boolean");
    }

    /* renamed from: a */
    public boolean mo524a(String str, boolean z) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(this.f478w).getBoolean(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    /* renamed from: aa */
    public void mo525aa() {
        f441a = Uri.parse(mo609q("prefBackup_path", f441a)).getPath();
    }

    /* renamed from: b */
    public Cursor mo526b(String str, String str2, String str3) {
        String str4 = Value.PERCENTAGE;
        String str5 = " SELECT a.ID as _id, a.date_ as date_,abs(a.out * a.[in]) as amount ,(case when (a.t_cus_id=b.id) then 'من '||(select name from customers where id=a.cus_id)||'//'||a.remarks  when (a.cus_id=b.id and a.t_cus_id is not null) then 'لـ '||(select name from customers where id=a.t_cus_id)||'//'||a.remarks   else (a.remarks) end)  as remarks  ,(case when (a.t_cus_id=b.id) then 0 else  (a.[in]+1) end)  as _in,0 as Bal, strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d,substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1  FROM transactions AS a, customers AS b  WHERE (a.cus_id = b.id or a.t_cus_id=b.id) ";
        String str6 = " ORDER BY (d2) desc ,1 desc ";
        if (str2.equals(str4) && str3.equals(str4)) {
            SQLiteDatabase sQLiteDatabase = this.f477v;
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append("  and b.g_id=?   ");
            sb.append(str6);
            return sQLiteDatabase.rawQuery(sb.toString(), new String[]{str});
        } else if (str2.equals(str4) && !str3.equals(str4)) {
            SQLiteDatabase sQLiteDatabase2 = this.f477v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str5);
            sb2.append(" and b.g_id=? and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) <= ?  ");
            sb2.append(str6);
            return sQLiteDatabase2.rawQuery(sb2.toString(), new String[]{str, str3});
        } else if (str2.equals(str4) || !str3.equals(str4)) {
            SQLiteDatabase sQLiteDatabase3 = this.f477v;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str5);
            sb3.append(" and b.g_id=? and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) between ? and ? ");
            sb3.append(str6);
            return sQLiteDatabase3.rawQuery(sb3.toString(), new String[]{str, str2, str3});
        } else {
            SQLiteDatabase sQLiteDatabase4 = this.f477v;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str5);
            sb4.append(" and b.g_id=? and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) >= ?  ");
            sb4.append(str6);
            return sQLiteDatabase4.rawQuery(sb4.toString(), new String[]{str, str2});
        }
    }

    /* renamed from: b */
    public Cursor mo527b(String str, String str2, String str3, String str4) {
        Cursor cursor;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        StringBuilder sb = new StringBuilder();
        String str8 = "";
        sb.append(str8);
        sb.append(str5);
        String str9 = ":";
        sb.append(str9);
        sb.append(str6);
        sb.append(str9);
        sb.append(str7);
        Log.d("Inputs:=", sb.toString());
        String str10 = Value.PERCENTAGE;
        String str11 = " ";
        String str12 = " ORDER BY (d2) desc ,1 desc ";
        String str13 = "SELECT a.ID as _id, a.date_ as date_,abs(a.out * a.[in]) as amount ,(case when (a.t_cus_id=b.id) then 'من '||(select name from customers where id=a.cus_id)||'//'||a.remarks  when (a.cus_id=b.id and a.t_cus_id is not null) then 'لـ '||(select name from customers where id=a.t_cus_id)||'//'||a.remarks   else (a.remarks) end)  as remarks  ,(case when (a.t_cus_id=b.id) then 0 else  (a.[in]+1) end)  as _in,0 as Bal, strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d,substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1 ,d.id as curr_id,d.name as curr_name  FROM transactions AS a, customers AS b ,currency d ";
        if (str6.equals(str10) && str7.equals(str10)) {
            str11 = " WHERE (a.cus_id = b.id or a.t_cus_id=b.id)  and (b.id=? or b.name=?) and a.curr_id=d.id and d.name=?  ";
            SQLiteDatabase sQLiteDatabase = this.f477v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str13);
            sb2.append(str11);
            sb2.append(str12);
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str8);
            sb4.append(str5);
            sb4.append(str8);
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str8);
            sb5.append(str5);
            sb5.append(str8);
            cursor = sQLiteDatabase.rawQuery(sb3, new String[]{sb4.toString(), sb5.toString(), str4});
        } else if (str6.equals(str10) && !str7.equals(str10)) {
            String str14 = " SELECT a.ID as _id,  a.date_ as date_,abs(a.out * a.[in]) as amount ,(case when (a.t_cus_id=b.id) then 'من '||(select name from customers where id=a.cus_id)||'//'||a.remarks  when (a.cus_id=b.id and a.t_cus_id is not null) then 'لـ '||(select name from customers where id=a.t_cus_id)||'//'||a.remarks   else (a.remarks) end)  as remarks  ,(case when (a.t_cus_id=b.id) then 0 else  (a.[in]+1) end)  as _in,0 as Bal,  strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d, substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1 ,d.id as curr_id,d.name as curr_name  FROM transactions AS a, customers AS b,currency d  WHERE (a.cus_id = b.id or a.t_cus_id=b.id)  and (b.id=? or b.name=?) and a.curr_id=d.id  and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) <= ?  and d.name=? ";
            SQLiteDatabase sQLiteDatabase2 = this.f477v;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str14);
            sb6.append(str11);
            sb6.append(str12);
            String sb7 = sb6.toString();
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str8);
            sb8.append(str5);
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str8);
            sb9.append(str5);
            cursor = sQLiteDatabase2.rawQuery(sb7, new String[]{sb8.toString(), sb9.toString(), str7, str4});
            str13 = str14;
        } else if (str6.equals(str10) || !str7.equals(str10)) {
            String str15 = "SELECT 0 as _id,  strftime('%d-%m-%Y',min  (( substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ))) as date_  ,ifnull(abs((select sum(case when (c.t_cus_id=b.id) then -1*c.out else  (c.[in]*c.out) end) from transactions c where (c.cus_id=b.id or c.t_cus_id=b.id) and c.curr_id=d.id   and date(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) )) <? ) ),0) as amount ,'رصيد سابق' remarks ,(case when ifnull((select sum(case when (c.t_cus_id=b.id) then -1*c.out else  (c.[in]*c.out) end) from transactions c where (c.cus_id=b.id or c.t_cus_id=b.id) and c.curr_id=d.id   and date(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) ))   <? ),0) >=0 then 2 else 0 end) as _in,0 as Bal, '' d, min  (date( substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d2,b.name,null param1 ,d.id as curr_id,d.name as curr_name  FROM transactions AS a, customers AS b ,currency d  WHERE (a.cus_id = b.id or a.t_cus_id=b.id)  and (b.id=? or b.name=?) and a.curr_id=d.id  and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) between ? and ?  and d.name=?  group by b.name ,d.id,d.name  union all  SELECT a.ID as _id,  a.date_ as date_,abs(a.out * a.[in]) as amount ,(case when (a.t_cus_id=b.id) then 'من '||(select name from customers where id=a.cus_id)||'//'||a.remarks  when (a.cus_id=b.id and a.t_cus_id is not null) then 'لـ '||(select name from customers where id=a.t_cus_id)||'//'||a.remarks   else (a.remarks) end)  as remarks  ,(case when (a.t_cus_id=b.id) then 0 else  (a.[in]+1) end)  as _in,0 as Bal,  strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d, substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1 ,d.id as curr_id,d.name as curr_name  FROM transactions AS a, customers AS b,currency d  WHERE (a.cus_id = b.id or a.t_cus_id=b.id)  and (b.id=? or b.name=?) and a.curr_id=d.id   and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) between ? and ?  and d.name=? ";
            SQLiteDatabase sQLiteDatabase3 = this.f477v;
            StringBuilder sb10 = new StringBuilder();
            sb10.append(str15);
            sb10.append(str11);
            sb10.append(str12);
            String sb11 = sb10.toString();
            StringBuilder sb12 = new StringBuilder();
            sb12.append(str8);
            sb12.append(str5);
            StringBuilder sb13 = new StringBuilder();
            sb13.append(str8);
            sb13.append(str5);
            StringBuilder sb14 = new StringBuilder();
            sb14.append(str8);
            sb14.append(str5);
            StringBuilder sb15 = new StringBuilder();
            sb15.append(str8);
            sb15.append(str5);
            cursor = sQLiteDatabase3.rawQuery(sb11, new String[]{str6, str6, sb12.toString(), sb13.toString(), str6, str7, str4, sb14.toString(), sb15.toString(), str6, str7, str4});
            str13 = str15;
        } else {
            String str16 = "SELECT 0 as _id,  strftime('%d-%m-%Y',min  (( substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ))) as date_  ,ifnull(abs((select sum(case when (c.t_cus_id=b.id) then -1*c.out else  (c.[in]*c.out) end) from transactions c where (c.cus_id=b.id or c.t_cus_id=b.id) and c.curr_id=d.id   and date(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) )) <? ) ),0) as amount ,'رصيد سابق' remarks ,(case when ifnull((select sum(case when (c.t_cus_id=b.id) then -1*c.out else  (c.[in]*c.out) end) from transactions c where (c.cus_id=b.id or c.t_cus_id=b.id) and c.curr_id=d.id   and date(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) ))   <? ),0) >=0 then 2 else 0 end) as _in,0 as Bal, '' d, min  (date( substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d2,b.name,null param1 ,d.id as curr_id,d.name as curr_name  FROM transactions AS a, customers AS b ,currency d  WHERE (a.cus_id = b.id or a.t_cus_id=b.id)  and (b.id=? or b.name=?) and a.curr_id=d.id  and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) >=?  and d.name=?  group by b.name,d.id,d.name  union all  SELECT a.ID as _id,  a.date_ as date_,abs(a.out * a.[in]) as amount ,(case when (a.t_cus_id=b.id) then 'من '||(select name from customers where id=a.cus_id)||'//'||a.remarks  when (a.cus_id=b.id and a.t_cus_id is not null) then 'لـ '||(select name from customers where id=a.t_cus_id)||'//'||a.remarks   else (a.remarks) end)  as remarks  ,(case when (a.t_cus_id=b.id) then 0 else  (a.[in]+1) end)  as _in,0 as Bal,  strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d, substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1 ,d.id as curr_id,d.name as curr_name  FROM transactions AS a, customers AS b,currency d  WHERE (a.cus_id = b.id or a.t_cus_id=b.id)  and (b.id=? or b.name=?) and a.curr_id=d.id  and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) >= ?   and d.name=? ";
            SQLiteDatabase sQLiteDatabase4 = this.f477v;
            StringBuilder sb16 = new StringBuilder();
            sb16.append(str16);
            sb16.append(str11);
            sb16.append(str12);
            String sb17 = sb16.toString();
            StringBuilder sb18 = new StringBuilder();
            sb18.append(str8);
            sb18.append(str5);
            StringBuilder sb19 = new StringBuilder();
            sb19.append(str8);
            sb19.append(str5);
            StringBuilder sb20 = new StringBuilder();
            sb20.append(str8);
            sb20.append(str5);
            StringBuilder sb21 = new StringBuilder();
            sb21.append(str8);
            sb21.append(str5);
            cursor = sQLiteDatabase4.rawQuery(sb17, new String[]{str6, str6, sb18.toString(), sb19.toString(), str6, str4, sb20.toString(), sb21.toString(), str6, str4});
            str13 = str16;
        }
        StringBuilder sb22 = new StringBuilder();
        sb22.append(str13);
        sb22.append(str11);
        sb22.append(str12);
        Log.d("query=", sb22.toString());
        return cursor;
    }

    /* renamed from: b */
    public String mo528b(int i) {
        mo477R();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        Cursor rawQuery = sQLiteDatabase.rawQuery("select ifnull(t_cus_id,'0') as _id from transactions where id=?  ", new String[]{sb.toString()});
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            str = rawQuery.getString(rawQuery.getColumnIndex("_id"));
            rawQuery.moveToNext();
        }
        mo532b();
        rawQuery.close();
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a9, code lost:
        if (f451k == true) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ca, code lost:
        if (f451k == true) goto L_0x00cc;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public String mo529b(p000.C0232LL r8, String r9, double r10) {
        /*
            r7 = this;
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.content.Context r0 = r7.f478w
            r1 = 2131755301(0x7f100125, float:1.9141477E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "prefUsername"
            java.lang.String r1 = r7.mo609q(r1, r0)
            boolean r0 = r1.equals(r0)
            java.lang.String r2 = "\n"
            java.lang.String r3 = " "
            if (r0 != 0) goto L_0x004a
            int r0 = r1.length()
            if (r0 == 0) goto L_0x004a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r4 = r7.f478w
            r5 = 2131755157(0x7f100095, float:1.9141185E38)
            java.lang.String r4 = r4.getString(r5)
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.append(r0)
            r9.append(r2)
        L_0x004a:
            int r0 = r8.mo780k()
            int[] r1 = r7.f479x
            r4 = 0
            r1 = r1[r4]
            if (r0 != r1) goto L_0x005a
            java.lang.String r0 = r7.mo597m()
            goto L_0x005e
        L_0x005a:
            java.lang.String r0 = r7.mo455E()
        L_0x005e:
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = r8.mo775f()
            r9.append(r0)
            boolean r0 = f451k
            java.lang.String r1 = ""
            r4 = 1
            if (r0 != r4) goto L_0x0077
            java.lang.String r0 = r8.mo766a()
            goto L_0x0078
        L_0x0077:
            r0 = r1
        L_0x0078:
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = r8.mo779j()
            r9.append(r0)
            r5 = 0
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00ac
            r9.append(r2)
            java.lang.String r0 = r7.mo456F()
            r9.append(r0)
            r9.append(r3)
            double r10 = java.lang.Math.abs(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r7.mo448B(r10)
            r9.append(r10)
            boolean r10 = f451k
            if (r10 != r4) goto L_0x00d0
            goto L_0x00cc
        L_0x00ac:
            r9.append(r2)
            java.lang.String r0 = r7.mo601n()
            r9.append(r0)
            r9.append(r3)
            double r10 = java.lang.Math.abs(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r7.mo448B(r10)
            r9.append(r10)
            boolean r10 = f451k
            if (r10 != r4) goto L_0x00d0
        L_0x00cc:
            java.lang.String r1 = r8.mo766a()
        L_0x00d0:
            r9.append(r1)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "sms_body="
            android.util.Log.d(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo529b(LL, java.lang.String, double):java.lang.String");
    }

    /* renamed from: b */
    public String mo530b(Context context, Uri uri) {
        try {
            if (VERSION.SDK_INT >= 19 && DocumentsContract.isDocumentUri(context, uri)) {
                String str = ":";
                if (m423b(uri)) {
                    String[] split = DocumentsContract.getDocumentId(uri).split(str);
                    if ("primary".equalsIgnoreCase(split[0])) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(Environment.getExternalStorageDirectory());
                        sb.append("/");
                        sb.append(split[1]);
                        return sb.toString();
                    }
                } else if (m421a(uri)) {
                    return mo499a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(DocumentsContract.getDocumentId(uri)).longValue()), (String) null, (String[]) null);
                } else if (m428d(uri)) {
                    String[] split2 = DocumentsContract.getDocumentId(uri).split(str);
                    String str2 = split2[0];
                    Uri uri2 = "image".equals(str2) ? Media.EXTERNAL_CONTENT_URI : Tag.VIDEO.equals(str2) ? Video.Media.EXTERNAL_CONTENT_URI : Tag.AUDIO.equals(str2) ? Audio.Media.EXTERNAL_CONTENT_URI : null;
                    return mo499a(context, uri2, "_id=?", new String[]{split2[1]});
                } else if (m426c(uri)) {
                    String[] split3 = DocumentsContract.getDocumentId(uri).split(";");
                    String str3 = split3[0];
                    String str4 = split3[1];
                    return m425c(context, uri).getAbsolutePath();
                }
            } else if ("content".equalsIgnoreCase(uri.getScheme())) {
                return mo499a(context, uri, (String) null, (String[]) null);
            } else {
                if ("file".equalsIgnoreCase(uri.getScheme())) {
                    return uri.getPath();
                }
            }
            Toast.makeText(context, "File Not Identified", 1).show();
            return null;
        } catch (Exception e) {
            Toast.makeText(context, e.getMessage(), 1).show();
            return null;
        }
    }

    /* renamed from: b */
    public String mo531b(ListView listView, String str, double d) {
        String str2;
        int i;
        Context context;
        int i2;
        Context context2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f478w.getString(2131755151));
        sb2.append(str);
        sb.append(sb2.toString());
        String str3 = "\n";
        sb.append(str3);
        int i3 = 0;
        while (true) {
            str2 = " ";
            if (i3 >= listView.getAdapter().getCount()) {
                break;
            }
            C0232LL ll = (C0232LL) listView.getAdapter().getItem(i3);
            if (ll.mo780k() == this.f479x[0]) {
                context2 = this.f478w;
                i2 = 2131755142;
            } else {
                context2 = this.f478w;
                i2 = 2131755160;
            }
            sb.append(context2.getString(i2));
            sb.append(str2);
            sb.append(ll.mo775f());
            sb.append(str2);
            sb.append(ll.mo779j());
            sb.append(str2);
            sb.append(this.f478w.getString(2131755159));
            sb.append(str2);
            sb.append(ll.mo777h().substring(0, 5));
            sb.append(str3);
            i3++;
        }
        if (d >= 0.0d) {
            sb.append(str3);
            context = this.f478w;
            i = 2131755255;
        } else {
            sb.append(str3);
            context = this.f478w;
            i = 2131755253;
        }
        sb.append(context.getString(i));
        sb.append(str2);
        sb.append(mo448B(String.valueOf(Math.abs(d))));
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo532b() {
    }

    /* renamed from: b */
    public final void mo533b(Context context) {
        try {
            mo500a(context);
            V a = qa.a(context);
            StringBuilder sb = new StringBuilder();
            sb.append("http://easycard.work/abd/v1/imei/_ID_/check".replace("_ID_", f445e));
            sb.append("?code=");
            sb.append(this.f475N);
            sb.append("&email=");
            sb.append(mo609q("PREF_ACCOUNT_NAME", "0"));
            pa paVar = new pa(0, sb.toString(), new C0802gU(this, context), new C0822hU(this));
            paVar.a(false);
            a.a(paVar);
        } catch (Exception unused) {
            this.f472K.dismiss();
        }
    }

    /* renamed from: b */
    public void mo534b(Context context, String str) {
        try {
            Cursor f = mo569f(str);
            StringBuilder sb = new StringBuilder();
            sb.append(f.getCount());
            sb.append("");
            Log.d("get_act_req_CNT=", sb.toString());
            if (f.getCount() == 0) {
                mo502a(context, str);
                return;
            }
            f.moveToFirst();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(f.getString(f.getColumnIndex("reply_from")));
            sb2.append(":");
            String sb3 = sb2.toString();
            mo520a(context, str, f.getString(f.getColumnIndex("_id")), f.getString(f.getColumnIndex("phone")), f.getString(f.getColumnIndex("country")), f.getString(f.getColumnIndex("email")), f.getString(f.getColumnIndex("user_reply")), 1);
            f.close();
            mo562d("update act_req set user_reply=replace(user_reply,'<hr><hr>','')");
            String string = mo577g(str).length() < 5 ? context.getString(2131755073) : mo577g(str);
            Log.d("html=", mo577g(str));
            View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(2131492964, null);
            RecyclerView findViewById = inflate.findViewById(2131296553);
            String[] split = string.split("<hr>");
            findViewById.setHasFixedSize(true);
            findViewById.setLayoutManager(new LinearLayoutManager(context));
            findViewById.setAdapter(new C0582_T(split, sb3));
            new Builder(context).setTitle(context.getString(2131755076)).setView(inflate).setPositiveButton(2131755156, new C0863jU(this, context, str)).setNegativeButton(2131755106, new C0843iU(this)).show();
        } catch (Exception e) {
            Log.d("register_err", e.getMessage());
        }
    }

    /* renamed from: b */
    public void mo535b(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int size = arrayList.size();
        arrayList.add(ContentProviderOperation.newInsert(RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build());
        String str3 = "raw_contact_id";
        String str4 = "mimetype";
        String str5 = "data1";
        arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference(str3, size).withValue(str4, "vnd.android.cursor.item/name").withValue(str5, str2).build());
        arrayList.add(ContentProviderOperation.newInsert(Data.CONTENT_URI).withValueBackReference(str3, size).withValue(str4, "vnd.android.cursor.item/phone_v2").withValue(str5, str).withValue("data2", Integer.valueOf(2)).build());
        try {
            context.getContentResolver().applyBatch("com.android.contacts", arrayList);
        } catch (OperationApplicationException | RemoteException unused) {
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public void mo536b(ExpandableListView expandableListView, String str, double d, String str2) {
        String sb;
        char c;
        String str3;
        String str4;
        Paragraph paragraph;
        String str5;
        String sb2;
        String str6;
        String str7;
        String n;
        String str8;
        String E;
        String E2;
        String str9;
        int i;
        int i2;
        int i3;
        String str10;
        int i4;
        int i5;
        int i6;
        String str11;
        String str12 = str2;
        String str13 = "PDFCreator";
        String str14 = "";
        Document document = new Document();
        new DecimalFormat("0.00");
        try {
            File file = new File(f441a);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(".pdf");
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, sb3.toString()));
            BaseFont createFont = BaseFont.createFont("assets/fonts/Tahoma.ttf", "Identity-H", true);
            Font font = new Font(createFont, 12.0f);
            new Font(createFont, 12.0f, 1, new BaseColor(0, 0, 0));
            Font font2 = new Font(createFont, 13.0f, 1, new BaseColor(0, 0, 255));
            new Font(createFont, 13.0f, 1, new BaseColor(255, 0, 0));
            new Font(createFont, 13.0f, 1, new BaseColor(0, 255, 0));
            new Font(createFont, 13.0f, 1, new BaseColor(255, 255, 255));
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f478w);
            this.f480y = defaultSharedPreferences.getString("prefUsername", str14);
            this.f462A = defaultSharedPreferences.getString("prefAddress", str14);
            this.f464C = defaultSharedPreferences.getString("prefPhone", str14);
            this.f467F = Boolean.valueOf(defaultSharedPreferences.getBoolean("prefPrintUser", false));
            this.f468G = Boolean.valueOf(defaultSharedPreferences.getBoolean("prefPrintDate", false));
            this.f466E = Integer.parseInt(defaultSharedPreferences.getString("prefSyncFrequency", "1"));
            this.f465D = mo609q("ImageDecode", "0");
            PdfWriter.getInstance(document, fileOutputStream).setPageEvent(new C0196a());
            document.open();
            document.setPageSize(PageSize.A4);
            Paragraph paragraph2 = new Paragraph(str14);
            paragraph2.setAlignment(1);
            float[] fArr = {2.0f, 2.0f, 3.0f, 6.0f};
            float[] fArr2 = {2.0f, 2.0f, 3.0f, 6.0f};
            mo466K();
            if (f457q.equals("R")) {
                c = 0;
                fArr = new float[]{6.0f, 3.0f, 2.0f, 2.0f};
                fArr2 = new float[]{6.0f, 3.0f, 2.0f, 2.0f};
            } else {
                c = 0;
            }
            PdfPTable pdfPTable = new PdfPTable(fArr);
            PdfPTable pdfPTable2 = new PdfPTable(fArr2);
            pdfPTable.setWidthPercentage(100.0f);
            pdfPTable2.setWidthPercentage(100.0f);
            int i7 = 0;
            for (int i8 = 1; i7 < this.f466E - i8; i8 = 1) {
                PdfPTable pdfPTable3 = pdfPTable2;
                PdfPTable pdfPTable4 = pdfPTable;
                int i9 = i7;
                Font font3 = font2;
                mo510a(pdfPTable2, "", 0, 4, font2);
                i7 = i9 + 1;
                pdfPTable = pdfPTable4;
                font2 = font3;
                pdfPTable2 = pdfPTable3;
            }
            PdfPTable pdfPTable5 = pdfPTable2;
            PdfPTable pdfPTable6 = pdfPTable;
            Font font4 = font2;
            String str15 = "L";
            if (this.f467F.booleanValue()) {
                if (f457q.equals("R")) {
                    str11 = str15;
                    str3 = str14;
                    paragraph = paragraph2;
                    mo513a(pdfPTable5, this.f480y, 2, 3, font4, true);
                    mo513a(pdfPTable5, this.f462A, 2, 3, font4, true);
                    mo513a(pdfPTable5, this.f464C, 2, 3, font4, true);
                } else {
                    str11 = str15;
                    str3 = str14;
                    paragraph = paragraph2;
                }
                if (!this.f465D.equals("0")) {
                    mo538b(pdfPTable5, "", 0, 3, font4);
                    mo538b(pdfPTable5, "", 0, 3, font4);
                    mo512a(pdfPTable5, "", 0, 3, font4, this.f465D);
                } else {
                    mo538b(pdfPTable5, "", 0, 3, font4);
                    mo538b(pdfPTable5, "", 0, 3, font4);
                    mo539b(pdfPTable5, "", 0, 3, font4, 2131623937);
                }
                String str16 = str11;
                if (f457q.equals(str16)) {
                    str4 = str16;
                    mo513a(pdfPTable5, this.f480y, 0, 3, font4, true);
                    mo513a(pdfPTable5, this.f462A, 0, 3, font4, true);
                    mo513a(pdfPTable5, this.f464C, 0, 3, font4, true);
                } else {
                    str4 = str16;
                }
                mo513a(pdfPTable5, "", 0, 4, font4, true);
            } else {
                str4 = str15;
                str3 = str14;
                paragraph = paragraph2;
            }
            mo510a(pdfPTable5, str, 1, 4, font4);
            PdfPCell pdfPCell = new PdfPCell(pdfPTable5);
            pdfPCell.setColspan(4);
            pdfPTable6.addCell(pdfPCell);
            if (f457q.equals(str4)) {
                mo510a(pdfPTable6, this.f478w.getString(2131755409), 1, 1, font4);
                if (d >= 0.0d) {
                    str10 = "";
                    i4 = 1;
                    i5 = 1;
                    i6 = this.f479x[2];
                } else {
                    str10 = "";
                    i4 = 1;
                    i5 = 1;
                    i6 = this.f479x[c];
                }
                mo511a(pdfPTable6, str10, i4, i5, font4, i6);
                mo510a(pdfPTable6, this.f478w.getString(2131755407), 1, 1, font4);
                mo510a(pdfPTable6, this.f478w.getString(2131755248), 0, 1, font4);
            } else {
                mo510a(pdfPTable6, this.f478w.getString(2131755248), 2, 1, font4);
                mo510a(pdfPTable6, this.f478w.getString(2131755407), 1, 1, font4);
                if (d >= 0.0d) {
                    str9 = "";
                    i = 1;
                    i2 = 1;
                    i3 = this.f479x[2];
                } else {
                    str9 = "";
                    i = 1;
                    i2 = 1;
                    i3 = this.f479x[c];
                }
                mo511a(pdfPTable6, str9, i, i2, font4, i3);
                mo510a(pdfPTable6, this.f478w.getString(2131755409), 1, 1, font4);
            }
            pdfPTable6.setHeaderRows(this.f466E + 1);
            for (int i10 = 0; i10 < expandableListView.getAdapter().getCount(); i10++) {
                C0208KL kl = (C0208KL) expandableListView.getAdapter().getItem(i10);
                if (f457q.equals(str4)) {
                    mo510a(pdfPTable6, kl.mo672c(), 1, 1, font);
                    if (kl.mo676g() == this.f479x[c]) {
                        E2 = mo597m();
                    } else {
                        if (kl.mo676g() == this.f479x[2]) {
                            E2 = mo455E();
                        }
                        mo510a(pdfPTable6, kl.mo668a(), 0, 1, font);
                        mo510a(pdfPTable6, kl.mo675f(), 0, 1, font);
                    }
                    mo510a(pdfPTable6, E2, 0, 1, font);
                    mo510a(pdfPTable6, kl.mo668a(), 0, 1, font);
                    mo510a(pdfPTable6, kl.mo675f(), 0, 1, font);
                } else {
                    mo510a(pdfPTable6, kl.mo675f(), 2, 1, font);
                    mo510a(pdfPTable6, kl.mo668a(), 2, 1, font);
                    if (kl.mo676g() == this.f479x[c]) {
                        E = mo597m();
                    } else {
                        if (kl.mo676g() == this.f479x[2]) {
                            E = mo455E();
                        }
                        mo510a(pdfPTable6, kl.mo672c(), 1, 1, font);
                    }
                    mo510a(pdfPTable6, E, 2, 1, font);
                    mo510a(pdfPTable6, kl.mo672c(), 1, 1, font);
                }
            }
            String str17 = " ";
            if (f457q.equals(str4)) {
                if (d >= 0.0d) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(mo448B(String.valueOf(Math.abs(d))));
                    if (!f451k) {
                        str8 = str3;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str17);
                        sb5.append(str12);
                        str8 = sb5.toString();
                    }
                    sb4.append(str8);
                    mo510a(pdfPTable6, sb4.toString(), 1, 1, font4);
                    n = mo456F();
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(mo448B(String.valueOf(Math.abs(d))));
                    if (!f451k) {
                        str7 = str3;
                    } else {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(str17);
                        sb7.append(str12);
                        str7 = sb7.toString();
                    }
                    sb6.append(str7);
                    mo510a(pdfPTable6, sb6.toString(), 1, 1, font4);
                    n = mo601n();
                }
                mo510a(pdfPTable6, n, 0, 3, font4);
            } else {
                if (d >= 0.0d) {
                    mo510a(pdfPTable6, mo456F(), 2, 3, font4);
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(mo448B(String.valueOf(Math.abs(d))));
                    if (!f451k) {
                        str6 = str3;
                    } else {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(str17);
                        sb9.append(str12);
                        str6 = sb9.toString();
                    }
                    sb8.append(str6);
                    sb2 = sb8.toString();
                } else {
                    mo510a(pdfPTable6, mo601n(), 2, 3, font4);
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(mo448B(String.valueOf(Math.abs(d))));
                    if (!f451k) {
                        str5 = str3;
                    } else {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append(str17);
                        sb11.append(str12);
                        str5 = sb11.toString();
                    }
                    sb10.append(str5);
                    sb2 = sb10.toString();
                }
                mo510a(pdfPTable6, sb2, 1, 1, font4);
            }
            paragraph.add(pdfPTable6);
            document.add(paragraph);
            document.close();
            return;
        } catch (DocumentException e) {
            DocumentException documentException = e;
            StringBuilder sb12 = new StringBuilder();
            sb12.append("DocumentException:");
            sb12.append(documentException);
            sb = sb12.toString();
        } catch (IOException e2) {
            IOException iOException = e2;
            StringBuilder sb13 = new StringBuilder();
            sb13.append("ioException:");
            sb13.append(iOException);
            sb = sb13.toString();
        } catch (Throwable th) {
            throw th;
        }
        Log.e(str13, sb);
    }

    /* renamed from: b */
    public void mo537b(ListView listView, String str, double d, String str2) {
        String str3;
        String sb;
        Font font;
        String str4;
        String sb2;
        String n;
        Document document;
        String str5 = str2;
        String str6 = "";
        Document document2 = new Document();
        new DecimalFormat("0.00");
        try {
            File file = new File(f441a);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(".pdf");
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, sb3.toString()));
            BaseFont createFont = BaseFont.createFont("assets/fonts/Tahoma.ttf", "Identity-H", true);
            Font font2 = new Font(createFont, 12.0f);
            new Font(createFont, 12.0f, 1, new BaseColor(0, 0, 0));
            Font font3 = new Font(createFont, 13.0f, 1, new BaseColor(0, 0, 255));
            new Font(createFont, 13.0f, 1, new BaseColor(255, 0, 0));
            new Font(createFont, 13.0f, 1, new BaseColor(0, 255, 0));
            Font font4 = new Font(createFont, 13.0f, 1, new BaseColor(255, 255, 255));
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f478w);
            this.f480y = defaultSharedPreferences.getString("prefUsername", str6);
            this.f462A = defaultSharedPreferences.getString("prefAddress", str6);
            this.f464C = defaultSharedPreferences.getString("prefPhone", str6);
            this.f467F = Boolean.valueOf(defaultSharedPreferences.getBoolean("prefPrintUser", false));
            this.f468G = Boolean.valueOf(defaultSharedPreferences.getBoolean("prefPrintDate", false));
            this.f466E = Integer.parseInt(defaultSharedPreferences.getString("prefSyncFrequency", "1"));
            this.f465D = mo609q("ImageDecode", "0");
            PdfWriter.getInstance(document2, fileOutputStream).setPageEvent(new C0196a());
            document2.open();
            document2.setPageSize(PageSize.A4);
            Paragraph paragraph = new Paragraph(str6);
            paragraph.setAlignment(1);
            float[] fArr = {2.0f, 2.0f, 4.5f, 4.0f, 2.5f};
            float[] fArr2 = {2.0f, 1.5f, 3.0f, 3.0f, 2.5f};
            mo466K();
            if (f457q.equals("R")) {
                fArr = new float[]{2.5f, 4.0f, 4.5f, 2.0f, 2.0f};
                fArr2 = new float[]{2.5f, 3.0f, 3.0f, 1.5f, 2.0f};
            }
            PdfPTable pdfPTable = new PdfPTable(fArr);
            PdfPTable pdfPTable2 = new PdfPTable(fArr2);
            pdfPTable.setWidthPercentage(100.0f);
            pdfPTable2.setWidthPercentage(100.0f);
            int i = 0;
            while (i < this.f466E - 1) {
                PdfPTable pdfPTable3 = pdfPTable2;
                int i2 = i;
                Paragraph paragraph2 = paragraph;
                Font font5 = font4;
                mo510a(pdfPTable2, "", 0, 5, font3);
                i = i2 + 1;
                font4 = font5;
                pdfPTable2 = pdfPTable3;
                paragraph = paragraph2;
            }
            PdfPTable pdfPTable4 = pdfPTable2;
            Paragraph paragraph3 = paragraph;
            Font font6 = font4;
            String str7 = "L";
            if (this.f467F.booleanValue()) {
                if (f457q.equals("R")) {
                    str4 = str7;
                    font = font3;
                    mo513a(pdfPTable4, this.f480y, 2, 2, font3, true);
                    mo513a(pdfPTable4, this.f462A, 2, 2, font, true);
                    mo513a(pdfPTable4, this.f464C, 2, 2, font, true);
                } else {
                    str4 = str7;
                    font = font3;
                }
                if (!this.f465D.equals("0")) {
                    mo538b(pdfPTable4, "", 0, 3, font);
                    mo538b(pdfPTable4, "", 0, 3, font);
                    mo512a(pdfPTable4, "", 1, 3, font, this.f465D);
                } else {
                    mo538b(pdfPTable4, "", 0, 3, font);
                    mo538b(pdfPTable4, "", 0, 3, font);
                    mo539b(pdfPTable4, "", 1, 3, font, 2131623937);
                }
                if (f457q.equals(str4)) {
                    mo513a(pdfPTable4, this.f480y, 0, 2, font, true);
                    mo513a(pdfPTable4, this.f462A, 0, 2, font, true);
                    mo513a(pdfPTable4, this.f464C, 0, 2, font, true);
                }
                mo513a(pdfPTable4, "", 0, 5, font, true);
            } else {
                str4 = str7;
                font = font3;
            }
            mo510a(pdfPTable4, str, 1, 5, font);
            PdfPCell pdfPCell = new PdfPCell(pdfPTable4);
            pdfPCell.setColspan(5);
            pdfPTable.addCell(pdfPCell);
            if (f457q.equals(str4)) {
                mo510a(pdfPTable, mo597m(), 1, 1, font);
                mo510a(pdfPTable, mo455E(), 1, 1, font);
                mo510a(pdfPTable, this.f478w.getString(2131755415), 1, 1, font);
                mo510a(pdfPTable, this.f478w.getString(2131755154), 0, 1, font);
                mo510a(pdfPTable, this.f478w.getString(2131755411), 0, 1, font);
            } else {
                mo510a(pdfPTable, this.f478w.getString(2131755411), 2, 1, font);
                mo510a(pdfPTable, this.f478w.getString(2131755154), 2, 1, font);
                mo510a(pdfPTable, this.f478w.getString(2131755415), 1, 1, font);
                mo510a(pdfPTable, mo455E(), 1, 1, font);
                mo510a(pdfPTable, mo597m(), 1, 1, font);
            }
            pdfPTable.setHeaderRows(this.f466E + 1);
            double d2 = 0.0d;
            double d3 = 0.0d;
            int i3 = 0;
            while (i3 < listView.getAdapter().getCount()) {
                C0259ML ml = (C0259ML) listView.getAdapter().getItem(i3);
                String str8 = ",";
                if (f457q.equals(str4)) {
                    if (ml.mo887f() == this.f479x[0]) {
                        document = document2;
                        String str9 = str8;
                        mo510a(pdfPTable, ml.mo882a(), 1, 1, font2);
                        mo510a(pdfPTable, "0", 1, 1, font6);
                        d2 += Double.parseDouble(ml.mo882a().replaceAll(str9, str6));
                    } else {
                        document = document2;
                        String str10 = str8;
                        mo510a(pdfPTable, "0", 1, 1, font6);
                        mo510a(pdfPTable, ml.mo882a(), 1, 1, font2);
                        d3 += Double.parseDouble(ml.mo882a().replaceAll(str10, str6));
                    }
                    mo510a(pdfPTable, ml.mo886e(), 0, 1, font2);
                    mo510a(pdfPTable, ml.mo885d(), 0, 1, font2);
                    mo510a(pdfPTable, ml.mo883b(), 0, 1, font2);
                } else {
                    document = document2;
                    String str11 = str8;
                    mo510a(pdfPTable, ml.mo883b(), 2, 1, font2);
                    mo510a(pdfPTable, ml.mo885d(), 2, 1, font2);
                    mo510a(pdfPTable, ml.mo886e(), 2, 1, font2);
                    if (ml.mo887f() == this.f479x[0]) {
                        mo510a(pdfPTable, "0", 1, 1, font6);
                        mo510a(pdfPTable, ml.mo882a(), 1, 1, font2);
                        d2 += Double.parseDouble(ml.mo882a().replaceAll(str11, str6));
                    } else {
                        mo510a(pdfPTable, ml.mo882a(), 1, 1, font2);
                        mo510a(pdfPTable, "0", 1, 1, font6);
                        d3 += Double.parseDouble(ml.mo882a().replaceAll(str11, str6));
                    }
                }
                i3++;
                document2 = document;
            }
            Document document3 = document2;
            if (f457q.equals(str4)) {
                mo510a(pdfPTable, mo448B(String.valueOf(d2)), 1, 1, font);
                mo510a(pdfPTable, mo448B(String.valueOf(d3)), 1, 1, font);
                mo510a(pdfPTable, this.f478w.getString(2131755405), 0, 3, font);
            } else {
                mo510a(pdfPTable, this.f478w.getString(2131755405), 2, 3, font);
                mo510a(pdfPTable, mo448B(String.valueOf(d3)), 1, 1, font);
                mo510a(pdfPTable, mo448B(String.valueOf(d2)), 1, 1, font);
            }
            if (f457q.equals(str4)) {
                if (d >= 0.0d) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(mo448B(String.valueOf(Math.abs(d))));
                    if (f451k) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(" ");
                        sb5.append(str5);
                        str6 = sb5.toString();
                    }
                    sb4.append(str6);
                    mo510a(pdfPTable, sb4.toString(), 1, 3, font);
                    n = mo456F();
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(mo448B(String.valueOf(Math.abs(d))));
                    if (f451k) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(" ");
                        sb7.append(str5);
                        str6 = sb7.toString();
                    }
                    sb6.append(str6);
                    mo510a(pdfPTable, sb6.toString(), 1, 3, font);
                    n = mo601n();
                }
                mo510a(pdfPTable, n, 0, 2, font);
            } else {
                if (d >= 0.0d) {
                    mo510a(pdfPTable, mo456F(), 2, 2, font);
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(mo448B(String.valueOf(Math.abs(d))));
                    if (f451k) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(" ");
                        sb9.append(str5);
                        str6 = sb9.toString();
                    }
                    sb8.append(str6);
                    sb2 = sb8.toString();
                } else {
                    mo510a(pdfPTable, mo601n(), 2, 2, font);
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(mo448B(String.valueOf(Math.abs(d))));
                    if (f451k) {
                        StringBuilder sb11 = new StringBuilder();
                        sb11.append(" ");
                        sb11.append(str5);
                        str6 = sb11.toString();
                    }
                    sb10.append(str6);
                    sb2 = sb10.toString();
                }
                mo510a(pdfPTable, sb2, 1, 3, font);
            }
            Paragraph paragraph4 = paragraph3;
            paragraph4.add(pdfPTable);
            Document document4 = document3;
            document4.add(paragraph4);
            document4.close();
            return;
        } catch (DocumentException e) {
            DocumentException documentException = e;
            str3 = "PDFCreator";
            StringBuilder sb12 = new StringBuilder();
            sb12.append("DocumentException:");
            sb12.append(documentException);
            sb = sb12.toString();
        } catch (IOException e2) {
            IOException iOException = e2;
            str3 = "PDFCreator";
            StringBuilder sb13 = new StringBuilder();
            sb13.append("ioException:");
            sb13.append(iOException);
            sb = sb13.toString();
        } catch (Throwable th) {
            throw th;
        }
        Log.e(str3, sb);
    }

    /* renamed from: b */
    public final void mo538b(PdfPTable pdfPTable, String str, int i, int i2, Font font) {
        PdfPCell pdfPCell = new PdfPCell(new Phrase(str.trim(), font));
        pdfPCell.setRunDirection(3);
        pdfPCell.setHorizontalAlignment(i);
        pdfPCell.setVerticalAlignment(5);
        pdfPCell.setPadding(5.0f);
        pdfPCell.setRowspan(i2);
        if (str.trim().equalsIgnoreCase("")) {
            pdfPCell.setMinimumHeight(10.0f);
            pdfPCell.setBorder(0);
        }
        pdfPTable.addCell(pdfPCell);
    }

    /* renamed from: b */
    public final void mo539b(PdfPTable pdfPTable, String str, int i, int i2, Font font, int i3) {
        Image image;
        Bitmap bitmap = ((BitmapDrawable) this.f478w.getResources().getDrawable(i3)).getBitmap();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        try {
            image = Image.getInstance(byteArrayOutputStream.toByteArray());
        } catch (BadElementException | IOException unused) {
            image = null;
        }
        image.scaleToFit(70.0f, 70.0f);
        image.setAlignment(5);
        PdfPCell pdfPCell = new PdfPCell(image);
        pdfPCell.setRunDirection(3);
        pdfPCell.setHorizontalAlignment(i);
        pdfPCell.setVerticalAlignment(5);
        pdfPCell.setRowspan(i2);
        pdfPCell.setBorder(0);
        pdfPTable.addCell(pdfPCell);
    }

    /* renamed from: b */
    public final void mo540b(PdfPTable pdfPTable, String str, int i, int i2, Font font, boolean z) {
        PdfPCell pdfPCell = new PdfPCell(new Phrase(str.trim(), font));
        pdfPCell.setRunDirection(3);
        pdfPCell.setHorizontalAlignment(i);
        pdfPCell.setVerticalAlignment(5);
        pdfPCell.setPadding(5.0f);
        pdfPCell.setRowspan(i2);
        if (str.trim().equalsIgnoreCase("") || z) {
            pdfPCell.setMinimumHeight(10.0f);
            pdfPCell.setBorder(0);
        }
        pdfPTable.addCell(pdfPCell);
    }

    /* renamed from: b */
    public void mo541b(String str) {
        if (str.length() != 0) {
            this.f478w.startActivity(new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, null)));
        }
    }

    /* renamed from: b */
    public void mo542b(String str, String str2) {
        this.f477v.beginTransaction();
        try {
            SQLiteDatabase sQLiteDatabase = this.f477v;
            StringBuilder sb = new StringBuilder();
            sb.append("insert into transactions (cus_id,out,[in],remarks,date_)select  cus_id, abs(sum([in]*out)) out, (case when sum([in]*out)>=0 then 1 else -1 end ) [in], '");
            sb.append(str2);
            sb.append("',strftime('%d-%m-%Y','now')  from transactions  where cus_id='");
            sb.append(str);
            sb.append("'group by cus_id");
            sQLiteDatabase.execSQL(sb.toString());
            SQLiteDatabase sQLiteDatabase2 = this.f477v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("delete   from  transactions  where cus_id='");
            sb2.append(str);
            sb2.append("' and id <>(select max(id) from transactions  where cus_id='");
            sb2.append(str);
            sb2.append("')");
            sQLiteDatabase2.execSQL(sb2.toString());
            this.f477v.setTransactionSuccessful();
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.f477v.endTransaction();
            throw th;
        }
        this.f477v.endTransaction();
    }

    /* renamed from: b */
    public void mo543b(String str, boolean z) {
        try {
            Editor edit = PreferenceManager.getDefaultSharedPreferences(this.f478w.getApplicationContext()).edit();
            edit.putBoolean(str, z);
            edit.commit();
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(25:1|2|3|(2:5|6)|7|(1:9)|10|11|(4:13|14|15|(2:19|20))|21|(1:23)(1:24)|25|26|(6:29|30|31|50|32|27)|49|34|35|36|(1:38)|39|40|(1:42)|43|(1:45)|46) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00eb */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0107 A[Catch:{ Exception -> 0x0136 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0114 A[Catch:{ Exception -> 0x0136 }] */
    /* renamed from: ba */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo544ba() {
        /*
            r12 = this;
            java.lang.String r0 = "auto_drive_date_request"
            java.lang.String r1 = "auto_drive_date_save"
            java.lang.String r2 = "' "
            java.lang.String r3 = "select * from app_ver  where name='"
            java.lang.String r4 = "dd-MM-yyyy"
            java.lang.String r5 = "A1.10001"
            java.lang.String r6 = "trace_S_Upgrade="
            java.lang.String r7 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.m2279h()     // Catch:{ Exception -> 0x0136 }
            android.util.Log.d(r6, r7)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r6 = "select * from transactions where out<0 "
            int r6 = r12.mo452D(r6)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r7 = "trace_E_Upgrade="
            if (r6 <= 0) goto L_0x002b
            java.lang.String r6 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.m2279h()     // Catch:{ Exception -> 0x0136 }
            android.util.Log.d(r7, r6)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r6 = "update transactions set out=abs(out) where out<0"
            r12.mo562d(r6)     // Catch:{ Exception -> 0x0136 }
        L_0x002b:
            java.lang.String r6 = "select distinct curr_id from transactions  "
            int r6 = r12.mo452D(r6)     // Catch:{ Exception -> 0x0136 }
            r8 = 1
            if (r6 <= r8) goto L_0x003b
            java.lang.String r6 = "prefOthers_currency"
            r12.mo543b(r6, r8)     // Catch:{ Exception -> 0x0136 }
            f451k = r8     // Catch:{ Exception -> 0x0136 }
        L_0x003b:
            java.util.Calendar r6 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x0136 }
            java.text.SimpleDateFormat r9 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0136 }
            java.util.Locale r10 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0136 }
            r9.<init>(r4, r10)     // Catch:{ Exception -> 0x0136 }
            java.util.Date r6 = r6.getTime()     // Catch:{ Exception -> 0x0136 }
            java.lang.String r6 = r9.format(r6)     // Catch:{ Exception -> 0x0136 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0136 }
            r9.<init>()     // Catch:{ Exception -> 0x0136 }
            r9.append(r3)     // Catch:{ Exception -> 0x0136 }
            r9.append(r5)     // Catch:{ Exception -> 0x0136 }
            r9.append(r2)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0136 }
            int r9 = r12.mo452D(r9)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r10 = "upgrad_db_date"
            java.lang.String r11 = ""
            if (r9 != r8) goto L_0x0084
            java.lang.String r9 = "select * from sqlite_master where type='view' and name='cus_tr_curr_view'"
            int r9 = r12.mo452D(r9)     // Catch:{ Exception -> 0x0136 }
            if (r9 != r8) goto L_0x0084
            java.lang.String r9 = r12.mo609q(r10, r11)     // Catch:{ Exception -> 0x0136 }
            boolean r9 = r9.equals(r6)     // Catch:{ Exception -> 0x0136 }
            if (r9 == 0) goto L_0x0084
            java.lang.String r0 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.m2279h()     // Catch:{ Exception -> 0x0136 }
            android.util.Log.d(r7, r0)     // Catch:{ Exception -> 0x0136 }
            return
        L_0x0084:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0136 }
            r9.<init>()     // Catch:{ Exception -> 0x0136 }
            r9.append(r3)     // Catch:{ Exception -> 0x0136 }
            r9.append(r5)     // Catch:{ Exception -> 0x0136 }
            r9.append(r2)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r2 = r9.toString()     // Catch:{ Exception -> 0x0136 }
            int r2 = r12.mo452D(r2)     // Catch:{ Exception -> 0x0136 }
            if (r2 != r8) goto L_0x00a0
            r12.mo631x(r10, r6)     // Catch:{ Exception -> 0x0136 }
            goto L_0x00a3
        L_0x00a0:
            r12.mo631x(r10, r11)     // Catch:{ Exception -> 0x0136 }
        L_0x00a3:
            android.content.Context r2 = r12.f478w     // Catch:{ Throwable -> 0x00eb }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Throwable -> 0x00eb }
            r3 = 2131689472(0x7f0f0000, float:1.900796E38)
            java.io.InputStream r2 = r2.openRawResource(r3)     // Catch:{ Throwable -> 0x00eb }
            javax.xml.parsers.DocumentBuilderFactory r3 = javax.xml.parsers.DocumentBuilderFactory.newInstance()     // Catch:{ Throwable -> 0x00eb }
            javax.xml.parsers.DocumentBuilder r3 = r3.newDocumentBuilder()     // Catch:{ Throwable -> 0x00eb }
            r5 = 0
            org.w3c.dom.Document r2 = r3.parse(r2, r5)     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r3 = "statement"
            org.w3c.dom.NodeList r2 = r2.getElementsByTagName(r3)     // Catch:{ Throwable -> 0x00eb }
            r3 = 0
            r5 = 0
        L_0x00c4:
            int r6 = r2.getLength()     // Catch:{ Throwable -> 0x00eb }
            if (r5 >= r6) goto L_0x00e0
            org.w3c.dom.Node r6 = r2.item(r5)     // Catch:{ Throwable -> 0x00eb }
            org.w3c.dom.NodeList r6 = r6.getChildNodes()     // Catch:{ Throwable -> 0x00eb }
            org.w3c.dom.Node r6 = r6.item(r3)     // Catch:{ Throwable -> 0x00eb }
            java.lang.String r6 = r6.getNodeValue()     // Catch:{ Throwable -> 0x00eb }
            r12.mo562d(r6)     // Catch:{ Exception -> 0x00dd }
        L_0x00dd:
            int r5 = r5 + 1
            goto L_0x00c4
        L_0x00e0:
            java.lang.String r2 = "select * from sqlite_master where type='table'  and name='transactions_bk4'"
            int r2 = r12.mo452D(r2)     // Catch:{ Throwable -> 0x00eb }
            if (r2 != 0) goto L_0x00eb
            r12.mo483U()     // Catch:{ Throwable -> 0x00eb }
        L_0x00eb:
            android.text.format.DateFormat r2 = new android.text.format.DateFormat     // Catch:{ Exception -> 0x0136 }
            r2.<init>()     // Catch:{ Exception -> 0x0136 }
            java.util.Date r2 = new java.util.Date     // Catch:{ Exception -> 0x0136 }
            r2.<init>()     // Catch:{ Exception -> 0x0136 }
            java.lang.CharSequence r2 = android.text.format.DateFormat.format(r4, r2)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0136 }
            java.lang.String r3 = r12.mo609q(r1, r11)     // Catch:{ Exception -> 0x0136 }
            boolean r3 = r3.equals(r11)     // Catch:{ Exception -> 0x0136 }
            if (r3 == 0) goto L_0x010a
            r12.mo631x(r1, r2)     // Catch:{ Exception -> 0x0136 }
        L_0x010a:
            java.lang.String r1 = r12.mo609q(r0, r11)     // Catch:{ Exception -> 0x0136 }
            boolean r1 = r1.equals(r11)     // Catch:{ Exception -> 0x0136 }
            if (r1 == 0) goto L_0x0117
            r12.mo631x(r0, r2)     // Catch:{ Exception -> 0x0136 }
        L_0x0117:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0136 }
            r0.<init>()     // Catch:{ Exception -> 0x0136 }
            java.lang.String r1 = com.valdio.valdioveliu.recyclerview.FragmentStatePagerSupport_Main.m2279h()     // Catch:{ Exception -> 0x0136 }
            r0.append(r1)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r1 = ":"
            r0.append(r1)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r1 = r12.mo609q(r10, r11)     // Catch:{ Exception -> 0x0136 }
            r0.append(r1)     // Catch:{ Exception -> 0x0136 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0136 }
            android.util.Log.d(r7, r0)     // Catch:{ Exception -> 0x0136 }
        L_0x0136:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo544ba():void");
    }

    /* renamed from: c */
    public Cursor mo545c(String str, String str2) {
        mo477R();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        sb.append(str3);
        sb.append(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(str2);
        Cursor rawQuery = sQLiteDatabase.rawQuery("select distinct d.name from transactions a,customers b,groups c,currency d where (a.cus_id=b.id or a.t_cus_id=b.id) and b.g_id=c.id and a.curr_id=d.id and b.id=? and d.name=? ", new String[]{sb.toString(), sb2.toString()});
        mo532b();
        return rawQuery;
    }

    /* renamed from: c */
    public Cursor mo546c(String str, String str2, String str3) {
        mo477R();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str4 = ":";
        sb.append(str4);
        sb.append(str2);
        sb.append(str4);
        sb.append(str3);
        Log.d("Inputs=", sb.toString());
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb2 = new StringBuilder();
        String str5 = "";
        sb2.append(str5);
        sb2.append(str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str5);
        sb3.append(str3);
        Cursor rawQuery = sQLiteDatabase.rawQuery("select distinct d.name from transactions a,customers b,groups c,currency d where (a.cus_id=b.id or a.t_cus_id=b.id) and b.g_id=c.id and a.curr_id=d.id and c.id=?  and d.name<>? ", new String[]{sb2.toString(), sb3.toString()});
        mo532b();
        return rawQuery;
    }

    /* renamed from: c */
    public Cursor mo547c(String str, String str2, String str3, String str4) {
        String str5 = Value.PERCENTAGE;
        String str6 = " SELECT a.ID as _id, a.date_ as date_,abs(a.out * a.[in]) as amount ,(case when (a.t_cus_id=b.id) then 'من '||(select name from customers where id=a.cus_id)||'//'||a.remarks  when (a.cus_id=b.id and a.t_cus_id is not null) then 'لـ '||(select name from customers where id=a.t_cus_id)||'//'||a.remarks   else (a.remarks) end)  as remarks  ,(case when (a.t_cus_id=b.id) then 0 else  (a.[in]+1) end)  as _in,0 as Bal, strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d,substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1  FROM transactions AS a, customers AS b ,currency d WHERE (a.cus_id = b.id or a.t_cus_id=b.id) and a.curr_id=d.id ";
        String str7 = " ORDER BY (d2) desc ,1 desc ";
        if (str2.equals(str5) && str3.equals(str5)) {
            SQLiteDatabase sQLiteDatabase = this.f477v;
            StringBuilder sb = new StringBuilder();
            sb.append(str6);
            sb.append("  and b.g_id=?  and d.name=? ");
            sb.append(str7);
            return sQLiteDatabase.rawQuery(sb.toString(), new String[]{str, str4});
        } else if (str2.equals(str5) && !str3.equals(str5)) {
            SQLiteDatabase sQLiteDatabase2 = this.f477v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str6);
            sb2.append(" and b.g_id=? and d.name=? and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) <= ?  ");
            sb2.append(str7);
            return sQLiteDatabase2.rawQuery(sb2.toString(), new String[]{str, str4, str3});
        } else if (str2.equals(str5) || !str3.equals(str5)) {
            SQLiteDatabase sQLiteDatabase3 = this.f477v;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str6);
            sb3.append(" and b.g_id=? and d.name=? and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) between ? and ? ");
            sb3.append(str7);
            return sQLiteDatabase3.rawQuery(sb3.toString(), new String[]{str, str4, str2, str3});
        } else {
            SQLiteDatabase sQLiteDatabase4 = this.f477v;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str6);
            sb4.append(" and b.g_id=? and d.name=? and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) >= ?  ");
            sb4.append(str7);
            return sQLiteDatabase4.rawQuery(sb4.toString(), new String[]{str, str4, str2});
        }
    }

    /* renamed from: c */
    public String mo548c(int i) {
        mo477R();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        Cursor rawQuery = sQLiteDatabase.rawQuery("select ifnull(remarks,'0') as _id from transactions where id=?  ", new String[]{sb.toString()});
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            str = rawQuery.getString(rawQuery.getColumnIndex("_id"));
            rawQuery.moveToNext();
        }
        mo532b();
        rawQuery.close();
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a9, code lost:
        if (f451k == true) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ca, code lost:
        if (f451k == true) goto L_0x00cc;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public String mo549c(p000.C0232LL r8, String r9, double r10) {
        /*
            r7 = this;
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            android.content.Context r0 = r7.f478w
            r1 = 2131755301(0x7f100125, float:1.9141477E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "prefUsername"
            java.lang.String r1 = r7.mo609q(r1, r0)
            boolean r0 = r1.equals(r0)
            java.lang.String r2 = "\n"
            java.lang.String r3 = " "
            if (r0 != 0) goto L_0x004a
            int r0 = r1.length()
            if (r0 == 0) goto L_0x004a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            android.content.Context r4 = r7.f478w
            r5 = 2131755157(0x7f100095, float:1.9141185E38)
            java.lang.String r4 = r4.getString(r5)
            r0.append(r4)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.append(r0)
            r9.append(r2)
        L_0x004a:
            int r0 = r8.mo780k()
            int[] r1 = r7.f479x
            r4 = 0
            r1 = r1[r4]
            if (r0 == r1) goto L_0x005a
            java.lang.String r0 = r7.mo597m()
            goto L_0x005e
        L_0x005a:
            java.lang.String r0 = r7.mo455E()
        L_0x005e:
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = r8.mo775f()
            r9.append(r0)
            boolean r0 = f451k
            java.lang.String r1 = ""
            r4 = 1
            if (r0 != r4) goto L_0x0077
            java.lang.String r0 = r8.mo766a()
            goto L_0x0078
        L_0x0077:
            r0 = r1
        L_0x0078:
            r9.append(r0)
            r9.append(r3)
            java.lang.String r0 = r8.mo779j()
            r9.append(r0)
            r5 = 0
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00ac
            r9.append(r2)
            java.lang.String r0 = r7.mo456F()
            r9.append(r0)
            r9.append(r3)
            double r10 = java.lang.Math.abs(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r7.mo448B(r10)
            r9.append(r10)
            boolean r10 = f451k
            if (r10 != r4) goto L_0x00d0
            goto L_0x00cc
        L_0x00ac:
            r9.append(r2)
            java.lang.String r0 = r7.mo601n()
            r9.append(r0)
            r9.append(r3)
            double r10 = java.lang.Math.abs(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r7.mo448B(r10)
            r9.append(r10)
            boolean r10 = f451k
            if (r10 != r4) goto L_0x00d0
        L_0x00cc:
            java.lang.String r1 = r8.mo766a()
        L_0x00d0:
            r9.append(r1)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "sms_body2="
            android.util.Log.d(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo549c(LL, java.lang.String, double):java.lang.String");
    }

    /* renamed from: c */
    public void mo550c() {
        SQLiteDatabase sQLiteDatabase = this.f477v;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    /* renamed from: c */
    public void mo551c(Context context) {
        String str;
        String str2 = "";
        try {
            Calendar instance = Calendar.getInstance();
            String format = new SimpleDateFormat("dd-MM-yyyy H", Locale.ENGLISH).format(instance.getTime());
            String format2 = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH).format(instance.getTime());
            if ((!mo609q("black_date_done", str2).equals(format2) || mo524a("black_list", false)) && !mo609q("black_date", str2).equals(format) && mo602o(f445e, f446f) != 0 && !mo612r().equals(str2) && !f445e.equals(str2)) {
                try {
                    str = FirebaseInstanceId.getInstance().getToken();
                } catch (Exception unused) {
                    str = str2;
                }
                V a = qa.a(context);
                StringBuilder sb = new StringBuilder();
                sb.append("http://easycard.work/abd/v1/black_list/_ID_/check".replace("_ID_", f445e));
                sb.append("?email=");
                sb.append(mo609q("PREF_ACCOUNT_NAME", str2));
                sb.append("&fcm_token=");
                sb.append(str);
                pa paVar = new pa(0, sb.toString(), new C1118vU(this, format, format2), new C1145wU(this));
                paVar.a(false);
                a.a(paVar);
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: c */
    public void mo552c(Context context, String str) {
        Dialog dialog = new Dialog(context);
        LinearLayout linearLayout = new LinearLayout(context);
        String[] stringArray = context.getResources().getStringArray(2130903060);
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(2130903047);
        ListView listView = new ListView(context);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < stringArray.length; i++) {
            arrayList.add(new C0796gO(stringArray[i], obtainTypedArray.getResourceId(i, -1)));
        }
        obtainTypedArray.recycle();
        listView.setAdapter(new C0063DH(context, arrayList));
        listView.setOnItemClickListener(new C0883kU(this, context, str, dialog));
        linearLayout.setFocusable(true);
        listView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        listView.setDividerHeight(0);
        linearLayout.addView(listView, -1, -1);
        dialog.setTitle(context.getString(2131755074));
        dialog.setContentView(linearLayout);
        dialog.show();
    }

    /* renamed from: c */
    public void mo553c(Context context, String str, int i) {
        Dialog dialog = new Dialog(context);
        LinearLayout linearLayout = new LinearLayout(context);
        String[] stringArray = context.getResources().getStringArray(2130903062);
        TypedArray obtainTypedArray = context.getResources().obtainTypedArray(2130903049);
        ListView listView = new ListView(context);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < stringArray.length; i2++) {
            arrayList.add(new C0796gO(stringArray[i2], obtainTypedArray.getResourceId(i2, -1)));
        }
        obtainTypedArray.recycle();
        listView.setAdapter(new C0063DH(context, arrayList));
        C1098uU uUVar = new C1098uU(this, i, context, str, dialog);
        listView.setOnItemClickListener(uUVar);
        linearLayout.setFocusable(true);
        listView.setBackgroundColor(Color.parseColor("#FFFFFF"));
        listView.setDividerHeight(0);
        linearLayout.addView(listView, -1, -1);
        dialog.requestWindowFeature(1);
        dialog.setContentView(linearLayout);
        dialog.show();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo554c(ExpandableListView expandableListView, String str, double d, String str2) {
        String sb;
        PdfPTable pdfPTable;
        String sb2;
        String n;
        int i;
        String str3 = str;
        String str4 = "PDFCreator";
        String str5 = "L";
        String str6 = "";
        Document document = new Document();
        new DecimalFormat("0.00");
        try {
            File file = new File(f441a);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(".pdf");
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, sb3.toString()));
            BaseFont createFont = BaseFont.createFont("assets/fonts/Tahoma.ttf", "Identity-H", true);
            Font font = new Font(createFont, 12.0f);
            new Font(createFont, 12.0f, 1, new BaseColor(0, 0, 0));
            Font font2 = new Font(createFont, 13.0f, 1, new BaseColor(0, 0, 255));
            new Font(createFont, 13.0f, 1, new BaseColor(255, 0, 0));
            new Font(createFont, 13.0f, 1, new BaseColor(0, 255, 0));
            new Font(createFont, 13.0f, 1, new BaseColor(255, 255, 255));
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.f478w);
            this.f480y = defaultSharedPreferences.getString("prefUsername", str6);
            this.f462A = defaultSharedPreferences.getString("prefAddress", str6);
            this.f464C = defaultSharedPreferences.getString("prefPhone", str6);
            this.f467F = Boolean.valueOf(defaultSharedPreferences.getBoolean("prefPrintUser", false));
            this.f468G = Boolean.valueOf(defaultSharedPreferences.getBoolean("prefPrintDate", false));
            this.f466E = Integer.parseInt(defaultSharedPreferences.getString("prefSyncFrequency", "1"));
            this.f465D = mo609q("ImageDecode", "0");
            PdfWriter.getInstance(document, fileOutputStream).setPageEvent(new C0196a());
            document.open();
            document.setPageSize(PageSize.A4);
            Paragraph paragraph = new Paragraph(str6);
            paragraph.setAlignment(1);
            float[] fArr = {2.0f, 2.0f, 3.0f, 6.0f};
            mo466K();
            if (f457q.equals("R")) {
                fArr = new float[]{6.0f, 3.0f, 2.0f, 2.0f};
            }
            PdfPTable pdfPTable2 = new PdfPTable(fArr);
            pdfPTable2.setWidthPercentage(100.0f);
            pdfPTable2.addCell(mo496a(font2, str3, 4));
            if (f457q.equals(str5)) {
                pdfPTable = pdfPTable2;
                mo510a(pdfPTable2, this.f478w.getString(2131755409), 1, 1, font2);
                mo510a(pdfPTable, mo597m(), 1, 1, font2);
                mo510a(pdfPTable, mo455E(), 1, 1, font2);
                mo510a(pdfPTable, this.f478w.getString(2131755209), 0, 1, font2);
            } else {
                pdfPTable = pdfPTable2;
                mo510a(pdfPTable, this.f478w.getString(2131755209), 2, 1, font2);
                mo510a(pdfPTable, mo455E(), 1, 1, font2);
                mo510a(pdfPTable, mo597m(), 1, 1, font2);
                mo510a(pdfPTable, this.f478w.getString(2131755409), 1, 1, font2);
            }
            PdfPTable pdfPTable3 = pdfPTable;
            pdfPTable3.setHeaderRows(this.f466E + 1);
            double d2 = 0.0d;
            double d3 = 0.0d;
            int i2 = 0;
            while (i2 < expandableListView.getAdapter().getCount()) {
                C0777fO fOVar = (C0777fO) expandableListView.getAdapter().getItem(i2);
                if (f457q.equals(str5)) {
                    i = i2;
                    mo510a(pdfPTable3, fOVar.mo4357g(), 1, 1, font);
                    mo510a(pdfPTable3, fOVar.mo4353c(), 0, 1, font);
                    mo510a(pdfPTable3, fOVar.mo4350a(), 0, 1, font);
                    mo510a(pdfPTable3, fOVar.mo4356f(), 0, 1, font);
                } else {
                    i = i2;
                    mo510a(pdfPTable3, fOVar.mo4356f(), 2, 1, font);
                    mo510a(pdfPTable3, fOVar.mo4350a(), 2, 1, font);
                    mo510a(pdfPTable3, fOVar.mo4353c(), 2, 1, font);
                    mo510a(pdfPTable3, fOVar.mo4357g(), 1, 1, font);
                }
                d3 += Double.parseDouble(fOVar.mo4350a().replaceAll(",", str6));
                d2 += Double.parseDouble(fOVar.mo4353c().replaceAll(",", str6));
                i2 = i + 1;
            }
            if (f457q.equals(str5)) {
                mo510a(pdfPTable3, "#", 1, 1, font);
                mo510a(pdfPTable3, mo448B(String.valueOf(d2)), 1, 1, font2);
                mo510a(pdfPTable3, mo448B(String.valueOf(d3)), 1, 1, font2);
                mo510a(pdfPTable3, this.f478w.getString(2131755405), 0, 1, font2);
            } else {
                mo510a(pdfPTable3, this.f478w.getString(2131755405), 2, 1, font2);
                mo510a(pdfPTable3, mo448B(String.valueOf(d3)), 1, 1, font2);
                mo510a(pdfPTable3, mo448B(String.valueOf(d2)), 1, 1, font2);
                mo510a(pdfPTable3, "#", 1, 1, font);
            }
            if (f457q.equals(str5)) {
                if (d >= 0.0d) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(mo448B(String.valueOf(Math.abs(d))));
                    if (f451k) {
                        str6 = str2;
                    }
                    sb4.append(str6);
                    mo510a(pdfPTable3, sb4.toString(), 1, 3, font2);
                    n = mo456F();
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(mo448B(String.valueOf(Math.abs(d))));
                    if (f451k) {
                        str6 = str2;
                    }
                    sb5.append(str6);
                    mo510a(pdfPTable3, sb5.toString(), 1, 3, font2);
                    n = mo601n();
                }
                mo510a(pdfPTable3, n, 0, 1, font2);
            } else {
                if (d >= 0.0d) {
                    mo510a(pdfPTable3, mo456F(), 2, 1, font2);
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(mo448B(String.valueOf(Math.abs(d))));
                    if (f451k) {
                        str6 = str2;
                    }
                    sb6.append(str6);
                    sb2 = sb6.toString();
                } else {
                    mo510a(pdfPTable3, mo601n(), 2, 1, font2);
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(mo448B(String.valueOf(Math.abs(d))));
                    if (f451k) {
                        str6 = str2;
                    }
                    sb7.append(str6);
                    sb2 = sb7.toString();
                }
                mo510a(pdfPTable3, sb2, 1, 3, font2);
            }
            paragraph.add(pdfPTable3);
            document.add(paragraph);
            document.close();
            return;
        } catch (DocumentException e) {
            DocumentException documentException = e;
            StringBuilder sb8 = new StringBuilder();
            sb8.append("DocumentException:");
            sb8.append(documentException);
            sb = sb8.toString();
        } catch (IOException e2) {
            IOException iOException = e2;
            StringBuilder sb9 = new StringBuilder();
            sb9.append("ioException:");
            sb9.append(iOException);
            sb = sb9.toString();
        } catch (Throwable th) {
            throw th;
        }
        Log.e(str4, sb);
    }

    /* renamed from: d */
    public Cursor mo555d(String str, String str2) {
        mo477R();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        sb.append(str3);
        sb.append(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(str2);
        Cursor rawQuery = sQLiteDatabase.rawQuery("select distinct d.name from transactions a,customers b,groups c,currency d where (a.cus_id=b.id or a.t_cus_id=b.id) and b.g_id=c.id and a.curr_id=d.id and b.id=? and d.name<>? ", new String[]{sb.toString(), sb2.toString()});
        mo532b();
        return rawQuery;
    }

    /* renamed from: d */
    public Cursor mo556d(String str, String str2, String str3, String str4) {
        Cursor cursor;
        mo477R();
        String str5 = Value.PERCENTAGE;
        String str6 = "SELECT 0 as id,  sum(case when a.[in] = 1 and (a.t_cus_id<>b.id or a.t_cus_id is null) then -1*a.out else a.out*1 end)*-1.0 as net_balance , b.name as _id,b.gsm as gsm, sum(case  when a.[in] = 1 and (a.t_cus_id<>b.id or a.t_cus_id is null) then a.out else 0 end)*1.0 as cr_amount , sum(case when not(a.[in] = 1 and (a.t_cus_id<>b.id or a.t_cus_id is null)) then a.out else 0 end )*1.0 as db_amount , d.name curr_name  FROM transactions a,customers b ,currency d where (a.cus_id = b.id or a.t_cus_id=b.id) and a.curr_id=d.id ";
        String str7 = " group by b.name,b.id,b.gsm,d.name,d.id order by b.name ";
        if (str2.equals(str5) && str3.equals(str5)) {
            SQLiteDatabase sQLiteDatabase = this.f477v;
            StringBuilder sb = new StringBuilder();
            sb.append(str6);
            sb.append("  and b.g_id=? and d.name=?  ");
            sb.append(str7);
            cursor = sQLiteDatabase.rawQuery(sb.toString(), new String[]{str, str4});
        } else if (str2.equals(str5) && !str3.equals(str5)) {
            SQLiteDatabase sQLiteDatabase2 = this.f477v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str6);
            sb2.append(" and b.g_id=? and d.name=? and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) <= ?  ");
            sb2.append(str7);
            cursor = sQLiteDatabase2.rawQuery(sb2.toString(), new String[]{str, str4, str3});
        } else if (str2.equals(str5) || !str3.equals(str5)) {
            SQLiteDatabase sQLiteDatabase3 = this.f477v;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str6);
            sb3.append(" and b.g_id=? and d.name=? and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) between ? and ? ");
            sb3.append(str7);
            cursor = sQLiteDatabase3.rawQuery(sb3.toString(), new String[]{str, str4, str2, str3});
        } else {
            SQLiteDatabase sQLiteDatabase4 = this.f477v;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str6);
            sb4.append(" and b.g_id=? and d.name=? and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) >= ?  ");
            sb4.append(str7);
            cursor = sQLiteDatabase4.rawQuery(sb4.toString(), new String[]{str, str4, str2});
        }
        mo532b();
        return cursor;
    }

    /* renamed from: d */
    public String mo557d(int i) {
        mo477R();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        Cursor rawQuery = sQLiteDatabase.rawQuery("select ifnull(param2,'00:00') as _id from transactions where id=?  ", new String[]{sb.toString()});
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            str = rawQuery.getString(rawQuery.getColumnIndex("_id"));
            rawQuery.moveToNext();
        }
        mo532b();
        rawQuery.close();
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e A[Catch:{ Exception -> 0x00a4 }] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public String mo558d(Context r8) {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = ""
            android.content.Context r2 = r7.f478w     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r3 = "phone"
            java.lang.Object r2 = r2.getSystemService(r3)     // Catch:{ Exception -> 0x00a4 }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r3 = r2.getSimCountryIso()     // Catch:{ Exception -> 0x00a4 }
            if (r3 == 0) goto L_0x0023
            java.lang.String r3 = r2.getSimCountryIso()     // Catch:{ Exception -> 0x00a4 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x00a4 }
            if (r3 != 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            java.lang.String r3 = r2.getSimCountryIso()     // Catch:{ Exception -> 0x00a4 }
            goto L_0x0027
        L_0x0023:
            java.lang.String r3 = r2.getNetworkCountryIso()     // Catch:{ Exception -> 0x00a4 }
        L_0x0027:
            r4 = 2
            if (r3 == 0) goto L_0x0037
            int r5 = r3.length()     // Catch:{ Exception -> 0x00a4 }
            if (r5 != r4) goto L_0x0037
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r1 = r3.toLowerCase(r1)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x004f
        L_0x0037:
            int r5 = r2.getPhoneType()     // Catch:{ Exception -> 0x00a4 }
            if (r5 == r4) goto L_0x004f
            java.lang.String r2 = r2.getNetworkCountryIso()     // Catch:{ Exception -> 0x00a4 }
            if (r2 == 0) goto L_0x004f
            int r5 = r2.length()     // Catch:{ Exception -> 0x00a4 }
            if (r5 != r4) goto L_0x004f
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r1 = r2.toLowerCase(r1)     // Catch:{ Exception -> 0x00a4 }
        L_0x004f:
            java.lang.String r2 = "CountryID="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a4 }
            r4.<init>()     // Catch:{ Exception -> 0x00a4 }
            r4.append(r1)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r5 = ":"
            r4.append(r5)     // Catch:{ Exception -> 0x00a4 }
            r4.append(r3)     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x00a4 }
            android.util.Log.d(r2, r3)     // Catch:{ Exception -> 0x00a4 }
            boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x00a4 }
            if (r2 != 0) goto L_0x00a3
            if (r1 != 0) goto L_0x0071
            goto L_0x00a3
        L_0x0071:
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ Exception -> 0x00a4 }
            r2 = 2130903040(0x7f030000, float:1.7412887E38)
            java.lang.String[] r8 = r8.getStringArray(r2)     // Catch:{ Exception -> 0x00a4 }
            r2 = 0
            r3 = 0
        L_0x007d:
            int r4 = r8.length     // Catch:{ Exception -> 0x00a4 }
            if (r3 >= r4) goto L_0x00a3
            r4 = r8[r3]     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r5 = ","
            java.lang.String[] r4 = r4.split(r5)     // Catch:{ Exception -> 0x00a4 }
            r5 = 1
            r5 = r4[r5]     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r5 = r5.trim()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r6 = r1.trim()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r6 = r6.toUpperCase()     // Catch:{ Exception -> 0x00a4 }
            boolean r5 = r5.equals(r6)     // Catch:{ Exception -> 0x00a4 }
            if (r5 == 0) goto L_0x00a0
            r0 = r4[r2]     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00a3
        L_0x00a0:
            int r3 = r3 + 1
            goto L_0x007d
        L_0x00a3:
            return r0
        L_0x00a4:
            r8 = move-exception
            r8.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo558d(android.content.Context):java.lang.String");
    }

    /* renamed from: d */
    public ArrayList<String> mo559d(String str, String str2, String str3) {
        Cursor cursor;
        ArrayList<String> arrayList = new ArrayList<>();
        if (!str2.equals("")) {
            cursor = this.f477v.rawQuery("select  a.remarks,count(*) cnt from transactions a where a.cus_id=(select b.id from customers b where b.name=?) and a.t_cus_id=(select ifnull(b.id,0) from customers b where b.name=?) and a.remarks like ? group by a.remarks order by 2 desc limit 3  ", new String[]{str, str2, str3});
        } else {
            cursor = this.f477v.rawQuery("select  a.remarks,count(*) cnt from transactions a where a.cus_id=(select b.id from customers b where b.name=?) and a.remarks like ? group by a.remarks order by 2 desc  limit 3 ", new String[]{str, str3});
        }
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            arrayList.add(cursor.getString(cursor.getColumnIndex("remarks")));
            cursor.moveToNext();
        }
        cursor.close();
        return arrayList;
    }

    /* renamed from: d */
    public void mo560d() {
        C0288NU.m892a().mo934a(new C0356QU(9, this, this.f478w));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x03f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x03f7, code lost:
        r1 = r0;
        r2 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x03fa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x03fb, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x03fd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0418, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x042f, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x03f6 A[ExcHandler: DocumentException (r0v5 'e' com.itextpdf.text.DocumentException A[CUSTOM_DECLARE]), PHI: r9 
      PHI: (r9v2 java.lang.String) = (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v3 'th' java.lang.String), (r9v3 'th' java.lang.String), (r9v3 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String) binds: [B:3:0x0016, B:10:0x002b, B:15:0x0129, B:16:?, B:20:0x013b, B:34:0x0218, B:35:?, B:37:0x023b, B:26:0x01a3, B:23:0x0156, B:24:?, B:18:0x012d, B:19:?, B:13:0x011b, B:14:?, B:6:0x0021, B:7:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:10:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x03fd A[ExcHandler: IOException (e java.io.IOException), PHI: r9 
      PHI: (r9v1 'th' java.lang.String) = (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v0 'th' java.lang.String), (r9v3 'th' java.lang.String), (r9v3 'th' java.lang.String), (r9v0 'th' java.lang.String) binds: [B:1:0x0014, B:2:?, B:3:0x0016, B:10:0x002b, B:15:0x0129, B:16:?, B:20:0x013b, B:34:0x0218, B:35:?, B:26:0x01a3] A[DONT_GENERATE, DONT_INLINE], Splitter:B:1:0x0014] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo561d(ExpandableListView r29, String r30, double r31, String r33) {
        /*
            r28 = this;
            r8 = r28
            r1 = r30
            java.lang.String r9 = "PDFCreator"
            java.lang.String r7 = ""
            com.itextpdf.text.Document r10 = new com.itextpdf.text.Document
            r10.<init>()
            java.text.DecimalFormat r2 = new java.text.DecimalFormat
            java.lang.String r3 = "0.00"
            r2.<init>(r3)
            java.lang.String r2 = f441a     // Catch:{ DocumentException -> 0x0418, IOException -> 0x03fd }
            java.io.File r3 = new java.io.File     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r3.<init>(r2)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            boolean r2 = r3.exists()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            if (r2 != 0) goto L_0x002b
            r3.mkdirs()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            goto L_0x002b
        L_0x0025:
            r0 = move-exception
            r1 = r0
            r32 = r9
            goto L_0x0401
        L_0x002b:
            java.io.File r2 = new java.io.File     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r4.<init>()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r4.append(r1)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r5 = ".pdf"
            r4.append(r5)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r4 = r4.toString()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r2.<init>(r3, r4)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r3.<init>(r2)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r2 = "assets/fonts/Tahoma.ttf"
            java.lang.String r4 = "Identity-H"
            r11 = 1
            com.itextpdf.text.pdf.BaseFont r2 = com.itextpdf.text.pdf.BaseFont.createFont(r2, r4, r11)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            com.itextpdf.text.Font r12 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r4 = 1094713344(0x41400000, float:12.0)
            r12.<init>(r2, r4)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            com.itextpdf.text.Font r4 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r5 = 1094713344(0x41400000, float:12.0)
            com.itextpdf.text.BaseColor r6 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r13 = 0
            r6.<init>(r13, r13, r13)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r4.<init>(r2, r5, r11, r6)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            com.itextpdf.text.Font r14 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            com.itextpdf.text.BaseColor r4 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r5 = 255(0xff, float:3.57E-43)
            r4.<init>(r13, r13, r5)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r6 = 1095761920(0x41500000, float:13.0)
            r14.<init>(r2, r6, r11, r4)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            com.itextpdf.text.Font r4 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            com.itextpdf.text.BaseColor r15 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r15.<init>(r5, r13, r13)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r4.<init>(r2, r6, r11, r15)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            com.itextpdf.text.Font r4 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            com.itextpdf.text.BaseColor r15 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r15.<init>(r13, r5, r13)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r4.<init>(r2, r6, r11, r15)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            com.itextpdf.text.Font r15 = new com.itextpdf.text.Font     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            com.itextpdf.text.BaseColor r4 = new com.itextpdf.text.BaseColor     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r4.<init>(r5, r5, r5)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r15.<init>(r2, r6, r11, r4)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            android.content.Context r2 = r8.f478w     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            android.content.SharedPreferences r2 = android.preference.PreferenceManager.getDefaultSharedPreferences(r2)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r4 = "prefUsername"
            java.lang.String r4 = r2.getString(r4, r7)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r8.f480y = r4     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r4 = "prefAddress"
            java.lang.String r4 = r2.getString(r4, r7)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r8.f462A = r4     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r4 = "prefPhone"
            java.lang.String r4 = r2.getString(r4, r7)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r8.f464C = r4     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r4 = "prefPrintUser"
            boolean r4 = r2.getBoolean(r4, r13)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r8.f467F = r4     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r4 = "prefPrintDate"
            boolean r4 = r2.getBoolean(r4, r13)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r8.f468G = r4     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r4 = "prefSyncFrequency"
            java.lang.String r5 = "1"
            java.lang.String r2 = r2.getString(r4, r5)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r8.f466E = r2     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r2 = "ImageDecode"
            java.lang.String r4 = "0"
            java.lang.String r2 = r8.mo609q(r2, r4)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r8.f465D = r2     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            com.itextpdf.text.pdf.PdfWriter r2 = com.itextpdf.text.pdf.PdfWriter.getInstance(r10, r3)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            JU$a r3 = new JU$a     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r3.<init>()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r2.setPageEvent(r3)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r10.open()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            com.itextpdf.text.Rectangle r2 = com.itextpdf.text.PageSize.A4     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r10.setPageSize(r2)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            com.itextpdf.text.Paragraph r6 = new com.itextpdf.text.Paragraph     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r6.<init>(r7)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r6.setAlignment(r11)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r2 = 4
            float[] r3 = new float[r2]     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r4 = 1073741824(0x40000000, float:2.0)
            r3[r13] = r4     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r3[r11] = r4     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r5 = 1077936128(0x40400000, float:3.0)
            r16 = 2
            r3[r16] = r5     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r17 = 1086324736(0x40c00000, float:6.0)
            r18 = 3
            r3[r18] = r17     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r28.mo466K()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r4 = f457q     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r5 = "R"
            boolean r4 = r4.equals(r5)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            if (r4 == 0) goto L_0x0129
            float[] r3 = new float[r2]     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r3[r13] = r17     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r4 = 1077936128(0x40400000, float:3.0)
            r3[r11] = r4     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r4 = 1073741824(0x40000000, float:2.0)
            r3[r16] = r4     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r3[r18] = r4     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
        L_0x0129:
            boolean r4 = f451k     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            if (r4 != 0) goto L_0x013b
            float[] r3 = new float[r2]     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r4 = 1073741824(0x40000000, float:2.0)
            r3[r13] = r4     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r3[r11] = r4     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r4 = 1077936128(0x40400000, float:3.0)
            r3[r16] = r4     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r3[r18] = r17     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
        L_0x013b:
            com.itextpdf.text.pdf.PdfPTable r5 = new com.itextpdf.text.pdf.PdfPTable     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r5.<init>(r3)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r3 = 1120403456(0x42c80000, float:100.0)
            r5.setWidthPercentage(r3)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            com.itextpdf.text.pdf.PdfPCell r1 = r8.mo496a(r14, r1, r2)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r5.addCell(r1)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r1 = f457q     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r2 = "L"
            boolean r1 = r1.equals(r2)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            if (r1 == 0) goto L_0x019f
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r2 = 2131755413(0x7f100195, float:1.9141705E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r4 = 1
            r16 = 1
            r1 = r28
            r2 = r5
            r30 = r5
            r5 = r16
            r19 = r6
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            java.lang.String r3 = r28.mo597m()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r30
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            java.lang.String r3 = r28.mo455E()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r30
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r2 = 2131755154(0x7f100092, float:1.914118E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r4 = 0
            r5 = 1
            r1 = r28
            r2 = r30
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            goto L_0x01e5
        L_0x019f:
            r30 = r5
            r19 = r6
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r2 = 2131755154(0x7f100092, float:1.914118E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r4 = 2
            r5 = 1
            r1 = r28
            r2 = r30
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r3 = r28.mo455E()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r30
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r3 = r28.mo597m()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r30
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r2 = 2131755413(0x7f100195, float:1.9141705E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r30
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
        L_0x01e5:
            int r1 = r8.f466E     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            int r1 = r1 + r11
            r11 = r30
            r11.setHeaderRows(r1)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r16 = 0
            r20 = r16
            r22 = r20
            r6 = 0
        L_0x01f4:
            android.widget.ListAdapter r1 = r29.getAdapter()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            int r1 = r1.getCount()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            if (r6 >= r1) goto L_0x033a
            android.widget.ListAdapter r1 = r29.getAdapter()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.Object r1 = r1.getItem(r6)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r18 = r1
            KL r18 = (p000.C0208KL) r18     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r1 = f457q     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r2 = "L"
            boolean r1 = r1.equals(r2)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            java.lang.String r5 = ","
            java.lang.String r4 = "-"
            if (r1 == 0) goto L_0x02b2
            java.lang.String r3 = r18.mo672c()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r24 = 1
            r25 = 1
            r1 = r28
            r2 = r11
            r26 = r4
            r4 = r24
            r27 = r5
            r5 = r25
            r24 = r6
            r6 = r12
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            int r1 = r18.mo676g()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            int[] r2 = r8.f479x     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            r2 = r2[r13]     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x03fd }
            if (r1 != r2) goto L_0x026c
            java.lang.String r1 = r18.mo668a()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r6 = r26
            java.lang.String r3 = r1.replaceAll(r6, r7)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r12
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            java.lang.String r3 = "0"
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            java.lang.String r1 = r18.mo668a()     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            r5 = r27
            java.lang.String r1 = r1.replaceAll(r5, r7)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ DocumentException -> 0x03f6, IOException -> 0x0025 }
            double r20 = r20 + r1
            r32 = r9
            goto L_0x02a1
        L_0x026c:
            r6 = r26
            r5 = r27
            java.lang.String r3 = "0"
            r4 = 1
            r25 = 1
            r1 = r28
            r2 = r11
            r13 = r5
            r5 = r25
            r32 = r9
            r9 = r6
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r1 = r18.mo668a()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r3 = r1.replaceAll(r9, r7)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r12
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r1 = r18.mo668a()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r1 = r1.replaceAll(r13, r7)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            double r22 = r22 + r1
        L_0x02a1:
            java.lang.String r3 = r18.mo675f()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r4 = 0
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r12
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r25 = 0
            goto L_0x0333
        L_0x02b2:
            r13 = r5
            r24 = r6
            r32 = r9
            r9 = r4
            java.lang.String r3 = r18.mo675f()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r4 = 2
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r12
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            int r1 = r18.mo676g()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            int[] r2 = r8.f479x     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r25 = 0
            r2 = r2[r25]     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            if (r1 != r2) goto L_0x02fc
            java.lang.String r3 = "0"
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r1 = r18.mo668a()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r3 = r1.replaceAll(r9, r7)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r12
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r1 = r18.mo668a()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r1 = r1.replaceAll(r13, r7)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            double r20 = r20 + r1
            goto L_0x0326
        L_0x02fc:
            java.lang.String r1 = r18.mo668a()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r3 = r1.replaceAll(r9, r7)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r12
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r3 = "0"
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r1 = r18.mo668a()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r1 = r1.replaceAll(r13, r7)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            double r1 = java.lang.Double.parseDouble(r1)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            double r22 = r22 + r1
        L_0x0326:
            java.lang.String r3 = r18.mo672c()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r12
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
        L_0x0333:
            int r6 = r24 + 1
            r9 = r32
            r13 = 0
            goto L_0x01f4
        L_0x033a:
            r32 = r9
            java.lang.String r3 = ""
            r4 = 1
            r5 = 4
            r7 = 1
            r1 = r28
            r2 = r11
            r6 = r14
            r1.mo513a(r2, r3, r4, r5, r6, r7)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r3 = "-"
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            double r1 = java.lang.Math.abs(r20)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r3 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            double r1 = java.lang.Math.abs(r22)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r3 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            android.content.Context r1 = r8.f478w     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r2 = 2131755406(0x7f10018e, float:1.914169E38)
            java.lang.String r3 = r1.getString(r2)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r4 = 0
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            double r20 = r20 - r22
            java.lang.String r3 = "-"
            r4 = 1
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r15
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            double r1 = java.lang.Math.abs(r20)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r3 = r8.mo448B(r1)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r4 = 1
            r5 = 2
            r1 = r28
            r2 = r11
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r1.<init>()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            android.content.Context r2 = r8.f478w     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r3 = 2131755405(0x7f10018d, float:1.9141688E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r1.append(r2)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r2 = " - "
            r1.append(r2)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            int r2 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r2 < 0) goto L_0x03d0
            java.lang.String r2 = r28.mo597m()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            goto L_0x03d4
        L_0x03d0:
            java.lang.String r2 = r28.mo455E()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
        L_0x03d4:
            r1.append(r2)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            java.lang.String r3 = r1.toString()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r4 = 0
            r5 = 1
            r1 = r28
            r2 = r11
            r6 = r14
            r1.mo510a(r2, r3, r4, r5, r6)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r1 = r19
            r1.add(r11)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r10.add(r1)     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            r10.close()     // Catch:{ DocumentException -> 0x03f2, IOException -> 0x03f0 }
            goto L_0x042d
        L_0x03f0:
            r0 = move-exception
            goto L_0x0400
        L_0x03f2:
            r0 = move-exception
            r2 = r32
            goto L_0x041a
        L_0x03f6:
            r0 = move-exception
            r1 = r0
            r2 = r9
            goto L_0x041b
        L_0x03fa:
            r0 = move-exception
            r1 = r0
            goto L_0x042e
        L_0x03fd:
            r0 = move-exception
            r32 = r9
        L_0x0400:
            r1 = r0
        L_0x0401:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03fa }
            r2.<init>()     // Catch:{ all -> 0x03fa }
            java.lang.String r3 = "ioException:"
            r2.append(r3)     // Catch:{ all -> 0x03fa }
            r2.append(r1)     // Catch:{ all -> 0x03fa }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x03fa }
            r2 = r32
        L_0x0414:
            android.util.Log.e(r2, r1)     // Catch:{ all -> 0x03fa }
            goto L_0x042d
        L_0x0418:
            r0 = move-exception
            r2 = r9
        L_0x041a:
            r1 = r0
        L_0x041b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x03fa }
            r3.<init>()     // Catch:{ all -> 0x03fa }
            java.lang.String r4 = "DocumentException:"
            r3.append(r4)     // Catch:{ all -> 0x03fa }
            r3.append(r1)     // Catch:{ all -> 0x03fa }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x03fa }
            goto L_0x0414
        L_0x042d:
            return
        L_0x042e:
            goto L_0x0430
        L_0x042f:
            throw r1
        L_0x0430:
            goto L_0x042f
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo561d(android.widget.ExpandableListView, java.lang.String, double, java.lang.String):void");
    }

    /* renamed from: d */
    public void mo562d(String str) {
        try {
            Log.d("SQL=", str);
            this.f477v.execSQL(str);
            mo491Z();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public C0232LL mo563e(String str) {
        Cursor A = mo445A(str);
        A.moveToFirst();
        C0232LL ll = null;
        while (!A.isAfterLast()) {
            String str2 = "_in";
            ll = new C0232LL(A.getString(A.getColumnIndex("_id")), A.getString(A.getColumnIndex("date_")), A.getString(A.getColumnIndex("amount")), A.getString(A.getColumnIndex("remarks")), this.f479x[A.getInt(A.getColumnIndex(str2))], String.valueOf(A.getInt(A.getColumnIndex(str2))), A.getString(A.getColumnIndex("t_gsm")), A.getString(A.getColumnIndex("curr_name")));
            ll.mo773d(A.getString(A.getColumnIndex("t_cus_name")));
            if (!ll.mo774e().equals("")) {
                ArrayList h = mo581h(ll.f613i, ll.f612h);
                if (h.size() > 0) {
                    ll.mo771c((String) h.get(0));
                }
            }
            ArrayList h2 = mo581h(str, ll.f612h);
            if (h2.size() > 0) {
                ll.mo767a((String) h2.get(0));
            }
            A.moveToNext();
        }
        A.close();
        return ll;
    }

    /* renamed from: e */
    public Cursor mo564e(String str, String str2) {
        String str3 = Value.PERCENTAGE;
        String str4 = " SELECT a.ID as _id, a.date_ as date_,abs(a.out * a.[in]) as amount ,a.remarks,(a.[in]+1) as _in,0 as Bal, strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d,substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1  FROM transactions AS a, customers AS b  WHERE a.cus_id = b.id ";
        String str5 = " ORDER BY (d2) desc ,1 desc ";
        if (str.equals(str3) && str2.equals(str3)) {
            SQLiteDatabase sQLiteDatabase = this.f477v;
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append("     ");
            sb.append(str5);
            return sQLiteDatabase.rawQuery(sb.toString(), null);
        } else if (str.equals(str3) && !str2.equals(str3)) {
            SQLiteDatabase sQLiteDatabase2 = this.f477v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(" and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) <= ?  ");
            sb2.append(str5);
            return sQLiteDatabase2.rawQuery(sb2.toString(), new String[]{str2});
        } else if (str.equals(str3) || !str2.equals(str3)) {
            SQLiteDatabase sQLiteDatabase3 = this.f477v;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            sb3.append(" and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) between ? and ? ");
            sb3.append(str5);
            return sQLiteDatabase3.rawQuery(sb3.toString(), new String[]{str, str});
        } else {
            SQLiteDatabase sQLiteDatabase4 = this.f477v;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str4);
            sb4.append(" and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) >= ?  ");
            sb4.append(str5);
            return sQLiteDatabase4.rawQuery(sb4.toString(), new String[]{str});
        }
    }

    /* renamed from: e */
    public String mo565e(int i) {
        mo477R();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        sb.append(i);
        sb.append(str);
        Cursor rawQuery = sQLiteDatabase.rawQuery("select (select name from customers where id=t_cus_id) as _id from transactions  where id=?  ", new String[]{sb.toString()});
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            str = rawQuery.getString(rawQuery.getColumnIndex("_id"));
            rawQuery.moveToNext();
        }
        mo532b();
        rawQuery.close();
        return str;
    }

    /* renamed from: e */
    public String mo566e(Context context) {
        return "1.190";
    }

    /* renamed from: e */
    public String mo567e(String str, String str2, String str3) {
        String str4 = "%20";
        try {
            String[] split = str.split("\\|");
            StringBuilder sb = new StringBuilder();
            sb.append(split[0]);
            sb.append(str2);
            sb.append(split[1]);
            sb.append(str3.replaceAll("\n", str4).replaceAll(" ", str4));
            return sb.toString();
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e.getMessage());
            sb2.append("");
            Log.d("api_error=", sb2.toString());
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public void mo568e() {
        C0288NU.m892a().mo934a(new C0356QU(6, this, this.f478w));
    }

    /* renamed from: f */
    public Cursor mo569f(String str) {
        String str2 = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(str2);
            return this.f477v.rawQuery("SELECT a.name as _id,a.* from act_req a where a.imei=?  ", new String[]{sb.toString()});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public Cursor mo570f(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        Log.d("Inputs=", sb.toString());
        SQLiteDatabase sQLiteDatabase = this.f477v;
        String[] strArr = new String[3];
        StringBuilder sb2 = new StringBuilder();
        String str3 = "";
        sb2.append(str3);
        sb2.append(str);
        sb2.append(str3);
        strArr[0] = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str3);
        sb3.append(str);
        sb3.append(str3);
        strArr[1] = sb3.toString();
        if (str2 == null) {
            str2 = str3;
        }
        strArr[2] = str2;
        return sQLiteDatabase.rawQuery("SELECT a.a_id as _id, a.date_ as date_,  abs(a.out * a.[in])  as amount ,(case when (a.t_cus_id=a.b_id) then 'مـن '||(select name from customers where id=a.cus_id)||'//'||a.remarks  when (a.cus_id=a.b_id and a.t_cus_id is not null) then 'لـ '||(select name from customers where id=a.t_cus_id)||'//'||a.remarks   else (a.remarks) end)  as remarks  ,(case when (a.t_cus_id=a.b_id) then 0 else  (a.[in]+1) end)  as _in,0 as bal, strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d,substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,a.b_name,a.param1,a.d_id as curr_id,a.d_name as curr_name  FROM cus_tr_curr_view a  where (a.b_id=? or a.b_name=?)  and a.d_name=? ORDER BY date(d2)  desc,1 desc  ", strArr);
    }

    /* renamed from: f */
    public Cursor mo571f(String str, String str2, String str3) {
        Cursor cursor;
        mo477R();
        String str4 = Value.PERCENTAGE;
        String str5 = "SELECT a.id as id, ifnull((sum(case when (c.t_cus_id=b.id) then -1*c.out else  (c.[in]*c.out) end))*1  ,0) as net_balance                 ,sum(case  when c.[in] = 1 and (c.t_cus_id<>b.id or c.t_cus_id is null) then c.out else 0 end)*1.0 as cr_amount ,                sum(case when not(c.[in] = 1 and (c.t_cus_id<>b.id or c.t_cus_id is null)) then c.out else 0 end )*1.0 as db_amount ,a.name as _id ,ifnull( d.name, (select name from currency where id=0))  curr_name                 from groups a inner join customers b on (a.id=b.g_id)                  inner join transactions c on (c.cus_id = b.id or c.t_cus_id=b.id)  inner join currency d on c.curr_id=d.id ";
        String str6 = " group by a.name,a.id,d.id,d.name  order by 2 ";
        if (str.equals(str4) && str2.equals(str4)) {
            SQLiteDatabase sQLiteDatabase = this.f477v;
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append(" where d.name=?  ");
            sb.append(str6);
            cursor = sQLiteDatabase.rawQuery(sb.toString(), new String[]{str3});
        } else if (str.equals(str4) && !str2.equals(str4)) {
            SQLiteDatabase sQLiteDatabase2 = this.f477v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str5);
            sb2.append(" where d.name=? and date(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) )) <= ?  ");
            sb2.append(str6);
            cursor = sQLiteDatabase2.rawQuery(sb2.toString(), new String[]{str3, str2});
        } else if (str.equals(str4) || !str2.equals(str4)) {
            SQLiteDatabase sQLiteDatabase3 = this.f477v;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str5);
            sb3.append(" where d.name=? and date(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) )) between ? and ? ");
            sb3.append(str6);
            cursor = sQLiteDatabase3.rawQuery(sb3.toString(), new String[]{str3, str, str2});
        } else {
            SQLiteDatabase sQLiteDatabase4 = this.f477v;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str5);
            sb4.append(" where d.name=? and date(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) )) >= ?  ");
            sb4.append(str6);
            cursor = sQLiteDatabase4.rawQuery(sb4.toString(), new String[]{str3, str});
        }
        mo532b();
        return cursor;
    }

    /* renamed from: f */
    public void mo572f() {
        C0288NU.m892a().mo934a(new C0356QU(8, this, this.f478w));
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x023f  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo573f(Context r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            java.lang.String r3 = "0"
            java.lang.String r4 = "prefBackup_time_h"
            java.lang.String r4 = r0.mo609q(r4, r3)
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.String r5 = "prefBackup_time_m"
            java.lang.String r5 = r0.mo609q(r5, r3)
            int r5 = java.lang.Integer.parseInt(r5)
            r6 = 11
            r2.set(r6, r4)
            r4 = 12
            r2.set(r4, r5)
            r5 = 0
            r6 = 13
            r2.set(r6, r5)
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r7 = ""
            r8 = 23
            if (r6 >= r8) goto L_0x0105
            android.content.Intent r4 = new android.content.Intent
            java.lang.Class<com.valdio.valdioveliu.recyclerview.online.DbBackupListener> r6 = com.valdio.valdioveliu.recyclerview.online.DbBackupListener.class
            r4.<init>(r1, r6)
            r6 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r4 = android.app.PendingIntent.getBroadcast(r1, r5, r4, r6)
            java.lang.String r6 = "alarm"
            java.lang.Object r1 = r1.getSystemService(r6)
            android.app.AlarmManager r1 = (android.app.AlarmManager) r1
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            java.text.SimpleDateFormat r12 = new java.text.SimpleDateFormat
            java.util.Locale r13 = java.util.Locale.ENGLISH
            java.lang.String r14 = "dd-MM-yyyy"
            r12.<init>(r14, r13)
            java.util.Date r6 = r6.getTime()
            java.lang.String r6 = r12.format(r6)
            long r12 = r2.getTimeInMillis()
            long r14 = java.lang.System.currentTimeMillis()
            r9 = 19
            java.lang.String r10 = "auto_drive_date_save"
            java.lang.String r11 = "1"
            java.lang.String r5 = "db_data_changed"
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x00ac
            java.lang.String r12 = r0.mo609q(r5, r3)
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x00ac
            java.lang.String r12 = r0.mo609q(r10, r7)
            boolean r12 = r12.equals(r6)
            if (r12 != 0) goto L_0x00ac
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 >= r8) goto L_0x00a2
            if (r3 < r9) goto L_0x0098
            long r2 = r2.getTimeInMillis()
            r5 = 0
            r1.setExact(r5, r2, r4)
            goto L_0x0246
        L_0x0098:
            r5 = 0
            long r2 = r2.getTimeInMillis()
            r1.set(r5, r2, r4)
            goto L_0x0246
        L_0x00a2:
            r5 = 0
            long r2 = r2.getTimeInMillis()
            r1.setExactAndAllowWhileIdle(r5, r2, r4)
            goto L_0x0246
        L_0x00ac:
            long r12 = r2.getTimeInMillis()
            long r14 = java.lang.System.currentTimeMillis()
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x00d5
            java.lang.String r3 = r0.mo609q(r5, r3)
            boolean r3 = r3.equals(r11)
            if (r3 == 0) goto L_0x00d5
            java.lang.String r3 = r0.mo609q(r10, r7)
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x00d5
            boolean r3 = f460t
            if (r3 != 0) goto L_0x00d5
            r3 = 1
            f460t = r3
            goto L_0x0246
        L_0x00d5:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 >= r8) goto L_0x00f7
            if (r3 < r9) goto L_0x00e9
            long r2 = r2.getTimeInMillis()
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 + r5
            r7 = 0
            r1.setExact(r7, r2, r4)
            goto L_0x0246
        L_0x00e9:
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            r7 = 0
            long r2 = r2.getTimeInMillis()
            long r2 = r2 + r5
            r1.set(r7, r2, r4)
            goto L_0x0246
        L_0x00f7:
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            r7 = 0
            long r2 = r2.getTimeInMillis()
            long r2 = r2 + r5
            r1.setExactAndAllowWhileIdle(r7, r2, r4)
            goto L_0x0246
        L_0x0105:
            if (r6 < r8) goto L_0x0246
            r1 = 0
            long r5 = r2.getTimeInMillis()
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 60
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x018c
            boolean r3 = r17.mo474P()
            if (r3 != 0) goto L_0x018c
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            java.util.Date r1 = r1.getTime()
            java.util.Date r2 = r2.getTime()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r5 = r1.getTime()
            long r8 = r2.getTime()
            long r5 = r5 - r8
            r3.append(r5)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "diff="
            android.util.Log.d(r5, r3)
            long r5 = r1.getTime()
            long r1 = r2.getTime()
            long r5 = r5 - r1
            long r5 = r5 / r10
            long r5 = r5 / r12
            long r5 = r5 / r12
            long r5 = r5 / r12
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            android.content.ComponentName r2 = new android.content.ComponentName
            android.content.Context r3 = r0.f478w
            java.lang.Class<com.valdio.valdioveliu.recyclerview.online.DbBackupListener_Service> r5 = com.valdio.valdioveliu.recyclerview.online.DbBackupListener_Service.class
            r2.<init>(r3, r5)
            android.app.job.JobInfo$Builder r3 = new android.app.job.JobInfo$Builder
            r3.<init>(r4, r2)
            r2 = 0
            android.app.job.JobInfo$Builder r2 = r3.setRequiredNetworkType(r2)
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            android.app.job.JobInfo$Builder r2 = r2.setOverrideDeadline(r5)
            r5 = 24
            long r7 = r1.longValue()
            long r5 = r5 - r7
            r7 = 3600000(0x36ee80, double:1.7786363E-317)
            long r5 = r5 * r7
            android.app.job.JobInfo$Builder r1 = r2.setMinimumLatency(r5)
            r3 = 1
        L_0x0183:
            android.app.job.JobInfo$Builder r1 = r1.setPersisted(r3)
            android.app.job.JobInfo r1 = r1.build()
            goto L_0x01fb
        L_0x018c:
            r3 = 1
            long r5 = r2.getTimeInMillis()
            long r7 = java.lang.System.currentTimeMillis()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x01be
            boolean r5 = r17.mo474P()
            if (r5 != r3) goto L_0x01be
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r2 = r0.f478w
            java.lang.Class<com.valdio.valdioveliu.recyclerview.online.DbBackupListener_Service> r5 = com.valdio.valdioveliu.recyclerview.online.DbBackupListener_Service.class
            r1.<init>(r2, r5)
            android.app.job.JobInfo$Builder r2 = new android.app.job.JobInfo$Builder
            r2.<init>(r4, r1)
            r1 = 0
            android.app.job.JobInfo$Builder r1 = r2.setRequiredNetworkType(r1)
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            android.app.job.JobInfo$Builder r1 = r1.setOverrideDeadline(r5)
            android.app.job.JobInfo$Builder r1 = r1.setMinimumLatency(r10)
            goto L_0x0183
        L_0x01be:
            long r5 = r2.getTimeInMillis()
            long r7 = java.lang.System.currentTimeMillis()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L_0x01fb
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r3 = r0.f478w
            java.lang.Class<com.valdio.valdioveliu.recyclerview.online.DbBackupListener_Service> r5 = com.valdio.valdioveliu.recyclerview.online.DbBackupListener_Service.class
            r1.<init>(r3, r5)
            android.app.job.JobInfo$Builder r3 = new android.app.job.JobInfo$Builder
            r3.<init>(r4, r1)
            r1 = 0
            android.app.job.JobInfo$Builder r1 = r3.setRequiredNetworkType(r1)
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            android.app.job.JobInfo$Builder r1 = r1.setOverrideDeadline(r5)
            long r2 = r2.getTimeInMillis()
            long r5 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r5
            android.app.job.JobInfo$Builder r1 = r1.setMinimumLatency(r2)
            r2 = 1
            android.app.job.JobInfo$Builder r1 = r1.setPersisted(r2)
            android.app.job.JobInfo r1 = r1.build()
            goto L_0x01fc
        L_0x01fb:
            r2 = 1
        L_0x01fc:
            android.content.Context r3 = r0.f478w
            java.lang.String r5 = "jobscheduler"
            java.lang.Object r3 = r3.getSystemService(r5)
            android.app.job.JobScheduler r3 = (android.app.job.JobScheduler) r3
            r3.cancel(r4)
            int r3 = r3.schedule(r1)
            if (r3 != r2) goto L_0x023f
            java.lang.String r2 = r0.f471J
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Job_scheduled! "
            r3.append(r4)
            long r4 = r1.getMaxExecutionDelayMillis()
            long r4 = r4 / r10
            long r4 = r4 / r12
            r3.append(r4)
            java.lang.String r4 = " Mins:"
            r3.append(r4)
            long r4 = r1.getMinLatencyMillis()
            long r4 = r4 / r10
            long r4 = r4 / r12
            r3.append(r4)
            java.lang.String r1 = "Min(min.Latency)"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.d(r2, r1)
            goto L_0x0246
        L_0x023f:
            java.lang.String r1 = r0.f471J
            java.lang.String r2 = "Job_s not scheduled"
            android.util.Log.d(r1, r2)
        L_0x0246:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo573f(android.content.Context):void");
    }

    /* renamed from: g */
    public Cursor mo574g(String str, String str2) {
        return this.f477v.rawQuery("SELECT a.ID as _id, a.date_ as date_,abs(a.out * a.[in]) as amount ,(case when (a.t_cus_id=b.id) then 'من '||(select name from customers where id=a.cus_id)||'//'||a.remarks  when (a.cus_id=b.id and a.t_cus_id is not null) then 'لـ '||(select name from customers where id=a.t_cus_id)||'//'||a.remarks   else (a.remarks) end)  as remarks  ,(case when (a.t_cus_id=b.id) then 0 else  (a.[in]+1) end)  as _in,0 as bal, strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d,substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1  FROM transactions AS a, customers AS b,currency d  WHERE (a.cus_id = b.id or a.t_cus_id=b.id) and a.curr_id=d.id and b.g_id=?  and d.name=? ORDER BY (d2)  desc,1 desc ", new String[]{str, str2});
    }

    /* renamed from: g */
    public Cursor mo575g(String str, String str2, String str3) {
        Cursor cursor;
        mo477R();
        String str4 = Value.PERCENTAGE;
        String str5 = "SELECT 0 as id,  sum(case when a.[in] = 1 and (a.t_cus_id<>b.id or a.t_cus_id is null) then -1*a.out else a.out*1 end)*-1.0 as net_balance , b.name as _id,b.gsm as gsm, sum(case  when a.[in] = 1 and (a.t_cus_id<>b.id or a.t_cus_id is null) then a.out else 0 end)*1.0 as cr_amount , sum(case when not(a.[in] = 1 and (a.t_cus_id<>b.id or a.t_cus_id is null)) then a.out else 0 end )*1.0 as db_amount  FROM transactions a,customers b where (a.cus_id = b.id or a.t_cus_id=b.id)  ";
        String str6 = " group by b.name,b.id,b.gsm order by b.name ";
        if (str2.equals(str4) && str3.equals(str4)) {
            SQLiteDatabase sQLiteDatabase = this.f477v;
            StringBuilder sb = new StringBuilder();
            sb.append(str5);
            sb.append("  and b.g_id=?   ");
            sb.append(str6);
            cursor = sQLiteDatabase.rawQuery(sb.toString(), new String[]{str});
        } else if (str2.equals(str4) && !str3.equals(str4)) {
            SQLiteDatabase sQLiteDatabase2 = this.f477v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str5);
            sb2.append(" and b.g_id=? and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) <= ?  ");
            sb2.append(str6);
            cursor = sQLiteDatabase2.rawQuery(sb2.toString(), new String[]{str, str3});
        } else if (str2.equals(str4) || !str3.equals(str4)) {
            SQLiteDatabase sQLiteDatabase3 = this.f477v;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str5);
            sb3.append(" and b.g_id=? and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) between ? and ? ");
            sb3.append(str6);
            cursor = sQLiteDatabase3.rawQuery(sb3.toString(), new String[]{str, str2, str3});
        } else {
            SQLiteDatabase sQLiteDatabase4 = this.f477v;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str5);
            sb4.append(" and b.g_id=? and date(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) >= ?  ");
            sb4.append(str6);
            cursor = sQLiteDatabase4.rawQuery(sb4.toString(), new String[]{str, str2});
        }
        mo532b();
        return cursor;
    }

    /* renamed from: g */
    public final String mo576g() {
        String str = "";
        TelephonyManager telephonyManager = (TelephonyManager) this.f478w.getSystemService("phone");
        try {
            String str2 = (String) telephonyManager.getClass().getMethod("getImei", new Class[0]).invoke(telephonyManager, new Object[0]);
            return str2 == null ? str : str2;
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: g */
    public String mo577g(String str) {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("select  substr(reply,4) as _id from act_req where imei=?  ", new String[]{str});
        rawQuery.moveToFirst();
        String str2 = "";
        while (!rawQuery.isAfterLast()) {
            str2 = rawQuery.getString(rawQuery.getColumnIndex("_id"));
            rawQuery.moveToNext();
        }
        mo532b();
        return str2;
    }

    /* renamed from: g */
    public final void mo578g(Context context) {
        ((InputMethodManager) context.getSystemService("input_method")).toggleSoftInput(2, 0);
    }

    /* renamed from: h */
    public int mo579h(String str) {
        this.f470I = new ArrayList();
        this.f470I.add("3529440532844");
        boolean contains = this.f470I.contains(str);
        if (mo524a("black_list", false)) {
            return 1;
        }
        return contains ? 1 : 0;
    }

    /* renamed from: h */
    public Cursor mo580h(String str, String str2, String str3) {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT b.name as _id ,ifnull((sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end))*1  ,0) AS amount,  (case when sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end)>= 0 then  1+1 else -1+1 end ) as _in ,b.id as id,b.gsm as phone ,max(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d,( (select julianday(strftime('%Y-%m-%d','now')) -julianday(max(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) ))) from transactions as c where c.cus_id=b.id) ) as days_late  FROM customers AS b  , transactions AS a,currency d     where (a.cus_id = b.id or a.t_cus_id=b.id) and a.curr_id=d.id and substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)=? and b.g_id=? and d.name=?   GROUP BY substr(a.date_,7,4)||'-' ||substr(a.date_,4,2),b.name,b.id  order by 2  ", new String[]{str, str2, str3});
        mo532b();
        return rawQuery;
    }

    /* renamed from: h */
    public ArrayList<String> mo581h(String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(str);
        Cursor rawQuery = sQLiteDatabase.rawQuery("select sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end) F1  from cus_tr_curr_view a where a.b_name=? and a.d_name=? ", new String[]{sb.toString(), str2});
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            arrayList.add(String.valueOf(rawQuery.getDouble(rawQuery.getColumnIndex("F1"))));
            rawQuery.moveToNext();
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: h */
    public void mo582h(Context context) {
        Builder builder = new Builder(context);
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(2131492962, null);
        builder.setView(inflate);
        Button button = (Button) inflate.findViewById(2131296489);
        EditText editText = (EditText) inflate.findViewById(2131296490);
        editText.setHint(2131755232);
        TextView textView = (TextView) inflate.findViewById(2131296491);
        TextView textView2 = (TextView) inflate.findViewById(2131296492);
        TextView textView3 = (TextView) inflate.findViewById(2131296493);
        ImageView imageView = (ImageView) inflate.findViewById(2131296494);
        button.setMovementMethod(LinkMovementMethod.getInstance());
        button.setTag(f445e);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(2131755140);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        textView2.setText(2131755141);
        textView3.setText(f445e);
        editText.setOnClickListener(new C1184yU(this));
        editText.addTextChangedListener(new C0057CU(this));
        builder.setPositiveButton(context.getString(2131755070), new C0076DU(this));
        AlertDialog create = builder.create();
        create.getWindow().setSoftInputMode(4);
        create.getWindow().setGravity(48);
        create.show();
        imageView.setOnClickListener(new C0095EU(this, context, create));
        button.setOnClickListener(new C0114FU(this, context, create));
        textView.setOnClickListener(new C0134GU(this, context, create));
        textView2.setOnClickListener(new C0156HU(this, context, create));
        textView3.setOnClickListener(new C0176IU(this, context, create));
        create.getButton(-1).setOnClickListener(new C0783fU(this, editText, context, create));
    }

    /* renamed from: i */
    public int mo583i() {
        return this.f477v.getVersion();
    }

    /* renamed from: i */
    public Cursor mo584i(String str) {
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        return sQLiteDatabase.rawQuery("SELECT * from currency where name=?  ", new String[]{sb.toString()});
    }

    /* renamed from: i */
    public ArrayList<String> mo585i(String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f477v.rawQuery("select ifnull(sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end),0) F1  from cus_tr_curr_view a where a.g_id=? and a.d_name=?   ", new String[]{str, str2});
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            arrayList.add(String.valueOf(rawQuery.getDouble(rawQuery.getColumnIndex("F1"))));
            rawQuery.moveToNext();
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: i */
    public boolean mo586i(String str, String str2, String str3) {
        String str4;
        String str5 = "write_file";
        try {
            new File(str2).mkdir();
            File file = new File(str2, str3);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(System.getProperty("line.separator"));
            fileOutputStream.write(sb.toString().getBytes(Charset.forName("windows-1256")));
            return true;
        } catch (FileNotFoundException e) {
            str4 = e.getMessage();
            Log.d(str5, str4);
            return false;
        } catch (IOException e2) {
            str4 = e2.getMessage();
            Log.d(str5, str4);
            return false;
        }
    }

    /* renamed from: j */
    public String mo587j(String str) {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("select count(*) as _id from valid where imei=? ", new String[]{str});
        rawQuery.moveToFirst();
        String str2 = "0";
        while (!rawQuery.isAfterLast()) {
            str2 = rawQuery.getString(rawQuery.getColumnIndex("_id"));
            rawQuery.moveToNext();
        }
        mo532b();
        rawQuery.close();
        return str2;
    }

    /* renamed from: j */
    public ArrayList<String> mo588j(String str, String str2) {
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor rawQuery = this.f477v.rawQuery("select ifnull( sum(case when  tot<0 then tot*-1 else 0 end ),0)F1,ifnull(sum(case when  tot>0 then tot else 0 end ),0)F2 from (select a.b_id cus_id,sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end) tot,a.d_name curr_name  from cus_tr_curr_view a group by a.b_id,a.d_name)All_,customers c  where all_.cus_id=c.id and c.g_id=? and All_.curr_name=? ", new String[]{str, str2});
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                arrayList.add(String.valueOf(rawQuery.getDouble(rawQuery.getColumnIndex("F1"))));
                arrayList.add(String.valueOf(rawQuery.getDouble(rawQuery.getColumnIndex("F2"))));
                rawQuery.moveToNext();
            }
            rawQuery.close();
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: j */
    public void mo589j() {
        Log.d("trace_S_read_Curr=", FragmentStatePagerSupport_Main.m2279h());
        Cursor t = mo618t();
        if (t != null) {
            t.getCount();
            f455o.clear();
            t.moveToFirst();
            while (!t.isAfterLast()) {
                f455o.add(new C0260MM(t.getString(t.getColumnIndex("_id")), t.getString(t.getColumnIndex("g_name")), t.getString(t.getColumnIndex("curr_name"))));
                t.moveToNext();
            }
            t.close();
            Log.d("trace_E_read_Curr=", FragmentStatePagerSupport_Main.m2279h());
        }
    }

    /* renamed from: k */
    public int mo590k(String str) {
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        String sb2 = sb.toString();
        int i = 0;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT count(*) as _id from customers where name=?  ", new String[]{sb2});
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            i = rawQuery.getInt(rawQuery.getColumnIndex("_id"));
            rawQuery.moveToNext();
        }
        rawQuery.close();
        return i;
    }

    /* renamed from: k */
    public Cursor mo591k(String str, String str2) {
        try {
            mo477R();
            Cursor rawQuery = this.f477v.rawQuery("select * from (SELECT a.b_name as _id ,ifnull( abs(sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end)),0) AS amount,  (case when sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end)>= 0 then  1+1 else -1+1 end ) as _in ,a.b_id as id,a.gsm as phone ,max(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d,( (select julianday(strftime('%Y-%m-%d','now')) -julianday(max(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) ))) from transactions as c where (c.cus_id=a.b_id or c.t_cus_id=a.b_id)) ) as days_late,ifnull(max(a.a_id),0) max_id,(case when length(count(*))=1 then '  '||count(*)||'  ' else ' '||count(*)||' ' end) cnt,a.g_id, a.c_name g_name  ,ifnull( a.d_name, (select name from currency where id=0))  curr_name  FROM cus_tr_curr_view a  where a.g_id=?  GROUP BY a.b_name, a.b_id,a.d_name,a.d_id   ORDER BY d DESC,max_id desc) where curr_name=?  ", new String[]{str, str2});
            mo532b();
            return rawQuery;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: k */
    public void mo592k() {
        if (!f459s) {
            String str = "db_cus_changed";
            String str2 = "0";
            if (!mo609q(str, "1").equals(str2) || f452l.size() == 0) {
                f459s = true;
                Log.d("trace_S_Cus_List=", FragmentStatePagerSupport_Main.m2279h());
                Cursor C = mo450C();
                f452l.clear();
                C.moveToFirst();
                while (!C.isAfterLast()) {
                    C0082EH eh = new C0082EH(C.getString(C.getColumnIndex(Attribute.f2026ID)), C.getString(C.getColumnIndex("_id")), C.getString(C.getColumnIndex("phone")), C.getDouble(C.getColumnIndex("amount")), this.f479x[C.getInt(C.getColumnIndex("_in"))], 0, C.getString(C.getColumnIndex("g_name")), !mo524a("prefOthers_currency", false) ? "" : C.getString(C.getColumnIndex("curr_name")), C.getString(C.getColumnIndex("cnt")));
                    f452l.add(eh);
                    mo631x(str, str2);
                    C.moveToNext();
                }
                C.close();
                f459s = false;
                StringBuilder sb = new StringBuilder();
                sb.append(FragmentStatePagerSupport_Main.m2279h());
                sb.append("#");
                sb.append(f452l.size());
                Log.d("trace_E_Cus_List=", sb.toString());
            }
        }
    }

    /* renamed from: l */
    public Cursor mo593l(String str) {
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        return sQLiteDatabase.rawQuery("SELECT a.a_id as _id, a.date_ as date_,abs(a.out * a.[in]) as amount ,(case when (a.t_cus_id=a.b_id) then 'مـن '||(select name from customers where id=a.cus_id)||'//'||a.remarks  when (a.cus_id=a.b_id and a.t_cus_id is not null) then 'لـ '||(select name from customers where id=a.t_cus_id)||'//'||a.remarks   else (a.remarks) end)  as remarks  ,(case when (a.t_cus_id=a.b_id) then 0 else  (a.[in]+1) end)  as _in,0 as bal, strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d,substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,a.b_name,a.param1,a.d_id as curr_id,a.d_name as curr_name  FROM  cus_tr_curr_view a  where (a.b_id=? or a.b_name=?)  ORDER BY date(d2)  desc,1 desc  ", new String[]{sb.toString(), sb2.toString()});
    }

    /* renamed from: l */
    public Cursor mo594l(String str, String str2) {
        mo477R();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        Log.d("Inputs=", sb.toString());
        Cursor rawQuery = this.f477v.rawQuery("select * from (SELECT b.name as _id ,ifnull( abs(sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end)),0) AS amount,  (case when sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end)>= 0 then  1+1 else -1+1 end ) as _in ,b.id as id,b.gsm as phone ,max(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d,( (select julianday(strftime('%Y-%m-%d','now')) -julianday(max(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) ))) from transactions as c where (c.cus_id=b.id or c.t_cus_id=b.id)) ) as days_late,ifnull(max(a.id),0) max_id,(case when length(count(*))=1 then '  '||count(*)||'  ' else ' '||count(*)||' ' end) cnt,b.g_id, c.name g_name  ,ifnull( d.name, (select name from currency where id=0))  curr_name  FROM groups c inner join customers AS b on c.id=b.g_id  left join transactions AS a   on (a.cus_id = b.id or a.t_cus_id = b.id)  left join currency d on (a.curr_id=d.id)  where b.g_id=?  GROUP BY b.name, b.id,d.name,d.id   ORDER BY d DESC,max_id desc) where curr_name=?  ", new String[]{str, str2});
        mo532b();
        return rawQuery;
    }

    /* renamed from: l */
    public String mo595l() {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5 = "<td>";
        String str6 = ":";
        String str7 = "";
        try {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            sb.append(mo464J("template.html").replace("192.168.100.2", mo463J()));
            Cursor z = mo635z();
            arrayList2.clear();
            z.moveToFirst();
            while (true) {
                str = "_id";
                if (z.isAfterLast()) {
                    break;
                }
                arrayList2.add(new C0260MM(z.getString(z.getColumnIndex(str)), z.getString(z.getColumnIndex("g_name"))));
                z.moveToNext();
            }
            z.close();
            int i2 = 0;
            while (i2 < arrayList2.size()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("<p>");
                sb2.append(this.f478w.getString(2131755153));
                sb2.append(" :-");
                sb2.append(((C0260MM) arrayList2.get(i2)).mo890c());
                sb2.append("</p>");
                sb.append(sb2.toString());
                sb.append(mo464J("table_hdr.html"));
                Cursor L = mo468L(((C0260MM) arrayList2.get(i2)).mo889b());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(L.getCount());
                sb3.append(str6);
                sb3.append(((C0260MM) arrayList2.get(i2)).mo889b());
                Log.d("Cursor_Cnt=", sb3.toString());
                arrayList.clear();
                L.moveToFirst();
                while (!L.isAfterLast()) {
                    C0208KL kl = new C0208KL(L.getString(L.getColumnIndex(Attribute.f2026ID)), L.getString(L.getColumnIndex(str)), L.getString(L.getColumnIndex("phone")), L.getString(L.getColumnIndex("amount")), this.f479x[L.getInt(L.getColumnIndex("_in"))], L.getString(L.getColumnIndex("days_late")));
                    arrayList.add(kl);
                    L.moveToNext();
                }
                L.close();
                int i3 = 0;
                double d = 0.0d;
                while (true) {
                    str2 = "</tr>";
                    str3 = "<tr>";
                    str4 = "</td>";
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    sb.append(str3);
                    sb.append(str5);
                    sb.append(((C0208KL) arrayList.get(i3)).mo676g() == this.f479x[0] ? this.f478w.getString(2131755161) : this.f478w.getString(2131755143));
                    sb.append(str4);
                    sb.append("<td class=\"center\">");
                    sb.append(((C0208KL) arrayList.get(i3)).mo668a().replace("-", str7));
                    sb.append(str4);
                    sb.append(str5);
                    String str8 = str5;
                    StringBuilder sb4 = new StringBuilder();
                    ArrayList arrayList3 = arrayList2;
                    sb4.append(((C0208KL) arrayList.get(i3)).mo675f());
                    sb4.append(".pdf");
                    sb.append("<a href=\"2.pdf\" target=\"_blank\">1.pdf</a>".replace("1.pdf", ((C0208KL) arrayList.get(i3)).mo675f()).replace("2.pdf", sb4.toString()));
                    sb.append(str4);
                    sb.append(str2);
                    sb.append(10);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(((C0208KL) arrayList.get(i3)).mo676g());
                    sb5.append(str6);
                    sb5.append(((C0208KL) arrayList.get(i3)).mo675f());
                    Log.d("tot_type=", sb5.toString());
                    String str9 = ",";
                    if (((C0208KL) arrayList.get(i3)).mo676g() == this.f479x[0]) {
                        Double.parseDouble(((C0208KL) arrayList.get(i3)).mo668a().replaceAll(str9, str7));
                        i = -1;
                    } else {
                        Double.parseDouble(((C0208KL) arrayList.get(i3)).mo668a().replaceAll(str9, str7));
                        i = 1;
                    }
                    double parseDouble = Double.parseDouble(((C0208KL) arrayList.get(i3)).mo668a().replaceAll(str9, str7));
                    double d2 = (double) i;
                    Double.isNaN(d2);
                    d += parseDouble * d2;
                    i3++;
                    str5 = str8;
                    arrayList2 = arrayList3;
                }
                String str10 = str5;
                ArrayList arrayList4 = arrayList2;
                sb.append("</tbody><tfoot style=\"background:#eee;\">");
                sb.append(10);
                String str11 = "<td  class=\"center\">";
                String str12 = "<td colspan=\"2\" class=\"center\">";
                if (d >= 0.0d) {
                    sb.append(str3);
                    sb.append(str12);
                    sb.append(mo448B(String.valueOf(d)));
                    sb.append(str4);
                    sb.append(str11);
                    sb.append(this.f478w.getString(2131755254));
                    sb.append(str4);
                } else {
                    sb.append(str3);
                    sb.append(str12);
                    sb.append(mo448B(String.valueOf(d)));
                    sb.append(str4);
                    sb.append(str11);
                    sb.append(this.f478w.getString(2131755252));
                    sb.append(str4);
                }
                sb.append(str2);
                sb.append(10);
                sb.append("</tfoot>\n</table>\n");
                i2++;
                str5 = str10;
                arrayList2 = arrayList4;
            }
            sb.append("</div></div></body></html>");
            str7 = sb.toString();
        } catch (Exception unused) {
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(mo463J());
        sb6.append(str6);
        Log.d("IP=", sb6.toString());
        return str7;
    }

    /* renamed from: m */
    public Cursor mo596m(String str) {
        String str2 = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append(str2);
            return this.f477v.rawQuery("SELECT a.ID as _id,substr(a.date_,1,10) as date_,abs(a.out * a.[in]) as amount ,a.remarks,(a.[in]+1) as _in,0 as Bal  FROM transactions AS a, customers AS b  WHERE a.cus_id = b.id and b.name=?  ORDER BY a.date_   ", new String[]{sb.toString()});
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: m */
    public String mo597m() {
        return mo609q("pref_credit", this.f478w.getString(2131755144));
    }

    /* renamed from: m */
    public ArrayList<String> mo598m(String str, String str2) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f477v.rawQuery("SELECT b.name as _id,b.id,b.gsm from customers AS b  where b.name not in (?,?) order by b.name   ", new String[]{str, str2});
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            arrayList.add(rawQuery.getString(rawQuery.getColumnIndex("_id")));
            rawQuery.moveToNext();
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: n */
    public Cursor mo599n(String str) {
        return this.f477v.rawQuery("SELECT a.ID as _id, a.date_ as date_,abs(a.out * a.[in]) as amount ,(case when (a.t_cus_id=b.id) then 'من '||(select name from customers where id=a.cus_id)||'//'||a.remarks  when (a.cus_id=b.id and a.t_cus_id is not null) then 'لـ '||(select name from customers where id=a.t_cus_id)||'//'||a.remarks   else (a.remarks) end)  as remarks  ,(case when (a.t_cus_id=b.id) then 0 else  (a.[in]+1) end)  as _in,0 as bal, strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d,substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1  FROM transactions AS a, customers AS b  WHERE (a.cus_id = b.id or a.t_cus_id=b.id) and b.g_id=? ORDER BY (d2)  desc,1 desc ", new String[]{str});
    }

    /* renamed from: n */
    public Cursor mo600n(String str, String str2) {
        mo477R();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        sb.append(str3);
        sb.append(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(str2);
        Cursor rawQuery = sQLiteDatabase.rawQuery("select distinct d.name from transactions a,customers b,groups c,currency d where (a.cus_id=b.id or a.t_cus_id=b.id) and b.g_id=c.id and a.curr_id=d.id and c.id=? and d.name=? ", new String[]{sb.toString(), sb2.toString()});
        mo532b();
        return rawQuery;
    }

    /* renamed from: n */
    public String mo601n() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f478w.getString(2131755251));
        sb.append(" - ");
        sb.append(mo609q("pref_credit", this.f478w.getString(2131755144)));
        return sb.toString();
    }

    /* renamed from: o */
    public int mo602o(String str, String str2) {
        String str3 = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            sb.append(str3);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(str2);
            sb2.append(str3);
            Cursor rawQuery = this.f477v.rawQuery("select count(*) as _id from valid where imei=? and imei_code=? and imei is not null ", new String[]{sb.toString(), sb2.toString()});
            rawQuery.moveToFirst();
            int i = 0;
            while (!rawQuery.isAfterLast()) {
                i = rawQuery.getInt(rawQuery.getColumnIndex("_id"));
                rawQuery.moveToNext();
            }
            rawQuery.close();
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: o */
    public Cursor mo603o() {
        try {
            mo477R();
            Cursor rawQuery = this.f477v.rawQuery("SELECT distinct d.id as _id, d.name,(select count(distinct b.id) from customers b,transactions a  where (a.cus_id = b.id or a.t_cus_id=b.id) and a.curr_id=d.id) cnt   FROM currency d      ORDER BY d.id  ", null);
            mo532b();
            return rawQuery;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: o */
    public ArrayList<String> mo604o(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        Cursor rawQuery = sQLiteDatabase.rawQuery("select sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end) F1  from cus_tr_curr_view a  where a.b_name=? ", new String[]{sb.toString()});
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            arrayList.add(String.valueOf(rawQuery.getDouble(rawQuery.getColumnIndex("F1"))));
            rawQuery.moveToNext();
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: p */
    public ArrayList<HashMap<String, String>> mo605p() {
        ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f477v.rawQuery("select  id as _id ,name from currency order by 1 desc ", null);
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            HashMap hashMap = new HashMap();
            hashMap.put(Attribute.f2026ID, rawQuery.getString(rawQuery.getColumnIndex("_id")));
            String str = Attribute.NAME;
            hashMap.put(str, rawQuery.getString(rawQuery.getColumnIndex(str)));
            arrayList.add(hashMap);
            rawQuery.moveToNext();
        }
        return arrayList;
    }

    /* renamed from: p */
    public ArrayList<String> mo606p(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f477v.rawQuery("select ifnull(sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end),0) F1  from cus_tr_curr_view a where a.g_id=?   ", new String[]{str});
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            arrayList.add(String.valueOf(rawQuery.getDouble(rawQuery.getColumnIndex("F1"))));
            rawQuery.moveToNext();
        }
        rawQuery.close();
        return arrayList;
    }

    /* renamed from: p */
    public ArrayList<String> mo607p(String str, String str2) {
        Cursor cursor;
        ArrayList<String> arrayList = new ArrayList<>();
        if (!str2.equals("")) {
            cursor = this.f477v.rawQuery("select  a.remarks,count(*) cnt from transactions a where a.cus_id=(select b.id from customers b where b.name=?) and a.t_cus_id=(select ifnull(b.id,0) from customers b where b.name=?)group by a.remarks order by 2 desc limit 3  ", new String[]{str, str2});
        } else {
            cursor = this.f477v.rawQuery("select  a.remarks,count(*) cnt from transactions a where a.cus_id=(select b.id from customers b where b.name=?)group by a.remarks order by 2 desc  ", new String[]{str});
        }
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            arrayList.add(cursor.getString(cursor.getColumnIndex("remarks")));
            cursor.moveToNext();
        }
        cursor.close();
        return arrayList;
    }

    /* renamed from: q */
    public String mo608q() {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("select strftime('%d-%m-%Y','now') _id  ", null);
        rawQuery.moveToFirst();
        String str = "";
        while (!rawQuery.isAfterLast()) {
            str = rawQuery.getString(rawQuery.getColumnIndex("_id"));
            rawQuery.moveToNext();
        }
        rawQuery.close();
        mo532b();
        return str;
    }

    /* renamed from: q */
    public String mo609q(String str, String str2) {
        try {
            return PreferenceManager.getDefaultSharedPreferences(this.f478w).getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: q */
    public ArrayList<String> mo610q(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f477v.rawQuery("select ifnull(sum(case when (b.t_cus_id=a.id) then -1*b.out else  (b.[in]*b.out) end),0) F1  from transactions b,customers a,currency d  where (b.cus_id=a.id  or b.t_cus_id=a.id)  and b.curr_id=d.id  and d.name=?   ", new String[]{str});
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            arrayList.add(String.valueOf(rawQuery.getDouble(rawQuery.getColumnIndex("F1"))));
            rawQuery.moveToNext();
        }
        return arrayList;
    }

    /* renamed from: r */
    public Cursor mo611r(String str, String str2) {
        mo477R();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        Cursor rawQuery = sQLiteDatabase.rawQuery(" select * from (SELECT a.b_name as _id ,ifnull( abs(sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end)),0) AS amount,  (case when sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end)>= 0 then  1+1 else -1+1 end ) as _in ,a.b_id as id,a.gsm as phone ,max(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d,( (select julianday(strftime('%Y-%m-%d','now')) -julianday(max(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) ))) from transactions as c where (c.cus_id=a.b_id or c.t_cus_id=a.b_id)) ) as days_late ,a.c_id g_id,a.c_name g_name,ifnull( a.d_name, (select name from currency where id=0))  curr_name   FROM cus_tr_curr_view a  where a.c_id=? GROUP BY a.b_name,a.d_id,a.d_name, a.b_id having ifnull( abs(sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end)),0)<>0  ORDER BY amount DESC,_in desc) where curr_name=?  ", new String[]{sb.toString(), str2});
        mo532b();
        return rawQuery;
    }

    /* renamed from: r */
    public String mo612r() {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("select distinct imei as _id from valid  ", null);
        rawQuery.moveToFirst();
        String str = "";
        while (!rawQuery.isAfterLast()) {
            str = rawQuery.getString(rawQuery.getColumnIndex("_id"));
            rawQuery.moveToNext();
        }
        mo532b();
        return str;
    }

    /* renamed from: r */
    public ArrayList<String> mo613r(String str) {
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor rawQuery = this.f477v.rawQuery("select ifnull( sum(case when  tot<0 then tot*-1 else 0 end ),0)F1,ifnull(sum(case when  tot>0 then tot else 0 end ),0)F2 from (select a.b_id cus_id,sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end) tot  from cus_tr_curr_view a group by a.b_id)All_,customers c  where all_.cus_id=c.id and c.g_id=?  ", new String[]{str});
            rawQuery.moveToFirst();
            while (!rawQuery.isAfterLast()) {
                arrayList.add(String.valueOf(rawQuery.getDouble(rawQuery.getColumnIndex("F1"))));
                arrayList.add(String.valueOf(rawQuery.getDouble(rawQuery.getColumnIndex("F2"))));
                rawQuery.moveToNext();
            }
            rawQuery.close();
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: s */
    public Cursor mo614s(String str, String str2) {
        Cursor cursor;
        mo477R();
        String str3 = Value.PERCENTAGE;
        String str4 = "SELECT a.id as id, ifnull((sum(case when (c.t_cus_id=b.id) then -1*c.out else  (c.[in]*c.out) end))*1  ,0) as net_balance                 ,sum(case  when c.[in] = 1 and (c.t_cus_id<>b.id or c.t_cus_id is null) then c.out else 0 end)*1.0 as cr_amount ,                sum(case when not(c.[in] = 1 and (c.t_cus_id<>b.id or c.t_cus_id is null)) then c.out else 0 end )*1.0 as db_amount ,a.name as _id                 from groups a left join customers b on (a.id=b.g_id)                 left join transactions c on (c.cus_id = b.id or c.t_cus_id=b.id) ";
        String str5 = " group by a.name,a.id  order by 2 ";
        if (str.equals(str3) && str2.equals(str3)) {
            SQLiteDatabase sQLiteDatabase = this.f477v;
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append("   ");
            sb.append(str5);
            cursor = sQLiteDatabase.rawQuery(sb.toString(), null);
        } else if (str.equals(str3) && !str2.equals(str3)) {
            SQLiteDatabase sQLiteDatabase2 = this.f477v;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str4);
            sb2.append(" where  date(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) )) <= ?  ");
            sb2.append(str5);
            cursor = sQLiteDatabase2.rawQuery(sb2.toString(), new String[]{str2});
        } else if (str.equals(str3) || !str2.equals(str3)) {
            SQLiteDatabase sQLiteDatabase3 = this.f477v;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str4);
            sb3.append(" where  date(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) )) between ? and ? ");
            sb3.append(str5);
            cursor = sQLiteDatabase3.rawQuery(sb3.toString(), new String[]{str, str2});
        } else {
            SQLiteDatabase sQLiteDatabase4 = this.f477v;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str4);
            sb4.append(" where date(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) )) >= ?  ");
            sb4.append(str5);
            cursor = sQLiteDatabase4.rawQuery(sb4.toString(), new String[]{str});
        }
        mo532b();
        return cursor;
    }

    /* renamed from: s */
    public String mo615s(String str) {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("select b.g_id as _id from customers b where b.id=? ", new String[]{str});
        rawQuery.moveToFirst();
        String str2 = "";
        while (!rawQuery.isAfterLast()) {
            str2 = rawQuery.getString(rawQuery.getColumnIndex("_id"));
            rawQuery.moveToNext();
        }
        mo532b();
        rawQuery.close();
        return str2;
    }

    /* renamed from: s */
    public ArrayList<String> mo616s() {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f477v.rawQuery("SELECT a.name as _id  FROM currency a  ", null);
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            arrayList.add(rawQuery.getString(rawQuery.getColumnIndex("_id")));
            rawQuery.moveToNext();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(arrayList.size());
        sb.append("");
        Log.d("messageArrayList_cnt=", sb.toString());
        return arrayList;
    }

    /* renamed from: t */
    public C0082EH mo617t(String str) {
        C0082EH eh = new C0082EH("", "", "", 0.0d, 0, 0);
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        Cursor rawQuery = sQLiteDatabase.rawQuery("select a.id as _id ,a.*,b.name as g_name from customers a,groups b where a.g_id=b.id and a.name=?  ", new String[]{sb.toString()});
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            eh.mo186c(rawQuery.getString(rawQuery.getColumnIndex("_id")));
            eh.mo188d(rawQuery.getString(rawQuery.getColumnIndex(Attribute.NAME)));
            eh.mo184b(rawQuery.getString(rawQuery.getColumnIndex("gsm")));
            eh.mo182a(rawQuery.getString(rawQuery.getColumnIndex("g_name")));
            rawQuery.moveToNext();
        }
        return eh;
    }

    /* renamed from: t */
    public Cursor mo618t() {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery(" select distinct 0 as _id,'' as g_name,d.name as curr_name  from transactions a,currency d where a.curr_id=d.id  ", null);
        mo532b();
        return rawQuery;
    }

    /* renamed from: t */
    public Cursor mo619t(String str, String str2) {
        mo477R();
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        sb.append(str3);
        sb.append(str);
        sb.append(str3);
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT b.name id, substr(a.date_,7,4)||'-' ||substr(a.date_,4,2) _id, ifnull((sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end))*1  ,0) AS amount,     (case when sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end)>= 0 then  1+1 else -1+1 end ) as _in,0 days_late,0 phone   FROM customers b, transactions AS a ,currency d   where (a.cus_id = b.id or a.t_cus_id=b.id) and a.curr_id=d.id and b.name=? and d.name=?   GROUP BY substr(a.date_,7,4)||'-' ||substr(a.date_,4,2),b.name  order by 2  ", new String[]{sb.toString(), str2});
        mo532b();
        return rawQuery;
    }

    /* renamed from: u */
    public Cursor mo620u() {
        return this.f477v.rawQuery("SELECT a.ID as _id, a.date_ as date_,abs(a.out * a.[in]) as amount ,a.remarks,(a.[in]+1) as _in,0 as Bal, strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d,substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1  FROM transactions AS a, customers AS b  WHERE a.cus_id = b.id   ORDER BY (d2)  desc,1 desc  ", null);
    }

    /* renamed from: u */
    public Cursor mo621u(String str) {
        try {
            mo477R();
            Cursor rawQuery = this.f477v.rawQuery("SELECT a.b_name as _id ,ifnull( abs(sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end)),0) AS amount,  (case when sum(case when (a.t_cus_id=a.b_id) then -1*a.out else  (a.[in]*a.out) end)>= 0 then  1+1 else -1+1 end ) as _in ,a.b_id as id,a.gsm as phone ,max(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d,( (select julianday(strftime('%Y-%m-%d','now')) -julianday(max(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) ))) from transactions as c where (c.cus_id=a.b_id or c.t_cus_id=a.b_id)) ) as days_late,ifnull(max(a.a_id),0) max_id,(case when length(count(*))=1 then '  '||count(*)||'  ' else ' '||count(*)||' ' end) cnt,a.g_id, a.c_name g_name,'' curr_name  ,'' curr_name FROM cus_tr_curr_view a where a.g_id=?  GROUP BY a.b_name, a.b_id   ORDER BY d DESC,max_id desc  ", new String[]{str});
            mo532b();
            return rawQuery;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: u */
    public Cursor mo622u(String str, String str2) {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT 0 id, substr(a.date_,7,4)||'-' ||substr(a.date_,4,2) _id, ifnull( abs(sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end)),0) AS amount,     (case when sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end)>= 0 then  1+1 else -1+1 end ) as _in,0 days_late,0 phone ,d.name curr_name  FROM customers b, transactions AS a ,currency d   where (a.cus_id = b.id or a.t_cus_id = b.id ) and a.curr_id=d.id and b.g_id=? and d.name=?   GROUP BY substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)  order by 2  ", new String[]{str, str2});
        mo532b();
        return rawQuery;
    }

    /* renamed from: v */
    public int mo623v() {
        try {
            Cursor rawQuery = this.f477v.rawQuery("SELECT a.ID as _id,substr(a.date_,1,10) as date_,abs(a.out * a.[in]) as amount ,a.remarks,(a.[in]+1) as _in,0 as Bal  FROM transactions AS a, customers AS b  WHERE a.cus_id = b.id  ORDER BY a.date_   ", null);
            int count = rawQuery.getCount();
            rawQuery.close();
            return count;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: v */
    public Cursor mo624v(String str) {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT b.name as _id ,ifnull( abs(sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end)),0) AS amount,  (case when sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end)>= 0 then  1+1 else -1+1 end ) as _in ,b.id as id,b.gsm as phone ,max(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d,( (select julianday(strftime('%Y-%m-%d','now')) -julianday(max(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) ))) from transactions as c where (c.cus_id=b.id or c.t_cus_id=b.id)) ) as days_late,ifnull(max(a.id),0) max_id,(case when length(count(*))=1 then '  '||count(*)||'  ' else ' '||count(*)||' ' end) cnt,b.g_id, c.name g_name,'' curr_name  ,'' curr_name FROM groups c inner join customers AS b on c.id=b.g_id  left join transactions AS a   on (a.cus_id = b.id or a.t_cus_id = b.id) where b.g_id=?  GROUP BY b.name, b.id   ORDER BY d DESC,max_id desc  ", new String[]{str});
        mo532b();
        return rawQuery;
    }

    /* renamed from: v */
    public Cursor mo625v(String str, String str2) {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT 0 as id,  sum(case when a.[in] = 1 and (a.t_cus_id<>a.b_id or a.t_cus_id is null) then -1*a.out else a.out*1 end)*-1.0 as net_balance , a.b_name as _id,a.gsm as gsm, sum(case  when a.[in] = 1 and (a.t_cus_id<>a.b_id or a.t_cus_id is null)  then a.out else 0 end)*1.0 as cr_amount , sum(case when not(a.[in] = 1 and (a.t_cus_id<>a.b_id or a.t_cus_id is null))  then a.out else 0 end )*1.0 as db_amount  ,a.d_name curr_name  FROM cus_tr_curr_view a where a.g_id=?  and a.d_name=? group by a.b_name,a.b_id,a.gsm order by a.b_name  ", new String[]{str, str2});
        mo532b();
        return rawQuery;
    }

    /* renamed from: w */
    public int mo626w(String str) {
        this.f469H = new ArrayList();
        this.f469H.add("3529440532844");
        this.f469H.add("99000493341412");
        this.f469H.add("35421807214959");
        this.f469H.add("99000547777656");
        this.f469H.add("");
        this.f469H.add("99000447247059");
        this.f469H.add("99000490795597");
        return this.f469H.contains(str) ? 1 : 0;
    }

    /* renamed from: w */
    public Cursor mo627w() {
        try {
            return this.f477v.rawQuery("SELECT a.ID as _id,substr(a.date_,1,10) as date_,abs(a.out * a.[in]) as amount ,a.remarks,(a.[in]+1) as _in,0 as Bal  FROM transactions AS a, customers AS b  WHERE a.cus_id = b.id and a.now_=strftime('%Y-%m-%d','now')  ORDER BY a.date_   ", null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: w */
    public Cursor mo628w(String str, String str2) {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT b.name as _id ,ifnull((sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end))*1  ,0) AS amount,  (case when sum(case when (a.t_cus_id=b.id) then -1*a.out else  (a.[in]*a.out) end)>= 0 then  1+1 else -1+1 end ) as _in ,b.id as id,b.gsm as phone ,max(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d,( (select julianday(strftime('%Y-%m-%d','now')) -julianday(max(strftime('%Y-%m-%d',substr(c.date_,7,4)||'-' ||substr(c.date_,4,2)||'-'||substr(c.date_,1,2) ))) from transactions as c where c.cus_id=b.id) ) as days_late  FROM customers AS b  , transactions AS a     where (a.cus_id = b.id or a.t_cus_id=b.id) and substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)=? and b.g_id=?   GROUP BY substr(a.date_,7,4)||'-' ||substr(a.date_,4,2),b.name,b.id  order by 2  ", new String[]{str, str2});
        mo532b();
        return rawQuery;
    }

    /* renamed from: x */
    public Cursor mo629x(String str) {
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        return sQLiteDatabase.rawQuery("SELECT * from groups where name=?  ", new String[]{sb.toString()});
    }

    /* renamed from: x */
    public ArrayList<String> mo630x() {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f477v.rawQuery("select ifnull( sum(case when  tot<0 then tot*-1 else 0 end ),0)F1,ifnull(sum(case when  tot>0 then tot else 0 end ),0)F2 from (select cus_id,sum([in]*out) tot  from transactions T  group by cus_id  )All_,customers a  where all_.cus_id=a.id  ", null);
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            arrayList.add(rawQuery.getString(rawQuery.getColumnIndex("F1")));
            arrayList.add(rawQuery.getString(rawQuery.getColumnIndex("F2")));
            rawQuery.moveToNext();
        }
        return arrayList;
    }

    /* renamed from: x */
    public void mo631x(String str, String str2) {
        try {
            Editor edit = PreferenceManager.getDefaultSharedPreferences(this.f478w.getApplicationContext()).edit();
            edit.putString(str, str2);
            edit.commit();
        } catch (Exception unused) {
        }
    }

    /* renamed from: y */
    public String mo632y(String str) {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("select  name as _id from groups where id=?  ", new String[]{str});
        rawQuery.moveToFirst();
        String str2 = "";
        while (!rawQuery.isAfterLast()) {
            str2 = rawQuery.getString(rawQuery.getColumnIndex("_id"));
            rawQuery.moveToNext();
        }
        mo532b();
        return str2;
    }

    /* renamed from: y */
    public ArrayList<String> mo633y() {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor rawQuery = this.f477v.rawQuery("select sum(case when (b.t_cus_id=a.id) then -1*b.out else  (b.[in]*b.out) end) F1  from transactions b,customers a  where (b.cus_id=a.id or b.t_cus_id=a.id)   ", null);
        rawQuery.moveToFirst();
        while (!rawQuery.isAfterLast()) {
            arrayList.add(String.valueOf(rawQuery.getDouble(rawQuery.getColumnIndex("F1"))));
            rawQuery.moveToNext();
        }
        return arrayList;
    }

    /* renamed from: y */
    public void mo634y(String str, String str2) {
        try {
            if (str.length() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("sms:");
                sb.append(str);
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
                intent.putExtra("sms_body", str2);
                this.f478w.startActivity(intent);
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e.getMessage());
            sb2.append("");
            Log.d("sms_error", sb2.toString());
            e.printStackTrace();
        }
    }

    /* renamed from: z */
    public Cursor mo635z() {
        mo477R();
        Cursor rawQuery = this.f477v.rawQuery("SELECT distinct c.id as _id, c.name g_name ,max(strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) )) d, ifnull(max(a.id),0) max_id,'' curr_name  FROM groups c left join customers AS b on c.id=b.g_id     left join transactions a on a.cus_id=b.id group by c.id,c.name  ORDER BY d DESC,max_id desc,c.id   ", null);
        mo532b();
        return rawQuery;
    }

    /* renamed from: z */
    public Cursor mo636z(String str) {
        SQLiteDatabase sQLiteDatabase = this.f477v;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        sb.append(str2);
        sb.append(str);
        sb.append(str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        return sQLiteDatabase.rawQuery("SELECT a.ID as _id, a.date_ as date_,abs(a.out * a.[in]) as amount ,a.remarks,(a.[in]+1) as _in,0 as bal, strftime('%Y-%m-%d',substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2) ) d,substr(a.date_,7,4)||'-' ||substr(a.date_,4,2)||'-'||substr(a.date_,1,2)  d2,b.name,a.param1, d.name curr_name  FROM transactions AS a, customers AS b,currency d  WHERE a.cus_id = b.id  and (a.cus_id=? or b.name=?) and a.curr_id=d.id  ORDER BY (d2)  desc,1 desc LIMIT 1 OFFSET 0 ", new String[]{sb.toString(), sb2.toString()});
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0025 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029 A[Catch:{ Exception -> 0x0092 }] */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo637z(String r6, String r7) {
        /*
            r5 = this;
            int r0 = r6.length()     // Catch:{ Exception -> 0x0092 }
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = r6.trim()     // Catch:{ Exception -> 0x0092 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0092 }
            r1 = 9
            java.lang.String r2 = ""
            if (r0 > r1) goto L_0x003e
            java.lang.String r0 = f447g     // Catch:{ Exception -> 0x0092 }
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x0092 }
            if (r0 == 0) goto L_0x0025
            android.content.Context r0 = r5.f478w     // Catch:{ Exception -> 0x0025 }
            java.lang.String r0 = r5.mo558d(r0)     // Catch:{ Exception -> 0x0025 }
            f447g = r0     // Catch:{ Exception -> 0x0025 }
        L_0x0025:
            java.lang.String r0 = f447g     // Catch:{ Exception -> 0x0092 }
            if (r0 == 0) goto L_0x003e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0092 }
            r0.<init>()     // Catch:{ Exception -> 0x0092 }
            java.lang.String r1 = f447g     // Catch:{ Exception -> 0x0092 }
            r0.append(r1)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r6 = r6.trim()     // Catch:{ Exception -> 0x0092 }
            r0.append(r6)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r6 = r0.toString()     // Catch:{ Exception -> 0x0092 }
        L_0x003e:
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0092 }
            java.lang.String r1 = "android.intent.action.SEND"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r1 = "prefOthers_whats_bus"
            r3 = 0
            boolean r1 = r5.mo524a(r1, r3)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r3 = "com.whatsapp.ContactPicker"
            if (r1 == 0) goto L_0x005b
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ Exception -> 0x0092 }
            java.lang.String r4 = "com.whatsapp.w4b"
            r1.<init>(r4, r3)     // Catch:{ Exception -> 0x0092 }
        L_0x0057:
            r0.setComponent(r1)     // Catch:{ Exception -> 0x0092 }
            goto L_0x0063
        L_0x005b:
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ Exception -> 0x0092 }
            java.lang.String r4 = "com.whatsapp"
            r1.<init>(r4, r3)     // Catch:{ Exception -> 0x0092 }
            goto L_0x0057
        L_0x0063:
            java.lang.String r1 = "text/plain"
            r0.setType(r1)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r1 = "android.intent.extra.TEXT"
            r0.putExtra(r1, r7)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r7 = "jid"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0092 }
            r1.<init>()     // Catch:{ Exception -> 0x0092 }
            java.lang.String r3 = "+"
            java.lang.String r6 = r6.replace(r3, r2)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r6 = android.telephony.PhoneNumberUtils.stripSeparators(r6)     // Catch:{ Exception -> 0x0092 }
            r1.append(r6)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r6 = "@s.whatsapp.net"
            r1.append(r6)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x0092 }
            r0.putExtra(r7, r6)     // Catch:{ Exception -> 0x0092 }
            android.content.Context r6 = r5.f478w     // Catch:{ Exception -> 0x0092 }
            r6.startActivity(r0)     // Catch:{ Exception -> 0x0092 }
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0195JU.mo637z(java.lang.String, java.lang.String):void");
    }
}
