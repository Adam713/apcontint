package com.adam.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SearchResultsActivity extends Activity {
    /* renamed from: a */
    public final void mo4056a(Intent intent) {
        if ("android.intent.action.SEARCH".equals(intent.getAction())) {
            mo4057a(intent.getStringExtra("query"));
        }
    }

    /* renamed from: a */
    public final void mo4057a(String str) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo4056a(getIntent());
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        mo4056a(intent);
    }
}
