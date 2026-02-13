package cab.shashki.app.service;

import H1.i;
import H1.l;
import N0.C0573k;
import U2.AbstractC0590i;
import U2.p;
import android.content.SharedPreferences;
import cab.shashki.app.ShashkiApp;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.db.entities.a;
import cab.shashki.app.service.FairyRepository;
import g3.InterfaceC1016l;
import h3.h;
import h3.m;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.CRC32;
import o0.x;
import p3.AbstractC1273a;
import p3.j;
import p3.n;
import z0.u1;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class FairyRepository {

    /* renamed from: a, reason: collision with root package name */
    public static final FairyRepository f10588a;

    /* renamed from: b, reason: collision with root package name */
    private static final j f10589b;

    /* renamed from: c, reason: collision with root package name */
    private static final SharedPreferences f10590c;

    /* renamed from: d, reason: collision with root package name */
    private static final H1.d f10591d;

    /* renamed from: e, reason: collision with root package name */
    private static List f10592e;

    /* renamed from: f, reason: collision with root package name */
    private static a f10593f;

    /* renamed from: g, reason: collision with root package name */
    private static a f10594g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f10595h;

    public static final class a implements cab.shashki.app.db.entities.a {

        /* renamed from: d, reason: collision with root package name */
        public static final C0142a f10598d = new C0142a(null);

        /* renamed from: a, reason: collision with root package name */
        private final GameParams f10599a;

        /* renamed from: b, reason: collision with root package name */
        private final String f10600b;

        /* renamed from: c, reason: collision with root package name */
        private final String f10601c;

        /* renamed from: cab.shashki.app.service.FairyRepository$a$a, reason: collision with other inner class name */
        public static final class C0142a {
            public /* synthetic */ C0142a(h hVar) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean c(File file) {
                return file.isDirectory();
            }

            public final a b(i iVar) {
                List listG;
                String strG;
                String strG2;
                m.e(iVar, "js");
                l lVarS = iVar.s("ini");
                String str = (lVarS == null || (strG2 = lVarS.g()) == null) ? "" : strG2;
                l lVarS2 = iVar.s("lib");
                String str2 = (lVarS2 == null || (strG = lVarS2.g()) == null) ? "" : strG;
                GameParams gameParams = (GameParams) FairyRepository.f10591d.g(iVar.q("params"), GameParams.class);
                String variant = gameParams.getVariant();
                if (variant == null) {
                    variant = "custom_cc";
                }
                String str3 = variant;
                File[] fileArrListFiles = FairyRepository.f10588a.k().listFiles(new FileFilter() { // from class: q0.m
                    @Override // java.io.FileFilter
                    public final boolean accept(File file) {
                        return FairyRepository.a.C0142a.c(file);
                    }
                });
                if (fileArrListFiles != null) {
                    listG = new ArrayList(fileArrListFiles.length);
                    for (File file : fileArrListFiles) {
                        listG.add(file.getName());
                    }
                } else {
                    listG = p.g();
                }
                List list = listG;
                FairyRepository fairyRepository = FairyRepository.f10588a;
                String lib = gameParams.getLib();
                a aVarY = fairyRepository.y(list, lib != null ? lib : "", str, str3);
                if (aVarY != null) {
                    return aVarY;
                }
                m.b(gameParams);
                return fairyRepository.t(gameParams, list, str2, str, str3);
            }

            private C0142a() {
            }
        }

        public a(GameParams gameParams, String str, String str2) {
            m.e(gameParams, "params");
            m.e(str2, "dir");
            this.f10599a = gameParams;
            this.f10600b = str;
            this.f10601c = str2;
        }

        public final String a() {
            return this.f10601c;
        }

        public final String b() {
            return this.f10600b;
        }

        @Override // cab.shashki.app.db.entities.a
        public int boardExtra() {
            Integer handMode = this.f10599a.getHandMode();
            if (handMode != null) {
                return handMode.intValue();
            }
            return 0;
        }

        public final GameParams c() {
            return this.f10599a;
        }

        @Override // cab.shashki.app.db.entities.a
        public int columns() {
            return this.f10599a.getX();
        }

        public final i d() {
            i iVar = new i();
            String str = this.f10600b;
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    iVar.o("ini", e3.i.f(new File(str), null, 1, null));
                }
            }
            String lib = this.f10599a.getLib();
            if (lib != null) {
                File file = new File(FairyRepository.f10588a.p(), lib);
                if (!file.exists() || !file.isFile()) {
                    file = null;
                }
                if (file != null) {
                    iVar.o("lib", e3.i.f(file, null, 1, null));
                }
            }
            iVar.l("params", FairyRepository.f10591d.z(this.f10599a));
            return iVar;
        }

        @Override // cab.shashki.app.db.entities.a
        public boolean extraPlayers() {
            return a.C0141a.b(this);
        }

        @Override // cab.shashki.app.db.entities.a
        public String id() {
            return this.f10601c;
        }

        @Override // cab.shashki.app.db.entities.a
        public boolean is3() {
            return a.C0141a.c(this);
        }

        @Override // cab.shashki.app.db.entities.a
        public boolean is4() {
            return a.C0141a.d(this);
        }

        @Override // cab.shashki.app.db.entities.a
        public boolean is6() {
            return a.C0141a.e(this);
        }

        @Override // cab.shashki.app.db.entities.a
        public String name() {
            return this.f10599a.getName();
        }

        @Override // cab.shashki.app.db.entities.a
        public int rows() {
            return this.f10599a.getY();
        }
    }

    public interface b extends x {

        public static final class a {
            public static boolean a(b bVar) {
                return x.a.a(bVar);
            }

            public static int b(b bVar, char c4) {
                return x.a.b(bVar, c4);
            }
        }
    }

    static {
        FairyRepository fairyRepository = new FairyRepository();
        f10588a = fairyRepository;
        f10589b = new j("^\\s*\\[([^:\\]]+).*]", p3.l.f18902g);
        SharedPreferences sharedPreferences = ShashkiApp.f10561b.a().getSharedPreferences("fairy_custom", 0);
        f10590c = sharedPreferences;
        f10591d = new H1.d();
        f10592e = p.g();
        if (sharedPreferences.contains("fairy_custom")) {
            String string = sharedPreferences.getString("fairy_custom", null);
            if (string == null) {
                string = "";
            }
            f10593f = fairyRepository.q(string);
            E(fairyRepository, null, 1, null);
        }
        if (fairyRepository.k().exists()) {
            return;
        }
        fairyRepository.k().mkdirs();
    }

    private FairyRepository() {
    }

    public static /* synthetic */ void E(FairyRepository fairyRepository, InterfaceC1016l interfaceC1016l, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            interfaceC1016l = null;
        }
        fairyRepository.D(interfaceC1016l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(InterfaceC1016l interfaceC1016l) {
        List listG;
        Object obj;
        File[] fileArrListFiles = f10588a.k().listFiles(new FileFilter() { // from class: q0.i
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return FairyRepository.G(file);
            }
        });
        if (fileArrListFiles != null) {
            listG = new ArrayList();
            for (File file : fileArrListFiles) {
                FairyRepository fairyRepository = f10588a;
                String name = file.getName();
                m.d(name, "getName(...)");
                a aVarQ = fairyRepository.q(name);
                if (aVarQ != null) {
                    listG.add(aVarQ);
                }
            }
        } else {
            listG = p.g();
        }
        Iterator it = listG.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String strA = ((a) next).a();
            a aVar = f10593f;
            if (m.a(strA, aVar != null ? aVar.a() : null)) {
                obj = next;
                break;
            }
        }
        f10593f = (a) obj;
        f10595h = true;
        f10592e = listG;
        if (interfaceC1016l != null) {
            interfaceC1016l.o(listG);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean G(File file) {
        return file.isDirectory() && !m.a(file.getName(), "tmp");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(File file) {
        return file.isFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a t(GameParams gameParams, List list, String str, String str2, String str3) {
        if (gameParams.getVariant() == null || list.contains(str3)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            while (list.contains(String.valueOf(jCurrentTimeMillis))) {
                jCurrentTimeMillis++;
            }
            str3 = String.valueOf(jCurrentTimeMillis);
        }
        File file = new File(k(), str3);
        file.mkdir();
        if (gameParams.getLib() != null) {
            u(str, p.g(), gameParams.getLib());
        }
        File file2 = new File(file, "params.json");
        String strT = f10591d.t(gameParams);
        m.d(strT, "toJson(...)");
        String absolutePath = null;
        e3.i.h(file2, strT, null, 2, null);
        if (str2.length() > 0) {
            File file3 = new File(file, "var.ini");
            e3.i.h(file3, str2, null, 2, null);
            absolutePath = file3.getAbsolutePath();
        }
        return new a(gameParams, absolutePath, str3);
    }

    public static /* synthetic */ String v(FairyRepository fairyRepository, String str, List list, String str2, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            str2 = "";
        }
        return fairyRepository.u(str, list, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String w(p3.h hVar) {
        m.e(hVar, "it");
        return (String) hVar.a().get(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final cab.shashki.app.service.FairyRepository.a y(java.util.List r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            o3.g r5 = U2.p.y(r5)
            q0.l r0 = new q0.l
            r0.<init>()
            o3.g r5 = o3.h.p(r5, r0)
            java.util.Iterator r5 = r5.iterator()
        L11:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r5.next()
            cab.shashki.app.service.FairyRepository$a r0 = (cab.shashki.app.service.FairyRepository.a) r0
            cab.shashki.app.service.FairyRepository$GameParams r2 = r0.c()
            java.lang.String r2 = r2.getVariant()
            if (r2 != 0) goto L2a
            java.lang.String r2 = "custom_cc"
        L2a:
            boolean r2 = h3.m.a(r2, r8)
            if (r2 == 0) goto L11
            cab.shashki.app.service.FairyRepository$GameParams r2 = r0.c()
            java.lang.String r2 = r2.getLib()
            boolean r2 = h3.m.a(r2, r6)
            if (r2 == 0) goto L3f
            goto L6d
        L3f:
            cab.shashki.app.service.FairyRepository$GameParams r2 = r0.c()
            java.lang.String r2 = r2.getLib()
            if (r2 != 0) goto L11
            java.lang.String r2 = r0.b()
            if (r2 == 0) goto L65
            int r3 = r2.length()
            if (r3 <= 0) goto L56
            goto L57
        L56:
            r2 = r1
        L57:
            if (r2 == 0) goto L65
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            r2 = 1
            java.lang.String r1 = e3.i.f(r3, r1, r2, r1)
            if (r1 != 0) goto L67
        L65:
            java.lang.String r1 = ""
        L67:
            boolean r1 = h3.m.a(r7, r1)
            if (r1 == 0) goto L11
        L6d:
            return r0
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.service.FairyRepository.y(java.util.List, java.lang.String, java.lang.String, java.lang.String):cab.shashki.app.service.FairyRepository$a");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a z(String str) {
        m.e(str, "it");
        return f10588a.q(str);
    }

    public final void A(a aVar) {
        a aVar2 = f10593f;
        boolean zA = m.a(aVar2 != null ? aVar2.a() : null, aVar != null ? aVar.a() : null);
        f10593f = aVar;
        if (zA) {
            return;
        }
        if (aVar == null) {
            f10590c.edit().remove("fairy_custom").apply();
            return;
        }
        SharedPreferences.Editor editorEdit = f10590c.edit();
        a aVar3 = f10593f;
        editorEdit.putString("fairy_custom", aVar3 != null ? aVar3.a() : null).apply();
    }

    public final void B(a aVar) {
        f10594g = aVar;
    }

    public final File C() {
        return new File(k(), "tmp");
    }

    public final void D(final InterfaceC1016l interfaceC1016l) {
        S2.a.c().b(new Runnable() { // from class: q0.h
            @Override // java.lang.Runnable
            public final void run() {
                FairyRepository.F(interfaceC1016l);
            }
        });
    }

    public final void H(a aVar) {
        m.e(aVar, "engine");
        File file = new File(new File(k(), aVar.a()), "params.json");
        String strT = new H1.d().t(aVar.c());
        m.d(strT, "toJson(...)");
        e3.i.h(file, strT, null, 2, null);
    }

    public final long i(a aVar) {
        m.e(aVar, "engine");
        File file = new File(k(), aVar.a());
        if (!file.exists()) {
            file = null;
        }
        if (file == null) {
            return -1L;
        }
        return file.lastModified();
    }

    public final void j(String str) {
        GameParams gameParamsC;
        m.e(str, HalmaParams.NAME);
        f10590c.edit().remove(str).apply();
        new File(p(), str).delete();
        a aVar = f10593f;
        if (m.a((aVar == null || (gameParamsC = aVar.c()) == null) ? null : gameParamsC.getLib(), str)) {
            A(null);
        }
    }

    public final File k() {
        return new File(ShashkiApp.f10561b.a().getFilesDir(), "Fairy");
    }

    public final a l() {
        a aVar = f10594g;
        return aVar == null ? f10593f : aVar;
    }

    public final Map m() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        File[] fileArrListFiles = p().listFiles(new FileFilter() { // from class: q0.j
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return FairyRepository.n(file);
            }
        });
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                Set<String> stringSet = f10590c.getStringSet(file.getName(), null);
                if (stringSet != null && !stringSet.isEmpty()) {
                    linkedHashMap.put(file.getName(), stringSet);
                }
            }
        }
        return linkedHashMap;
    }

    public final j o() {
        return f10589b;
    }

    public final File p() {
        return new File(k(), "_libs_");
    }

    public final a q(String str) {
        m.e(str, "dir");
        File file = new File(k(), str);
        if (!file.exists()) {
            return null;
        }
        File file2 = new File(file, "params.json");
        if (!file2.exists()) {
            return null;
        }
        GameParams gameParams = (GameParams) f10591d.k(e3.i.f(file2, null, 1, null), GameParams.class);
        if (gameParams.getLib() != null) {
            File file3 = new File(p(), gameParams.getLib());
            if (!file3.exists() || !file3.isFile()) {
                return null;
            }
            m.b(gameParams);
            return new a(gameParams, null, str);
        }
        File file4 = new File(file, "var.ini");
        if (!file4.exists() && !AbstractC0590i.q(u1.f20864a.a(), gameParams.getVariant())) {
            return null;
        }
        m.b(gameParams);
        if (!file4.exists()) {
            file4 = null;
        }
        return new a(gameParams, file4 != null ? file4.getAbsolutePath() : null, str);
    }

    public final void r(InterfaceC1016l interfaceC1016l) {
        m.e(interfaceC1016l, "onLoad");
        if (f10595h) {
            interfaceC1016l.o(f10592e);
        } else {
            f10595h = true;
            D(interfaceC1016l);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final cab.shashki.app.service.FairyRepository.b s(cab.shashki.app.service.FairyRepository.a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "engine"
            h3.m.e(r7, r0)
            cab.shashki.app.service.FairyRepository$GameParams r0 = r7.c()
            java.util.Map r0 = r0.getPieceMap()
            if (r0 != 0) goto L15
            y0.b r0 = new y0.b
            r0.<init>(r7)
            return r0
        L15:
            cab.shashki.app.service.FairyRepository$GameParams r0 = r7.c()
            java.lang.String r0 = r0.getImageSet()
            r1 = 0
            if (r0 == 0) goto L39
            r2 = 0
            r3 = 2
            java.lang.String r4 = "chess:"
            boolean r2 = p3.n.x(r0, r4, r2, r3, r1)
            if (r2 == 0) goto L2b
            goto L2c
        L2b:
            r0 = r1
        L2c:
            if (r0 == 0) goto L39
            r2 = 6
            java.lang.String r0 = r0.substring(r2)
            java.lang.String r2 = "substring(...)"
            h3.m.d(r0, r2)
            goto L3a
        L39:
            r0 = r1
        L3a:
            if (r0 == 0) goto L86
            o0.E r2 = o0.C1218E.f18139a
            java.util.List r2 = r2.c()
            java.util.Iterator r2 = r2.iterator()
        L46:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L5e
            java.lang.Object r3 = r2.next()
            r4 = r3
            o0.c r4 = (o0.AbstractC1232c) r4
            java.lang.String r4 = r4.getName()
            boolean r4 = h3.m.a(r4, r0)
            if (r4 == 0) goto L46
            r1 = r3
        L5e:
            o0.c r1 = (o0.AbstractC1232c) r1
            if (r1 != 0) goto L67
            o0.f r1 = new o0.f
            r1.<init>(r0)
        L67:
            y0.a r0 = new y0.a
            cab.shashki.app.service.FairyRepository$GameParams r7 = r7.c()
            java.lang.String r7 = r7.getPieces()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            java.lang.String r7 = "*"
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            r0.<init>(r7, r1)
            return r0
        L86:
            cab.shashki.app.service.FairyRepository$GameParams r0 = r7.c()
            java.lang.String r0 = r0.getImageSet()
            if (r0 == 0) goto Lb8
            java.io.File r2 = new java.io.File
            java.io.File r3 = new java.io.File
            cab.shashki.app.service.FairyRepository r4 = cab.shashki.app.service.FairyRepository.f10588a
            java.io.File r4 = r4.k()
            java.lang.String r5 = r7.a()
            r3.<init>(r4, r5)
            r2.<init>(r3, r0)
            boolean r0 = r2.exists()
            if (r0 == 0) goto Lb1
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto Lb1
            goto Lb2
        Lb1:
            r2 = r1
        Lb2:
            if (r2 == 0) goto Lb8
            java.lang.String r1 = r2.getName()
        Lb8:
            if (r1 != 0) goto Lc4
            z0.v1 r0 = new z0.v1
            cab.shashki.app.service.FairyRepository$GameParams r7 = r7.c()
            r0.<init>(r7)
            return r0
        Lc4:
            y0.b r0 = new y0.b
            r0.<init>(r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.service.FairyRepository.s(cab.shashki.app.service.FairyRepository$a):cab.shashki.app.service.FairyRepository$b");
    }

    public final String u(String str, List list, String str2) {
        m.e(str, "lib");
        m.e(list, "variants");
        m.e(str2, HalmaParams.NAME);
        if (str2.length() == 0) {
            CRC32 crc32 = new CRC32();
            byte[] bytes = str.getBytes(p3.d.f18870b);
            m.d(bytes, "getBytes(...)");
            crc32.update(bytes);
            String string = Long.toString(crc32.getValue(), AbstractC1273a.a(16));
            m.d(string, "toString(...)");
            str2 = string + ".ini";
        }
        File file = new File(p(), str2);
        if (!file.exists()) {
            p().mkdirs();
            e3.i.h(file, str, null, 2, null);
            f10590c.edit().putStringSet(str2, !list.isEmpty() ? p.f0(list) : o3.h.r(o3.h.o(j.e(f10589b, str, 0, 2, null), new InterfaceC1016l() { // from class: q0.k
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return FairyRepository.w((p3.h) obj);
                }
            }))).apply();
        }
        return str2;
    }

    public final T2.l x(File file) {
        GameParams gameParams;
        m.e(file, "file");
        e3.i.l(C());
        C().mkdirs();
        C0573k.f2973a.F(file, C());
        try {
            gameParams = (GameParams) f10591d.k(e3.i.f(new File(C(), "params.json"), null, 1, null), GameParams.class);
        } catch (Exception unused) {
            gameParams = null;
        }
        if (gameParams == null) {
            return new T2.l(Boolean.FALSE, null);
        }
        String lib = gameParams.getLib();
        if (lib != null && lib.length() != 0) {
            File file2 = new File(C(), gameParams.getLib());
            if (!file2.exists() || !file2.isFile()) {
                return new T2.l(Boolean.FALSE, null);
            }
            u(e3.i.f(file2, null, 1, null), p.g(), gameParams.getLib());
            file2.delete();
        } else if (!new File(C(), "var.ini").exists() && !AbstractC0590i.q(u1.f20864a.a(), gameParams.getVariant())) {
            return new T2.l(Boolean.FALSE, null);
        }
        File fileK = k();
        String name = file.getName();
        m.d(name, "getName(...)");
        File file3 = new File(fileK, n.t(name, ".zip", "", false, 4, null));
        long jCurrentTimeMillis = System.currentTimeMillis();
        while (file3.exists()) {
            jCurrentTimeMillis++;
            file3 = new File(k(), String.valueOf(jCurrentTimeMillis));
        }
        return new T2.l(Boolean.valueOf(C().renameTo(file3)), gameParams.getName());
    }

    public static final class GameParams {
        private final String boardFile;
        private final Integer handMode;
        private String imageSet;
        private final String lib;
        private final String name;
        private final float ox;
        private final float oy;
        private final Map<String, Integer> pieceMap;
        private final String pieces;
        private final boolean universalBoard;
        private final String variant;

        /* renamed from: x, reason: collision with root package name */
        private final int f10596x;

        /* renamed from: y, reason: collision with root package name */
        private final int f10597y;

        public GameParams(String str, int i4, int i5, float f4, float f5, String str2, String str3, String str4, String str5, boolean z4, Map<String, Integer> map, Integer num, String str6) {
            m.e(str, HalmaParams.NAME);
            m.e(str2, "pieces");
            this.name = str;
            this.f10596x = i4;
            this.f10597y = i5;
            this.ox = f4;
            this.oy = f5;
            this.pieces = str2;
            this.boardFile = str3;
            this.lib = str4;
            this.variant = str5;
            this.universalBoard = z4;
            this.pieceMap = map;
            this.handMode = num;
            this.imageSet = str6;
        }

        public final String getBoardFile() {
            return this.boardFile;
        }

        public final Integer getHandMode() {
            return this.handMode;
        }

        public final String getImageSet() {
            return this.imageSet;
        }

        public final String getLib() {
            return this.lib;
        }

        public final String getName() {
            return this.name;
        }

        public final float getOx() {
            return this.ox;
        }

        public final float getOy() {
            return this.oy;
        }

        public final Map<String, Integer> getPieceMap() {
            return this.pieceMap;
        }

        public final String getPieces() {
            return this.pieces;
        }

        public final boolean getUniversalBoard() {
            return this.universalBoard;
        }

        public final String getVariant() {
            return this.variant;
        }

        public final int getX() {
            return this.f10596x;
        }

        public final int getY() {
            return this.f10597y;
        }

        public final void setImageSet(String str) {
            this.imageSet = str;
        }

        public /* synthetic */ GameParams(String str, int i4, int i5, float f4, float f5, String str2, String str3, String str4, String str5, boolean z4, Map map, Integer num, String str6, int i6, h hVar) {
            this(str, i4, i5, f4, f5, str2, str3, (i6 & 128) != 0 ? null : str4, (i6 & 256) != 0 ? null : str5, (i6 & 512) != 0 ? false : z4, (i6 & 1024) != 0 ? null : map, (i6 & 2048) != 0 ? null : num, (i6 & 4096) != 0 ? null : str6);
        }
    }
}