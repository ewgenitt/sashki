package cab.shashki.app.ui.checkers;

import N0.C0573k;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.widget.SwitchCompat;
import cab.shashki.app.ui.checkers.CheckersSettingsActivity;
import cab.shashki.app.ui.checkers.draw_table.DrawTableActivity;
import f0.AbstractC0888D;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0967f;
import h3.m;
import q0.C1277a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class CheckersSettingsActivity extends AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L {

    /* renamed from: I, reason: collision with root package name */
    private C0967f f10878I;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a3(CheckersSettingsActivity checkersSettingsActivity, View view) {
        C1277a c1277a = C1277a.f19012a;
        C0967f c0967f = checkersSettingsActivity.f10878I;
        if (c0967f == null) {
            m.r("binding");
            c0967f = null;
        }
        c1277a.h(c0967f.f15651h.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b3(CheckersSettingsActivity checkersSettingsActivity, View view) {
        C1277a c1277a = C1277a.f19012a;
        C0967f c0967f = checkersSettingsActivity.f10878I;
        if (c0967f == null) {
            m.r("binding");
            c0967f = null;
        }
        c1277a.k(c0967f.f15652i.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c3(CheckersSettingsActivity checkersSettingsActivity, View view) {
        C1277a c1277a = C1277a.f19012a;
        C0967f c0967f = checkersSettingsActivity.f10878I;
        if (c0967f == null) {
            m.r("binding");
            c0967f = null;
        }
        c1277a.i(c0967f.f15645b.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(CheckersSettingsActivity checkersSettingsActivity, View view) {
        C1277a c1277a = C1277a.f19012a;
        C0967f c0967f = checkersSettingsActivity.f10878I;
        if (c0967f == null) {
            m.r("binding");
            c0967f = null;
        }
        c1277a.m(c0967f.f15654k.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(CheckersSettingsActivity checkersSettingsActivity, View view) {
        checkersSettingsActivity.startActivity(new Intent(checkersSettingsActivity, (Class<?>) DrawTableActivity.class).putExtra("variant", C1277a.EnumC0198a.f19015f.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(CheckersSettingsActivity checkersSettingsActivity, View view) {
        checkersSettingsActivity.startActivity(new Intent(checkersSettingsActivity, (Class<?>) DrawTableActivity.class).putExtra("variant", C1277a.EnumC0198a.f19016g.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3(CheckersSettingsActivity checkersSettingsActivity, View view) {
        checkersSettingsActivity.startActivity(new Intent(checkersSettingsActivity, (Class<?>) DrawTableActivity.class).putExtra("variant", C1277a.EnumC0198a.f19019j.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(CheckersSettingsActivity checkersSettingsActivity, View view) {
        checkersSettingsActivity.startActivity(new Intent(checkersSettingsActivity, (Class<?>) DrawTableActivity.class).putExtra("variant", C1277a.EnumC0198a.f19021l.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(CheckersSettingsActivity checkersSettingsActivity, View view) {
        checkersSettingsActivity.startActivity(new Intent(checkersSettingsActivity, (Class<?>) DrawTableActivity.class).putExtra("variant", C1277a.EnumC0198a.f19022m.b()));
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        C0967f c0967fD = C0967f.d(getLayoutInflater());
        this.f10878I = c0967fD;
        C0967f c0967f = null;
        if (c0967fD == null) {
            m.r("binding");
            c0967fD = null;
        }
        setContentView(c0967fD.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.f14488h0, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        C0967f c0967f2 = this.f10878I;
        if (c0967f2 == null) {
            m.r("binding");
            c0967f2 = null;
        }
        ScrollView scrollView = c0967f2.f15653j;
        m.d(scrollView, "scroll");
        C0573k.v(c0573k, scrollView, 0, 1, null);
        C0967f c0967f3 = this.f10878I;
        if (c0967f3 == null) {
            m.r("binding");
            c0967f3 = null;
        }
        SwitchCompat switchCompat = c0967f3.f15651h;
        C1277a c1277a = C1277a.f19012a;
        switchCompat.setChecked(c1277a.c());
        C0967f c0967f4 = this.f10878I;
        if (c0967f4 == null) {
            m.r("binding");
            c0967f4 = null;
        }
        c0967f4.f15651h.setOnClickListener(new View.OnClickListener() { // from class: v0.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersSettingsActivity.a3(this.f19991b, view);
            }
        });
        C0967f c0967f5 = this.f10878I;
        if (c0967f5 == null) {
            m.r("binding");
            c0967f5 = null;
        }
        c0967f5.f15652i.setChecked(c1277a.e());
        C0967f c0967f6 = this.f10878I;
        if (c0967f6 == null) {
            m.r("binding");
            c0967f6 = null;
        }
        c0967f6.f15652i.setOnClickListener(new View.OnClickListener() { // from class: v0.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersSettingsActivity.b3(this.f19992b, view);
            }
        });
        C0967f c0967f7 = this.f10878I;
        if (c0967f7 == null) {
            m.r("binding");
            c0967f7 = null;
        }
        c0967f7.f15645b.setChecked(c1277a.d());
        C0967f c0967f8 = this.f10878I;
        if (c0967f8 == null) {
            m.r("binding");
            c0967f8 = null;
        }
        c0967f8.f15645b.setOnClickListener(new View.OnClickListener() { // from class: v0.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersSettingsActivity.c3(this.f19993b, view);
            }
        });
        C0967f c0967f9 = this.f10878I;
        if (c0967f9 == null) {
            m.r("binding");
            c0967f9 = null;
        }
        c0967f9.f15654k.setChecked(c1277a.f());
        C0967f c0967f10 = this.f10878I;
        if (c0967f10 == null) {
            m.r("binding");
            c0967f10 = null;
        }
        c0967f10.f15654k.setOnClickListener(new View.OnClickListener() { // from class: v0.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersSettingsActivity.d3(this.f19994b, view);
            }
        });
        C0967f c0967f11 = this.f10878I;
        if (c0967f11 == null) {
            m.r("binding");
            c0967f11 = null;
        }
        c0967f11.f15649f.setOnClickListener(new View.OnClickListener() { // from class: v0.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersSettingsActivity.e3(this.f19995b, view);
            }
        });
        C0967f c0967f12 = this.f10878I;
        if (c0967f12 == null) {
            m.r("binding");
            c0967f12 = null;
        }
        c0967f12.f15646c.setOnClickListener(new View.OnClickListener() { // from class: v0.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersSettingsActivity.f3(this.f19996b, view);
            }
        });
        C0967f c0967f13 = this.f10878I;
        if (c0967f13 == null) {
            m.r("binding");
            c0967f13 = null;
        }
        c0967f13.f15648e.setOnClickListener(new View.OnClickListener() { // from class: v0.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersSettingsActivity.g3(this.f19997b, view);
            }
        });
        C0967f c0967f14 = this.f10878I;
        if (c0967f14 == null) {
            m.r("binding");
            c0967f14 = null;
        }
        c0967f14.f15647d.setOnClickListener(new View.OnClickListener() { // from class: v0.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersSettingsActivity.h3(this.f19998b, view);
            }
        });
        C0967f c0967f15 = this.f10878I;
        if (c0967f15 == null) {
            m.r("binding");
        } else {
            c0967f = c0967f15;
        }
        c0967f.f15650g.setOnClickListener(new View.OnClickListener() { // from class: v0.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CheckersSettingsActivity.i3(this.f19999b, view);
            }
        });
    }
}