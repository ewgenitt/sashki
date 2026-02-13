package cab.shashki.app.ui.help;

import N0.C0573k;
import android.os.Bundle;
import android.view.View;
import f0.AbstractC0888D;
import f0.AbstractC0920x;
import f0.AbstractC0922z;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import h3.m;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class HelpActivity extends AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L {
    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AbstractC0922z.f15152O);
        G2(AbstractC0888D.f14568x0, true);
        C0573k c0573k = C0573k.f2973a;
        View viewFindViewById = findViewById(AbstractC0920x.u5);
        m.d(viewFindViewById, "findViewById(...)");
        C0573k.v(c0573k, viewFindViewById, 0, 1, null);
    }
}