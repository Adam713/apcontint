package com.adam.myapplication;


import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.content.FileProvider;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import java.io.File;

public class pdf_view extends AppCompatActivity {

    /* renamed from: a */
    public String f2817a = "";

    /* renamed from: b */
    public SQLiteDatabase f2818b;

    /* renamed from: c */
    public C0195JU f2819c;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.valdio.valdioveliu.recyclerview.pdf_view, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        String str = "filename";
        pdf_view.super.onCreate(bundle);
        setContentView(2131492904);
        try {
            this.f2819c = new C0195JU(this.f2818b, this);
            if (getIntent().getStringExtra(str) != null) {
                this.f2817a = getIntent().getStringExtra(str);
                setTitle(this.f2817a.replace(".pdf", ""));
                StringBuilder sb = new StringBuilder();
                sb.append(C0195JU.f441a);
                sb.append("/");
                sb.append(this.f2817a);
                File file = new File(sb.toString());
                if (file.exists()) {
                    if (VERSION.SDK_INT >= 24) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(getApplicationContext().getPackageName());
                        sb2.append(".provider");
                        FileProvider.getUriForFile(this, sb2.toString(), file);
                    } else {
                        Uri.fromFile(file);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558417, menu);
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.valdio.valdioveliu.recyclerview.pdf_view, android.app.Activity] */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131296622) {
            try {
                this.f2819c.mo484U(this.f2817a);
            } catch (Exception unused) {
            }
            return true;
        } else if (itemId != 16908332) {
            return pdf_view.super.onOptionsItemSelected(menuItem);
        } else {
            finish();
            return true;
        }
    }
}
