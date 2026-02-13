package cab.shashki.app.ui.universal;

import N0.C0574l;
import N0.K;
import T2.l;
import T2.u;
import U2.AbstractC0590i;
import U2.E;
import U2.F;
import U2.p;
import android.content.Context;
import cab.shashki.app.db.entities.CaptureSelf;
import cab.shashki.app.db.entities.Cells;
import cab.shashki.app.db.entities.CheckersParams;
import cab.shashki.app.db.entities.Cylinder;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.ui.custom.board.C0843z;
import cab.shashki.app.ui.custom.board.ShashkiBoardView;
import cab.shashki.app.ui.custom.board.W;
import cab.shashki.app.ui.universal.d;
import f0.AbstractC0888D;
import f0.AbstractC0909m;
import g3.InterfaceC1005a;
import g3.InterfaceC1016l;
import h3.m;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m3.g;
import m3.h;
import o0.C1218E;
import o0.I;
import p3.j;
import p3.n;
import q0.e0;
import q0.f0;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class a extends AbstractC0909m implements W {

    /* renamed from: A, reason: collision with root package name */
    private String f11837A;

    /* renamed from: B, reason: collision with root package name */
    private final Cells[] f11838B;

    /* renamed from: C, reason: collision with root package name */
    private final j f11839C;

    /* renamed from: D, reason: collision with root package name */
    private final j f11840D;

    /* renamed from: d, reason: collision with root package name */
    private final int f11841d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f11842e;

    /* renamed from: f, reason: collision with root package name */
    private d.a f11843f;

    /* renamed from: g, reason: collision with root package name */
    private d.b f11844g;

    /* renamed from: h, reason: collision with root package name */
    private final List f11845h;

    /* renamed from: i, reason: collision with root package name */
    private final List f11846i;

    /* renamed from: j, reason: collision with root package name */
    private int f11847j;

    /* renamed from: k, reason: collision with root package name */
    private CheckersParams f11848k;

    /* renamed from: l, reason: collision with root package name */
    private final Set f11849l;

    /* renamed from: m, reason: collision with root package name */
    private final Set f11850m;

    /* renamed from: n, reason: collision with root package name */
    private final Set f11851n;

    /* renamed from: o, reason: collision with root package name */
    private final Set f11852o;

    /* renamed from: p, reason: collision with root package name */
    private final Set f11853p;

    /* renamed from: q, reason: collision with root package name */
    private final Set f11854q;

    /* renamed from: r, reason: collision with root package name */
    private final Set f11855r;

    /* renamed from: s, reason: collision with root package name */
    private final Set f11856s;

    /* renamed from: t, reason: collision with root package name */
    private final Set f11857t;

    /* renamed from: u, reason: collision with root package name */
    private final int f11858u;

    /* renamed from: v, reason: collision with root package name */
    private int f11859v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f11860w;

    /* renamed from: x, reason: collision with root package name */
    private d.a f11861x;

    /* renamed from: y, reason: collision with root package name */
    private int f11862y;

    /* renamed from: z, reason: collision with root package name */
    private String f11863z;

    /* renamed from: cab.shashki.app.ui.universal.a$a, reason: collision with other inner class name */
    private static final class C0155a {

        /* renamed from: a, reason: collision with root package name */
        private final int f11864a;

        /* renamed from: b, reason: collision with root package name */
        private final String f11865b;

        /* renamed from: c, reason: collision with root package name */
        private final CheckersParams f11866c;

        public C0155a(int i4, String str, CheckersParams checkersParams) {
            m.e(str, HalmaParams.NAME);
            m.e(checkersParams, "params");
            this.f11864a = i4;
            this.f11865b = str;
            this.f11866c = checkersParams;
        }

        public final int a() {
            return this.f11864a;
        }

        public final String b() {
            return this.f11865b;
        }

        public final CheckersParams c() {
            return this.f11866c;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11867a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f11868b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f11869c;

        static {
            int[] iArr = new int[Cells.values().length];
            try {
                iArr[Cells.HEXAGON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Cells.DYNAMIC_HEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11867a = iArr;
            int[] iArr2 = new int[d.a.values().length];
            try {
                iArr2[d.a.f11889h.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[d.a.f11892k.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[d.a.f11888g.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[d.a.f11893l.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[d.a.f11887f.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[d.a.f11890i.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[d.a.f11886e.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[d.a.f11891j.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[d.a.f11885d.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            f11868b = iArr2;
            int[] iArr3 = new int[d.b.values().length];
            try {
                iArr3[d.b.f11897e.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[d.b.f11900h.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[d.b.f11899g.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[d.b.f11898f.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[d.b.f11896d.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            f11869c = iArr3;
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return W2.a.d(((C0155a) obj).b(), ((C0155a) obj2).b());
        }
    }

    public a(Context context, int i4, boolean z4) {
        e0 e0Var;
        CheckersParams checkersParamsH;
        m.e(context, "context");
        this.f11841d = i4;
        this.f11842e = z4;
        this.f11843f = d.a.f11885d;
        this.f11844g = d.b.f11896d;
        List listU = F.u(f0.f19065a.a());
        ArrayList arrayList = new ArrayList(p.o(listU, 10));
        int i5 = 0;
        for (Object obj : listU) {
            int i6 = i5 + 1;
            if (i5 < 0) {
                p.n();
            }
            l lVar = (l) obj;
            String string = context.getString(((Number) lVar.c()).intValue());
            m.d(string, "getString(...)");
            arrayList.add(new C0155a(i5, string, (CheckersParams) lVar.d()));
            i5 = i6;
        }
        List listX = p.X(arrayList, new c());
        this.f11845h = listX;
        ArrayList arrayList2 = new ArrayList(p.o(listX, 10));
        Iterator it = listX.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0155a) it.next()).b());
        }
        this.f11846i = arrayList2;
        Iterator it2 = this.f11845h.iterator();
        int i7 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i7 = -1;
                break;
            } else if (((C0155a) it2.next()).a() == 0) {
                break;
            } else {
                i7++;
            }
        }
        this.f11847j = i7;
        CheckersParams checkersParamsC = ((C0155a) this.f11845h.get(i7)).c();
        this.f11848k = checkersParamsC.copy(((-3) & 1) != 0 ? checkersParamsC.name : null, ((-3) & 2) != 0 ? checkersParamsC.id : (int) (System.currentTimeMillis() >> 10), ((-3) & 4) != 0 ? checkersParamsC.rows : 0, ((-3) & 8) != 0 ? checkersParamsC.columns : 0, ((-3) & 16) != 0 ? checkersParamsC.maxPieces : 0, ((-3) & 32) != 0 ? checkersParamsC.cells : null, ((-3) & 64) != 0 ? checkersParamsC.startPosition : null, ((-3) & 128) != 0 ? checkersParamsC.reverseColor : false, ((-3) & 256) != 0 ? checkersParamsC.monochorome : false, ((-3) & 512) != 0 ? checkersParamsC.fourPlayers : false, ((-3) & 1024) != 0 ? checkersParamsC.draw3Repeat : false, ((-3) & 2048) != 0 ? checkersParamsC.layeredPiece : false, ((-3) & 4096) != 0 ? checkersParamsC.drawMoves : 0, ((-3) & 8192) != 0 ? checkersParamsC.wolfRule : 0, ((-3) & 16384) != 0 ? checkersParamsC.manMoveMask : 0, ((-3) & 32768) != 0 ? checkersParamsC.kingMoveMask : 0, ((-3) & 65536) != 0 ? checkersParamsC.pawnCaptureMask : 0, ((-3) & 131072) != 0 ? checkersParamsC.kingCaptureMask : 0, ((-3) & 262144) != 0 ? checkersParamsC.blocked : null, ((-3) & 524288) != 0 ? checkersParamsC.portals : null, ((-3) & 1048576) != 0 ? checkersParamsC.promWhite : null, ((-3) & 2097152) != 0 ? checkersParamsC.promBlack : null, ((-3) & 4194304) != 0 ? checkersParamsC.promX : null, ((-3) & 8388608) != 0 ? checkersParamsC.promY : null, ((-3) & 16777216) != 0 ? checkersParamsC.breaks : null, ((-3) & 33554432) != 0 ? checkersParamsC.spins : null, ((-3) & 67108864) != 0 ? checkersParamsC.flyingKing : false, ((-3) & 134217728) != 0 ? checkersParamsC.captureMax : false, ((-3) & 268435456) != 0 ? checkersParamsC.turkCapture : false, ((-3) & 536870912) != 0 ? checkersParamsC.towerCapture : false, ((-3) & 1073741824) != 0 ? checkersParamsC.gorgonCapture : false, ((-3) & Integer.MIN_VALUE) != 0 ? checkersParamsC.reverseCapture : false, (65535 & 1) != 0 ? checkersParamsC.pawnCanCaptureKing : false, (65535 & 2) != 0 ? checkersParamsC.pawnPromotionInCapture : false, (65535 & 4) != 0 ? checkersParamsC.kingDemotionInsteadOfCapture : false, (65535 & 8) != 0 ? checkersParamsC.kingOnlyStandsNextCellAfterCapture : false, (65535 & 16) != 0 ? checkersParamsC.kingCaptureFlyInversion : false, (65535 & 32) != 0 ? checkersParamsC.kingCaptureInsteadPawn : false, (65535 & 64) != 0 ? checkersParamsC.killer : false, (65535 & 128) != 0 ? checkersParamsC.spinLimit : 0, (65535 & 256) != 0 ? checkersParamsC.ken : 0, (65535 & 512) != 0 ? checkersParamsC.kenKong : false, (65535 & 1024) != 0 ? checkersParamsC.kingWeightInCapture : 0.0f, (65535 & 2048) != 0 ? checkersParamsC.stavropol : false, (65535 & 4096) != 0 ? checkersParamsC.breakthrough : false, (65535 & 8192) != 0 ? checkersParamsC.ignoreCapture : false, (65535 & 16384) != 0 ? checkersParamsC.doubleMove : false, (65535 & 32768) != 0 ? checkersParamsC.losing : false);
        this.f11849l = new LinkedHashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f11850m = linkedHashSet;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        this.f11851n = linkedHashSet2;
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        this.f11852o = linkedHashSet3;
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        this.f11853p = linkedHashSet4;
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        this.f11854q = linkedHashSet5;
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        this.f11855r = linkedHashSet6;
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        this.f11856s = linkedHashSet7;
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        this.f11857t = linkedHashSet8;
        this.f11858u = 9;
        this.f11860w = true;
        this.f11861x = d.a.f11886e;
        this.f11863z = "";
        this.f11838B = new Cells[]{Cells.ALL, Cells.ALQUERQUE, Cells.ZAMMA};
        if (W0() && (checkersParamsH = (e0Var = e0.f19058a).h(String.valueOf(this.f11841d))) != null) {
            CheckersParams checkersParamsCopy = checkersParamsH.copy(((-3) & 1) != 0 ? checkersParamsH.name : null, ((-3) & 2) != 0 ? checkersParamsH.id : 0, ((-3) & 4) != 0 ? checkersParamsH.rows : 0, ((-3) & 8) != 0 ? checkersParamsH.columns : 0, ((-3) & 16) != 0 ? checkersParamsH.maxPieces : 0, ((-3) & 32) != 0 ? checkersParamsH.cells : null, ((-3) & 64) != 0 ? checkersParamsH.startPosition : null, ((-3) & 128) != 0 ? checkersParamsH.reverseColor : false, ((-3) & 256) != 0 ? checkersParamsH.monochorome : false, ((-3) & 512) != 0 ? checkersParamsH.fourPlayers : false, ((-3) & 1024) != 0 ? checkersParamsH.draw3Repeat : false, ((-3) & 2048) != 0 ? checkersParamsH.layeredPiece : false, ((-3) & 4096) != 0 ? checkersParamsH.drawMoves : 0, ((-3) & 8192) != 0 ? checkersParamsH.wolfRule : 0, ((-3) & 16384) != 0 ? checkersParamsH.manMoveMask : 0, ((-3) & 32768) != 0 ? checkersParamsH.kingMoveMask : 0, ((-3) & 65536) != 0 ? checkersParamsH.pawnCaptureMask : 0, ((-3) & 131072) != 0 ? checkersParamsH.kingCaptureMask : 0, ((-3) & 262144) != 0 ? checkersParamsH.blocked : null, ((-3) & 524288) != 0 ? checkersParamsH.portals : null, ((-3) & 1048576) != 0 ? checkersParamsH.promWhite : null, ((-3) & 2097152) != 0 ? checkersParamsH.promBlack : null, ((-3) & 4194304) != 0 ? checkersParamsH.promX : null, ((-3) & 8388608) != 0 ? checkersParamsH.promY : null, ((-3) & 16777216) != 0 ? checkersParamsH.breaks : null, ((-3) & 33554432) != 0 ? checkersParamsH.spins : null, ((-3) & 67108864) != 0 ? checkersParamsH.flyingKing : false, ((-3) & 134217728) != 0 ? checkersParamsH.captureMax : false, ((-3) & 268435456) != 0 ? checkersParamsH.turkCapture : false, ((-3) & 536870912) != 0 ? checkersParamsH.towerCapture : false, ((-3) & 1073741824) != 0 ? checkersParamsH.gorgonCapture : false, ((-3) & Integer.MIN_VALUE) != 0 ? checkersParamsH.reverseCapture : false, (65535 & 1) != 0 ? checkersParamsH.pawnCanCaptureKing : false, (65535 & 2) != 0 ? checkersParamsH.pawnPromotionInCapture : false, (65535 & 4) != 0 ? checkersParamsH.kingDemotionInsteadOfCapture : false, (65535 & 8) != 0 ? checkersParamsH.kingOnlyStandsNextCellAfterCapture : false, (65535 & 16) != 0 ? checkersParamsH.kingCaptureFlyInversion : false, (65535 & 32) != 0 ? checkersParamsH.kingCaptureInsteadPawn : false, (65535 & 64) != 0 ? checkersParamsH.killer : false, (65535 & 128) != 0 ? checkersParamsH.spinLimit : 0, (65535 & 256) != 0 ? checkersParamsH.ken : 0, (65535 & 512) != 0 ? checkersParamsH.kenKong : false, (65535 & 1024) != 0 ? checkersParamsH.kingWeightInCapture : 0.0f, (65535 & 2048) != 0 ? checkersParamsH.stavropol : false, (65535 & 4096) != 0 ? checkersParamsH.breakthrough : false, (65535 & 8192) != 0 ? checkersParamsH.ignoreCapture : false, (65535 & 16384) != 0 ? checkersParamsH.doubleMove : false, (65535 & 32768) != 0 ? checkersParamsH.losing : false);
            this.f11848k = checkersParamsCopy;
            checkersParamsCopy.setCylinder(checkersParamsH.getCylinder());
            this.f11848k.setCaptureSelf(checkersParamsH.getCaptureSelf());
            Set<String> promWhite = this.f11848k.getPromWhite();
            if (promWhite != null) {
                linkedHashSet5.addAll(promWhite);
            }
            Set<String> promBlack = this.f11848k.getPromBlack();
            if (promBlack != null) {
                linkedHashSet6.addAll(promBlack);
            }
            Set<String> promX = this.f11848k.getPromX();
            if (promX != null) {
                linkedHashSet7.addAll(promX);
            }
            Set<String> promY = this.f11848k.getPromY();
            if (promY != null) {
                linkedHashSet8.addAll(promY);
            }
            Set<String> spins = this.f11848k.getSpins();
            if (spins != null) {
                linkedHashSet4.addAll(spins);
            }
            Set<String> breaks = this.f11848k.getBreaks();
            if (breaks != null) {
                linkedHashSet3.addAll(breaks);
            }
            Set<String> blocked = this.f11848k.getBlocked();
            if (blocked != null) {
                linkedHashSet2.addAll(blocked);
            }
            Set<String> portals = this.f11848k.getPortals();
            if (portals != null) {
                linkedHashSet.addAll(portals);
            }
            this.f11860w = linkedHashSet5.isEmpty() && linkedHashSet6.isEmpty() && linkedHashSet7.isEmpty() && linkedHashSet8.isEmpty();
            if (this.f11842e) {
                Long lValueOf = Long.valueOf(e0Var.e(this.f11841d));
                lValueOf = lValueOf.longValue() <= 0 ? null : lValueOf;
                if (lValueOf != null) {
                    this.f11837A = new SimpleDateFormat("d MMMM HH:mm:ss").format(new Date(lValueOf.longValue()));
                }
            } else {
                this.f11837A = this.f11848k.getName();
            }
        }
        this.f11839C = new j("\\w\\d?:?(\\w*),?");
        this.f11840D = new j("\\w?\\d*[$*]?:?(\\w*),?");
    }

    private final boolean A1(String str, String str2) throws NumberFormatException {
        if (Math.abs(str.charAt(0) - str2.charAt(0)) < 2) {
            String strSubstring = str.substring(1);
            m.d(strSubstring, "substring(...)");
            int i4 = Integer.parseInt(strSubstring);
            String strSubstring2 = str2.substring(1);
            m.d(strSubstring2, "substring(...)");
            if (Math.abs(i4 - Integer.parseInt(strSubstring2)) < 2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean I0(cab.shashki.app.ui.custom.board.ShashkiBoardView r6, java.lang.String r7, int r8, cab.shashki.app.ui.custom.board.C0843z.i r9) {
        /*
            r5 = this;
            boolean r0 = r5.w3(r7)
            r1 = 0
            if (r0 != 0) goto L9b
            if (r9 == 0) goto L13
            cab.shashki.app.db.entities.CheckersParams r0 = r5.f11848k
            boolean r0 = r0.getLayeredPiece()
            if (r0 != 0) goto L13
            goto L9b
        L13:
            cab.shashki.app.db.entities.CheckersParams r0 = r5.f11848k
            boolean r0 = r0.getMonochorome()
            if (r0 == 0) goto L1e
            r8 = 119(0x77, float:1.67E-43)
            goto L24
        L1e:
            java.lang.String r0 = "bxwy"
            char r8 = r0.charAt(r8)
        L24:
            cab.shashki.app.db.entities.CheckersParams r0 = r5.f11848k
            cab.shashki.app.db.entities.Cells r0 = r0.getCells()
            boolean r0 = r0.isDynamic()
            cab.shashki.app.db.entities.CheckersParams r2 = r5.f11848k
            java.lang.String r2 = r2.getStartPosition()
            if (r0 == 0) goto L39
            p3.j r0 = r5.f11840D
            goto L3b
        L39:
            p3.j r0 = r5.f11839C
        L3b:
            java.lang.String r3 = "$1"
            java.lang.String r0 = r0.k(r2, r3)
            r2 = 0
            r3 = 0
        L43:
            int r4 = r0.length()
            if (r2 >= r4) goto L54
            char r4 = r0.charAt(r2)
            if (r4 != r8) goto L51
            int r3 = r3 + 1
        L51:
            int r2 = r2 + 1
            goto L43
        L54:
            cab.shashki.app.db.entities.CheckersParams r0 = r5.f11848k
            int r0 = r0.getMaxPieces()
            if (r3 < r0) goto L68
            f0.p r6 = r5.w0()
            cab.shashki.app.ui.universal.d r6 = (cab.shashki.app.ui.universal.d) r6
            if (r6 == 0) goto L67
            r6.d()
        L67:
            return r1
        L68:
            o0.I r0 = r5.J()
            int r0 = r0.a(r8)
            if (r9 == 0) goto L79
            int r2 = r9.a()
            if (r2 == r0) goto L79
            return r1
        L79:
            if (r9 == 0) goto L92
            java.lang.String r9 = r9.b()
            if (r9 == 0) goto L92
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r8)
            java.lang.String r9 = r2.toString()
            if (r9 != 0) goto L96
        L92:
            java.lang.String r9 = java.lang.String.valueOf(r8)
        L96:
            r6.g1(r7, r0, r1, r9)
            r6 = 1
            return r6
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.ui.universal.a.I0(cab.shashki.app.ui.custom.board.ShashkiBoardView, java.lang.String, int, cab.shashki.app.ui.custom.board.z$i):boolean");
    }

    static /* synthetic */ boolean J0(a aVar, ShashkiBoardView shashkiBoardView, String str, int i4, C0843z.i iVar, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            iVar = null;
        }
        return aVar.I0(shashkiBoardView, str, i4, iVar);
    }

    private final boolean N2(ShashkiBoardView shashkiBoardView, int i4, int i5, C0843z.i iVar) {
        ArrayList arrayList;
        if (i5 == 0 || i5 == 2) {
            g gVarJ = h.j(0, !this.f11848k.getCells().isHex() ? this.f11848k.getColumns() : (this.f11848k.getColumns() << 1) - 1);
            ArrayList arrayList2 = new ArrayList(p.o(gVarJ, 10));
            Iterator it = gVarJ.iterator();
            while (it.hasNext()) {
                arrayList2.add(Character.valueOf((char) (((E) it).a() + 97)));
            }
            ArrayList arrayList3 = new ArrayList(p.o(arrayList2, 10));
            int size = arrayList2.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                i6++;
                char cCharValue = ((Character) obj).charValue();
                StringBuilder sb = new StringBuilder();
                sb.append(cCharValue);
                sb.append(i4);
                arrayList3.add(sb.toString());
            }
            arrayList = new ArrayList();
            int size2 = arrayList3.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = arrayList3.get(i7);
                i7++;
                if (!w3((String) obj2)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            g gVar = new g(1, !this.f11848k.getCells().isHex() ? this.f11848k.getRows() : this.f11848k.getColumns() << 1);
            ArrayList arrayList4 = new ArrayList(p.o(gVar, 10));
            Iterator it2 = gVar.iterator();
            while (it2.hasNext()) {
                int iA = ((E) it2).a();
                StringBuilder sb2 = new StringBuilder();
                sb2.append((char) i4);
                sb2.append(iA);
                arrayList4.add(sb2.toString());
            }
            arrayList = new ArrayList();
            int size3 = arrayList4.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj3 = arrayList4.get(i8);
                i8++;
                if (!w3((String) obj3)) {
                    arrayList.add(obj3);
                }
            }
        }
        char cCharAt = this.f11848k.getMonochorome() ? 'w' : "bxwy".charAt(i5);
        String strK = new j("\\w\\d?:?(\\w*),?").k(this.f11848k.getStartPosition(), "$1");
        int i9 = 0;
        for (int i10 = 0; i10 < strK.length(); i10++) {
            if (strK.charAt(i10) == cCharAt) {
                i9++;
            }
        }
        if (i9 + arrayList.size() > this.f11848k.getMaxPieces()) {
            d dVar = (d) w0();
            if (dVar != null) {
                dVar.d();
            }
            return false;
        }
        int iA2 = J().a(cCharAt);
        if (iVar != null && this.f11848k.getLayeredPiece() && iVar.a() == iA2) {
            int size4 = arrayList.size();
            int i11 = 0;
            while (i11 < size4) {
                Object obj4 = arrayList.get(i11);
                i11++;
                String str = (String) obj4;
                C0843z.i iVarP1 = shashkiBoardView.p1(str);
                if (iVarP1 == null || iVarP1.a() != iA2) {
                    shashkiBoardView.g1(str, iA2, false, String.valueOf(cCharAt));
                } else {
                    shashkiBoardView.g1(str, iA2, false, iVarP1.b() + cCharAt);
                }
            }
        } else {
            shashkiBoardView.P2(arrayList, iA2, String.valueOf(cCharAt));
        }
        return true;
    }

    static /* synthetic */ boolean O2(a aVar, ShashkiBoardView shashkiBoardView, int i4, int i5, C0843z.i iVar, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            iVar = null;
        }
        return aVar.N2(shashkiBoardView, i4, i5, iVar);
    }

    private final boolean P0(String str) throws NumberFormatException {
        if (this.f11848k.getCells().getV() > 3) {
            return false;
        }
        if (w3(str) == (this.f11848k.getCells().getV() > 1)) {
            return false;
        }
        char cCharAt = str.charAt(0);
        int i4 = cCharAt - 'a';
        String strSubstring = str.substring(1);
        m.d(strSubstring, "substring(...)");
        int i5 = Integer.parseInt(strSubstring);
        char c4 = cCharAt;
        char c5 = (char) (c4 + 1);
        StringBuilder sb = new StringBuilder();
        sb.append(c5);
        sb.append(i5);
        if (w3(sb.toString())) {
            return false;
        }
        char c6 = (char) (c4 - 1);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c6);
        sb2.append(i5);
        if (w3(sb2.toString())) {
            return false;
        }
        int i6 = i5 + 1;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(c4);
        sb3.append(i6);
        if (w3(sb3.toString())) {
            return false;
        }
        int i7 = i5 - 1;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(c4);
        sb4.append(i7);
        if (w3(sb4.toString())) {
            return false;
        }
        if (this.f11848k.getCells() == Cells.ALL) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(c5);
            sb5.append(i7);
            if (w3(sb5.toString())) {
                return false;
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append(c6);
            sb6.append(i7);
            if (w3(sb6.toString())) {
                return false;
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append(c5);
            sb7.append(i6);
            if (w3(sb7.toString())) {
                return false;
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append(c6);
            sb8.append(i6);
            if (w3(sb8.toString())) {
                return false;
            }
        } else if (this.f11848k.getCells() == Cells.HEXAGON) {
            int i8 = i4 < this.f11848k.getColumns() ? -1 : 1;
            int i9 = i4 < this.f11848k.getColumns() - 1 ? 1 : -1;
            StringBuilder sb9 = new StringBuilder();
            sb9.append(c6);
            sb9.append(i8 + i5);
            if (w3(sb9.toString())) {
                return false;
            }
            StringBuilder sb10 = new StringBuilder();
            sb10.append(c5);
            sb10.append(i5 + i9);
            if (w3(sb10.toString())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u Q1(a aVar) {
        e0.l(e0.f19058a, aVar.f11848k, null, 2, null);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u R1(a aVar, u uVar) {
        d dVar = (d) aVar.w0();
        if (dVar != null) {
            dVar.finish();
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence V0(String str) {
        m.e(str, "it");
        return str + ":E,";
    }

    private final void b2(ShashkiBoardView shashkiBoardView, String str) {
        j jVar = new j("((?:^|,)" + str + ")[$*]?:");
        String str2 = this.f11862y < 0 ? "$1:" : this.f11861x == d.a.f11886e ? "$1*:" : "$1\\$:";
        CheckersParams checkersParams = this.f11848k;
        checkersParams.setStartPosition(jVar.l(checkersParams.getStartPosition(), str2));
        shashkiBoardView.setPosition(c1());
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.p();
        }
    }

    private final String c1() {
        return new j(":[wbWB]+,").k(this.f11848k.getStartPosition(), ":E,");
    }

    private final void c2(final String str) {
        int i4 = b.f11869c[this.f11844g.ordinal()];
        if (i4 == 1) {
            this.f11851n.add(str);
            Z(new InterfaceC1005a() { // from class: M0.w0
                @Override // g3.InterfaceC1005a
                public final Object a() {
                    return cab.shashki.app.ui.universal.a.d2(this.f2740d);
                }
            });
        } else if (i4 != 2) {
            if (i4 == 3) {
                if (m.a(this.f11863z, "")) {
                    this.f11863z = str;
                    return;
                }
                this.f11850m.add(this.f11863z + "=" + str);
                this.f11863z = "";
                Z(new InterfaceC1005a() { // from class: M0.y0
                    @Override // g3.InterfaceC1005a
                    public final Object a() {
                        return cab.shashki.app.ui.universal.a.f2(this.f2749d);
                    }
                });
                return;
            }
            if (i4 != 4) {
                if (i4 != 5) {
                    throw new T2.j();
                }
                this.f11853p.remove(str);
                this.f11851n.remove(str);
                p.u(this.f11852o, new InterfaceC1016l() { // from class: M0.A0
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return Boolean.valueOf(cab.shashki.app.ui.universal.a.h2(str, (String) obj));
                    }
                });
                p.u(this.f11850m, new InterfaceC1016l() { // from class: M0.B0
                    @Override // g3.InterfaceC1016l
                    public final Object o(Object obj) {
                        return Boolean.valueOf(cab.shashki.app.ui.universal.a.i2(str, (String) obj));
                    }
                });
                if (this.f11853p.isEmpty()) {
                    this.f11848k.setSpinLimit(0);
                }
                Z(new InterfaceC1005a() { // from class: M0.s0
                    @Override // g3.InterfaceC1005a
                    public final Object a() {
                        return cab.shashki.app.ui.universal.a.j2(this.f2726d);
                    }
                });
            } else {
                if (m.a(this.f11863z, "") || !A1(this.f11863z, str)) {
                    this.f11863z = str;
                    return;
                }
                this.f11852o.add(this.f11863z + ":" + str);
                this.f11863z = "";
                Z(new InterfaceC1005a() { // from class: M0.z0
                    @Override // g3.InterfaceC1005a
                    public final Object a() {
                        return cab.shashki.app.ui.universal.a.g2(this.f2754d);
                    }
                });
            }
        } else {
            if (this.f11853p.size() >= 8 || !P0(str)) {
                return;
            }
            this.f11853p.add(str);
            CheckersParams checkersParams = this.f11848k;
            checkersParams.setSpinLimit(h.b(checkersParams.getSpinLimit(), 1));
            Z(new InterfaceC1005a() { // from class: M0.x0
                @Override // g3.InterfaceC1005a
                public final Object a() {
                    return cab.shashki.app.ui.universal.a.e2(this.f2744d);
                }
            });
        }
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.A();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u d2(a aVar) {
        d dVar = (d) aVar.w0();
        if (dVar != null) {
            dVar.j1(p.b0(aVar.f11851n));
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u e2(a aVar) {
        d dVar = (d) aVar.w0();
        if (dVar != null) {
            dVar.j1(p.b0(aVar.f11853p));
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u f2(a aVar) {
        d dVar = (d) aVar.w0();
        if (dVar != null) {
            dVar.j1(p.b0(aVar.f11850m));
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u g2(a aVar) {
        d dVar = (d) aVar.w0();
        if (dVar != null) {
            dVar.j1(p.b0(aVar.f11852o));
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h2(String str, String str2) {
        m.e(str2, "it");
        if (n.x(str2, str + ":", false, 2, null)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(":");
        sb.append(str);
        return n.n(str2, sb.toString(), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i2(String str, String str2) {
        m.e(str2, "it");
        if (n.x(str2, str + "=", false, 2, null)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("=");
        sb.append(str);
        return n.n(str2, sb.toString(), false, 2, null);
    }

    private final List j1() {
        Context contextR0 = r0();
        if (contextR0 == null) {
            return p.g();
        }
        ArrayList arrayList = new ArrayList();
        if (!this.f11851n.isEmpty()) {
            String string = contextR0.getString(AbstractC0888D.f14572y);
            m.d(string, "getString(...)");
            arrayList.add(string);
            arrayList.add(p.N(this.f11851n, " ", null, "\n", 0, null, null, 58, null));
        }
        if (!this.f11852o.isEmpty()) {
            String string2 = contextR0.getString(AbstractC0888D.f14345B);
            m.d(string2, "getString(...)");
            arrayList.add(string2);
            arrayList.add(p.N(this.f11852o, " ", null, "\n", 0, null, null, 58, null));
        }
        if (!this.f11850m.isEmpty()) {
            String string3 = contextR0.getString(AbstractC0888D.f14550t2);
            m.d(string3, "getString(...)");
            arrayList.add(string3);
            arrayList.add(p.N(this.f11850m, " ", null, "\n", 0, null, null, 58, null));
        }
        if (!this.f11853p.isEmpty()) {
            String string4 = contextR0.getString(AbstractC0888D.T4);
            m.d(string4, "getString(...)");
            arrayList.add(string4);
            arrayList.add(p.N(this.f11853p, " ", null, "\n", 0, null, null, 58, null));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u j2(a aVar) {
        d dVar = (d) aVar.w0();
        if (dVar != null) {
            dVar.j1(aVar.j1());
        }
        return u.f3817a;
    }

    private final void k2(ShashkiBoardView shashkiBoardView, String str) {
        if (this.f11848k.getCells().isDynamic()) {
            if (this.f11862y == 0) {
                return;
            }
            b2(shashkiBoardView, str);
        } else {
            if (this.f11862y <= 0 || w3(str)) {
                return;
            }
            l lVarP1 = p1();
            char cCharValue = ((Character) lVarP1.a()).charValue();
            ((Set) lVarP1.b()).add(str);
            shashkiBoardView.g1(str, J().a(cCharValue), false, String.valueOf(cCharValue));
            shashkiBoardView.V2();
        }
    }

    private final l p1() {
        int i4 = b.f11868b[this.f11861x.ordinal()];
        return i4 != 5 ? i4 != 6 ? i4 != 7 ? new l('y', this.f11857t) : new l('w', this.f11854q) : new l('x', this.f11856s) : new l('b', this.f11855r);
    }

    private final void p3() {
        int iC;
        int rows = (this.f11848k.getRows() * this.f11848k.getColumns()) / 2;
        if (!AbstractC0590i.q(this.f11838B, this.f11848k.getCells())) {
            rows /= 2;
        }
        CheckersParams checkersParams = this.f11848k;
        int i4 = 64;
        if (checkersParams.getCells().isHex()) {
            int columns = (((this.f11848k.getColumns() * 3) * this.f11848k.getColumns()) - (this.f11848k.getColumns() * 3)) + 1;
            iC = this.f11848k.getFourPlayers() ? h.c(columns / 3, 32) : h.c(columns >> 1, 64);
        } else {
            iC = (!this.f11848k.getFourPlayers() || this.f11848k.getMonochorome()) ? h.c(rows, 64) : h.c((rows + 1) >> 1, 32);
        }
        checkersParams.setMaxPieces(iC);
        if (this.f11848k.getLayeredPiece() || this.f11848k.getMonochorome()) {
            CheckersParams checkersParams2 = this.f11848k;
            int maxPieces = checkersParams2.getMaxPieces() << 1;
            if (this.f11848k.getFourPlayers() && !this.f11848k.getMonochorome()) {
                i4 = 32;
            }
            checkersParams2.setMaxPieces(h.c(maxPieces, i4));
        }
    }

    private final void q3(final ShashkiBoardView shashkiBoardView) {
        shashkiBoardView.T2(new InterfaceC1005a() { // from class: M0.v0
            @Override // g3.InterfaceC1005a
            public final Object a() {
                return cab.shashki.app.ui.universal.a.r3(this.f2736d, shashkiBoardView);
            }
        });
    }

    private final boolean r1(int i4) {
        Integer[] numArr = {17, 34, 68, 136};
        for (int i5 = 0; i5 < 4; i5++) {
            int iIntValue = numArr[i5].intValue();
            if ((i4 & iIntValue) == iIntValue) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u r3(a aVar, ShashkiBoardView shashkiBoardView) {
        CheckersParams checkersParams = aVar.f11848k;
        String strF = K.F(K.f2926a, !checkersParams.getReverseColor(), AbstractC0888D.x5, shashkiBoardView.getPieces(), aVar.J(), aVar.f11848k, null, null, 96, null);
        m.b(strF);
        checkersParams.setStartPosition(strF);
        return u.f3817a;
    }

    private final boolean w3(String str) {
        if (this.f11848k.getCells().isDynamic()) {
            return !this.f11849l.contains(str);
        }
        int iCharAt = str.charAt(0) - 'a';
        String strSubstring = str.substring(1);
        m.d(strSubstring, "substring(...)");
        int i4 = Integer.parseInt(strSubstring) - 1;
        if (!this.f11851n.contains(str) && iCharAt >= 0 && i4 >= 0) {
            if (this.f11848k.getCells().isHex()) {
                return iCharAt >= (this.f11848k.getColumns() << 1) - 1 || i4 >= ((this.f11848k.getColumns() << 1) - 1) - Math.abs((iCharAt - this.f11848k.getColumns()) + 1);
            }
            if (iCharAt < this.f11848k.getColumns() && i4 < this.f11848k.getRows()) {
                if (!AbstractC0590i.q(this.f11838B, this.f11848k.getCells())) {
                    if (((iCharAt & 1) == (i4 & 1)) != (this.f11848k.getCells() == Cells.BLACK)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final void A2(boolean z4) {
        this.f11848k.setFourPlayers(z4);
        this.f11848k.setReverseColor(false);
        this.f11848k.setDoubleMove(false);
        U0();
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.C();
        }
    }

    public final boolean B1() {
        return !this.f11848k.getMonochorome();
    }

    public final void B2(boolean z4) {
        this.f11848k.setGorgonCapture(z4);
        if (z4) {
            this.f11848k.setTowerCapture(false);
        }
    }

    public final boolean C1() {
        return (this.f11848k.getLayeredPiece() || this.f11848k.getMonochorome()) ? false : true;
    }

    public final void C2(int i4) {
        if (this.f11848k.getRows() == i4) {
            return;
        }
        this.f11848k.setRows(i4);
        if (!K0() && this.f11848k.getCylinder() == Cylinder.HORIZONTAL) {
            this.f11848k.setCylinder(Cylinder.NONE);
        }
        U0();
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.l0(this.f11848k.getCylinder());
        }
        d dVar2 = (d) w0();
        if (dVar2 != null) {
            dVar2.A();
        }
    }

    public final boolean D1() {
        return this.f11848k.getKingOnlyStandsNextCellAfterCapture();
    }

    public final void D2(boolean z4) {
        if (!z4 || Q0()) {
            this.f11848k.setIgnoreCapture(z4);
            return;
        }
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.F(9);
        }
    }

    public final boolean E1() {
        return this.f11848k.getKenKong();
    }

    public final void E2(boolean z4) {
        this.f11848k.setKingOnlyStandsNextCellAfterCapture(z4);
    }

    public final boolean F1() {
        return this.f11848k.getKiller();
    }

    public final void F2(boolean z4) {
        CheckersParams checkersParams = this.f11848k;
        checkersParams.setKenKong(z4 && checkersParams.getKen() > 0);
    }

    public final int G1() {
        return this.f11848k.getKingCaptureMask();
    }

    public final void G2(boolean z4) {
        this.f11848k.setKiller(z4);
    }

    public final boolean H1() {
        return this.f11848k.getFlyingKing() != this.f11848k.getKingCaptureFlyInversion();
    }

    public final void H2(int i4) {
        this.f11848k.setKingCaptureMask(i4);
    }

    public final boolean I1() {
        return this.f11848k.getKingCaptureInsteadPawn();
    }

    public final void I2(boolean z4) {
        CheckersParams checkersParams = this.f11848k;
        checkersParams.setKingCaptureFlyInversion(z4 != checkersParams.getFlyingKing());
    }

    public final int J1() {
        return this.f11848k.getKingMoveMask();
    }

    public final void J2(boolean z4) {
        this.f11848k.setKingCaptureInsteadPawn(z4);
        if (z4) {
            if (this.f11848k.getCaptureSelf() == CaptureSelf.CAN) {
                this.f11848k.setCaptureSelf(CaptureSelf.MUST);
            }
            this.f11848k.setIgnoreCapture(false);
        }
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.F(9);
        }
    }

    public final boolean K0() {
        return this.f11848k.getCells() == Cells.ALL || !(this.f11848k.getCells().isHex() || this.f11848k.getCells().isDynamic() || (this.f11848k.getRows() & 1) != 0);
    }

    public final float K1() {
        return this.f11848k.getKingWeightInCapture();
    }

    public final void K2(int i4) {
        this.f11848k.setKingMoveMask(i4);
    }

    public final boolean L0() {
        return this.f11848k.getCells() == Cells.ALL || !(this.f11848k.getCells().isHex() || this.f11848k.getCells().isDynamic() || (this.f11848k.getColumns() & 1) != 0);
    }

    public final boolean L1() {
        return this.f11848k.getLayeredPiece();
    }

    public final void L2(float f4) {
        this.f11848k.setKingWeightInCapture(f4);
    }

    public void M0(d dVar) {
        m.e(dVar, "view");
        super.q0(dVar);
        d dVar2 = (d) w0();
        if (dVar2 != null) {
            dVar2.m(a2());
        }
        d dVar3 = (d) w0();
        if (dVar3 != null) {
            dVar3.r(this.f11859v);
        }
        d dVar4 = (d) w0();
        if (dVar4 != null) {
            dVar4.k(this.f11859v < this.f11858u);
        }
    }

    public final boolean M1() {
        return this.f11848k.getLosing();
    }

    public final void M2(boolean z4) {
        this.f11848k.setLayeredPiece(z4);
        if (z4) {
            this.f11848k.setTowerCapture(false);
        } else {
            CheckersParams checkersParams = this.f11848k;
            checkersParams.setStartPosition(new j("\\w*(\\w,)").k(checkersParams.getStartPosition(), "$1"));
            d dVar = (d) w0();
            if (dVar != null) {
                dVar.p();
            }
        }
        p3();
    }

    public final boolean N0() {
        return e1() || T0().isDynamic();
    }

    public final boolean N1() {
        return this.f11848k.getCaptureMax();
    }

    public final boolean O0() {
        return this.f11848k.getBreakthrough();
    }

    public final String O1() {
        return this.f11848k.getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0161 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P1() {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.ui.universal.a.P1():void");
    }

    public final void P2(d.b bVar) {
        m.e(bVar, "mode");
        this.f11844g = bVar;
        this.f11863z = "";
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.M0(bVar);
        }
        d dVar2 = (d) w0();
        if (dVar2 != null) {
            dVar2.j1(h1());
        }
    }

    public final boolean Q0() {
        return (this.f11848k.getCaptureMax() || this.f11848k.getKingCaptureInsteadPawn() || this.f11848k.getLosing() || this.f11848k.getCaptureSelf() == CaptureSelf.MUST) ? false : true;
    }

    public final void Q2(boolean z4) {
        this.f11848k.setLosing(z4);
        if (z4) {
            this.f11848k.setIgnoreCapture(false);
        }
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.F(9);
        }
    }

    public final boolean R0() {
        CheckersParams checkersParams = this.f11848k;
        if (!checkersParams.getTurkCapture()) {
            return false;
        }
        if (checkersParams.getTowerCapture() && (r1(checkersParams.getKingCaptureMask()) || r1(checkersParams.getPawnCaptureMask()))) {
            return true;
        }
        return checkersParams.getFlyingKing() != checkersParams.getKingCaptureFlyInversion() && r1(checkersParams.getKingCaptureMask());
    }

    public final void R2(boolean z4) {
        this.f11848k.setCaptureMax(z4);
        if (z4) {
            if (this.f11848k.getCaptureSelf() == CaptureSelf.CAN) {
                this.f11848k.setCaptureSelf(CaptureSelf.MUST);
            }
            this.f11848k.setIgnoreCapture(false);
        }
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.F(9);
        }
    }

    public final CaptureSelf S0() {
        CaptureSelf captureSelf = this.f11848k.getCaptureSelf();
        return captureSelf == null ? CaptureSelf.NO : captureSelf;
    }

    public final boolean S1() {
        return this.f11848k.getMonochorome();
    }

    public final void S2(d.a aVar) {
        m.e(aVar, "mode");
        this.f11843f = aVar;
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.l1(aVar);
        }
    }

    public final Cells T0() {
        return this.f11848k.getCells();
    }

    public final boolean T1() {
        return this.f11848k.getCaptureMax() || this.f11848k.getKingCaptureInsteadPawn();
    }

    public final void T2(boolean z4) {
        this.f11848k.setMonochorome(z4);
        this.f11848k.setIgnoreCapture(z4);
        if (!z4) {
            U0();
            return;
        }
        this.f11848k.setCaptureSelf(CaptureSelf.CAN);
        this.f11848k.setKingCaptureInsteadPawn(false);
        this.f11848k.setReverseColor(false);
        this.f11848k.setBreakthrough(false);
        this.f11848k.setTowerCapture(false);
        this.f11848k.setDraw3Repeat(false);
        this.f11848k.setCaptureMax(false);
        this.f11848k.setStavropol(false);
        this.f11848k.setLosing(false);
        this.f11848k.setWolfRule(0);
        CheckersParams checkersParams = this.f11848k;
        checkersParams.setStartPosition(new j("\\w+,").k(checkersParams.getStartPosition(), "w,"));
        p3();
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.p();
        }
    }

    public final void U0() {
        p3();
        this.f11849l.clear();
        CheckersParams checkersParams = this.f11848k;
        checkersParams.setStartPosition(checkersParams.getReverseColor() ? "b" : "w");
        if (this.f11848k.getCells().isDynamic()) {
            List listG = this.f11848k.getCells() == Cells.DYNAMIC_HEX ? C0574l.f2981a.g(this.f11848k.getColumns()) : C0574l.f2981a.f(this.f11848k.getColumns(), this.f11848k.getRows());
            this.f11849l.addAll(listG);
            CheckersParams checkersParams2 = this.f11848k;
            checkersParams2.setStartPosition(p.N(listG, "", null, checkersParams2.getStartPosition(), 0, null, new InterfaceC1016l() { // from class: M0.u0
                @Override // g3.InterfaceC1016l
                public final Object o(Object obj) {
                    return cab.shashki.app.ui.universal.a.V0((String) obj);
                }
            }, 26, null));
        }
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.p();
        }
    }

    public final boolean U1() {
        return this.f11848k.getPawnCanCaptureKing();
    }

    public final void U2(String str) {
        m.e(str, HalmaParams.NAME);
        this.f11848k.setName(str);
    }

    public final int V1() {
        return this.f11848k.getPawnCaptureMask();
    }

    public final void V2(int i4) {
        this.f11862y = i4;
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.w0(this.f11861x);
        }
    }

    public final boolean W0() {
        return this.f11841d >= 0;
    }

    public final boolean W1() {
        return this.f11848k.getPawnPromotionInCapture();
    }

    public final void W2(boolean z4) {
        this.f11848k.setPawnCanCaptureKing(z4);
    }

    public final Cylinder X0() {
        return this.f11848k.getCylinder();
    }

    public final int X1() {
        return this.f11848k.getKen();
    }

    public final void X2(int i4) {
        this.f11848k.setPawnCaptureMask(i4);
    }

    public final boolean Y0() {
        return this.f11848k.getKingDemotionInsteadOfCapture();
    }

    public final int Y1() {
        return this.f11848k.getManMoveMask();
    }

    public final void Y2(boolean z4) {
        this.f11848k.setPawnPromotionInCapture(z4);
    }

    public final boolean Z0() {
        return this.f11848k.getDoubleMove();
    }

    @Override // cab.shashki.app.ui.custom.board.W
    /* renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public I J() {
        return C1218E.f18139a.s();
    }

    public final void Z2(int i4) {
        if (i4 < 0 || i4 >= 16) {
            return;
        }
        this.f11848k.setKen(i4);
    }

    public final boolean a1() {
        return this.f11848k.getDraw3Repeat();
    }

    public final boolean a2() {
        return this.f11841d >= 0 && this.f11842e;
    }

    public final void a3(int i4) {
        this.f11848k.setManMoveMask(i4);
    }

    public final int b1() {
        return this.f11848k.getDrawMoves() / 2;
    }

    public final void b3(boolean z4) {
        this.f11848k.setReverseCapture(z4);
    }

    public final void c3(int i4) {
        if (i4 < 0 || i4 >= 8) {
            return;
        }
        this.f11848k.setSpinLimit(i4);
    }

    public final boolean d1() {
        return this.f11848k.getFlyingKing();
    }

    public final void d3(boolean z4) {
        this.f11848k.setStavropol(z4);
    }

    public final boolean e1() {
        return this.f11848k.getFourPlayers();
    }

    public final void e3(int i4) {
        this.f11859v = i4;
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.k(this.f11859v < this.f11858u);
        }
    }

    public final List f1() {
        return p.b0(this.f11852o);
    }

    public final void f3(boolean z4) {
        this.f11848k.setTowerCapture(z4);
        if (z4) {
            this.f11848k.setGorgonCapture(false);
            this.f11848k.setLayeredPiece(false);
        }
    }

    public final String g1() {
        return this.f11837A;
    }

    public final void g3(boolean z4) {
        this.f11848k.setTurkCapture(z4);
    }

    @Override // cab.shashki.app.ui.custom.board.W
    public void h(ShashkiBoardView shashkiBoardView, String str) {
        ShashkiBoardView shashkiBoardView2;
        m.e(shashkiBoardView, "board");
        m.e(str, "pos");
        int i4 = this.f11859v;
        if (i4 == 1) {
            if (T0().isDynamic()) {
                return;
            }
            c2(str);
            return;
        }
        if (i4 == 3) {
            k2(shashkiBoardView, str);
            return;
        }
        boolean zO2 = false;
        switch (b.f11868b[this.f11843f.ordinal()]) {
            case 1:
                shashkiBoardView2 = shashkiBoardView;
                String strSubstring = str.substring(1);
                m.d(strSubstring, "substring(...)");
                zO2 = O2(this, shashkiBoardView2, Integer.parseInt(strSubstring), 0, null, 8, null);
                break;
            case 2:
                shashkiBoardView2 = shashkiBoardView;
                zO2 = O2(this, shashkiBoardView2, str.charAt(0), 1, null, 8, null);
                break;
            case 3:
                shashkiBoardView2 = shashkiBoardView;
                String strSubstring2 = str.substring(1);
                m.d(strSubstring2, "substring(...)");
                zO2 = O2(this, shashkiBoardView2, Integer.parseInt(strSubstring2), 2, null, 8, null);
                break;
            case 4:
                shashkiBoardView2 = shashkiBoardView;
                zO2 = O2(this, shashkiBoardView2, str.charAt(0), 3, null, 8, null);
                break;
            case 5:
                shashkiBoardView2 = shashkiBoardView;
                zO2 = J0(this, shashkiBoardView2, str, 0, null, 8, null);
                break;
            case 6:
                shashkiBoardView2 = shashkiBoardView;
                zO2 = J0(this, shashkiBoardView2, str, 1, null, 8, null);
                break;
            case 7:
                shashkiBoardView2 = shashkiBoardView;
                zO2 = J0(this, shashkiBoardView2, str, 2, null, 8, null);
                break;
            case 8:
                shashkiBoardView2 = shashkiBoardView;
                zO2 = J0(this, shashkiBoardView2, str, 3, null, 8, null);
                break;
            default:
                shashkiBoardView2 = shashkiBoardView;
                break;
        }
        if (zO2) {
            q3(shashkiBoardView2);
            shashkiBoardView2.V2();
        }
    }

    public final List h1() {
        int i4 = b.f11869c[this.f11844g.ordinal()];
        if (i4 == 1) {
            return p.b0(this.f11851n);
        }
        if (i4 == 2) {
            return p.b0(this.f11853p);
        }
        if (i4 == 3) {
            return p.b0(this.f11850m);
        }
        if (i4 == 4) {
            return p.b0(this.f11852o);
        }
        if (i4 == 5) {
            return j1();
        }
        throw new T2.j();
    }

    public final void h3(boolean z4) {
        this.f11848k.setReverseColor(!z4);
        CheckersParams checkersParams = this.f11848k;
        checkersParams.setStartPosition(new j(".$").k(checkersParams.getStartPosition(), z4 ? "w" : "b"));
    }

    public final d.b i1() {
        return this.f11844g;
    }

    public final void i3(int i4) {
        if (this.f11848k.getColumns() == i4) {
            return;
        }
        CheckersParams checkersParams = this.f11848k;
        int i5 = b.f11867a[checkersParams.getCells().ordinal()];
        checkersParams.setColumns(h.c(i4, i5 != 1 ? i5 != 2 ? 16 : 6 : 8));
        if (!L0() && this.f11848k.getCylinder() == Cylinder.VERTICAL) {
            this.f11848k.setCylinder(Cylinder.NONE);
        }
        U0();
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.l0(this.f11848k.getCylinder());
        }
        d dVar2 = (d) w0();
        if (dVar2 != null) {
            dVar2.A();
        }
    }

    @Override // cab.shashki.app.ui.custom.board.W
    public boolean j(ShashkiBoardView shashkiBoardView, String str, String str2) {
        m.e(shashkiBoardView, "board");
        m.e(str, "from");
        m.e(str2, "to");
        return false;
    }

    public final void j3(int i4) {
        this.f11848k.setWolfRule(i4);
    }

    public final List k1() {
        return p.b0(this.f11851n);
    }

    public final String k3() {
        return this.f11848k.getStartPosition();
    }

    public final C0843z.c l1() {
        return C0843z.f11502a.h0(this.f11848k);
    }

    public final boolean l2() {
        return this.f11848k.getReverseCapture();
    }

    public final boolean l3() {
        return this.f11848k.getStavropol();
    }

    public final d.a m1() {
        return this.f11843f;
    }

    public final void m2(int i4) {
        if (i4 != this.f11847j) {
            CheckersParams checkersParamsC = ((C0155a) this.f11845h.get(i4)).c();
            CheckersParams checkersParamsCopy = checkersParamsC.copy(((-3) & 1) != 0 ? checkersParamsC.name : this.f11848k.getName(), ((-3) & 2) != 0 ? checkersParamsC.id : this.f11848k.getId(), ((-3) & 4) != 0 ? checkersParamsC.rows : 0, ((-3) & 8) != 0 ? checkersParamsC.columns : 0, ((-3) & 16) != 0 ? checkersParamsC.maxPieces : 0, ((-3) & 32) != 0 ? checkersParamsC.cells : null, ((-3) & 64) != 0 ? checkersParamsC.startPosition : null, ((-3) & 128) != 0 ? checkersParamsC.reverseColor : false, ((-3) & 256) != 0 ? checkersParamsC.monochorome : false, ((-3) & 512) != 0 ? checkersParamsC.fourPlayers : false, ((-3) & 1024) != 0 ? checkersParamsC.draw3Repeat : false, ((-3) & 2048) != 0 ? checkersParamsC.layeredPiece : false, ((-3) & 4096) != 0 ? checkersParamsC.drawMoves : 0, ((-3) & 8192) != 0 ? checkersParamsC.wolfRule : 0, ((-3) & 16384) != 0 ? checkersParamsC.manMoveMask : 0, ((-3) & 32768) != 0 ? checkersParamsC.kingMoveMask : 0, ((-3) & 65536) != 0 ? checkersParamsC.pawnCaptureMask : 0, ((-3) & 131072) != 0 ? checkersParamsC.kingCaptureMask : 0, ((-3) & 262144) != 0 ? checkersParamsC.blocked : null, ((-3) & 524288) != 0 ? checkersParamsC.portals : null, ((-3) & 1048576) != 0 ? checkersParamsC.promWhite : null, ((-3) & 2097152) != 0 ? checkersParamsC.promBlack : null, ((-3) & 4194304) != 0 ? checkersParamsC.promX : null, ((-3) & 8388608) != 0 ? checkersParamsC.promY : null, ((-3) & 16777216) != 0 ? checkersParamsC.breaks : null, ((-3) & 33554432) != 0 ? checkersParamsC.spins : null, ((-3) & 67108864) != 0 ? checkersParamsC.flyingKing : false, ((-3) & 134217728) != 0 ? checkersParamsC.captureMax : false, ((-3) & 268435456) != 0 ? checkersParamsC.turkCapture : false, ((-3) & 536870912) != 0 ? checkersParamsC.towerCapture : false, ((-3) & 1073741824) != 0 ? checkersParamsC.gorgonCapture : false, ((-3) & Integer.MIN_VALUE) != 0 ? checkersParamsC.reverseCapture : false, (65535 & 1) != 0 ? checkersParamsC.pawnCanCaptureKing : false, (65535 & 2) != 0 ? checkersParamsC.pawnPromotionInCapture : false, (65535 & 4) != 0 ? checkersParamsC.kingDemotionInsteadOfCapture : false, (65535 & 8) != 0 ? checkersParamsC.kingOnlyStandsNextCellAfterCapture : false, (65535 & 16) != 0 ? checkersParamsC.kingCaptureFlyInversion : false, (65535 & 32) != 0 ? checkersParamsC.kingCaptureInsteadPawn : false, (65535 & 64) != 0 ? checkersParamsC.killer : false, (65535 & 128) != 0 ? checkersParamsC.spinLimit : 0, (65535 & 256) != 0 ? checkersParamsC.ken : 0, (65535 & 512) != 0 ? checkersParamsC.kenKong : false, (65535 & 1024) != 0 ? checkersParamsC.kingWeightInCapture : 0.0f, (65535 & 2048) != 0 ? checkersParamsC.stavropol : false, (65535 & 4096) != 0 ? checkersParamsC.breakthrough : false, (65535 & 8192) != 0 ? checkersParamsC.ignoreCapture : false, (65535 & 16384) != 0 ? checkersParamsC.doubleMove : false, (65535 & 32768) != 0 ? checkersParamsC.losing : false);
            this.f11848k = checkersParamsCopy;
            checkersParamsCopy.setCaptureSelf(checkersParamsC.getCaptureSelf());
            this.f11848k.setCylinder(checkersParamsC.getCylinder());
            this.f11847j = i4;
            this.f11860w = this.f11848k.getPromWhite() == null && this.f11848k.getPromBlack() == null && this.f11848k.getPromX() == null && this.f11848k.getPromY() == null;
            this.f11854q.clear();
            this.f11855r.clear();
            this.f11856s.clear();
            this.f11857t.clear();
            this.f11853p.clear();
            this.f11851n.clear();
            this.f11852o.clear();
            this.f11850m.clear();
            Set<String> promWhite = this.f11848k.getPromWhite();
            if (promWhite != null) {
                this.f11854q.addAll(promWhite);
            }
            Set<String> promBlack = this.f11848k.getPromBlack();
            if (promBlack != null) {
                this.f11855r.addAll(promBlack);
            }
            Set<String> promX = this.f11848k.getPromX();
            if (promX != null) {
                this.f11856s.addAll(promX);
            }
            Set<String> promY = this.f11848k.getPromY();
            if (promY != null) {
                this.f11857t.addAll(promY);
            }
            Set<String> spins = this.f11848k.getSpins();
            if (spins != null) {
                this.f11853p.addAll(spins);
            }
            Set<String> breaks = this.f11848k.getBreaks();
            if (breaks != null) {
                this.f11852o.addAll(breaks);
            }
            Set<String> blocked = this.f11848k.getBlocked();
            if (blocked != null) {
                this.f11851n.addAll(blocked);
            }
            Set<String> portals = this.f11848k.getPortals();
            if (portals != null) {
                this.f11850m.addAll(portals);
            }
            d dVar = (d) w0();
            if (dVar != null) {
                dVar.U0();
            }
        }
    }

    public final List m3() {
        return this.f11846i;
    }

    public final int n1() {
        return this.f11848k.getSpinLimit();
    }

    public final void n2(d.a aVar) {
        m.e(aVar, "mode");
        this.f11861x = aVar;
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.w0(aVar);
        }
    }

    public final boolean n3() {
        return this.f11848k.getTowerCapture();
    }

    public final List o1() {
        return p.b0(this.f11853p);
    }

    public final int o2() {
        return this.f11847j;
    }

    public final boolean o3() {
        return this.f11848k.getTurkCapture();
    }

    public final d.a p2() {
        return this.f11861x;
    }

    public final boolean q1() {
        return this.f11848k.getGorgonCapture();
    }

    public final void q2(boolean z4) {
        this.f11848k.setBreakthrough(z4);
    }

    public final void r2(CaptureSelf captureSelf) {
        m.e(captureSelf, "mode");
        if (captureSelf != CaptureSelf.CAN || !T1()) {
            this.f11848k.setCaptureSelf(captureSelf);
        }
        if (captureSelf == CaptureSelf.MUST) {
            this.f11848k.setIgnoreCapture(false);
        }
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.F(9);
        }
    }

    public final int s1() {
        return this.f11848k.getRows();
    }

    public final void s2(Cells cells) {
        m.e(cells, "c");
        if (this.f11848k.getCells() == cells) {
            return;
        }
        this.f11848k.setCells(cells);
        U0();
        if ((!K0() && this.f11848k.getCylinder() == Cylinder.HORIZONTAL) || (!L0() && this.f11848k.getCylinder() == Cylinder.VERTICAL)) {
            this.f11848k.setCylinder(Cylinder.NONE);
        }
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.l0(this.f11848k.getCylinder());
        }
        CheckersParams checkersParams = this.f11848k;
        int columns = checkersParams.getColumns();
        int i4 = b.f11867a[cells.ordinal()];
        checkersParams.setColumns(h.c(columns, i4 != 1 ? i4 != 2 ? 16 : 6 : 8));
        if (cells.isDynamic()) {
            this.f11848k.setFourPlayers(false);
            this.f11848k.setDoubleMove(true);
            this.f11860w = true;
            this.f11850m.clear();
            this.f11851n.clear();
            this.f11852o.clear();
            this.f11853p.clear();
            this.f11854q.clear();
            this.f11855r.clear();
            P2(d.b.f11896d);
        }
        d dVar2 = (d) w0();
        if (dVar2 != null) {
            dVar2.A();
        }
        d dVar3 = (d) w0();
        if (dVar3 != null) {
            dVar3.C();
        }
    }

    public final boolean s3() {
        return !this.f11848k.getReverseColor();
    }

    public final boolean t1() {
        return this.f11848k.getIgnoreCapture();
    }

    public final void t2(Cylinder cylinder) {
        m.e(cylinder, "cylinder");
        if (cylinder != Cylinder.HORIZONTAL || K0()) {
            if (cylinder != Cylinder.VERTICAL || L0()) {
                this.f11848k.setCylinder(cylinder);
                d dVar = (d) w0();
                if (dVar != null) {
                    dVar.l0(cylinder);
                }
            }
        }
    }

    public final int t3() {
        return this.f11848k.getColumns();
    }

    public final boolean u1() {
        return !this.f11848k.getMonochorome();
    }

    public final void u2(boolean z4) {
        this.f11860w = z4;
    }

    public final int u3() {
        return this.f11848k.getWolfRule();
    }

    public final boolean v1() {
        return !this.f11848k.getMonochorome();
    }

    public final void v2(boolean z4) {
        this.f11848k.setKingDemotionInsteadOfCapture(z4);
    }

    public final boolean v3() {
        return !this.f11848k.getMonochorome();
    }

    @Override // cab.shashki.app.ui.custom.board.W
    public void w(ShashkiBoardView shashkiBoardView, C0843z.i iVar) {
        m.e(shashkiBoardView, "board");
        m.e(iVar, "piece");
        String position = iVar.getPosition();
        if (this.f11859v == 3) {
            if (this.f11862y < 0) {
                ((Set) p1().d()).remove(position);
                shashkiBoardView.z1(position);
                return;
            }
            return;
        }
        switch (b.f11868b[this.f11843f.ordinal()]) {
            case 1:
                String strSubstring = position.substring(1);
                m.d(strSubstring, "substring(...)");
                N2(shashkiBoardView, Integer.parseInt(strSubstring), 0, iVar);
                break;
            case 2:
                N2(shashkiBoardView, position.charAt(0), 1, iVar);
                break;
            case 3:
                String strSubstring2 = position.substring(1);
                m.d(strSubstring2, "substring(...)");
                N2(shashkiBoardView, Integer.parseInt(strSubstring2), 2, iVar);
                break;
            case 4:
                N2(shashkiBoardView, position.charAt(0), 3, iVar);
                break;
            case 5:
                I0(shashkiBoardView, position, 0, iVar);
                break;
            case 6:
                I0(shashkiBoardView, position, 1, iVar);
                break;
            case 7:
                I0(shashkiBoardView, position, 2, iVar);
                break;
            case 8:
                I0(shashkiBoardView, position, 3, iVar);
                break;
            case 9:
                shashkiBoardView.z1(position);
                break;
            default:
                return;
        }
        q3(shashkiBoardView);
    }

    public final boolean w1() {
        return !this.f11848k.getMonochorome();
    }

    public final void w2(boolean z4) {
        CheckersParams checkersParams = this.f11848k;
        checkersParams.setDoubleMove(z4 && !checkersParams.getFourPlayers());
    }

    public final boolean x1() {
        return this.f11860w;
    }

    public final void x2(boolean z4) {
        this.f11848k.setDraw3Repeat(z4);
    }

    public final int x3() {
        return this.f11862y;
    }

    public final boolean y1() {
        return !this.f11848k.getMonochorome();
    }

    public final void y2(int i4) {
        this.f11848k.setDrawMoves(i4 * 2);
    }

    public final String y3() {
        if (this.f11848k.getCells().isDynamic()) {
            return c1();
        }
        StringBuilder sb = new StringBuilder();
        if (this.f11862y == 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = this.f11856s.iterator();
            while (it.hasNext()) {
                linkedHashMap.put((String) it.next(), "x");
            }
            Iterator it2 = this.f11857t.iterator();
            while (true) {
                String str = "";
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                String str3 = (String) linkedHashMap.get(str2);
                if (str3 != null) {
                    str = str3;
                }
                linkedHashMap.put(str2, "y" + str);
            }
            for (String str4 : this.f11855r) {
                String str5 = (String) linkedHashMap.get(str4);
                if (str5 == null) {
                    str5 = "";
                }
                linkedHashMap.put(str4, "b" + str5);
            }
            for (String str6 : this.f11854q) {
                String str7 = (String) linkedHashMap.get(str6);
                if (str7 == null) {
                    str7 = "";
                }
                linkedHashMap.put(str6, "w" + str7);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                sb.append((String) entry.getKey());
                sb.append(':');
                sb.append((String) entry.getValue());
                sb.append(',');
            }
        } else {
            l lVarP1 = p1();
            char cCharValue = ((Character) lVarP1.a()).charValue();
            Iterator it3 = ((Set) lVarP1.b()).iterator();
            while (it3.hasNext()) {
                sb.append((String) it3.next());
                sb.append(":");
                sb.append(cCharValue);
                sb.append(',');
            }
        }
        sb.append('w');
        String string = sb.toString();
        m.d(string, "toString(...)");
        return string;
    }

    public final boolean z1() {
        return this.f11848k.getMonochorome();
    }

    public final void z2(boolean z4) {
        this.f11848k.setFlyingKing(z4);
        d dVar = (d) w0();
        if (dVar != null) {
            dVar.F(7);
        }
    }
}