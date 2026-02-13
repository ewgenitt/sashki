package cab.shashki.app.ui.chess.fairy.builder.quick;

import U2.E;
import U2.p;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import f0.AbstractC0917u;
import h3.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p3.n;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class BitBoardView extends View {

    /* renamed from: n, reason: collision with root package name */
    public static final b f11003n = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private p3.j f11004b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f11005c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f11006d;

    /* renamed from: e, reason: collision with root package name */
    private int f11007e;

    /* renamed from: f, reason: collision with root package name */
    private int f11008f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f11009g;

    /* renamed from: h, reason: collision with root package name */
    private a f11010h;

    /* renamed from: i, reason: collision with root package name */
    private String f11011i;

    /* renamed from: j, reason: collision with root package name */
    private long f11012j;

    /* renamed from: k, reason: collision with root package name */
    private float f11013k;

    /* renamed from: l, reason: collision with root package name */
    private float f11014l;

    /* renamed from: m, reason: collision with root package name */
    private float f11015m;

    public interface a {
        void a(boolean z4, String str);
    }

    public static final class b {
        public /* synthetic */ b(h3.h hVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitBoardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        this.f11004b = new p3.j("[a-l]\\d{1,2}");
        this.f11005c = new Paint();
        this.f11006d = new LinkedHashSet();
        this.f11007e = 8;
        this.f11008f = 8;
        this.f11011i = "-";
        this.f11013k = 1.0f;
        this.f11014l = 1.0f;
        this.f11015m = 1.0f;
        e(context);
    }

    private final void a(int i4, int i5) {
        int i6 = (this.f11008f - i5) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((char) (i4 + 97)) - 1));
        sb.append(i6);
        String string = sb.toString();
        if (this.f11006d.contains(string)) {
            this.f11006d.remove(string);
        } else {
            this.f11006d.add(string);
        }
        postInvalidate();
    }

    private final void b(int i4) {
        List listC = c((char) (((char) (i4 + 97)) - 1));
        if (this.f11006d.containsAll(listC)) {
            this.f11006d.removeAll(listC);
        } else {
            this.f11006d.addAll(listC);
        }
        postInvalidate();
    }

    private final List c(char c4) {
        m3.g gVar = new m3.g(1, this.f11008f);
        ArrayList arrayList = new ArrayList(p.o(gVar, 10));
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            int iA = ((E) it).a();
            StringBuilder sb = new StringBuilder();
            sb.append(c4);
            sb.append(iA);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    private final List d(int i4) {
        m3.g gVar = new m3.g(1, this.f11007e);
        ArrayList arrayList = new ArrayList(p.o(gVar, 10));
        Iterator it = gVar.iterator();
        while (it.hasNext()) {
            char cA = (char) (((char) (((E) it).a() + 97)) - 1);
            StringBuilder sb = new StringBuilder();
            sb.append(cA);
            sb.append(i4);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    private final void e(Context context) {
        this.f11005c.setColor(androidx.core.content.a.c(context, AbstractC0917u.f14627a));
        this.f11005c.setFlags(1);
        this.f11005c.setTextAlign(Paint.Align.CENTER);
    }

    private final boolean f(String str) throws NumberFormatException {
        if (str.charAt(0) - 'a' < this.f11007e) {
            int i4 = this.f11008f;
            String strSubstring = str.substring(1);
            m.d(strSubstring, "substring(...)");
            int i5 = Integer.parseInt(strSubstring);
            if (1 <= i5 && i5 <= i4) {
                return true;
            }
        }
        return false;
    }

    private final void g(int i4) {
        List listD = d((this.f11008f - i4) + 1);
        if (this.f11006d.containsAll(listD)) {
            this.f11006d.removeAll(listD);
        } else {
            this.f11006d.addAll(listD);
        }
        postInvalidate();
    }

    private final void h() {
        int size = this.f11006d.size();
        int i4 = this.f11007e;
        if (size == this.f11008f * i4) {
            this.f11006d.clear();
        } else {
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = this.f11008f;
                int i7 = 0;
                while (i7 < i6) {
                    Set set = this.f11006d;
                    i7++;
                    StringBuilder sb = new StringBuilder();
                    sb.append((char) (i5 + 97));
                    sb.append(i7);
                    set.add(sb.toString());
                }
            }
        }
        postInvalidate();
    }

    private final void j() {
        if (this.f11006d.isEmpty()) {
            setStr("-");
            return;
        }
        StringBuilder sb = new StringBuilder();
        Set setE0 = p.e0(this.f11006d);
        int i4 = this.f11008f;
        int i5 = 1;
        if (1 <= i4) {
            while (true) {
                List listD = d(i5);
                if (this.f11006d.containsAll(listD)) {
                    sb.append('*');
                    sb.append(i5);
                    sb.append(' ');
                    setE0.removeAll(listD);
                }
                if (i5 == i4) {
                    break;
                } else {
                    i5++;
                }
            }
        }
        if (this.f11006d.size() != this.f11008f * this.f11007e) {
            for (char c4 = 'a'; c4 < 'j'; c4 = (char) (c4 + 1)) {
                List listC = c(c4);
                if (this.f11006d.containsAll(listC)) {
                    sb.append(c4);
                    sb.append("* ");
                    setE0.removeAll(listC);
                }
            }
        }
        Iterator it = setE0.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(' ');
        }
        sb.deleteCharAt(n.H(sb));
        setStr(sb.toString());
    }

    private final void setStr(String str) {
        this.f11011i = str;
        a aVar = this.f11010h;
        if (aVar != null) {
            aVar.a(this.f11009g, str);
        }
        this.f11009g = false;
    }

    private final void setValue(String str) throws NumberFormatException {
        char cCharAt;
        this.f11006d.clear();
        for (String str2 : n.h0(str, new char[]{' '}, false, 0, 6, null)) {
            if (str2.charAt(0) == '*') {
                String strSubstring = str2.substring(1);
                m.d(strSubstring, "substring(...)");
                int i4 = Integer.parseInt(strSubstring);
                if (1 <= i4 && i4 <= this.f11008f) {
                    this.f11006d.addAll(d(i4));
                }
            } else if (str2.length() > 1 && str2.charAt(1) == '*' && 'a' <= (cCharAt = str2.charAt(0)) && cCharAt < 'j') {
                char cCharAt2 = str2.charAt(0);
                if (cCharAt2 - 'a' < this.f11007e) {
                    this.f11006d.addAll(c(cCharAt2));
                }
            } else if (this.f11004b.j(str2) && f(str2)) {
                this.f11006d.add(str2);
            }
        }
        j();
        postInvalidate();
    }

    public final String getValue() {
        return this.f11011i;
    }

    public final void i(int i4, int i5, String str, a aVar) throws NumberFormatException {
        m.e(str, "value");
        if (1 > i4 || i4 >= 13 || 1 > i5 || i5 >= 11) {
            return;
        }
        this.f11007e = i4;
        this.f11008f = i5;
        this.f11010h = aVar;
        setValue(str);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f4;
        Canvas canvas2 = canvas;
        m.e(canvas2, "canvas");
        super.onDraw(canvas);
        this.f11013k = Math.min((getWidth() - 2) / (this.f11007e + 1.0f), (getHeight() - 2) / (this.f11008f + 1.0f));
        this.f11014l = (getWidth() - (this.f11013k * (this.f11007e + 1))) * 0.5f;
        float height = getHeight();
        float f5 = this.f11013k;
        int i4 = this.f11008f;
        float f6 = (height - ((i4 + 1) * f5)) * 0.5f;
        this.f11015m = f6;
        float f7 = f5 * 0.5f;
        float f8 = f5 * 0.25f;
        float f9 = f5 * 0.375f;
        float f10 = f5 * this.f11007e;
        float f11 = this.f11014l + f5;
        float f12 = f6 + f5;
        float f13 = (i4 * f5) + f12;
        this.f11005c.setTextSize(0.75f * f7);
        int i5 = this.f11007e + 1;
        int i6 = 0;
        char c4 = 'A';
        while (i6 < i5) {
            int i7 = i6;
            float f14 = f13;
            float f15 = f12;
            float f16 = f11;
            canvas2.drawLine(f16, f15, f11, f14, this.f11005c);
            if (i7 < this.f11007e) {
                f4 = f16;
                canvas2.drawText(String.valueOf(c4), f16 + f7, f15 - f9, this.f11005c);
            } else {
                f4 = f16;
            }
            c4 = (char) (c4 + 1);
            i6 = i7 + 1;
            f11 = f4 + this.f11013k;
            f12 = f15;
            f13 = f14;
        }
        float f17 = f12;
        float f18 = this.f11014l + this.f11013k;
        float f19 = f18 + f10;
        int i8 = this.f11008f + 1;
        for (int i9 = 0; i9 < i8; i9++) {
            canvas2.drawLine(f18, f17, f19, f17, this.f11005c);
            if (i9 < this.f11008f) {
                canvas2.drawText(String.valueOf(i4), f18 - f7, (this.f11013k + f17) - f9, this.f11005c);
            }
            i4--;
            f17 += this.f11013k;
        }
        for (String str : this.f11006d) {
            float fCharAt = this.f11014l + (this.f11013k * (str.charAt(0) - '`')) + f8;
            float f20 = this.f11015m;
            float f21 = this.f11013k;
            int i10 = this.f11008f;
            m.d(str.substring(1), "substring(...)");
            float f22 = f20 + (f21 * ((i10 - Integer.parseInt(r2)) + 1)) + f8;
            canvas2.drawRect(fCharAt, f22, fCharAt + f7, f22 + f7, this.f11005c);
            canvas2 = canvas;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        m.e(motionEvent, "event");
        if (motionEvent.getAction() == 0) {
            this.f11012j = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1 && this.f11012j + 250 > System.currentTimeMillis()) {
            int x4 = (int) ((motionEvent.getX() - this.f11014l) / this.f11013k);
            int y4 = (int) ((motionEvent.getY() - this.f11015m) / this.f11013k);
            if (x4 >= 0 && y4 >= 0 && x4 <= this.f11007e && y4 <= this.f11008f) {
                this.f11009g = true;
                if (x4 == 0 && y4 == 0) {
                    h();
                } else if (x4 == 0) {
                    g(y4);
                } else if (y4 == 0) {
                    b(x4);
                } else {
                    a(x4, y4);
                }
                j();
            }
        }
        return true;
    }
}