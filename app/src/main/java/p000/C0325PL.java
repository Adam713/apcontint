package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.NodeList;

/* renamed from: PL */
public class C0325PL extends SQLiteOpenHelper {

    /* renamed from: a */
    public static C0325PL f937a;

    /* renamed from: b */
    public static final String f938b;

    /* renamed from: c */
    public Context f939c;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
        sb.append("/Market_Customers/");
        f938b = sb.toString();
    }

    public C0325PL(Context context) {
        super(context, "market.db", null, 4);
        this.f939c = context;
    }

    /* renamed from: a */
    public static synchronized C0325PL m994a(Context context) {
        C0325PL pl;
        synchronized (C0325PL.class) {
            if (f937a == null) {
                f937a = new C0325PL(context.getApplicationContext());
            }
            pl = f937a;
        }
        return pl;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(this.f939c.getResources().openRawResource(2131689473), null).getElementsByTagName("statement");
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                sQLiteDatabase.execSQL(elementsByTagName.item(i).getChildNodes().item(0).getNodeValue());
            }
        } catch (Throwable th) {
            Toast.makeText(this.f939c, th.toString(), 1).show();
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str = "statement";
        String str2 = "Upgrade_err=";
        if (i == 1 && i2 == 3) {
            try {
                NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(this.f939c.getResources().openRawResource(2131689474), null).getElementsByTagName(str);
                for (int i3 = 0; i3 < elementsByTagName.getLength(); i3++) {
                    sQLiteDatabase.execSQL(elementsByTagName.item(i3).getChildNodes().item(0).getNodeValue());
                }
            } catch (Throwable th) {
                Toast.makeText(this.f939c, th.toString(), 1).show();
                Log.d(str2, th.toString());
            }
        } else if (i == 2 && i2 == 3) {
            NodeList elementsByTagName2 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(this.f939c.getResources().openRawResource(2131689475), null).getElementsByTagName(str);
            for (int i4 = 0; i4 < elementsByTagName2.getLength(); i4++) {
                sQLiteDatabase.execSQL(elementsByTagName2.item(i4).getChildNodes().item(0).getNodeValue());
            }
        } else if (i == 3 && i2 == 4) {
            NodeList elementsByTagName3 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(this.f939c.getResources().openRawResource(2131689476), null).getElementsByTagName(str);
            for (int i5 = 0; i5 < elementsByTagName3.getLength(); i5++) {
                sQLiteDatabase.execSQL(elementsByTagName3.item(i5).getChildNodes().item(0).getNodeValue());
            }
        }
    }
}
