package cab.shashki.cpp;

import android.util.Log;
import cab.shashki.app.db.entities.CheckersParams;
import cab.shashki.app.db.entities.HalmaParams;
import e0.AbstractC0868a;
import e0.InterfaceC0869b;
import e0.InterfaceC0870c;
import e0.InterfaceC0871d;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public class CppGame implements InterfaceC0869b, InterfaceC0871d {
    public static final String EXTRA_SCAN_EVAL = "EXTRA_SCAN_EVAL";
    private static final String TAG = "CppGame";
    private final long addr;
    private final InterfaceC0869b.a listener;

    private CppGame(int i4, int i5, InterfaceC0869b.a aVar) {
        this(i4, i5, 0, aVar);
    }

    public static int checkParams(CheckersParams checkersParams) {
        return (int) nativeInitUniversal(true, 0, checkersParams.getRows(), checkersParams.getColumns(), checkersParams.getMaxPieces(), checkersParams.getCells().getV(), checkersParams.cylinderValue(), checkersParams.getLayeredPiece(), checkersParams.getStartPosition(), checkersParams.getBlockedCells(), checkersParams.getCuts(), checkersParams.getSpinArray(), checkersParams.getPortalArray(), checkersParams.getPW(), checkersParams.getPB(), checkersParams.getPX(), checkersParams.getPY(), checkersParams.getFourPlayers(), checkersParams.getReverseColor(), checkersParams.getDraw3Repeat(), checkersParams.getDrawMoves(), checkersParams.getDoubleMove(), checkersParams.getWolfRule(), checkersParams.getManMoveMask(), checkersParams.getKingMoveMask(), checkersParams.getPawnCaptureMask(), checkersParams.getKingCaptureMask(), checkersParams.getKen(), checkersParams.getKenKong(), checkersParams.getSpinLimit(), checkersParams.getFlyingKing(), checkersParams.getCaptureMax(), checkersParams.getTurkCapture(), checkersParams.getTowerCapture(), checkersParams.getPawnCanCaptureKing(), checkersParams.getPawnPromotionInCapture(), checkersParams.getReverseCapture(), checkersParams.getKingOnlyStandsNextCellAfterCapture(), checkersParams.getGorgonCapture(), checkersParams.getKingCaptureInsteadPawn(), checkersParams.getKingCaptureFlyInversion(), checkersParams.getKiller(), checkersParams.getKingWeightInCapture(), checkersParams.captureSelfValue(), checkersParams.getStavropol(), checkersParams.getKingDemotionInsteadOfCapture(), checkersParams.getBreakthrough(), checkersParams.getLosing(), checkersParams.getIgnoreCapture(), checkersParams.getMonochorome());
    }

    public static CppGame get(int i4, int i5, InterfaceC0869b.a aVar) {
        return new CppGame(i4, i5, aVar);
    }

    public static CppGame halma(int i4, HalmaParams halmaParams) {
        return new CppGame(halmaParams, i4);
    }

    private native String nativeAI1(long j4, int i4);

    private native String nativeAI2(long j4, long j5);

    private native void nativeDestroy(long j4);

    private native int nativeGetExtraPlayer(long j4);

    private native String[] nativeGetHistory(long j4);

    private native String[] nativeGetLastMove(long j4);

    private native boolean nativeGetPlayer(long j4);

    private native String nativeGetPosition(long j4);

    private native String[] nativeGetPossibleMoves(long j4);

    private native String nativeGetStartPosition(long j4);

    private native int nativeGetState(long j4);

    private native long nativeInit(int i4, int i5, int i6);

    private native long nativeInitHalma(int i4, int i5, int i6, int i7, boolean z4, int i8, boolean z5, int[] iArr);

    private static native long nativeInitUniversal(boolean z4, int i4, int i5, int i6, int i7, int i8, int i9, boolean z5, String str, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7, String[] strArr8, boolean z6, boolean z7, boolean z8, int i10, boolean z9, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10, int i17, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, float f4, int i18, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28);

    private native boolean nativeMakeMove(long j4, String str);

    private native void nativeResetGame(long j4);

    private native void nativeSetAllyMask(long j4, int i4);

    private native boolean nativeSetPosition(long j4, String str);

    private native boolean nativeStartAnalise(long j4);

    private native void nativeStop(long j4);

    private native boolean nativeUndoMove(long j4);

    private void onAnaliseResult(int i4, int i5, double d4, String str) {
        this.listener.a(i5, i4, d4, str);
    }

    public static native void setCakeRandomization(boolean z4);

    public static native void setKestoAlphaNotation(boolean z4);

    public static native void setPoolAlphaNotation(boolean z4);

    private native void setScanEval(long j4, String str);

    public static native void setThaiRandomization(boolean z4);

    public static CppGame universal(int i4, CheckersParams checkersParams) {
        return new CppGame(checkersParams, (InterfaceC0869b.a) null, i4);
    }

    @Override // e0.InterfaceC0870c
    public String artificialIntelligence(int i4) {
        String strNativeAI1 = nativeAI1(this.addr, i4);
        if (strNativeAI1.isEmpty()) {
            return null;
        }
        return strNativeAI1;
    }

    @Override // e0.InterfaceC0871d
    public int extraPlayer() {
        return nativeGetExtraPlayer(this.addr);
    }

    protected void finalize() throws Throwable {
        Log.d(TAG, "destroy " + this.addr);
        try {
            nativeDestroy(this.addr);
        } catch (Exception unused) {
        }
        super.finalize();
    }

    @Override // e0.InterfaceC0870c
    public String[] getHistory() {
        return nativeGetHistory(this.addr);
    }

    @Override // e0.InterfaceC0870c
    public String[] getLastMove() {
        String[] strArrNativeGetLastMove = nativeGetLastMove(this.addr);
        if (strArrNativeGetLastMove.length == 0) {
            return null;
        }
        return strArrNativeGetLastMove;
    }

    @Override // e0.InterfaceC0870c
    public boolean getPlayer() {
        return nativeGetPlayer(this.addr);
    }

    @Override // e0.InterfaceC0870c
    public String getPosition() {
        return nativeGetPosition(this.addr);
    }

    @Override // e0.InterfaceC0870c
    public String[] getPossibleMoves() {
        return nativeGetPossibleMoves(this.addr);
    }

    @Override // e0.InterfaceC0870c
    public String getStartPosition() {
        return nativeGetStartPosition(this.addr);
    }

    @Override // e0.InterfaceC0870c
    public InterfaceC0870c.a getState() {
        switch (nativeGetState(this.addr)) {
            case -1:
                return InterfaceC0870c.a.ENGINE_ANALISE;
            case 0:
                return InterfaceC0870c.a.PLAY;
            case 1:
                return InterfaceC0870c.a.WHITE_WIN;
            case 2:
                return InterfaceC0870c.a.BLACK_WIN;
            case 3:
            default:
                return InterfaceC0870c.a.DRAW;
            case 4:
                return InterfaceC0870c.a.X_WIN;
            case 5:
                return InterfaceC0870c.a.Y_WIN;
            case 6:
                return InterfaceC0870c.a.MIX_WIN;
            case 7:
                return InterfaceC0870c.a.Z_WIN;
            case 8:
                return InterfaceC0870c.a.V_WIN;
        }
    }

    @Override // e0.InterfaceC0870c
    public boolean makeMove(String str) {
        return nativeMakeMove(this.addr, str);
    }

    @Override // e0.InterfaceC0869b
    public /* bridge */ /* synthetic */ void quit() {
        AbstractC0868a.a(this);
    }

    @Override // e0.InterfaceC0870c
    public void resetGame() {
        nativeResetGame(this.addr);
    }

    public void setAllyMask(int i4) {
        nativeSetAllyMask(this.addr, i4);
    }

    public void setExtra(String str, String str2) {
        if (EXTRA_SCAN_EVAL.equals(str)) {
            setScanEval(this.addr, str2);
        }
    }

    @Override // e0.InterfaceC0870c
    public boolean setPosition(String str) {
        return nativeSetPosition(this.addr, str);
    }

    @Override // e0.InterfaceC0869b
    public boolean startAnalise() {
        return this.listener != null && nativeStartAnalise(this.addr);
    }

    @Override // e0.InterfaceC0870c
    public void stop() {
        nativeStop(this.addr);
    }

    @Override // e0.InterfaceC0870c
    public boolean undoMove() {
        return nativeUndoMove(this.addr);
    }

    public CppGame(int i4, int i5, int i6, InterfaceC0869b.a aVar) {
        this.listener = aVar;
        long jNativeInit = nativeInit(i4, i5, i6);
        this.addr = jNativeInit;
        Log.d(TAG, "init " + jNativeInit);
    }

    public static CppGame universal(int i4, CheckersParams checkersParams, InterfaceC0869b.a aVar) {
        return new CppGame(checkersParams, aVar, i4);
    }

    @Override // e0.InterfaceC0870c
    public String artificialIntelligence(long j4) {
        String strNativeAI2 = nativeAI2(this.addr, j4);
        if (strNativeAI2.isEmpty()) {
            return null;
        }
        return strNativeAI2;
    }

    private CppGame(CheckersParams checkersParams, InterfaceC0869b.a aVar, int i4) {
        this.listener = aVar;
        long jNativeInitUniversal = nativeInitUniversal(false, i4, checkersParams.getRows(), checkersParams.getColumns(), checkersParams.getMaxPieces(), checkersParams.getCells().getV(), checkersParams.cylinderValue(), checkersParams.getLayeredPiece(), checkersParams.getStartPosition(), checkersParams.getBlockedCells(), checkersParams.getCuts(), checkersParams.getSpinArray(), checkersParams.getPortalArray(), checkersParams.getPW(), checkersParams.getPB(), checkersParams.getPX(), checkersParams.getPY(), checkersParams.getFourPlayers(), checkersParams.getReverseColor(), checkersParams.getDraw3Repeat(), checkersParams.getDrawMoves(), checkersParams.getDoubleMove(), checkersParams.getWolfRule(), checkersParams.getManMoveMask(), checkersParams.getKingMoveMask(), checkersParams.getPawnCaptureMask(), checkersParams.getKingCaptureMask(), checkersParams.getKen(), checkersParams.getKenKong(), checkersParams.getSpinLimit(), checkersParams.getFlyingKing(), checkersParams.getCaptureMax(), checkersParams.getTurkCapture(), checkersParams.getTowerCapture(), checkersParams.getPawnCanCaptureKing(), checkersParams.getPawnPromotionInCapture(), checkersParams.getReverseCapture(), checkersParams.getKingOnlyStandsNextCellAfterCapture(), checkersParams.getGorgonCapture(), checkersParams.getKingCaptureInsteadPawn(), checkersParams.getKingCaptureFlyInversion(), checkersParams.getKiller(), checkersParams.getKingWeightInCapture(), checkersParams.captureSelfValue(), checkersParams.getStavropol(), checkersParams.getKingDemotionInsteadOfCapture(), checkersParams.getBreakthrough(), checkersParams.getLosing(), checkersParams.getIgnoreCapture(), checkersParams.getMonochorome());
        this.addr = jNativeInitUniversal;
        Log.d(TAG, "init " + jNativeInitUniversal);
    }

    private CppGame(HalmaParams halmaParams, int i4) {
        this.listener = null;
        long jNativeInitHalma = nativeInitHalma(i4, halmaParams.getSize(), halmaParams.getHeight(), halmaParams.getStart(), halmaParams.getDiagonal(), halmaParams.getOutMoves(), halmaParams.getFourPlayers(), halmaParams.lockArray());
        this.addr = jNativeInitHalma;
        Log.d(TAG, "init " + jNativeInitHalma);
    }
}