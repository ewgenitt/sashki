package cab.shashki.app.ui.universal;

import N0.C0573k;
import T2.u;
import U2.p;
import android.R;
import android.content.res.Resources;
import android.inputmethodservice.ExtractEditText;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import cab.shashki.app.db.entities.CaptureSelf;
import cab.shashki.app.db.entities.Cells;
import cab.shashki.app.db.entities.Cylinder;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.ui.custom.board.ShashkiBoardView;
import cab.shashki.app.ui.universal.BuilderActivity;
import cab.shashki.app.ui.universal.MoveMask;
import cab.shashki.app.ui.universal.d;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractC0920x;
import f0.AbstractC0922z;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.I0;
import g0.J0;
import g0.K0;
import g0.L0;
import g0.M0;
import g0.N0;
import g0.O0;
import g0.P0;
import g3.InterfaceC1016l;
import java.util.List;
import java.util.Locale;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class BuilderActivity extends AbstractActivityC0911o implements cab.shashki.app.ui.universal.d {

    /* renamed from: M, reason: collision with root package name */
    public static final b f11792M = new b(null);

    /* renamed from: J, reason: collision with root package name */
    private I0 f11793J;

    /* renamed from: K, reason: collision with root package name */
    private a f11794K;

    /* renamed from: L, reason: collision with root package name */
    private ArrayAdapter f11795L;

    public final class a extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private int f11796d;

        /* renamed from: e, reason: collision with root package name */
        private m f11797e;

        /* renamed from: f, reason: collision with root package name */
        private l f11798f;

        /* renamed from: g, reason: collision with root package name */
        private n f11799g;

        /* renamed from: cab.shashki.app.ui.universal.BuilderActivity$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0154a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11801a;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f11802b;

            static {
                int[] iArr = new int[Cells.values().length];
                try {
                    iArr[Cells.ALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Cells.BLACK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Cells.WHITE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Cells.DYNAMIC_HEX.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Cells.DYNAMIC_CHECKERS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Cells.HEXAGON.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Cells.ALQUERQUE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Cells.ZAMMA.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                f11801a = iArr;
                int[] iArr2 = new int[CaptureSelf.values().length];
                try {
                    iArr2[CaptureSelf.NO.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[CaptureSelf.CAN.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[CaptureSelf.MUST.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                f11802b = iArr2;
            }
        }

        public a(int i4) {
            this.f11796d = i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A1(BuilderActivity builderActivity, int i4) {
            BuilderActivity.b3(builderActivity).H2(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void B1(f fVar, BuilderActivity builderActivity, View view) {
            boolean zIsChecked = fVar.P().isChecked();
            BuilderActivity.b3(builderActivity).E2(zIsChecked);
            fVar.Q().setVisibility((!BuilderActivity.b3(builderActivity).H1() || zIsChecked) ? 8 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void C1(BuilderActivity builderActivity, f fVar, View view) {
            BuilderActivity.b3(builderActivity).G2(fVar.Q().isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void D1(f fVar, BuilderActivity builderActivity, View view) {
            boolean zIsChecked = fVar.O().isChecked();
            BuilderActivity.b3(builderActivity).I2(zIsChecked);
            int i4 = 8;
            fVar.P().setVisibility(zIsChecked ? 0 : 8);
            SwitchCompat switchCompatQ = fVar.Q();
            if (zIsChecked && !BuilderActivity.b3(builderActivity).D1()) {
                i4 = 0;
            }
            switchCompatQ.setVisibility(i4);
        }

        private final void E1(i iVar) {
            iVar.P().setText(BuilderActivity.b3(BuilderActivity.this).O1());
            C0573k c0573k = C0573k.f2973a;
            TextInputEditText textInputEditTextP = iVar.P();
            final BuilderActivity builderActivity = BuilderActivity.this;
            c0573k.x(textInputEditTextP, new InterfaceC1016l() { // from class: M0.f
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return BuilderActivity.a.F1(builderActivity, (String) obj);
                }
            });
            ArrayAdapter arrayAdapter = BuilderActivity.this.f11795L;
            ArrayAdapter arrayAdapter2 = null;
            if (arrayAdapter == null) {
                h3.m.r("templateAdapter");
                arrayAdapter = null;
            }
            arrayAdapter.clear();
            ArrayAdapter arrayAdapter3 = BuilderActivity.this.f11795L;
            if (arrayAdapter3 == null) {
                h3.m.r("templateAdapter");
                arrayAdapter3 = null;
            }
            arrayAdapter3.addAll(BuilderActivity.b3(BuilderActivity.this).m3());
            ArrayAdapter arrayAdapter4 = BuilderActivity.this.f11795L;
            if (arrayAdapter4 == null) {
                h3.m.r("templateAdapter");
                arrayAdapter4 = null;
            }
            arrayAdapter4.notifyDataSetChanged();
            AppCompatSpinner appCompatSpinnerQ = iVar.Q();
            ArrayAdapter arrayAdapter5 = BuilderActivity.this.f11795L;
            if (arrayAdapter5 == null) {
                h3.m.r("templateAdapter");
            } else {
                arrayAdapter2 = arrayAdapter5;
            }
            appCompatSpinnerQ.setAdapter((SpinnerAdapter) arrayAdapter2);
            iVar.Q().setSelection(BuilderActivity.b3(BuilderActivity.this).o2());
            AppCompatSpinner appCompatSpinnerQ2 = iVar.Q();
            final BuilderActivity builderActivity2 = BuilderActivity.this;
            c0573k.z(appCompatSpinnerQ2, new InterfaceC1016l() { // from class: M0.g
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return BuilderActivity.a.G1(builderActivity2, ((Integer) obj).intValue());
                }
            });
            if (BuilderActivity.b3(BuilderActivity.this).W0()) {
                iVar.Q().setVisibility(8);
                String strG1 = BuilderActivity.b3(BuilderActivity.this).g1();
                if (strG1 != null) {
                    iVar.O().setText(strG1);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u F1(BuilderActivity builderActivity, String str) {
            h3.m.e(str, "it");
            BuilderActivity.b3(builderActivity).U2(str);
            return u.f3817a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u G1(BuilderActivity builderActivity, int i4) {
            BuilderActivity.b3(builderActivity).m2(i4);
            return u.f3817a;
        }

        private final void H1(l lVar) {
            BuilderActivity builderActivity = BuilderActivity.this;
            builderActivity.l1(BuilderActivity.b3(builderActivity).m1());
            lVar.Q(BuilderActivity.b3(BuilderActivity.this));
            N0 n0O = lVar.O();
            BuilderActivity builderActivity2 = BuilderActivity.this;
            n0O.f15475b.setListener(BuilderActivity.b3(builderActivity2));
            n0O.f15475b.setGridMode(BuilderActivity.b3(builderActivity2).l1());
            n0O.f15475b.setPosition(BuilderActivity.b3(builderActivity2).k3());
            n0O.f15475b.H1(BuilderActivity.b3(builderActivity2).k1(), BuilderActivity.b3(builderActivity2).f1(), BuilderActivity.b3(builderActivity2).o1());
            final O0 o02 = lVar.O().f15477d;
            final BuilderActivity builderActivity3 = BuilderActivity.this;
            o02.f15502n.setChecked(BuilderActivity.b3(builderActivity3).s3());
            o02.f15502n.setOnClickListener(new View.OnClickListener() { // from class: M0.Y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.I1(builderActivity3, o02, view);
                }
            });
            o02.f15499k.setChecked(BuilderActivity.b3(builderActivity3).e1());
            o02.f15499k.setOnClickListener(new View.OnClickListener() { // from class: M0.d0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.J1(builderActivity3, o02, view);
                }
            });
            o02.f15500l.setChecked(BuilderActivity.b3(builderActivity3).L1());
            o02.f15500l.setOnClickListener(new View.OnClickListener() { // from class: M0.e0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.K1(builderActivity3, o02, view);
                }
            });
            o02.f15501m.setChecked(BuilderActivity.b3(builderActivity3).z1());
            o02.f15501m.setOnClickListener(new View.OnClickListener() { // from class: M0.f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.L1(builderActivity3, o02, view);
                }
            });
            o02.f15492d.setOnClickListener(new View.OnClickListener() { // from class: M0.h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.M1(builderActivity3, view);
                }
            });
            o02.f15490b.setOnClickListener(new View.OnClickListener() { // from class: M0.i0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.N1(builderActivity3, view);
                }
            });
            o02.f15493e.setOnClickListener(new View.OnClickListener() { // from class: M0.j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.O1(builderActivity3, view);
                }
            });
            o02.f15491c.setOnClickListener(new View.OnClickListener() { // from class: M0.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.P1(builderActivity3, view);
                }
            });
            o02.f15494f.setOnClickListener(new View.OnClickListener() { // from class: M0.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.Q1(builderActivity3, view);
                }
            });
            o02.f15496h.setOnClickListener(new View.OnClickListener() { // from class: M0.m0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.R1(builderActivity3, view);
                }
            });
            o02.f15495g.setOnClickListener(new View.OnClickListener() { // from class: M0.Z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.S1(builderActivity3, view);
                }
            });
            o02.f15497i.setOnClickListener(new View.OnClickListener() { // from class: M0.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.T1(builderActivity3, view);
                }
            });
            o02.f15498j.setOnClickListener(new View.OnClickListener() { // from class: M0.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.U1(builderActivity3, view);
                }
            });
            o02.f15498j.setOnLongClickListener(new View.OnLongClickListener() { // from class: M0.c0
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return BuilderActivity.a.V1(builderActivity3, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void I1(BuilderActivity builderActivity, O0 o02, View view) {
            BuilderActivity.b3(builderActivity).h3(o02.f15502n.isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void J1(BuilderActivity builderActivity, O0 o02, View view) {
            BuilderActivity.b3(builderActivity).A2(o02.f15499k.isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void K1(BuilderActivity builderActivity, O0 o02, View view) {
            BuilderActivity.b3(builderActivity).M2(o02.f15500l.isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void L1(BuilderActivity builderActivity, O0 o02, View view) {
            BuilderActivity.b3(builderActivity).T2(o02.f15501m.isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void M1(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).S2(d.a.f11886e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void N1(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).S2(d.a.f11887f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void O1(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).S2(d.a.f11888g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void P1(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).S2(d.a.f11889h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Q1(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).S2(d.a.f11890i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void R1(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).S2(d.a.f11891j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void S1(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).S2(d.a.f11892k);
        }

        private final void T0(e eVar) throws Resources.NotFoundException {
            final L0 l0O = eVar.O();
            final BuilderActivity builderActivity = BuilderActivity.this;
            l0O.f15450m.setChecked(BuilderActivity.b3(builderActivity).o3());
            l0O.f15450m.setOnClickListener(new View.OnClickListener() { // from class: M0.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.U0(builderActivity, l0O, view);
                }
            });
            l0O.f15443f.setEnabled(BuilderActivity.b3(builderActivity).w1());
            l0O.f15443f.setChecked(BuilderActivity.b3(builderActivity).I1());
            l0O.f15443f.setOnClickListener(new View.OnClickListener() { // from class: M0.J
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.V0(builderActivity, l0O, view);
                }
            });
            l0O.f15446i.setChecked(BuilderActivity.b3(builderActivity).l2());
            l0O.f15446i.setOnClickListener(new View.OnClickListener() { // from class: M0.V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.W0(builderActivity, l0O, view);
                }
            });
            l0O.f15446i.setVisibility(BuilderActivity.b3(builderActivity).R0() ? 0 : 8);
            boolean zN1 = BuilderActivity.b3(builderActivity).N1();
            l0O.f15445h.setEnabled(BuilderActivity.b3(builderActivity).w1());
            l0O.f15445h.setChecked(zN1);
            l0O.f15445h.setOnClickListener(new View.OnClickListener() { // from class: M0.g0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.X0(l0O, builderActivity, view);
                }
            });
            l0O.f15452o.setVisibility(zN1 ? 0 : 8);
            l0O.f15451n.setVisibility(l0O.f15452o.getVisibility());
            l0O.f15451n.setText(String.valueOf(BuilderActivity.b3(builderActivity).K1()));
            C0573k c0573k = C0573k.f2973a;
            AppCompatEditText appCompatEditText = l0O.f15451n;
            h3.m.d(appCompatEditText, "weight");
            c0573k.x(appCompatEditText, new InterfaceC1016l() { // from class: M0.n0
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return BuilderActivity.a.Y0(builderActivity, (String) obj);
                }
            });
            l0O.f15442e.setText(String.valueOf(BuilderActivity.b3(builderActivity).b1()));
            l0O.f15439b.setProgress((BuilderActivity.b3(builderActivity).b1() - 15) / 5);
            AppCompatSeekBar appCompatSeekBar = l0O.f15439b;
            h3.m.d(appCompatSeekBar, "draw");
            c0573k.y(appCompatSeekBar, new InterfaceC1016l() { // from class: M0.o0
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return BuilderActivity.a.Z0(l0O, builderActivity, ((Integer) obj).intValue());
                }
            });
            l0O.f15440c.setChecked(BuilderActivity.b3(builderActivity).a1());
            l0O.f15440c.setOnClickListener(new View.OnClickListener() { // from class: M0.p0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.a1(builderActivity, l0O, view);
                }
            });
            boolean z4 = BuilderActivity.b3(builderActivity).u3() > 0;
            l0O.f15453p.setVisibility(z4 ? 0 : 8);
            l0O.f15453p.setProgress(BuilderActivity.b3(builderActivity).u3() - 1);
            l0O.f15454q.setVisibility(l0O.f15453p.getVisibility());
            l0O.f15454q.setText(String.valueOf(BuilderActivity.b3(builderActivity).u3()));
            l0O.f15444g.setVisibility(BuilderActivity.b3(builderActivity).v3() ? 0 : 8);
            l0O.f15444g.setChecked(z4);
            l0O.f15444g.setOnClickListener(new View.OnClickListener() { // from class: M0.q0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.b1(l0O, builderActivity, view);
                }
            });
            AppCompatSeekBar appCompatSeekBar2 = l0O.f15453p;
            h3.m.d(appCompatSeekBar2, "wolf");
            c0573k.y(appCompatSeekBar2, new InterfaceC1016l() { // from class: M0.d
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return BuilderActivity.a.c1(builderActivity, l0O, ((Integer) obj).intValue());
                }
            });
            l0O.f15448k.setVisibility(BuilderActivity.b3(builderActivity).o1().isEmpty() ? 8 : 0);
            l0O.f15447j.setVisibility(l0O.f15448k.getVisibility());
            l0O.f15447j.setProgress(BuilderActivity.b3(builderActivity).n1() - 1);
            AppCompatSeekBar appCompatSeekBar3 = l0O.f15447j;
            h3.m.d(appCompatSeekBar3, "spinLimit");
            c0573k.y(appCompatSeekBar3, new InterfaceC1016l() { // from class: M0.e
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return BuilderActivity.a.d1(builderActivity, l0O, ((Integer) obj).intValue());
                }
            });
            l0O.f15449l.setVisibility(l0O.f15448k.getVisibility());
            l0O.f15449l.setText(String.valueOf(BuilderActivity.b3(builderActivity).n1()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void T1(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).S2(d.a.f11893l);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void U0(BuilderActivity builderActivity, L0 l02, View view) {
            BuilderActivity.b3(builderActivity).g3(l02.f15450m.isChecked());
            l02.f15446i.setVisibility(BuilderActivity.b3(builderActivity).R0() ? 0 : 8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void U1(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).S2(d.a.f11885d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void V0(BuilderActivity builderActivity, L0 l02, View view) {
            BuilderActivity.b3(builderActivity).J2(l02.f15443f.isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean V1(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).U0();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void W0(BuilderActivity builderActivity, L0 l02, View view) {
            BuilderActivity.b3(builderActivity).b3(l02.f15446i.isChecked());
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final void W1(final m mVar) {
            J0 j0O = mVar.O();
            BuilderActivity builderActivity = BuilderActivity.this;
            j0O.f15398b.setListener(BuilderActivity.b3(builderActivity));
            j0O.f15398b.setGridMode(BuilderActivity.b3(builderActivity).l1());
            j0O.f15398b.H1(BuilderActivity.b3(builderActivity).k1(), BuilderActivity.b3(builderActivity).f1(), BuilderActivity.b3(builderActivity).o1());
            K0 k02 = mVar.O().f15400d;
            final BuilderActivity builderActivity2 = BuilderActivity.this;
            mVar.R(BuilderActivity.b3(builderActivity2).T0());
            mVar.S(BuilderActivity.b3(builderActivity2).X0(), BuilderActivity.b3(builderActivity2).K0(), BuilderActivity.b3(builderActivity2).L0());
            k02.f15413k.setOnClickListener(new View.OnClickListener() { // from class: M0.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.f2(builderActivity2, view);
                }
            });
            k02.f15410h.setOnClickListener(new View.OnClickListener() { // from class: M0.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.g2(builderActivity2, view);
                }
            });
            k02.f15412j.setOnClickListener(new View.OnClickListener() { // from class: M0.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.h2(builderActivity2, view);
                }
            });
            k02.f15421s.setProgress(BuilderActivity.b3(builderActivity2).t3() - 3);
            k02.f15408f.setProgress(BuilderActivity.b3(builderActivity2).s1() - 3);
            C0573k c0573k = C0573k.f2973a;
            AppCompatSeekBar appCompatSeekBar = k02.f15421s;
            h3.m.d(appCompatSeekBar, "w");
            c0573k.y(appCompatSeekBar, new InterfaceC1016l() { // from class: M0.l
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return BuilderActivity.a.X1(builderActivity2, ((Integer) obj).intValue());
                }
            });
            AppCompatSeekBar appCompatSeekBar2 = k02.f15408f;
            h3.m.d(appCompatSeekBar2, "h");
            c0573k.y(appCompatSeekBar2, new InterfaceC1016l() { // from class: M0.m
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return BuilderActivity.a.Y1(builderActivity2, ((Integer) obj).intValue());
                }
            });
            mVar.Q(BuilderActivity.b3(builderActivity2).i1());
            mVar.P(BuilderActivity.b3(builderActivity2).h1());
            k02.f15411i.setOnClickListener(new View.OnClickListener() { // from class: M0.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.Z1(builderActivity2, view);
                }
            });
            k02.f15416n.setOnClickListener(new View.OnClickListener() { // from class: M0.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.a2(builderActivity2, view);
                }
            });
            k02.f15414l.setOnClickListener(new View.OnClickListener() { // from class: M0.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.b2(builderActivity2, view);
                }
            });
            k02.f15417o.setOnClickListener(new View.OnClickListener() { // from class: M0.r
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.c2(builderActivity2, view);
                }
            });
            k02.f15415m.setOnClickListener(new View.OnClickListener() { // from class: M0.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.d2(builderActivity2, view);
                }
            });
            k02.f15407e.setOnCheckedChangeListener(null);
            switch (C0154a.f11801a[BuilderActivity.b3(builderActivity2).T0().ordinal()]) {
                case 1:
                    k02.f15407e.check(AbstractC0920x.f14960S);
                    break;
                case 2:
                    k02.f15407e.check(AbstractC0920x.f15038j0);
                    break;
                case 3:
                    k02.f15407e.check(AbstractC0920x.J7);
                    break;
                case 4:
                    k02.f15407e.check(AbstractC0920x.H6);
                    break;
                case 5:
                    k02.f15407e.check(AbstractC0920x.I6);
                    break;
                case 6:
                    k02.f15407e.check(AbstractC0920x.f15110x2);
                    break;
                case 7:
                    k02.f15407e.check(AbstractC0920x.f14964T);
                    break;
                case 8:
                    k02.f15407e.check(AbstractC0920x.a8);
                    break;
                default:
                    throw new T2.j();
            }
            RadioButton[] radioButtonArr = {k02.f15407e.findViewById(AbstractC0920x.f14964T), k02.f15407e.findViewById(AbstractC0920x.a8)};
            for (int i4 = 0; i4 < 2; i4++) {
                ExtractEditText extractEditText = radioButtonArr[i4];
                String lowerCase = extractEditText.getText().toString().toLowerCase(Locale.ROOT);
                h3.m.d(lowerCase, "toLowerCase(...)");
                extractEditText.setText(lowerCase);
            }
            k02.f15407e.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: M0.i
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i5) {
                    BuilderActivity.a.e2(builderActivity2, mVar, radioGroup, i5);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void X0(L0 l02, BuilderActivity builderActivity, View view) {
            boolean zIsChecked = l02.f15445h.isChecked();
            BuilderActivity.b3(builderActivity).R2(zIsChecked);
            l02.f15452o.setVisibility(zIsChecked ? 0 : 8);
            l02.f15451n.setVisibility(l02.f15452o.getVisibility());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u X1(BuilderActivity builderActivity, int i4) {
            BuilderActivity.b3(builderActivity).i3(i4 + 3);
            return u.f3817a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u Y0(BuilderActivity builderActivity, String str) {
            h3.m.e(str, "it");
            cab.shashki.app.ui.universal.a aVarB3 = BuilderActivity.b3(builderActivity);
            Float fH = p3.n.h(str);
            aVarB3.L2(fH != null ? fH.floatValue() : 1.0f);
            return u.f3817a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u Y1(BuilderActivity builderActivity, int i4) {
            BuilderActivity.b3(builderActivity).C2(i4 + 3);
            return u.f3817a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u Z0(L0 l02, BuilderActivity builderActivity, int i4) {
            int i5 = (i4 * 5) + 15;
            l02.f15442e.setText(String.valueOf(i5));
            BuilderActivity.b3(builderActivity).y2(i5);
            return u.f3817a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Z1(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).P2(d.b.f11898f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a1(BuilderActivity builderActivity, L0 l02, View view) {
            BuilderActivity.b3(builderActivity).x2(l02.f15440c.isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a2(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).P2(d.b.f11900h);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b1(L0 l02, BuilderActivity builderActivity, View view) {
            if (l02.f15444g.isChecked()) {
                BuilderActivity.b3(builderActivity).j3(3);
                l02.f15453p.setProgress(2);
                l02.f15454q.setText("3");
                l02.f15453p.setVisibility(0);
            } else {
                BuilderActivity.b3(builderActivity).j3(0);
                l02.f15453p.setVisibility(8);
            }
            l02.f15454q.setVisibility(l02.f15453p.getVisibility());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b2(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).P2(d.b.f11897e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u c1(BuilderActivity builderActivity, L0 l02, int i4) {
            BuilderActivity.b3(builderActivity).j3(i4 + 1);
            l02.f15454q.setText(String.valueOf(BuilderActivity.b3(builderActivity).u3()));
            return u.f3817a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c2(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).P2(d.b.f11896d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u d1(BuilderActivity builderActivity, L0 l02, int i4) {
            ((cab.shashki.app.ui.universal.a) builderActivity.X2()).c3(i4 + 1);
            l02.f15449l.setText(String.valueOf(BuilderActivity.b3(builderActivity).n1()));
            return u.f3817a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d2(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).P2(d.b.f11899g);
        }

        private final void e1(h hVar) throws Resources.NotFoundException {
            final M0 m0O = hVar.O();
            final BuilderActivity builderActivity = BuilderActivity.this;
            m0O.f15468m.setChecked(BuilderActivity.b3(builderActivity).n3());
            m0O.f15468m.setOnClickListener(new View.OnClickListener() { // from class: M0.K
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Resources.NotFoundException {
                    BuilderActivity.a.f1(builderActivity, m0O, view);
                }
            });
            m0O.f15468m.setVisibility(BuilderActivity.b3(builderActivity).C1() ? 0 : 8);
            m0O.f15463h.setChecked(BuilderActivity.b3(builderActivity).q1());
            m0O.f15463h.setOnClickListener(new View.OnClickListener() { // from class: M0.L
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Resources.NotFoundException {
                    BuilderActivity.a.g1(builderActivity, m0O, view);
                }
            });
            m0O.f15464i.setChecked(BuilderActivity.b3(builderActivity).t1());
            m0O.f15464i.setEnabled(BuilderActivity.b3(builderActivity).Q0());
            m0O.f15464i.setVisibility(BuilderActivity.b3(builderActivity).u1() ? 0 : 8);
            m0O.f15464i.setOnClickListener(new View.OnClickListener() { // from class: M0.M
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.h1(builderActivity, m0O, view);
                }
            });
            m0O.f15461f.setChecked(BuilderActivity.b3(builderActivity).Y0());
            m0O.f15461f.setOnClickListener(new View.OnClickListener() { // from class: M0.N
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.i1(builderActivity, m0O, view);
                }
            });
            m0O.f15467l.setVisibility(BuilderActivity.b3(builderActivity).B1() ? 0 : 8);
            m0O.f15467l.setChecked(BuilderActivity.b3(builderActivity).l3());
            m0O.f15467l.setOnClickListener(new View.OnClickListener() { // from class: M0.O
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.j1(builderActivity, m0O, view);
                }
            });
            m0O.f15465j.setVisibility(BuilderActivity.b3(builderActivity).y1() ? 0 : 8);
            m0O.f15465j.setChecked(BuilderActivity.b3(builderActivity).M1());
            m0O.f15465j.setOnClickListener(new View.OnClickListener() { // from class: M0.P
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.k1(builderActivity, m0O, view);
                }
            });
            m0O.f15457b.setVisibility(BuilderActivity.b3(builderActivity).v1() ? 0 : 8);
            m0O.f15457b.setChecked(BuilderActivity.b3(builderActivity).O0());
            m0O.f15457b.setOnClickListener(new View.OnClickListener() { // from class: M0.Q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.l1(builderActivity, m0O, view);
                }
            });
            m0O.f15462g.setVisibility(BuilderActivity.b3(builderActivity).N0() ? 8 : 0);
            m0O.f15462g.setChecked(BuilderActivity.b3(builderActivity).Z0());
            m0O.f15462g.setOnClickListener(new View.OnClickListener() { // from class: M0.S
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.m1(builderActivity, m0O, view);
                }
            });
            SwitchCompat switchCompat = m0O.f15465j;
            String string = switchCompat.getText().toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string.toLowerCase(locale);
            h3.m.d(lowerCase, "toLowerCase(...)");
            switchCompat.setText(lowerCase);
            SwitchCompat switchCompat2 = m0O.f15457b;
            String lowerCase2 = switchCompat2.getText().toString().toLowerCase(locale);
            h3.m.d(lowerCase2, "toLowerCase(...)");
            switchCompat2.setText(lowerCase2);
            SwitchCompat switchCompat3 = m0O.f15462g;
            String lowerCase3 = switchCompat3.getText().toString().toLowerCase(locale);
            h3.m.d(lowerCase3, "toLowerCase(...)");
            switchCompat3.setText(lowerCase3);
            m0O.f15466k.setOnCheckedChangeListener(null);
            int i4 = C0154a.f11802b[BuilderActivity.b3(builderActivity).S0().ordinal()];
            if (i4 == 1) {
                m0O.f15466k.check(AbstractC0920x.f15019f1);
            } else if (i4 == 2) {
                m0O.f15466k.check(AbstractC0920x.f15009d1);
            } else {
                if (i4 != 3) {
                    throw new T2.j();
                }
                m0O.f15466k.check(AbstractC0920x.f15014e1);
            }
            m0O.f15466k.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: M0.T
                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                public final void onCheckedChanged(RadioGroup radioGroup, int i5) {
                    BuilderActivity.a.n1(builderActivity, radioGroup, i5);
                }
            });
            m0O.f15458c.setEnabled(!BuilderActivity.b3(builderActivity).T1());
            m0O.f15460e.setEnabled(!BuilderActivity.b3(builderActivity).S1());
            m0O.f15459d.setEnabled(!BuilderActivity.b3(builderActivity).S1());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e2(BuilderActivity builderActivity, m mVar, RadioGroup radioGroup, int i4) {
            if (i4 == AbstractC0920x.I6) {
                BuilderActivity.b3(builderActivity).s2(Cells.DYNAMIC_CHECKERS);
            } else if (i4 == AbstractC0920x.H6) {
                BuilderActivity.b3(builderActivity).s2(Cells.DYNAMIC_HEX);
            } else if (i4 == AbstractC0920x.f14964T) {
                BuilderActivity.b3(builderActivity).s2(Cells.ALQUERQUE);
            } else if (i4 == AbstractC0920x.f15110x2) {
                BuilderActivity.b3(builderActivity).s2(Cells.HEXAGON);
            } else if (i4 == AbstractC0920x.a8) {
                BuilderActivity.b3(builderActivity).s2(Cells.ZAMMA);
            } else if (i4 == AbstractC0920x.f15038j0) {
                BuilderActivity.b3(builderActivity).s2(Cells.BLACK);
            } else if (i4 == AbstractC0920x.J7) {
                BuilderActivity.b3(builderActivity).s2(Cells.WHITE);
            } else if (i4 == AbstractC0920x.f14960S) {
                BuilderActivity.b3(builderActivity).s2(Cells.ALL);
            }
            mVar.R(BuilderActivity.b3(builderActivity).T0());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f1(BuilderActivity builderActivity, M0 m02, View view) throws Resources.NotFoundException {
            BuilderActivity.b3(builderActivity).f3(m02.f15468m.isChecked());
            m02.f15463h.setChecked(BuilderActivity.b3(builderActivity).q1());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f2(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).t2(Cylinder.NONE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g1(BuilderActivity builderActivity, M0 m02, View view) throws Resources.NotFoundException {
            BuilderActivity.b3(builderActivity).B2(m02.f15463h.isChecked());
            m02.f15468m.setChecked(BuilderActivity.b3(builderActivity).n3());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g2(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).t2(Cylinder.HORIZONTAL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h1(BuilderActivity builderActivity, M0 m02, View view) {
            BuilderActivity.b3(builderActivity).D2(m02.f15464i.isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void h2(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).t2(Cylinder.VERTICAL);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void i1(BuilderActivity builderActivity, M0 m02, View view) {
            BuilderActivity.b3(builderActivity).v2(m02.f15461f.isChecked());
        }

        private final void i2(final n nVar) throws Resources.NotFoundException {
            nVar.R(BuilderActivity.b3(BuilderActivity.this));
            final P0 p0O = nVar.O();
            final BuilderActivity builderActivity = BuilderActivity.this;
            p0O.f15515d.setOnClickListener(new View.OnClickListener() { // from class: M0.B
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) throws Resources.NotFoundException {
                    BuilderActivity.a.j2(builderActivity, p0O, nVar, view);
                }
            });
            nVar.P(BuilderActivity.b3(builderActivity).p2());
            p0O.f15520i.setOnClickListener(new View.OnClickListener() { // from class: M0.C
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.k2(builderActivity, view);
                }
            });
            p0O.f15519h.setOnClickListener(new View.OnClickListener() { // from class: M0.D
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.l2(builderActivity, view);
                }
            });
            p0O.f15521j.setOnClickListener(new View.OnClickListener() { // from class: M0.E
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.m2(builderActivity, view);
                }
            });
            p0O.f15522k.setOnClickListener(new View.OnClickListener() { // from class: M0.F
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.n2(builderActivity, view);
                }
            });
            p0O.f15514c.setListener(BuilderActivity.b3(builderActivity));
            p0O.f15514c.setGridMode(BuilderActivity.b3(builderActivity).l1());
            p0O.f15514c.H1(BuilderActivity.b3(builderActivity).k1(), BuilderActivity.b3(builderActivity).f1(), BuilderActivity.b3(builderActivity).o1());
            nVar.Q(BuilderActivity.b3(builderActivity).x3(), BuilderActivity.b3(builderActivity).y3());
            p0O.f15513b.setOnClickListener(new View.OnClickListener() { // from class: M0.G
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.o2(builderActivity, view);
                }
            });
            p0O.f15517f.setOnClickListener(new View.OnClickListener() { // from class: M0.H
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.p2(builderActivity, view);
                }
            });
            p0O.f15518g.setOnClickListener(new View.OnClickListener() { // from class: M0.I
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.q2(builderActivity, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j1(BuilderActivity builderActivity, M0 m02, View view) {
            BuilderActivity.b3(builderActivity).d3(m02.f15467l.isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j2(BuilderActivity builderActivity, P0 p02, n nVar, View view) throws Resources.NotFoundException {
            BuilderActivity.b3(builderActivity).u2(p02.f15515d.isChecked());
            nVar.R(BuilderActivity.b3(builderActivity));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k1(BuilderActivity builderActivity, M0 m02, View view) {
            BuilderActivity.b3(builderActivity).Q2(m02.f15465j.isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void k2(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).n2(d.a.f11886e);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l1(BuilderActivity builderActivity, M0 m02, View view) {
            BuilderActivity.b3(builderActivity).q2(m02.f15457b.isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void l2(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).n2(d.a.f11887f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m1(BuilderActivity builderActivity, M0 m02, View view) {
            BuilderActivity.b3(builderActivity).w2(m02.f15462g.isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void m2(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).n2(d.a.f11890i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n1(BuilderActivity builderActivity, RadioGroup radioGroup, int i4) {
            if (i4 == AbstractC0920x.f15019f1) {
                BuilderActivity.b3(builderActivity).r2(CaptureSelf.NO);
            } else if (i4 == AbstractC0920x.f15009d1) {
                BuilderActivity.b3(builderActivity).r2(CaptureSelf.CAN);
            } else if (i4 == AbstractC0920x.f15014e1) {
                BuilderActivity.b3(builderActivity).r2(CaptureSelf.MUST);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n2(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).n2(d.a.f11891j);
        }

        private final void o1(final f fVar) throws Resources.NotFoundException {
            fVar.R().d(BuilderActivity.b3(BuilderActivity.this).G1(), BuilderActivity.b3(BuilderActivity.this).T0().isHex());
            MoveMask moveMaskR = fVar.R();
            final BuilderActivity builderActivity = BuilderActivity.this;
            moveMaskR.setChangeListener(new MoveMask.a() { // from class: M0.w
                @Override // cab.shashki.app.ui.universal.MoveMask.a
                public final void a(int i4) {
                    BuilderActivity.a.A1(builderActivity, i4);
                }
            });
            fVar.P().setChecked(BuilderActivity.b3(BuilderActivity.this).D1());
            SwitchCompat switchCompatP = fVar.P();
            final BuilderActivity builderActivity2 = BuilderActivity.this;
            switchCompatP.setOnClickListener(new View.OnClickListener() { // from class: M0.x
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.B1(fVar, builderActivity2, view);
                }
            });
            int i4 = 8;
            fVar.P().setVisibility(BuilderActivity.b3(BuilderActivity.this).H1() ? 0 : 8);
            fVar.Q().setChecked(BuilderActivity.b3(BuilderActivity.this).F1());
            SwitchCompat switchCompatQ = fVar.Q();
            final BuilderActivity builderActivity3 = BuilderActivity.this;
            switchCompatQ.setOnClickListener(new View.OnClickListener() { // from class: M0.z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.C1(builderActivity3, fVar, view);
                }
            });
            SwitchCompat switchCompatQ2 = fVar.Q();
            if (BuilderActivity.b3(BuilderActivity.this).H1() && !BuilderActivity.b3(BuilderActivity.this).D1()) {
                i4 = 0;
            }
            switchCompatQ2.setVisibility(i4);
            fVar.O().setChecked(BuilderActivity.b3(BuilderActivity.this).H1());
            SwitchCompat switchCompatO = fVar.O();
            final BuilderActivity builderActivity4 = BuilderActivity.this;
            switchCompatO.setOnClickListener(new View.OnClickListener() { // from class: M0.A
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.D1(fVar, builderActivity4, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void o2(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).V2(1);
        }

        private final void p1(final g gVar) throws Resources.NotFoundException {
            gVar.P().d(BuilderActivity.b3(BuilderActivity.this).J1(), BuilderActivity.b3(BuilderActivity.this).T0().isHex());
            MoveMask moveMaskP = gVar.P();
            final BuilderActivity builderActivity = BuilderActivity.this;
            moveMaskP.setChangeListener(new MoveMask.a() { // from class: M0.c
                @Override // cab.shashki.app.ui.universal.MoveMask.a
                public final void a(int i4) {
                    BuilderActivity.a.v1(builderActivity, i4);
                }
            });
            gVar.O().setChecked(BuilderActivity.b3(BuilderActivity.this).d1());
            SwitchCompat switchCompatO = gVar.O();
            final BuilderActivity builderActivity2 = BuilderActivity.this;
            switchCompatO.setOnClickListener(new View.OnClickListener() { // from class: M0.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.w1(builderActivity2, gVar, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p2(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).V2(-1);
        }

        private final void q1(final j jVar) throws Resources.NotFoundException {
            jVar.P().d(BuilderActivity.b3(BuilderActivity.this).V1(), BuilderActivity.b3(BuilderActivity.this).T0().isHex());
            MoveMask moveMaskP = jVar.P();
            final BuilderActivity builderActivity = BuilderActivity.this;
            moveMaskP.setChangeListener(new MoveMask.a() { // from class: M0.t
                @Override // cab.shashki.app.ui.universal.MoveMask.a
                public final void a(int i4) {
                    BuilderActivity.a.x1(builderActivity, i4);
                }
            });
            jVar.Q().setChecked(BuilderActivity.b3(BuilderActivity.this).W1());
            SwitchCompat switchCompatQ = jVar.Q();
            final BuilderActivity builderActivity2 = BuilderActivity.this;
            switchCompatQ.setOnClickListener(new View.OnClickListener() { // from class: M0.u
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.y1(builderActivity2, jVar, view);
                }
            });
            jVar.O().setChecked(BuilderActivity.b3(BuilderActivity.this).U1());
            SwitchCompat switchCompatO = jVar.O();
            final BuilderActivity builderActivity3 = BuilderActivity.this;
            switchCompatO.setOnClickListener(new View.OnClickListener() { // from class: M0.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.z1(builderActivity3, jVar, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q2(BuilderActivity builderActivity, View view) {
            BuilderActivity.b3(builderActivity).V2(0);
        }

        private final void r1(final k kVar) throws Resources.NotFoundException {
            kVar.R().d(BuilderActivity.b3(BuilderActivity.this).Y1(), BuilderActivity.b3(BuilderActivity.this).T0().isHex());
            MoveMask moveMaskR = kVar.R();
            final BuilderActivity builderActivity = BuilderActivity.this;
            moveMaskR.setChangeListener(new MoveMask.a() { // from class: M0.U
                @Override // cab.shashki.app.ui.universal.MoveMask.a
                public final void a(int i4) {
                    BuilderActivity.a.s1(builderActivity, i4);
                }
            });
            kVar.P().setVisibility(BuilderActivity.b3(BuilderActivity.this).X1() > 0 ? 0 : 8);
            kVar.P().setChecked(BuilderActivity.b3(BuilderActivity.this).E1());
            TextView textViewQ = kVar.Q();
            BuilderActivity builderActivity2 = BuilderActivity.this;
            textViewQ.setText(builderActivity2.getString(AbstractC0888D.f14535q2, Integer.valueOf(BuilderActivity.b3(builderActivity2).X1())));
            kVar.O().setProgress(BuilderActivity.b3(BuilderActivity.this).X1());
            C0573k c0573k = C0573k.f2973a;
            AppCompatSeekBar appCompatSeekBarO = kVar.O();
            final BuilderActivity builderActivity3 = BuilderActivity.this;
            c0573k.y(appCompatSeekBarO, new InterfaceC1016l() { // from class: M0.W
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return BuilderActivity.a.t1(builderActivity3, kVar, ((Integer) obj).intValue());
                }
            });
            SwitchCompat switchCompatP = kVar.P();
            final BuilderActivity builderActivity4 = BuilderActivity.this;
            switchCompatP.setOnClickListener(new View.OnClickListener() { // from class: M0.X
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuilderActivity.a.u1(builderActivity4, kVar, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s1(BuilderActivity builderActivity, int i4) {
            BuilderActivity.b3(builderActivity).a3(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u t1(BuilderActivity builderActivity, k kVar, int i4) throws Resources.NotFoundException {
            BuilderActivity.b3(builderActivity).Z2(i4);
            kVar.Q().setText(builderActivity.getString(AbstractC0888D.f14535q2, Integer.valueOf(BuilderActivity.b3(builderActivity).X1())));
            kVar.P().setChecked(BuilderActivity.b3(builderActivity).E1());
            kVar.P().setVisibility(i4 <= 0 ? 8 : 0);
            return u.f3817a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u1(BuilderActivity builderActivity, k kVar, View view) {
            ((cab.shashki.app.ui.universal.a) builderActivity.X2()).F2(kVar.P().isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v1(BuilderActivity builderActivity, int i4) {
            BuilderActivity.b3(builderActivity).K2(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void w1(BuilderActivity builderActivity, g gVar, View view) {
            BuilderActivity.b3(builderActivity).z2(gVar.O().isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void x1(BuilderActivity builderActivity, int i4) {
            BuilderActivity.b3(builderActivity).X2(i4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y1(BuilderActivity builderActivity, j jVar, View view) {
            BuilderActivity.b3(builderActivity).Y2(jVar.Q().isChecked());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z1(BuilderActivity builderActivity, j jVar, View view) {
            BuilderActivity.b3(builderActivity).W2(jVar.O().isChecked());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            return this.f11796d;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int j(int i4) {
            return i4;
        }

        public final l r2() {
            return this.f11798f;
        }

        public final m s2() {
            return this.f11797e;
        }

        public final n t2() {
            return this.f11799g;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public void u(RecyclerView.D d4, int i4) throws Resources.NotFoundException {
            h3.m.e(d4, "holder");
            switch (i4) {
                case 0:
                    E1((i) d4);
                    break;
                case 1:
                    W1((m) d4);
                    break;
                case 2:
                    H1((l) d4);
                    break;
                case 3:
                    i2((n) d4);
                    break;
                case 4:
                    r1((k) d4);
                    break;
                case 5:
                    p1((g) d4);
                    break;
                case 6:
                    q1((j) d4);
                    break;
                case 7:
                    o1((f) d4);
                    break;
                case 8:
                    T0((e) d4);
                    break;
                case 9:
                    e1((h) d4);
                    break;
            }
        }

        public final void u2() {
            P0 p0O;
            ShashkiBoardView shashkiBoardView;
            N0 n0O;
            ShashkiBoardView shashkiBoardView2;
            J0 j0O;
            ShashkiBoardView shashkiBoardView3;
            P0 p0O2;
            ShashkiBoardView shashkiBoardView4;
            N0 n0O2;
            ShashkiBoardView shashkiBoardView5;
            J0 j0O2;
            ShashkiBoardView shashkiBoardView6;
            m mVar = this.f11797e;
            if (mVar != null && (j0O2 = mVar.O()) != null && (shashkiBoardView6 = j0O2.f15398b) != null) {
                shashkiBoardView6.setGridMode(BuilderActivity.b3(BuilderActivity.this).l1());
            }
            l lVar = this.f11798f;
            if (lVar != null && (n0O2 = lVar.O()) != null && (shashkiBoardView5 = n0O2.f15475b) != null) {
                shashkiBoardView5.setGridMode(BuilderActivity.b3(BuilderActivity.this).l1());
            }
            n nVar = this.f11799g;
            if (nVar != null && (p0O2 = nVar.O()) != null && (shashkiBoardView4 = p0O2.f15514c) != null) {
                shashkiBoardView4.setGridMode(BuilderActivity.b3(BuilderActivity.this).l1());
            }
            m mVar2 = this.f11797e;
            if (mVar2 != null && (j0O = mVar2.O()) != null && (shashkiBoardView3 = j0O.f15398b) != null) {
                shashkiBoardView3.H1(BuilderActivity.b3(BuilderActivity.this).k1(), BuilderActivity.b3(BuilderActivity.this).f1(), BuilderActivity.b3(BuilderActivity.this).o1());
            }
            l lVar2 = this.f11798f;
            if (lVar2 != null && (n0O = lVar2.O()) != null && (shashkiBoardView2 = n0O.f15475b) != null) {
                shashkiBoardView2.H1(BuilderActivity.b3(BuilderActivity.this).k1(), BuilderActivity.b3(BuilderActivity.this).f1(), BuilderActivity.b3(BuilderActivity.this).o1());
            }
            n nVar2 = this.f11799g;
            if (nVar2 == null || (p0O = nVar2.O()) == null || (shashkiBoardView = p0O.f15514c) == null) {
                return;
            }
            shashkiBoardView.H1(BuilderActivity.b3(BuilderActivity.this).k1(), BuilderActivity.b3(BuilderActivity.this).f1(), BuilderActivity.b3(BuilderActivity.this).o1());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public RecyclerView.D w(ViewGroup viewGroup, int i4) {
            h3.m.e(viewGroup, "parent");
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
            switch (i4) {
                case 0:
                    View viewInflate = layoutInflaterFrom.inflate(AbstractC0922z.f15187d1, viewGroup, false);
                    h3.m.d(viewInflate, "inflate(...)");
                    return new i(viewInflate);
                case 1:
                    J0 j0D = J0.d(layoutInflaterFrom, viewGroup, false);
                    h3.m.d(j0D, "inflate(...)");
                    m mVar = new m(j0D);
                    this.f11797e = mVar;
                    return mVar;
                case 2:
                    N0 n0D = N0.d(layoutInflaterFrom, viewGroup, false);
                    h3.m.d(n0D, "inflate(...)");
                    l lVar = new l(n0D);
                    this.f11798f = lVar;
                    return lVar;
                case 3:
                    P0 p0D = P0.d(layoutInflaterFrom, viewGroup, false);
                    h3.m.d(p0D, "inflate(...)");
                    n nVar = new n(p0D);
                    this.f11799g = nVar;
                    return nVar;
                case 4:
                    View viewInflate2 = layoutInflaterFrom.inflate(AbstractC0922z.f15193f1, viewGroup, false);
                    h3.m.d(viewInflate2, "inflate(...)");
                    return new k(viewInflate2);
                case 5:
                    View viewInflate3 = layoutInflaterFrom.inflate(AbstractC0922z.f15181b1, viewGroup, false);
                    h3.m.d(viewInflate3, "inflate(...)");
                    return new g(viewInflate3);
                case 6:
                    View viewInflate4 = layoutInflaterFrom.inflate(AbstractC0922z.f15190e1, viewGroup, false);
                    h3.m.d(viewInflate4, "inflate(...)");
                    return new j(viewInflate4);
                case 7:
                    View viewInflate5 = layoutInflaterFrom.inflate(AbstractC0922z.f15178a1, viewGroup, false);
                    h3.m.d(viewInflate5, "inflate(...)");
                    return new f(viewInflate5);
                case 8:
                    L0 l0D = L0.d(layoutInflaterFrom, viewGroup, false);
                    h3.m.d(l0D, "inflate(...)");
                    return new e(l0D);
                case 9:
                    M0 m0D = M0.d(layoutInflaterFrom, viewGroup, false);
                    h3.m.d(m0D, "inflate(...)");
                    return new h(m0D);
                default:
                    throw new T2.k(null, 1, null);
            }
        }

        public /* synthetic */ a(BuilderActivity builderActivity, int i4, int i5, h3.h hVar) {
            this((i5 & 1) != 0 ? 10 : i4);
        }
    }

    public static final class b {
        public /* synthetic */ b(h3.h hVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final TextView f11803u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(TextView textView) {
            super(textView);
            h3.m.e(textView, "view");
            this.f11803u = textView;
        }

        public final TextView O() {
            return this.f11803u;
        }
    }

    public static final class d extends RecyclerView.h {

        /* renamed from: d, reason: collision with root package name */
        private List f11804d;

        public d(List list) {
            h3.m.e(list, "data");
            this.f11804d = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public void u(c cVar, int i4) {
            h3.m.e(cVar, "holder");
            cVar.O().setText((CharSequence) this.f11804d.get(i4));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public c w(ViewGroup viewGroup, int i4) {
            h3.m.e(viewGroup, "parent");
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC0922z.f15226u0, viewGroup, false);
            h3.m.c(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
            return new c((TextView) viewInflate);
        }

        public final void H(List list) {
            h3.m.e(list, "<set-?>");
            this.f11804d = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            return this.f11804d.size();
        }
    }

    public static final class e extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final L0 f11805u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(L0 l02) {
            super(l02.a());
            h3.m.e(l02, "binding");
            this.f11805u = l02;
        }

        public final L0 O() {
            return this.f11805u;
        }
    }

    public static final class f extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final MoveMask f11806u;

        /* renamed from: v, reason: collision with root package name */
        private final SwitchCompat f11807v;

        /* renamed from: w, reason: collision with root package name */
        private final SwitchCompat f11808w;

        /* renamed from: x, reason: collision with root package name */
        private final SwitchCompat f11809x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(View view) {
            super(view);
            h3.m.e(view, "view");
            View viewFindViewById = view.findViewById(AbstractC0920x.b4);
            h3.m.b(viewFindViewById);
            this.f11806u = (MoveMask) viewFindViewById;
            View viewFindViewById2 = view.findViewById(AbstractC0920x.f15106w3);
            h3.m.b(viewFindViewById2);
            this.f11807v = (SwitchCompat) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(AbstractC0920x.f14894C3);
            h3.m.b(viewFindViewById3);
            this.f11808w = (SwitchCompat) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(AbstractC0920x.f14995a2);
            h3.m.b(viewFindViewById4);
            this.f11809x = (SwitchCompat) viewFindViewById4;
        }

        public final SwitchCompat O() {
            return this.f11809x;
        }

        public final SwitchCompat P() {
            return this.f11807v;
        }

        public final SwitchCompat Q() {
            return this.f11808w;
        }

        public final MoveMask R() {
            return this.f11806u;
        }
    }

    public static final class g extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final MoveMask f11810u;

        /* renamed from: v, reason: collision with root package name */
        private final SwitchCompat f11811v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(View view) {
            super(view);
            h3.m.e(view, "view");
            View viewFindViewById = view.findViewById(AbstractC0920x.b4);
            h3.m.b(viewFindViewById);
            this.f11810u = (MoveMask) viewFindViewById;
            View viewFindViewById2 = view.findViewById(AbstractC0920x.f14995a2);
            h3.m.b(viewFindViewById2);
            this.f11811v = (SwitchCompat) viewFindViewById2;
        }

        public final SwitchCompat O() {
            return this.f11811v;
        }

        public final MoveMask P() {
            return this.f11810u;
        }
    }

    public static final class h extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final M0 f11812u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(M0 m02) {
            super(m02.a());
            h3.m.e(m02, "binding");
            this.f11812u = m02;
        }

        public final M0 O() {
            return this.f11812u;
        }
    }

    public static final class i extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final TextView f11813u;

        /* renamed from: v, reason: collision with root package name */
        private final TextInputEditText f11814v;

        /* renamed from: w, reason: collision with root package name */
        private final AppCompatSpinner f11815w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(View view) {
            super(view);
            h3.m.e(view, "view");
            View viewFindViewById = view.findViewById(AbstractC0920x.f14935L2);
            h3.m.b(viewFindViewById);
            this.f11813u = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(AbstractC0920x.i4);
            h3.m.b(viewFindViewById2);
            this.f11814v = (TextInputEditText) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(AbstractC0920x.u6);
            h3.m.b(viewFindViewById3);
            this.f11815w = (AppCompatSpinner) viewFindViewById3;
        }

        public final TextView O() {
            return this.f11813u;
        }

        public final TextInputEditText P() {
            return this.f11814v;
        }

        public final AppCompatSpinner Q() {
            return this.f11815w;
        }
    }

    public static final class j extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final MoveMask f11816u;

        /* renamed from: v, reason: collision with root package name */
        private final SwitchCompat f11817v;

        /* renamed from: w, reason: collision with root package name */
        private final SwitchCompat f11818w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(View view) {
            super(view);
            h3.m.e(view, "view");
            View viewFindViewById = view.findViewById(AbstractC0920x.b4);
            h3.m.b(viewFindViewById);
            this.f11816u = (MoveMask) viewFindViewById;
            View viewFindViewById2 = view.findViewById(AbstractC0920x.N4);
            h3.m.b(viewFindViewById2);
            this.f11817v = (SwitchCompat) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(AbstractC0920x.f14916H0);
            h3.m.b(viewFindViewById3);
            this.f11818w = (SwitchCompat) viewFindViewById3;
        }

        public final SwitchCompat O() {
            return this.f11818w;
        }

        public final MoveMask P() {
            return this.f11816u;
        }

        public final SwitchCompat Q() {
            return this.f11817v;
        }
    }

    public static final class k extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final MoveMask f11819u;

        /* renamed from: v, reason: collision with root package name */
        private final AppCompatSeekBar f11820v;

        /* renamed from: w, reason: collision with root package name */
        private final TextView f11821w;

        /* renamed from: x, reason: collision with root package name */
        private final SwitchCompat f11822x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(View view) {
            super(view);
            h3.m.e(view, "view");
            View viewFindViewById = view.findViewById(AbstractC0920x.b4);
            h3.m.b(viewFindViewById);
            this.f11819u = (MoveMask) viewFindViewById;
            View viewFindViewById2 = view.findViewById(AbstractC0920x.f15111x3);
            h3.m.b(viewFindViewById2);
            this.f11820v = (AppCompatSeekBar) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(AbstractC0920x.f15121z3);
            h3.m.b(viewFindViewById3);
            this.f11821w = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(AbstractC0920x.f15116y3);
            h3.m.b(viewFindViewById4);
            this.f11822x = (SwitchCompat) viewFindViewById4;
        }

        public final AppCompatSeekBar O() {
            return this.f11820v;
        }

        public final SwitchCompat P() {
            return this.f11822x;
        }

        public final TextView Q() {
            return this.f11821w;
        }

        public final MoveMask R() {
            return this.f11819u;
        }
    }

    public static final class l extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final N0 f11823u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(N0 n02) {
            super(n02.a());
            h3.m.e(n02, "binding");
            this.f11823u = n02;
        }

        public final N0 O() {
            return this.f11823u;
        }

        public final void P(d.a aVar) {
            h3.m.e(aVar, "posMode");
            O0 o02 = this.f11823u.f15477d;
            o02.f15498j.setSelected(aVar == d.a.f11885d);
            o02.f15492d.setSelected(aVar == d.a.f11886e);
            o02.f15490b.setSelected(aVar == d.a.f11887f);
            o02.f15493e.setSelected(aVar == d.a.f11888g);
            o02.f15491c.setSelected(aVar == d.a.f11889h);
            o02.f15494f.setSelected(aVar == d.a.f11890i);
            o02.f15496h.setSelected(aVar == d.a.f11891j);
            o02.f15495g.setSelected(aVar == d.a.f11892k);
            o02.f15497i.setSelected(aVar == d.a.f11893l);
        }

        public final void Q(cab.shashki.app.ui.universal.a aVar) {
            h3.m.e(aVar, "presenter");
            boolean zE1 = aVar.e1();
            boolean zIsHex = aVar.T0().isHex();
            boolean zZ1 = aVar.z1();
            boolean zIsDynamic = aVar.T0().isDynamic();
            O0 o02 = this.f11823u.f15477d;
            o02.f15502n.setEnabled((zE1 || zIsHex || zZ1) ? false : true);
            o02.f15499k.setEnabled(!zIsDynamic);
            o02.f15499k.setText(zIsHex ? AbstractC0888D.b5 : AbstractC0888D.f14543s0);
            int i4 = zE1 ? 0 : 8;
            int i5 = (!zE1 || zIsHex) ? 8 : 0;
            int i6 = zIsDynamic ? 8 : 0;
            o02.f15494f.setVisibility(i4);
            o02.f15496h.setVisibility(i5);
            o02.f15495g.setVisibility(i4);
            o02.f15497i.setVisibility(i5);
            o02.f15491c.setVisibility(i6);
            o02.f15493e.setVisibility(i6);
        }
    }

    public static final class m extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final J0 f11824u;

        /* renamed from: v, reason: collision with root package name */
        private final d f11825v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(J0 j02) {
            super(j02.a());
            h3.m.e(j02, "binding");
            this.f11824u = j02;
            d dVar = new d(p.g());
            this.f11825v = dVar;
            j02.f15400d.f15418p.setAdapter(dVar);
        }

        public final J0 O() {
            return this.f11824u;
        }

        public final void P(List list) {
            h3.m.e(list, "details");
            this.f11825v.H(list);
            this.f11825v.m();
        }

        public final void Q(d.b bVar) {
            h3.m.e(bVar, "lockMode");
            K0 k02 = this.f11824u.f15400d;
            k02.f15411i.setSelected(bVar == d.b.f11898f);
            k02.f15416n.setSelected(bVar == d.b.f11900h);
            k02.f15414l.setSelected(bVar == d.b.f11897e);
            k02.f15417o.setSelected(bVar == d.b.f11896d);
            k02.f15415m.setSelected(bVar == d.b.f11899g);
        }

        public final void R(Cells cells) {
            h3.m.e(cells, "cells");
            K0 k02 = this.f11824u.f15400d;
            if (cells.isHex()) {
                k02.f15413k.setVisibility(4);
                k02.f15410h.setVisibility(4);
                k02.f15412j.setVisibility(4);
                k02.f15408f.setVisibility(4);
                k02.f15421s.setMax(cells == Cells.HEXAGON ? 5 : 3);
                return;
            }
            k02.f15408f.setVisibility(0);
            k02.f15413k.setVisibility(0);
            k02.f15410h.setVisibility(0);
            k02.f15412j.setVisibility(0);
            k02.f15421s.setMax(cells == Cells.DYNAMIC_CHECKERS ? 12 : 13);
        }

        public final void S(Cylinder cylinder, boolean z4, boolean z5) {
            K0 k02 = this.f11824u.f15400d;
            k02.f15413k.setSelected(cylinder == Cylinder.NONE);
            k02.f15410h.setSelected(cylinder == Cylinder.HORIZONTAL);
            k02.f15412j.setSelected(cylinder == Cylinder.VERTICAL);
            k02.f15410h.setEnabled(z4);
            k02.f15412j.setEnabled(z5);
        }
    }

    public static final class n extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final P0 f11826u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(P0 p02) {
            super(p02.a());
            h3.m.e(p02, "binding");
            this.f11826u = p02;
        }

        public final P0 O() {
            return this.f11826u;
        }

        public final void P(d.a aVar) {
            h3.m.e(aVar, "zone");
            P0 p02 = this.f11826u;
            p02.f15520i.setSelected(aVar == d.a.f11886e);
            p02.f15519h.setSelected(aVar == d.a.f11887f);
            p02.f15521j.setSelected(aVar == d.a.f11890i);
            p02.f15522k.setSelected(aVar == d.a.f11891j);
        }

        public final void Q(int i4, String str) {
            h3.m.e(str, "position");
            P0 p02 = this.f11826u;
            p02.f15513b.setSelected(i4 > 0);
            p02.f15517f.setSelected(i4 < 0);
            p02.f15518g.setSelected(i4 == 0);
            p02.f15514c.setPosition(str);
        }

        public final void R(cab.shashki.app.ui.universal.a aVar) throws Resources.NotFoundException {
            h3.m.e(aVar, "presenter");
            boolean zX1 = aVar.x1();
            boolean zE1 = aVar.e1();
            boolean zIsHex = aVar.T0().isHex();
            P0 p02 = this.f11826u;
            p02.f15515d.setChecked(zX1);
            int i4 = 4;
            int i5 = zX1 ? 8 : zE1 ? 0 : 4;
            if (zX1) {
                i4 = 8;
            } else if (zE1 && !zIsHex) {
                i4 = 0;
            }
            p02.f15521j.setVisibility(i5);
            p02.f15522k.setVisibility(i4);
            int i6 = zX1 ? 8 : 0;
            p02.f15520i.setVisibility(i6);
            p02.f15519h.setVisibility(i6);
            p02.f15513b.setVisibility(i6);
            p02.f15517f.setVisibility(i6);
            p02.f15518g.setVisibility(i6);
            p02.f15514c.setVisibility(i6);
        }
    }

    public static final class o extends ViewPager2.i {
        o() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i4) {
            String string;
            J0 j0O;
            ShashkiBoardView shashkiBoardView;
            N0 n0O;
            ShashkiBoardView shashkiBoardView2;
            BuilderActivity.b3(BuilderActivity.this).e3(i4);
            BuilderActivity builderActivity = BuilderActivity.this;
            if (BuilderActivity.b3(builderActivity).a2()) {
                string = BuilderActivity.b3(BuilderActivity.this).O1();
            } else {
                string = BuilderActivity.this.getString(AbstractC0888D.f14408P);
                h3.m.d(string, "getString(...)");
            }
            builderActivity.a(string + " " + (i4 + 1) + "/10");
            a aVar = null;
            if (i4 == 1) {
                a aVar2 = BuilderActivity.this.f11794K;
                if (aVar2 == null) {
                    h3.m.r("adapter");
                } else {
                    aVar = aVar2;
                }
                m mVarS2 = aVar.s2();
                if (mVarS2 == null || (j0O = mVarS2.O()) == null || (shashkiBoardView = j0O.f15398b) == null) {
                    return;
                }
                shashkiBoardView.V2();
                return;
            }
            if (i4 != 2) {
                return;
            }
            a aVar3 = BuilderActivity.this.f11794K;
            if (aVar3 == null) {
                h3.m.r("adapter");
            } else {
                aVar = aVar3;
            }
            l lVarR2 = aVar.r2();
            if (lVarR2 == null || (n0O = lVarR2.O()) == null || (shashkiBoardView2 = n0O.f15475b) == null) {
                return;
            }
            shashkiBoardView2.V2();
        }
    }

    public static final /* synthetic */ cab.shashki.app.ui.universal.a b3(BuilderActivity builderActivity) {
        return (cab.shashki.app.ui.universal.a) builderActivity.V2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(BuilderActivity builderActivity, View view) {
        ((cab.shashki.app.ui.universal.a) builderActivity.V2()).P1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f3(View view, View view2, MotionEvent motionEvent) {
        return view.onTouchEvent(motionEvent);
    }

    @Override // cab.shashki.app.ui.universal.d
    public void A() {
        a aVar = this.f11794K;
        if (aVar == null) {
            h3.m.r("adapter");
            aVar = null;
        }
        aVar.u2();
    }

    @Override // cab.shashki.app.ui.universal.d
    public void C() throws Resources.NotFoundException {
        a aVar = this.f11794K;
        a aVar2 = null;
        if (aVar == null) {
            h3.m.r("adapter");
            aVar = null;
        }
        l lVarR2 = aVar.r2();
        if (lVarR2 != null) {
            lVarR2.Q((cab.shashki.app.ui.universal.a) V2());
        }
        a aVar3 = this.f11794K;
        if (aVar3 == null) {
            h3.m.r("adapter");
        } else {
            aVar2 = aVar3;
        }
        n nVarT2 = aVar2.t2();
        if (nVarT2 != null) {
            nVarT2.R((cab.shashki.app.ui.universal.a) V2());
        }
    }

    @Override // cab.shashki.app.ui.universal.d
    public void F(int i4) {
        a aVar = this.f11794K;
        if (aVar == null) {
            h3.m.r("adapter");
            aVar = null;
        }
        aVar.n(i4);
    }

    @Override // cab.shashki.app.ui.universal.d
    public void M0(d.b bVar) {
        h3.m.e(bVar, "mode");
        a aVar = this.f11794K;
        if (aVar == null) {
            h3.m.r("adapter");
            aVar = null;
        }
        m mVarS2 = aVar.s2();
        if (mVarS2 != null) {
            mVarS2.Q(bVar);
        }
    }

    @Override // cab.shashki.app.ui.universal.d
    public void U0() {
        a aVar = this.f11794K;
        if (aVar == null) {
            h3.m.r("adapter");
            aVar = null;
        }
        aVar.p(1, 9);
    }

    @Override // cab.shashki.app.ui.universal.d
    public void d() {
        I0 i02 = this.f11793J;
        if (i02 == null) {
            h3.m.r("binding");
            i02 = null;
        }
        Snackbar.b0(i02.f15391d, AbstractC0888D.c5, -1).R();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: d3, reason: merged with bridge method [inline-methods] */
    public cab.shashki.app.ui.universal.a U2() {
        return new cab.shashki.app.ui.universal.a(this, getIntent().getIntExtra(HalmaParams.ID, -1), !getIntent().getBooleanExtra("template", false));
    }

    @Override // cab.shashki.app.ui.universal.d
    public void j1(List list) {
        h3.m.e(list, "details");
        a aVar = this.f11794K;
        if (aVar == null) {
            h3.m.r("adapter");
            aVar = null;
        }
        m mVarS2 = aVar.s2();
        if (mVarS2 != null) {
            mVarS2.P(list);
        }
    }

    @Override // cab.shashki.app.ui.universal.d
    public void k(boolean z4) {
        I0 i02 = this.f11793J;
        if (i02 == null) {
            h3.m.r("binding");
            i02 = null;
        }
        i02.f15390c.setText(z4 ? AbstractC0888D.f14500j2 : ((cab.shashki.app.ui.universal.a) V2()).a2() ? AbstractC0888D.f14478f0 : AbstractC0888D.f14406O1);
    }

    @Override // cab.shashki.app.ui.universal.d
    public void l0(Cylinder cylinder) {
        a aVar = this.f11794K;
        if (aVar == null) {
            h3.m.r("adapter");
            aVar = null;
        }
        m mVarS2 = aVar.s2();
        if (mVarS2 != null) {
            mVarS2.S(cylinder, ((cab.shashki.app.ui.universal.a) V2()).K0(), ((cab.shashki.app.ui.universal.a) V2()).L0());
        }
    }

    @Override // cab.shashki.app.ui.universal.d
    public void l1(d.a aVar) {
        h3.m.e(aVar, "mode");
        a aVar2 = this.f11794K;
        if (aVar2 == null) {
            h3.m.r("adapter");
            aVar2 = null;
        }
        l lVarR2 = aVar2.r2();
        if (lVarR2 != null) {
            lVarR2.P(aVar);
        }
    }

    @Override // cab.shashki.app.ui.universal.d
    public void m(boolean z4) {
        I0 i02 = null;
        if (!z4) {
            I0 i03 = this.f11793J;
            if (i03 == null) {
                h3.m.r("binding");
            } else {
                i02 = i03;
            }
            i02.f15392e.setVisibility(8);
            return;
        }
        I0 i04 = this.f11793J;
        if (i04 == null) {
            h3.m.r("binding");
        } else {
            i02 = i04;
        }
        i02.f15392e.setVisibility(0);
        a(((cab.shashki.app.ui.universal.a) V2()).O1());
    }

    @Override // cab.shashki.app.ui.universal.d
    public void n0(int i4) {
        I0 i02 = this.f11793J;
        I0 i03 = null;
        if (i02 == null) {
            h3.m.r("binding");
            i02 = null;
        }
        Snackbar.b0(i02.f15391d, AbstractC0888D.f14518n0, -1).R();
        I0 i04 = this.f11793J;
        if (i04 == null) {
            h3.m.r("binding");
        } else {
            i03 = i04;
        }
        i03.f15391d.setCurrentItem(i4);
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        I0 i0D = I0.d(getLayoutInflater());
        this.f11793J = i0D;
        I0 i02 = null;
        byte b4 = 0;
        if (i0D == null) {
            h3.m.r("binding");
            i0D = null;
        }
        setContentView(i0D.a());
        int i4 = 0;
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.f14408P, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        I0 i03 = this.f11793J;
        if (i03 == null) {
            h3.m.r("binding");
            i03 = null;
        }
        View view = i03.f15392e;
        h3.m.d(view, "preview");
        int i5 = 1;
        C0573k.s(c0573k, view, 0, 1, null);
        I0 i04 = this.f11793J;
        if (i04 == null) {
            h3.m.r("binding");
            i04 = null;
        }
        TextView textView = i04.f15390c;
        h3.m.d(textView, "next");
        C0573k.s(c0573k, textView, 0, 1, null);
        I0 i05 = this.f11793J;
        if (i05 == null) {
            h3.m.r("binding");
            i05 = null;
        }
        ViewPager2 viewPager2 = i05.f15391d;
        h3.m.d(viewPager2, "pager");
        C0573k.v(c0573k, viewPager2, 0, 1, null);
        I0 i06 = this.f11793J;
        if (i06 == null) {
            h3.m.r("binding");
            i06 = null;
        }
        i06.f15391d.g(new o());
        this.f11794K = new a(this, i4, i5, b4 == true ? 1 : 0);
        I0 i07 = this.f11793J;
        if (i07 == null) {
            h3.m.r("binding");
            i07 = null;
        }
        ViewPager2 viewPager22 = i07.f15391d;
        a aVar = this.f11794K;
        if (aVar == null) {
            h3.m.r("adapter");
            aVar = null;
        }
        viewPager22.setAdapter(aVar);
        I0 i08 = this.f11793J;
        if (i08 == null) {
            h3.m.r("binding");
            i08 = null;
        }
        i08.f15390c.setOnClickListener(new View.OnClickListener() { // from class: M0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                BuilderActivity.e3(this.f2654b, view2);
            }
        });
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, AbstractC0922z.f15220r0, R.id.text1);
        this.f11795L = arrayAdapter;
        arrayAdapter.setNotifyOnChange(false);
        I0 i09 = this.f11793J;
        if (i09 == null) {
            h3.m.r("binding");
            i09 = null;
        }
        final View childAt = i09.f15391d.getChildAt(0);
        I0 i010 = this.f11793J;
        if (i010 == null) {
            h3.m.r("binding");
        } else {
            i02 = i010;
        }
        i02.f15392e.setOnTouchListener(new View.OnTouchListener() { // from class: M0.b
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return BuilderActivity.f3(childAt, view2, motionEvent);
            }
        });
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((cab.shashki.app.ui.universal.a) V2()).v0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((cab.shashki.app.ui.universal.a) V2()).M0(this);
    }

    @Override // cab.shashki.app.ui.universal.d
    public void p() {
        N0 n0O;
        ShashkiBoardView shashkiBoardView;
        a aVar = this.f11794K;
        if (aVar == null) {
            h3.m.r("adapter");
            aVar = null;
        }
        l lVarR2 = aVar.r2();
        if (lVarR2 == null || (n0O = lVarR2.O()) == null || (shashkiBoardView = n0O.f15475b) == null) {
            return;
        }
        shashkiBoardView.setPosition(((cab.shashki.app.ui.universal.a) V2()).k3());
    }

    @Override // cab.shashki.app.ui.universal.d
    public void r(int i4) {
        I0 i02 = this.f11793J;
        if (i02 == null) {
            h3.m.r("binding");
            i02 = null;
        }
        i02.f15391d.setCurrentItem(i4);
    }

    @Override // cab.shashki.app.ui.universal.d
    public void w0(d.a aVar) {
        h3.m.e(aVar, "mode");
        a aVar2 = this.f11794K;
        if (aVar2 == null) {
            h3.m.r("adapter");
            aVar2 = null;
        }
        n nVarT2 = aVar2.t2();
        if (nVarT2 != null) {
            nVarT2.P(aVar);
            nVarT2.Q(((cab.shashki.app.ui.universal.a) V2()).x3(), ((cab.shashki.app.ui.universal.a) V2()).y3());
        }
    }
}