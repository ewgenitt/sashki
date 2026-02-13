package cab.shashki.app.db.entities;

import H1.d;
import H1.i;
import cab.shashki.app.db.entities.a;
import h3.h;
import h3.m;
import i0.AbstractC1051f;
import java.util.Set;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class CheckersParams implements a {
    private Set<String> blocked;
    private Set<String> breaks;
    private boolean breakthrough;
    private boolean captureMax;
    private CaptureSelf captureSelf;
    private Cells cells;
    private int columns;
    private Cylinder cylinder;
    private boolean doubleMove;
    private boolean draw3Repeat;
    private int drawMoves;
    private boolean flyingKing;
    private boolean fourPlayers;
    private boolean gorgonCapture;
    private int id;
    private boolean ignoreCapture;
    private int ken;
    private boolean kenKong;
    private boolean killer;
    private boolean kingCaptureFlyInversion;
    private boolean kingCaptureInsteadPawn;
    private int kingCaptureMask;
    private boolean kingDemotionInsteadOfCapture;
    private int kingMoveMask;
    private boolean kingOnlyStandsNextCellAfterCapture;
    private float kingWeightInCapture;
    private boolean layeredPiece;
    private boolean losing;
    private int manMoveMask;
    private int maxPieces;
    private boolean monochorome;
    private String name;
    private boolean pawnCanCaptureKing;
    private int pawnCaptureMask;
    private boolean pawnPromotionInCapture;
    private Set<String> portals;
    private Set<String> promBlack;
    private Set<String> promWhite;
    private Set<String> promX;
    private Set<String> promY;
    private boolean reverseCapture;
    private boolean reverseColor;
    private int rows;
    private int spinLimit;
    private Set<String> spins;
    private String startPosition;
    private boolean stavropol;
    private boolean towerCapture;
    private boolean turkCapture;
    private int wolfRule;

    public CheckersParams(String str, int i4, int i5, int i6, int i7, Cells cells, String str2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i8, int i9, int i10, int i11, int i12, int i13, Set<String> set, Set<String> set2, Set<String> set3, Set<String> set4, Set<String> set5, Set<String> set6, Set<String> set7, Set<String> set8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, int i14, int i15, boolean z22, float f4, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27) {
        m.e(str, HalmaParams.NAME);
        m.e(cells, "cells");
        m.e(str2, "startPosition");
        this.name = str;
        this.id = i4;
        this.rows = i5;
        this.columns = i6;
        this.maxPieces = i7;
        this.cells = cells;
        this.startPosition = str2;
        this.reverseColor = z4;
        this.monochorome = z5;
        this.fourPlayers = z6;
        this.draw3Repeat = z7;
        this.layeredPiece = z8;
        this.drawMoves = i8;
        this.wolfRule = i9;
        this.manMoveMask = i10;
        this.kingMoveMask = i11;
        this.pawnCaptureMask = i12;
        this.kingCaptureMask = i13;
        this.blocked = set;
        this.portals = set2;
        this.promWhite = set3;
        this.promBlack = set4;
        this.promX = set5;
        this.promY = set6;
        this.breaks = set7;
        this.spins = set8;
        this.flyingKing = z9;
        this.captureMax = z10;
        this.turkCapture = z11;
        this.towerCapture = z12;
        this.gorgonCapture = z13;
        this.reverseCapture = z14;
        this.pawnCanCaptureKing = z15;
        this.pawnPromotionInCapture = z16;
        this.kingDemotionInsteadOfCapture = z17;
        this.kingOnlyStandsNextCellAfterCapture = z18;
        this.kingCaptureFlyInversion = z19;
        this.kingCaptureInsteadPawn = z20;
        this.killer = z21;
        this.spinLimit = i14;
        this.ken = i15;
        this.kenKong = z22;
        this.kingWeightInCapture = f4;
        this.stavropol = z23;
        this.breakthrough = z24;
        this.ignoreCapture = z25;
        this.doubleMove = z26;
        this.losing = z27;
        this.cylinder = Cylinder.NONE;
        this.captureSelf = CaptureSelf.NO;
    }

    private final boolean baseSame(CheckersParams checkersParams) {
        return this.rows == checkersParams.rows && this.columns == checkersParams.columns && this.maxPieces == checkersParams.maxPieces && this.cells == checkersParams.cells && cylinderValue() == checkersParams.cylinderValue() && captureSelfValue() == checkersParams.captureSelfValue() && this.layeredPiece == checkersParams.layeredPiece && this.reverseColor == checkersParams.reverseColor && this.monochorome == checkersParams.monochorome && this.fourPlayers == checkersParams.fourPlayers && this.draw3Repeat == checkersParams.draw3Repeat && this.drawMoves == checkersParams.drawMoves && this.wolfRule == checkersParams.wolfRule && this.manMoveMask == checkersParams.manMoveMask && this.kingMoveMask == checkersParams.kingMoveMask && this.pawnCaptureMask == checkersParams.pawnCaptureMask && this.kingCaptureMask == checkersParams.kingCaptureMask && this.spinLimit == checkersParams.spinLimit && this.ken == checkersParams.ken && this.kenKong == checkersParams.kenKong && this.flyingKing == checkersParams.flyingKing && this.captureMax == checkersParams.captureMax && this.turkCapture == checkersParams.turkCapture && this.towerCapture == checkersParams.towerCapture && this.ignoreCapture == checkersParams.ignoreCapture && this.gorgonCapture == checkersParams.gorgonCapture && this.reverseCapture == checkersParams.reverseCapture && this.pawnCanCaptureKing == checkersParams.pawnCanCaptureKing && this.pawnPromotionInCapture == checkersParams.pawnPromotionInCapture && this.kingOnlyStandsNextCellAfterCapture == checkersParams.kingOnlyStandsNextCellAfterCapture && this.kingCaptureFlyInversion == checkersParams.kingCaptureFlyInversion && this.kingCaptureInsteadPawn == checkersParams.kingCaptureInsteadPawn && this.killer == checkersParams.killer && this.kingWeightInCapture == checkersParams.kingWeightInCapture && this.kingDemotionInsteadOfCapture == checkersParams.kingDemotionInsteadOfCapture && this.stavropol == checkersParams.stavropol && this.breakthrough == checkersParams.breakthrough && this.doubleMove == checkersParams.doubleMove && this.losing == checkersParams.losing;
    }

    @Override // cab.shashki.app.db.entities.a
    public int boardExtra() {
        return a.C0141a.a(this);
    }

    public final int captureSelfValue() {
        CaptureSelf captureSelf = getCaptureSelf();
        if (captureSelf != null) {
            return captureSelf.getV();
        }
        return 0;
    }

    @Override // cab.shashki.app.db.entities.a
    public int columns() {
        return this.columns;
    }

    public final String component1() {
        return this.name;
    }

    public final boolean component10() {
        return this.fourPlayers;
    }

    public final boolean component11() {
        return this.draw3Repeat;
    }

    public final boolean component12() {
        return this.layeredPiece;
    }

    public final int component13() {
        return this.drawMoves;
    }

    public final int component14() {
        return this.wolfRule;
    }

    public final int component15() {
        return this.manMoveMask;
    }

    public final int component16() {
        return this.kingMoveMask;
    }

    public final int component17() {
        return this.pawnCaptureMask;
    }

    public final int component18() {
        return this.kingCaptureMask;
    }

    public final Set<String> component19() {
        return this.blocked;
    }

    public final int component2() {
        return this.id;
    }

    public final Set<String> component20() {
        return this.portals;
    }

    public final Set<String> component21() {
        return this.promWhite;
    }

    public final Set<String> component22() {
        return this.promBlack;
    }

    public final Set<String> component23() {
        return this.promX;
    }

    public final Set<String> component24() {
        return this.promY;
    }

    public final Set<String> component25() {
        return this.breaks;
    }

    public final Set<String> component26() {
        return this.spins;
    }

    public final boolean component27() {
        return this.flyingKing;
    }

    public final boolean component28() {
        return this.captureMax;
    }

    public final boolean component29() {
        return this.turkCapture;
    }

    public final int component3() {
        return this.rows;
    }

    public final boolean component30() {
        return this.towerCapture;
    }

    public final boolean component31() {
        return this.gorgonCapture;
    }

    public final boolean component32() {
        return this.reverseCapture;
    }

    public final boolean component33() {
        return this.pawnCanCaptureKing;
    }

    public final boolean component34() {
        return this.pawnPromotionInCapture;
    }

    public final boolean component35() {
        return this.kingDemotionInsteadOfCapture;
    }

    public final boolean component36() {
        return this.kingOnlyStandsNextCellAfterCapture;
    }

    public final boolean component37() {
        return this.kingCaptureFlyInversion;
    }

    public final boolean component38() {
        return this.kingCaptureInsteadPawn;
    }

    public final boolean component39() {
        return this.killer;
    }

    public final int component4() {
        return this.columns;
    }

    public final int component40() {
        return this.spinLimit;
    }

    public final int component41() {
        return this.ken;
    }

    public final boolean component42() {
        return this.kenKong;
    }

    public final float component43() {
        return this.kingWeightInCapture;
    }

    public final boolean component44() {
        return this.stavropol;
    }

    public final boolean component45() {
        return this.breakthrough;
    }

    public final boolean component46() {
        return this.ignoreCapture;
    }

    public final boolean component47() {
        return this.doubleMove;
    }

    public final boolean component48() {
        return this.losing;
    }

    public final int component5() {
        return this.maxPieces;
    }

    public final Cells component6() {
        return this.cells;
    }

    public final String component7() {
        return this.startPosition;
    }

    public final boolean component8() {
        return this.reverseColor;
    }

    public final boolean component9() {
        return this.monochorome;
    }

    public final CheckersParams copy(String str, int i4, int i5, int i6, int i7, Cells cells, String str2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i8, int i9, int i10, int i11, int i12, int i13, Set<String> set, Set<String> set2, Set<String> set3, Set<String> set4, Set<String> set5, Set<String> set6, Set<String> set7, Set<String> set8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, int i14, int i15, boolean z22, float f4, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27) {
        m.e(str, HalmaParams.NAME);
        m.e(cells, "cells");
        m.e(str2, "startPosition");
        return new CheckersParams(str, i4, i5, i6, i7, cells, str2, z4, z5, z6, z7, z8, i8, i9, i10, i11, i12, i13, set, set2, set3, set4, set5, set6, set7, set8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, i14, i15, z22, f4, z23, z24, z25, z26, z27);
    }

    public final int cylinderValue() {
        Cylinder cylinder = getCylinder();
        if (cylinder != null) {
            return cylinder.getV();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckersParams)) {
            return false;
        }
        CheckersParams checkersParams = (CheckersParams) obj;
        return m.a(this.name, checkersParams.name) && this.id == checkersParams.id && this.rows == checkersParams.rows && this.columns == checkersParams.columns && this.maxPieces == checkersParams.maxPieces && this.cells == checkersParams.cells && m.a(this.startPosition, checkersParams.startPosition) && this.reverseColor == checkersParams.reverseColor && this.monochorome == checkersParams.monochorome && this.fourPlayers == checkersParams.fourPlayers && this.draw3Repeat == checkersParams.draw3Repeat && this.layeredPiece == checkersParams.layeredPiece && this.drawMoves == checkersParams.drawMoves && this.wolfRule == checkersParams.wolfRule && this.manMoveMask == checkersParams.manMoveMask && this.kingMoveMask == checkersParams.kingMoveMask && this.pawnCaptureMask == checkersParams.pawnCaptureMask && this.kingCaptureMask == checkersParams.kingCaptureMask && m.a(this.blocked, checkersParams.blocked) && m.a(this.portals, checkersParams.portals) && m.a(this.promWhite, checkersParams.promWhite) && m.a(this.promBlack, checkersParams.promBlack) && m.a(this.promX, checkersParams.promX) && m.a(this.promY, checkersParams.promY) && m.a(this.breaks, checkersParams.breaks) && m.a(this.spins, checkersParams.spins) && this.flyingKing == checkersParams.flyingKing && this.captureMax == checkersParams.captureMax && this.turkCapture == checkersParams.turkCapture && this.towerCapture == checkersParams.towerCapture && this.gorgonCapture == checkersParams.gorgonCapture && this.reverseCapture == checkersParams.reverseCapture && this.pawnCanCaptureKing == checkersParams.pawnCanCaptureKing && this.pawnPromotionInCapture == checkersParams.pawnPromotionInCapture && this.kingDemotionInsteadOfCapture == checkersParams.kingDemotionInsteadOfCapture && this.kingOnlyStandsNextCellAfterCapture == checkersParams.kingOnlyStandsNextCellAfterCapture && this.kingCaptureFlyInversion == checkersParams.kingCaptureFlyInversion && this.kingCaptureInsteadPawn == checkersParams.kingCaptureInsteadPawn && this.killer == checkersParams.killer && this.spinLimit == checkersParams.spinLimit && this.ken == checkersParams.ken && this.kenKong == checkersParams.kenKong && Float.compare(this.kingWeightInCapture, checkersParams.kingWeightInCapture) == 0 && this.stavropol == checkersParams.stavropol && this.breakthrough == checkersParams.breakthrough && this.ignoreCapture == checkersParams.ignoreCapture && this.doubleMove == checkersParams.doubleMove && this.losing == checkersParams.losing;
    }

    @Override // cab.shashki.app.db.entities.a
    public boolean extraPlayers() {
        return a.C0141a.b(this);
    }

    public final Set<String> getBlocked() {
        return this.blocked;
    }

    public final String[] getBlockedCells() {
        String[] strArr;
        Set<String> set = this.blocked;
        return (set == null || (strArr = (String[]) set.toArray(new String[0])) == null) ? new String[0] : strArr;
    }

    public final Set<String> getBreaks() {
        return this.breaks;
    }

    public final boolean getBreakthrough() {
        return this.breakthrough;
    }

    public final boolean getCaptureMax() {
        return this.captureMax;
    }

    public final CaptureSelf getCaptureSelf() {
        CaptureSelf captureSelf = this.captureSelf;
        return captureSelf == null ? CaptureSelf.NO : captureSelf;
    }

    public final Cells getCells() {
        return this.cells;
    }

    public final int getColumns() {
        return this.columns;
    }

    public final String[] getCuts() {
        Set<String> set = this.breaks;
        if (set != null) {
            if (set.isEmpty()) {
                set = null;
            }
            if (set != null) {
                return (String[]) set.toArray(new String[0]);
            }
        }
        return null;
    }

    public final Cylinder getCylinder() {
        Cylinder cylinder = this.cylinder;
        return cylinder == null ? Cylinder.NONE : cylinder;
    }

    public final boolean getDoubleMove() {
        return this.doubleMove;
    }

    public final boolean getDraw3Repeat() {
        return this.draw3Repeat;
    }

    public final int getDrawMoves() {
        return this.drawMoves;
    }

    public final boolean getFlyingKing() {
        return this.flyingKing;
    }

    public final boolean getFourPlayers() {
        return this.fourPlayers;
    }

    public final boolean getGorgonCapture() {
        return this.gorgonCapture;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean getIgnoreCapture() {
        return this.ignoreCapture;
    }

    public final int getKen() {
        return this.ken;
    }

    public final boolean getKenKong() {
        return this.kenKong;
    }

    public final boolean getKiller() {
        return this.killer;
    }

    public final boolean getKingCaptureFlyInversion() {
        return this.kingCaptureFlyInversion;
    }

    public final boolean getKingCaptureInsteadPawn() {
        return this.kingCaptureInsteadPawn;
    }

    public final int getKingCaptureMask() {
        return this.kingCaptureMask;
    }

    public final boolean getKingDemotionInsteadOfCapture() {
        return this.kingDemotionInsteadOfCapture;
    }

    public final int getKingMoveMask() {
        return this.kingMoveMask;
    }

    public final boolean getKingOnlyStandsNextCellAfterCapture() {
        return this.kingOnlyStandsNextCellAfterCapture;
    }

    public final float getKingWeightInCapture() {
        return this.kingWeightInCapture;
    }

    public final boolean getLayeredPiece() {
        return this.layeredPiece;
    }

    public final boolean getLosing() {
        return this.losing;
    }

    public final int getManMoveMask() {
        return this.manMoveMask;
    }

    public final int getMaxPieces() {
        return this.maxPieces;
    }

    public final boolean getMonochorome() {
        return this.monochorome;
    }

    public final String getName() {
        return this.name;
    }

    public final String[] getPB() {
        Set<String> set = this.promBlack;
        if (set != null) {
            if (set.isEmpty()) {
                set = null;
            }
            if (set != null) {
                return (String[]) set.toArray(new String[0]);
            }
        }
        return null;
    }

    public final String[] getPW() {
        Set<String> set = this.promWhite;
        if (set != null) {
            if (set.isEmpty()) {
                set = null;
            }
            if (set != null) {
                return (String[]) set.toArray(new String[0]);
            }
        }
        return null;
    }

    public final String[] getPX() {
        Set<String> set = this.promX;
        if (set != null) {
            if (set.isEmpty()) {
                set = null;
            }
            if (set != null) {
                return (String[]) set.toArray(new String[0]);
            }
        }
        return null;
    }

    public final String[] getPY() {
        Set<String> set = this.promY;
        if (set != null) {
            if (set.isEmpty()) {
                set = null;
            }
            if (set != null) {
                return (String[]) set.toArray(new String[0]);
            }
        }
        return null;
    }

    public final boolean getPawnCanCaptureKing() {
        return this.pawnCanCaptureKing;
    }

    public final int getPawnCaptureMask() {
        return this.pawnCaptureMask;
    }

    public final boolean getPawnPromotionInCapture() {
        return this.pawnPromotionInCapture;
    }

    public final String[] getPortalArray() {
        String[] strArr;
        Set<String> set = this.portals;
        return (set == null || (strArr = (String[]) set.toArray(new String[0])) == null) ? new String[0] : strArr;
    }

    public final Set<String> getPortals() {
        return this.portals;
    }

    public final Set<String> getPromBlack() {
        return this.promBlack;
    }

    public final Set<String> getPromWhite() {
        return this.promWhite;
    }

    public final Set<String> getPromX() {
        return this.promX;
    }

    public final Set<String> getPromY() {
        return this.promY;
    }

    public final boolean getReverseCapture() {
        return this.reverseCapture;
    }

    public final boolean getReverseColor() {
        return this.reverseColor;
    }

    public final int getRows() {
        return this.rows;
    }

    public final String[] getSpinArray() {
        String[] strArr;
        Set<String> set = this.spins;
        return (set == null || (strArr = (String[]) set.toArray(new String[0])) == null) ? new String[0] : strArr;
    }

    public final int getSpinLimit() {
        return this.spinLimit;
    }

    public final Set<String> getSpins() {
        return this.spins;
    }

    public final String getStartPosition() {
        return this.startPosition;
    }

    public final boolean getStavropol() {
        return this.stavropol;
    }

    public final boolean getTowerCapture() {
        return this.towerCapture;
    }

    public final boolean getTurkCapture() {
        return this.turkCapture;
    }

    public final int getWolfRule() {
        return this.wolfRule;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((this.name.hashCode() * 31) + this.id) * 31) + this.rows) * 31) + this.columns) * 31) + this.maxPieces) * 31) + this.cells.hashCode()) * 31) + this.startPosition.hashCode()) * 31) + AbstractC1051f.a(this.reverseColor)) * 31) + AbstractC1051f.a(this.monochorome)) * 31) + AbstractC1051f.a(this.fourPlayers)) * 31) + AbstractC1051f.a(this.draw3Repeat)) * 31) + AbstractC1051f.a(this.layeredPiece)) * 31) + this.drawMoves) * 31) + this.wolfRule) * 31) + this.manMoveMask) * 31) + this.kingMoveMask) * 31) + this.pawnCaptureMask) * 31) + this.kingCaptureMask) * 31;
        Set<String> set = this.blocked;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        Set<String> set2 = this.portals;
        int iHashCode3 = (iHashCode2 + (set2 == null ? 0 : set2.hashCode())) * 31;
        Set<String> set3 = this.promWhite;
        int iHashCode4 = (iHashCode3 + (set3 == null ? 0 : set3.hashCode())) * 31;
        Set<String> set4 = this.promBlack;
        int iHashCode5 = (iHashCode4 + (set4 == null ? 0 : set4.hashCode())) * 31;
        Set<String> set5 = this.promX;
        int iHashCode6 = (iHashCode5 + (set5 == null ? 0 : set5.hashCode())) * 31;
        Set<String> set6 = this.promY;
        int iHashCode7 = (iHashCode6 + (set6 == null ? 0 : set6.hashCode())) * 31;
        Set<String> set7 = this.breaks;
        int iHashCode8 = (iHashCode7 + (set7 == null ? 0 : set7.hashCode())) * 31;
        Set<String> set8 = this.spins;
        return ((((((((((((((((((((((((((((((((((((((((((((iHashCode8 + (set8 != null ? set8.hashCode() : 0)) * 31) + AbstractC1051f.a(this.flyingKing)) * 31) + AbstractC1051f.a(this.captureMax)) * 31) + AbstractC1051f.a(this.turkCapture)) * 31) + AbstractC1051f.a(this.towerCapture)) * 31) + AbstractC1051f.a(this.gorgonCapture)) * 31) + AbstractC1051f.a(this.reverseCapture)) * 31) + AbstractC1051f.a(this.pawnCanCaptureKing)) * 31) + AbstractC1051f.a(this.pawnPromotionInCapture)) * 31) + AbstractC1051f.a(this.kingDemotionInsteadOfCapture)) * 31) + AbstractC1051f.a(this.kingOnlyStandsNextCellAfterCapture)) * 31) + AbstractC1051f.a(this.kingCaptureFlyInversion)) * 31) + AbstractC1051f.a(this.kingCaptureInsteadPawn)) * 31) + AbstractC1051f.a(this.killer)) * 31) + this.spinLimit) * 31) + this.ken) * 31) + AbstractC1051f.a(this.kenKong)) * 31) + Float.floatToIntBits(this.kingWeightInCapture)) * 31) + AbstractC1051f.a(this.stavropol)) * 31) + AbstractC1051f.a(this.breakthrough)) * 31) + AbstractC1051f.a(this.ignoreCapture)) * 31) + AbstractC1051f.a(this.doubleMove)) * 31) + AbstractC1051f.a(this.losing);
    }

    @Override // cab.shashki.app.db.entities.a
    public String id() {
        return String.valueOf(this.id);
    }

    @Override // cab.shashki.app.db.entities.a
    public boolean is3() {
        return this.fourPlayers && this.cells == Cells.HEXAGON;
    }

    @Override // cab.shashki.app.db.entities.a
    public boolean is4() {
        return this.fourPlayers;
    }

    @Override // cab.shashki.app.db.entities.a
    public boolean is6() {
        return a.C0141a.e(this);
    }

    @Override // cab.shashki.app.db.entities.a
    public String name() {
        return this.name;
    }

    @Override // cab.shashki.app.db.entities.a
    public int rows() {
        return this.rows;
    }

    public final boolean same(CheckersParams checkersParams) {
        m.e(checkersParams, "p");
        return baseSame(checkersParams) && m.a(this.startPosition, checkersParams.startPosition) && m.a(this.blocked, checkersParams.blocked) && m.a(this.breaks, checkersParams.breaks) && m.a(this.portals, checkersParams.portals) && m.a(this.promBlack, checkersParams.promBlack) && m.a(this.promWhite, checkersParams.promWhite) && m.a(this.promX, checkersParams.promX) && m.a(this.promY, checkersParams.promY) && m.a(this.spins, checkersParams.spins);
    }

    public final void setBlocked(Set<String> set) {
        this.blocked = set;
    }

    public final void setBreaks(Set<String> set) {
        this.breaks = set;
    }

    public final void setBreakthrough(boolean z4) {
        this.breakthrough = z4;
    }

    public final void setCaptureMax(boolean z4) {
        this.captureMax = z4;
    }

    public final void setCaptureSelf(CaptureSelf captureSelf) {
        this.captureSelf = captureSelf;
    }

    public final void setCells(Cells cells) {
        m.e(cells, "<set-?>");
        this.cells = cells;
    }

    public final void setColumns(int i4) {
        this.columns = i4;
    }

    public final void setCylinder(Cylinder cylinder) {
        this.cylinder = cylinder;
    }

    public final void setDoubleMove(boolean z4) {
        this.doubleMove = z4;
    }

    public final void setDraw3Repeat(boolean z4) {
        this.draw3Repeat = z4;
    }

    public final void setDrawMoves(int i4) {
        this.drawMoves = i4;
    }

    public final void setFlyingKing(boolean z4) {
        this.flyingKing = z4;
    }

    public final void setFourPlayers(boolean z4) {
        this.fourPlayers = z4;
    }

    public final void setGorgonCapture(boolean z4) {
        this.gorgonCapture = z4;
    }

    public final void setId(int i4) {
        this.id = i4;
    }

    public final void setIgnoreCapture(boolean z4) {
        this.ignoreCapture = z4;
    }

    public final void setKen(int i4) {
        this.ken = i4;
    }

    public final void setKenKong(boolean z4) {
        this.kenKong = z4;
    }

    public final void setKiller(boolean z4) {
        this.killer = z4;
    }

    public final void setKingCaptureFlyInversion(boolean z4) {
        this.kingCaptureFlyInversion = z4;
    }

    public final void setKingCaptureInsteadPawn(boolean z4) {
        this.kingCaptureInsteadPawn = z4;
    }

    public final void setKingCaptureMask(int i4) {
        this.kingCaptureMask = i4;
    }

    public final void setKingDemotionInsteadOfCapture(boolean z4) {
        this.kingDemotionInsteadOfCapture = z4;
    }

    public final void setKingMoveMask(int i4) {
        this.kingMoveMask = i4;
    }

    public final void setKingOnlyStandsNextCellAfterCapture(boolean z4) {
        this.kingOnlyStandsNextCellAfterCapture = z4;
    }

    public final void setKingWeightInCapture(float f4) {
        this.kingWeightInCapture = f4;
    }

    public final void setLayeredPiece(boolean z4) {
        this.layeredPiece = z4;
    }

    public final void setLosing(boolean z4) {
        this.losing = z4;
    }

    public final void setManMoveMask(int i4) {
        this.manMoveMask = i4;
    }

    public final void setMaxPieces(int i4) {
        this.maxPieces = i4;
    }

    public final void setMonochorome(boolean z4) {
        this.monochorome = z4;
    }

    public final void setName(String str) {
        m.e(str, "<set-?>");
        this.name = str;
    }

    public final void setPawnCanCaptureKing(boolean z4) {
        this.pawnCanCaptureKing = z4;
    }

    public final void setPawnCaptureMask(int i4) {
        this.pawnCaptureMask = i4;
    }

    public final void setPawnPromotionInCapture(boolean z4) {
        this.pawnPromotionInCapture = z4;
    }

    public final void setPortals(Set<String> set) {
        this.portals = set;
    }

    public final void setPromBlack(Set<String> set) {
        this.promBlack = set;
    }

    public final void setPromWhite(Set<String> set) {
        this.promWhite = set;
    }

    public final void setPromX(Set<String> set) {
        this.promX = set;
    }

    public final void setPromY(Set<String> set) {
        this.promY = set;
    }

    public final void setReverseCapture(boolean z4) {
        this.reverseCapture = z4;
    }

    public final void setReverseColor(boolean z4) {
        this.reverseColor = z4;
    }

    public final void setRows(int i4) {
        this.rows = i4;
    }

    public final void setSpinLimit(int i4) {
        this.spinLimit = i4;
    }

    public final void setSpins(Set<String> set) {
        this.spins = set;
    }

    public final void setStartPosition(String str) {
        m.e(str, "<set-?>");
        this.startPosition = str;
    }

    public final void setStavropol(boolean z4) {
        this.stavropol = z4;
    }

    public final void setTowerCapture(boolean z4) {
        this.towerCapture = z4;
    }

    public final void setTurkCapture(boolean z4) {
        this.turkCapture = z4;
    }

    public final void setWolfRule(int i4) {
        this.wolfRule = i4;
    }

    public final i toJsonObject() {
        d dVar = new d();
        i iVar = new i();
        iVar.o(HalmaParams.NAME, this.name);
        iVar.n("rows", Integer.valueOf(this.rows));
        iVar.n("columns", Integer.valueOf(this.columns));
        iVar.n("maxPieces", Integer.valueOf(this.maxPieces));
        iVar.o("cells", this.cells.toString());
        iVar.o("startPosition", this.startPosition);
        iVar.m("draw3Repeat", Boolean.valueOf(this.draw3Repeat));
        iVar.n("drawMoves", Integer.valueOf(this.drawMoves));
        iVar.n("manMoveMask", Integer.valueOf(this.manMoveMask));
        iVar.n("kingMoveMask", Integer.valueOf(this.kingMoveMask));
        iVar.n("pawnCaptureMask", Integer.valueOf(this.pawnCaptureMask));
        iVar.n("kingCaptureMask", Integer.valueOf(this.kingCaptureMask));
        iVar.m("flyingKing", Boolean.valueOf(this.flyingKing));
        iVar.m("pawnCanCaptureKing", Boolean.valueOf(this.pawnCanCaptureKing));
        iVar.m("pawnPromotionInCapture", Boolean.valueOf(this.pawnPromotionInCapture));
        iVar.n("kingWeightInCapture", Float.valueOf(this.kingWeightInCapture));
        iVar.n("wolfRule", Integer.valueOf(this.wolfRule));
        if (this.reverseColor) {
            iVar.m("reverseColor", Boolean.TRUE);
        }
        if (this.monochorome) {
            iVar.m("monochorome", Boolean.TRUE);
        }
        if (this.fourPlayers) {
            iVar.m(HalmaParams.FOUR_PLAYERS, Boolean.TRUE);
        }
        if (this.layeredPiece) {
            iVar.m("layeredPiece", Boolean.TRUE);
        }
        Set<String> set = this.blocked;
        if (set != null && !set.isEmpty()) {
            iVar.l("blocked", dVar.z(this.blocked));
        }
        Set<String> set2 = this.portals;
        if (set2 != null && !set2.isEmpty()) {
            iVar.l("portals", dVar.z(this.portals));
        }
        Set<String> set3 = this.promWhite;
        if (set3 != null && !set3.isEmpty()) {
            iVar.l("promWhite", dVar.z(this.promWhite));
        }
        Set<String> set4 = this.promBlack;
        if (set4 != null && !set4.isEmpty()) {
            iVar.l("promBlack", dVar.z(this.promBlack));
        }
        Set<String> set5 = this.promX;
        if (set5 != null && !set5.isEmpty()) {
            iVar.l("promX", dVar.z(this.promX));
        }
        Set<String> set6 = this.promY;
        if (set6 != null && !set6.isEmpty()) {
            iVar.l("promY", dVar.z(this.promY));
        }
        Set<String> set7 = this.breaks;
        if (set7 != null && !set7.isEmpty()) {
            iVar.l("breaks", dVar.z(this.breaks));
        }
        Set<String> set8 = this.spins;
        if (set8 != null && !set8.isEmpty()) {
            iVar.l("spins", dVar.z(this.spins));
        }
        if (this.captureMax) {
            iVar.m("captureMax", Boolean.TRUE);
        }
        if (this.turkCapture) {
            iVar.m("turkCapture", Boolean.TRUE);
        }
        if (this.towerCapture) {
            iVar.m("towerCapture", Boolean.TRUE);
        }
        if (this.gorgonCapture) {
            iVar.m("gorgonCapture", Boolean.TRUE);
        }
        if (this.reverseCapture) {
            iVar.m("reverseCapture", Boolean.TRUE);
        }
        if (this.kingDemotionInsteadOfCapture) {
            iVar.m("kingDemotionInsteadOfCapture", Boolean.TRUE);
        }
        if (this.kingOnlyStandsNextCellAfterCapture) {
            iVar.m("kingOnlyStandsNextCellAfterCapture", Boolean.TRUE);
        }
        if (this.kingCaptureFlyInversion) {
            iVar.m("kingCaptureFlyInversion", Boolean.TRUE);
        }
        if (this.kingCaptureInsteadPawn) {
            iVar.m("kingCaptureInsteadPawn", Boolean.TRUE);
        }
        if (this.killer) {
            iVar.m("killer", Boolean.TRUE);
        }
        int i4 = this.spinLimit;
        if (i4 != 0) {
            iVar.n("spinLimit", Integer.valueOf(i4));
        }
        int i5 = this.ken;
        if (i5 != 0) {
            iVar.n("ken", Integer.valueOf(i5));
        }
        if (this.kenKong) {
            iVar.m("kenKong", Boolean.TRUE);
        }
        if (this.stavropol) {
            iVar.m("stavropol", Boolean.TRUE);
        }
        if (this.breakthrough) {
            iVar.m("breakthrough", Boolean.TRUE);
        }
        if (this.ignoreCapture) {
            iVar.m("ignoreCapture", Boolean.TRUE);
        }
        if (this.doubleMove) {
            iVar.m("doubleMove", Boolean.TRUE);
        }
        if (this.losing) {
            iVar.m("losing", Boolean.TRUE);
        }
        Cylinder cylinder = getCylinder();
        if (cylinder != null) {
            if (cylinder == Cylinder.NONE) {
                cylinder = null;
            }
            if (cylinder != null) {
                iVar.o("cylinder", cylinder.toString());
            }
        }
        CaptureSelf captureSelf = getCaptureSelf();
        if (captureSelf != null) {
            CaptureSelf captureSelf2 = captureSelf != CaptureSelf.NO ? captureSelf : null;
            if (captureSelf2 != null) {
                iVar.o("captureSelf", captureSelf2.toString());
            }
        }
        return iVar;
    }

    public final String toJsonString() {
        String string = toJsonObject().toString();
        m.d(string, "toString(...)");
        return string;
    }

    public String toString() {
        return "CheckersParams(name=" + this.name + ", id=" + this.id + ", rows=" + this.rows + ", columns=" + this.columns + ", maxPieces=" + this.maxPieces + ", cells=" + this.cells + ", startPosition=" + this.startPosition + ", reverseColor=" + this.reverseColor + ", monochorome=" + this.monochorome + ", fourPlayers=" + this.fourPlayers + ", draw3Repeat=" + this.draw3Repeat + ", layeredPiece=" + this.layeredPiece + ", drawMoves=" + this.drawMoves + ", wolfRule=" + this.wolfRule + ", manMoveMask=" + this.manMoveMask + ", kingMoveMask=" + this.kingMoveMask + ", pawnCaptureMask=" + this.pawnCaptureMask + ", kingCaptureMask=" + this.kingCaptureMask + ", blocked=" + this.blocked + ", portals=" + this.portals + ", promWhite=" + this.promWhite + ", promBlack=" + this.promBlack + ", promX=" + this.promX + ", promY=" + this.promY + ", breaks=" + this.breaks + ", spins=" + this.spins + ", flyingKing=" + this.flyingKing + ", captureMax=" + this.captureMax + ", turkCapture=" + this.turkCapture + ", towerCapture=" + this.towerCapture + ", gorgonCapture=" + this.gorgonCapture + ", reverseCapture=" + this.reverseCapture + ", pawnCanCaptureKing=" + this.pawnCanCaptureKing + ", pawnPromotionInCapture=" + this.pawnPromotionInCapture + ", kingDemotionInsteadOfCapture=" + this.kingDemotionInsteadOfCapture + ", kingOnlyStandsNextCellAfterCapture=" + this.kingOnlyStandsNextCellAfterCapture + ", kingCaptureFlyInversion=" + this.kingCaptureFlyInversion + ", kingCaptureInsteadPawn=" + this.kingCaptureInsteadPawn + ", killer=" + this.killer + ", spinLimit=" + this.spinLimit + ", ken=" + this.ken + ", kenKong=" + this.kenKong + ", kingWeightInCapture=" + this.kingWeightInCapture + ", stavropol=" + this.stavropol + ", breakthrough=" + this.breakthrough + ", ignoreCapture=" + this.ignoreCapture + ", doubleMove=" + this.doubleMove + ", losing=" + this.losing + ")";
    }

    public /* synthetic */ CheckersParams(String str, int i4, int i5, int i6, int i7, Cells cells, String str2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i8, int i9, int i10, int i11, int i12, int i13, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, Set set8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, int i14, int i15, boolean z22, float f4, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, int i16, int i17, h hVar) {
        this((i16 & 1) != 0 ? "" : str, (i16 & 2) != 0 ? 0 : i4, (i16 & 4) != 0 ? 8 : i5, (i16 & 8) != 0 ? 8 : i6, (i16 & 16) != 0 ? 16 : i7, (i16 & 32) != 0 ? Cells.BLACK : cells, str2, (i16 & 128) != 0 ? false : z4, (i16 & 256) != 0 ? false : z5, (i16 & 512) != 0 ? false : z6, (i16 & 1024) != 0 ? true : z7, (i16 & 2048) != 0 ? false : z8, (i16 & 4096) != 0 ? 80 : i8, (i16 & 8192) != 0 ? 0 : i9, (i16 & 16384) != 0 ? 5 : i10, (i16 & 32768) != 0 ? 85 : i11, (i16 & 65536) != 0 ? 85 : i12, (i16 & 131072) == 0 ? i13 : 85, (i16 & 262144) != 0 ? null : set, (i16 & 524288) != 0 ? null : set2, (i16 & 1048576) != 0 ? null : set3, (i16 & 2097152) != 0 ? null : set4, (i16 & 4194304) != 0 ? null : set5, (i16 & 8388608) != 0 ? null : set6, (i16 & 16777216) != 0 ? null : set7, (i16 & 33554432) == 0 ? set8 : null, (i16 & 67108864) != 0 ? true : z9, (i16 & 134217728) != 0 ? false : z10, (i16 & 268435456) != 0 ? false : z11, (i16 & 536870912) != 0 ? false : z12, (i16 & 1073741824) != 0 ? false : z13, (i16 & Integer.MIN_VALUE) != 0 ? false : z14, (i17 & 1) != 0 ? true : z15, (i17 & 2) != 0 ? true : z16, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? false : z18, (i17 & 16) != 0 ? false : z19, (i17 & 32) != 0 ? false : z20, (i17 & 64) != 0 ? false : z21, (i17 & 128) != 0 ? 0 : i14, (i17 & 256) != 0 ? 0 : i15, (i17 & 512) != 0 ? false : z22, (i17 & 1024) != 0 ? 1.0f : f4, (i17 & 2048) != 0 ? false : z23, (i17 & 4096) != 0 ? false : z24, (i17 & 8192) != 0 ? false : z25, (i17 & 16384) != 0 ? false : z26, (i17 & 32768) != 0 ? false : z27);
    }
}