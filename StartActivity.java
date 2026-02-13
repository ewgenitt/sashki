package cab.shashki.app.ui;

import N0.C0573k;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.activity.F;
import androidx.activity.l;
import androidx.appcompat.app.b;
import androidx.preference.k;
import androidx.vectordrawable.graphics.drawable.c;
import cab.shashki.app.ui.StartActivity;
import cab.shashki.app.ui.main.MainActivity;
import f0.AbstractC0888D;
import g0.s0;
import h3.m;
import p3.n;
import q0.D;
import q0.g0;
import t0.AbstractC1377a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class StartActivity extends b {

    /* renamed from: D, reason: collision with root package name */
    private s0 f10872D;

    /* renamed from: E, reason: collision with root package name */
    private SharedPreferences f10873E;

    /* renamed from: F, reason: collision with root package name */
    private String f10874F;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E2(StartActivity startActivity, View view) {
        startActivity.J2("en");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F2(StartActivity startActivity, View view) {
        startActivity.J2("ru");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G2(StartActivity startActivity, View view) {
        startActivity.J2("es");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H2(StartActivity startActivity, View view) {
        startActivity.J2("zh");
    }

    private final void I2() {
        SharedPreferences sharedPreferences = this.f10873E;
        if (sharedPreferences == null) {
            m.r("preferences");
            sharedPreferences = null;
        }
        sharedPreferences.edit().clear().commit();
        getSharedPreferences("hot", 0).edit().clear().commit();
        getSharedPreferences("fire", 0).edit().clear().commit();
        getSharedPreferences("draughts", 0).edit().clear().commit();
        getSharedPreferences("shashki", 0).edit().clear().commit();
        getSharedPreferences("uci_options", 0).edit().clear().commit();
        D.f18961h.a();
    }

    private final void J2(String str) {
        SharedPreferences sharedPreferences = this.f10873E;
        String str2 = null;
        if (sharedPreferences == null) {
            m.r("preferences");
            sharedPreferences = null;
        }
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        String str3 = this.f10874F;
        if (str3 == null) {
            m.r("key");
        } else {
            str2 = str3;
        }
        editorEdit.putString(str2, str).apply();
        K2();
    }

    private final void K2() {
        finish();
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        if (Build.VERSION.SDK_INT < 21) {
            intent.addFlags(268468224);
        }
        startActivity(intent);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        String action;
        l.b(this, null, F.a.b(F.f4544e, 0, 0, null, 4, null), 1, null);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        super.onCreate(bundle);
        g0.f19074a.a(this);
        this.f10873E = k.b(this);
        this.f10874F = getString(AbstractC0888D.f14469d1);
        if (bundle != null || (action = getIntent().getAction()) == null || !n.x(action, "shortcut_", false, 2, null)) {
            SharedPreferences sharedPreferences = this.f10873E;
            if (sharedPreferences == null) {
                m.r("preferences");
                sharedPreferences = null;
            }
            String str = this.f10874F;
            if (str == null) {
                m.r("key");
                str = null;
            }
            if (sharedPreferences.contains(str)) {
                K2();
                return;
            }
        } else if (m.a(getIntent().getAction(), "shortcut_reset")) {
            I2();
        }
        s0 s0VarD = s0.d(getLayoutInflater());
        this.f10872D = s0VarD;
        if (s0VarD == null) {
            m.r("binding");
            s0VarD = null;
        }
        setContentView(s0VarD.a());
        s0 s0Var = this.f10872D;
        if (s0Var == null) {
            m.r("binding");
            s0Var = null;
        }
        s0Var.f15882g.f15939e.setText(getString(AbstractC0888D.f14388K));
        C0573k c0573k = C0573k.f2973a;
        s0 s0Var2 = this.f10872D;
        if (s0Var2 == null) {
            m.r("binding");
            s0Var2 = null;
        }
        LinearLayout linearLayout = s0Var2.f15882g.f15938d;
        m.d(linearLayout, "toolbar");
        c0573k.u(linearLayout, 7);
        s0 s0Var3 = this.f10872D;
        if (s0Var3 == null) {
            m.r("binding");
            s0Var3 = null;
        }
        s0Var3.f15878c.setOnClickListener(new View.OnClickListener() { // from class: t0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StartActivity.E2(this.f19761b, view);
            }
        });
        s0 s0Var4 = this.f10872D;
        if (s0Var4 == null) {
            m.r("binding");
            s0Var4 = null;
        }
        s0Var4.f15881f.setOnClickListener(new View.OnClickListener() { // from class: t0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StartActivity.F2(this.f19762b, view);
            }
        });
        s0 s0Var5 = this.f10872D;
        if (s0Var5 == null) {
            m.r("binding");
            s0Var5 = null;
        }
        s0Var5.f15879d.setOnClickListener(new View.OnClickListener() { // from class: t0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StartActivity.G2(this.f19763b, view);
            }
        });
        s0 s0Var6 = this.f10872D;
        if (s0Var6 == null) {
            m.r("binding");
            s0Var6 = null;
        }
        s0Var6.f15883h.setOnClickListener(new View.OnClickListener() { // from class: t0.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StartActivity.H2(this.f19764b, view);
            }
        });
        if (i4 >= 21) {
            s0 s0Var7 = this.f10872D;
            if (s0Var7 == null) {
                m.r("binding");
                s0Var7 = null;
            }
            Drawable drawable = s0Var7.f15877b.getDrawable();
            AnimatedVectorDrawable animatedVectorDrawableA = AbstractC1377a.a(drawable) ? c.a(drawable) : null;
            if (animatedVectorDrawableA != null) {
                animatedVectorDrawableA.start();
            }
        }
    }
}