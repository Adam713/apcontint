package com.adam.myapplication;

import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.support.annotation.LayoutRes;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatDelegate;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public abstract class AppCompatPreferenceActivity extends PreferenceActivity {

    /* renamed from: a */
    public AppCompatDelegate f2056a;

    /* renamed from: a */
    public final AppCompatDelegate mo3330a() {
        if (this.f2056a == null) {
            this.f2056a = AppCompatDelegate.create(this, null);
        }
        return this.f2056a;
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        mo3330a().addContentView(view, layoutParams);
    }

    /* renamed from: b */
    public ActionBar mo3332b() {
        return mo3330a().getSupportActionBar();
    }

    public MenuInflater getMenuInflater() {
        return mo3330a().getMenuInflater();
    }

    public void invalidateOptionsMenu() {
        mo3330a().invalidateOptionsMenu();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo3330a().onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        mo3330a().installViewFactory();
        mo3330a().onCreate(bundle);
        super.onCreate(bundle);
    }

    public void onDestroy() {
        super.onDestroy();
        mo3330a().onDestroy();
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mo3330a().onPostCreate(bundle);
    }

    public void onPostResume() {
        super.onPostResume();
        mo3330a().onPostResume();
    }

    public void onStop() {
        super.onStop();
        mo3330a().onStop();
    }

    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        mo3330a().setTitle(charSequence);
    }

    public void setContentView(@LayoutRes int i) {
        mo3330a().setContentView(i);
    }

    public void setContentView(View view) {
        mo3330a().setContentView(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        mo3330a().setContentView(view, layoutParams);
    }
}
