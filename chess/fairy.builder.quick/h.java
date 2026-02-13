package cab.shashki.app.ui.chess.fairy.builder.quick;

import U2.AbstractC0596o;
import U2.E;
import U2.p;
import a3.AbstractC0614b;
import a3.InterfaceC0613a;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.ui.chess.fairy.builder.quick.h;
import h3.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p3.n;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f11114a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static final List f11115b = p.j(new d("pawn", "fmWfceF", 'p'), new d("king", "K", 'k'), new d("knight", "N", 'n'), new d("bishop", "B", 'b'), new d("rook", "R", 'r'), new d("queen", "Q", 'q'), new d("fers", "F", 'f'), new d("alfil", "A", 'a'), new d("fersAlfil", "FA", 'e'), new d("silver", "FfW", 's'), new d("aiwok", "RNF", 'a'), new d("bers", "RF", 'd'), new d("archbishop", "BN", 'a'), new d("chancellor", "RN", 'm'), new d("amazon", "QN", 'j'), new d("knibis", "mNcB", 'i'), new d("biskni", "mBcN", 'j'), new d("kniroo", "mNcR", 'l'), new d("rookni", "mRcN", 'o'), new d("shogiPawn", "fW", 'p'), new d("lance", "fR", 'l'), new d("shogiKnight", "fN", 'n'), new d("gold", "WfF", 'g'), new d("dragonHorse", "BW", 'h'), new d("clobber", "cW", 'c'), new d("breakthrough", "fmWfF", 'p'), new d("immobile", "", 'i'), new d("cannon", "mRcpR", 'c'), new d("janggiCannon", "pR", 'c'), new d("soldier", "fsW", 'p'), new d("horse", "nN", 'u'), new d("elephant", "nA", 'e'), new d("janggiElephant", "nZ", 'e'), new d("banner", "RcpRnN", 'b'), new d("wazir", "W", 'w'), new d("commoner", "K", 'c'), new d("centaur", "KN", 'h'));

    /* renamed from: c, reason: collision with root package name */
    private static final String f11116c = "customPiece";

    public interface a {
        void b(c cVar);
    }

    public interface b {
        boolean a(Iterable iterable, Iterable iterable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f11126a;

        /* renamed from: b, reason: collision with root package name */
        private final String f11127b;

        /* renamed from: c, reason: collision with root package name */
        private final char f11128c;

        public d(String str, String str2, char c4) {
            m.e(str, HalmaParams.NAME);
            m.e(str2, "betza");
            this.f11126a = str;
            this.f11127b = str2;
            this.f11128c = c4;
        }

        public final String a() {
            return this.f11127b;
        }

        public final char b() {
            return this.f11128c;
        }

        public final String c() {
            return this.f11126a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f11129d = new e("Range", 0);

        /* renamed from: e, reason: collision with root package name */
        public static final e f11130e = new e("Boolean", 1);

        /* renamed from: f, reason: collision with root package name */
        public static final e f11131f = new e("Piece", 2);

        /* renamed from: g, reason: collision with root package name */
        public static final e f11132g = new e("PieceType", 3);

        /* renamed from: h, reason: collision with root package name */
        public static final e f11133h = new e("PieceSet", 4);

        /* renamed from: i, reason: collision with root package name */
        public static final e f11134i = new e("BitBoard", 5);

        /* renamed from: j, reason: collision with root package name */
        public static final e f11135j = new e("Enum", 6);

        /* renamed from: k, reason: collision with root package name */
        public static final e f11136k = new e("Text", 7);

        /* renamed from: l, reason: collision with root package name */
        public static final e f11137l = new e("Int", 8);

        /* renamed from: m, reason: collision with root package name */
        public static final e f11138m = new e("Fen", 9);

        /* renamed from: n, reason: collision with root package name */
        public static final e f11139n = new e("Name", 10);

        /* renamed from: o, reason: collision with root package name */
        private static final /* synthetic */ e[] f11140o;

        /* renamed from: p, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC0613a f11141p;

        static {
            e[] eVarArrA = a();
            f11140o = eVarArrA;
            f11141p = AbstractC0614b.a(eVarArrA);
        }

        private e(String str, int i4) {
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f11129d, f11130e, f11131f, f11132g, f11133h, f11134i, f11135j, f11136k, f11137l, f11138m, f11139n};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f11140o.clone();
        }
    }

    private h() {
    }

    private final boolean f(String str) {
        String str2 = f11116c;
        int length = str2.length() + 1;
        int length2 = str2.length() + 2;
        int length3 = str.length();
        return length <= length3 && length3 <= length2 && n.x(str, str2, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(String str, Iterable iterable, Iterable iterable2) {
        Object next;
        m.e(iterable, "active");
        m.e(iterable2, "<unused var>");
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (m.a(((c) next).f(), str)) {
                break;
            }
        }
        return next != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(Iterable iterable, Iterable iterable2) {
        m.e(iterable, "<unused var>");
        m.e(iterable2, "<unused var>");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(Iterable iterable, Iterable iterable2) {
        m.e(iterable, "<unused var>");
        m.e(iterable2, "<unused var>");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(Iterable iterable, Iterable iterable2) {
        Object next;
        m.e(iterable, "<unused var>");
        m.e(iterable2, "prompts");
        Iterator it = iterable2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (f11114a.f(((c) next).f())) {
                break;
            }
        }
        return next == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(d dVar, Iterable iterable, Iterable iterable2) {
        Object next;
        m.e(iterable, "active");
        m.e(iterable2, "<unused var>");
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (m.a(((c) next).f(), dVar.c())) {
                break;
            }
        }
        return next != null;
    }

    public final List g() {
        String string;
        int i4;
        String[] strArr;
        int i5 = 2;
        int i6 = 0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(HalmaParams.NAME, e.f11139n, null, "my_chess", "variant name", null, null, 96, null));
        e eVar = e.f11129d;
        arrayList.add(new c("maxRank", eVar, new m3.g(1, 10), "8", "maximum rank 1-10", null, null, 96, null));
        arrayList.add(new c("maxFile", eVar, new m3.g(1, 12), "8", "maximum file 1-12 or a-l", 0 == true ? 1 : 0, null, 96, null));
        for (d dVar : f11115b) {
            arrayList.add(new c(dVar.c(), e.f11131f, null, String.valueOf(dVar.b()), "piece letter[:betza] (default " + dVar.b() + ":" + dVar.a() + ")", null, null, 96, null));
        }
        int i7 = 0;
        while (i7 < 25) {
            i7++;
            arrayList.add(new c(f11116c + i7, e.f11131f, null, "c", "piece letter[:betza]", null, new b() { // from class: z0.j0
                @Override // cab.shashki.app.ui.chess.fairy.builder.quick.h.b
                public final boolean a(Iterable iterable, Iterable iterable2) {
                    return cab.shashki.app.ui.chess.fairy.builder.quick.h.k(iterable, iterable2);
                }
            }, 32, null));
        }
        arrayList.add(new c("pieceValueMg", "piece values in middle of the game (like p:150 n:800)"));
        arrayList.add(new c("pieceValueEg", "piece values in end of the game (like p:200 n:900)"));
        c.a aVar = c.f11117i;
        arrayList.add(c.a.f(aVar, "chess960", "allow chess960 castling", false, 4, null));
        arrayList.add(c.a.f(aVar, "twoBoards", "pocket pieces are added from an external source, usually from a second board (e.g., bughouse)", false, 4, null));
        arrayList.add(new c("startFen", e.f11138m, null, "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1", "FEN of starting position", null, null, 96, null));
        String[] strArr2 = {"White", "Black"};
        for (final d dVar2 : f11115b) {
            int i8 = 0;
            while (i8 < i5) {
                String str = strArr2[i8];
                c.a aVar2 = c.f11117i;
                String strC = dVar2.c();
                if (strC.length() > 0) {
                    i4 = i8;
                    StringBuilder sb = new StringBuilder();
                    String strValueOf = String.valueOf(strC.charAt(i6));
                    m.c(strValueOf, "null cannot be cast to non-null type java.lang.String");
                    strArr = strArr2;
                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    m.d(upperCase, "toUpperCase(...)");
                    sb.append((Object) upperCase);
                    String strSubstring = strC.substring(1);
                    m.d(strSubstring, "substring(...)");
                    sb.append(strSubstring);
                    strC = sb.toString();
                } else {
                    i4 = i8;
                    strArr = strArr2;
                }
                arrayList.add(aVar2.b("mobilityRegion" + str + strC, "the mobility area, list of squares (e.g., d4 e4 a*)", "*1 *2 *3 *4 *5 *6 *7 *8 *9 *10", new b() { // from class: cab.shashki.app.ui.chess.fairy.builder.quick.g
                    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.h.b
                    public final boolean a(Iterable iterable, Iterable iterable2) {
                        return h.l(dVar2, iterable, iterable2);
                    }
                }));
                i8 = i4 + 1;
                strArr2 = strArr;
                i5 = 2;
                i6 = 0;
            }
        }
        String[] strArr3 = strArr2;
        for (int i9 = 0; i9 < 25; i9++) {
            for (int i10 = 0; i10 < 2; i10++) {
                String str2 = strArr3[i10];
                final String str3 = f11116c + (i9 + 1);
                if (str3.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    String strValueOf2 = String.valueOf(str3.charAt(0));
                    m.c(strValueOf2, "null cannot be cast to non-null type java.lang.String");
                    String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                    m.d(upperCase2, "toUpperCase(...)");
                    sb2.append((Object) upperCase2);
                    String strSubstring2 = str3.substring(1);
                    m.d(strSubstring2, "substring(...)");
                    sb2.append(strSubstring2);
                    string = sb2.toString();
                } else {
                    string = str3;
                }
                arrayList.add(c.f11117i.b("mobilityRegion" + str2 + string, "the mobility area, list of squares (e.g., d4 e4 a*)", "*1 *2 *3 *4 *5 *6 *7 *8 *9 *10", new b() { // from class: z0.k0
                    @Override // cab.shashki.app.ui.chess.fairy.builder.quick.h.b
                    public final boolean a(Iterable iterable, Iterable iterable2) {
                        return cab.shashki.app.ui.chess.fairy.builder.quick.h.h(str3, iterable, iterable2);
                    }
                }));
            }
        }
        c.a aVar3 = c.f11117i;
        arrayList.add(aVar3.j("pawnTypes", "define pieces considered as \"pawns\" for promotion, en passant, and n move rule", "p"));
        arrayList.add(c.a.c(aVar3, "promotionRegionWhite", "region where promotions are allowed for white", "*8", null, 8, null));
        arrayList.add(c.a.c(aVar3, "promotionRegionBlack", "region where promotions are allowed for black", "*1", null, 8, null));
        arrayList.add(aVar3.j("promotionPawnTypes", "promotion pawn types for both colors", "p"));
        arrayList.add(aVar3.j("promotionPawnTypesWhite", "white promotion pawn types", "p"));
        arrayList.add(aVar3.j("promotionPawnTypesBlack", "black promotion pawn types", "p"));
        arrayList.add(aVar3.j("promotionPieceTypes", "pawn promotion options", "nbrq"));
        arrayList.add(aVar3.j("promotionPieceTypesWhite", "white pawn promotion options", "nbrq"));
        arrayList.add(aVar3.j("promotionPieceTypesBlack", "black pawn promotion options", "nbrq"));
        arrayList.add(c.a.f(aVar3, "sittuyinPromotion", "enable Sittuyin-style pawn promotion", false, 4, null));
        arrayList.add(new c("promotionLimit", "maximum number of pieces of a type, e.g., q:1 r:2"));
        arrayList.add(new c("promotedPieceType", "mapping between unpromoted and promoted non-pawn piece types, e.g., p:g s:g"));
        arrayList.add(c.a.f(aVar3, "piecePromotionOnCapture", "piece promotion only allowed on captures (e.g., micro shogi)", false, 4, null));
        arrayList.add(aVar3.e("mandatoryPawnPromotion", "pawn promotion is mandatory", true));
        arrayList.add(c.a.f(aVar3, "mandatoryPiecePromotion", "piece promotion (and demotion if enabled) is mandatory", false, 4, null));
        arrayList.add(c.a.f(aVar3, "pieceDemotion", "enable demotion of pieces (e.g., Kyoto shogi)", false, 4, null));
        arrayList.add(c.a.f(aVar3, "blastOnCapture", "captures explode all adjacent non-pawn pieces (e.g., atomic chess)", false, 4, null));
        arrayList.add(aVar3.j("blastImmuneTypes", "pieces completely immune to explosions (even at ground zero)", "-"));
        arrayList.add(aVar3.j("mutuallyImmuneTypes", "pieces that can't capture another piece of same types (e.g., kings (commoners) in atomar)", "-"));
        arrayList.add(aVar3.j("petrifyOnCaptureTypes", "defined pieces are turned into wall squares when capturing", "-"));
        arrayList.add(c.a.f(aVar3, "petrifyBlastPieces", "if petrify and blast combined, should pieces destroyed in the blast be petrified?", false, 4, null));
        arrayList.add(aVar3.e("doubleStep", "enable pawn double step", true));
        arrayList.add(c.a.c(aVar3, "doubleStepRegionWhite", "region where pawn double steps are allowed for white", "*2", null, 8, null));
        arrayList.add(c.a.c(aVar3, "doubleStepRegionBlack", "region where pawn double steps are allowed for black", "*7", null, 8, null));
        arrayList.add(c.a.c(aVar3, "tripleStepRegionWhite", "region where pawn triple steps are allowed for white", "-", null, 8, null));
        arrayList.add(c.a.c(aVar3, "tripleStepRegionBlack", "region where pawn triple steps are allowed for black", "-", null, 8, null));
        arrayList.add(c.a.c(aVar3, "enPassantRegion", "define region (target squares) where en passant is allowed after double steps", "*1 *2 *3 *4 *5 *6 *7 *8 *9 *10", null, 8, null));
        arrayList.add(aVar3.j("enPassantTypes", "define pieces able to capture en passant", "p"));
        arrayList.add(aVar3.j("enPassantTypesWhite", "define white pieces able to capture en passant", "p"));
        arrayList.add(aVar3.j("enPassantTypesBlack", "define black pieces able to capture en passant", "p"));
        arrayList.add(aVar3.e("castling", "enable castling", true));
        arrayList.add(c.a.f(aVar3, "castlingDroppedPiece", "enable castling with dropped rooks/kings", false, 4, null));
        m3.c cVar = new m3.c('a', 'l');
        ArrayList arrayList2 = new ArrayList(p.o(cVar, 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(((AbstractC0596o) it).a()));
        }
        m3.g gVar = new m3.g(1, 10);
        ArrayList arrayList3 = new ArrayList(p.o(gVar, 10));
        Iterator it2 = gVar.iterator();
        while (it2.hasNext()) {
            arrayList3.add(String.valueOf(((E) it2).a()));
        }
        c.a aVar4 = c.f11117i;
        arrayList.add(aVar4.g("castlingKingsideFile", "destination file of king after kingside castling", arrayList2, "g"));
        arrayList.add(aVar4.g("castlingQueensideFile", "destination file of king after queenside castling", arrayList2, "c"));
        arrayList.add(aVar4.g("castlingRank", "relative rank of castling", arrayList3, "1"));
        arrayList.add(aVar4.g("castlingKingFile", "starting file of the castlingKingPiece if there can be more than one of that type", arrayList2, "e"));
        arrayList.add(aVar4.k("castlingKingPiece", "first piece type that participates in castling", "k"));
        arrayList.add(aVar4.g("castlingRookKingsideFile", "starting file of castlingRookPieces on kingside (if not in corner)", arrayList2, "l"));
        arrayList.add(aVar4.g("castlingRookQueensideFile", "starting file of castlingRookPieces on queenside (if not in corner)", arrayList2, "a"));
        arrayList.add(aVar4.j("castlingRookPieces", "second piece type that participates in castling", "r"));
        arrayList.add(c.a.f(aVar4, "oppositeCastling", "can't castle same side as opponent", false, 4, null));
        arrayList.add(aVar4.e("checking", "allow checks", true));
        arrayList.add(aVar4.e("dropChecks", "allow checks by piece drops", true));
        arrayList.add(c.a.f(aVar4, "mustCapture", "captures are mandatory (check evasion still takes precedence)", false, 4, null));
        arrayList.add(c.a.f(aVar4, "mustDrop", "drops are mandatory (e.g., for Sittuyin setup phase)", false, 4, null));
        arrayList.add(aVar4.k("mustDropType", "piece type for which piece drops are mandatory", "*"));
        arrayList.add(c.a.f(aVar4, "pieceDrops", "enable piece drops", false, 4, null));
        arrayList.add(c.a.f(aVar4, "dropLoop", "captures promoted pieces are not demoted", false, 4, null));
        List listJ = p.j("out", "hand", "prison");
        int i11 = 32;
        h3.h hVar = null;
        String str4 = null;
        arrayList.add(new c("captureType", e.f11135j, listJ, (String) p.G(listJ), "captured pieces are removed or go to hand or prison", str4, new b() { // from class: z0.l0
            @Override // cab.shashki.app.ui.chess.fairy.builder.quick.h.b
            public final boolean a(Iterable iterable, Iterable iterable2) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.h.i(iterable, iterable2);
            }
        }, i11, hVar));
        arrayList.add(new c("dropOnTop", e.f11130e, null, "false", "drop on top DEPRECATED", str4, new b() { // from class: z0.m0
            @Override // cab.shashki.app.ui.chess.fairy.builder.quick.h.b
            public final boolean a(Iterable iterable, Iterable iterable2) {
                return cab.shashki.app.ui.chess.fairy.builder.quick.h.j(iterable, iterable2);
            }
        }, i11, hVar));
        arrayList.add(c.a.f(aVar4, "capturesToHand", "captured pieces go to opponent's hand", false, 4, null));
        arrayList.add(c.a.f(aVar4, "firstRankPawnDrops", "allow pawn drops to first rank", false, 4, null));
        arrayList.add(c.a.f(aVar4, "promotionZonePawnDrops", "allow pawn drops in promotion zone", false, 4, null));
        List listJ2 = p.j("none", "reversi", "ataxx", "quadwrangle", "snort", "anyside", "top");
        arrayList.add(c.a.h(aVar4, "enclosingDrop", "require piece drop to enclose pieces", listJ2, null, 8, null));
        arrayList.add(c.a.c(aVar4, "enclosingDropStart", "drop region for starting phase disregarding enclosingDrop (e.g., for reversi)", null, null, 12, null));
        arrayList.add(c.a.c(aVar4, "dropRegionWhite", "restrict region for piece drops of all white pieces", "*1 *2 *3 *4 *5 *6 *7 *8 *9 *10", null, 8, null));
        arrayList.add(c.a.c(aVar4, "dropRegionBlack", "restrict region for piece drops of all black pieces", "*1 *2 *3 *4 *5 *6 *7 *8 *9 *10", null, 8, null));
        arrayList.add(c.a.f(aVar4, "sittuyinRookDrop", "restrict region of rook drops to first rank", false, 4, null));
        arrayList.add(c.a.f(aVar4, "dropOppositeColoredBishop", "dropped bishops have to be on opposite-colored squares", false, 4, null));
        arrayList.add(c.a.f(aVar4, "dropPromoted", "pieces may be dropped in promoted state", false, 4, null));
        arrayList.add(c.a.l(aVar4, "dropNoDoubled", "specified piece type can not be dropped to the same file (e.g. shogi pawn)", null, 4, null));
        arrayList.add(aVar4.i("dropNoDoubledCount", "specifies the count of already existing pieces for dropNoDoubled", 1));
        arrayList.add(new c("hostageExchange", "mapping between hostage piece type and exchange types for it, e.g., p:pnbrq n:bnrq q:q"));
        arrayList.add(c.a.f(aVar4, "prisonPawnPromotion", "pawn promote only into piece from prison by exchanging", false, 4, null));
        arrayList.add(c.a.f(aVar4, "immobilityIllegal", "pieces may not move to squares where they can never move from", false, 4, null));
        arrayList.add(c.a.f(aVar4, "gating", "maintain squares on backrank with extra rights in castling field of FEN", false, 4, null));
        arrayList.add(c.a.h(aVar4, "wallingRule", "rule on where wall can be placed", p.j("none", "arrow", "duck", "edge", "past", "static"), null, 8, null));
        arrayList.add(c.a.c(aVar4, "wallingRegionWhite", "mask where wall squares (including duck) can be placed by white", "*1 *2 *3 *4 *5 *6 *7 *8 *9 *10", null, 8, null));
        arrayList.add(c.a.c(aVar4, "wallingRegionBlack", "mask where wall squares (including duck) can be placed by black", "*1 *2 *3 *4 *5 *6 *7 *8 *9 *10", null, 8, null));
        arrayList.add(c.a.f(aVar4, "wallOrMove", "can wall or move, but not both", false, 4, null));
        arrayList.add(c.a.f(aVar4, "seirawanGating", "allow gating of pieces in hand like in S-Chess, requires 'gating = true'", false, 4, null));
        arrayList.add(c.a.f(aVar4, "cambodianMoves", "enable special moves of cambodian chess, requires 'gating = true'", false, 4, null));
        arrayList.add(c.a.c(aVar4, "diagonalLines", "enable special moves along diagonal for specific squares (Janggi)", null, null, 12, null));
        arrayList.add(c.a.f(aVar4, "pass", "allow passing", false, 4, null));
        arrayList.add(c.a.f(aVar4, "passWhite", "allow passing for white", false, 4, null));
        arrayList.add(c.a.f(aVar4, "passBlack", "allow passing for black", false, 4, null));
        arrayList.add(c.a.f(aVar4, "passOnStalemate", "allow passing in case of stalemate", false, 4, null));
        arrayList.add(c.a.f(aVar4, "passOnStalemateWhite", "allow passing in case of stalemate for white", false, 4, null));
        arrayList.add(c.a.f(aVar4, "passOnStalemateBlack", "allow passing in case of stalemate for black", false, 4, null));
        arrayList.add(c.a.f(aVar4, "makpongRule", "the king may not move away from check", false, 4, null));
        arrayList.add(c.a.f(aVar4, "flyingGeneral", "disallow general face-off like in xiangqi", false, 4, null));
        arrayList.add(aVar4.g("soldierPromotionRank", "restrict soldier to shogi pawn movements until reaching n-th rank", arrayList3, "1"));
        arrayList.add(c.a.h(aVar4, "flipEnclosedPieces", "change color of pieces that are enclosed by a drop", listJ2, null, 8, null));
        arrayList.add(aVar4.j("nMoveRuleTypes", "define pieces resetting n move rule", "p"));
        arrayList.add(aVar4.j("nMoveRuleTypesWhite", "define white pieces resetting n move rule", "p"));
        arrayList.add(aVar4.j("nMoveRuleTypesBlack", "define black pieces resetting n move rule", "p"));
        arrayList.add(aVar4.i("nMoveRule", "move count for 50/n-move rule", 50));
        arrayList.add(aVar4.i("nFoldRule", "move count for 3/n-fold repetition rule", 3));
        List listJ3 = p.j("none", "axf");
        List listJ4 = p.j("none", "win", "loss", "draw");
        arrayList.add(aVar4.g("nFoldValue", "result in case of 3/n-fold repetition", listJ4, "draw"));
        arrayList.add(c.a.f(aVar4, "nFoldValueAbsolute", "result in case of 3/n-fold repetition is from white's point of view", false, 4, null));
        arrayList.add(c.a.f(aVar4, "perpetualCheckIllegal", "prohibit perpetual checks", false, 4, null));
        arrayList.add(c.a.f(aVar4, "moveRepetitionIllegal", "prohibit moving back and forth with the same piece nFoldRule-1 times", false, 4, null));
        arrayList.add(aVar4.g("chasingRule", "enable chasing rules", listJ3, "none"));
        arrayList.add(aVar4.g("stalemateValue", "result in case of stalemate", listJ4, "draw"));
        arrayList.add(c.a.f(aVar4, "stalematePieceCount", "count material in case of stalemate", false, 4, null));
        arrayList.add(aVar4.g("checkmateValue", "result in case of checkmate", listJ4, "loss"));
        arrayList.add(c.a.f(aVar4, "shogiPawnDropMateIllegal", "prohibit checkmate via shogi pawn drops", false, 4, null));
        arrayList.add(c.a.f(aVar4, "shatarMateRule", "enable shatar mating rules", false, 4, null));
        arrayList.add(c.a.f(aVar4, "bikjangRule", "consider Janggi bikjang (facing kings) rule", false, 4, null));
        arrayList.add(aVar4.g("extinctionValue", "result when one of extinctionPieceTypes is extinct", listJ4, "none"));
        arrayList.add(c.a.f(aVar4, "extinctionClaim", "extinction of opponent pieces can only be claimed as side to move", false, 4, null));
        arrayList.add(c.a.f(aVar4, "extinctionPseudoRoyal", "treat the last extinction piece like a royal piece", false, 4, null));
        arrayList.add(c.a.f(aVar4, "dupleCheck", "when all pseudo-royal pieces are attacked, it counts as a check", false, 4, null));
        arrayList.add(aVar4.j("extinctionPieceTypes", "list of piece types for extinction rules, e.g., pnbrq (* means all)", "-"));
        arrayList.add(aVar4.i("extinctionPieceCount", "piece count at which the game is decided by extinction rule", 0));
        arrayList.add(aVar4.i("extinctionOpponentPieceCount", "opponent piece count required to adjudicate by extinction rule", 0));
        arrayList.add(aVar4.k("flagPiece", "piece type for capture the flag win rule", "*"));
        arrayList.add(aVar4.k("flagPieceWhite", "piece type for capture the flag win rule", "*"));
        arrayList.add(aVar4.k("flagPieceBlack", "piece type for capture the flag win rule", "*"));
        arrayList.add(c.a.c(aVar4, "flagRegion", "target region for capture the flag win rule", null, null, 12, null));
        arrayList.add(c.a.c(aVar4, "flagRegionWhite", "white's target region for capture the flag win rule", null, null, 12, null));
        arrayList.add(c.a.c(aVar4, "flagRegionBlack", "black's target region for capture the flag win rule", null, null, 12, null));
        List listJ5 = p.j("none", "makruk", "cambodian", "asean");
        List listJ6 = p.j("none", "janggi", "unweighted", "whitedrawodds", "blackdrawodds");
        arrayList.add(aVar4.i("flagPieceCount", "number of flag pieces that have to be in the flag zone", 1));
        arrayList.add(aVar4.e("flagPieceBlockedWin", "for flagPieceCount > 1, win if at least one flag piece in flag zone and all others occupied by pieces", false));
        arrayList.add(aVar4.e("flagMove", "the other side gets one more move after one reaches the flag zone", false));
        arrayList.add(aVar4.e("flagPieceSafe", "the flag piece must be safe to win", false));
        arrayList.add(aVar4.e("checkCounting", "enable check count win rule (check count is communicated via FEN, see 3check)", false));
        arrayList.add(aVar4.i("connectN", "number of aligned pieces for win", 0));
        arrayList.add(aVar4.j("connectPieceTypes", "pieces evaluated for connection rule", "*"));
        int i12 = 1;
        arrayList.add(aVar4.e("connectVertical", "connectN looks at Vertical rows", true));
        arrayList.add(aVar4.e("connectHorizontal", "connectN looks at Horizontal rows", true));
        arrayList.add(aVar4.e("connectDiagonal", "connectN looks at Diagonal rows", true));
        int i13 = 0;
        while (i13 < 2) {
            String str5 = strArr3[i13];
            int i14 = 0;
            while (i14 < 2) {
                i14 += i12;
                arrayList.add(c.a.c(c.f11117i, "connectRegion" + i14 + str5, "connect Region 1 to Region 2 for win. obeys connectVertical, connectHorizontal, connectDiagonal", null, null, 12, null));
                i12 = 1;
            }
            i13++;
            i12 = 1;
        }
        c.a aVar5 = c.f11117i;
        arrayList.add(aVar5.i("connectNxN", "connect a tight NxN square for win", 0));
        arrayList.add(aVar5.i("collinearN", "arrange N pieces collinearly (other squares can be between pieces)", 0));
        arrayList.add(aVar5.g("connectValue", "result in case of connect", listJ4, "win"));
        arrayList.add(c.a.h(aVar5, "materialCounting", "enable material counting rules", listJ6, null, 8, null));
        arrayList.add(aVar5.e("adjudicateFullBoard", "apply material counting immediately when board is full", false));
        arrayList.add(c.a.h(aVar5, "countingRule", "enable counting rules", listJ5, null, 8, null));
        arrayList.add(new c("castlingWins", "Specified castling moves are win conditions (letters for castling rights as in FEN, e.g., KQkq). Losing these rights is losing."));
        return arrayList;
    }

    public static final class c {

        /* renamed from: i, reason: collision with root package name */
        public static final a f11117i = new a(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f11118a;

        /* renamed from: b, reason: collision with root package name */
        private final e f11119b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f11120c;

        /* renamed from: d, reason: collision with root package name */
        private final String f11121d;

        /* renamed from: e, reason: collision with root package name */
        private final String f11122e;

        /* renamed from: f, reason: collision with root package name */
        private final b f11123f;

        /* renamed from: g, reason: collision with root package name */
        private a f11124g;

        /* renamed from: h, reason: collision with root package name */
        private String f11125h;

        public static final class a {
            public /* synthetic */ a(h3.h hVar) {
                this();
            }

            public static /* synthetic */ c c(a aVar, String str, String str2, String str3, b bVar, int i4, Object obj) {
                if ((i4 & 4) != 0) {
                    str3 = "-";
                }
                if ((i4 & 8) != 0) {
                    bVar = new b() { // from class: z0.o0
                        @Override // cab.shashki.app.ui.chess.fairy.builder.quick.h.b
                        public final boolean a(Iterable iterable, Iterable iterable2) {
                            return h.c.a.d(iterable, iterable2);
                        }
                    };
                }
                return aVar.b(str, str2, str3, bVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final boolean d(Iterable iterable, Iterable iterable2) {
                m.e(iterable, "<unused var>");
                m.e(iterable2, "<unused var>");
                return true;
            }

            public static /* synthetic */ c f(a aVar, String str, String str2, boolean z4, int i4, Object obj) {
                if ((i4 & 4) != 0) {
                    z4 = false;
                }
                return aVar.e(str, str2, z4);
            }

            public static /* synthetic */ c h(a aVar, String str, String str2, List list, String str3, int i4, Object obj) {
                if ((i4 & 8) != 0) {
                    str3 = (String) p.G(list);
                }
                return aVar.g(str, str2, list, str3);
            }

            public static /* synthetic */ c l(a aVar, String str, String str2, String str3, int i4, Object obj) {
                if ((i4 & 4) != 0) {
                    str3 = "-";
                }
                return aVar.k(str, str2, str3);
            }

            public final c b(String str, String str2, String str3, b bVar) {
                m.e(str, HalmaParams.NAME);
                m.e(str2, "help");
                m.e(str3, "default");
                m.e(bVar, "prompt");
                return new c(str, e.f11134i, null, str3, str2, str3, bVar);
            }

            public final c e(String str, String str2, boolean z4) {
                m.e(str, HalmaParams.NAME);
                m.e(str2, "help");
                return new c(str, e.f11130e, null, String.valueOf(z4), str2, null, null, 96, null);
            }

            public final c g(String str, String str2, List list, String str3) {
                m.e(str, HalmaParams.NAME);
                m.e(str2, "help");
                m.e(list, "values");
                m.e(str3, "default");
                return new c(str, e.f11135j, list, str3, str2, null, null, 96, null);
            }

            public final c i(String str, String str2, int i4) {
                m.e(str, HalmaParams.NAME);
                m.e(str2, "help");
                return new c(str, e.f11137l, null, String.valueOf(i4), str2, null, null, 96, null);
            }

            public final c j(String str, String str2, String str3) {
                m.e(str, HalmaParams.NAME);
                m.e(str2, "help");
                m.e(str3, "default");
                return new c(str, e.f11133h, null, str3, str2, null, null, 96, null);
            }

            public final c k(String str, String str2, String str3) {
                m.e(str, HalmaParams.NAME);
                m.e(str2, "help");
                m.e(str3, "default");
                return new c(str, e.f11132g, null, str3, str2, null, null, 96, null);
            }

            private a() {
            }
        }

        public c(String str, e eVar, Object obj, String str2, String str3, String str4, b bVar) {
            m.e(str, HalmaParams.NAME);
            m.e(eVar, "type");
            m.e(str2, "default");
            m.e(str3, "help");
            m.e(str4, "value");
            m.e(bVar, "prompt");
            this.f11118a = str;
            this.f11119b = eVar;
            this.f11120c = obj;
            this.f11121d = str2;
            this.f11122e = str3;
            this.f11123f = bVar;
            this.f11125h = str4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean b(Iterable iterable, Iterable iterable2) {
            m.e(iterable, "<unused var>");
            m.e(iterable2, "<unused var>");
            return true;
        }

        public final Object c() {
            return this.f11120c;
        }

        public final String d() {
            return this.f11121d;
        }

        public final String e() {
            return this.f11122e;
        }

        public final String f() {
            return this.f11118a;
        }

        public final b g() {
            return this.f11123f;
        }

        public final e h() {
            return this.f11119b;
        }

        public final String i() {
            return this.f11125h;
        }

        public final void j(a aVar) {
            this.f11124g = aVar;
        }

        public final void k(String str) {
            m.e(str, "value");
            this.f11125h = str;
            a aVar = this.f11124g;
            if (aVar != null) {
                aVar.b(this);
            }
        }

        public /* synthetic */ c(String str, e eVar, Object obj, String str2, String str3, String str4, b bVar, int i4, h3.h hVar) {
            this(str, eVar, obj, str2, str3, (i4 & 32) != 0 ? str2 : str4, (i4 & 64) != 0 ? new b() { // from class: z0.n0
                @Override // cab.shashki.app.ui.chess.fairy.builder.quick.h.b
                public final boolean a(Iterable iterable, Iterable iterable2) {
                    return h.c.b(iterable, iterable2);
                }
            } : bVar);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            this(str, e.f11136k, null, "", str2, "", null, 64, null);
            m.e(str, HalmaParams.NAME);
            m.e(str2, "help");
        }
    }
}