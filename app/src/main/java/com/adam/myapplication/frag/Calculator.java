package com.adam.myapplication.frag;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class Calculator extends AppCompatActivity {

    /* renamed from: a */
    public int[] f2682a = {2131296343, 2131296337, 2131296342, 2131296341, 2131296334, 2131296333, 2131296339, 2131296338, 2131296331, 2131296336};

    /* renamed from: b */
    public int[] f2683b = {2131296326, 2131296340, 2131296335, 2131296329};

    /* renamed from: c */
    public TextView f2684c;

    /* renamed from: d */
    public boolean f2685d;

    /* renamed from: e */
    public boolean f2686e;

    /* renamed from: f */
    public boolean f2687f;

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.frag.Calculator, android.app.Activity] */
    /* renamed from: a */
    public final void mo4133a() {
        try {
            if (this.f2685d && !this.f2686e) {
                String charSequence = this.f2684c.getText().toString();
                if (!charSequence.isEmpty()) {
                    if (charSequence != null) {
                        this.f2684c.setText(Double.toString(new C0555ZU(charSequence).mo1682a().mo1641a()));
                        this.f2687f = true;
                        Intent intent = new Intent();
                        intent.putExtra("calc_result", this.f2684c.getText().toString());
                        setResult(2, intent);
                        finish();
                    }
                }
            }
        } catch (ArithmeticException unused) {
            this.f2684c.setText("Error");
            this.f2686e = true;
            this.f2685d = false;
        }
    }

    /* renamed from: b */
    public final void mo4134b() {
        if (this.f2685d && !this.f2686e) {
            String charSequence = this.f2684c.getText().toString();
            if (!charSequence.isEmpty() && charSequence != null) {
                try {
                    this.f2684c.setText(Double.toString(new C0555ZU(charSequence).mo1682a().mo1641a()));
                    this.f2687f = true;
                } catch (ArithmeticException unused) {
                    this.f2684c.setText("Error");
                    this.f2686e = true;
                    this.f2685d = false;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo4135c() {
        C0551ZQ zq = new C0551ZQ(this);
        for (int findViewById : this.f2682a) {
            findViewById(findViewById).setOnClickListener(zq);
        }
    }

    /* renamed from: d */
    public final void mo4136d() {
        C0574_Q _q = new C0574_Q(this);
        for (int findViewById : this.f2683b) {
            findViewById(findViewById).setOnClickListener(_q);
        }
        findViewById(2131296330).setOnClickListener(new C0609aR(this));
        findViewById(2131296327).setOnClickListener(new C0629bR(this));
        findViewById(2131296332).setOnClickListener(new C0648cR(this));
        findViewById(2131296372).setOnClickListener(new C0737dR(this));
        findViewById(2131296328).setOnClickListener(new C0757eR(this));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Calculator.super.onActivityResult(i, i2, intent);
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        if (fragments != null) {
            for (Fragment fragment : fragments) {
                if (fragment instanceof C1134wP) {
                    fragment.onActivityResult(i, i2, intent);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.support.v4.app.FragmentActivity, com.valdio.valdioveliu.recyclerview.frag.Calculator, android.app.Activity] */
    public void onBackPressed() {
        Calculator.super.onBackPressed();
        setResult(0, new Intent());
        finish();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.valdio.valdioveliu.recyclerview.frag.Calculator, android.app.Activity, android.support.v7.app.AppCompatActivity] */
    public void onCreate(Bundle bundle) {
        Calculator.super.onCreate(bundle);
        supportRequestWindowFeature(1);
        setContentView(2131492905);
        this.f2684c = (TextView) findViewById(2131296691);
        mo4135c();
        mo4136d();
        String str = "tr_amount";
        if (getIntent().getStringExtra(str) != null && getIntent().getStringExtra(str).length() >= 1) {
            this.f2684c.setText(getIntent().getStringExtra(str).replaceAll(",", ""));
            this.f2685d = true;
            if (this.f2684c.getText() != null && this.f2684c.getText().toString().contains(".")) {
                this.f2687f = true;
            }
        }
    }
}
