package cab.shashki.app.ui.main;

import D0.C0227e0;
import D0.Y0;
import E0.h;
import F0.G;
import K0.C0481d;
import K0.C0488k;
import K0.T;
import K0.W;
import N0.C0573k;
import N0.K;
import T2.u;
import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.fragment.app.AbstractC0735w;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import androidx.transition.s;
import cab.shashki.app.ShashkiApp;
import cab.shashki.app.service.c;
import cab.shashki.app.ui.main.MainActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.Snackbar;
import e2.C0873a;
import e2.C0874b;
import f0.AbstractActivityC0911o;
import f0.AbstractC0885A;
import f0.AbstractC0888D;
import f0.AbstractC0916t;
import f0.AbstractC0920x;
import g0.C0941J;
import g0.C0950T;
import g3.InterfaceC1016l;
import g3.InterfaceC1020p;
import h3.AbstractC1040a;
import h3.l;
import h3.m;
import p3.n;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class MainActivity extends AbstractActivityC0911o implements c.a {

    /* renamed from: W, reason: collision with root package name */
    public static final a f11777W = new a(null);

    /* renamed from: J, reason: collision with root package name */
    private W f11778J;

    /* renamed from: K, reason: collision with root package name */
    private View f11779K;

    /* renamed from: L, reason: collision with root package name */
    private TextView f11780L;

    /* renamed from: M, reason: collision with root package name */
    private TextView f11781M;

    /* renamed from: N, reason: collision with root package name */
    private BottomSheetBehavior f11782N;

    /* renamed from: O, reason: collision with root package name */
    private BottomSheetBehavior f11783O;

    /* renamed from: P, reason: collision with root package name */
    private Bundle f11784P;

    /* renamed from: Q, reason: collision with root package name */
    private C0481d f11785Q;

    /* renamed from: R, reason: collision with root package name */
    private C0950T f11786R;

    /* renamed from: S, reason: collision with root package name */
    private G f11787S;

    /* renamed from: T, reason: collision with root package name */
    private h f11788T;

    /* renamed from: U, reason: collision with root package name */
    private Y0 f11789U;

    /* renamed from: V, reason: collision with root package name */
    private final TransitionSet f11790V;

    public static final class a {
        public /* synthetic */ a(h3.h hVar) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b extends AbstractC1040a implements InterfaceC1016l {
        b(Object obj) {
            super(1, obj, MainActivity.class, "onOptionsItemSelected", "onOptionsItemSelected(Landroid/view/MenuItem;)Z", 8);
        }

        public final void c(MenuItem menuItem) {
            m.e(menuItem, "p0");
            ((MainActivity) this.f16233d).onOptionsItemSelected(menuItem);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            c((MenuItem) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class c extends l implements InterfaceC1016l {
        c(Object obj) {
            super(1, obj, C0488k.class, "isIconColored", "isIconColored(Landroid/view/MenuItem;)Z", 0);
        }

        @Override // g3.InterfaceC1016l
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Boolean o(MenuItem menuItem) {
            m.e(menuItem, "p0");
            return Boolean.valueOf(((C0488k) this.f16244e).t(menuItem));
        }
    }

    public static final class d extends BottomSheetBehavior.g {
        d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(View view, float f4) {
            m.e(view, "bottomSheet");
            C0950T c0950t = MainActivity.this.f11786R;
            if (c0950t == null) {
                m.r("binding");
                c0950t = null;
            }
            c0950t.f15549h.f15888b.setRotation(720 * f4);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, int i4) {
            m.e(view, "bottomSheet");
            if (i4 == 5) {
                BottomSheetBehavior bottomSheetBehavior = MainActivity.this.f11782N;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.n0(true);
                    return;
                }
                return;
            }
            BottomSheetBehavior bottomSheetBehavior2 = MainActivity.this.f11782N;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.n0(false);
            }
            BottomSheetBehavior bottomSheetBehavior3 = MainActivity.this.f11782N;
            if (bottomSheetBehavior3 != null) {
                bottomSheetBehavior3.y0(5);
            }
        }
    }

    public MainActivity() {
        TransitionSet transitionSetZ = new AutoTransition().Z(150L);
        m.d(transitionSetZ, "setDuration(...)");
        this.f11790V = transitionSetZ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3(MainActivity mainActivity, View view) {
        new a.C0075a(mainActivity).h(ShashkiApp.f10561b.b() ? AbstractC0888D.f14367F1 : AbstractC0888D.F6).q(R.string.ok, null).x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(MainActivity mainActivity, View view) {
        mainActivity.y3();
    }

    private final void i3() throws Resources.NotFoundException {
        final boolean z4 = getResources().getBoolean(AbstractC0916t.f14626b);
        C0481d c0481d = new C0481d(new b(this), new c(((T) V2()).x1()));
        this.f11785Q = c0481d;
        c0481d.L(((T) V2()).x1().p() || z4);
        final W w4 = new W(this);
        ((T) V2()).x1().r(w4, new InterfaceC1020p() { // from class: K0.q
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return MainActivity.j3(this.f2315d, w4, z4, ((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
            }
        });
        onCreateOptionsMenu(w4);
        G g4 = this.f11787S;
        C0950T c0950t = null;
        if (g4 == null) {
            m.r("mainFragment");
            g4 = null;
        }
        MenuInflater menuInflater = getMenuInflater();
        m.d(menuInflater, "getMenuInflater(...)");
        g4.f3(w4, menuInflater);
        this.f11778J = w4;
        C0481d c0481d2 = this.f11785Q;
        if (c0481d2 == null) {
            m.r("adapter");
            c0481d2 = null;
        }
        c0481d2.N(w4);
        C0950T c0950t2 = this.f11786R;
        if (c0950t2 == null) {
            m.r("binding");
            c0950t2 = null;
        }
        RecyclerView recyclerView = c0950t2.f15543b;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.A2(z4 ? 1 : 0);
        recyclerView.setLayoutManager(linearLayoutManager);
        C0950T c0950t3 = this.f11786R;
        if (c0950t3 == null) {
            m.r("binding");
            c0950t3 = null;
        }
        RecyclerView recyclerView2 = c0950t3.f15543b;
        C0481d c0481d3 = this.f11785Q;
        if (c0481d3 == null) {
            m.r("adapter");
            c0481d3 = null;
        }
        recyclerView2.setAdapter(c0481d3);
        C0950T c0950t4 = this.f11786R;
        if (c0950t4 == null) {
            m.r("binding");
        } else {
            c0950t = c0950t4;
        }
        c0950t.f15544c.setOnClickListener(new View.OnClickListener() { // from class: K0.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.k3(this.f2318b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u j3(MainActivity mainActivity, W w4, boolean z4, boolean z5, boolean z6) {
        C0481d c0481d = null;
        if (z5) {
            G g4 = mainActivity.f11787S;
            if (g4 == null) {
                m.r("mainFragment");
                g4 = null;
            }
            g4.u3(w4);
            mainActivity.onPrepareOptionsMenu(w4);
        }
        C0481d c0481d2 = mainActivity.f11785Q;
        if (c0481d2 == null) {
            m.r("adapter");
            c0481d2 = null;
        }
        c0481d2.L(z6 || z4);
        C0481d c0481d3 = mainActivity.f11785Q;
        if (c0481d3 == null) {
            m.r("adapter");
        } else {
            c0481d = c0481d3;
        }
        c0481d.N(w4);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(MainActivity mainActivity, View view) {
        ((T) mainActivity.V2()).v1();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002b A[Catch: Exception -> 0x000d, TRY_LEAVE, TryCatch #0 {Exception -> 0x000d, blocks: (B:3:0x0001, B:6:0x0008, B:9:0x000f, B:11:0x0016, B:13:0x001a, B:14:0x001e, B:16:0x0024, B:19:0x002b, B:22:0x0031, B:23:0x0035, B:25:0x003b, B:27:0x003f, B:29:0x0044, B:31:0x004a), top: B:37:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m3() {
        /*
            r5 = this;
            r0 = 0
            E0.h r1 = r5.f11788T     // Catch: java.lang.Exception -> Ld
            java.lang.String r2 = "historyFragment"
            r3 = 0
            if (r1 != 0) goto Lf
            h3.m.r(r2)     // Catch: java.lang.Exception -> Ld
            r1 = r3
            goto Lf
        Ld:
            r1 = move-exception
            goto L52
        Lf:
            boolean r1 = r1.S2()     // Catch: java.lang.Exception -> Ld
            r4 = 1
            if (r1 == 0) goto L2b
            E0.h r1 = r5.f11788T     // Catch: java.lang.Exception -> Ld
            if (r1 != 0) goto L1e
            h3.m.r(r2)     // Catch: java.lang.Exception -> Ld
            r1 = r3
        L1e:
            E0.C r1 = r1.Q4()     // Catch: java.lang.Exception -> Ld
            if (r1 == 0) goto L2b
            boolean r1 = r1.o()     // Catch: java.lang.Exception -> Ld
            if (r1 != r4) goto L2b
            goto L50
        L2b:
            F0.G r1 = r5.f11787S     // Catch: java.lang.Exception -> Ld
            java.lang.String r2 = "mainFragment"
            if (r1 != 0) goto L35
            h3.m.r(r2)     // Catch: java.lang.Exception -> Ld
            r1 = r3
        L35:
            boolean r1 = r1.S2()     // Catch: java.lang.Exception -> Ld
            if (r1 == 0) goto L51
            F0.G r1 = r5.f11787S     // Catch: java.lang.Exception -> Ld
            if (r1 != 0) goto L43
            h3.m.r(r2)     // Catch: java.lang.Exception -> Ld
            goto L44
        L43:
            r3 = r1
        L44:
            F0.c0 r1 = r3.g6()     // Catch: java.lang.Exception -> Ld
            if (r1 == 0) goto L51
            boolean r1 = r1.o()     // Catch: java.lang.Exception -> Ld
            if (r1 != r4) goto L51
        L50:
            return r4
        L51:
            return r0
        L52:
            r1.printStackTrace()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.ui.main.MainActivity.m3():boolean");
    }

    private final void n3() {
        TextView textView;
        C0950T c0950t = this.f11786R;
        C0950T c0950t2 = null;
        if (c0950t == null) {
            m.r("binding");
            c0950t = null;
        }
        C0941J c0941j = c0950t.f15547f;
        this.f11782N = c0941j != null ? BottomSheetBehavior.c0(c0941j.a()) : null;
        C0950T c0950t3 = this.f11786R;
        if (c0950t3 == null) {
            m.r("binding");
            c0950t3 = null;
        }
        this.f11783O = BottomSheetBehavior.c0(c0950t3.f15549h.a());
        BottomSheetBehavior bottomSheetBehavior = this.f11782N;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.r0(0.6f);
        }
        BottomSheetBehavior bottomSheetBehavior2 = this.f11783O;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.r0(0.6f);
        }
        BottomSheetBehavior bottomSheetBehavior3 = this.f11782N;
        if (bottomSheetBehavior3 != null) {
            bottomSheetBehavior3.y0(5);
        }
        BottomSheetBehavior bottomSheetBehavior4 = this.f11783O;
        if (bottomSheetBehavior4 != null) {
            bottomSheetBehavior4.y0(5);
        }
        C0950T c0950t4 = this.f11786R;
        if (c0950t4 == null) {
            m.r("binding");
            c0950t4 = null;
        }
        C0941J c0941j2 = c0950t4.f15547f;
        if (c0941j2 != null && (textView = c0941j2.f15395b) != null) {
            textView.setOnClickListener(new C0573k.a(this.f11782N));
        }
        C0950T c0950t5 = this.f11786R;
        if (c0950t5 == null) {
            m.r("binding");
        } else {
            c0950t2 = c0950t5;
        }
        c0950t2.f15549h.f15888b.setOnClickListener(new C0573k.a(this.f11783O));
        BottomSheetBehavior bottomSheetBehavior5 = this.f11783O;
        if (bottomSheetBehavior5 != null) {
            bottomSheetBehavior5.S(new d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(MainActivity mainActivity, DialogInterface dialogInterface, int i4) {
        if (Build.VERSION.SDK_INT >= 21) {
            mainActivity.finishAndRemoveTask();
        } else {
            mainActivity.finish();
        }
    }

    private final String r3() {
        String string = E2().getString(getString(AbstractC0888D.f14342A1), null);
        if (string != null) {
            return string;
        }
        String string2 = getString(AbstractC0888D.f14439W2);
        m.d(string2, "getString(...)");
        return string2;
    }

    public final void A3() {
        Y0 y02 = this.f11789U;
        if (y02 == null) {
            m.r("settingsFragment");
            y02 = null;
        }
        y02.o5();
    }

    public final void B3(int[] iArr) {
        m.e(iArr, "times");
        TextView textView = this.f11780L;
        if (textView != null) {
            textView.setText(K.V(K.f2926a, iArr[0], false, 2, null));
        }
        TextView textView2 = this.f11781M;
        if (textView2 != null) {
            textView2.setText(K.V(K.f2926a, iArr[1], false, 2, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: f3, reason: merged with bridge method [inline-methods] */
    public void S2(T t4) throws Resources.NotFoundException {
        m.e(t4, "presenter");
        super.S2(t4);
        Object objW1 = t4.w1("main");
        G g4 = objW1 instanceof G ? (G) objW1 : null;
        if (g4 == null) {
            g4 = new G();
            t4.M1("main", g4);
        }
        this.f11787S = g4;
        Object objW12 = t4.w1("history");
        h hVar = objW12 instanceof h ? (h) objW12 : null;
        if (hVar == null) {
            hVar = new h();
            t4.M1("history", hVar);
        }
        this.f11788T = hVar;
        this.f11789U = new Y0();
        C0950T c0950t = this.f11786R;
        if (c0950t == null) {
            m.r("binding");
            c0950t = null;
        }
        c0950t.f15548g.setOnClickListener(new View.OnClickListener() { // from class: K0.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.g3(this.f2313b, view);
            }
        });
        TextView textViewF2 = F2();
        if (textViewF2 != null) {
            textViewF2.setOnClickListener(new View.OnClickListener() { // from class: K0.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MainActivity.h3(this.f2314b, view);
                }
            });
        }
        AbstractC0735w abstractC0735wL = g2().l();
        int i4 = AbstractC0920x.f15005c2;
        G g5 = this.f11787S;
        if (g5 == null) {
            m.r("mainFragment");
            g5 = null;
        }
        AbstractC0735w abstractC0735wO = abstractC0735wL.o(i4, g5, "main");
        int i5 = AbstractC0920x.z6;
        h hVar2 = this.f11788T;
        if (hVar2 == null) {
            m.r("historyFragment");
            hVar2 = null;
        }
        AbstractC0735w abstractC0735wO2 = abstractC0735wO.o(i5, hVar2, "history");
        int i6 = AbstractC0920x.A6;
        Y0 y02 = this.f11789U;
        if (y02 == null) {
            m.r("settingsFragment");
            y02 = null;
        }
        abstractC0735wO2.o(i6, y02, "settings").g();
        i3();
        n3();
        if (this.f11784P == null) {
            String action = getIntent().getAction();
            if (action != null && n.x(action, "shortcut_", false, 2, null)) {
                t4.y1(getIntent().getAction());
            } else if (getIntent().hasExtra("pin")) {
                t4.z1(getIntent().getStringExtra("pin"));
            }
        }
    }

    @Override // androidx.appcompat.app.b, android.app.Activity
    public void invalidateOptionsMenu() {
        W w4 = this.f11778J;
        if (w4 == null) {
            return;
        }
        G g4 = this.f11787S;
        C0481d c0481d = null;
        if (g4 == null) {
            m.r("mainFragment");
            g4 = null;
        }
        g4.u3(w4);
        onPrepareOptionsMenu(w4);
        C0481d c0481d2 = this.f11785Q;
        if (c0481d2 == null) {
            m.r("adapter");
        } else {
            c0481d = c0481d2;
        }
        c0481d.N(w4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: l3, reason: merged with bridge method [inline-methods] */
    public T U2() {
        return new T();
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        C0874b c0874bH;
        String strA;
        super.onActivityResult(i4, i5, intent);
        if (i4 != 8 || i5 != -1 || (c0874bH = C0873a.h(i5, intent)) == null || (strA = c0874bH.a()) == null) {
            return;
        }
        ((T) V2()).F1(strA);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (g2().l0() > 0) {
            super.onBackPressed();
            return;
        }
        BottomSheetBehavior bottomSheetBehavior = this.f11783O;
        Integer numValueOf = bottomSheetBehavior != null ? Integer.valueOf(bottomSheetBehavior.f0()) : null;
        if (numValueOf != null && numValueOf.intValue() != 5) {
            BottomSheetBehavior bottomSheetBehavior2 = this.f11783O;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.y0(5);
                return;
            }
            return;
        }
        BottomSheetBehavior bottomSheetBehavior3 = this.f11782N;
        Integer numValueOf2 = bottomSheetBehavior3 != null ? Integer.valueOf(bottomSheetBehavior3.f0()) : null;
        if (numValueOf2 == null || numValueOf2.intValue() == 5) {
            if (m3()) {
                return;
            }
            new a.C0075a(this).u(AbstractC0888D.f14523o0).q(R.string.ok, new DialogInterface.OnClickListener() { // from class: K0.n
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    MainActivity.o3(this.f2312b, dialogInterface, i4);
                }
            }).k(R.string.cancel, null).x();
        } else {
            BottomSheetBehavior bottomSheetBehavior4 = this.f11782N;
            if (bottomSheetBehavior4 != null) {
                bottomSheetBehavior4.y0(5);
            }
        }
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        C0950T c0950t = null;
        super.onCreate(null);
        C0950T c0950tC = C0950T.c(getLayoutInflater());
        this.f11786R = c0950tC;
        if (c0950tC == null) {
            m.r("binding");
        } else {
            c0950t = c0950tC;
        }
        setContentView(c0950t.a());
        cab.shashki.app.service.c.f10845a.d(this);
        O2((TextView) findViewById(AbstractC0920x.D6));
        this.f11780L = (TextView) findViewById(AbstractC0920x.m7);
        this.f11781M = (TextView) findViewById(AbstractC0920x.N6);
        this.f11779K = findViewById(AbstractC0920x.x6);
        this.f11784P = bundle;
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        m.e(menu, "menu");
        getMenuInflater().inflate(AbstractC0885A.f14316d, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        m.e(menuItem, "item");
        if (((T) V2()).T1(menuItem)) {
            return true;
        }
        G g4 = this.f11787S;
        if (g4 == null) {
            m.r("mainFragment");
            g4 = null;
        }
        return g4.q3(menuItem) || super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((T) V2()).V1(this);
    }

    @Override // android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        m.e(menu, "menu");
        return ((T) V2()).L1(menu);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        m.e(bundle, "savedInstanceState");
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((T) V2()).h1(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle) {
        m.e(bundle, "outState");
        m.e(persistableBundle, "outPersistentState");
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        m.e(sharedPreferences, "sharedPreferences");
        super.onSharedPreferenceChanged(sharedPreferences, str);
        if (m.a(str, getString(AbstractC0888D.f14534q1))) {
            ((T) V2()).r1(sharedPreferences.getBoolean(str, true));
        }
        if (m.a(str, getString(AbstractC0888D.f14342A1))) {
            T t4 = (T) V2();
            String string = sharedPreferences.getString(str, null);
            if (string == null) {
                string = r3();
            }
            t4.A1(string);
        }
    }

    public final void p3(boolean z4) {
        C0950T c0950t = this.f11786R;
        C0950T c0950t2 = null;
        if (c0950t == null) {
            m.r("binding");
            c0950t = null;
        }
        ViewParent parent = c0950t.f15544c.getParent();
        m.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        s.b((ViewGroup) parent, this.f11790V);
        C0950T c0950t3 = this.f11786R;
        if (c0950t3 == null) {
            m.r("binding");
            c0950t3 = null;
        }
        c0950t3.f15544c.setVisibility(z4 ? 8 : 0);
        C0950T c0950t4 = this.f11786R;
        if (c0950t4 == null) {
            m.r("binding");
            c0950t4 = null;
        }
        RecyclerView recyclerView = c0950t4.f15543b;
        C0950T c0950t5 = this.f11786R;
        if (c0950t5 == null) {
            m.r("binding");
        } else {
            c0950t2 = c0950t5;
        }
        recyclerView.setVisibility(c0950t2.f15544c.getVisibility() ^ 8);
    }

    public final void q3(String str, int i4) {
        if (str == null) {
            str = getString(i4);
            m.d(str, "getString(...)");
        }
        TextView textViewF2 = F2();
        if (textViewF2 != null) {
            int i5 = 0;
            for (int i6 = 0; i6 < str.length(); i6++) {
                if (str.charAt(i6) == ' ') {
                    i5++;
                }
            }
            textViewF2.setMaxLines(i5 + 1);
            textViewF2.setText(str);
        }
    }

    public final void s3() {
        BottomSheetBehavior bottomSheetBehavior = this.f11782N;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.y0(6);
        }
    }

    public final void t3(boolean z4) {
        C0950T c0950t = this.f11786R;
        if (c0950t == null) {
            m.r("binding");
            c0950t = null;
        }
        c0950t.f15548g.setVisibility(z4 ? 0 : 8);
    }

    public final void u3() {
        BottomSheetBehavior bottomSheetBehavior = this.f11783O;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.y0(6);
        }
    }

    public final void v3(int i4) {
        C0573k c0573k = C0573k.f2973a;
        C0950T c0950t = this.f11786R;
        if (c0950t == null) {
            m.r("binding");
            c0950t = null;
        }
        Snackbar snackbarB0 = Snackbar.b0(c0950t.f15545d, i4, -1);
        m.d(snackbarB0, "make(...)");
        c0573k.n(snackbarB0);
    }

    public final void w3(String str) {
        m.e(str, "text");
        C0573k c0573k = C0573k.f2973a;
        C0950T c0950t = this.f11786R;
        if (c0950t == null) {
            m.r("binding");
            c0950t = null;
        }
        Snackbar snackbarC0 = Snackbar.c0(c0950t.f15545d, str, -1);
        m.d(snackbarC0, "make(...)");
        c0573k.n(snackbarC0);
    }

    public final void x3(boolean z4, boolean z5) {
        View view = this.f11779K;
        if (view != null) {
            view.setVisibility(z4 ? 0 : 8);
        }
        if (z5) {
            TextView textView = this.f11780L;
            if (textView != null) {
                textView.setVisibility(0);
            }
            TextView textView2 = this.f11781M;
            if (textView2 != null) {
                textView2.setVisibility(0);
                return;
            }
            return;
        }
        TextView textView3 = this.f11780L;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        TextView textView4 = this.f11781M;
        if (textView4 != null) {
            textView4.setVisibility(8);
        }
    }

    public final void y3() {
        new C0227e0().S4(g2(), "type");
    }

    public final void z3(boolean z4) {
        C0950T c0950t = this.f11786R;
        if (c0950t == null) {
            m.r("binding");
            c0950t = null;
        }
        c0950t.f15553l.setVisibility(z4 ? 0 : 8);
    }
}