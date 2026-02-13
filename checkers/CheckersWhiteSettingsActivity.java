package cab.shashki.app.ui.checkers;

import N0.C0573k;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import cab.shashki.app.ui.checkers.CheckersWhiteSettingsActivity;
import cab.shashki.app.ui.checkers.draw_table.DrawTableActivity;
import f0.AbstractC0888D;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0969g;
import h3.m;
import q0.C1277a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class CheckersWhiteSettingsActivity extends AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L {

    /* renamed from: I, reason: collision with root package name */
    private C0969g f10879I;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U2(CheckersWhiteSettingsActivity checkersWhiteSettingsActivity, View view) {
        checkersWhiteSettingsActivity.startActivity(new Intent(checkersWhiteSettingsActivity, (Class<?>) DrawTableActivity.class).putExtra("variant", C1277a.EnumC0198a.f19017h.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(CheckersWhiteSettingsActivity checkersWhiteSettingsActivity, View view) {
        checkersWhiteSettingsActivity.startActivity(new Intent(checkersWhiteSettingsActivity, (Class<?>) DrawTableActivity.class).putExtra("variant", C1277a.EnumC0198a.f19018i.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(CheckersWhiteSettingsActivity checkersWhiteSettingsActivity, View view) {
        checkersWhiteSettingsActivity.startActivity(new Intent(checkersWhiteSettingsActivity, (Class<?>) DrawTableActivity.class).putExtra("variant", C1277a.EnumC0198a.f19020k.b()));
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0969g c0969gD = C0969g.d(getLayoutInflater());
        this.f10879I = c0969gD;
        C0969g c0969g = null;
        if (c0969gD == null) {
            m.r("binding");
            c0969gD = null;
        }
        setContentView(c0969gD.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.f14493i0, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        C0969g c0969g2 = this.f10879I;
        if (c0969g2 == null) {
            m.r("binding");
            c0969g2 = null;
        }
        ScrollView scrollView = c0969g2.f15662e;
        m.d(scrollView, "scroll");
        C0573k.v(c0573k, scrollView, 0, 1, null);
        C0969g c0969g3 = this.f10879I;
        if (c0969g3 == null) {
            m.r("binding");
            c0969g3 = null;
        }
        c0969g3.f15659b.setOnClickListener(new View.OnClickListener() { // from class: v0.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersWhiteSettingsActivity.U2(this.f20000b, view);
            }
        });
        C0969g c0969g4 = this.f10879I;
        if (c0969g4 == null) {
            m.r("binding");
            c0969g4 = null;
        }
        c0969g4.f15661d.setOnClickListener(new View.OnClickListener() { // from class: v0.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersWhiteSettingsActivity.V2(this.f19962b, view);
            }
        });
        C0969g c0969g5 = this.f10879I;
        if (c0969g5 == null) {
            m.r("binding");
        } else {
            c0969g = c0969g5;
        }
        c0969g.f15660c.setOnClickListener(new View.OnClickListener() { // from class: v0.B
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersWhiteSettingsActivity.W2(this.f19963b, view);
            }
        });
    }
}