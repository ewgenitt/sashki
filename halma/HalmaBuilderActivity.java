package cab.shashki.app.ui.halma;

import N0.C0573k;
import T2.u;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.ui.custom.board.ShashkiBoardView;
import cab.shashki.app.ui.halma.HalmaBuilderActivity;
import cab.shashki.app.ui.halma.b;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0937F;
import g0.C0938G;
import g0.C0939H;
import g0.I0;
import g3.InterfaceC1016l;
import h3.h;
import h3.m;
import h3.t;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class HalmaBuilderActivity extends AbstractActivityC0911o implements cab.shashki.app.ui.halma.b {

    /* renamed from: L, reason: collision with root package name */
    public static final b f11571L = new b(null);

    /* renamed from: J, reason: collision with root package name */
    private a f11572J;

    /* renamed from: K, reason: collision with root package name */
    private I0 f11573K;

    public static final class b {
        public /* synthetic */ b(h hVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final C0937F f11577u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0937F c0937f) {
            super(c0937f.a());
            m.e(c0937f, "binding");
            this.f11577u = c0937f;
        }

        public final C0937F O() {
            return this.f11577u;
        }
    }

    public static final class d extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final C0938G f11578u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0938G c0938g) {
            super(c0938g.a());
            m.e(c0938g, "binding");
            this.f11578u = c0938g;
        }

        public final C0938G O() {
            return this.f11578u;
        }
    }

    public static final class e extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final C0939H f11579u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C0939H c0939h) {
            super(c0939h.a());
            m.e(c0939h, "binding");
            this.f11579u = c0939h;
        }

        public final C0939H O() {
            return this.f11579u;
        }
    }

    public static final class f extends ViewPager2.i {
        f() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i4) {
            String string;
            C0939H c0939hO;
            ShashkiBoardView shashkiBoardView;
            HalmaBuilderActivity.b3(HalmaBuilderActivity.this).f1(i4);
            HalmaBuilderActivity halmaBuilderActivity = HalmaBuilderActivity.this;
            if (HalmaBuilderActivity.b3(halmaBuilderActivity).Y0()) {
                string = HalmaBuilderActivity.b3(HalmaBuilderActivity.this).S0();
            } else {
                string = HalmaBuilderActivity.this.getString(AbstractC0888D.f14408P);
                m.d(string, "getString(...)");
            }
            halmaBuilderActivity.a(string + " " + (i4 + 1) + "/3");
            if (i4 == 1) {
                a aVar = HalmaBuilderActivity.this.f11572J;
                if (aVar == null) {
                    m.r("adapter");
                    aVar = null;
                }
                e eVarG0 = aVar.g0();
                if (eVarG0 == null || (c0939hO = eVarG0.O()) == null || (shashkiBoardView = c0939hO.f15363d) == null) {
                    return;
                }
                shashkiBoardView.V2();
            }
        }
    }

    public static final /* synthetic */ cab.shashki.app.ui.halma.a b3(HalmaBuilderActivity halmaBuilderActivity) {
        return (cab.shashki.app.ui.halma.a) halmaBuilderActivity.V2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d3(HalmaBuilderActivity halmaBuilderActivity, View view) {
        ((cab.shashki.app.ui.halma.a) halmaBuilderActivity.V2()).T0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e3(View view, View view2, MotionEvent motionEvent) {
        return view.onTouchEvent(motionEvent);
    }

    @Override // cab.shashki.app.ui.halma.b
    public void Y(b.a aVar) {
        m.e(aVar, "action");
        a aVar2 = this.f11572J;
        if (aVar2 == null) {
            m.r("adapter");
            aVar2 = null;
        }
        aVar2.i0(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: c3, reason: merged with bridge method [inline-methods] */
    public cab.shashki.app.ui.halma.a U2() {
        return new cab.shashki.app.ui.halma.a(getIntent().getIntExtra(HalmaParams.ID, -1), !getIntent().getBooleanExtra("template", false));
    }

    @Override // cab.shashki.app.ui.halma.b
    public void d() {
        I0 i02 = this.f11573K;
        if (i02 == null) {
            m.r("binding");
            i02 = null;
        }
        Snackbar.b0(i02.f15391d, AbstractC0888D.c5, -1).R();
    }

    @Override // cab.shashki.app.ui.halma.b
    public void k(boolean z4) {
        I0 i02 = this.f11573K;
        if (i02 == null) {
            m.r("binding");
            i02 = null;
        }
        i02.f15390c.setText(z4 ? AbstractC0888D.f14500j2 : ((cab.shashki.app.ui.halma.a) V2()).Y0() ? AbstractC0888D.f14478f0 : AbstractC0888D.f14406O1);
    }

    @Override // cab.shashki.app.ui.halma.b
    public void m(boolean z4) {
        I0 i02 = null;
        if (!z4) {
            I0 i03 = this.f11573K;
            if (i03 == null) {
                m.r("binding");
            } else {
                i02 = i03;
            }
            i02.f15392e.setVisibility(8);
            return;
        }
        I0 i04 = this.f11573K;
        if (i04 == null) {
            m.r("binding");
        } else {
            i02 = i04;
        }
        i02.f15392e.setVisibility(0);
        a(((cab.shashki.app.ui.halma.a) V2()).S0());
    }

    @Override // cab.shashki.app.ui.halma.b
    public void o1() {
        a aVar = this.f11572J;
        if (aVar == null) {
            m.r("adapter");
            aVar = null;
        }
        aVar.m();
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        I0 i0D = I0.d(getLayoutInflater());
        this.f11573K = i0D;
        I0 i02 = null;
        byte b4 = 0;
        if (i0D == null) {
            m.r("binding");
            i0D = null;
        }
        setContentView(i0D.a());
        int i4 = 0;
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.f14408P, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        I0 i03 = this.f11573K;
        if (i03 == null) {
            m.r("binding");
            i03 = null;
        }
        View view = i03.f15392e;
        m.d(view, "preview");
        int i5 = 1;
        C0573k.s(c0573k, view, 0, 1, null);
        I0 i04 = this.f11573K;
        if (i04 == null) {
            m.r("binding");
            i04 = null;
        }
        TextView textView = i04.f15390c;
        m.d(textView, "next");
        C0573k.s(c0573k, textView, 0, 1, null);
        I0 i05 = this.f11573K;
        if (i05 == null) {
            m.r("binding");
            i05 = null;
        }
        ViewPager2 viewPager2 = i05.f15391d;
        m.d(viewPager2, "pager");
        C0573k.v(c0573k, viewPager2, 0, 1, null);
        I0 i06 = this.f11573K;
        if (i06 == null) {
            m.r("binding");
            i06 = null;
        }
        i06.f15391d.g(new f());
        this.f11572J = new a(this, i4, i5, b4 == true ? 1 : 0);
        I0 i07 = this.f11573K;
        if (i07 == null) {
            m.r("binding");
            i07 = null;
        }
        ViewPager2 viewPager22 = i07.f15391d;
        a aVar = this.f11572J;
        if (aVar == null) {
            m.r("adapter");
            aVar = null;
        }
        viewPager22.setAdapter(aVar);
        I0 i08 = this.f11573K;
        if (i08 == null) {
            m.r("binding");
            i08 = null;
        }
        i08.f15390c.setOnClickListener(new View.OnClickListener() { // from class: G0.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HalmaBuilderActivity.d3(this.f1233b, view2);
            }
        });
        I0 i09 = this.f11573K;
        if (i09 == null) {
            m.r("binding");
            i09 = null;
        }
        final View childAt = i09.f15391d.getChildAt(0);
        I0 i010 = this.f11573K;
        if (i010 == null) {
            m.r("binding");
        } else {
            i02 = i010;
        }
        i02.f15392e.setOnTouchListener(new View.OnTouchListener() { // from class: G0.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return HalmaBuilderActivity.e3(childAt, view2, motionEvent);
            }
        });
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((cab.shashki.app.ui.halma.a) V2()).v0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((cab.shashki.app.ui.halma.a) V2()).E0(this);
    }

    @Override // cab.shashki.app.ui.halma.b
    public void p() {
        a aVar = this.f11572J;
        if (aVar == null) {
            m.r("adapter");
            aVar = null;
        }
        aVar.j0();
    }

    @Override // cab.shashki.app.ui.halma.b
    public void p0() {
        I0 i02 = this.f11573K;
        if (i02 == null) {
            m.r("binding");
            i02 = null;
        }
        Snackbar.b0(i02.f15391d, AbstractC0888D.f14525o2, -1).R();
    }

    @Override // cab.shashki.app.ui.halma.b
    public void r(int i4) {
        I0 i02 = this.f11573K;
        if (i02 == null) {
            m.r("binding");
            i02 = null;
        }
        i02.f15391d.setCurrentItem(i4);
    }

    public final class a extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private int f11574d;

        /* renamed from: e, reason: collision with root package name */
        private e f11575e;

        public a(int i4) {
            this.f11574d = i4;
        }

        private final void R(final c cVar) throws Resources.NotFoundException {
            cVar.O().f15337c.setProgress((HalmaBuilderActivity.b3(HalmaBuilderActivity.this).R0() / 10) - 1);
            C0573k c0573k = C0573k.f2973a;
            AppCompatSeekBar appCompatSeekBar = cVar.O().f15337c;
            m.d(appCompatSeekBar, "lose");
            final HalmaBuilderActivity halmaBuilderActivity = HalmaBuilderActivity.this;
            c0573k.y(appCompatSeekBar, new InterfaceC1016l() { // from class: G0.k
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return HalmaBuilderActivity.a.S(halmaBuilderActivity, cVar, ((Integer) obj).intValue());
                }
            });
            TextView textView = cVar.O().f15338d;
            HalmaBuilderActivity halmaBuilderActivity2 = HalmaBuilderActivity.this;
            textView.setText(halmaBuilderActivity2.getString(AbstractC0888D.f14553u0, Integer.valueOf(HalmaBuilderActivity.b3(halmaBuilderActivity2).R0())));
            cVar.O().f15336b.setVisibility(HalmaBuilderActivity.b3(HalmaBuilderActivity.this).Q0() ? 8 : 0);
            cVar.O().f15336b.setChecked(HalmaBuilderActivity.b3(HalmaBuilderActivity.this).J0());
            SwitchCompat switchCompat = cVar.O().f15336b;
            final HalmaBuilderActivity halmaBuilderActivity3 = HalmaBuilderActivity.this;
            switchCompat.setOnClickListener(new View.OnClickListener() { // from class: G0.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HalmaBuilderActivity.a.T(halmaBuilderActivity3, cVar, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u S(HalmaBuilderActivity halmaBuilderActivity, c cVar, int i4) {
            int i5 = (i4 + 1) * 10;
            HalmaBuilderActivity.b3(halmaBuilderActivity).c1(i5);
            cVar.O().f15338d.setText(halmaBuilderActivity.getString(AbstractC0888D.f14553u0, Integer.valueOf(i5)));
            return u.f3817a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void T(HalmaBuilderActivity halmaBuilderActivity, c cVar, View view) {
            HalmaBuilderActivity.b3(halmaBuilderActivity).a1(cVar.O().f15336b.isChecked());
        }

        private final void U(final d dVar) {
            String strM0;
            dVar.O().f15352f.setText(HalmaBuilderActivity.b3(HalmaBuilderActivity.this).S0());
            C0573k c0573k = C0573k.f2973a;
            TextInputEditText textInputEditText = dVar.O().f15352f;
            m.d(textInputEditText, HalmaParams.NAME);
            final HalmaBuilderActivity halmaBuilderActivity = HalmaBuilderActivity.this;
            c0573k.x(textInputEditText, new InterfaceC1016l() { // from class: G0.j
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return HalmaBuilderActivity.a.V(halmaBuilderActivity, (String) obj);
                }
            });
            final t tVar = new t();
            tVar.f16265d = 4;
            if (HalmaBuilderActivity.b3(HalmaBuilderActivity.this).Q0()) {
                tVar.f16265d = 2;
                dVar.O().f15353g.setMax(3);
                dVar.O().f15349c.setVisibility(8);
            } else {
                dVar.O().f15353g.setMax(12);
                dVar.O().f15349c.setVisibility(0);
            }
            dVar.O().f15353g.setProgress(HalmaBuilderActivity.b3(HalmaBuilderActivity.this).h1() - tVar.f16265d);
            AppCompatSeekBar appCompatSeekBar = dVar.O().f15353g;
            m.d(appCompatSeekBar, HalmaParams.SIZE);
            final HalmaBuilderActivity halmaBuilderActivity2 = HalmaBuilderActivity.this;
            c0573k.y(appCompatSeekBar, new InterfaceC1016l() { // from class: G0.m
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return HalmaBuilderActivity.a.W(tVar, halmaBuilderActivity2, dVar, ((Integer) obj).intValue());
                }
            });
            dVar.O().f15349c.setProgress(HalmaBuilderActivity.b3(HalmaBuilderActivity.this).O0() - tVar.f16265d);
            AppCompatSeekBar appCompatSeekBar2 = dVar.O().f15349c;
            m.d(appCompatSeekBar2, HalmaParams.HEIGHT);
            final HalmaBuilderActivity halmaBuilderActivity3 = HalmaBuilderActivity.this;
            c0573k.y(appCompatSeekBar2, new InterfaceC1016l() { // from class: G0.n
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return HalmaBuilderActivity.a.X(tVar, halmaBuilderActivity3, dVar, ((Integer) obj).intValue());
                }
            });
            dVar.O().f15355i.setText(HalmaBuilderActivity.b3(HalmaBuilderActivity.this).i1());
            dVar.O().f15351e.setSelected(HalmaBuilderActivity.b3(HalmaBuilderActivity.this).Q0());
            dVar.O().f15350d.setSelected(!HalmaBuilderActivity.b3(HalmaBuilderActivity.this).Q0());
            ImageView imageView = dVar.O().f15351e;
            final HalmaBuilderActivity halmaBuilderActivity4 = HalmaBuilderActivity.this;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: G0.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HalmaBuilderActivity.a.Y(halmaBuilderActivity4, view);
                }
            });
            ImageView imageView2 = dVar.O().f15350d;
            final HalmaBuilderActivity halmaBuilderActivity5 = HalmaBuilderActivity.this;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: G0.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HalmaBuilderActivity.a.Z(halmaBuilderActivity5, view);
                }
            });
            if (!HalmaBuilderActivity.b3(HalmaBuilderActivity.this).Y0() || (strM0 = HalmaBuilderActivity.b3(HalmaBuilderActivity.this).M0()) == null) {
                return;
            }
            dVar.O().f15354h.setText(strM0);
            dVar.O().f15354h.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u V(HalmaBuilderActivity halmaBuilderActivity, String str) {
            m.e(str, "it");
            HalmaBuilderActivity.b3(halmaBuilderActivity).d1(str);
            return u.f3817a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u W(t tVar, HalmaBuilderActivity halmaBuilderActivity, d dVar, int i4) {
            HalmaBuilderActivity.b3(halmaBuilderActivity).e1(i4 + tVar.f16265d, dVar.O().f15349c.getProgress() + tVar.f16265d);
            dVar.O().f15355i.setText(HalmaBuilderActivity.b3(halmaBuilderActivity).i1());
            return u.f3817a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u X(t tVar, HalmaBuilderActivity halmaBuilderActivity, d dVar, int i4) {
            HalmaBuilderActivity.b3(halmaBuilderActivity).e1(dVar.O().f15353g.getProgress() + tVar.f16265d, i4 + tVar.f16265d);
            dVar.O().f15355i.setText(HalmaBuilderActivity.b3(halmaBuilderActivity).i1());
            return u.f3817a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Y(HalmaBuilderActivity halmaBuilderActivity, View view) {
            HalmaBuilderActivity.b3(halmaBuilderActivity).g1(true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Z(HalmaBuilderActivity halmaBuilderActivity, View view) {
            HalmaBuilderActivity.b3(halmaBuilderActivity).g1(false);
        }

        private final void a0(final e eVar) {
            eVar.O().f15363d.setListener(HalmaBuilderActivity.b3(HalmaBuilderActivity.this));
            h0();
            j0();
            i0(HalmaBuilderActivity.b3(HalmaBuilderActivity.this).L0());
            eVar.O().f15365f.setChecked(HalmaBuilderActivity.b3(HalmaBuilderActivity.this).K0());
            AppCompatCheckBox appCompatCheckBox = eVar.O().f15365f;
            final HalmaBuilderActivity halmaBuilderActivity = HalmaBuilderActivity.this;
            appCompatCheckBox.setOnClickListener(new View.OnClickListener() { // from class: G0.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HalmaBuilderActivity.a.d0(halmaBuilderActivity, eVar, view);
                }
            });
            ImageView imageView = eVar.O().f15362c;
            final HalmaBuilderActivity halmaBuilderActivity2 = HalmaBuilderActivity.this;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: G0.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HalmaBuilderActivity.a.e0(halmaBuilderActivity2, view);
                }
            });
            ImageView imageView2 = eVar.O().f15361b;
            final HalmaBuilderActivity halmaBuilderActivity3 = HalmaBuilderActivity.this;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: G0.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HalmaBuilderActivity.a.f0(halmaBuilderActivity3, view);
                }
            });
            ImageView imageView3 = eVar.O().f15364e;
            final HalmaBuilderActivity halmaBuilderActivity4 = HalmaBuilderActivity.this;
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: G0.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    HalmaBuilderActivity.a.b0(halmaBuilderActivity4, view);
                }
            });
            ImageView imageView4 = eVar.O().f15364e;
            final HalmaBuilderActivity halmaBuilderActivity5 = HalmaBuilderActivity.this;
            imageView4.setOnLongClickListener(new View.OnLongClickListener() { // from class: G0.u
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return HalmaBuilderActivity.a.c0(halmaBuilderActivity5, view);
                }
            });
            eVar.O().f15365f.setVisibility(HalmaBuilderActivity.b3(HalmaBuilderActivity.this).Q0() ? 8 : 0);
            eVar.O().f15362c.setVisibility(eVar.O().f15365f.getVisibility());
            eVar.O().f15361b.setVisibility(eVar.O().f15365f.getVisibility());
            eVar.O().f15364e.setVisibility(eVar.O().f15365f.getVisibility());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b0(HalmaBuilderActivity halmaBuilderActivity, View view) {
            HalmaBuilderActivity.b3(halmaBuilderActivity).Z0(b.a.f11603d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c0(HalmaBuilderActivity halmaBuilderActivity, View view) {
            HalmaBuilderActivity.b3(halmaBuilderActivity).I0();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d0(HalmaBuilderActivity halmaBuilderActivity, e eVar, View view) {
            HalmaBuilderActivity.b3(halmaBuilderActivity).b1(eVar.O().f15365f.isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e0(HalmaBuilderActivity halmaBuilderActivity, View view) {
            HalmaBuilderActivity.b3(halmaBuilderActivity).Z0(b.a.f11604e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f0(HalmaBuilderActivity halmaBuilderActivity, View view) {
            HalmaBuilderActivity.b3(halmaBuilderActivity).Z0(b.a.f11605f);
        }

        public final e g0() {
            return this.f11575e;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            return this.f11574d;
        }

        public final void h0() {
            C0939H c0939hO;
            ShashkiBoardView shashkiBoardView;
            e eVar = this.f11575e;
            if (eVar == null || (c0939hO = eVar.O()) == null || (shashkiBoardView = c0939hO.f15363d) == null) {
                return;
            }
            shashkiBoardView.setGridMode(HalmaBuilderActivity.b3(HalmaBuilderActivity.this).N0());
        }

        public final void i0(b.a aVar) {
            m.e(aVar, "action");
            e eVar = this.f11575e;
            if (eVar == null) {
                return;
            }
            eVar.O().f15364e.setSelected(aVar == b.a.f11603d);
            eVar.O().f15361b.setSelected(aVar == b.a.f11605f);
            eVar.O().f15362c.setSelected(aVar == b.a.f11604e);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int j(int i4) {
            return i4;
        }

        public final void j0() {
            C0939H c0939hO;
            ShashkiBoardView shashkiBoardView;
            e eVar = this.f11575e;
            if (eVar == null || (c0939hO = eVar.O()) == null || (shashkiBoardView = c0939hO.f15363d) == null) {
                return;
            }
            shashkiBoardView.setPosition(HalmaBuilderActivity.b3(HalmaBuilderActivity.this).j1());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void u(RecyclerView.D d4, int i4) throws Resources.NotFoundException {
            m.e(d4, "holder");
            if (i4 == 0) {
                U((d) d4);
            } else if (i4 == 1) {
                a0((e) d4);
            } else {
                if (i4 != 2) {
                    return;
                }
                R((c) d4);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.D w(ViewGroup viewGroup, int i4) {
            m.e(viewGroup, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            if (i4 == 0) {
                C0938G c0938gD = C0938G.d(layoutInflaterFrom, viewGroup, false);
                m.d(c0938gD, "inflate(...)");
                return new d(c0938gD);
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("wrong holder type");
                }
                C0937F c0937fD = C0937F.d(layoutInflaterFrom, viewGroup, false);
                m.d(c0937fD, "inflate(...)");
                return new c(c0937fD);
            }
            C0939H c0939hD = C0939H.d(layoutInflaterFrom, viewGroup, false);
            m.d(c0939hD, "inflate(...)");
            e eVar = new e(c0939hD);
            this.f11575e = eVar;
            return eVar;
        }

        public /* synthetic */ a(HalmaBuilderActivity halmaBuilderActivity, int i4, int i5, h hVar) {
            this((i5 & 1) != 0 ? 3 : i4);
        }
    }
}