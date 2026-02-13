package cab.shashki.app.ui.chess.fairy.builder.quick;

import N0.C0573k;
import T2.u;
import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.app.a;
import androidx.recyclerview.widget.RecyclerView;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.ui.chess.fairy.builder.quick.ConfigActivity;
import cab.shashki.app.ui.chess.fairy.builder.quick.h;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0975j;
import g3.InterfaceC1005a;
import g3.InterfaceC1016l;
import h3.l;
import h3.m;
import t0.C1383g;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class ConfigActivity extends AbstractActivityC0911o implements cab.shashki.app.ui.chess.fairy.builder.quick.c {

    /* renamed from: M, reason: collision with root package name */
    public static final a f11016M = new a(null);

    /* renamed from: J, reason: collision with root package name */
    private C0975j f11017J;

    /* renamed from: K, reason: collision with root package name */
    private f f11018K;

    /* renamed from: L, reason: collision with root package name */
    private BottomSheetBehavior f11019L;

    public static final class a {
        public /* synthetic */ a(h3.h hVar) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b extends l implements InterfaceC1016l {
        b(Object obj) {
            super(1, obj, cab.shashki.app.ui.chess.fairy.builder.quick.b.class, "addOption", "addOption(Lcab/shashki/app/ui/chess/fairy/builder/quick/Options$Option;)V", 0);
        }

        public final void m(h.c cVar) {
            m.e(cVar, "p0");
            ((cab.shashki.app.ui.chess.fairy.builder.quick.b) this.f16244e).M0(cVar);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((h.c) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class c extends l implements InterfaceC1005a {
        c(Object obj) {
            super(0, obj, cab.shashki.app.ui.chess.fairy.builder.quick.b.class, "saveConfig", "saveConfig()V", 0);
        }

        @Override // g3.InterfaceC1005a
        public /* bridge */ /* synthetic */ Object a() {
            m();
            return u.f3817a;
        }

        public final void m() {
            ((cab.shashki.app.ui.chess.fairy.builder.quick.b) this.f16244e).i1();
        }
    }

    /* synthetic */ class d extends l implements InterfaceC1016l {
        d(Object obj) {
            super(1, obj, cab.shashki.app.ui.chess.fairy.builder.quick.b.class, "canDelete", "canDelete(I)Z", 0);
        }

        public final Boolean m(int i4) {
            return Boolean.valueOf(((cab.shashki.app.ui.chess.fairy.builder.quick.b) this.f16244e).Z0(i4));
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            return m(((Number) obj).intValue());
        }
    }

    /* synthetic */ class e extends l implements InterfaceC1016l {
        e(Object obj) {
            super(1, obj, cab.shashki.app.ui.chess.fairy.builder.quick.b.class, "delete", "delete(I)V", 0);
        }

        public final void m(int i4) {
            ((cab.shashki.app.ui.chess.fairy.builder.quick.b) this.f16244e).c1(i4);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m(((Number) obj).intValue());
            return u.f3817a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(cab.shashki.app.ui.chess.fairy.builder.quick.b bVar, View view) {
        bVar.l1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(cab.shashki.app.ui.chess.fairy.builder.quick.b bVar, View view) {
        bVar.h1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(cab.shashki.app.ui.chess.fairy.builder.quick.b bVar, View view) {
        bVar.T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3(ConfigActivity configActivity, cab.shashki.app.ui.chess.fairy.builder.quick.b bVar, View view) {
        configActivity.f(bVar.e1());
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.c
    public void A0(boolean z4) {
        C0975j c0975j = this.f11017J;
        C0975j c0975j2 = null;
        if (c0975j == null) {
            m.r("binding");
            c0975j = null;
        }
        c0975j.f15700b.setEnabled(!z4);
        C0975j c0975j3 = this.f11017J;
        if (c0975j3 == null) {
            m.r("binding");
        } else {
            c0975j2 = c0975j3;
        }
        c0975j2.f15700b.setAlpha(z4 ? 0.5f : 1.0f);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.c
    public void I0(int i4) {
        f fVar = this.f11018K;
        if (fVar == null) {
            m.r("adapter");
            fVar = null;
        }
        fVar.I0(i4);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.c
    public void c1(String str, String str2) {
        m.e(str, HalmaParams.NAME);
        m.e(str2, "config");
        setResult(-1, new Intent().putExtra(HalmaParams.NAME, str).putExtra("config", str2));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: c3, reason: merged with bridge method [inline-methods] */
    public void S2(final cab.shashki.app.ui.chess.fairy.builder.quick.b bVar) {
        m.e(bVar, "presenter");
        super.S2(bVar);
        this.f11018K = new f(bVar.f1(), bVar.d1(), new b(bVar), new c(bVar));
        C0975j c0975j = this.f11017J;
        C0975j c0975j2 = null;
        if (c0975j == null) {
            m.r("binding");
            c0975j = null;
        }
        RecyclerView recyclerView = c0975j.f15704f;
        f fVar = this.f11018K;
        if (fVar == null) {
            m.r("adapter");
            fVar = null;
        }
        recyclerView.setAdapter(fVar);
        C0975j c0975j3 = this.f11017J;
        if (c0975j3 == null) {
            m.r("binding");
            c0975j3 = null;
        }
        RecyclerView recyclerView2 = c0975j3.f15704f;
        m.d(recyclerView2, "list");
        new C1383g.a(recyclerView2, new d(bVar), new e(bVar));
        C0975j c0975j4 = this.f11017J;
        if (c0975j4 == null) {
            m.r("binding");
            c0975j4 = null;
        }
        c0975j4.f15708j.setOnClickListener(new View.OnClickListener() { // from class: z0.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfigActivity.d3(bVar, view);
            }
        });
        C0975j c0975j5 = this.f11017J;
        if (c0975j5 == null) {
            m.r("binding");
            c0975j5 = null;
        }
        c0975j5.f15706h.setOnClickListener(new View.OnClickListener() { // from class: z0.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfigActivity.e3(bVar, view);
            }
        });
        C0975j c0975j6 = this.f11017J;
        if (c0975j6 == null) {
            m.r("binding");
            c0975j6 = null;
        }
        c0975j6.f15700b.setOnClickListener(new View.OnClickListener() { // from class: z0.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfigActivity.f3(bVar, view);
            }
        });
        C0975j c0975j7 = this.f11017J;
        if (c0975j7 == null) {
            m.r("binding");
        } else {
            c0975j2 = c0975j7;
        }
        c0975j2.f15701c.setOnClickListener(new View.OnClickListener() { // from class: z0.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConfigActivity.g3(this.f20860b, bVar, view);
            }
        });
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.c
    public void f(String str) {
        m.e(str, "error");
        C0975j c0975j = this.f11017J;
        if (c0975j == null) {
            m.r("binding");
            c0975j = null;
        }
        c0975j.f15701c.setVisibility(0);
        new a.C0075a(this).i(str).q(R.string.ok, null).x();
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.c
    public void g0() {
        f fVar = this.f11018K;
        if (fVar == null) {
            m.r("adapter");
            fVar = null;
        }
        fVar.J0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: h3, reason: merged with bridge method [inline-methods] */
    public cab.shashki.app.ui.chess.fairy.builder.quick.b U2() {
        Intent intent = getIntent();
        return new cab.shashki.app.ui.chess.fairy.builder.quick.b(intent != null ? intent.getStringExtra("config") : null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        BottomSheetBehavior bottomSheetBehavior;
        BottomSheetBehavior bottomSheetBehavior2 = this.f11019L;
        if ((bottomSheetBehavior2 == null || bottomSheetBehavior2.f0() != 3) && ((bottomSheetBehavior = this.f11019L) == null || bottomSheetBehavior.f0() != 6)) {
            super.onBackPressed();
            return;
        }
        BottomSheetBehavior bottomSheetBehavior3 = this.f11019L;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.y0(5);
        }
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0975j c0975jC = C0975j.c(getLayoutInflater());
        this.f11017J = c0975jC;
        if (c0975jC == null) {
            m.r("binding");
            c0975jC = null;
        }
        setContentView(c0975jC.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.f14485g2, false, 2, null);
        C0975j c0975j = this.f11017J;
        if (c0975j == null) {
            m.r("binding");
            c0975j = null;
        }
        if (c0975j.f15707i == null) {
            C0573k c0573k = C0573k.f2973a;
            C0975j c0975j2 = this.f11017J;
            if (c0975j2 == null) {
                m.r("binding");
                c0975j2 = null;
            }
            RecyclerView recyclerView = c0975j2.f15704f;
            m.d(recyclerView, "list");
            C0573k.v(c0573k, recyclerView, 0, 1, null);
        } else {
            C0573k c0573k2 = C0573k.f2973a;
            C0975j c0975j3 = this.f11017J;
            if (c0975j3 == null) {
                m.r("binding");
                c0975j3 = null;
            }
            RecyclerView recyclerView2 = c0975j3.f15704f;
            m.d(recyclerView2, "list");
            c0573k2.u(recyclerView2, 11);
            C0975j c0975j4 = this.f11017J;
            if (c0975j4 == null) {
                m.r("binding");
                c0975j4 = null;
            }
            ScrollView scrollView = c0975j4.f15707i;
            if (scrollView != null) {
                c0573k2.u(scrollView, 14);
            }
        }
        C0975j c0975j5 = this.f11017J;
        if (c0975j5 == null) {
            m.r("binding");
            c0975j5 = null;
        }
        FrameLayout frameLayout = c0975j5.f15703e;
        if (frameLayout != null) {
            BottomSheetBehavior bottomSheetBehaviorC0 = BottomSheetBehavior.c0(frameLayout);
            this.f11019L = bottomSheetBehaviorC0;
            if (bottomSheetBehaviorC0 != null) {
                bottomSheetBehaviorC0.r0(0.6f);
            }
            BottomSheetBehavior bottomSheetBehavior = this.f11019L;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.y0(5);
            }
            C0975j c0975j6 = this.f11017J;
            if (c0975j6 == null) {
                m.r("binding");
                c0975j6 = null;
            }
            ImageView imageView = c0975j6.f15702d;
            if (imageView != null) {
                imageView.setOnClickListener(new C0573k.a(this.f11019L));
            }
        }
        C0573k c0573k3 = C0573k.f2973a;
        C0975j c0975j7 = this.f11017J;
        if (c0975j7 == null) {
            m.r("binding");
            c0975j7 = null;
        }
        LinearLayout linearLayout = c0975j7.f15705g;
        m.d(linearLayout, "panel");
        C0573k.s(c0573k3, linearLayout, 0, 1, null);
        setResult(0);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((cab.shashki.app.ui.chess.fairy.builder.quick.b) V2()).v0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((cab.shashki.app.ui.chess.fairy.builder.quick.b) V2()).N0(this);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.c
    public void t(boolean z4, boolean z5) {
        C0975j c0975j = this.f11017J;
        C0975j c0975j2 = null;
        if (c0975j == null) {
            m.r("binding");
            c0975j = null;
        }
        c0975j.f15708j.setVisibility(z4 ? 0 : 8);
        C0975j c0975j3 = this.f11017J;
        if (c0975j3 == null) {
            m.r("binding");
        } else {
            c0975j2 = c0975j3;
        }
        c0975j2.f15706h.setVisibility(z5 ? 0 : 8);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.c
    public void v() {
        f fVar = this.f11018K;
        if (fVar == null) {
            m.r("adapter");
            fVar = null;
        }
        fVar.m();
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.c
    public void y(int i4) {
        f fVar = this.f11018K;
        if (fVar == null) {
            m.r("adapter");
            fVar = null;
        }
        fVar.n(i4);
    }
}