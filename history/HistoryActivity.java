package cab.shashki.app.ui.history;

import D0.C0266y0;
import I0.T1;
import I0.V1;
import I0.Z1;
import N0.A;
import N0.C0573k;
import T2.l;
import T2.u;
import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.app.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.f;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.ui.history.HistoryActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.Snackbar;
import e2.C0873a;
import e2.C0874b;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractC0918v;
import f0.AbstractC0922z;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0940I;
import g0.C0976j0;
import g3.InterfaceC1005a;
import g3.InterfaceC1016l;
import h3.h;
import h3.m;
import i0.C1056k;
import i0.C1057l;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import u0.k;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class HistoryActivity extends AbstractActivityC0911o implements V1 {

    /* renamed from: P, reason: collision with root package name */
    public static final a f11633P = new a(null);

    /* renamed from: Q, reason: collision with root package name */
    private static final l[] f11634Q = {new l(Integer.valueOf(AbstractC0888D.t5), 0), new l(Integer.valueOf(AbstractC0888D.M5), 20), new l(Integer.valueOf(AbstractC0888D.k6), 25), new l(Integer.valueOf(AbstractC0888D.k5), 26), new l(Integer.valueOf(AbstractC0888D.s5), 21), new l(Integer.valueOf(AbstractC0888D.f6), 23), new l(Integer.valueOf(AbstractC0888D.v6), 31), new l(Integer.valueOf(AbstractC0888D.x6), 30), new l(Integer.valueOf(AbstractC0888D.o5), 27), new l(Integer.valueOf(AbstractC0888D.D5), 40), new l(Integer.valueOf(AbstractC0888D.g6), 28), new l(Integer.valueOf(AbstractC0888D.N5), 22), new l(Integer.valueOf(AbstractC0888D.B5), 29), new l(Integer.valueOf(AbstractC0888D.j6), 50)};

    /* renamed from: J, reason: collision with root package name */
    private k f11635J;

    /* renamed from: K, reason: collision with root package name */
    private C0940I f11636K;

    /* renamed from: L, reason: collision with root package name */
    private BottomSheetBehavior f11637L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f11638M;

    /* renamed from: N, reason: collision with root package name */
    private int f11639N;

    /* renamed from: O, reason: collision with root package name */
    private androidx.appcompat.app.a f11640O;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b extends h3.l implements InterfaceC1016l {
        b(Object obj) {
            super(1, obj, k.class, "deleteItem", "deleteItem(I)V", 0);
        }

        public final void m(int i4) {
            ((k) this.f16244e).J(i4);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m(((Number) obj).intValue());
            return u.f3817a;
        }
    }

    /* synthetic */ class c extends h3.l implements InterfaceC1016l {
        c(Object obj) {
            super(1, obj, k.class, "showItem", "showItem(I)V", 0);
        }

        public final void m(int i4) {
            ((k) this.f16244e).Q(i4);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m(((Number) obj).intValue());
            return u.f3817a;
        }
    }

    public static final class d extends BottomSheetBehavior.g {
        d() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(View view, float f4) {
            m.e(view, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, int i4) {
            m.e(view, "bottomSheet");
            C0940I c0940i = null;
            if (i4 != 3) {
                C0940I c0940i2 = HistoryActivity.this.f11636K;
                if (c0940i2 == null) {
                    m.r("binding");
                } else {
                    c0940i = c0940i2;
                }
                c0940i.f15385j.setVisibility(8);
                return;
            }
            C0940I c0940i3 = HistoryActivity.this.f11636K;
            if (c0940i3 == null) {
                m.r("binding");
                c0940i3 = null;
            }
            c0940i3.f15385j.setVisibility(0);
            C0940I c0940i4 = HistoryActivity.this.f11636K;
            if (c0940i4 == null) {
                m.r("binding");
            } else {
                c0940i = c0940i4;
            }
            c0940i.f15385j.animate().alpha(1.0f).setDuration(200L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A3(HistoryActivity historyActivity, DialogInterface dialogInterface, int i4) {
        ((T1) historyActivity.V2()).Z1();
    }

    private final void B3() {
        ClipData primaryClip;
        ClipData.Item itemAt;
        C0940I c0940i = this.f11636K;
        CharSequence text = null;
        if (c0940i == null) {
            m.r("binding");
            c0940i = null;
        }
        C0976j0 c0976j0 = c0940i.f15386k;
        c0976j0.f15714f.setText(getString(AbstractC0888D.f14371G0));
        c0976j0.f15713e.setEnabled(true);
        c0976j0.f15712d.setVisibility(8);
        c0976j0.f15711c.setVisibility(Build.VERSION.SDK_INT < 19 ? 8 : 0);
        ImageView imageView = c0976j0.f15710b;
        Object systemService = getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null && (primaryClip = clipboardManager.getPrimaryClip()) != null) {
            if (!(primaryClip.getItemCount() > 0)) {
                primaryClip = null;
            }
            if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null) {
                text = itemAt.getText();
            }
        }
        imageView.setVisibility(text != null ? 0 : 8);
        BottomSheetBehavior bottomSheetBehavior = this.f11637L;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.y0(3);
        }
    }

    private final void C3() {
        C0940I c0940i = this.f11636K;
        if (c0940i == null) {
            m.r("binding");
            c0940i = null;
        }
        C0976j0 c0976j0 = c0940i.f15386k;
        c0976j0.f15713e.setEnabled(false);
        c0976j0.f15710b.setVisibility(8);
        c0976j0.f15711c.setVisibility(8);
        c0976j0.f15712d.setVisibility(0);
    }

    private final void D3(boolean z4) {
        C0940I c0940i = this.f11636K;
        C0940I c0940i2 = null;
        if (c0940i == null) {
            m.r("binding");
            c0940i = null;
        }
        c0940i.f15379d.setVisibility(z4 ? 8 : 0);
        C0940I c0940i3 = this.f11636K;
        if (c0940i3 == null) {
            m.r("binding");
            c0940i3 = null;
        }
        c0940i3.f15387l.setVisibility(z4 ? 0 : 8);
        C0940I c0940i4 = this.f11636K;
        if (c0940i4 == null) {
            m.r("binding");
            c0940i4 = null;
        }
        ImageView imageView = c0940i4.f15384i;
        C0940I c0940i5 = this.f11636K;
        if (c0940i5 == null) {
            m.r("binding");
            c0940i5 = null;
        }
        imageView.setVisibility(c0940i5.f15387l.getVisibility());
        C0940I c0940i6 = this.f11636K;
        if (c0940i6 == null) {
            m.r("binding");
            c0940i6 = null;
        }
        ImageView imageView2 = c0940i6.f15383h;
        C0940I c0940i7 = this.f11636K;
        if (c0940i7 == null) {
            m.r("binding");
            c0940i7 = null;
        }
        imageView2.setVisibility(c0940i7.f15387l.getVisibility());
        C0940I c0940i8 = this.f11636K;
        if (c0940i8 == null) {
            m.r("binding");
        } else {
            c0940i2 = c0940i8;
        }
        c0940i2.f15377b.animate().rotation(z4 ? 45.0f : 0.0f).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(A2.c cVar, HistoryActivity historyActivity, C1056k c1056k, View view) {
        cVar.e();
        k kVar = historyActivity.f11635J;
        if (kVar == null) {
            m.r("adapter");
            kVar = null;
        }
        kVar.K(c1056k);
    }

    private final void o3() {
        C0940I c0940i = this.f11636K;
        C0940I c0940i2 = null;
        if (c0940i == null) {
            m.r("binding");
            c0940i = null;
        }
        C0976j0 c0976j0 = c0940i.f15386k;
        BottomSheetBehavior bottomSheetBehaviorC0 = BottomSheetBehavior.c0(c0976j0.a());
        this.f11637L = bottomSheetBehaviorC0;
        if (bottomSheetBehaviorC0 != null) {
            bottomSheetBehaviorC0.y0(5);
        }
        Spinner spinner = c0976j0.f15713e;
        int i4 = AbstractC0922z.f15220r0;
        l[] lVarArr = f11634Q;
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (l lVar : lVarArr) {
            arrayList.add(getString(((Number) lVar.c()).intValue()));
        }
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(this, i4, R.id.text1, arrayList));
        C0573k c0573k = C0573k.f2973a;
        Spinner spinner2 = c0976j0.f15713e;
        m.d(spinner2, "pdnSpinner");
        c0573k.z(spinner2, new InterfaceC1016l() { // from class: I0.Q0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return HistoryActivity.p3(this.f1569d, ((Integer) obj).intValue());
            }
        });
        c0976j0.f15710b.setOnClickListener(new View.OnClickListener() { // from class: I0.R0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.q3(this.f1571b, view);
            }
        });
        c0976j0.f15711c.setOnClickListener(new View.OnClickListener() { // from class: I0.S0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.r3(this.f1574b, view);
            }
        });
        C0940I c0940i3 = this.f11636K;
        if (c0940i3 == null) {
            m.r("binding");
        } else {
            c0940i2 = c0940i3;
        }
        c0940i2.f15385j.setOnClickListener(new View.OnClickListener() { // from class: I0.T0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.s3(this.f1578b, view);
            }
        });
        BottomSheetBehavior bottomSheetBehavior = this.f11637L;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.S(new d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u p3(HistoryActivity historyActivity, int i4) {
        historyActivity.f11639N = ((Number) f11634Q[i4].d()).intValue();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(HistoryActivity historyActivity, View view) {
        ((T1) historyActivity.V2()).L1(historyActivity.f11639N);
        historyActivity.C3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(HistoryActivity historyActivity, View view) {
        ((T1) historyActivity.V2()).Q1(historyActivity.f11639N);
        historyActivity.C3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(HistoryActivity historyActivity, View view) {
        BottomSheetBehavior bottomSheetBehavior = historyActivity.f11637L;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.y0(5);
        }
    }

    private final void t3() {
        C0940I c0940i = this.f11636K;
        C0940I c0940i2 = null;
        if (c0940i == null) {
            m.r("binding");
            c0940i = null;
        }
        c0940i.f15387l.setOnClickListener(new View.OnClickListener() { // from class: I0.M0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.x3(this.f1556b, view);
            }
        });
        C0940I c0940i3 = this.f11636K;
        if (c0940i3 == null) {
            m.r("binding");
            c0940i3 = null;
        }
        c0940i3.f15379d.setOnClickListener(new View.OnClickListener() { // from class: I0.N0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.u3(this.f1559b, view);
            }
        });
        C0940I c0940i4 = this.f11636K;
        if (c0940i4 == null) {
            m.r("binding");
            c0940i4 = null;
        }
        c0940i4.f15383h.setOnClickListener(new View.OnClickListener() { // from class: I0.O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.v3(this.f1564b, view);
            }
        });
        C0940I c0940i5 = this.f11636K;
        if (c0940i5 == null) {
            m.r("binding");
        } else {
            c0940i2 = c0940i5;
        }
        c0940i2.f15384i.setOnClickListener(new View.OnClickListener() { // from class: I0.P0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.w3(this.f1567b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(HistoryActivity historyActivity, View view) {
        ((T1) historyActivity.V2()).R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(HistoryActivity historyActivity, View view) {
        ((T1) historyActivity.V2()).e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(HistoryActivity historyActivity, View view) {
        historyActivity.B3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(HistoryActivity historyActivity, View view) {
        C0873a c0873a = new C0873a(historyActivity);
        c0873a.j("QR_CODE");
        c0873a.l(8);
        c0873a.k(false);
        c0873a.i(false);
        c0873a.a("CHARACTER_SET", p3.d.f18875g.toString());
        c0873a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(HistoryActivity historyActivity, View view) {
        boolean z4 = !historyActivity.f11638M;
        historyActivity.f11638M = z4;
        historyActivity.D3(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u z3(C1057l c1057l, HistoryActivity historyActivity) {
        if (Build.VERSION.SDK_INT < 19) {
            return u.f3817a;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.setType("application/vnd.chess-pgn");
        intent.putExtra("android.intent.extra.TITLE", cab.shashki.app.service.b.f10603a.w(Integer.valueOf(c1057l.c().d())) == AbstractC0888D.t5 ? "game.pgn" : "game.pdn");
        intent.addCategory("android.intent.category.OPENABLE");
        historyActivity.startActivityForResult(intent, 2);
        return u.f3817a;
    }

    @Override // I0.V1
    public void A1(boolean z4) {
        C0940I c0940i = this.f11636K;
        if (c0940i == null) {
            m.r("binding");
            c0940i = null;
        }
        c0940i.f15379d.setImageResource(z4 ? AbstractC0918v.L3 : AbstractC0918v.K3);
    }

    @Override // I0.V1
    public void B1() {
        androidx.appcompat.app.a aVar = this.f11640O;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f11640O = null;
    }

    @Override // I0.V1
    public void C1(List list, boolean z4) {
        m.e(list, "gameElements");
        C0940I c0940i = this.f11636K;
        k kVar = null;
        C0940I c0940i2 = null;
        if (c0940i == null) {
            m.r("binding");
            c0940i = null;
        }
        c0940i.f15381f.a().setVisibility(8);
        if (list.isEmpty()) {
            C0940I c0940i3 = this.f11636K;
            if (c0940i3 == null) {
                m.r("binding");
                c0940i3 = null;
            }
            c0940i3.f15378c.f15402b.setText(z4 ? AbstractC0888D.f14513m0 : AbstractC0888D.f14508l0);
            C0940I c0940i4 = this.f11636K;
            if (c0940i4 == null) {
                m.r("binding");
                c0940i4 = null;
            }
            c0940i4.f15378c.a().setVisibility(0);
            C0940I c0940i5 = this.f11636K;
            if (c0940i5 == null) {
                m.r("binding");
            } else {
                c0940i2 = c0940i5;
            }
            c0940i2.f15380e.setVisibility(8);
            return;
        }
        C0940I c0940i6 = this.f11636K;
        if (c0940i6 == null) {
            m.r("binding");
            c0940i6 = null;
        }
        c0940i6.f15378c.a().setVisibility(8);
        C0940I c0940i7 = this.f11636K;
        if (c0940i7 == null) {
            m.r("binding");
            c0940i7 = null;
        }
        c0940i7.f15380e.setVisibility(0);
        k kVar2 = this.f11635J;
        if (kVar2 == null) {
            m.r("adapter");
        } else {
            kVar = kVar2;
        }
        kVar.P(list);
    }

    @Override // I0.V1
    public void D1() {
        this.f11640O = new a.C0075a(this).w(getLayoutInflater().inflate(AbstractC0922z.f15228v0, (ViewGroup) null)).x();
    }

    @Override // I0.V1
    public void G0(C1056k c1056k) {
        m.e(c1056k, "game");
        k kVar = this.f11635J;
        if (kVar == null) {
            m.r("adapter");
            kVar = null;
        }
        kVar.K(c1056k);
        startActivity(new Intent(this, (Class<?>) GameHistoryActivity.class).putExtra(HalmaParams.ID, c1056k.i()));
    }

    @Override // I0.V1
    public void J0(final C1056k c1056k, final A2.c cVar) {
        m.e(c1056k, "game");
        m.e(cVar, "disposable");
        C0940I c0940i = this.f11636K;
        if (c0940i == null) {
            m.r("binding");
            c0940i = null;
        }
        Snackbar snackbarB0 = Snackbar.b0(c0940i.f15380e, AbstractC0888D.f14458b0, 2000);
        m.d(snackbarB0, "make(...)");
        snackbarB0.e0(R.string.cancel, new View.OnClickListener() { // from class: I0.K0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.n3(cVar, this, c1056k, view);
            }
        });
        snackbarB0.R();
    }

    @Override // I0.V1
    public void M1(List list, int i4, boolean z4) {
        m.e(list, "filterIdName");
        C0266y0.f523t0.a(list, i4, z4, (C0266y0.d) V2()).S4(g2(), "filter");
    }

    @Override // I0.V1
    public void O0(int i4) {
        C0940I c0940i = this.f11636K;
        if (c0940i == null) {
            m.r("binding");
            c0940i = null;
        }
        c0940i.f15386k.f15714f.setText(String.valueOf(i4));
    }

    @Override // I0.V1
    public void S(final C1057l c1057l) {
        m.e(c1057l, "element");
        try {
            A.f2883a.x(this, c1057l, new InterfaceC1005a() { // from class: I0.U0
                @Override // g3.InterfaceC1005a
                public final Object a() {
                    return HistoryActivity.z3(c1057l, this);
                }
            });
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    @Override // I0.V1
    public void S0() {
        new a.C0075a(this).h(AbstractC0888D.s4).q(AbstractC0888D.f14462c, new DialogInterface.OnClickListener() { // from class: I0.L0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                HistoryActivity.A3(this.f1553b, dialogInterface, i4);
            }
        }).k(R.string.cancel, null).x();
    }

    @Override // I0.V1
    public void V() {
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").addCategory("android.intent.category.OPENABLE").setType("*/*");
        m.d(type, "setType(...)");
        startActivityForResult(type, 4);
    }

    @Override // I0.V1
    public void Z() {
        k kVar = this.f11635J;
        if (kVar == null) {
            m.r("adapter");
            kVar = null;
        }
        kVar.m();
    }

    @Override // I0.V1
    public void i(int i4) {
        Snackbar.b0(findViewById(R.id.content), i4, -1).R();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: l3, reason: merged with bridge method [inline-methods] */
    public void S2(T1 t12) {
        m.e(t12, "presenter");
        super.S2(t12);
        this.f11635J = new k(t12, t12.C1());
        C0940I c0940i = this.f11636K;
        C0940I c0940i2 = null;
        if (c0940i == null) {
            m.r("binding");
            c0940i = null;
        }
        RecyclerView recyclerView = c0940i.f15380e;
        k kVar = this.f11635J;
        if (kVar == null) {
            m.r("adapter");
            kVar = null;
        }
        recyclerView.setAdapter(kVar);
        k kVar2 = this.f11635J;
        if (kVar2 == null) {
            m.r("adapter");
            kVar2 = null;
        }
        b bVar = new b(kVar2);
        k kVar3 = this.f11635J;
        if (kVar3 == null) {
            m.r("adapter");
            kVar3 = null;
        }
        f fVar = new f(new Z1(bVar, new c(kVar3)));
        C0940I c0940i3 = this.f11636K;
        if (c0940i3 == null) {
            m.r("binding");
        } else {
            c0940i2 = c0940i3;
        }
        fVar.m(c0940i2.f15380e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: m3, reason: merged with bridge method [inline-methods] */
    public T1 U2() {
        return new T1();
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) throws FileNotFoundException {
        Uri data;
        Uri data2;
        String strA;
        super.onActivityResult(i4, i5, intent);
        if (i4 == 8 && i5 == -1) {
            C0874b c0874bH = C0873a.h(i5, intent);
            if (c0874bH == null || (strA = c0874bH.a()) == null) {
                return;
            } else {
                ((T1) V2()).n2(strA);
            }
        }
        if (i4 == 2 && i5 == -1) {
            T1 t12 = (T1) V2();
            if (intent == null || (data2 = intent.getData()) == null) {
                return;
            } else {
                t12.i2(data2);
            }
        }
        if (i4 == 4) {
            T1 t13 = (T1) V2();
            if (intent == null || (data = intent.getData()) == null) {
                return;
            } else {
                t13.D1(i5, data);
            }
        }
        if (i4 != 3 || i5 == 0) {
            return;
        }
        ((T1) V2()).s(i5);
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0940I c0940iD = C0940I.d(getLayoutInflater());
        this.f11636K = c0940iD;
        C0940I c0940i = null;
        if (c0940iD == null) {
            m.r("binding");
            c0940iD = null;
        }
        setContentView(c0940iD.a());
        C0573k c0573k = C0573k.f2973a;
        C0940I c0940i2 = this.f11636K;
        if (c0940i2 == null) {
            m.r("binding");
            c0940i2 = null;
        }
        RecyclerView recyclerView = c0940i2.f15380e;
        m.d(recyclerView, "list");
        C0573k.v(c0573k, recyclerView, 0, 1, null);
        C0940I c0940i3 = this.f11636K;
        if (c0940i3 == null) {
            m.r("binding");
            c0940i3 = null;
        }
        LinearLayout linearLayout = c0940i3.f15382g;
        m.d(linearLayout, "panel");
        C0573k.s(c0573k, linearLayout, 0, 1, null);
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.y4, false, 2, null);
        o3();
        t3();
        C0940I c0940i4 = this.f11636K;
        if (c0940i4 == null) {
            m.r("binding");
        } else {
            c0940i = c0940i4;
        }
        c0940i.f15377b.setOnClickListener(new View.OnClickListener() { // from class: I0.J0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HistoryActivity.y3(this.f1540b, view);
            }
        });
        D3(this.f11638M);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((T1) V2()).v0(this);
    }

    @Override // android.app.Activity
    protected void onRestoreInstanceState(Bundle bundle) {
        m.e(bundle, "savedInstanceState");
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((T1) V2()).x1(this);
    }

    @Override // I0.V1
    public void q0(int i4) {
        startActivityForResult(new Intent(this, (Class<?>) FilterActivity.class).putExtra(HalmaParams.ID, i4), 3);
    }

    @Override // I0.V1
    public void r1() {
        BottomSheetBehavior bottomSheetBehavior = this.f11637L;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.y0(5);
        }
    }
}