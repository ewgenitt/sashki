package cab.shashki.app.ui.chess;

import N0.C0573k;
import R0.p;
import T2.u;
import U2.p;
import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.appcompat.app.a;
import cab.shashki.app.ui.chess.ChessSettingsActivity;
import cab.shashki.app.ui.chess.uci_custom.UCIEngineActivity;
import cab.shashki.app.ui.chess.uci_storage.StorageActivity;
import f0.AbstractC0888D;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.C0971h;
import g3.InterfaceC1016l;
import h3.m;
import java.util.ArrayList;
import java.util.List;
import q0.C1280d;
import q0.H;
import q0.InterfaceC1298w;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class ChessSettingsActivity extends AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L {

    /* renamed from: I, reason: collision with root package name */
    private C0971h f10901I;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a3(ChessSettingsActivity chessSettingsActivity, View view) {
        C1280d c1280d = C1280d.f19028a;
        C0971h c0971h = chessSettingsActivity.f10901I;
        if (c0971h == null) {
            m.r("binding");
            c0971h = null;
        }
        c1280d.f(c0971h.f15669b.isChecked());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b3(ChessSettingsActivity chessSettingsActivity, View view) {
        chessSettingsActivity.startActivity(new Intent(chessSettingsActivity, (Class<?>) StockNetActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c3(final ChessSettingsActivity chessSettingsActivity, View view) {
        new H(new InterfaceC1016l() { // from class: x0.h
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return ChessSettingsActivity.d3(this.f20306d, (q0.H) obj);
            }
        }, null, 2, null).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u d3(final ChessSettingsActivity chessSettingsActivity, H h4) {
        m.e(h4, "it");
        InterfaceC1298w interfaceC1298wJ = h4.j();
        Object objF = interfaceC1298wJ != null ? interfaceC1298wJ.f("fairy_variant", new Object[0]) : null;
        String str = objF instanceof String ? (String) objF : null;
        if (str != null) {
            chessSettingsActivity.startActivity(new Intent(chessSettingsActivity, (Class<?>) UCIOptionsActivity.class).putExtra("type", str));
            return u.f3817a;
        }
        List listJ = p.j(p.c.f3639n, p.c.f3640o);
        p.c[] cVarArrValues = p.c.values();
        ArrayList arrayList = new ArrayList();
        for (p.c cVar : cVarArrValues) {
            if (!listJ.contains(cVar)) {
                arrayList.add(cVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(U2.p.o(arrayList, 10));
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            arrayList2.add(((p.c) obj).b());
        }
        final String[] strArr = (String[]) arrayList2.toArray(new String[0]);
        new a.C0075a(chessSettingsActivity).g(strArr, new DialogInterface.OnClickListener() { // from class: x0.i
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                ChessSettingsActivity.e3(this.f20307b, strArr, dialogInterface, i5);
            }
        }).k(R.string.cancel, null).x();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(ChessSettingsActivity chessSettingsActivity, String[] strArr, DialogInterface dialogInterface, int i4) {
        chessSettingsActivity.startActivity(new Intent(chessSettingsActivity, (Class<?>) UCIOptionsActivity.class).putExtra("type", strArr[i4]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f3(ChessSettingsActivity chessSettingsActivity, View view) {
        chessSettingsActivity.startActivity(new Intent(chessSettingsActivity, (Class<?>) UCIStdErrActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3(ChessSettingsActivity chessSettingsActivity, View view) {
        chessSettingsActivity.startActivity(new Intent(chessSettingsActivity, (Class<?>) UCIOptionsActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(ChessSettingsActivity chessSettingsActivity, View view) {
        chessSettingsActivity.startActivity(new Intent(chessSettingsActivity, (Class<?>) StorageActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(ChessSettingsActivity chessSettingsActivity, View view) {
        chessSettingsActivity.startActivity(new Intent(chessSettingsActivity, (Class<?>) UCIEngineActivity.class));
    }

    @Override // f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        C0971h c0971hD = C0971h.d(getLayoutInflater());
        this.f10901I = c0971hD;
        C0971h c0971h = null;
        if (c0971hD == null) {
            m.r("binding");
            c0971hD = null;
        }
        setContentView(c0971hD.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.t5, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        C0971h c0971h2 = this.f10901I;
        if (c0971h2 == null) {
            m.r("binding");
            c0971h2 = null;
        }
        ScrollView scrollView = c0971h2.f15671d;
        m.d(scrollView, "scroll");
        C0573k.v(c0573k, scrollView, 0, 1, null);
        C0971h c0971h3 = this.f10901I;
        if (c0971h3 == null) {
            m.r("binding");
            c0971h3 = null;
        }
        c0971h3.f15669b.setChecked(C1280d.f19028a.e());
        C0971h c0971h4 = this.f10901I;
        if (c0971h4 == null) {
            m.r("binding");
            c0971h4 = null;
        }
        c0971h4.f15669b.setOnClickListener(new View.OnClickListener() { // from class: x0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessSettingsActivity.a3(this.f20299b, view);
            }
        });
        C0971h c0971h5 = this.f10901I;
        if (c0971h5 == null) {
            m.r("binding");
            c0971h5 = null;
        }
        c0971h5.f15672e.setOnClickListener(new View.OnClickListener() { // from class: x0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessSettingsActivity.b3(this.f20300b, view);
            }
        });
        C0971h c0971h6 = this.f10901I;
        if (c0971h6 == null) {
            m.r("binding");
            c0971h6 = null;
        }
        c0971h6.f15675h.setOnClickListener(new View.OnClickListener() { // from class: x0.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessSettingsActivity.f3(this.f20301b, view);
            }
        });
        C0971h c0971h7 = this.f10901I;
        if (c0971h7 == null) {
            m.r("binding");
            c0971h7 = null;
        }
        c0971h7.f15676i.setOnClickListener(new View.OnClickListener() { // from class: x0.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessSettingsActivity.g3(this.f20302b, view);
            }
        });
        C0971h c0971h8 = this.f10901I;
        if (c0971h8 == null) {
            m.r("binding");
            c0971h8 = null;
        }
        c0971h8.f15677j.setOnClickListener(new View.OnClickListener() { // from class: x0.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessSettingsActivity.h3(this.f20303b, view);
            }
        });
        C0971h c0971h9 = this.f10901I;
        if (c0971h9 == null) {
            m.r("binding");
            c0971h9 = null;
        }
        c0971h9.f15674g.setOnClickListener(new View.OnClickListener() { // from class: x0.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessSettingsActivity.i3(this.f20304b, view);
            }
        });
        C0971h c0971h10 = this.f10901I;
        if (c0971h10 == null) {
            m.r("binding");
        } else {
            c0971h = c0971h10;
        }
        c0971h.f15670c.setOnClickListener(new View.OnClickListener() { // from class: x0.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ChessSettingsActivity.c3(this.f20305b, view);
            }
        });
    }
}