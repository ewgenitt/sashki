package cab.shashki.othello;

import D0.F;
import N0.C0573k;
import T2.u;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.a;
import cab.shashki.app.service.b;
import cab.shashki.app.service.c;
import cab.shashki.othello.OthelloSettingsActivity;
import f0.AbstractC0888D;
import f0.AbstractC0920x;
import f0.AbstractC0922z;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g3.InterfaceC1005a;
import h3.m;
import java.io.File;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class OthelloSettingsActivity extends AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L {

    /* renamed from: I, reason: collision with root package name */
    private TextView f11906I;

    /* renamed from: J, reason: collision with root package name */
    private TextView f11907J;

    private final void V2() {
        File file = new File(getFilesDir(), "reversi");
        File file2 = new File(file, "book.bin");
        File file3 = new File(file, "coeffs2.bin");
        file2.delete();
        file3.delete();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(final OthelloSettingsActivity othelloSettingsActivity, View view) {
        new a.C0075a(othelloSettingsActivity).u(AbstractC0888D.f14468d0).q(AbstractC0888D.S6, new DialogInterface.OnClickListener() { // from class: X0.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                OthelloSettingsActivity.X2(this.f4237b, dialogInterface, i4);
            }
        }).k(AbstractC0888D.f14505k2, null).x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(OthelloSettingsActivity othelloSettingsActivity, DialogInterface dialogInterface, int i4) {
        othelloSettingsActivity.V2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y2(final OthelloSettingsActivity othelloSettingsActivity, View view) {
        F.f307w0.a(b.a.f10606A.b()).o5(new InterfaceC1005a() { // from class: X0.d
            @Override // g3.InterfaceC1005a
            public final Object a() {
                return OthelloSettingsActivity.Z2(this.f4238d);
            }
        }).S4(othelloSettingsActivity.g2(), "loader");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u Z2(OthelloSettingsActivity othelloSettingsActivity) {
        othelloSettingsActivity.a3();
        return u.f3817a;
    }

    private final void a3() {
        TextView textView = null;
        if (c.f10845a.c()) {
            TextView textView2 = this.f11907J;
            if (textView2 == null) {
                m.r("download");
                textView2 = null;
            }
            textView2.setVisibility(8);
            TextView textView3 = this.f11906I;
            if (textView3 == null) {
                m.r("delete");
            } else {
                textView = textView3;
            }
            textView.setVisibility(0);
            return;
        }
        TextView textView4 = this.f11907J;
        if (textView4 == null) {
            m.r("download");
            textView4 = null;
        }
        textView4.setVisibility(0);
        TextView textView5 = this.f11906I;
        if (textView5 == null) {
            m.r("delete");
        } else {
            textView = textView5;
        }
        textView.setVisibility(8);
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AbstractC0922z.f15218q0);
        TextView textView = null;
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.j6, false, 2, null);
        this.f11906I = (TextView) findViewById(AbstractC0920x.f15044k1);
        this.f11907J = (TextView) findViewById(AbstractC0920x.f15074q1);
        C0573k c0573k = C0573k.f2973a;
        TextView textView2 = this.f11906I;
        if (textView2 == null) {
            m.r("delete");
            textView2 = null;
        }
        c0573k.r(textView2, 5);
        TextView textView3 = this.f11907J;
        if (textView3 == null) {
            m.r("download");
            textView3 = null;
        }
        c0573k.r(textView3, 5);
        a3();
        TextView textView4 = this.f11906I;
        if (textView4 == null) {
            m.r("delete");
            textView4 = null;
        }
        textView4.setOnClickListener(new View.OnClickListener() { // from class: X0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OthelloSettingsActivity.W2(this.f4235b, view);
            }
        });
        TextView textView5 = this.f11907J;
        if (textView5 == null) {
            m.r("download");
        } else {
            textView = textView5;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: X0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OthelloSettingsActivity.Y2(this.f4236b, view);
            }
        });
    }
}