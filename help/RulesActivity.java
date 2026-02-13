package cab.shashki.app.ui.help;

import H0.h;
import H0.i;
import H0.j;
import H0.k;
import H0.l;
import H0.m;
import H0.n;
import H0.v;
import H0.w;
import H0.x;
import H0.z;
import N0.C0573k;
import T2.u;
import U2.p;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.recyclerview.widget.RecyclerView;
import cab.shashki.app.ui.custom.board.C0843z;
import cab.shashki.app.ui.custom.board.ShashkiBoardView;
import cab.shashki.app.ui.custom.board.W;
import cab.shashki.app.ui.custom.board.s0;
import cab.shashki.app.ui.help.RulesActivity;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractC0916t;
import f0.AbstractC0920x;
import f0.AbstractC0922z;
import g0.C0986o0;
import g0.C0988p0;
import g3.InterfaceC1016l;
import g3.InterfaceC1020p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class RulesActivity extends AbstractActivityC0911o implements h {

    /* renamed from: O, reason: collision with root package name */
    public static final a f11609O = new a(null);

    /* renamed from: J, reason: collision with root package name */
    private C0986o0 f11610J;

    /* renamed from: K, reason: collision with root package name */
    private c f11611K;

    /* renamed from: L, reason: collision with root package name */
    private ArrayAdapter f11612L;

    /* renamed from: M, reason: collision with root package name */
    private m f11613M;

    /* renamed from: N, reason: collision with root package name */
    private final Handler f11614N = new Handler(Looper.getMainLooper());

    public static final class a {
        public /* synthetic */ a(h3.h hVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final TextView f11615u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(view);
            h3.m.e(view, "view");
            View viewFindViewById = view.findViewById(AbstractC0920x.n7);
            h3.m.b(viewFindViewById);
            this.f11615u = (TextView) viewFindViewById;
        }

        public final TextView O() {
            return this.f11615u;
        }
    }

    public static final class c extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private m f11616d;

        /* renamed from: e, reason: collision with root package name */
        private int f11617e;

        /* renamed from: f, reason: collision with root package name */
        private int f11618f;

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC1020p f11619g;

        public /* synthetic */ c(m mVar, int i4, int i5, InterfaceC1020p interfaceC1020p, int i6, h3.h hVar) {
            this((i6 & 1) != 0 ? null : mVar, (i6 & 2) != 0 ? 0 : i4, (i6 & 4) != 0 ? 0 : i5, interfaceC1020p);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void H(c cVar, int i4, int i5, View view) {
            cVar.f11619g.k(Integer.valueOf(i4), Integer.valueOf(i5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void I(c cVar, x xVar, View view) {
            cVar.f11619g.k(-1, Integer.valueOf(((j) xVar).a()));
        }

        public final void J(m mVar) {
            this.f11616d = mVar;
        }

        public final void K(int i4, int i5) {
            int i6 = this.f11617e;
            this.f11617e = i4;
            this.f11618f = i5;
            n(i4);
            if (i6 != this.f11617e) {
                n(i6);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            List listA;
            m mVar = this.f11616d;
            if (mVar == null || (listA = mVar.a()) == null) {
                return 0;
            }
            return listA.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int j(int i4) {
            List listA;
            m mVar = this.f11616d;
            x xVar = (mVar == null || (listA = mVar.a()) == null) ? null : (x) listA.get(i4);
            if (xVar instanceof n) {
                return 0;
            }
            return xVar instanceof j ? 1 : 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void u(RecyclerView.D d4, final int i4) {
            List listA;
            final x xVar;
            h3.m.e(d4, "holder");
            m mVar = this.f11616d;
            if (mVar == null || (listA = mVar.a()) == null || (xVar = (x) p.I(listA, i4)) == null) {
                return;
            }
            Context context = d4.f9119a.getContext();
            if ((xVar instanceof n) && (d4 instanceof d)) {
                d dVar = (d) d4;
                TextView textView = dVar.O().f15820b;
                n nVar = (n) xVar;
                String string = context.getString(nVar.a());
                h3.m.d(string, "getString(...)");
                String lowerCase = string.toLowerCase(Locale.ROOT);
                h3.m.d(lowerCase, "toLowerCase(...)");
                textView.setText(lowerCase);
                int iMin = Math.min(dVar.P().size(), nVar.b().size());
                final int i5 = 0;
                while (i5 < iMin) {
                    RadioButton radioButton = (RadioButton) dVar.P().get(i5);
                    radioButton.setVisibility(0);
                    radioButton.setChecked(i4 == this.f11617e && this.f11618f == i5);
                    radioButton.setOnClickListener(new View.OnClickListener() { // from class: H0.t
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            RulesActivity.c.H(this.f1421b, i4, i5, view);
                        }
                    });
                    i5++;
                }
                int size = dVar.P().size();
                while (iMin < size) {
                    ((RadioButton) dVar.P().get(iMin)).setVisibility(8);
                    iMin++;
                }
                return;
            }
            if (!(xVar instanceof j) || !(d4 instanceof b)) {
                if ((xVar instanceof z) && (d4 instanceof e)) {
                    TextView textViewO = ((e) d4).O();
                    String string2 = context.getString(((z) xVar).a());
                    h3.m.d(string2, "getString(...)");
                    String lowerCase2 = string2.toLowerCase(Locale.ROOT);
                    h3.m.d(lowerCase2, "toLowerCase(...)");
                    textViewO.setText(lowerCase2);
                    return;
                }
                return;
            }
            b bVar = (b) d4;
            TextView textViewO2 = bVar.O();
            String string3 = context.getString(AbstractC0888D.f14557v);
            String string4 = context.getString(((j) xVar).a());
            h3.m.d(string4, "getString(...)");
            String lowerCase3 = string4.toLowerCase(Locale.ROOT);
            h3.m.d(lowerCase3, "toLowerCase(...)");
            textViewO2.setText(Html.fromHtml(string3 + " <b>" + lowerCase3 + "</b>"));
            bVar.O().setOnClickListener(new View.OnClickListener() { // from class: H0.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RulesActivity.c.I(this.f1424b, xVar, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.D w(ViewGroup viewGroup, int i4) {
            h3.m.e(viewGroup, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            if (i4 == 0) {
                C0988p0 c0988p0D = C0988p0.d(layoutInflaterFrom, viewGroup, false);
                h3.m.d(c0988p0D, "inflate(...)");
                return new d(c0988p0D);
            }
            if (i4 != 1) {
                View viewInflate = layoutInflaterFrom.inflate(AbstractC0922z.f15131D0, viewGroup, false);
                h3.m.c(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
                return new e((TextView) viewInflate);
            }
            View viewInflate2 = layoutInflaterFrom.inflate(AbstractC0922z.f15127B0, viewGroup, false);
            h3.m.d(viewInflate2, "inflate(...)");
            return new b(viewInflate2);
        }

        public c(m mVar, int i4, int i5, InterfaceC1020p interfaceC1020p) {
            h3.m.e(interfaceC1020p, "onRule");
            this.f11616d = mVar;
            this.f11617e = i4;
            this.f11618f = i5;
            this.f11619g = interfaceC1020p;
        }
    }

    public static final class d extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final C0988p0 f11620u;

        /* renamed from: v, reason: collision with root package name */
        private final List f11621v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C0988p0 c0988p0) {
            super(c0988p0.a());
            h3.m.e(c0988p0, "binding");
            this.f11620u = c0988p0;
            this.f11621v = p.j(c0988p0.f15821c, c0988p0.f15822d, c0988p0.f15823e, c0988p0.f15824f, c0988p0.f15825g, c0988p0.f15826h, c0988p0.f15827i, c0988p0.f15828j);
        }

        public final C0988p0 O() {
            return this.f11620u;
        }

        public final List P() {
            return this.f11621v;
        }
    }

    public static final class e extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final TextView f11622u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(TextView textView) {
            super(textView);
            h3.m.e(textView, "view");
            this.f11622u = textView;
        }

        public final TextView O() {
            return this.f11622u;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(RulesActivity rulesActivity, View view) {
        C0986o0 c0986o0 = rulesActivity.f11610J;
        C0986o0 c0986o02 = null;
        if (c0986o0 == null) {
            h3.m.r("binding");
            c0986o0 = null;
        }
        ShashkiBoardView shashkiBoardView = c0986o0.f15796b;
        C0986o0 c0986o03 = rulesActivity.f11610J;
        if (c0986o03 == null) {
            h3.m.r("binding");
        } else {
            c0986o02 = c0986o03;
        }
        shashkiBoardView.setRotate(!c0986o02.f15796b.s1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u f3(RulesActivity rulesActivity, int i4, int i5) {
        if (i4 < 0) {
            ((v) rulesActivity.V2()).B0(i5);
        } else {
            rulesActivity.f11614N.removeCallbacksAndMessages(null);
            i3(rulesActivity, i4, i5, 0, 4, null);
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u g3(RulesActivity rulesActivity, int i4) {
        ((v) rulesActivity.V2()).A0(i4);
        return u.f3817a;
    }

    private final int h3(final int i4, final int i5, int i6) {
        List listB;
        final l lVar;
        m mVar = this.f11613M;
        if (mVar == null) {
            h3.m.r("rules");
            mVar = null;
        }
        Object obj = mVar.a().get(i4);
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null && (listB = nVar.b()) != null && (lVar = (l) p.I(listB, i5)) != null) {
            this.f11614N.postDelayed(new Runnable() { // from class: H0.r
                @Override // java.lang.Runnable
                public final void run() {
                    RulesActivity.k3(this.f1415d, i4, i5, lVar);
                }
            }, i6);
            i6 += lVar.c();
            for (final w wVar : lVar.b()) {
                this.f11614N.postDelayed(new Runnable() { // from class: H0.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        RulesActivity.j3(wVar, this);
                    }
                }, i6);
                i6 += wVar.e();
            }
        }
        return i6;
    }

    static /* synthetic */ int i3(RulesActivity rulesActivity, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i6 = 0;
        }
        return rulesActivity.h3(i4, i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j3(w wVar, RulesActivity rulesActivity) {
        if (wVar.a()) {
            C0986o0 c0986o0 = rulesActivity.f11610J;
            if (c0986o0 == null) {
                h3.m.r("binding");
                c0986o0 = null;
            }
            c0986o0.f15796b.m1();
        }
        List<C0843z.g> listC = wVar.c();
        if (listC != null) {
            C0986o0 c0986o02 = rulesActivity.f11610J;
            if (c0986o02 == null) {
                h3.m.r("binding");
                c0986o02 = null;
            }
            c0986o02.f15796b.setLines(listC);
        }
        List<C0843z.n> listF = wVar.f();
        if (listF != null) {
            C0986o0 c0986o03 = rulesActivity.f11610J;
            if (c0986o03 == null) {
                h3.m.r("binding");
                c0986o03 = null;
            }
            c0986o03.f15796b.setZones(listF);
        }
        List<i> listB = wVar.b();
        if (listB != null) {
            for (i iVar : listB) {
                C0986o0 c0986o04 = rulesActivity.f11610J;
                if (c0986o04 == null) {
                    h3.m.r("binding");
                    c0986o04 = null;
                }
                ShashkiBoardView shashkiBoardView = c0986o04.f15796b;
                C0843z.e eVarB = iVar.b();
                String[] strArr = (String[]) iVar.a().toArray(new String[0]);
                shashkiBoardView.d1(eVarB, (String[]) Arrays.copyOf(strArr, strArr.length));
            }
        }
        List<k> listD = wVar.d();
        if (listD != null) {
            for (k kVar : listD) {
                if (h3.m.a(kVar.b(), "@")) {
                    C0986o0 c0986o05 = rulesActivity.f11610J;
                    if (c0986o05 == null) {
                        h3.m.r("binding");
                        c0986o05 = null;
                    }
                    ShashkiBoardView shashkiBoardView2 = c0986o05.f15796b;
                    String strD = kVar.d();
                    Integer numC = kVar.c();
                    h3.m.b(numC);
                    s0.i1(shashkiBoardView2, strD, numC.intValue(), false, null, 8, null);
                    for (String str : kVar.a()) {
                        C0986o0 c0986o06 = rulesActivity.f11610J;
                        if (c0986o06 == null) {
                            h3.m.r("binding");
                            c0986o06 = null;
                        }
                        c0986o06.f15796b.k1(str, kVar.c().intValue());
                    }
                    C0986o0 c0986o07 = rulesActivity.f11610J;
                    if (c0986o07 == null) {
                        h3.m.r("binding");
                        c0986o07 = null;
                    }
                    c0986o07.f15796b.V2();
                } else {
                    C0986o0 c0986o08 = rulesActivity.f11610J;
                    if (c0986o08 == null) {
                        h3.m.r("binding");
                        c0986o08 = null;
                    }
                    ShashkiBoardView.H2(c0986o08.f15796b, kVar.b(), kVar.d(), false, 4, null);
                    if (kVar.e()) {
                        C0986o0 c0986o09 = rulesActivity.f11610J;
                        if (c0986o09 == null) {
                            h3.m.r("binding");
                            c0986o09 = null;
                        }
                        c0986o09.f15796b.v1(kVar.d(), kVar.a());
                    } else {
                        List listA = kVar.a();
                        C0986o0 c0986o010 = rulesActivity.f11610J;
                        if (c0986o010 == null) {
                            h3.m.r("binding");
                            c0986o010 = null;
                        }
                        ShashkiBoardView shashkiBoardView3 = c0986o010.f15796b;
                        Iterator it = listA.iterator();
                        while (it.hasNext()) {
                            shashkiBoardView3.z1((String) it.next());
                        }
                    }
                    Integer numC2 = kVar.c();
                    if (numC2 != null) {
                        int iIntValue = numC2.intValue();
                        C0986o0 c0986o011 = rulesActivity.f11610J;
                        if (c0986o011 == null) {
                            h3.m.r("binding");
                            c0986o011 = null;
                        }
                        c0986o011.f15796b.k1(kVar.d(), iIntValue);
                    }
                    Map mapF = kVar.f();
                    if (mapF != null) {
                        C0986o0 c0986o012 = rulesActivity.f11610J;
                        if (c0986o012 == null) {
                            h3.m.r("binding");
                            c0986o012 = null;
                        }
                        c0986o012.f15796b.J2(mapF);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(RulesActivity rulesActivity, int i4, int i5, l lVar) {
        c cVar = rulesActivity.f11611K;
        C0986o0 c0986o0 = null;
        if (cVar == null) {
            h3.m.r("adapter");
            cVar = null;
        }
        cVar.K(i4, i5);
        C0986o0 c0986o02 = rulesActivity.f11610J;
        if (c0986o02 == null) {
            h3.m.r("binding");
            c0986o02 = null;
        }
        c0986o02.f15797c.u1(i4);
        C0986o0 c0986o03 = rulesActivity.f11610J;
        if (c0986o03 == null) {
            h3.m.r("binding");
        } else {
            c0986o0 = c0986o03;
        }
        c0986o0.f15796b.setPosition(lVar.a());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: d3, reason: merged with bridge method [inline-methods] */
    public v U2() {
        Intent intent = getIntent();
        return new v(intent != null ? intent.getIntExtra("type", AbstractC0888D.k6) : AbstractC0888D.k6);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((v) V2()).x0();
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i4;
        super.onCreate(bundle);
        C0986o0 c0986o0D = C0986o0.d(getLayoutInflater());
        this.f11610J = c0986o0D;
        C0986o0 c0986o0 = null;
        if (c0986o0D == null) {
            h3.m.r("binding");
            c0986o0D = null;
        }
        setContentView(c0986o0D.a());
        int i5 = 1;
        G2(AbstractC0888D.x4, true);
        C0986o0 c0986o02 = this.f11610J;
        if (c0986o02 == null) {
            h3.m.r("binding");
            c0986o02 = null;
        }
        c0986o02.f15796b.setTouchControl(false);
        C0986o0 c0986o03 = this.f11610J;
        if (c0986o03 == null) {
            h3.m.r("binding");
            c0986o03 = null;
        }
        c0986o03.f15796b.setOnClickListener(new View.OnClickListener() { // from class: H0.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RulesActivity.e3(this.f1412b, view);
            }
        });
        this.f11611K = new c(null, 0, 0, new InterfaceC1020p() { // from class: H0.p
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return RulesActivity.f3(this.f1413d, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, 7, null);
        C0986o0 c0986o04 = this.f11610J;
        if (c0986o04 == null) {
            h3.m.r("binding");
            c0986o04 = null;
        }
        RecyclerView recyclerView = c0986o04.f15797c;
        c cVar = this.f11611K;
        if (cVar == null) {
            h3.m.r("adapter");
            cVar = null;
        }
        recyclerView.setAdapter(cVar);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, AbstractC0922z.f15220r0, R.id.text1);
        this.f11612L = arrayAdapter;
        arrayAdapter.setNotifyOnChange(false);
        C0986o0 c0986o05 = this.f11610J;
        if (c0986o05 == null) {
            h3.m.r("binding");
            c0986o05 = null;
        }
        AppCompatSpinner appCompatSpinner = c0986o05.f15800f;
        ArrayAdapter arrayAdapter2 = this.f11612L;
        if (arrayAdapter2 == null) {
            h3.m.r("typeAdapter");
            arrayAdapter2 = null;
        }
        appCompatSpinner.setAdapter((SpinnerAdapter) arrayAdapter2);
        C0573k c0573k = C0573k.f2973a;
        C0986o0 c0986o06 = this.f11610J;
        if (c0986o06 == null) {
            h3.m.r("binding");
            c0986o06 = null;
        }
        AppCompatSpinner appCompatSpinner2 = c0986o06.f15800f;
        h3.m.d(appCompatSpinner2, "typeSpinner");
        c0573k.z(appCompatSpinner2, new InterfaceC1016l() { // from class: H0.q
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return RulesActivity.g3(this.f1414d, ((Integer) obj).intValue());
            }
        });
        int i6 = 9;
        if (getResources().getBoolean(AbstractC0916t.f14626b)) {
            i4 = 8;
        } else {
            i5 = 5;
            i4 = 9;
            i6 = 5;
        }
        C0986o0 c0986o07 = this.f11610J;
        if (c0986o07 == null) {
            h3.m.r("binding");
            c0986o07 = null;
        }
        ShashkiBoardView shashkiBoardView = c0986o07.f15796b;
        h3.m.d(shashkiBoardView, "board");
        c0573k.r(shashkiBoardView, i5);
        C0986o0 c0986o08 = this.f11610J;
        if (c0986o08 == null) {
            h3.m.r("binding");
            c0986o08 = null;
        }
        AppCompatSpinner appCompatSpinner3 = c0986o08.f15800f;
        h3.m.d(appCompatSpinner3, "typeSpinner");
        c0573k.r(appCompatSpinner3, i6);
        C0986o0 c0986o09 = this.f11610J;
        if (c0986o09 == null) {
            h3.m.r("binding");
        } else {
            c0986o0 = c0986o09;
        }
        RecyclerView recyclerView2 = c0986o0.f15797c;
        h3.m.d(recyclerView2, "details");
        c0573k.u(recyclerView2, i4);
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f11614N.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((v) V2()).v0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((v) V2()).y0(this);
    }

    @Override // H0.h
    public void s1(List list, int i4) {
        h3.m.e(list, "types");
        ArrayAdapter arrayAdapter = this.f11612L;
        C0986o0 c0986o0 = null;
        if (arrayAdapter == null) {
            h3.m.r("typeAdapter");
            arrayAdapter = null;
        }
        arrayAdapter.clear();
        ArrayAdapter arrayAdapter2 = this.f11612L;
        if (arrayAdapter2 == null) {
            h3.m.r("typeAdapter");
            arrayAdapter2 = null;
        }
        ArrayList arrayList = new ArrayList(p.o(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(getString(((Number) it.next()).intValue()));
        }
        arrayAdapter2.addAll(arrayList);
        ArrayAdapter arrayAdapter3 = this.f11612L;
        if (arrayAdapter3 == null) {
            h3.m.r("typeAdapter");
            arrayAdapter3 = null;
        }
        arrayAdapter3.notifyDataSetChanged();
        C0986o0 c0986o02 = this.f11610J;
        if (c0986o02 == null) {
            h3.m.r("binding");
        } else {
            c0986o0 = c0986o02;
        }
        c0986o0.f15800f.setSelection(i4);
    }

    @Override // H0.h
    public void w(m mVar, C0843z.a aVar) {
        h3.m.e(mVar, "description");
        h3.m.e(aVar, "params");
        C0986o0 c0986o0 = null;
        this.f11614N.removeCallbacksAndMessages(null);
        this.f11613M = mVar;
        c cVar = this.f11611K;
        if (cVar == null) {
            h3.m.r("adapter");
            cVar = null;
        }
        cVar.J(mVar);
        c cVar2 = this.f11611K;
        if (cVar2 == null) {
            h3.m.r("adapter");
            cVar2 = null;
        }
        cVar2.m();
        C0986o0 c0986o02 = this.f11610J;
        if (c0986o02 == null) {
            h3.m.r("binding");
            c0986o02 = null;
        }
        c0986o02.f15796b.setListener((W) V2());
        C0986o0 c0986o03 = this.f11610J;
        if (c0986o03 == null) {
            h3.m.r("binding");
            c0986o03 = null;
        }
        c0986o03.f15796b.setGridMode(aVar.d());
        C0986o0 c0986o04 = this.f11610J;
        if (c0986o04 == null) {
            h3.m.r("binding");
            c0986o04 = null;
        }
        c0986o04.f15796b.P1(aVar.e());
        C0986o0 c0986o05 = this.f11610J;
        if (c0986o05 == null) {
            h3.m.r("binding");
        } else {
            c0986o0 = c0986o05;
        }
        c0986o0.f15796b.D1(aVar.g(), aVar.a());
        int i4 = 0;
        int iH3 = 0;
        for (Object obj : mVar.a()) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                p.n();
            }
            x xVar = (x) obj;
            if (xVar instanceof n) {
                int size = ((n) xVar).b().size();
                for (int i6 = 0; i6 < size; i6++) {
                    iH3 = h3(i4, i6, iH3);
                }
            }
            i4 = i5;
        }
    }
}