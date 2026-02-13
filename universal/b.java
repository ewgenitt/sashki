package cab.shashki.app.ui.universal;

import N0.C0573k;
import T2.q;
import T2.u;
import U2.F;
import U2.p;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import cab.shashki.app.ShashkiApp;
import cab.shashki.app.db.entities.CheckersParams;
import cab.shashki.app.service.FairyRepository;
import cab.shashki.app.service.b;
import cab.shashki.app.ui.universal.e;
import cab.shashki.cpp.CppGame;
import e3.AbstractC0876b;
import e3.AbstractC0877c;
import f0.AbstractC0888D;
import f0.AbstractC0909m;
import g3.InterfaceC1005a;
import g3.InterfaceC1016l;
import g3.InterfaceC1020p;
import h0.C1030d;
import h3.l;
import h3.m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import q0.C1283g;
import q0.C1301z;
import q0.D;
import q0.X;
import q0.e0;
import u2.C1409c;
import v2.C1429b;
import x2.AbstractC1488f;
import z2.AbstractC1559a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class b extends AbstractC0909m {

    /* renamed from: i, reason: collision with root package name */
    public static final a f11870i = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private cab.shashki.app.db.entities.a f11871d;

    /* renamed from: e, reason: collision with root package name */
    private final H1.d f11872e;

    /* renamed from: f, reason: collision with root package name */
    private final C1409c f11873f;

    /* renamed from: g, reason: collision with root package name */
    private final C1409c f11874g;

    /* renamed from: h, reason: collision with root package name */
    private File f11875h;

    public static final class a {
        public /* synthetic */ a(h3.h hVar) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: cab.shashki.app.ui.universal.b$b, reason: collision with other inner class name */
    /* synthetic */ class C0156b extends l implements InterfaceC1016l {
        C0156b(Object obj) {
            super(1, obj, C1409c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        public final void m(List list) {
            ((C1409c) this.f16244e).accept(list);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((List) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class c extends l implements InterfaceC1016l {
        c(Object obj) {
            super(1, obj, C1409c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        public final void m(List list) {
            ((C1409c) this.f16244e).accept(list);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((List) obj);
            return u.f3817a;
        }
    }

    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return W2.a.d(((e.a) obj).b().name(), ((e.a) obj2).b().name());
        }
    }

    /* synthetic */ class e extends l implements InterfaceC1016l {

        /* renamed from: m, reason: collision with root package name */
        public static final e f11876m = new e();

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

    /* synthetic */ class f extends l implements InterfaceC1016l {
        f(Object obj) {
            super(1, obj, C1409c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        public final void m(List list) {
            ((C1409c) this.f16244e).accept(list);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((List) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class g extends l implements InterfaceC1016l {
        g(Object obj) {
            super(1, obj, C1409c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        public final void m(List list) {
            ((C1409c) this.f16244e).accept(list);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((List) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class h extends l implements InterfaceC1016l {
        h(Object obj) {
            super(1, obj, C1409c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        public final void m(List list) {
            ((C1409c) this.f16244e).accept(list);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((List) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class i extends l implements InterfaceC1016l {
        i(Object obj) {
            super(1, obj, C1409c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        public final void m(List list) {
            ((C1409c) this.f16244e).accept(list);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((List) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class j extends l implements InterfaceC1016l {
        j(Object obj) {
            super(1, obj, C1409c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        public final void m(List list) {
            ((C1409c) this.f16244e).accept(list);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((List) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class k extends l implements InterfaceC1016l {
        k(Object obj) {
            super(1, obj, C1409c.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }

        public final void m(List list) {
            ((C1409c) this.f16244e).accept(list);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((List) obj);
            return u.f3817a;
        }
    }

    public b() {
        cab.shashki.app.db.entities.a aVarL = FairyRepository.f10588a.l();
        this.f11871d = aVarL == null ? e0.f19058a.g() : aVarL;
        this.f11872e = new H1.d();
        this.f11873f = C1409c.t();
        this.f11874g = C1409c.t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    private final void B1(final FairyRepository.a aVar, final boolean z4) {
        final File fileK = FairyRepository.f10588a.k();
        final File file = new File(fileK, aVar.a() + ".zip");
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: M0.j1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.universal.b.C1(this.f2692d, file, fileK, aVar);
            }
        }).H(S2.a.c());
        m.d(abstractC1488fH, "subscribeOn(...)");
        c0(abstractC1488fH, new InterfaceC1016l() { // from class: M0.k1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.universal.b.D1(z4, this, file, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean C1(b bVar, File file, File file2, FairyRepository.a aVar) {
        File file3 = bVar.f11875h;
        if (file3 != null) {
            file3.delete();
        }
        bVar.f11875h = file;
        List listK = p.k(new File(file2, aVar.a()));
        if (aVar.c().getLib() != null) {
            listK.add(new File(FairyRepository.f10588a.p(), aVar.c().getLib()));
        }
        return Boolean.valueOf(C0573k.f2973a.G(file, listK));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u D1(boolean z4, b bVar, File file, Boolean bool) {
        if (bool.booleanValue()) {
            if (z4) {
                cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) bVar.w0();
                if (eVar != null) {
                    eVar.i0(file);
                }
            } else {
                Context contextR0 = bVar.r0();
                m.b(contextR0);
                Uri uriF = FileProvider.f(contextR0, "cab.shashki.app.fileprovider", file);
                cab.shashki.app.ui.universal.e eVar2 = (cab.shashki.app.ui.universal.e) bVar.w0();
                if (eVar2 != null) {
                    m.b(uriF);
                    eVar2.k0(uriF);
                }
            }
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final H1.i H1(String str) {
        return H1.k.c(str).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String I1(b bVar, H1.i iVar) {
        Object objG;
        m.e(iVar, "it");
        if (iVar.t("params")) {
            objG = FairyRepository.a.f10598d.b(iVar);
            FairyRepository.f10588a.D(new j(bVar.f11873f));
        } else {
            objG = bVar.f11872e.g(iVar, CheckersParams.class);
            CheckersParams checkersParams = (CheckersParams) objG;
            if (CppGame.checkParams(checkersParams) != 0) {
                throw new RuntimeException("wrong parameters");
            }
            e0 e0Var = e0.f19058a;
            CheckersParams checkersParamsJ = e0Var.j(checkersParams, false);
            if (checkersParamsJ != null) {
                objG = checkersParamsJ;
            }
            e0Var.i(new k(bVar.f11874g));
        }
        return ((cab.shashki.app.db.entities.a) objG).name();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String J1(InterfaceC1016l interfaceC1016l, Object obj) {
        m.e(obj, "p0");
        return (String) interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u K1(b bVar, String str) {
        cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) bVar.w0();
        if (eVar != null) {
            m.b(str);
            eVar.s(str);
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u M1(b bVar, Throwable th) {
        cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) bVar.w0();
        if (eVar != null) {
            eVar.e();
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long P1(Uri uri, b bVar) throws FileNotFoundException {
        Long lValueOf;
        OutputStream outputStreamOpenOutputStream = ShashkiApp.f10561b.a().getContentResolver().openOutputStream(uri);
        m.b(outputStreamOpenOutputStream);
        try {
            File file = bVar.f11875h;
            if (file != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    lValueOf = Long.valueOf(AbstractC0876b.b(fileInputStream, outputStreamOpenOutputStream, 0, 2, null));
                    AbstractC0877c.a(fileInputStream, null);
                } finally {
                }
            } else {
                lValueOf = null;
            }
            AbstractC0877c.a(outputStreamOpenOutputStream, null);
            return lValueOf;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u Q1(Long l4) {
        return u.f3817a;
    }

    private final void U1(final InterfaceC1005a interfaceC1005a) {
        AbstractC1488f abstractC1488fQ = AbstractC1488f.q(new Callable() { // from class: M0.m1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.universal.b.X1(interfaceC1005a);
            }
        });
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: M0.o1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.universal.b.Y1((String) obj);
            }
        };
        AbstractC1488f abstractC1488fH = abstractC1488fQ.v(new C2.g() { // from class: M0.p1
            @Override // C2.g
            public final Object a(Object obj) {
                return cab.shashki.app.ui.universal.b.Z1(interfaceC1016l, obj);
            }
        }).H(S2.a.c());
        m.d(abstractC1488fH, "subscribeOn(...)");
        c0(abstractC1488fH, new InterfaceC1016l() { // from class: M0.q1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.universal.b.a2(this.f2721d, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String V1(CheckersParams checkersParams) {
        return checkersParams.toJsonString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String W1(FairyRepository.a aVar) {
        String string = aVar.d().toString();
        m.d(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String X1(InterfaceC1005a interfaceC1005a) {
        return (String) interfaceC1005a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap Y1(String str) {
        m.e(str, "it");
        return new C1429b().c(str, P1.a.QR_CODE, 423, 423, F.e(q.a(P1.g.CHARACTER_SET, "UTF-8")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap Z1(InterfaceC1016l interfaceC1016l, Object obj) {
        m.e(obj, "p0");
        return (Bitmap) interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u a2(b bVar, Bitmap bitmap) {
        cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) bVar.w0();
        if (eVar != null) {
            m.b(bitmap);
            eVar.j(bitmap);
        }
        return u.f3817a;
    }

    private final boolean c2(FairyRepository.a aVar) {
        if (aVar.c().getPieceMap() == null) {
            return false;
        }
        String boardFile = aVar.c().getBoardFile();
        if (boardFile != null && boardFile.length() != 0) {
            return false;
        }
        String lib = aVar.c().getLib();
        if (lib != null && lib.length() != 0) {
            return false;
        }
        String strB = aVar.b();
        return strB == null || strB.length() == 0 || new File(aVar.b()).length() < 1500;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f1(b bVar, List list, List list2) {
        m.e(list, "chess");
        m.e(list2, "checkers");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FairyRepository.a aVar = (FairyRepository.a) it.next();
            arrayList.add(new e.a(aVar, FairyRepository.f10588a.i(aVar), bVar.c2(aVar)));
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            CheckersParams checkersParams = (CheckersParams) it2.next();
            arrayList.add(new e.a(checkersParams, e0.f19058a.e(checkersParams.getId()), true));
        }
        if (arrayList.size() > 1) {
            p.q(arrayList, new d());
        }
        cab.shashki.app.db.entities.a aVarL = FairyRepository.f10588a.l();
        if (aVarL == null) {
            aVarL = e0.f19058a.g();
        }
        bVar.f11871d = aVarL;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String f2(FairyRepository.a aVar) {
        return e3.i.f(new File(aVar.b()), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g1(InterfaceC1020p interfaceC1020p, Object obj, Object obj2) {
        m.e(obj, "p0");
        m.e(obj2, "p1");
        return (List) interfaceC1020p.k(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u g2(b bVar, String str) {
        cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) bVar.w0();
        if (eVar != null) {
            m.b(str);
            eVar.N1(str);
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u h1(b bVar, List list) {
        cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) bVar.w0();
        if (eVar != null) {
            m.b(list);
            eVar.a1(list, bVar.f11871d);
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u k1(cab.shashki.app.db.entities.a aVar, b bVar, Long l4) {
        if (aVar instanceof CheckersParams) {
            bVar.n1((CheckersParams) aVar);
        } else {
            if (!(aVar instanceof FairyRepository.a)) {
                throw new RuntimeException("Error");
            }
            bVar.o1((FairyRepository.a) aVar, true);
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    private final void n1(CheckersParams checkersParams) {
        e0 e0Var = e0.f19058a;
        e0Var.f(checkersParams);
        e0Var.r(new f(this.f11874g));
        C1030d.f16118a.b().E().m(checkersParams.getId());
        new D(b.a.f10828x0.c(), String.valueOf(checkersParams.getId())).e();
    }

    private final void o1(FairyRepository.a aVar, boolean z4) {
        FairyRepository fairyRepository = FairyRepository.f10588a;
        e3.i.l(new File(fairyRepository.k(), aVar.a()));
        String variant = aVar.c().getVariant();
        if (variant != null && !m.a(variant, "custom_cc")) {
            X.f19008a.b(variant);
        }
        if (z4) {
            fairyRepository.D(new g(this.f11873f));
        }
        C1030d.f16118a.b().E().k(aVar.a());
        new D(b.a.f10808t0.c(), aVar.a()).e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u q1(b bVar, String str) {
        List list = (List) bVar.f11873f.v();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (m.a(((FairyRepository.a) obj).c().getLib(), str)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj2 = arrayList.get(i4);
                i4++;
                bVar.o1((FairyRepository.a) obj2, false);
            }
        }
        FairyRepository.f10588a.j(str);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u r1(b bVar, u uVar) {
        FairyRepository.f10588a.D(new h(bVar.f11873f));
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final T2.l v1(Uri uri, File file) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream = ShashkiApp.f10561b.a().getContentResolver().openInputStream(uri);
        m.b(inputStreamOpenInputStream);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                AbstractC0876b.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                AbstractC0877c.a(fileOutputStream, null);
                AbstractC0877c.a(inputStreamOpenInputStream, null);
                return FairyRepository.f10588a.x(file);
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w1(File file) {
        file.delete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u x1(b bVar, T2.l lVar) {
        if (((Boolean) lVar.c()).booleanValue()) {
            cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) bVar.w0();
            if (eVar != null) {
                Object objD = lVar.d();
                m.b(objD);
                eVar.s((String) objD);
            }
            FairyRepository.f10588a.D(new i(bVar.f11873f));
        } else {
            cab.shashki.app.ui.universal.e eVar2 = (cab.shashki.app.ui.universal.e) bVar.w0();
            if (eVar2 != null) {
                eVar2.e();
            }
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y1(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u z1(b bVar, Throwable th) {
        cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) bVar.w0();
        if (eVar != null) {
            eVar.e();
        }
        th.printStackTrace();
        return u.f3817a;
    }

    public final void E1(cab.shashki.app.db.entities.a aVar) {
        String strB;
        m.e(aVar, "engine");
        Context contextR0 = r0();
        if (contextR0 == null) {
            return;
        }
        SharedPreferences sharedPreferencesB = androidx.preference.k.b(contextR0);
        if (aVar instanceof CheckersParams) {
            strB = b.a.f10828x0.b();
        } else if (!(aVar instanceof FairyRepository.a)) {
            return;
        } else {
            strB = b.a.f10808t0.b();
        }
        C1301z.f19103a.c();
        cab.shashki.app.service.a.f10602a.l(aVar);
        if (m.a(strB, sharedPreferencesB.getString(contextR0.getString(AbstractC0888D.f14342A1), null))) {
            C1283g.f19067a.b();
        } else {
            sharedPreferencesB.edit().putString(contextR0.getString(AbstractC0888D.f14342A1), strB).apply();
            C1283g.f19067a.d();
        }
        cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) w0();
        if (eVar != null) {
            eVar.finish();
        }
    }

    public final void F1() {
        ClipData primaryClip;
        ClipData.Item itemAt;
        CharSequence text;
        String string;
        Context contextR0 = r0();
        Object systemService = contextR0 != null ? contextR0.getSystemService("clipboard") : null;
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager == null || (primaryClip = clipboardManager.getPrimaryClip()) == null || (itemAt = primaryClip.getItemAt(0)) == null || (text = itemAt.getText()) == null || (string = text.toString()) == null) {
            return;
        }
        G1(string);
    }

    public final void G1(final String str) {
        m.e(str, "json");
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: M0.T0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.universal.b.H1(str);
            }
        }).H(S2.a.c());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: M0.U0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.universal.b.I1(this.f2639d, (H1.i) obj);
            }
        };
        AbstractC1488f abstractC1488fW = abstractC1488fH.v(new C2.g() { // from class: M0.V0
            @Override // C2.g
            public final Object a(Object obj) {
                return cab.shashki.app.ui.universal.b.J1(interfaceC1016l, obj);
            }
        }).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: M0.W0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.universal.b.K1(this.f2645d, (String) obj);
            }
        };
        C2.e eVar = new C2.e() { // from class: M0.X0
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.universal.b.L1(interfaceC1016l2, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l3 = new InterfaceC1016l() { // from class: M0.Y0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.universal.b.M1(this.f2651d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fW.D(eVar, new C2.e() { // from class: M0.Z0
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.universal.b.N1(interfaceC1016l3, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, t0());
    }

    public final void O1(final Uri uri) {
        m.e(uri, "uri");
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: M0.x1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.universal.b.P1(uri, this);
            }
        }).H(S2.a.c());
        m.d(abstractC1488fH, "subscribeOn(...)");
        c0(abstractC1488fH, new InterfaceC1016l() { // from class: M0.S0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.universal.b.Q1((Long) obj);
            }
        });
    }

    public final void R1(FairyRepository.a aVar) {
        m.e(aVar, "engine");
        B1(aVar, false);
    }

    public final void S1(final CheckersParams checkersParams) {
        m.e(checkersParams, "engine");
        U1(new InterfaceC1005a() { // from class: M0.e1
            @Override // g3.InterfaceC1005a
            public final Object a() {
                return cab.shashki.app.ui.universal.b.V1(checkersParams);
            }
        });
    }

    public final void T1(final FairyRepository.a aVar) {
        m.e(aVar, "engine");
        U1(new InterfaceC1005a() { // from class: M0.l1
            @Override // g3.InterfaceC1005a
            public final Object a() {
                return cab.shashki.app.ui.universal.b.W1(aVar);
            }
        });
    }

    public final void b2(CheckersParams checkersParams) {
        m.e(checkersParams, "engine");
        cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) w0();
        if (eVar != null) {
            eVar.q(checkersParams.getId());
        }
    }

    public final void d2(CheckersParams checkersParams) {
        m.e(checkersParams, "engine");
        cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) w0();
        if (eVar != null) {
            eVar.b(checkersParams.getId());
        }
    }

    public void e1(cab.shashki.app.ui.universal.e eVar) {
        m.e(eVar, "view");
        super.q0(eVar);
        e0.f19058a.r(new C0156b(this.f11874g));
        FairyRepository.f10588a.D(new c(this.f11873f));
        C1409c c1409c = this.f11873f;
        C1409c c1409c2 = this.f11874g;
        final InterfaceC1020p interfaceC1020p = new InterfaceC1020p() { // from class: M0.u1
            @Override // g3.InterfaceC1020p
            public final Object k(Object obj, Object obj2) {
                return cab.shashki.app.ui.universal.b.f1(this.f2733d, (List) obj, (List) obj2);
            }
        };
        x2.m mVarQ = x2.m.f(c1409c, c1409c2, new C2.c() { // from class: M0.v1
            @Override // C2.c
            public final Object a(Object obj, Object obj2) {
                return cab.shashki.app.ui.universal.b.g1(interfaceC1020p, obj, obj2);
            }
        }).q(S2.a.c());
        m.d(mVarQ, "subscribeOn(...)");
        d0(mVarQ, new InterfaceC1016l() { // from class: M0.w1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.universal.b.h1(this.f2741d, (List) obj);
            }
        });
    }

    public final void e2(final FairyRepository.a aVar) {
        m.e(aVar, "engine");
        AbstractC1488f abstractC1488fQ = AbstractC1488f.q(new Callable() { // from class: M0.f1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.universal.b.f2(aVar);
            }
        });
        m.d(abstractC1488fQ, "fromCallable(...)");
        c0(abstractC1488fQ, new InterfaceC1016l() { // from class: M0.g1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.universal.b.g2(this.f2681d, (String) obj);
            }
        });
    }

    public final void h2(FairyRepository.a aVar) {
        String variant;
        m.e(aVar, "engine");
        cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) w0();
        if (eVar == null || (variant = aVar.c().getVariant()) == null) {
            return;
        }
        eVar.h0(variant);
    }

    public final void i1(CheckersParams checkersParams) {
        m.e(checkersParams, "engine");
        Context contextR0 = r0();
        if (contextR0 == null) {
            return;
        }
        Object systemService = contextR0.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(contextR0.getString(AbstractC0888D.x5), checkersParams.toJsonString()));
            cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) w0();
            if (eVar != null) {
                eVar.o();
            }
        }
    }

    public final void i2(FairyRepository.a aVar) {
        m.e(aVar, "engine");
        B1(aVar, true);
    }

    public final void j1(int i4, final cab.shashki.app.db.entities.a aVar) {
        cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) w0();
        if (eVar == null) {
            return;
        }
        AbstractC1488f abstractC1488fM = AbstractC1488f.M(2000L, TimeUnit.MILLISECONDS, S2.a.c());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: M0.a1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.universal.b.k1(aVar, this, (Long) obj);
            }
        };
        C2.e eVar2 = new C2.e() { // from class: M0.b1
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.universal.b.l1(interfaceC1016l, obj);
            }
        };
        final e eVar3 = e.f11876m;
        A2.c cVarD = abstractC1488fM.D(eVar2, new C2.e() { // from class: M0.d1
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.universal.b.m1(eVar3, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        eVar.l(i4, 2000, R2.a.a(cVarD, u0()));
    }

    public final void p1(final String str) {
        if (str == null) {
            return;
        }
        AbstractC1488f abstractC1488fH = AbstractC1488f.q(new Callable() { // from class: M0.h1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.universal.b.q1(this.f2684d, str);
            }
        }).H(S2.a.c());
        m.d(abstractC1488fH, "subscribeOn(...)");
        c0(abstractC1488fH, new InterfaceC1016l() { // from class: M0.i1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.universal.b.r1(this.f2689d, (T2.u) obj);
            }
        });
    }

    @Override // f0.AbstractC0909m
    public void s0() {
        super.s0();
        File file = this.f11875h;
        if (file != null) {
            file.delete();
        }
    }

    public final void s1(FairyRepository.a aVar) {
        m.e(aVar, "engine");
        cab.shashki.app.ui.universal.e eVar = (cab.shashki.app.ui.universal.e) w0();
        if (eVar != null) {
            eVar.W0(aVar.id());
        }
    }

    public final cab.shashki.app.db.entities.a t1() {
        return this.f11871d;
    }

    public final void u1(final Uri uri) {
        m.e(uri, "uri");
        String strP = C0573k.f2973a.p(uri);
        if (strP == null) {
            strP = "tmp.zip";
        }
        final File file = new File(FairyRepository.f10588a.k(), strP);
        AbstractC1488f abstractC1488fW = AbstractC1488f.q(new Callable() { // from class: M0.R0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cab.shashki.app.ui.universal.b.v1(uri, file);
            }
        }).H(S2.a.c()).h(new C2.a() { // from class: M0.c1
            @Override // C2.a
            public final void run() {
                cab.shashki.app.ui.universal.b.w1(file);
            }
        }).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: M0.n1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.universal.b.x1(this.f2710d, (T2.l) obj);
            }
        };
        C2.e eVar = new C2.e() { // from class: M0.r1
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.universal.b.y1(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: M0.s1
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return cab.shashki.app.ui.universal.b.z1(this.f2727d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fW.D(eVar, new C2.e() { // from class: M0.t1
            @Override // C2.e
            public final void accept(Object obj) {
                cab.shashki.app.ui.universal.b.A1(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, t0());
    }
}