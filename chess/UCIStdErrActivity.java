package cab.shashki.app.ui.chess;

import N0.C0573k;
import U0.e;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import f0.AbstractC0888D;
import f0.AbstractC0920x;
import f0.AbstractC0922z;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import h3.m;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class UCIStdErrActivity extends AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L {
    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(AbstractC0922z.f15167V0);
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.G6, false, 2, null);
        ((TextView) findViewById(AbstractC0920x.W3)).setText(e.f3861r.a());
        C0573k c0573k = C0573k.f2973a;
        View viewFindViewById = findViewById(AbstractC0920x.u5);
        m.d(viewFindViewById, "findViewById(...)");
        C0573k.v(c0573k, viewFindViewById, 0, 1, null);
    }
}