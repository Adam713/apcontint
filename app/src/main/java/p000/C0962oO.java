package p000;

import android.content.Intent;
import android.provider.MediaStore.Images.Media;
import android.view.View;
import android.view.View.OnClickListener;
import com.valdio.valdioveliu.recyclerview.SettingsActivity.GeneralPreferenceFragment;

/* renamed from: oO */
class C0962oO implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ GeneralPreferenceFragment f3503a;

    public C0962oO(GeneralPreferenceFragment generalPreferenceFragment) {
        this.f3503a = generalPreferenceFragment;
    }

    public void onClick(View view) {
        this.f3503a.f2667d = new Intent("android.intent.action.PICK", Media.EXTERNAL_CONTENT_URI);
        GeneralPreferenceFragment generalPreferenceFragment = this.f3503a;
        generalPreferenceFragment.startActivityForResult(generalPreferenceFragment.f2667d, GeneralPreferenceFragment.f2664a);
    }
}
