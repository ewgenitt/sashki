package cab.shashki.app.service;

import D0.F;
import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.AbstractActivityC0719f;
import cab.shashki.app.ShashkiApp;
import cab.shashki.app.service.b;
import cab.shashki.app.ui.chess.StockNetActivity;
import cab.shashki.app.ui.chess.uci_custom.UCIEngineActivity;
import cab.shashki.app.ui.halma.HalmaSettingsActivity;
import cab.shashki.app.ui.universal.CustomSettingsActivity;
import h3.m;
import java.io.File;
import q0.C1276B;
import q0.C1297v;
import q0.V;
import q0.Z;
import q0.e0;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class c {

    /* renamed from: a */
    public static final c f10845a = new c();

    /* renamed from: b */
    private static a f10846b;

    public interface a {
        Context c();
    }

    private c() {
    }

    private final void e(String str) {
        a aVar = f10846b;
        Context contextC = aVar != null ? aVar.c() : null;
        AbstractActivityC0719f abstractActivityC0719f = contextC instanceof AbstractActivityC0719f ? (AbstractActivityC0719f) contextC : null;
        if (abstractActivityC0719f == null) {
            return;
        }
        F.f307w0.a(str).S4(abstractActivityC0719f.g2(), "loader");
    }

    public final boolean a(String str) {
        Context contextC;
        Context contextC2;
        Context contextC3;
        Context contextC4;
        Context contextC5;
        m.e(str, "engine");
        if (m.a(str, b.a.f10757j.b()) && !b()) {
            a aVar = f10846b;
            if (aVar != null && (contextC5 = aVar.c()) != null) {
                contextC5.startActivity(new Intent(contextC5, (Class<?>) StockNetActivity.class));
            }
            return false;
        }
        if (m.a(str, b.a.f10611B.b()) && Z.f19010a.f() == null) {
            a aVar2 = f10846b;
            if (aVar2 != null && (contextC4 = aVar2.c()) != null) {
                contextC4.startActivity(new Intent(contextC4, (Class<?>) UCIEngineActivity.class));
            }
            return false;
        }
        if (m.a(str, b.a.f10606A.b())) {
            if (c()) {
                return true;
            }
            e(str);
            return false;
        }
        if (m.a(str, b.a.f10782o.b())) {
            if (C1276B.f18948a.g().exists()) {
                return true;
            }
            e(str);
        }
        if (m.a(str, b.a.f10812u.b())) {
            if (C1276B.f18948a.h().exists()) {
                return true;
            }
            e(str);
        }
        if (m.a(str, b.a.f10817v.b())) {
            if (C1276B.f18948a.b().exists()) {
                return true;
            }
            e(str);
        }
        if (m.a(str, b.a.f10822w.b())) {
            if (C1276B.f18948a.f().exists()) {
                return true;
            }
            e(str);
        }
        if (m.a(str, b.a.f10616C.b())) {
            if (C1276B.f18948a.a().exists()) {
                return true;
            }
            e(str);
        }
        if (m.a(str, b.a.f10808t0.b()) && FairyRepository.f10588a.l() == null) {
            a aVar3 = f10846b;
            if (aVar3 != null && (contextC3 = aVar3.c()) != null) {
                contextC3.startActivity(new Intent(contextC3, (Class<?>) CustomSettingsActivity.class));
            }
            return false;
        }
        if (m.a(str, b.a.f10828x0.b()) && e0.f19058a.g() == null) {
            a aVar4 = f10846b;
            if (aVar4 != null && (contextC2 = aVar4.c()) != null) {
                contextC2.startActivity(new Intent(contextC2, (Class<?>) CustomSettingsActivity.class));
            }
            return false;
        }
        if (!m.a(str, b.a.f10607A0.b()) || C1297v.f19095a.g() != null) {
            return true;
        }
        a aVar5 = f10846b;
        if (aVar5 != null && (contextC = aVar5.c()) != null) {
            contextC.startActivity(new Intent(contextC, (Class<?>) HalmaSettingsActivity.class));
        }
        return false;
    }

    public final boolean b() {
        V v4 = V.f18993a;
        return (v4.k() == null || v4.n() == null) ? false : true;
    }

    public final boolean c() {
        File file = new File(ShashkiApp.f10561b.a().getFilesDir(), "reversi");
        return new File(file, "book.bin").exists() && new File(file, "coeffs2.bin").exists();
    }

    public final void d(a aVar) {
        m.e(aVar, "owner");
        f10846b = aVar;
    }
}