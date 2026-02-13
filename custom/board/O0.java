package cab.shashki.app.ui.custom.board;

import M0.A1;
import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import cab.shashki.app.ui.custom.board.C0843z;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public abstract class O0 extends s0 {

    /* renamed from: A0 */
    private boolean f11410A0;

    /* renamed from: B0 */
    private boolean f11411B0;

    /* renamed from: C0 */
    private int f11412C0;

    /* renamed from: D0 */
    private int f11413D0;

    /* renamed from: E0 */
    private long f11414E0;

    /* renamed from: F0 */
    private boolean f11415F0;

    /* renamed from: G0 */
    private final View.OnTouchListener f11416G0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        h3.m.e(context, "context");
        h3.m.e(attributeSet, "attrs");
        this.f11411B0 = true;
        this.f11416G0 = new View.OnTouchListener() { // from class: cab.shashki.app.ui.custom.board.E0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return O0.o2(this.f11317b, view, motionEvent);
            }
        };
        this.f11410A0 = true;
    }

    private final void d2(final int i4, final int i5) {
        String strB;
        Character chB0;
        String string;
        C0843z.j[] pieces = getPieces();
        int length = pieces.length;
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                break;
            }
            C0843z.j jVar = pieces[i6];
            if (!jVar.f() || Math.abs(i4 - ((PointF) jVar).x) >= getPieceRadius() || Math.abs(i5 - ((PointF) jVar).y) >= getPieceRadius()) {
                i6++;
            } else if (getAddPieceMode() == -1) {
                jVar.k(false);
                setAmountOfPieces(getAmountOfPieces() - 1);
                if (getSupportCount()) {
                    getCounter().remove(jVar.getPosition());
                }
                final int i7 = (int) ((PointF) jVar).x;
                final int i8 = (int) ((PointF) jVar).y;
                final int iMax = Math.max(getCellSizeX(), getPieceRadius());
                getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.J0
                    @Override // java.lang.Runnable
                    public final void run() {
                        O0.e2(this.f11326d, i7, iMax, i8);
                    }
                });
            } else {
                setMovedPiece(jVar);
                getStartPlace().set(jVar);
                if (getAddPieceMode() == -2) {
                    n2(jVar);
                }
            }
        }
        if (getAddPieceMode() < 0 || !(getMovedPiece() == null || (getCollection() instanceof o0.u))) {
            if (getMovedPiece() == null) {
                m2(j(i4, i5));
                return;
            }
            if (getAddPieceMode() < 0 || getMode().p() != 10) {
                return;
            }
            C0843z.j movedPiece = getMovedPiece();
            if (movedPiece != null) {
                movedPiece.j(getAddPieceMode());
            }
            getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.L0
                @Override // java.lang.Runnable
                public final void run() {
                    O0.g2(this.f11336d, i4, i5);
                }
            });
            return;
        }
        if (Math.abs(i4 - (getSize() / 2)) >= getBorder() || Math.abs(i5 - (getSize() / 2)) >= getBorder()) {
            return;
        }
        o0.s collection = getCollection();
        String strF = null;
        o0.u uVar = collection instanceof o0.u ? (o0.u) collection : null;
        if (uVar == null || (strB = uVar.b()) == null || (chB0 = p3.n.B0(strB, getAddPieceMode())) == null || (string = chB0.toString()) == null) {
            o0.s collection2 = getCollection();
            A1 a12 = collection2 instanceof A1 ? (A1) collection2 : null;
            if (a12 != null) {
                strF = a12.f(getAddPieceMode());
            }
        } else {
            strF = string;
        }
        f1(j(i4, i5), getAddPieceMode(), strF, getSupportCount());
        final int iMax2 = Math.max(getCellSizeX(), getPieceRadius()) << 1;
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.K0
            @Override // java.lang.Runnable
            public final void run() {
                O0.f2(this.f11331d, i4, iMax2, i5);
            }
        });
    }

    public static final void e2(O0 o02, int i4, int i5, int i6) {
        o02.x(i4 - i5, i6 - i5, i4 + i5, i6 + i5);
    }

    public static final void f2(O0 o02, int i4, int i5, int i6) {
        o02.x(i4 - i5, i6 - i5, i4 + i5, i6 + i5);
    }

    public static final void g2(O0 o02, int i4, int i5) {
        o02.x(i4 - o02.getCellSizeX(), i5 - o02.getCellSizeX(), i4 + o02.getCellSizeX(), i5 + o02.getCellSizeX());
    }

    private final void h2() {
        int pieceRadius;
        int pieceRadius2;
        C0843z.j movedPiece = getMovedPiece();
        if (movedPiece == null) {
            return;
        }
        synchronized (this) {
            pieceRadius = this.f11412C0;
            pieceRadius2 = this.f11413D0;
            this.f11415F0 = false;
            T2.u uVar = T2.u.f3817a;
        }
        if (getAddPieceMode() >= 0 && (Math.abs(pieceRadius - (getSize() / 2)) > getBorder() || Math.abs(pieceRadius2 - (getSize() / 2)) > getBorder())) {
            movedPiece.k(false);
            setMovedPiece(null);
            setAmountOfPieces(getAmountOfPieces() - 1);
            getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.M0
                @Override // java.lang.Runnable
                public final void run() {
                    O0.i2(this.f11340d);
                }
            });
            return;
        }
        if (pieceRadius > getSize() - getPieceRadius()) {
            pieceRadius = getSize() - getPieceRadius();
        } else if (pieceRadius < getPieceRadius()) {
            pieceRadius = getPieceRadius();
        }
        if (pieceRadius2 > getSize() - getPieceRadius()) {
            pieceRadius2 = getSize() - getPieceRadius();
        } else if (pieceRadius2 < getPieceRadius()) {
            pieceRadius2 = getPieceRadius();
        }
        o0.s collection = getCollection();
        int halfCellY = (collection == null || !collection.e()) ? getHalfCellY() : getCellSizeY();
        int iMax = Math.max(getHalfCellX(), getPieceRadius());
        float f4 = pieceRadius;
        final int iMin = ((int) Math.min(f4, ((PointF) movedPiece).x)) - iMax;
        float f5 = pieceRadius2;
        final int iMin2 = (((int) Math.min(f5, ((PointF) movedPiece).y)) - halfCellY) - getCellSizeY();
        final int iMax2 = ((int) Math.max(f4, ((PointF) movedPiece).x)) + iMax;
        final int iMax3 = ((int) Math.max(f5, ((PointF) movedPiece).y)) + halfCellY;
        movedPiece.set(f4, f5);
        this.f11414E0 = System.currentTimeMillis();
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.N0
            @Override // java.lang.Runnable
            public final void run() {
                O0.j2(this.f11387d, iMin, iMin2, iMax2, iMax3);
            }
        });
    }

    public static final void i2(O0 o02) {
        o02.w();
    }

    public static final void j2(O0 o02, int i4, int i5, int i6, int i7) {
        o02.x(i4, i5, i6, i7);
    }

    private final void k2(int i4, int i5) {
        C0843z.j movedPiece = getMovedPiece();
        if (movedPiece == null) {
            return;
        }
        if (i4 > getSize() - getPieceRadius()) {
            i4 = getSize() - getPieceRadius();
        } else if (i4 < getPieceRadius()) {
            i4 = getPieceRadius();
        }
        if (i5 > getSize() - getPieceRadius()) {
            i5 = getSize() - getPieceRadius();
        } else if (i5 < getPieceRadius()) {
            i5 = getPieceRadius();
        }
        String position = movedPiece.getPosition();
        String strJ = j(i4, i5);
        if (c2(position, strJ)) {
            movedPiece.set(getStartPlace());
        } else {
            if (!h3.m.a(position, strJ)) {
                o1(strJ);
            }
            movedPiece.i(strJ);
            if (this.f11411B0) {
                movedPiece.set(i(strJ));
            }
            R1();
        }
        getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.I0
            @Override // java.lang.Runnable
            public final void run() {
                O0.l2(this.f11324d);
            }
        });
        setMovedPiece(null);
    }

    public static final void l2(O0 o02) {
        o02.w();
    }

    public static final boolean o2(O0 o02, View view, MotionEvent motionEvent) {
        if (!o02.f11410A0) {
            if (motionEvent.getAction() == 1) {
                o02.performClick();
            }
            return false;
        }
        final Point point = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
        if (o02.getRotateAll()) {
            point.set((int) (o02.getSize() - motionEvent.getX()), (int) (o02.getSize() - motionEvent.getY()));
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            o02.getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.H0
                @Override // java.lang.Runnable
                public final void run() {
                    O0.r2(this.f11321d, point);
                }
            });
            return true;
        }
        if (action == 1) {
            o02.getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.G0
                @Override // java.lang.Runnable
                public final void run() {
                    O0.q2(this.f11319d, point);
                }
            });
            return true;
        }
        if (action != 2) {
            return false;
        }
        synchronized (o02) {
            try {
                o02.f11412C0 = point.x;
                o02.f11413D0 = point.y;
                if (o02.f11415F0) {
                    o02.f11415F0 = System.currentTimeMillis() < o02.f11414E0 + ((long) 512);
                    T2.u uVar = T2.u.f3817a;
                } else {
                    o02.f11415F0 = true;
                    o02.getExecutor().submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.F0
                        @Override // java.lang.Runnable
                        public final void run() {
                            O0.p2(this.f11318d);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public static final void p2(O0 o02) {
        o02.h2();
    }

    public static final void q2(O0 o02, Point point) {
        o02.k2(point.x, point.y);
    }

    public static final void r2(O0 o02, Point point) {
        o02.d2(point.x, point.y);
    }

    protected abstract boolean c2(String str, String str2);

    protected final boolean getAutoFix() {
        return this.f11411B0;
    }

    public final boolean getTouchControl() {
        return this.f11410A0;
    }

    protected abstract void m2(String str);

    protected abstract void n2(C0843z.i iVar);

    protected final void setAutoFix(boolean z4) {
        this.f11411B0 = z4;
    }

    public final void setTouchControl(boolean z4) {
        this.f11410A0 = z4;
    }

    @Override // cab.shashki.app.ui.custom.board.V
    protected void y() {
        getChildAt(0).setOnTouchListener(this.f11416G0);
    }

    @Override // cab.shashki.app.ui.custom.board.V
    protected void z() {
        getChildAt(0).setOnTouchListener(null);
    }
}