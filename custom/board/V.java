package cab.shashki.app.ui.custom.board;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public abstract class V extends O implements SurfaceHolder.Callback {

    /* renamed from: t, reason: collision with root package name */
    private boolean f11427t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f11428u;

    /* renamed from: v, reason: collision with root package name */
    private final ExecutorService f11429v;

    /* renamed from: w, reason: collision with root package name */
    private final SurfaceHolder f11430w;

    /* renamed from: x, reason: collision with root package name */
    private final Rect f11431x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f11432y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        h3.m.e(context, "context");
        h3.m.e(attributeSet, "attrs");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f11429v = executorServiceNewSingleThreadExecutor;
        this.f11431x = new Rect();
        SurfaceView surfaceView = new SurfaceView(context);
        addView(surfaceView);
        SurfaceHolder holder = surfaceView.getHolder();
        this.f11430w = holder;
        holder.addCallback(this);
        executorServiceNewSingleThreadExecutor.submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.Q
            @Override // java.lang.Runnable
            public final void run() {
                V.t();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(final V v4) {
        if (!v4.f11432y || v4.getViewSize() == v4.getSize()) {
            return;
        }
        v4.setSize(v4.getViewSize());
        v4.c();
        v4.f11430w.setFixedSize(v4.getSize(), v4.getSize());
        v4.l(v4.getWidth(), v4.getHeight());
        v4.f11429v.submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.U
            @Override // java.lang.Runnable
            public final void run() {
                V.C(this.f11426d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(V v4) {
        v4.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(V v4) {
        v4.setSize(v4.getViewSize());
        v4.c();
        v4.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(V v4) {
        v4.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t() {
        Thread.currentThread().setName("board:executor");
    }

    private final void v(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            u(canvas);
        } finally {
            this.f11430w.unlockCanvasAndPost(canvas);
        }
    }

    protected abstract void A();

    protected final void finalize() {
        this.f11429v.shutdown();
    }

    protected final ExecutorService getExecutor() {
        return this.f11429v;
    }

    protected final boolean getFix() {
        return this.f11427t;
    }

    protected final boolean getRotateAll() {
        return this.f11428u;
    }

    @Override // cab.shashki.app.ui.custom.board.O
    protected void k() {
        if (this.f11427t) {
            postDelayed(new Runnable() { // from class: cab.shashki.app.ui.custom.board.S
                @Override // java.lang.Runnable
                public final void run() {
                    V.B(this.f11418d);
                }
            }, 500L);
        } else {
            this.f11429v.submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.T
                @Override // java.lang.Runnable
                public final void run() {
                    V.D(this.f11425d);
                }
            });
        }
    }

    protected final void setFix(boolean z4) {
        this.f11427t = z4;
    }

    protected final void setRotateAll(boolean z4) {
        this.f11428u = z4;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        h3.m.e(surfaceHolder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        h3.m.e(surfaceHolder, "holder");
        if (this.f11427t) {
            surfaceHolder.setFixedSize(getSize(), getSize());
        }
        y();
        this.f11432y = true;
        this.f11429v.submit(new Runnable() { // from class: cab.shashki.app.ui.custom.board.P
            @Override // java.lang.Runnable
            public final void run() {
                V.E(this.f11417d);
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        h3.m.e(surfaceHolder, "holder");
        z();
        this.f11432y = false;
    }

    protected abstract void u(Canvas canvas);

    protected final void w() {
        if (this.f11432y) {
            v(this.f11430w.lockCanvas());
        }
    }

    protected final void x(int i4, int i5, int i6, int i7) {
        if (this.f11432y) {
            if (this.f11428u) {
                this.f11431x.left = getSize() - i6;
                this.f11431x.top = getSize() - i7;
                this.f11431x.bottom = getSize() - i5;
                this.f11431x.right = getSize() - i4;
            } else {
                Rect rect = this.f11431x;
                rect.left = i4;
                rect.top = i5;
                rect.bottom = i7;
                rect.right = i6;
            }
            v(this.f11430w.lockCanvas(this.f11431x));
        }
    }

    protected abstract void y();

    protected abstract void z();
}