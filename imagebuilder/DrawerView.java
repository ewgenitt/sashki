package cab.shashki.app.ui.imagebuilder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import cab.shashki.app.ui.imagebuilder.DrawerView;
import g3.InterfaceC1016l;
import h3.m;
import j1.C1101i;
import java.io.File;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class DrawerView extends View {

    /* renamed from: b, reason: collision with root package name */
    private File f11717b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f11718c;

    /* renamed from: d, reason: collision with root package name */
    private float f11719d;

    /* renamed from: e, reason: collision with root package name */
    private int f11720e;

    /* renamed from: f, reason: collision with root package name */
    private int f11721f;

    /* renamed from: g, reason: collision with root package name */
    private int f11722g;

    /* renamed from: h, reason: collision with root package name */
    private int f11723h;

    /* renamed from: i, reason: collision with root package name */
    private int f11724i;

    /* renamed from: j, reason: collision with root package name */
    private int f11725j;

    /* renamed from: k, reason: collision with root package name */
    private float f11726k;

    /* renamed from: l, reason: collision with root package name */
    private int f11727l;

    /* renamed from: m, reason: collision with root package name */
    private final Rect f11728m;

    /* renamed from: n, reason: collision with root package name */
    private Picture f11729n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC1016l f11730o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        this.f11719d = 1.0f;
        this.f11726k = 100.0f;
        this.f11728m = new Rect(0, 0, 0, 0);
        b(context);
    }

    private final void b(Context context) {
        this.f11717b = context.getFilesDir();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(DrawerView drawerView, PointF pointF) {
        drawerView.setOffsets(pointF);
    }

    public final void c(Drawable drawable, float f4) {
        m.e(drawable, "image");
        this.f11719d = f4;
        this.f11718c = drawable;
        this.f11729n = null;
        postInvalidate();
    }

    public final Bitmap getBitmap() {
        int i4 = this.f11727l;
        int i5 = this.f11720e + this.f11724i;
        int i6 = this.f11721f + this.f11725j;
        float f4 = this.f11726k;
        float f5 = i4;
        float f6 = 100;
        int i7 = (int) ((f4 * f5) / f6);
        int i8 = (int) (((f4 * f5) * this.f11719d) / f6);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
        m.d(bitmapCreateBitmap, "createBitmap(...)");
        Drawable drawable = this.f11718c;
        if (drawable != null) {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(i5, i6, i7 + i5, i8 + i6);
            drawable.draw(canvas);
        }
        return bitmapCreateBitmap;
    }

    public final InterfaceC1016l getOffsetListener() {
        return this.f11730o;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        m.e(canvas, "canvas");
        int iMin = Math.min(getWidth(), getHeight());
        this.f11727l = iMin;
        Picture picture = this.f11729n;
        if (picture != null) {
            Rect rect = this.f11728m;
            rect.right = iMin;
            rect.bottom = iMin;
            canvas.drawPicture(picture, rect);
            return;
        }
        Drawable drawable = this.f11718c;
        if (drawable != null) {
            int width = getWidth();
            int width2 = (int) (getWidth() * this.f11719d);
            int i4 = this.f11720e + this.f11724i;
            int i5 = this.f11721f + this.f11725j;
            float f4 = this.f11726k;
            float f5 = 100;
            drawable.setBounds(i4, i5, ((int) ((width * f4) / f5)) + i4, ((int) ((f4 * width2) / f5)) + i5);
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m.e(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11720e = this.f11724i;
            this.f11721f = this.f11725j;
            this.f11722g = (int) motionEvent.getX();
            this.f11723h = (int) motionEvent.getY();
            this.f11724i = 0;
            this.f11725j = 0;
            return true;
        }
        if (action == 1) {
            this.f11720e = this.f11724i;
            this.f11721f = this.f11725j;
            this.f11724i = 0;
            this.f11725j = 0;
            InterfaceC1016l interfaceC1016l = this.f11730o;
            if (interfaceC1016l != null) {
                float f4 = this.f11720e;
                int i4 = this.f11727l;
                interfaceC1016l.o(new PointF(f4 / i4, this.f11721f / i4));
            }
        } else if (action == 2) {
            this.f11724i = ((int) motionEvent.getX()) - this.f11722g;
            this.f11725j = ((int) motionEvent.getY()) - this.f11723h;
            postInvalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setOffsetListener(InterfaceC1016l interfaceC1016l) {
        this.f11730o = interfaceC1016l;
    }

    public final void setOffsets(final PointF pointF) {
        m.e(pointF, "point");
        int i4 = this.f11727l;
        if (i4 == 0) {
            postDelayed(new Runnable() { // from class: J0.F0
                @Override // java.lang.Runnable
                public final void run() {
                    DrawerView.d(this.f1946d, pointF);
                }
            }, 250L);
            return;
        }
        this.f11720e = (int) (pointF.x * i4);
        this.f11721f = (int) (pointF.y * i4);
        postInvalidate();
    }

    public final void setScale(float f4) {
        this.f11726k = f4;
        postInvalidate();
    }

    public final void setSvg(C1101i c1101i) {
        m.e(c1101i, "svg");
        this.f11729n = c1101i.n();
        postInvalidate();
    }
}