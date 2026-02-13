package cab.shashki.app.ui.chess;

import N0.C0573k;
import T2.j;
import T2.u;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import cab.shashki.app.ui.chess.c;
import f0.AbstractC0888D;
import f0.AbstractC0889E;
import g0.F0;
import g3.InterfaceC1005a;
import g3.InterfaceC1016l;
import g3.InterfaceC1020p;
import h3.h;
import h3.m;
import java.io.Serializable;
import p3.n;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class a extends com.google.android.material.bottomsheet.b {

    /* renamed from: u0, reason: collision with root package name */
    public static final C0145a f10915u0 = new C0145a(null);

    /* renamed from: v0, reason: collision with root package name */
    private static InterfaceC1020p f10916v0;

    /* renamed from: t0, reason: collision with root package name */
    private F0 f10917t0;

    /* renamed from: cab.shashki.app.ui.chess.a$a, reason: collision with other inner class name */
    public static final class C0145a {
        public /* synthetic */ C0145a(h hVar) {
            this();
        }

        public final a a(InterfaceC1020p interfaceC1020p, c.b bVar) {
            m.e(interfaceC1020p, "listener");
            m.e(bVar, "option");
            a aVar = new a();
            a.f10916v0 = interfaceC1020p;
            Bundle bundle = new Bundle();
            bundle.putSerializable("option", bVar);
            aVar.o4(bundle);
            return aVar;
        }

        private C0145a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10918a;

        static {
            int[] iArr = new int[c.a.values().length];
            try {
                iArr[c.a.f10943i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.a.f10942h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.a.f10940f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.a.f10939e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.a.f10941g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.a.f10944j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f10918a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f5(a aVar, InterfaceC1005a interfaceC1005a, View view) {
        aVar.h5((String) interfaceC1005a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g5(a aVar, InterfaceC1005a interfaceC1005a, TextView textView, int i4, KeyEvent keyEvent) {
        if (i4 != 6) {
            return false;
        }
        aVar.h5((String) interfaceC1005a.a());
        return true;
    }

    private final void h5(String str) {
        if (str != null) {
            InterfaceC1020p interfaceC1020p = f10916v0;
            F0 f02 = null;
            if (interfaceC1020p == null) {
                m.r("listener");
                interfaceC1020p = null;
            }
            F0 f03 = this.f10917t0;
            if (f03 == null) {
                m.r("binding");
            } else {
                f02 = f03;
            }
            interfaceC1020p.k(String.valueOf(f02.f15342d.getText()), str);
        }
        G4();
    }

    private final InterfaceC1005a i5(c.b bVar) throws Resources.NotFoundException {
        F0 f02 = this.f10917t0;
        F0 f03 = null;
        if (f02 == null) {
            m.r("binding");
            f02 = null;
        }
        f02.f15340b.setVisibility(0);
        F0 f04 = this.f10917t0;
        if (f04 == null) {
            m.r("binding");
            f04 = null;
        }
        f04.f15340b.setText(bVar.getName());
        F0 f05 = this.f10917t0;
        if (f05 == null) {
            m.r("binding");
        } else {
            f03 = f05;
        }
        f03.f15340b.setChecked(m.a(bVar.getValue(), "true"));
        return new InterfaceC1005a() { // from class: x0.I
            @Override // g3.InterfaceC1005a
            public final Object a() {
                return cab.shashki.app.ui.chess.a.j5(this.f20289d);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j5(a aVar) {
        F0 f02 = aVar.f10917t0;
        if (f02 == null) {
            m.r("binding");
            f02 = null;
        }
        return String.valueOf(f02.f15340b.isChecked());
    }

    private final InterfaceC1005a k5(c.b bVar) {
        F0 f02 = this.f10917t0;
        F0 f03 = null;
        if (f02 == null) {
            m.r("binding");
            f02 = null;
        }
        f02.f15343e.setVisibility(0);
        F0 f04 = this.f10917t0;
        if (f04 == null) {
            m.r("binding");
            f04 = null;
        }
        f04.f15343e.setText(bVar.getName());
        F0 f05 = this.f10917t0;
        if (f05 == null) {
            m.r("binding");
        } else {
            f03 = f05;
        }
        f03.f15344f.setText(AbstractC0888D.j4);
        return new InterfaceC1005a() { // from class: x0.E
            @Override // g3.InterfaceC1005a
            public final Object a() {
                return cab.shashki.app.ui.chess.a.l5();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l5() {
        return "";
    }

    private final InterfaceC1005a m5(c.b bVar) {
        F0 f02 = this.f10917t0;
        F0 f03 = null;
        if (f02 == null) {
            m.r("binding");
            f02 = null;
        }
        f02.f15346h.setVisibility(0);
        F0 f04 = this.f10917t0;
        if (f04 == null) {
            m.r("binding");
            f04 = null;
        }
        f04.f15343e.setVisibility(0);
        F0 f05 = this.f10917t0;
        if (f05 == null) {
            m.r("binding");
            f05 = null;
        }
        f05.f15341c.setVisibility(0);
        final int i4 = bVar.i();
        Integer numI = n.i(bVar.getValue());
        int iIntValue = numI != null ? numI.intValue() : i4;
        F0 f06 = this.f10917t0;
        if (f06 == null) {
            m.r("binding");
            f06 = null;
        }
        f06.f15346h.setText(bVar.getName());
        F0 f07 = this.f10917t0;
        if (f07 == null) {
            m.r("binding");
            f07 = null;
        }
        f07.f15343e.setText(String.valueOf(iIntValue));
        F0 f08 = this.f10917t0;
        if (f08 == null) {
            m.r("binding");
            f08 = null;
        }
        f08.f15341c.setMax(bVar.h() - i4);
        F0 f09 = this.f10917t0;
        if (f09 == null) {
            m.r("binding");
            f09 = null;
        }
        f09.f15341c.setProgress(iIntValue - i4);
        C0573k c0573k = C0573k.f2973a;
        F0 f010 = this.f10917t0;
        if (f010 == null) {
            m.r("binding");
        } else {
            f03 = f010;
        }
        AppCompatSeekBar appCompatSeekBar = f03.f15341c;
        m.d(appCompatSeekBar, "intValue");
        c0573k.y(appCompatSeekBar, new InterfaceC1016l() { // from class: x0.F
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.chess.a.n5(this.f20284d, i4, ((Integer) obj).intValue());
            }
        });
        return new InterfaceC1005a() { // from class: x0.G
            @Override // g3.InterfaceC1005a
            public final Object a() {
                return cab.shashki.app.ui.chess.a.o5(this.f20286d, i4);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u n5(a aVar, int i4, int i5) {
        F0 f02 = aVar.f10917t0;
        if (f02 == null) {
            m.r("binding");
            f02 = null;
        }
        f02.f15343e.setText(String.valueOf(i5 + i4));
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o5(a aVar, int i4) {
        F0 f02 = aVar.f10917t0;
        if (f02 == null) {
            m.r("binding");
            f02 = null;
        }
        return String.valueOf(f02.f15341c.getProgress() + i4);
    }

    private final InterfaceC1005a p5(c.b bVar) {
        F0 f02 = this.f10917t0;
        F0 f03 = null;
        if (f02 == null) {
            m.r("binding");
            f02 = null;
        }
        f02.f15342d.setVisibility(0);
        F0 f04 = this.f10917t0;
        if (f04 == null) {
            m.r("binding");
            f04 = null;
        }
        f04.f15345g.setVisibility(0);
        F0 f05 = this.f10917t0;
        if (f05 == null) {
            m.r("binding");
            f05 = null;
        }
        f05.f15342d.setEnabled(n.P(bVar.getName()));
        F0 f06 = this.f10917t0;
        if (f06 == null) {
            m.r("binding");
            f06 = null;
        }
        f06.f15345g.setText(bVar.getValue());
        if (bVar.n() == c.a.f10944j) {
            F0 f07 = this.f10917t0;
            if (f07 == null) {
                m.r("binding");
                f07 = null;
            }
            f07.f15346h.setVisibility(0);
            F0 f08 = this.f10917t0;
            if (f08 == null) {
                m.r("binding");
            } else {
                f03 = f08;
            }
            f03.f15346h.setText(bVar.f());
        }
        return new InterfaceC1005a() { // from class: x0.H
            @Override // g3.InterfaceC1005a
            public final Object a() {
                return cab.shashki.app.ui.chess.a.q5(this.f20288d);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q5(a aVar) {
        F0 f02 = aVar.f10917t0;
        if (f02 == null) {
            m.r("binding");
            f02 = null;
        }
        String strValueOf = String.valueOf(f02.f15345g.getText());
        if (n.P(strValueOf)) {
            return null;
        }
        return strValueOf;
    }

    @Override // androidx.fragment.app.Fragment
    public void B3(View view, Bundle bundle) throws Resources.NotFoundException {
        final InterfaceC1005a interfaceC1005aK5;
        m.e(view, "view");
        super.B3(view, bundle);
        Bundle bundleA2 = a2();
        F0 f02 = null;
        Serializable serializable = bundleA2 != null ? bundleA2.getSerializable("option") : null;
        m.c(serializable, "null cannot be cast to non-null type cab.shashki.app.ui.chess.UCIOptionsView.UCIOption");
        c.b bVar = (c.b) serializable;
        switch (b.f10918a[bVar.n().ordinal()]) {
            case 1:
                interfaceC1005aK5 = k5(bVar);
                break;
            case 2:
                interfaceC1005aK5 = m5(bVar);
                break;
            case 3:
                interfaceC1005aK5 = i5(bVar);
                break;
            case 4:
            case 5:
            case 6:
                interfaceC1005aK5 = p5(bVar);
                break;
            default:
                throw new j();
        }
        F0 f03 = this.f10917t0;
        if (f03 == null) {
            m.r("binding");
            f03 = null;
        }
        f03.f15342d.setText(bVar.getName());
        F0 f04 = this.f10917t0;
        if (f04 == null) {
            m.r("binding");
            f04 = null;
        }
        f04.f15344f.setOnClickListener(new View.OnClickListener() { // from class: x0.C
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                cab.shashki.app.ui.chess.a.f5(this.f20280b, interfaceC1005aK5, view2);
            }
        });
        F0 f05 = this.f10917t0;
        if (f05 == null) {
            m.r("binding");
        } else {
            f02 = f05;
        }
        f02.f15345g.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: x0.D
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
                return cab.shashki.app.ui.chess.a.g5(this.f20282a, interfaceC1005aK5, textView, i4, keyEvent);
            }
        });
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0717d, androidx.fragment.app.Fragment
    public void c3(Bundle bundle) {
        super.c3(bundle);
        Q4(0, AbstractC0889E.f14583b);
    }

    @Override // androidx.fragment.app.Fragment
    public View g3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m.e(layoutInflater, "inflater");
        F0 f0D = F0.d(layoutInflater, viewGroup, false);
        this.f10917t0 = f0D;
        if (f0D == null) {
            m.r("binding");
            f0D = null;
        }
        LinearLayout linearLayoutA = f0D.a();
        m.d(linearLayoutA, "getRoot(...)");
        return linearLayoutA;
    }
}