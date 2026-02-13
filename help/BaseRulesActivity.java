package cab.shashki.app.ui.help;

import N0.C0573k;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import cab.shashki.app.ui.help.BaseRulesActivity;
import f0.AbstractC0888D;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0959b;
import h3.m;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class BaseRulesActivity extends AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L {

    /* renamed from: I, reason: collision with root package name */
    private C0959b f11608I;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V2(BaseRulesActivity baseRulesActivity, View view) {
        baseRulesActivity.startActivity(new Intent(baseRulesActivity, (Class<?>) RulesActivity.class).putExtra("type", AbstractC0888D.t5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W2(BaseRulesActivity baseRulesActivity, View view) {
        baseRulesActivity.startActivity(new Intent(baseRulesActivity, (Class<?>) RulesActivity.class).putExtra("type", AbstractC0888D.k6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X2(BaseRulesActivity baseRulesActivity, View view) {
        baseRulesActivity.startActivity(new Intent(baseRulesActivity, (Class<?>) RulesActivity.class).putExtra("type", AbstractC0888D.A6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y2(BaseRulesActivity baseRulesActivity, View view) {
        baseRulesActivity.startActivity(new Intent(baseRulesActivity, (Class<?>) RulesActivity.class).putExtra("type", AbstractC0888D.j6));
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0959b c0959bD = C0959b.d(getLayoutInflater());
        this.f11608I = c0959bD;
        C0959b c0959b = null;
        if (c0959bD == null) {
            m.r("binding");
            c0959bD = null;
        }
        setContentView(c0959bD.a());
        G2(AbstractC0888D.x4, true);
        C0573k c0573k = C0573k.f2973a;
        C0959b c0959b2 = this.f11608I;
        if (c0959b2 == null) {
            m.r("binding");
            c0959b2 = null;
        }
        LinearLayout linearLayout = c0959b2.f15611c;
        m.d(linearLayout, "chess");
        c0573k.r(linearLayout, 5);
        C0959b c0959b3 = this.f11608I;
        if (c0959b3 == null) {
            m.r("binding");
            c0959b3 = null;
        }
        c0959b3.f15611c.setOnClickListener(new View.OnClickListener() { // from class: H0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseRulesActivity.V2(this.f1386b, view);
            }
        });
        C0959b c0959b4 = this.f11608I;
        if (c0959b4 == null) {
            m.r("binding");
            c0959b4 = null;
        }
        LinearLayout linearLayout2 = c0959b4.f15610b;
        m.d(linearLayout2, "checkers");
        c0573k.r(linearLayout2, 5);
        C0959b c0959b5 = this.f11608I;
        if (c0959b5 == null) {
            m.r("binding");
            c0959b5 = null;
        }
        c0959b5.f15610b.setOnClickListener(new View.OnClickListener() { // from class: H0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseRulesActivity.W2(this.f1387b, view);
            }
        });
        C0959b c0959b6 = this.f11608I;
        if (c0959b6 == null) {
            m.r("binding");
            c0959b6 = null;
        }
        LinearLayout linearLayout3 = c0959b6.f15612d;
        m.d(linearLayout3, "corners");
        c0573k.r(linearLayout3, 5);
        C0959b c0959b7 = this.f11608I;
        if (c0959b7 == null) {
            m.r("binding");
            c0959b7 = null;
        }
        c0959b7.f15612d.setOnClickListener(new View.OnClickListener() { // from class: H0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseRulesActivity.X2(this.f1388b, view);
            }
        });
        C0959b c0959b8 = this.f11608I;
        if (c0959b8 == null) {
            m.r("binding");
            c0959b8 = null;
        }
        TextView textView = c0959b8.f15614f;
        m.d(textView, "unusual");
        c0573k.r(textView, 5);
        C0959b c0959b9 = this.f11608I;
        if (c0959b9 == null) {
            m.r("binding");
        } else {
            c0959b = c0959b9;
        }
        c0959b.f15614f.setOnClickListener(new View.OnClickListener() { // from class: H0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseRulesActivity.Y2(this.f1389b, view);
            }
        });
    }
}