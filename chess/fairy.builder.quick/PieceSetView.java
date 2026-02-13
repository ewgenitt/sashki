package cab.shashki.app.ui.chess.fairy.builder.quick;

import U2.p;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import f0.AbstractC0917u;
import h3.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3.n;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class PieceSetView extends View {

    /* renamed from: b, reason: collision with root package name */
    private final List f11038b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f11039c;

    /* renamed from: d, reason: collision with root package name */
    private String f11040d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f11041e;

    /* renamed from: f, reason: collision with root package name */
    private a f11042f;

    /* renamed from: g, reason: collision with root package name */
    private String f11043g;

    /* renamed from: h, reason: collision with root package name */
    private int f11044h;

    /* renamed from: i, reason: collision with root package name */
    private int f11045i;

    /* renamed from: j, reason: collision with root package name */
    private float f11046j;

    /* renamed from: k, reason: collision with root package name */
    private float f11047k;

    public interface a {
        void a(String str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PieceSetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        this.f11038b = new ArrayList();
        this.f11039c = new Paint();
        this.f11040d = "bnrq";
        this.f11043g = "-";
        this.f11044h = 4;
        this.f11045i = 1;
        this.f11046j = 1.0f;
        this.f11047k = 1.0f;
        a(context);
    }

    private final void a(Context context) {
        this.f11039c.setColor(androidx.core.content.a.c(context, AbstractC0917u.f14627a));
        this.f11039c.setFlags(1);
        this.f11039c.setTextAlign(Paint.Align.CENTER);
    }

    private final void b(char c4) {
        if (this.f11038b.contains(Character.valueOf(c4))) {
            this.f11038b.remove(Character.valueOf(c4));
        } else if (!this.f11041e || this.f11038b.isEmpty()) {
            this.f11038b.add(Character.valueOf(c4));
        } else {
            this.f11038b.set(0, Character.valueOf(c4));
        }
        d(true);
    }

    private final void d(boolean z4) {
        a aVar;
        if (this.f11038b.isEmpty()) {
            this.f11043g = "-";
        } else if (this.f11038b.size() != this.f11040d.length() || this.f11038b.size() <= 1) {
            StringBuilder sb = new StringBuilder();
            Iterator it = p.W(this.f11038b).iterator();
            while (it.hasNext()) {
                sb.append(((Character) it.next()).charValue());
            }
            this.f11043g = sb.toString();
        } else {
            this.f11043g = "*";
        }
        if (z4 && (aVar = this.f11042f) != null) {
            aVar.a(this.f11043g);
        }
        postInvalidate();
    }

    public final void c(String str, String str2, boolean z4, a aVar) throws IOException {
        m.e(str, "data");
        m.e(str2, "value");
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i4 = 0; i4 < length; i4++) {
            char cCharAt = str.charAt(i4);
            if ('a' <= cCharAt && cCharAt < '{') {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        m.d(string, "toString(...)");
        String strN = p.N(p.W(n.H0(string)), "", z4 ? "*" : "", null, 0, null, null, 60, null);
        this.f11040d = strN;
        this.f11041e = z4;
        this.f11042f = aVar;
        this.f11045i = strN.length() > 8 ? 2 : 1;
        setValue(str2);
    }

    public final String getValue() {
        return this.f11043g;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        m.e(canvas, "canvas");
        super.onDraw(canvas);
        int height = getHeight();
        int i4 = this.f11045i;
        int i5 = height / (i4 + 1);
        this.f11044h = i4 == 1 ? this.f11040d.length() : (this.f11040d.length() + 1) >> 1;
        this.f11046j = (getWidth() - 2.0f) / this.f11044h;
        float width = getWidth();
        float f4 = this.f11046j;
        float f5 = (width - (this.f11044h * f4)) * 0.5f;
        this.f11047k = f5;
        float f6 = f4 * 0.5f;
        float f7 = f5 + f6;
        float f8 = i5;
        this.f11039c.setTextSize(Math.min(f6, f8 * 0.75f) * 0.75f);
        int i6 = this.f11044h;
        for (int i7 = 0; i7 < i6; i7++) {
            char cCharAt = this.f11040d.charAt(i7);
            this.f11039c.setTypeface(this.f11038b.contains(Character.valueOf(cCharAt)) ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            canvas.drawText(String.valueOf(cCharAt), f7, f8, this.f11039c);
            f7 += this.f11046j;
        }
        float f9 = this.f11047k + f6;
        float f10 = f8 * 2.0f;
        int length = this.f11040d.length() - this.f11044h;
        for (int i8 = 0; i8 < length; i8++) {
            char cCharAt2 = this.f11040d.charAt(this.f11044h + i8);
            this.f11039c.setTypeface(this.f11038b.contains(Character.valueOf(cCharAt2)) ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            canvas.drawText(String.valueOf(cCharAt2), f9, f10, this.f11039c);
            f9 += this.f11046j;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m.e(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            int x4 = (this.f11044h * ((this.f11045i <= 1 || motionEvent.getY() <= ((float) (getHeight() >> 1))) ? 0 : 1)) + ((int) ((motionEvent.getX() - this.f11047k) / this.f11046j));
            if (x4 < this.f11040d.length()) {
                b(this.f11040d.charAt(x4));
            }
        }
        return true;
    }

    public final void setValue(String str) {
        m.e(str, "value");
        this.f11038b.clear();
        if (!m.a(str, "*") || this.f11041e) {
            char[] charArray = str.toCharArray();
            m.d(charArray, "toCharArray(...)");
            List list = this.f11038b;
            for (char c4 : charArray) {
                if (n.B(this.f11040d, c4, false, 2, null)) {
                    list.add(Character.valueOf(c4));
                }
            }
        } else {
            this.f11038b.addAll(n.F0(this.f11040d));
        }
        if (this.f11041e && this.f11038b.size() > 1) {
            Character ch = (Character) this.f11038b.get(0);
            ch.charValue();
            this.f11038b.clear();
            this.f11038b.add(ch);
        }
        d(false);
    }
}