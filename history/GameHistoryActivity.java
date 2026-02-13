package cab.shashki.app.ui.history;

import F0.C0275c;
import N0.C0573k;
import N0.K;
import T2.u;
import U2.p;
import android.R;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.core.content.res.h;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.ui.custom.HistoryGraphView;
import cab.shashki.app.ui.custom.board.C0843z;
import cab.shashki.app.ui.custom.board.ShashkiBoardView;
import cab.shashki.app.ui.custom.board.W;
import cab.shashki.app.ui.history.GameHistoryActivity;
import cab.shashki.app.ui.history.b;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractC0918v;
import f0.AbstractC0919w;
import f0.AbstractC0921y;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0935D;
import g0.C0936E;
import g0.C0952V;
import g0.C0994t;
import g3.InterfaceC1016l;
import g3.InterfaceC1020p;
import h3.m;
import i0.C1048c;
import java.util.List;
import java.util.Map;
import u0.g;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class GameHistoryActivity extends AbstractActivityC0911o implements b {

    /* renamed from: J, reason: collision with root package name */
    private g f11626J;

    /* renamed from: K, reason: collision with root package name */
    private C0935D f11627K;

    /* renamed from: M, reason: collision with root package name */
    private boolean f11629M;

    /* renamed from: L, reason: collision with root package name */
    private boolean f11628L = true;

    /* renamed from: N, reason: collision with root package name */
    private int f11630N = -1;

    public static final class a implements SeekBar.OnSeekBarChangeListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f11631a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameHistoryActivity f11632b;

        a(TextView textView, GameHistoryActivity gameHistoryActivity) {
            this.f11631a = textView;
            this.f11632b = gameHistoryActivity;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i4, boolean z4) {
            if (z4) {
                this.f11631a.setText(String.valueOf(i4 + GameHistoryActivity.k3(this.f11632b).h1()));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    private final void A3() {
        C0935D c0935d = this.f11627K;
        C0935D c0935d2 = null;
        if (c0935d == null) {
            m.r("binding");
            c0935d = null;
        }
        c0935d.f15316h.setVisibility(this.f11630N == -1 ? 8 : 0);
        C0935D c0935d3 = this.f11627K;
        if (c0935d3 == null) {
            m.r("binding");
            c0935d3 = null;
        }
        TextView textView = c0935d3.f15314f;
        C0935D c0935d4 = this.f11627K;
        if (c0935d4 == null) {
            m.r("binding");
            c0935d4 = null;
        }
        textView.setVisibility(c0935d4.f15316h.getVisibility() ^ 8);
        C0935D c0935d5 = this.f11627K;
        if (c0935d5 == null) {
            m.r("binding");
            c0935d5 = null;
        }
        TextView textView2 = c0935d5.f15311c;
        C0935D c0935d6 = this.f11627K;
        if (c0935d6 == null) {
            m.r("binding");
        } else {
            c0935d2 = c0935d6;
        }
        textView2.setVisibility(c0935d2.f15314f.getVisibility());
    }

    public static final /* synthetic */ cab.shashki.app.ui.history.a k3(GameHistoryActivity gameHistoryActivity) {
        return (cab.shashki.app.ui.history.a) gameHistoryActivity.V2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u m3(cab.shashki.app.ui.history.a aVar, int i4) {
        aVar.S1(i4);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(C0935D c0935d, View view) {
        c0935d.f15312d.f15327f.setRotate(!r0.s1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(GameHistoryActivity gameHistoryActivity, View view) {
        ((cab.shashki.app.ui.history.a) gameHistoryActivity.V2()).T1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(GameHistoryActivity gameHistoryActivity, View view) {
        ((cab.shashki.app.ui.history.a) gameHistoryActivity.V2()).P1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(GameHistoryActivity gameHistoryActivity, View view) {
        ((cab.shashki.app.ui.history.a) gameHistoryActivity.V2()).O1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(GameHistoryActivity gameHistoryActivity, View view) {
        ((cab.shashki.app.ui.history.a) gameHistoryActivity.V2()).Y1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(GameHistoryActivity gameHistoryActivity, View view) {
        ((cab.shashki.app.ui.history.a) gameHistoryActivity.V2()).N1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(GameHistoryActivity gameHistoryActivity, View view) {
        gameHistoryActivity.x3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(C0935D c0935d, GameHistoryActivity gameHistoryActivity, View view) {
        if (c0935d.f15316h.getVisibility() != 0 && c0935d.f15314f.getVisibility() != 0) {
            gameHistoryActivity.f11629M = true;
            gameHistoryActivity.A3();
        } else {
            gameHistoryActivity.f11629M = false;
            c0935d.f15316h.setVisibility(8);
            c0935d.f15314f.setVisibility(8);
            c0935d.f15311c.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(androidx.appcompat.app.a aVar, DialogInterface dialogInterface) {
        TextView textView = (TextView) aVar.findViewById(R.id.message);
        if (textView != null) {
            textView.setTextIsSelectable(true);
        }
    }

    private final void x3() {
        C0994t c0994tD = C0994t.d(getLayoutInflater());
        m.d(c0994tD, "inflate(...)");
        TextView textView = c0994tD.f15886c;
        m.d(textView, "tvDepth");
        final SeekBar seekBar = c0994tD.f15885b;
        m.d(seekBar, "seekDepth");
        textView.setText(String.valueOf(seekBar.getProgress() + ((cab.shashki.app.ui.history.a) V2()).h1()));
        seekBar.setOnSeekBarChangeListener(new a(textView, this));
        new a.C0075a(this).w(c0994tD.a()).q(R.string.ok, new DialogInterface.OnClickListener() { // from class: I0.X
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                GameHistoryActivity.y3(this.f1604b, seekBar, dialogInterface, i4);
            }
        }).k(R.string.cancel, null).x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(GameHistoryActivity gameHistoryActivity, SeekBar seekBar, DialogInterface dialogInterface, int i4) {
        ((cab.shashki.app.ui.history.a) gameHistoryActivity.V2()).X1(seekBar.getProgress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u z3(GameHistoryActivity gameHistoryActivity, androidx.appcompat.app.a aVar, int i4, int i5) {
        ((cab.shashki.app.ui.history.a) gameHistoryActivity.V2()).U1(i4, i5);
        aVar.dismiss();
        return u.f3817a;
    }

    @Override // cab.shashki.app.ui.history.b
    public void J1(boolean z4) {
        ImageView imageViewD2 = D2();
        if (imageViewD2 != null) {
            imageViewD2.setImageResource(AbstractC0918v.f14762c3);
        }
        ImageView imageViewD22 = D2();
        if (imageViewD22 != null) {
            imageViewD22.setVisibility(z4 ? 0 : 8);
        }
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L
    protected void L2() {
        final androidx.appcompat.app.a aVarA = new a.C0075a(this).i(((cab.shashki.app.ui.history.a) V2()).B1()).q(R.string.ok, null).a();
        aVarA.setOnShowListener(new DialogInterface.OnShowListener() { // from class: I0.Y
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                GameHistoryActivity.w3(aVarA, dialogInterface);
            }
        });
        aVarA.show();
    }

    @Override // cab.shashki.app.ui.history.b
    public void P1(boolean z4) {
        if (this.f11628L) {
            C0935D c0935d = this.f11627K;
            if (c0935d == null) {
                m.r("binding");
                c0935d = null;
            }
            c0935d.f15312d.f15327f.setRotate(z4);
            this.f11628L = false;
        }
    }

    @Override // cab.shashki.app.ui.history.b
    public void Q(int i4) {
        C0935D c0935d = this.f11627K;
        if (c0935d == null) {
            m.r("binding");
            c0935d = null;
        }
        ProgressBar progressBar = c0935d.f15312d.f15329h;
        if (i4 == -1) {
            progressBar.setVisibility(8);
            return;
        }
        if (i4 == -2) {
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
        } else {
            progressBar.setIndeterminate(false);
            progressBar.setVisibility(0);
            progressBar.setProgress(i4);
        }
    }

    @Override // cab.shashki.app.ui.history.b
    public void R(b.a aVar) {
        m.e(aVar, "ext");
        C0935D c0935d = this.f11627K;
        if (c0935d == null) {
            m.r("binding");
            c0935d = null;
        }
        c0935d.f15312d.f15331j.setText(aVar.c());
        g gVar = this.f11626J;
        if (gVar == null) {
            m.r("adapter");
            gVar = null;
        }
        gVar.L(aVar.d());
        C0935D c0935d2 = this.f11627K;
        if (c0935d2 == null) {
            m.r("binding");
            c0935d2 = null;
        }
        C0952V c0952v = c0935d2.f15312d.f15323b;
        if (aVar.b() == null) {
            c0952v.f15571i.setVisibility(8);
        } else {
            c0952v.f15571i.setVisibility(0);
            c0952v.f15571i.setText(aVar.b());
        }
        c0952v.f15572j.setVisibility(aVar.a() == null ? 8 : 0);
        C1048c c1048cA = aVar.a();
        Object objValueOf = c1048cA != null ? Integer.valueOf(c1048cA.j()) : null;
        if (objValueOf == null) {
            c0952v.f15566d.setVisibility(8);
            c0952v.f15567e.setVisibility(8);
        } else {
            c0952v.f15566d.setVisibility(0);
            c0952v.f15567e.setVisibility(0);
            c0952v.f15567e.setText(getString(AbstractC0888D.f14532q, objValueOf, Integer.valueOf(aVar.a().h())));
        }
        C1048c c1048cA2 = aVar.a();
        Integer numValueOf = c1048cA2 != null ? Integer.valueOf(c1048cA2.c()) : null;
        if (numValueOf == null || numValueOf.intValue() == Integer.MIN_VALUE) {
            c0952v.f15564b.setVisibility(8);
            c0952v.f15565c.setVisibility(8);
        } else {
            c0952v.f15564b.setVisibility(0);
            c0952v.f15565c.setVisibility(0);
            c0952v.f15565c.setText(getString(AbstractC0888D.f14532q, numValueOf, Integer.valueOf(aVar.a().b())));
        }
        C1048c c1048cA3 = aVar.a();
        Integer numValueOf2 = c1048cA3 != null ? Integer.valueOf(c1048cA3.k()) : null;
        if (numValueOf2 == null || numValueOf2.intValue() == Integer.MIN_VALUE) {
            c0952v.f15570h.setVisibility(8);
        } else {
            c0952v.f15570h.setVisibility(0);
            c0952v.f15570h.setText(getString(AbstractC0888D.f14527p, numValueOf2));
        }
        C1048c c1048cA4 = aVar.a();
        Object objG = c1048cA4 != null ? c1048cA4.g() : null;
        if (objG == null || aVar.a().e() == null) {
            c0952v.f15568f.setVisibility(8);
        } else {
            c0952v.f15568f.setVisibility(0);
            c0952v.f15568f.setText(getString(AbstractC0888D.f14522o, objG, Integer.valueOf(aVar.a().l()), aVar.a().e()));
        }
    }

    @Override // cab.shashki.app.ui.history.b
    public void R1(int i4) {
        g gVar = this.f11626J;
        if (gVar == null) {
            m.r("adapter");
            gVar = null;
        }
        gVar.J(i4);
        this.f11630N = i4;
        if (this.f11629M) {
            A3();
        }
    }

    @Override // cab.shashki.app.ui.history.b
    public void d0(List list, int i4, int i5) {
        m.e(list, "moves");
        g gVar = this.f11626J;
        C0935D c0935d = null;
        if (gVar == null) {
            m.r("adapter");
            gVar = null;
        }
        gVar.K(list, i4, i5);
        C0935D c0935d2 = this.f11627K;
        if (c0935d2 == null) {
            m.r("binding");
            c0935d2 = null;
        }
        RecyclerView.p layoutManager = c0935d2.f15312d.f15324c.getLayoutManager();
        GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
        if (gridLayoutManager != null && gridLayoutManager.V2() > 1) {
            gridLayoutManager.c3(i5);
        }
        C0935D c0935d3 = this.f11627K;
        if (c0935d3 == null) {
            m.r("binding");
        } else {
            c0935d = c0935d3;
        }
        c0935d.f15312d.f15323b.a().setVisibility(i5 > 2 ? 8 : 0);
    }

    @Override // cab.shashki.app.ui.history.b
    public void g(boolean z4) {
        C0935D c0935d = this.f11627K;
        if (c0935d == null) {
            m.r("binding");
            c0935d = null;
        }
        c0935d.f15313e.setVisibility(z4 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: l3, reason: merged with bridge method [inline-methods] */
    public void S2(final cab.shashki.app.ui.history.a aVar) {
        m.e(aVar, "presenter");
        super.S2(aVar);
        this.f11626J = new g(new InterfaceC1016l() { // from class: I0.N
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return GameHistoryActivity.m3(aVar, ((Integer) obj).intValue());
            }
        });
        C0935D c0935d = this.f11627K;
        g gVar = null;
        if (c0935d == null) {
            m.r("binding");
            c0935d = null;
        }
        RecyclerView recyclerView = c0935d.f15312d.f15324c;
        g gVar2 = this.f11626J;
        if (gVar2 == null) {
            m.r("adapter");
        } else {
            gVar = gVar2;
        }
        recyclerView.setAdapter(gVar);
    }

    @Override // cab.shashki.app.ui.history.b
    public void m0(boolean z4) {
        C0935D c0935d = this.f11627K;
        if (c0935d == null) {
            m.r("binding");
            c0935d = null;
        }
        c0935d.f15310b.setVisibility(z4 ? 0 : 8);
    }

    @Override // cab.shashki.app.ui.history.b
    public void n(List list, int i4, cab.shashki.app.db.entities.a aVar) {
        m.e(list, "nodes");
        HistoryGraphView historyGraphView = new HistoryGraphView(this);
        historyGraphView.g(list, i4, aVar);
        final androidx.appcompat.app.a aVarX = new a.C0075a(this).w(historyGraphView).k(R.string.cancel, null).x();
        historyGraphView.setListener(new InterfaceC1020p() { // from class: I0.O
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return GameHistoryActivity.z3(this.f1562d, aVarX, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: n3, reason: merged with bridge method [inline-methods] */
    public cab.shashki.app.ui.history.a U2() {
        return new cab.shashki.app.ui.history.a(this, getIntent().getIntExtra(HalmaParams.ID, -1));
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0935D c0935dD = C0935D.d(getLayoutInflater());
        this.f11627K = c0935dD;
        C0573k c0573k = C0573k.f2973a;
        final C0935D c0935d = null;
        if (c0935dD == null) {
            m.r("binding");
            c0935dD = null;
        }
        LinearLayout linearLayout = c0935dD.f15315g;
        m.d(linearLayout, "panel");
        C0573k.s(c0573k, linearLayout, 0, 1, null);
        C0935D c0935d2 = this.f11627K;
        if (c0935d2 == null) {
            m.r("binding");
            c0935d2 = null;
        }
        setContentView(c0935d2.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.f14573y0, false, 2, null);
        C0935D c0935d3 = this.f11627K;
        if (c0935d3 == null) {
            m.r("binding");
        } else {
            c0935d = c0935d3;
        }
        c0935d.f15312d.f15324c.setLayoutManager(new GridLayoutManager(this, getResources().getInteger(AbstractC0921y.f15123b)));
        c0935d.f15312d.f15330i.setTypeface(h.g(this, AbstractC0919w.f14878a));
        c0935d.f15312d.f15327f.setTouchControl(false);
        c0935d.f15312d.f15327f.setOnClickListener(new View.OnClickListener() { // from class: I0.M
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameHistoryActivity.o3(c0935d, view);
            }
        });
        c0935d.f15313e.setOnClickListener(new View.OnClickListener() { // from class: I0.P
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameHistoryActivity.p3(this.f1566b, view);
            }
        });
        c0935d.f15312d.f15328g.setOnClickListener(new View.OnClickListener() { // from class: I0.Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameHistoryActivity.q3(this.f1568b, view);
            }
        });
        c0935d.f15312d.f15326e.setOnClickListener(new View.OnClickListener() { // from class: I0.S
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameHistoryActivity.r3(this.f1573b, view);
            }
        });
        c0935d.f15316h.setOnClickListener(new View.OnClickListener() { // from class: I0.T
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameHistoryActivity.s3(this.f1577b, view);
            }
        });
        c0935d.f15314f.setOnClickListener(new View.OnClickListener() { // from class: I0.U
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameHistoryActivity.t3(this.f1594b, view);
            }
        });
        c0935d.f15311c.setOnClickListener(new View.OnClickListener() { // from class: I0.V
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameHistoryActivity.u3(this.f1597b, view);
            }
        });
        c0935d.f15310b.setOnClickListener(new View.OnClickListener() { // from class: I0.W
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GameHistoryActivity.v3(c0935d, this, view);
            }
        });
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((cab.shashki.app.ui.history.a) V2()).v0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((cab.shashki.app.ui.history.a) V2()).i1(this);
    }

    @Override // cab.shashki.app.ui.history.b
    public void u1(C0843z.a aVar) {
        m.e(aVar, "params");
        C0935D c0935d = this.f11627K;
        if (c0935d == null) {
            m.r("binding");
            c0935d = null;
        }
        ShashkiBoardView shashkiBoardView = c0935d.f15312d.f15327f;
        shashkiBoardView.setListener((W) V2());
        shashkiBoardView.setGridMode(aVar.d());
        shashkiBoardView.P1(aVar.e());
        List listB = aVar.b();
        if (listB == null) {
            listB = p.g();
        }
        List listC = aVar.c();
        if (listC == null) {
            listC = p.g();
        }
        List listF = aVar.f();
        if (listF == null) {
            listF = p.g();
        }
        shashkiBoardView.H1(listB, listC, listF);
        shashkiBoardView.D1(aVar.g(), aVar.a());
    }

    @Override // cab.shashki.app.ui.history.b
    public void x0(b.C0152b c0152b) {
        m.e(c0152b, "pam");
        C0935D c0935d = this.f11627K;
        if (c0935d == null) {
            m.r("binding");
            c0935d = null;
        }
        C0936E c0936e = c0935d.f15312d;
        if (c0152b.c() == null) {
            c0936e.f15327f.setPosition(c0152b.e());
            return;
        }
        if (c0152b.d()) {
            c0936e.f15327f.q1();
            int size = c0152b.c().d().size() - 1;
            int i4 = 0;
            while (i4 < size) {
                ShashkiBoardView shashkiBoardView = c0936e.f15327f;
                String str = (String) c0152b.c().d().get(i4);
                i4++;
                ShashkiBoardView.H2(shashkiBoardView, str, (String) c0152b.c().d().get(i4), false, 4, null);
            }
            Map mapJ = c0152b.c().j();
            if (mapJ != null) {
                c0936e.f15327f.J2(mapJ);
            }
        }
        c0936e.f15327f.setPosition(c0152b.e());
        ShashkiBoardView shashkiBoardView2 = c0936e.f15327f;
        K.c cVarC = c0152b.c();
        List listA = c0152b.a();
        m.b(listA);
        shashkiBoardView2.N1(cVarC, listA);
        if (c0152b.b() < 0) {
            c0936e.f15330i.setVisibility(8);
            return;
        }
        TextView textView = c0936e.f15330i;
        textView.setText(C0275c.f1031a.m(Integer.valueOf(textView.getCurrentTextColor()), c0152b.e(), Integer.valueOf(c0152b.b()), null));
        c0936e.f15330i.setVisibility(0);
    }

    @Override // cab.shashki.app.ui.history.b
    public void x1(boolean z4) {
        C0935D c0935d = this.f11627K;
        if (c0935d == null) {
            m.r("binding");
            c0935d = null;
        }
        c0935d.f15312d.f15328g.setVisibility(z4 ? 0 : 4);
    }

    @Override // cab.shashki.app.ui.history.b
    public void z1(boolean z4) {
        C0935D c0935d = this.f11627K;
        if (c0935d == null) {
            m.r("binding");
            c0935d = null;
        }
        c0935d.f15312d.f15326e.setVisibility(z4 ? 0 : 4);
    }
}