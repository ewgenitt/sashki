package cab.shashki.app.ui.chess;

import N0.C0573k;
import T2.p;
import T2.u;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import cab.shashki.app.service.b;
import cab.shashki.app.ui.chess.StockNetActivity;
import com.google.android.material.snackbar.Snackbar;
import f0.AbstractC0888D;
import f0.AbstractC0918v;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0948Q;
import g3.InterfaceC1005a;
import g3.InterfaceC1016l;
import h3.h;
import h3.l;
import h3.m;
import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import q0.H;
import q0.InterfaceC1298w;
import q0.V;
import t0.C1383g;
import u0.r;
import x2.AbstractC1488f;
import z2.AbstractC1559a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class StockNetActivity extends AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L {

    /* renamed from: P */
    public static final a f10902P = new a(null);

    /* renamed from: I */
    private final H f10903I = new H(null, null, 3, null);

    /* renamed from: J */
    private final A2.b f10904J = new A2.b();

    /* renamed from: K */
    private boolean f10905K;

    /* renamed from: L */
    private String f10906L;

    /* renamed from: M */
    private String f10907M;

    /* renamed from: N */
    private r f10908N;

    /* renamed from: O */
    private C0948Q f10909O;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b extends l implements InterfaceC1016l {
        b(Object obj) {
            super(1, obj, StockNetActivity.class, "selectNet", "selectNet(Ljava/io/File;)V", 0);
        }

        public final void m(File file) {
            m.e(file, "p0");
            ((StockNetActivity) this.f16244e).F3(file);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((File) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class c extends l implements InterfaceC1016l {
        c(Object obj) {
            super(1, obj, StockNetActivity.class, "deleteNet", "deleteNet(Ljava/io/File;)V", 0);
        }

        public final void m(File file) {
            m.e(file, "p0");
            ((StockNetActivity) this.f16244e).o3(file);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((File) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class d extends l implements InterfaceC1005a {
        d(Object obj) {
            super(0, obj, StockNetActivity.class, "downloadDefaultNet", "downloadDefaultNet()V", 0);
        }

        @Override // g3.InterfaceC1005a
        public /* bridge */ /* synthetic */ Object a() {
            m();
            return u.f3817a;
        }

        public final void m() {
            ((StockNetActivity) this.f16244e).p3();
        }
    }

    /* synthetic */ class e extends l implements InterfaceC1016l {

        /* renamed from: m */
        public static final e f10910m = new e();

        e() {
            super(1, Throwable.class, "printStackTrace", "printStackTrace()V", 0);
        }

        public final void m(Throwable th) {
            m.e(th, "p0");
            th.printStackTrace();
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((Throwable) obj);
            return u.f3817a;
        }
    }

    public static final u A3(StockNetActivity stockNetActivity, Throwable th) {
        C0948Q c0948q = stockNetActivity.f10909O;
        if (c0948q == null) {
            m.r("binding");
            c0948q = null;
        }
        Snackbar.b0(c0948q.f15527e, AbstractC0888D.f14518n0, -1).R();
        return u.f3817a;
    }

    public static final void B3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    public static final u C3(StockNetActivity stockNetActivity, int i4) {
        r rVar = stockNetActivity.f10908N;
        if (rVar == null) {
            m.r("adapter");
            rVar = null;
        }
        stockNetActivity.o3(rVar.I(i4));
        return u.f3817a;
    }

    public static final void D3(StockNetActivity stockNetActivity, View view) {
        stockNetActivity.n3();
    }

    public static final void E3(StockNetActivity stockNetActivity, View view) {
        stockNetActivity.p3();
    }

    public final void F3(File file) {
        r rVar = null;
        if (file.length() == V.a.f18996h.e()) {
            r rVar2 = this.f10908N;
            if (rVar2 == null) {
                m.r("adapter");
            } else {
                rVar = rVar2;
            }
            rVar.O(file.getAbsolutePath());
            V.f18993a.r(file.getAbsolutePath());
            return;
        }
        r rVar3 = this.f10908N;
        if (rVar3 == null) {
            m.r("adapter");
        } else {
            rVar = rVar3;
        }
        rVar.N(file.getAbsolutePath());
        V.f18993a.q(file.getAbsolutePath());
    }

    private final void G3() {
        AbstractC1488f abstractC1488fW = AbstractC1488f.q(new Callable() { // from class: x0.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return StockNetActivity.H3();
            }
        }).H(S2.a.c()).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: x0.q
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return StockNetActivity.I3(this.f20315d, (T2.p) obj);
            }
        };
        C2.e eVar = new C2.e() { // from class: x0.r
            @Override // C2.e
            public final void accept(Object obj) {
                StockNetActivity.J3(interfaceC1016l, obj);
            }
        };
        final e eVar2 = e.f10910m;
        A2.c cVarD = abstractC1488fW.D(eVar, new C2.e() { // from class: x0.s
            @Override // C2.e
            public final void accept(Object obj) {
                StockNetActivity.K3(eVar2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, this.f10904J);
    }

    public static final p H3() {
        V v4 = V.f18993a;
        return new p(v4.c(), v4.k(), v4.n());
    }

    public static final u I3(StockNetActivity stockNetActivity, p pVar) {
        r rVar = stockNetActivity.f10908N;
        C0948Q c0948q = null;
        if (rVar == null) {
            m.r("adapter");
            rVar = null;
        }
        rVar.M((List) pVar.a(), (String) pVar.b(), (String) pVar.c());
        if (((List) pVar.a()).isEmpty()) {
            C0948Q c0948q2 = stockNetActivity.f10909O;
            if (c0948q2 == null) {
                m.r("binding");
                c0948q2 = null;
            }
            c0948q2.f15529g.setVisibility(0);
            C0948Q c0948q3 = stockNetActivity.f10909O;
            if (c0948q3 == null) {
                m.r("binding");
            } else {
                c0948q = c0948q3;
            }
            c0948q.f15525c.setVisibility(8);
        } else {
            C0948Q c0948q4 = stockNetActivity.f10909O;
            if (c0948q4 == null) {
                m.r("binding");
                c0948q4 = null;
            }
            c0948q4.f15529g.setVisibility(8);
            C0948Q c0948q5 = stockNetActivity.f10909O;
            if (c0948q5 == null) {
                m.r("binding");
            } else {
                c0948q = c0948q5;
            }
            c0948q.f15525c.setVisibility(0);
        }
        return u.f3817a;
    }

    public static final void J3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    public static final void K3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    private final void n3() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        try {
            startActivityForResult(Intent.createChooser(intent, getString(AbstractC0888D.Y4)), 3);
        } catch (Exception unused) {
            C0948Q c0948q = this.f10909O;
            if (c0948q == null) {
                m.r("binding");
                c0948q = null;
            }
            Snackbar.b0(c0948q.f15527e, AbstractC0888D.f14518n0, -1).R();
        }
    }

    public final void o3(File file) {
        if (V.f18993a.e(file)) {
            G3();
        }
    }

    public final void p3() {
        if (this.f10905K) {
            return;
        }
        this.f10905K = true;
        C0948Q c0948q = this.f10909O;
        C0948Q c0948q2 = null;
        if (c0948q == null) {
            m.r("binding");
            c0948q = null;
        }
        c0948q.f15524b.setVisibility(4);
        C0948Q c0948q3 = this.f10909O;
        if (c0948q3 == null) {
            m.r("binding");
        } else {
            c0948q2 = c0948q3;
        }
        c0948q2.f15526d.setVisibility(0);
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: x0.B
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return StockNetActivity.v3();
            }
        }).H(S2.a.c()).w(AbstractC1559a.a()).h(new C2.a() { // from class: x0.k
            @Override // C2.a
            public final void run() {
                StockNetActivity.q3(this.f20310a);
            }
        });
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: x0.l
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return StockNetActivity.r3(this.f20311d, (Boolean) obj);
            }
        };
        C2.e eVar = new C2.e() { // from class: x0.m
            @Override // C2.e
            public final void accept(Object obj) {
                StockNetActivity.s3(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: x0.n
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return StockNetActivity.t3(this.f20313d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fH.D(eVar, new C2.e() { // from class: x0.o
            @Override // C2.e
            public final void accept(Object obj) {
                StockNetActivity.u3(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, this.f10904J);
    }

    public static final void q3(StockNetActivity stockNetActivity) {
        stockNetActivity.f10905K = false;
        C0948Q c0948q = stockNetActivity.f10909O;
        C0948Q c0948q2 = null;
        if (c0948q == null) {
            m.r("binding");
            c0948q = null;
        }
        c0948q.f15524b.setVisibility(0);
        C0948Q c0948q3 = stockNetActivity.f10909O;
        if (c0948q3 == null) {
            m.r("binding");
        } else {
            c0948q2 = c0948q3;
        }
        c0948q2.f15526d.setVisibility(8);
        stockNetActivity.G3();
    }

    public static final u r3(StockNetActivity stockNetActivity, Boolean bool) {
        C0948Q c0948q = stockNetActivity.f10909O;
        if (c0948q == null) {
            m.r("binding");
            c0948q = null;
        }
        Snackbar.b0(c0948q.f15527e, bool.booleanValue() ? AbstractC0888D.f14478f0 : AbstractC0888D.f14518n0, -1).R();
        return u.f3817a;
    }

    public static final void s3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    public static final u t3(StockNetActivity stockNetActivity, Throwable th) {
        C0948Q c0948q = stockNetActivity.f10909O;
        if (c0948q == null) {
            m.r("binding");
            c0948q = null;
        }
        Snackbar.b0(c0948q.f15527e, AbstractC0888D.f14518n0, -1).R();
        return u.f3817a;
    }

    public static final void u3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    public static final Boolean v3() {
        return Boolean.valueOf(V.f18993a.j());
    }

    public static final u w3(Uri uri) {
        V.f18993a.p(uri);
        return u.f3817a;
    }

    public static final void x3(StockNetActivity stockNetActivity) {
        C0948Q c0948q = stockNetActivity.f10909O;
        C0948Q c0948q2 = null;
        if (c0948q == null) {
            m.r("binding");
            c0948q = null;
        }
        c0948q.f15524b.setVisibility(0);
        C0948Q c0948q3 = stockNetActivity.f10909O;
        if (c0948q3 == null) {
            m.r("binding");
        } else {
            c0948q2 = c0948q3;
        }
        c0948q2.f15526d.setVisibility(8);
        stockNetActivity.G3();
    }

    public static final u y3(StockNetActivity stockNetActivity, u uVar) {
        C0948Q c0948q = stockNetActivity.f10909O;
        if (c0948q == null) {
            m.r("binding");
            c0948q = null;
        }
        Snackbar.b0(c0948q.f15527e, AbstractC0888D.f14478f0, -1).R();
        return u.f3817a;
    }

    public static final void z3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L
    protected int K2() {
        return AbstractC0918v.f14762c3;
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L
    protected void L2() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/official-stockfish/Stockfish/commit/af110e0")));
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        final Uri data;
        super.onActivityResult(i4, i5, intent);
        if (i5 != -1 || i4 != 3 || intent == null || (data = intent.getData()) == null) {
            return;
        }
        C0948Q c0948q = this.f10909O;
        C0948Q c0948q2 = null;
        if (c0948q == null) {
            m.r("binding");
            c0948q = null;
        }
        c0948q.f15524b.setVisibility(4);
        C0948Q c0948q3 = this.f10909O;
        if (c0948q3 == null) {
            m.r("binding");
        } else {
            c0948q2 = c0948q3;
        }
        c0948q2.f15526d.setVisibility(0);
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: x0.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return StockNetActivity.w3(data);
            }
        }).H(S2.a.c()).w(AbstractC1559a.a()).h(new C2.a() { // from class: x0.t
            @Override // C2.a
            public final void run() {
                StockNetActivity.x3(this.f20318a);
            }
        });
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: x0.u
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return StockNetActivity.y3(this.f20319d, (T2.u) obj);
            }
        };
        C2.e eVar = new C2.e() { // from class: x0.v
            @Override // C2.e
            public final void accept(Object obj) {
                StockNetActivity.z3(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: x0.w
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return StockNetActivity.A3(this.f20321d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fH.D(eVar, new C2.e() { // from class: x0.x
            @Override // C2.e
            public final void accept(Object obj) {
                StockNetActivity.B3(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, this.f10904J);
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0948Q c0948qD = C0948Q.d(getLayoutInflater());
        this.f10909O = c0948qD;
        C0948Q c0948q = null;
        if (c0948qD == null) {
            m.r("binding");
            c0948qD = null;
        }
        setContentView(c0948qD.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.Y4, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        C0948Q c0948q2 = this.f10909O;
        if (c0948q2 == null) {
            m.r("binding");
            c0948q2 = null;
        }
        RecyclerView recyclerView = c0948q2.f15525c;
        m.d(recyclerView, "list");
        C0573k.v(c0573k, recyclerView, 0, 1, null);
        C0948Q c0948q3 = this.f10909O;
        if (c0948q3 == null) {
            m.r("binding");
            c0948q3 = null;
        }
        ImageView imageView = c0948q3.f15524b;
        m.d(imageView, "add");
        C0573k.s(c0573k, imageView, 0, 1, null);
        this.f10908N = new r(new b(this), new c(this), new d(this));
        C0948Q c0948q4 = this.f10909O;
        if (c0948q4 == null) {
            m.r("binding");
            c0948q4 = null;
        }
        RecyclerView recyclerView2 = c0948q4.f15525c;
        r rVar = this.f10908N;
        if (rVar == null) {
            m.r("adapter");
            rVar = null;
        }
        recyclerView2.setAdapter(rVar);
        C0948Q c0948q5 = this.f10909O;
        if (c0948q5 == null) {
            m.r("binding");
            c0948q5 = null;
        }
        RecyclerView recyclerView3 = c0948q5.f15525c;
        m.d(recyclerView3, "list");
        new C1383g.a(recyclerView3, null, new InterfaceC1016l() { // from class: x0.y
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return StockNetActivity.C3(this.f20323d, ((Integer) obj).intValue());
            }
        }, 2, null);
        C0948Q c0948q6 = this.f10909O;
        if (c0948q6 == null) {
            m.r("binding");
            c0948q6 = null;
        }
        c0948q6.f15524b.setOnClickListener(new View.OnClickListener() { // from class: x0.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StockNetActivity.D3(this.f20324b, view);
            }
        });
        C0948Q c0948q7 = this.f10909O;
        if (c0948q7 == null) {
            m.r("binding");
            c0948q7 = null;
        }
        c0948q7.f15529g.setText(AbstractC0888D.Z4);
        C0948Q c0948q8 = this.f10909O;
        if (c0948q8 == null) {
            m.r("binding");
        } else {
            c0948q = c0948q8;
        }
        c0948q.f15529g.setOnClickListener(new View.OnClickListener() { // from class: x0.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StockNetActivity.E3(this.f20279b, view);
            }
        });
        V v4 = V.f18993a;
        this.f10906L = v4.k();
        this.f10907M = v4.n();
        this.f10903I.g();
        G3();
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.appcompat.app.b, androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onDestroy() {
        InterfaceC1298w interfaceC1298wJ;
        InterfaceC1298w interfaceC1298wJ2;
        super.onDestroy();
        this.f10904J.d();
        InterfaceC1298w interfaceC1298wJ3 = this.f10903I.j();
        if (interfaceC1298wJ3 != null && interfaceC1298wJ3.a() == b.a.f10757j.c()) {
            V v4 = V.f18993a;
            String strK = v4.k();
            if (strK != null && !m.a(strK, this.f10906L) && (interfaceC1298wJ2 = this.f10903I.j()) != null) {
                interfaceC1298wJ2.f("uci_set", "EvalFile", strK);
            }
            String strN = v4.n();
            if (strN != null && !m.a(strN, this.f10907M) && (interfaceC1298wJ = this.f10903I.j()) != null) {
                interfaceC1298wJ.f("uci_set", "EvalFileSmall", strN);
            }
        }
        this.f10903I.k();
    }
}