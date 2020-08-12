package p000;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.valdio.valdioveliu.recyclerview.Customer_Det_List_edit;

/* renamed from: RM */
class C0368RM implements OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0390b f1078a;

    /* renamed from: b */
    public final /* synthetic */ C0388SM f1079b;

    public C0368RM(C0388SM sm, C0390b bVar) {
        this.f1079b = sm;
        this.f1078a = bVar;
    }

    public void onClick(View view) {
        Intent intent = new Intent(view.getContext(), Customer_Det_List_edit.class);
        intent.putExtra("CUS_NAME", this.f1078a.f1144b.getText().toString());
        intent.putExtra("CUS_GSM", this.f1078a.f1145c.getText().toString());
        intent.putExtra("CUS_ID", this.f1078a.f1143a.getText().toString());
        intent.putExtra("G_NAME", this.f1078a.f1151i);
        intent.putExtra("CURR_NAME", this.f1078a.f1152j);
        this.f1079b.getContext().startActivity(intent);
    }
}
