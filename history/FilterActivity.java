package cab.shashki.app.ui.history;

import I0.L;
import I0.U1;
import N0.C0573k;
import android.app.DatePickerDialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ScrollView;
import android.widget.TextView;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.ui.history.FilterActivity;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractC0916t;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C1000z;
import h3.h;
import h3.m;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class FilterActivity extends AbstractActivityC0911o implements U1 {

    /* renamed from: L, reason: collision with root package name */
    public static final a f11623L = new a(null);

    /* renamed from: J, reason: collision with root package name */
    private final DateFormat f11624J = DateFormat.getDateInstance(3);

    /* renamed from: K, reason: collision with root package name */
    private C1000z f11625K;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    private final void C3() {
        C1000z c1000z = this.f11625K;
        C1000z c1000z2 = null;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        c1000z.f15945F.setOnClickListener(new View.OnClickListener() { // from class: I0.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.D3(this.f1668b, view);
            }
        });
        C1000z c1000z3 = this.f11625K;
        if (c1000z3 == null) {
            m.r("binding");
        } else {
            c1000z2 = c1000z3;
        }
        c1000z2.f15946G.setOnClickListener(new View.OnClickListener() { // from class: I0.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.F3(this.f1671b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(final FilterActivity filterActivity, View view) {
        final Calendar calendar = Calendar.getInstance();
        Long lL0 = ((L) filterActivity.V2()).L0();
        if (lL0 != null) {
            calendar.setTimeInMillis(lL0.longValue());
        }
        new DatePickerDialog(filterActivity, new DatePickerDialog.OnDateSetListener() { // from class: I0.t
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i4, int i5, int i6) {
                FilterActivity.E3(calendar, filterActivity, datePicker, i4, i5, i6);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(Calendar calendar, FilterActivity filterActivity, DatePicker datePicker, int i4, int i5, int i6) {
        calendar.set(i4, i5, i6, 0, 0, 0);
        ((L) filterActivity.V2()).d1(calendar.getTimeInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(final FilterActivity filterActivity, View view) {
        final Calendar calendar = Calendar.getInstance();
        Long lM0 = ((L) filterActivity.V2()).M0();
        if (lM0 != null) {
            calendar.setTimeInMillis(lM0.longValue());
        }
        new DatePickerDialog(filterActivity, new DatePickerDialog.OnDateSetListener() { // from class: I0.u
            @Override // android.app.DatePickerDialog.OnDateSetListener
            public final void onDateSet(DatePicker datePicker, int i4, int i5, int i6) {
                FilterActivity.G3(calendar, filterActivity, datePicker, i4, i5, i6);
            }
        }, calendar.get(1), calendar.get(2), calendar.get(5)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(Calendar calendar, FilterActivity filterActivity, DatePicker datePicker, int i4, int i5, int i6) {
        calendar.set(i4, i5, i6, 23, 59, 59);
        ((L) filterActivity.V2()).m1(calendar.getTimeInMillis());
    }

    private final void H3() {
        C1000z c1000z = this.f11625K;
        C1000z c1000z2 = null;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        c1000z.f15961n.setOnClickListener(new View.OnClickListener() { // from class: I0.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.X3(this.f1685b, view);
            }
        });
        C1000z c1000z3 = this.f11625K;
        if (c1000z3 == null) {
            m.r("binding");
            c1000z3 = null;
        }
        c1000z3.f15964q.setOnClickListener(new View.OnClickListener() { // from class: I0.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.Y3(this.f1635b, view);
            }
        });
        C1000z c1000z4 = this.f11625K;
        if (c1000z4 == null) {
            m.r("binding");
            c1000z4 = null;
        }
        c1000z4.f15972y.setOnClickListener(new View.OnClickListener() { // from class: I0.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.Z3(this.f1644b, view);
            }
        });
        C1000z c1000z5 = this.f11625K;
        if (c1000z5 == null) {
            m.r("binding");
            c1000z5 = null;
        }
        c1000z5.f15962o.setOnClickListener(new View.OnClickListener() { // from class: I0.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.a4(this.f1646b, view);
            }
        });
        C1000z c1000z6 = this.f11625K;
        if (c1000z6 == null) {
            m.r("binding");
            c1000z6 = null;
        }
        c1000z6.f15963p.setOnClickListener(new View.OnClickListener() { // from class: I0.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.b4(this.f1649b, view);
            }
        });
        C1000z c1000z7 = this.f11625K;
        if (c1000z7 == null) {
            m.r("binding");
            c1000z7 = null;
        }
        c1000z7.f15970w.setOnClickListener(new View.OnClickListener() { // from class: I0.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.c4(this.f1654b, view);
            }
        });
        C1000z c1000z8 = this.f11625K;
        if (c1000z8 == null) {
            m.r("binding");
            c1000z8 = null;
        }
        c1000z8.f15969v.setOnClickListener(new View.OnClickListener() { // from class: I0.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.d4(this.f1657b, view);
            }
        });
        C1000z c1000z9 = this.f11625K;
        if (c1000z9 == null) {
            m.r("binding");
            c1000z9 = null;
        }
        c1000z9.f15940A.setOnClickListener(new View.OnClickListener() { // from class: I0.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.I3(this.f1660b, view);
            }
        });
        C1000z c1000z10 = this.f11625K;
        if (c1000z10 == null) {
            m.r("binding");
            c1000z10 = null;
        }
        c1000z10.f15956i.setOnClickListener(new View.OnClickListener() { // from class: I0.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.J3(this.f1662b, view);
            }
        });
        C1000z c1000z11 = this.f11625K;
        if (c1000z11 == null) {
            m.r("binding");
            c1000z11 = null;
        }
        c1000z11.f15942C.setOnClickListener(new View.OnClickListener() { // from class: I0.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.K3(this.f1665b, view);
            }
        });
        C1000z c1000z12 = this.f11625K;
        if (c1000z12 == null) {
            m.r("binding");
            c1000z12 = null;
        }
        c1000z12.f15941B.setOnClickListener(new View.OnClickListener() { // from class: I0.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.L3(this.f1687b, view);
            }
        });
        C1000z c1000z13 = this.f11625K;
        if (c1000z13 == null) {
            m.r("binding");
            c1000z13 = null;
        }
        c1000z13.f15943D.setOnClickListener(new View.OnClickListener() { // from class: I0.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.M3(this.f1690b, view);
            }
        });
        C1000z c1000z14 = this.f11625K;
        if (c1000z14 == null) {
            m.r("binding");
            c1000z14 = null;
        }
        c1000z14.f15965r.setOnClickListener(new View.OnClickListener() { // from class: I0.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.N3(this.f1693b, view);
            }
        });
        C1000z c1000z15 = this.f11625K;
        if (c1000z15 == null) {
            m.r("binding");
            c1000z15 = null;
        }
        c1000z15.f15971x.setOnClickListener(new View.OnClickListener() { // from class: I0.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.O3(this.f1511b, view);
            }
        });
        C1000z c1000z16 = this.f11625K;
        if (c1000z16 == null) {
            m.r("binding");
            c1000z16 = null;
        }
        c1000z16.f15966s.setOnClickListener(new View.OnClickListener() { // from class: I0.B
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.P3(this.f1516b, view);
            }
        });
        C1000z c1000z17 = this.f11625K;
        if (c1000z17 == null) {
            m.r("binding");
            c1000z17 = null;
        }
        c1000z17.f15958k.setOnClickListener(new View.OnClickListener() { // from class: I0.C
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.Q3(this.f1520b, view);
            }
        });
        C1000z c1000z18 = this.f11625K;
        if (c1000z18 == null) {
            m.r("binding");
            c1000z18 = null;
        }
        c1000z18.f15960m.setOnClickListener(new View.OnClickListener() { // from class: I0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.R3(this.f1620b, view);
            }
        });
        C1000z c1000z19 = this.f11625K;
        if (c1000z19 == null) {
            m.r("binding");
            c1000z19 = null;
        }
        c1000z19.f15957j.setOnClickListener(new View.OnClickListener() { // from class: I0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.S3(this.f1623b, view);
            }
        });
        C1000z c1000z20 = this.f11625K;
        if (c1000z20 == null) {
            m.r("binding");
            c1000z20 = null;
        }
        c1000z20.f15959l.setOnClickListener(new View.OnClickListener() { // from class: I0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.T3(this.f1626b, view);
            }
        });
        C1000z c1000z21 = this.f11625K;
        if (c1000z21 == null) {
            m.r("binding");
            c1000z21 = null;
        }
        c1000z21.f15968u.setOnClickListener(new View.OnClickListener() { // from class: I0.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.U3(this.f1631b, view);
            }
        });
        C1000z c1000z22 = this.f11625K;
        if (c1000z22 == null) {
            m.r("binding");
            c1000z22 = null;
        }
        c1000z22.f15973z.setOnClickListener(new View.OnClickListener() { // from class: I0.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.V3(this.f1638b, view);
            }
        });
        C1000z c1000z23 = this.f11625K;
        if (c1000z23 == null) {
            m.r("binding");
        } else {
            c1000z2 = c1000z23;
        }
        c1000z2.f15967t.setOnClickListener(new View.OnClickListener() { // from class: I0.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.W3(this.f1641b, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.R0(c1000z.f15940A.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.S0(c1000z.f15956i.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.n1(c1000z.f15942C.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.l1(c1000z.f15941B.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.o1(c1000z.f15943D.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.b1(c1000z.f15965r.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.i1(c1000z.f15971x.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.c1(c1000z.f15966s.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.U0(c1000z.f15958k.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.W0(c1000z.f15960m.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.T0(c1000z.f15957j.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.V0(c1000z.f15959l.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.f1(c1000z.f15968u.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.k1(c1000z.f15973z.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.e1(c1000z.f15967t.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.X0(c1000z.f15961n.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.a1(c1000z.f15964q.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z3(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.j1(c1000z.f15972y.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a4(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.Y0(c1000z.f15962o.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b4(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.Z0(c1000z.f15963p.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c4(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.h1(c1000z.f15970w.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d4(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        l4.g1(c1000z.f15969v.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e4(FilterActivity filterActivity, View view) {
        L l4 = (L) filterActivity.V2();
        C1000z c1000z = filterActivity.f11625K;
        C1000z c1000z2 = null;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        String strValueOf = String.valueOf(c1000z.f15951d.getText());
        C1000z c1000z3 = filterActivity.f11625K;
        if (c1000z3 == null) {
            m.r("binding");
        } else {
            c1000z2 = c1000z3;
        }
        l4.N0(strValueOf, String.valueOf(c1000z2.f15950c.getText()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f4(FilterActivity filterActivity, View view) {
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        filterActivity.i4(!c1000z.f15947H.isSelected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g4(FilterActivity filterActivity, View view) {
        C1000z c1000z = filterActivity.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        filterActivity.h4(!c1000z.f15949b.isSelected());
    }

    private final void h4(boolean z4) {
        C1000z c1000z = this.f11625K;
        C1000z c1000z2 = null;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        c1000z.f15949b.setSelected(z4);
        int i4 = z4 ? 0 : 8;
        C1000z c1000z3 = this.f11625K;
        if (c1000z3 == null) {
            m.r("binding");
            c1000z3 = null;
        }
        c1000z3.f15958k.setVisibility(i4);
        C1000z c1000z4 = this.f11625K;
        if (c1000z4 == null) {
            m.r("binding");
            c1000z4 = null;
        }
        c1000z4.f15960m.setVisibility(i4);
        C1000z c1000z5 = this.f11625K;
        if (c1000z5 == null) {
            m.r("binding");
            c1000z5 = null;
        }
        c1000z5.f15957j.setVisibility(i4);
        C1000z c1000z6 = this.f11625K;
        if (c1000z6 == null) {
            m.r("binding");
        } else {
            c1000z2 = c1000z6;
        }
        c1000z2.f15959l.setVisibility(i4);
    }

    private final void i4(boolean z4) {
        C1000z c1000z = this.f11625K;
        C1000z c1000z2 = null;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        c1000z.f15947H.setSelected(z4);
        int i4 = z4 ? 0 : 8;
        C1000z c1000z3 = this.f11625K;
        if (c1000z3 == null) {
            m.r("binding");
            c1000z3 = null;
        }
        c1000z3.f15961n.setVisibility(i4);
        C1000z c1000z4 = this.f11625K;
        if (c1000z4 == null) {
            m.r("binding");
            c1000z4 = null;
        }
        c1000z4.f15964q.setVisibility(i4);
        C1000z c1000z5 = this.f11625K;
        if (c1000z5 == null) {
            m.r("binding");
            c1000z5 = null;
        }
        c1000z5.f15972y.setVisibility(i4);
        C1000z c1000z6 = this.f11625K;
        if (c1000z6 == null) {
            m.r("binding");
            c1000z6 = null;
        }
        c1000z6.f15962o.setVisibility(i4);
        C1000z c1000z7 = this.f11625K;
        if (c1000z7 == null) {
            m.r("binding");
            c1000z7 = null;
        }
        c1000z7.f15963p.setVisibility(i4);
        C1000z c1000z8 = this.f11625K;
        if (c1000z8 == null) {
            m.r("binding");
            c1000z8 = null;
        }
        c1000z8.f15970w.setVisibility(i4);
        C1000z c1000z9 = this.f11625K;
        if (c1000z9 == null) {
            m.r("binding");
            c1000z9 = null;
        }
        c1000z9.f15969v.setVisibility(i4);
        C1000z c1000z10 = this.f11625K;
        if (c1000z10 == null) {
            m.r("binding");
            c1000z10 = null;
        }
        c1000z10.f15940A.setVisibility(i4);
        C1000z c1000z11 = this.f11625K;
        if (c1000z11 == null) {
            m.r("binding");
            c1000z11 = null;
        }
        c1000z11.f15956i.setVisibility(i4);
        C1000z c1000z12 = this.f11625K;
        if (c1000z12 == null) {
            m.r("binding");
            c1000z12 = null;
        }
        c1000z12.f15942C.setVisibility(i4);
        C1000z c1000z13 = this.f11625K;
        if (c1000z13 == null) {
            m.r("binding");
            c1000z13 = null;
        }
        c1000z13.f15941B.setVisibility(i4);
        C1000z c1000z14 = this.f11625K;
        if (c1000z14 == null) {
            m.r("binding");
            c1000z14 = null;
        }
        c1000z14.f15943D.setVisibility(i4);
        C1000z c1000z15 = this.f11625K;
        if (c1000z15 == null) {
            m.r("binding");
            c1000z15 = null;
        }
        c1000z15.f15965r.setVisibility(i4);
        C1000z c1000z16 = this.f11625K;
        if (c1000z16 == null) {
            m.r("binding");
            c1000z16 = null;
        }
        c1000z16.f15971x.setVisibility(i4);
        C1000z c1000z17 = this.f11625K;
        if (c1000z17 == null) {
            m.r("binding");
        } else {
            c1000z2 = c1000z17;
        }
        c1000z2.f15966s.setVisibility(i4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // f0.AbstractActivityC0911o
    /* renamed from: B3, reason: merged with bridge method [inline-methods] */
    public L U2() {
        return new L(getIntent().getIntExtra(HalmaParams.ID, -1));
    }

    @Override // I0.U1
    public void D(Long l4, Long l5) {
        C1000z c1000z = this.f11625K;
        C1000z c1000z2 = null;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        c1000z.f15945F.setText(l4 == null ? getString(AbstractC0888D.f14442X1) : this.f11624J.format(new Date(l4.longValue())));
        C1000z c1000z3 = this.f11625K;
        if (c1000z3 == null) {
            m.r("binding");
        } else {
            c1000z2 = c1000z3;
        }
        c1000z2.f15946G.setText(l5 == null ? getString(AbstractC0888D.f14442X1) : this.f11624J.format(new Date(l5.longValue())));
    }

    @Override // I0.U1
    public void I(int i4) {
        setResult(i4);
        finish();
    }

    @Override // I0.U1
    public void N0(String str) {
        m.e(str, HalmaParams.NAME);
        C1000z c1000z = this.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        c1000z.f15951d.setText(str);
    }

    @Override // I0.U1
    public void O(boolean z4, boolean z5, boolean z6) throws Resources.NotFoundException {
        C1000z c1000z = this.f11625K;
        C1000z c1000z2 = null;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        c1000z.f15968u.setChecked(z4);
        C1000z c1000z3 = this.f11625K;
        if (c1000z3 == null) {
            m.r("binding");
            c1000z3 = null;
        }
        c1000z3.f15973z.setChecked(z5);
        C1000z c1000z4 = this.f11625K;
        if (c1000z4 == null) {
            m.r("binding");
        } else {
            c1000z2 = c1000z4;
        }
        c1000z2.f15967t.setChecked(z6);
    }

    @Override // I0.U1
    public void W(String str) {
        m.e(str, "moves");
        C1000z c1000z = this.f11625K;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        c1000z.f15950c.setText(str);
    }

    @Override // I0.U1
    public void b1(int i4) throws Resources.NotFoundException {
        C1000z c1000z = this.f11625K;
        C1000z c1000z2 = null;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        c1000z.f15961n.setChecked((i4 & 1) != 0);
        C1000z c1000z3 = this.f11625K;
        if (c1000z3 == null) {
            m.r("binding");
            c1000z3 = null;
        }
        c1000z3.f15964q.setChecked((i4 & 3) != 0);
        C1000z c1000z4 = this.f11625K;
        if (c1000z4 == null) {
            m.r("binding");
            c1000z4 = null;
        }
        c1000z4.f15972y.setChecked((i4 & 5) != 0);
        C1000z c1000z5 = this.f11625K;
        if (c1000z5 == null) {
            m.r("binding");
            c1000z5 = null;
        }
        c1000z5.f15962o.setChecked((i4 & 9) != 0);
        C1000z c1000z6 = this.f11625K;
        if (c1000z6 == null) {
            m.r("binding");
            c1000z6 = null;
        }
        c1000z6.f15963p.setChecked((i4 & 17) != 0);
        C1000z c1000z7 = this.f11625K;
        if (c1000z7 == null) {
            m.r("binding");
            c1000z7 = null;
        }
        c1000z7.f15970w.setChecked((i4 & 33) != 0);
        C1000z c1000z8 = this.f11625K;
        if (c1000z8 == null) {
            m.r("binding");
            c1000z8 = null;
        }
        c1000z8.f15969v.setChecked((i4 & 65) != 0);
        C1000z c1000z9 = this.f11625K;
        if (c1000z9 == null) {
            m.r("binding");
            c1000z9 = null;
        }
        c1000z9.f15940A.setChecked((i4 & 129) != 0);
        C1000z c1000z10 = this.f11625K;
        if (c1000z10 == null) {
            m.r("binding");
            c1000z10 = null;
        }
        c1000z10.f15956i.setChecked((i4 & 8193) != 0);
        C1000z c1000z11 = this.f11625K;
        if (c1000z11 == null) {
            m.r("binding");
            c1000z11 = null;
        }
        c1000z11.f15942C.setChecked((i4 & 1025) != 0);
        C1000z c1000z12 = this.f11625K;
        if (c1000z12 == null) {
            m.r("binding");
            c1000z12 = null;
        }
        c1000z12.f15941B.setChecked((i4 & 2049) != 0);
        C1000z c1000z13 = this.f11625K;
        if (c1000z13 == null) {
            m.r("binding");
            c1000z13 = null;
        }
        c1000z13.f15943D.setChecked((i4 & 4097) != 0);
        C1000z c1000z14 = this.f11625K;
        if (c1000z14 == null) {
            m.r("binding");
            c1000z14 = null;
        }
        c1000z14.f15965r.setChecked((i4 & 257) != 0);
        C1000z c1000z15 = this.f11625K;
        if (c1000z15 == null) {
            m.r("binding");
            c1000z15 = null;
        }
        c1000z15.f15971x.setChecked((i4 & 513) != 0);
        C1000z c1000z16 = this.f11625K;
        if (c1000z16 == null) {
            m.r("binding");
        } else {
            c1000z2 = c1000z16;
        }
        c1000z2.f15966s.setChecked((i4 & 16385) != 0);
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1000z c1000zD = C1000z.d(getLayoutInflater());
        this.f11625K = c1000zD;
        C1000z c1000z = null;
        if (c1000zD == null) {
            m.r("binding");
            c1000zD = null;
        }
        setContentView(c1000zD.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.f14538r0, false, 2, null);
        setResult(0);
        C1000z c1000z2 = this.f11625K;
        if (c1000z2 == null) {
            m.r("binding");
            c1000z2 = null;
        }
        c1000z2.f15953f.setOnClickListener(new View.OnClickListener() { // from class: I0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterActivity.e4(this.f1617b, view);
            }
        });
        C1000z c1000z3 = this.f11625K;
        if (c1000z3 == null) {
            m.r("binding");
            c1000z3 = null;
        }
        Object parent = c1000z3.f15947H.getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: I0.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    FilterActivity.f4(this.f1651b, view2);
                }
            });
        }
        C1000z c1000z4 = this.f11625K;
        if (c1000z4 == null) {
            m.r("binding");
            c1000z4 = null;
        }
        Object parent2 = c1000z4.f15949b.getParent();
        View view2 = parent2 instanceof View ? (View) parent2 : null;
        if (view2 != null) {
            view2.setOnClickListener(new View.OnClickListener() { // from class: I0.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    FilterActivity.g4(this.f1683b, view3);
                }
            });
        }
        H3();
        C3();
        if (!getResources().getBoolean(AbstractC0916t.f14626b)) {
            C0573k c0573k = C0573k.f2973a;
            C1000z c1000z5 = this.f11625K;
            if (c1000z5 == null) {
                m.r("binding");
                c1000z5 = null;
            }
            ScrollView scrollView = c1000z5.f15954g;
            m.d(scrollView, "scroll");
            C0573k.v(c0573k, scrollView, 0, 1, null);
            C1000z c1000z6 = this.f11625K;
            if (c1000z6 == null) {
                m.r("binding");
                c1000z6 = null;
            }
            TextView textView = c1000z6.f15953f;
            m.d(textView, "save");
            C0573k.s(c0573k, textView, 0, 1, null);
            return;
        }
        C0573k c0573k2 = C0573k.f2973a;
        C1000z c1000z7 = this.f11625K;
        if (c1000z7 == null) {
            m.r("binding");
            c1000z7 = null;
        }
        ScrollView scrollView2 = c1000z7.f15954g;
        m.d(scrollView2, "scroll");
        c0573k2.u(scrollView2, 11);
        C1000z c1000z8 = this.f11625K;
        if (c1000z8 == null) {
            m.r("binding");
            c1000z8 = null;
        }
        ScrollView scrollView3 = c1000z8.f15955h;
        if (scrollView3 != null) {
            c0573k2.u(scrollView3, 14);
        }
        C1000z c1000z9 = this.f11625K;
        if (c1000z9 == null) {
            m.r("binding");
        } else {
            c1000z = c1000z9;
        }
        TextView textView2 = c1000z.f15953f;
        m.d(textView2, "save");
        c0573k2.r(textView2, 14);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((L) V2()).v0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((L) V2()).I0(this);
    }

    @Override // I0.U1
    public void t1(int i4) throws Resources.NotFoundException {
        C1000z c1000z = this.f11625K;
        C1000z c1000z2 = null;
        if (c1000z == null) {
            m.r("binding");
            c1000z = null;
        }
        c1000z.f15958k.setChecked((i4 & 1) != 0);
        C1000z c1000z3 = this.f11625K;
        if (c1000z3 == null) {
            m.r("binding");
            c1000z3 = null;
        }
        c1000z3.f15960m.setChecked((i4 & 2) != 0);
        C1000z c1000z4 = this.f11625K;
        if (c1000z4 == null) {
            m.r("binding");
            c1000z4 = null;
        }
        c1000z4.f15957j.setChecked((i4 & 8) != 0);
        C1000z c1000z5 = this.f11625K;
        if (c1000z5 == null) {
            m.r("binding");
        } else {
            c1000z2 = c1000z5;
        }
        c1000z2.f15959l.setChecked((i4 & 4) != 0);
    }
}