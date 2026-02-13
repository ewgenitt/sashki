package cab.shashki.app.ui.checkers;

import N0.C0573k;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import cab.shashki.app.ui.checkers.Checkers10SettingsActivity;
import f0.AbstractC0888D;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0965e;
import h3.m;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class Checkers10SettingsActivity extends AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L {

    /* renamed from: I, reason: collision with root package name */
    private C0965e f10877I;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S2(Checkers10SettingsActivity checkers10SettingsActivity, View view) {
        checkers10SettingsActivity.startActivity(new Intent(checkers10SettingsActivity, (Class<?>) Checkers10FilesActivity.class));
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0965e c0965eD = C0965e.d(getLayoutInflater());
        this.f10877I = c0965eD;
        C0965e c0965e = null;
        if (c0965eD == null) {
            m.r("binding");
            c0965eD = null;
        }
        setContentView(c0965eD.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.f14483g0, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        C0965e c0965e2 = this.f10877I;
        if (c0965e2 == null) {
            m.r("binding");
            c0965e2 = null;
        }
        TextView textView = c0965e2.f15637b;
        m.d(textView, "files");
        c0573k.r(textView, 5);
        C0965e c0965e3 = this.f10877I;
        if (c0965e3 == null) {
            m.r("binding");
        } else {
            c0965e = c0965e3;
        }
        c0965e.f15637b.setOnClickListener(new View.OnClickListener() { // from class: v0.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Checkers10SettingsActivity.S2(this.f19990b, view);
            }
        });
    }
}