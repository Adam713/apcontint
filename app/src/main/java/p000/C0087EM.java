package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.TextView;
import com.valdio.valdioveliu.recyclerview.Google_drive_list;

/* renamed from: EM */
class C0087EM implements OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ Google_drive_list f215a;

    public C0087EM(Google_drive_list google_drive_list) {
        this.f215a = google_drive_list;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        try {
            String charSequence = ((TextView) view.findViewById(2131296455)).getText().toString();
            String charSequence2 = ((TextView) view.findViewById(2131296664)).getText().toString();
            this.f215a.f2495g = charSequence;
            this.f215a.f2494f = charSequence2;
            this.f215a.mo3836i();
        } catch (Exception unused) {
        }
    }
}
