package cab.shashki.app.ui.chess.fairy.builder.quick;

import N0.C0573k;
import T2.u;
import U2.p;
import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.B;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.ui.GridAutoLayoutManager;
import cab.shashki.app.ui.chess.fairy.builder.quick.QBuilderActivity;
import cab.shashki.app.ui.chess.fairy.builder.quick.e;
import cab.shashki.app.ui.chess.fairy.builder.quick.i;
import com.google.android.material.snackbar.Snackbar;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractC0918v;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0980l0;
import g3.InterfaceC1016l;
import g3.InterfaceC1020p;
import h3.m;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class QBuilderActivity extends AbstractActivityC0911o implements d {

    /* renamed from: M, reason: collision with root package name */
    public static final a f11048M = new a(null);

    /* renamed from: J, reason: collision with root package name */
    private C0980l0 f11049J;

    /* renamed from: K, reason: collision with root package name */
    private final e f11050K = new e(p.g(), 0, null, 6, null);

    /* renamed from: L, reason: collision with root package name */
    private final i f11051L = new i(p.g(), 0, false, null, 14, null);

    public static final class a {
        public /* synthetic */ a(h3.h hVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B3(QBuilderActivity qBuilderActivity, String[] strArr, DialogInterface dialogInterface, int i4) {
        ((k) qBuilderActivity.V2()).w2(strArr[i4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(QBuilderActivity qBuilderActivity, View view) {
        qBuilderActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/fairy-stockfish/Fairy-Stockfish/wiki/Variant-configuration")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(k kVar, View view) {
        kVar.R1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(k kVar, QBuilderActivity qBuilderActivity, View view) {
        C0980l0 c0980l0 = qBuilderActivity.f11049J;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        kVar.v2(c0980l0.f15743g.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u q3(k kVar, i.a aVar, int i4) {
        m.e(aVar, "i");
        kVar.a2(aVar, i4);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u r3(k kVar, e.a aVar, int i4) {
        m.e(aVar, "i");
        kVar.O1(aVar, i4);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(k kVar, View view) {
        kVar.G2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u t3(k kVar, String str) {
        m.e(str, "it");
        kVar.u2(str);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(k kVar, View view) {
        kVar.N1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(k kVar, View view) {
        kVar.Y1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(k kVar, View view) {
        kVar.b2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(k kVar, View view) {
        kVar.Z1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(k kVar, View view) {
        kVar.o2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z3(k kVar, View view) {
        kVar.h2();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: A3, reason: merged with bridge method [inline-methods] */
    public k U2() {
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("edit_id") : null;
        Intent intent2 = getIntent();
        String stringExtra2 = intent2 != null ? intent2.getStringExtra(HalmaParams.NAME) : null;
        Intent intent3 = getIntent();
        return new k(stringExtra, stringExtra2, intent3 != null ? intent3.getStringExtra("config") : null);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void B0(String str) {
        m.e(str, "text");
        C0980l0 c0980l0 = this.f11049J;
        C0980l0 c0980l02 = null;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15751o.setVisibility(8);
        C0980l0 c0980l03 = this.f11049J;
        if (c0980l03 == null) {
            m.r("binding");
            c0980l03 = null;
        }
        c0980l03.f15754r.setVisibility(8);
        C0980l0 c0980l04 = this.f11049J;
        if (c0980l04 == null) {
            m.r("binding");
            c0980l04 = null;
        }
        c0980l04.f15742f.setVisibility(8);
        C0980l0 c0980l05 = this.f11049J;
        if (c0980l05 == null) {
            m.r("binding");
            c0980l05 = null;
        }
        c0980l05.f15748l.setVisibility(0);
        C0980l0 c0980l06 = this.f11049J;
        if (c0980l06 == null) {
            m.r("binding");
            c0980l06 = null;
        }
        c0980l06.f15758v.setText(str);
        C0980l0 c0980l07 = this.f11049J;
        if (c0980l07 == null) {
            m.r("binding");
            c0980l07 = null;
        }
        c0980l07.f15750n.setImageResource(AbstractC0918v.J3);
        C0980l0 c0980l08 = this.f11049J;
        if (c0980l08 == null) {
            m.r("binding");
            c0980l08 = null;
        }
        c0980l08.f15749m.setVisibility(0);
        C0980l0 c0980l09 = this.f11049J;
        if (c0980l09 == null) {
            m.r("binding");
            c0980l09 = null;
        }
        c0980l09.f15752p.setVisibility(0);
        C0980l0 c0980l010 = this.f11049J;
        if (c0980l010 == null) {
            m.r("binding");
            c0980l010 = null;
        }
        c0980l010.f15744h.setVisibility(0);
        C0980l0 c0980l011 = this.f11049J;
        if (c0980l011 == null) {
            m.r("binding");
        } else {
            c0980l02 = c0980l011;
        }
        c0980l02.f15739c.setVisibility(8);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void C0(boolean z4) {
        C0980l0 c0980l0 = this.f11049J;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15755s.setVisibility(z4 ? 0 : 8);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void H(String str) {
        m.e(str, "text");
        C0980l0 c0980l0 = this.f11049J;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15747k.setText(str);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void H0(boolean z4) {
        C0980l0 c0980l0 = this.f11049J;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15746j.setVisibility(z4 ? 0 : 8);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void K(List list, int i4) {
        m.e(list, "list");
        this.f11051L.L(list);
        this.f11051L.M(i4);
        i iVar = this.f11051L;
        boolean z4 = false;
        if (!B.a(list) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((i.a) it.next()).c() >= 0) {
                    z4 = true;
                    break;
                }
            }
        }
        iVar.K(!z4);
        this.f11051L.m();
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void L() {
        C0980l0 c0980l0 = this.f11049J;
        C0980l0 c0980l02 = null;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15751o.setVisibility(8);
        C0980l0 c0980l03 = this.f11049J;
        if (c0980l03 == null) {
            m.r("binding");
            c0980l03 = null;
        }
        c0980l03.f15754r.setVisibility(8);
        C0980l0 c0980l04 = this.f11049J;
        if (c0980l04 == null) {
            m.r("binding");
            c0980l04 = null;
        }
        c0980l04.f15742f.setVisibility(0);
        C0980l0 c0980l05 = this.f11049J;
        if (c0980l05 == null) {
            m.r("binding");
        } else {
            c0980l02 = c0980l05;
        }
        c0980l02.f15748l.setVisibility(8);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void M() {
        C0980l0 c0980l0 = this.f11049J;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        Snackbar.b0(c0980l0.f15742f, AbstractC0888D.f14518n0, -1).R();
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void P(final String[] strArr) {
        m.e(strArr, "items");
        new a.C0075a(this).g(strArr, new DialogInterface.OnClickListener() { // from class: z0.u0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                QBuilderActivity.B3(this.f20862b, strArr, dialogInterface, i4);
            }
        }).k(R.string.cancel, null).x();
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void R0() {
        C0980l0 c0980l0 = this.f11049J;
        C0980l0 c0980l02 = null;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15751o.setVisibility(0);
        C0980l0 c0980l03 = this.f11049J;
        if (c0980l03 == null) {
            m.r("binding");
            c0980l03 = null;
        }
        c0980l03.f15754r.setVisibility(0);
        C0980l0 c0980l04 = this.f11049J;
        if (c0980l04 == null) {
            m.r("binding");
            c0980l04 = null;
        }
        c0980l04.f15742f.setVisibility(8);
        C0980l0 c0980l05 = this.f11049J;
        if (c0980l05 == null) {
            m.r("binding");
        } else {
            c0980l02 = c0980l05;
        }
        c0980l02.f15748l.setVisibility(8);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void T(boolean z4) {
        C0980l0 c0980l0 = this.f11049J;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15746j.setSelected(z4);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void a0() {
        C0980l0 c0980l0 = this.f11049J;
        C0980l0 c0980l02 = null;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15751o.setVisibility(8);
        C0980l0 c0980l03 = this.f11049J;
        if (c0980l03 == null) {
            m.r("binding");
            c0980l03 = null;
        }
        c0980l03.f15754r.setVisibility(8);
        C0980l0 c0980l04 = this.f11049J;
        if (c0980l04 == null) {
            m.r("binding");
            c0980l04 = null;
        }
        c0980l04.f15742f.setVisibility(8);
        C0980l0 c0980l05 = this.f11049J;
        if (c0980l05 == null) {
            m.r("binding");
            c0980l05 = null;
        }
        c0980l05.f15748l.setVisibility(0);
        C0980l0 c0980l06 = this.f11049J;
        if (c0980l06 == null) {
            m.r("binding");
            c0980l06 = null;
        }
        c0980l06.f15758v.setText("");
        C0980l0 c0980l07 = this.f11049J;
        if (c0980l07 == null) {
            m.r("binding");
            c0980l07 = null;
        }
        c0980l07.f15750n.setImageResource(AbstractC0918v.t4);
        C0980l0 c0980l08 = this.f11049J;
        if (c0980l08 == null) {
            m.r("binding");
            c0980l08 = null;
        }
        c0980l08.f15749m.setVisibility(8);
        C0980l0 c0980l09 = this.f11049J;
        if (c0980l09 == null) {
            m.r("binding");
            c0980l09 = null;
        }
        c0980l09.f15752p.setVisibility(8);
        C0980l0 c0980l010 = this.f11049J;
        if (c0980l010 == null) {
            m.r("binding");
            c0980l010 = null;
        }
        c0980l010.f15744h.setVisibility(8);
        C0980l0 c0980l011 = this.f11049J;
        if (c0980l011 == null) {
            m.r("binding");
        } else {
            c0980l02 = c0980l011;
        }
        c0980l02.f15739c.setVisibility(0);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void c0(boolean z4) {
        C0980l0 c0980l0 = this.f11049J;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15738b.setVisibility(z4 ? 0 : 8);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void d1(boolean z4) {
        C0980l0 c0980l0 = this.f11049J;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15743g.setChecked(z4);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void f0(List list, int i4) {
        m.e(list, "list");
        this.f11050K.K(list);
        this.f11050K.L(i4);
        this.f11050K.m();
        C0980l0 c0980l0 = this.f11049J;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15740d.m1(i4);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void g1(String str) {
        m.e(str, "text");
        C0980l0 c0980l0 = this.f11049J;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15751o.setText(str);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void m1(boolean z4) {
        C0980l0 c0980l0 = this.f11049J;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15741e.setVisibility(z4 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: m3, reason: merged with bridge method [inline-methods] */
    public void S2(final k kVar) {
        m.e(kVar, "presenter");
        super.S2(kVar);
        C0980l0 c0980l0 = this.f11049J;
        C0980l0 c0980l02 = null;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15749m.setOnClickListener(new View.OnClickListener() { // from class: z0.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QBuilderActivity.n3(this.f20847b, view);
            }
        });
        C0980l0 c0980l03 = this.f11049J;
        if (c0980l03 == null) {
            m.r("binding");
            c0980l03 = null;
        }
        c0980l03.f15744h.setOnClickListener(new View.OnClickListener() { // from class: z0.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QBuilderActivity.o3(kVar, view);
            }
        });
        C0980l0 c0980l04 = this.f11049J;
        if (c0980l04 == null) {
            m.r("binding");
            c0980l04 = null;
        }
        c0980l04.f15752p.setOnClickListener(new View.OnClickListener() { // from class: z0.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QBuilderActivity.s3(kVar, view);
            }
        });
        C0573k c0573k = C0573k.f2973a;
        C0980l0 c0980l05 = this.f11049J;
        if (c0980l05 == null) {
            m.r("binding");
            c0980l05 = null;
        }
        AppCompatEditText appCompatEditText = c0980l05.f15747k;
        m.d(appCompatEditText, "editTitle");
        c0573k.x(appCompatEditText, new InterfaceC1016l() { // from class: z0.A0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return QBuilderActivity.t3(kVar, (String) obj);
            }
        });
        C0980l0 c0980l06 = this.f11049J;
        if (c0980l06 == null) {
            m.r("binding");
            c0980l06 = null;
        }
        c0980l06.f15738b.setOnClickListener(new View.OnClickListener() { // from class: z0.B0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QBuilderActivity.u3(kVar, view);
            }
        });
        C0980l0 c0980l07 = this.f11049J;
        if (c0980l07 == null) {
            m.r("binding");
            c0980l07 = null;
        }
        c0980l07.f15746j.setOnClickListener(new View.OnClickListener() { // from class: z0.C0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QBuilderActivity.v3(kVar, view);
            }
        });
        C0980l0 c0980l08 = this.f11049J;
        if (c0980l08 == null) {
            m.r("binding");
            c0980l08 = null;
        }
        c0980l08.f15755s.setOnClickListener(new View.OnClickListener() { // from class: z0.D0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QBuilderActivity.w3(kVar, view);
            }
        });
        C0980l0 c0980l09 = this.f11049J;
        if (c0980l09 == null) {
            m.r("binding");
            c0980l09 = null;
        }
        c0980l09.f15741e.setOnClickListener(new View.OnClickListener() { // from class: z0.r0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QBuilderActivity.x3(kVar, view);
            }
        });
        C0980l0 c0980l010 = this.f11049J;
        if (c0980l010 == null) {
            m.r("binding");
            c0980l010 = null;
        }
        c0980l010.f15739c.setOnClickListener(new View.OnClickListener() { // from class: z0.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QBuilderActivity.y3(kVar, view);
            }
        });
        C0980l0 c0980l011 = this.f11049J;
        if (c0980l011 == null) {
            m.r("binding");
            c0980l011 = null;
        }
        c0980l011.f15759w.setOnClickListener(new View.OnClickListener() { // from class: z0.t0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QBuilderActivity.z3(kVar, view);
            }
        });
        C0980l0 c0980l012 = this.f11049J;
        if (c0980l012 == null) {
            m.r("binding");
        } else {
            c0980l02 = c0980l012;
        }
        c0980l02.f15743g.setOnClickListener(new View.OnClickListener() { // from class: z0.v0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                QBuilderActivity.p3(kVar, this, view);
            }
        });
        this.f11051L.J(new InterfaceC1020p() { // from class: z0.w0
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return QBuilderActivity.q3(kVar, (i.a) obj, ((Integer) obj2).intValue());
            }
        });
        this.f11050K.J(new InterfaceC1020p() { // from class: z0.x0
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return QBuilderActivity.r3(kVar, (e.a) obj, ((Integer) obj2).intValue());
            }
        });
        if (kVar.K1() != null) {
            setTitle(AbstractC0888D.f14467d);
        }
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void n1(String str) {
        m.e(str, "config");
        startActivityForResult(new Intent(this, (Class<?>) ConfigActivity.class).putExtra("config", str), 1);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) throws IOException {
        String stringExtra;
        super.onActivityResult(i4, i5, intent);
        if (i4 == 1) {
            String stringExtra2 = null;
            if (i5 == -1 && intent != null) {
                stringExtra2 = intent.getStringExtra(HalmaParams.NAME);
            }
            if (stringExtra2 == null) {
                ((k) V2()).Q1();
                return;
            }
            k kVar = (k) V2();
            if (intent == null || (stringExtra = intent.getStringExtra("config")) == null) {
                stringExtra = "";
            }
            kVar.S1(stringExtra2, stringExtra);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((k) V2()).P1();
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0980l0 c0980l0D = C0980l0.d(getLayoutInflater());
        this.f11049J = c0980l0D;
        if (c0980l0D == null) {
            m.r("binding");
            c0980l0D = null;
        }
        setContentView(c0980l0D.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.f14408P, false, 2, null);
        C0980l0 c0980l0 = this.f11049J;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15753q.setAdapter(this.f11051L);
        C0980l0 c0980l02 = this.f11049J;
        if (c0980l02 == null) {
            m.r("binding");
            c0980l02 = null;
        }
        c0980l02.f15740d.setLayoutManager(new GridAutoLayoutManager(this, 48.0f, 0, 4, null));
        C0980l0 c0980l03 = this.f11049J;
        if (c0980l03 == null) {
            m.r("binding");
            c0980l03 = null;
        }
        c0980l03.f15740d.setAdapter(this.f11050K);
        C0573k c0573k = C0573k.f2973a;
        C0980l0 c0980l04 = this.f11049J;
        if (c0980l04 == null) {
            m.r("binding");
            c0980l04 = null;
        }
        TextView textView = c0980l04.f15751o;
        m.d(textView, "loadInfo");
        C0573k.s(c0573k, textView, 0, 1, null);
        C0980l0 c0980l05 = this.f11049J;
        if (c0980l05 == null) {
            m.r("binding");
            c0980l05 = null;
        }
        ConstraintLayout constraintLayout = c0980l05.f15742f;
        m.d(constraintLayout, "builder");
        C0573k.s(c0573k, constraintLayout, 0, 1, null);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((k) V2()).v0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((k) V2()).v1(this);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void r0(int i4) {
        C0980l0 c0980l0 = null;
        if (i4 == 0) {
            C0980l0 c0980l02 = this.f11049J;
            if (c0980l02 == null) {
                m.r("binding");
                c0980l02 = null;
            }
            c0980l02.f15747k.setVisibility(0);
            C0980l0 c0980l03 = this.f11049J;
            if (c0980l03 == null) {
                m.r("binding");
                c0980l03 = null;
            }
            c0980l03.f15743g.setVisibility(0);
            C0980l0 c0980l04 = this.f11049J;
            if (c0980l04 == null) {
                m.r("binding");
            } else {
                c0980l0 = c0980l04;
            }
            c0980l0.f15757u.setVisibility(8);
            return;
        }
        C0980l0 c0980l05 = this.f11049J;
        if (c0980l05 == null) {
            m.r("binding");
            c0980l05 = null;
        }
        c0980l05.f15747k.setVisibility(8);
        C0980l0 c0980l06 = this.f11049J;
        if (c0980l06 == null) {
            m.r("binding");
            c0980l06 = null;
        }
        c0980l06.f15743g.setVisibility(8);
        C0980l0 c0980l07 = this.f11049J;
        if (c0980l07 == null) {
            m.r("binding");
            c0980l07 = null;
        }
        c0980l07.f15757u.setVisibility(0);
        C0980l0 c0980l08 = this.f11049J;
        if (c0980l08 == null) {
            m.r("binding");
        } else {
            c0980l0 = c0980l08;
        }
        c0980l0.f15757u.setText(i4);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void u(String str) {
        m.e(str, "hxw");
        C0980l0 c0980l0 = this.f11049J;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15756t.setText(str);
    }

    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.d
    public void z0(String str) {
        m.e(str, "text");
        C0980l0 c0980l0 = this.f11049J;
        if (c0980l0 == null) {
            m.r("binding");
            c0980l0 = null;
        }
        c0980l0.f15745i.setText(str);
    }
}