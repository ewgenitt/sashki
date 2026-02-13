package cab.shashki.app.ui.chess.fairy.builder.quick;

import U2.p;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import f0.AbstractC0917u;
import h3.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p3.n;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class FenView extends View {

    /* renamed from: s, reason: collision with root package name */
    public static final b f11020s = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private final Paint f11021b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f11022c;

    /* renamed from: d, reason: collision with root package name */
    private int f11023d;

    /* renamed from: e, reason: collision with root package name */
    private int f11024e;

    /* renamed from: f, reason: collision with root package name */
    private String f11025f;

    /* renamed from: g, reason: collision with root package name */
    private String f11026g;

    /* renamed from: h, reason: collision with root package name */
    private String f11027h;

    /* renamed from: i, reason: collision with root package name */
    private a f11028i;

    /* renamed from: j, reason: collision with root package name */
    private char f11029j;

    /* renamed from: k, reason: collision with root package name */
    private float f11030k;

    /* renamed from: l, reason: collision with root package name */
    private float f11031l;

    /* renamed from: m, reason: collision with root package name */
    private float f11032m;

    /* renamed from: n, reason: collision with root package name */
    private float f11033n;

    /* renamed from: o, reason: collision with root package name */
    private long f11034o;

    /* renamed from: p, reason: collision with root package name */
    private int f11035p;

    /* renamed from: q, reason: collision with root package name */
    private int f11036q;

    /* renamed from: r, reason: collision with root package name */
    private int f11037r;

    public interface a {
        void a(String str);
    }

    public static final class b {
        public /* synthetic */ b(h3.h hVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return W2.a.d(Integer.valueOf(((Point) ((Map.Entry) obj).getKey()).x), Integer.valueOf(((Point) ((Map.Entry) obj2).getKey()).x));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        this.f11021b = new Paint();
        this.f11022c = new LinkedHashMap();
        this.f11023d = 8;
        this.f11024e = 8;
        this.f11025f = "-";
        this.f11026g = "";
        this.f11027h = "";
        this.f11029j = '-';
        this.f11030k = 1.0f;
        this.f11031l = 1.0f;
        this.f11032m = 1.0f;
        this.f11033n = 1.0f;
        this.f11035p = -16777216;
        this.f11036q = -7829368;
        this.f11037r = -7829368;
        a(context);
    }

    private final void a(Context context) {
        this.f11035p = androidx.core.content.a.c(context, AbstractC0917u.f14632f);
        this.f11036q = androidx.core.content.a.c(context, AbstractC0917u.f14627a);
        this.f11021b.setTextAlign(Paint.Align.CENTER);
        this.f11021b.setFlags(1);
        setValue("rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1");
    }

    private final void c() {
        Set setEntrySet = this.f11022c.entrySet();
        StringBuilder sb = new StringBuilder();
        int i4 = this.f11024e;
        for (int i5 = 0; i5 < i4; i5++) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : setEntrySet) {
                if (((Point) ((Map.Entry) obj).getKey()).y == i5) {
                    arrayList.add(obj);
                }
            }
            int i6 = 0;
            for (Map.Entry entry : p.X(arrayList, new c())) {
                if (i6 < ((Point) entry.getKey()).x) {
                    sb.append(((Point) entry.getKey()).x - i6);
                }
                sb.append(((Character) entry.getValue()).charValue());
                i6 = ((Point) entry.getKey()).x + 1;
            }
            int i7 = this.f11023d;
            if (i6 < i7) {
                sb.append(i7 - i6);
            }
            sb.append('/');
        }
        sb.deleteCharAt(n.H(sb));
        this.f11026g = sb.toString();
        a aVar = this.f11028i;
        if (aVar != null) {
            aVar.a(getValue());
        }
    }

    public final void b(int i4, int i5, String str, String str2, a aVar) throws IOException {
        m.e(str, "map");
        m.e(str2, "fen");
        if (1 > i4 || i4 >= 13 || 1 > i5 || i5 >= 11) {
            return;
        }
        this.f11023d = i4;
        this.f11024e = i5;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i6 = 0; i6 < length; i6++) {
            char cCharAt = str.charAt(i6);
            if ('a' <= cCharAt && cCharAt < '{') {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        m.d(string, "toString(...)");
        this.f11025f = "-" + string;
        this.f11028i = aVar;
        if (!n.B(str, this.f11029j, false, 2, null)) {
            this.f11029j = '-';
        }
        setValue(str2);
    }

    public final String getValue() {
        return this.f11026g + this.f11027h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        m.e(canvas, "canvas");
        super.onDraw(canvas);
        this.f11031l = getWidth() / this.f11025f.length();
        this.f11030k = Math.min((getWidth() - 2.0f) / this.f11023d, (getHeight() - 2.0f) / (this.f11024e + 2));
        this.f11032m = (getWidth() - (this.f11030k * this.f11023d)) * 0.5f;
        float height = getHeight();
        float f4 = this.f11030k;
        int i4 = this.f11024e;
        float f5 = (height - ((i4 + 2) * f4)) * 0.5f;
        this.f11033n = f5;
        float f6 = f4 * 0.5f;
        float f7 = f4 * 0.375f;
        float f8 = f4 * this.f11023d;
        float f9 = this.f11032m;
        float f10 = f5 + f4;
        float f11 = (i4 * f4) + f10;
        float f12 = f11 + (f4 * 0.25f);
        this.f11021b.setTypeface(Typeface.DEFAULT);
        this.f11021b.setColor(this.f11035p);
        this.f11021b.setTextSize(this.f11030k * 0.22f);
        int i5 = this.f11023d + 1;
        int i6 = 0;
        char c4 = 'A';
        while (i6 < i5) {
            int i7 = i6;
            float f13 = f10;
            float f14 = f9;
            float f15 = f11;
            canvas.drawLine(f14, f13, f14, f15, this.f11021b);
            if (i7 < this.f11023d) {
                canvas.drawText(String.valueOf(c4), f14 + f6, f12, this.f11021b);
            }
            c4 = (char) (c4 + 1);
            f11 = f15;
            f9 = f14 + this.f11030k;
            f10 = f13;
            i6 = i7 + 1;
        }
        float f16 = f10;
        float f17 = this.f11032m;
        float f18 = f17 + f8;
        float f19 = f17 + (this.f11030k * 0.08f);
        int i8 = this.f11024e + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            canvas.drawLine(f17, f16, f18, f16, this.f11021b);
            if (i9 < this.f11024e) {
                canvas.drawText(String.valueOf(i4), f19, (this.f11030k + f16) - f7, this.f11021b);
            }
            i4--;
            f16 += this.f11030k;
        }
        float f20 = this.f11032m + f6;
        float f21 = this.f11033n;
        float f22 = this.f11030k;
        float f23 = f21 + f22 + f6 + (f6 * 0.5f);
        this.f11021b.setTextSize(f22 * 0.75f);
        for (Map.Entry entry : this.f11022c.entrySet()) {
            Point point = (Point) entry.getKey();
            this.f11021b.setColor(n.B(this.f11025f, Character.toLowerCase(((Character) entry.getValue()).charValue()), false, 2, null) ? this.f11036q : this.f11037r);
            String strValueOf = String.valueOf(((Character) entry.getValue()).charValue());
            float f24 = this.f11030k;
            canvas.drawText(strValueOf, (point.x * f24) + f20, (f24 * point.y) + f23, this.f11021b);
        }
        float f25 = this.f11031l * 0.5f;
        float f26 = this.f11030k;
        float f27 = f23 - f26;
        float f28 = f26 * (this.f11024e + 1);
        this.f11021b.setColor(this.f11036q);
        this.f11021b.setTextSize(f6);
        String str = this.f11025f;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            this.f11021b.setTypeface(cCharAt == this.f11029j ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            canvas.drawText(String.valueOf(cCharAt), f25, f27, this.f11021b);
            this.f11021b.setTypeface(Character.toUpperCase(cCharAt) == this.f11029j ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            String strValueOf2 = String.valueOf(cCharAt);
            m.c(strValueOf2, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf2.toUpperCase(Locale.ROOT);
            m.d(upperCase, "toUpperCase(...)");
            canvas.drawText(upperCase, f25, f27 + f28, this.f11021b);
            f25 += this.f11031l;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m.e(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            this.f11034o = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1 && this.f11034o + 250 > System.currentTimeMillis()) {
            if (motionEvent.getY() < this.f11033n + this.f11030k) {
                this.f11029j = this.f11025f.charAt((int) (motionEvent.getX() / this.f11031l));
            } else if (motionEvent.getY() > this.f11033n + (this.f11030k * (this.f11024e + 1))) {
                this.f11029j = Character.toUpperCase(this.f11025f.charAt((int) (motionEvent.getX() / this.f11031l)));
            } else {
                int x4 = (int) ((motionEvent.getX() - this.f11032m) / this.f11030k);
                float y4 = motionEvent.getY() - this.f11033n;
                float f4 = this.f11030k;
                int i4 = (int) ((y4 - f4) / f4);
                if (x4 >= 0 && x4 < this.f11023d && i4 >= 0 && i4 < this.f11024e) {
                    Point point = new Point(x4, i4);
                    char c4 = this.f11029j;
                    if (c4 == '-') {
                        this.f11022c.remove(point);
                    } else {
                        this.f11022c.put(point, Character.valueOf(c4));
                    }
                    c();
                }
            }
            postInvalidate();
        }
        return true;
    }

    public final void setValue(String str) {
        m.e(str, "fen");
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            char cCharAt = str.charAt(i4);
            if (cCharAt == ' ' || cCharAt == '[') {
                break;
            } else {
                i4++;
            }
        }
        if (i4 < 0) {
            this.f11026g = str;
            this.f11027h = "";
        } else {
            String strSubstring = str.substring(0, i4);
            m.d(strSubstring, "substring(...)");
            this.f11026g = strSubstring;
            String strSubstring2 = str.substring(i4);
            m.d(strSubstring2, "substring(...)");
            this.f11027h = strSubstring2;
        }
        this.f11022c.clear();
        String str2 = this.f11026g;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < str2.length(); i8++) {
            char cCharAt2 = str2.charAt(i8);
            if ('0' > cCharAt2 || cCharAt2 >= ':') {
                if (cCharAt2 == '/') {
                    i6++;
                    i5 = 0;
                    i7 = 0;
                } else {
                    if (i5 != 0) {
                        i7 += i5;
                        i5 = 0;
                    }
                    if (i7 < this.f11023d && i6 < this.f11024e) {
                        this.f11022c.put(new Point(i7, i6), Character.valueOf(cCharAt2));
                    }
                    i7++;
                }
            } else if (i5 == 0) {
                i5 = cCharAt2 - '0';
            } else {
                i7 += (i5 * 10) + (cCharAt2 - '0');
                i5 = 0;
            }
        }
        postInvalidate();
    }
}