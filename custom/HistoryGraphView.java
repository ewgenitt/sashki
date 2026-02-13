package cab.shashki.app.ui.custom;

import U2.p;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import cab.shashki.app.ShashkiApp;
import e0.InterfaceC0870c;
import f0.AbstractC0917u;
import g3.InterfaceC1020p;
import h3.h;
import h3.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p3.n;
import q0.C1290n;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class HistoryGraphView extends View {

    /* renamed from: y, reason: collision with root package name */
    public static final b f11266y = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private final List f11267b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f11268c;

    /* renamed from: d, reason: collision with root package name */
    private final Paint f11269d;

    /* renamed from: e, reason: collision with root package name */
    private final Paint f11270e;

    /* renamed from: f, reason: collision with root package name */
    private final Path f11271f;

    /* renamed from: g, reason: collision with root package name */
    private final PointF f11272g;

    /* renamed from: h, reason: collision with root package name */
    private final PointF f11273h;

    /* renamed from: i, reason: collision with root package name */
    private final PointF f11274i;

    /* renamed from: j, reason: collision with root package name */
    private final PointF f11275j;

    /* renamed from: k, reason: collision with root package name */
    private final StringBuilder f11276k;

    /* renamed from: l, reason: collision with root package name */
    private BoardPreview f11277l;

    /* renamed from: m, reason: collision with root package name */
    private ScaleGestureDetector f11278m;

    /* renamed from: n, reason: collision with root package name */
    private cab.shashki.app.db.entities.a f11279n;

    /* renamed from: o, reason: collision with root package name */
    private InterfaceC1020p f11280o;

    /* renamed from: p, reason: collision with root package name */
    private int f11281p;

    /* renamed from: q, reason: collision with root package name */
    private float f11282q;

    /* renamed from: r, reason: collision with root package name */
    private int f11283r;

    /* renamed from: s, reason: collision with root package name */
    private float f11284s;

    /* renamed from: t, reason: collision with root package name */
    private float f11285t;

    /* renamed from: u, reason: collision with root package name */
    private float f11286u;

    /* renamed from: v, reason: collision with root package name */
    private float f11287v;

    /* renamed from: w, reason: collision with root package name */
    private long f11288w;

    /* renamed from: x, reason: collision with root package name */
    private int f11289x;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C1290n.a f11290a;

        /* renamed from: b, reason: collision with root package name */
        private c f11291b;

        public a(C1290n.a aVar, c cVar) {
            m.e(aVar, "branch");
            this.f11290a = aVar;
            this.f11291b = cVar;
        }

        public final C1290n.a a() {
            return this.f11290a;
        }

        public final c b() {
            return this.f11291b;
        }

        public final void c(c cVar) {
            this.f11291b = cVar;
        }

        public /* synthetic */ a(C1290n.a aVar, c cVar, int i4, h hVar) {
            this(aVar, (i4 & 2) != 0 ? null : cVar);
        }
    }

    public static final class b {

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return W2.a.d(Integer.valueOf(((C1290n.a) obj).e()), Integer.valueOf(((C1290n.a) obj2).e()));
            }
        }

        public /* synthetic */ b(h hVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
        /* JADX WARN: Type inference failed for: r9v0, types: [cab.shashki.app.ui.custom.HistoryGraphView$c, h3.h] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void a(q0.C1290n r27, e0.InterfaceC0870c r28, int r29, q0.C1290n.a r30, cab.shashki.app.ui.custom.HistoryGraphView.c r31, java.util.List r32) {
            /*
                Method dump skipped, instructions count: 560
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cab.shashki.app.ui.custom.HistoryGraphView.b.a(q0.n, e0.c, int, q0.n$a, cab.shashki.app.ui.custom.HistoryGraphView$c, java.util.List):void");
        }

        private final void b(C1290n c1290n, List list) {
            Object obj;
            float f4 = ShashkiApp.f10561b.a().getResources().getDisplayMetrics().density;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((c) obj2).c().isEmpty()) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            int iB = ((c) it.next()).b();
            while (it.hasNext()) {
                int iB2 = ((c) it.next()).b();
                if (iB < iB2) {
                    iB = iB2;
                }
            }
            float f5 = 1.2f;
            float f6 = 160;
            float f7 = 10;
            float f8 = ((iB * 1.2f * f6) + f7) * f4;
            int size = arrayList.size();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i6 < size) {
                Object obj3 = arrayList.get(i6);
                i6++;
                int i7 = i5 + 1;
                if (i5 < 0) {
                    p.n();
                }
                c cVar = (c) obj3;
                cVar.l(iB);
                cVar.m(((i5 * 138) + 10) * f4);
                cVar.n(f8);
                i5 = i7;
            }
            int i8 = iB - 1;
            while (-1 < i8) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (((c) obj4).b() == i8) {
                        arrayList2.add(obj4);
                    }
                }
                float f9 = ((i8 * f5 * f6) + f7) * f4;
                int size2 = arrayList2.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj5 = arrayList2.get(i9);
                    i9++;
                    c cVar2 = (c) obj5;
                    Iterator it2 = cVar2.c().iterator();
                    if (!it2.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    float f10 = ((c) it2.next()).f();
                    while (it2.hasNext()) {
                        f10 = Math.min(f10, ((c) it2.next()).f());
                    }
                    Iterator it3 = cVar2.c().iterator();
                    if (!it3.hasNext()) {
                        throw new NoSuchElementException();
                    }
                    float f11 = ((c) it3.next()).f();
                    while (it3.hasNext()) {
                        f11 = Math.max(f11, ((c) it3.next()).f());
                    }
                    cVar2.m((f10 + f11) / 2);
                    cVar2.n(f9);
                }
                i8--;
                f5 = 1.2f;
            }
            int size3 = arrayList.size();
            while (true) {
                if (i4 >= size3) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i4);
                i4++;
                if (((c) obj).a() == c1290n.g()) {
                    break;
                }
            }
            for (c cVarH = (c) obj; cVarH != null; cVarH = cVarH.h()) {
                cVarH.o(true);
            }
        }

        public final List c(C1290n c1290n, int i4, cab.shashki.app.db.entities.a aVar) {
            String position;
            m.e(c1290n, "data");
            cab.shashki.app.service.b bVar = cab.shashki.app.service.b.f10603a;
            InterfaceC0870c interfaceC0870cR = bVar.s().contains(Integer.valueOf(i4)) ? null : cab.shashki.app.service.b.r(bVar, i4, aVar, 0, 4, null);
            ArrayList arrayList = new ArrayList();
            String strK = c1290n.k();
            if (strK == null) {
                position = interfaceC0870cR != null ? interfaceC0870cR.getPosition() : null;
            } else {
                position = strK;
            }
            c cVar = new c(position, null, 0, 0.0f, 0.0f, false, null, null, 0, 0, null, 2046, null);
            arrayList.add(cVar);
            a(c1290n, interfaceC0870cR, 1, (C1290n.a) p.G(c1290n.f()), cVar, arrayList);
            b(c1290n, arrayList);
            return arrayList;
        }

        private b() {
        }
    }

    public static final class d extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        d() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            m.e(scaleGestureDetector, "detector");
            HistoryGraphView.this.f11287v *= scaleGestureDetector.getScaleFactor();
            HistoryGraphView historyGraphView = HistoryGraphView.this;
            historyGraphView.f11287v = m3.h.e(historyGraphView.f11287v, 0.2f, 5.0f);
            HistoryGraphView.this.h();
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryGraphView(Context context) {
        super(context);
        m.e(context, "context");
        this.f11267b = new ArrayList();
        this.f11268c = new Paint();
        this.f11269d = new Paint();
        this.f11270e = new Paint();
        this.f11271f = new Path();
        this.f11272g = new PointF();
        this.f11273h = new PointF();
        this.f11274i = new PointF();
        this.f11275j = new PointF();
        this.f11276k = new StringBuilder();
        this.f11282q = 1.0f;
        this.f11283r = -7829368;
        float f4 = 128 * 1.0f;
        this.f11284s = f4;
        this.f11285t = f4 * 0.5f;
        this.f11286u = 21 * 1.0f;
        this.f11289x = 2;
        e(context);
    }

    private final void d(Canvas canvas) {
        Canvas canvas2;
        float width = getWidth();
        float height = getHeight();
        float f4 = this.f11273h.x;
        float f5 = this.f11287v;
        float f6 = f4 * f5;
        if (f6 > width) {
            float f7 = (width / f6) * width;
            float f8 = (((width - f7) * this.f11272g.x) * f5) / (f6 - width);
            float f9 = this.f11282q;
            canvas.drawRect(f8, (height - f9) - f9, f8 + f7, height, this.f11268c);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
        }
        float f10 = this.f11273h.y;
        float f11 = this.f11287v;
        float f12 = f10 * f11;
        if (f12 > height) {
            float f13 = (height / f12) * height;
            float f14 = (((height - f13) * this.f11272g.y) * f11) / (f12 - height);
            float f15 = this.f11282q;
            canvas2.drawRect((width - f15) - f15, f14, width, f14 + f13, this.f11268c);
        }
    }

    private final void e(Context context) {
        this.f11282q = context.getResources().getDisplayMetrics().density;
        this.f11283r = context.getResources().getColor(AbstractC0917u.f14628b);
        float f4 = this.f11282q;
        this.f11286u = 21 * f4;
        float f5 = 128 * f4;
        this.f11284s = f5;
        this.f11285t = f5 * 0.5f;
        this.f11269d.setTextAlign(Paint.Align.CENTER);
        this.f11269d.setTextSize(this.f11286u);
        this.f11269d.setFlags(1);
        this.f11269d.setColor(context.getResources().getColor(AbstractC0917u.f14627a));
        this.f11270e.setColor(context.getResources().getColor(AbstractC0917u.f14631e));
        this.f11270e.setStyle(Paint.Style.STROKE);
        this.f11270e.setFlags(1);
        this.f11268c.setColor(androidx.core.graphics.a.j(this.f11269d.getColor(), 128));
        this.f11268c.setStyle(Paint.Style.FILL);
        BoardPreview boardPreview = new BoardPreview(context);
        this.f11277l = boardPreview;
        boardPreview.setVisibility(4);
        BoardPreview boardPreview2 = this.f11277l;
        BoardPreview boardPreview3 = null;
        if (boardPreview2 == null) {
            m.r("preview");
            boardPreview2 = null;
        }
        boardPreview2.setTop(0);
        BoardPreview boardPreview4 = this.f11277l;
        if (boardPreview4 == null) {
            m.r("preview");
            boardPreview4 = null;
        }
        boardPreview4.setLeft(0);
        BoardPreview boardPreview5 = this.f11277l;
        if (boardPreview5 == null) {
            m.r("preview");
            boardPreview5 = null;
        }
        boardPreview5.setRight((int) this.f11284s);
        BoardPreview boardPreview6 = this.f11277l;
        if (boardPreview6 == null) {
            m.r("preview");
        } else {
            boardPreview3 = boardPreview6;
        }
        boardPreview3.setBottom((int) this.f11284s);
        this.f11278m = new ScaleGestureDetector(context, new d());
    }

    private final void f() {
        c cVar = (c) p.O(this.f11267b);
        float f4 = 10;
        this.f11273h.set(cVar.f() + this.f11284s + (this.f11282q * f4), cVar.g() + this.f11284s + (f4 * this.f11282q));
        float fMin = Math.min(getWidth() / this.f11273h.x, getHeight() / this.f11273h.y);
        this.f11287v = fMin;
        float fE = m3.h.e(fMin, 0.2f, 5.0f);
        this.f11287v = fE;
        if (this.f11273h.x * fE < getWidth()) {
            this.f11272g.x = (this.f11273h.x - (getWidth() / this.f11287v)) * 0.5f;
        }
        if (this.f11273h.y * this.f11287v < getHeight()) {
            this.f11272g.y = (this.f11273h.y - (getHeight() / this.f11287v)) * 0.5f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        if (this.f11273h.x * this.f11287v < getWidth()) {
            this.f11272g.x = (this.f11273h.x - (getWidth() / this.f11287v)) * 0.5f;
        } else {
            if (((this.f11272g.x - this.f11273h.x) * this.f11287v) + getWidth() > 0.0f) {
                this.f11272g.x = this.f11273h.x - (getWidth() / this.f11287v);
            }
            PointF pointF = this.f11272g;
            if (pointF.x < 0.0f) {
                pointF.x = 0.0f;
            }
        }
        if (this.f11273h.y * this.f11287v < getHeight()) {
            this.f11272g.y = (this.f11273h.y - (getHeight() / this.f11287v)) * 0.5f;
        } else {
            if (((this.f11272g.y - this.f11273h.y) * this.f11287v) + getHeight() > 0.0f) {
                this.f11272g.y = this.f11273h.y - (getHeight() / this.f11287v);
            }
            PointF pointF2 = this.f11272g;
            if (pointF2.y < 0.0f) {
                pointF2.y = 0.0f;
            }
        }
        postInvalidate();
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m.e(motionEvent, "event");
        ScaleGestureDetector scaleGestureDetector = this.f11278m;
        ScaleGestureDetector scaleGestureDetector2 = null;
        if (scaleGestureDetector == null) {
            m.r("scaleGestureDetector");
            scaleGestureDetector = null;
        }
        scaleGestureDetector.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f11275j.set(this.f11272g);
            this.f11274i.set(motionEvent.getX(), motionEvent.getY());
            this.f11288w = System.currentTimeMillis();
        } else if (action != 1) {
            if (action == 2) {
                ScaleGestureDetector scaleGestureDetector3 = this.f11278m;
                if (scaleGestureDetector3 == null) {
                    m.r("scaleGestureDetector");
                } else {
                    scaleGestureDetector2 = scaleGestureDetector3;
                }
                if (scaleGestureDetector2.isInProgress()) {
                    return true;
                }
                this.f11272g.x = this.f11275j.x + ((this.f11274i.x - motionEvent.getX()) / this.f11287v);
                this.f11272g.y = this.f11275j.y + ((this.f11274i.y - motionEvent.getY()) / this.f11287v);
                h();
            }
        } else if (this.f11280o != null && System.currentTimeMillis() < this.f11288w + 400) {
            float x4 = (motionEvent.getX() / this.f11287v) + this.f11272g.x;
            float y4 = (motionEvent.getY() / this.f11287v) + this.f11272g.y;
            Iterator it = this.f11267b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c cVar = (c) it.next();
                float f4 = this.f11284s;
                float f5 = x4 - cVar.f();
                if (0.0f <= f5 && f5 <= f4) {
                    float f6 = this.f11284s;
                    float fG = y4 - cVar.g();
                    if (0.0f <= fG && fG <= f6) {
                        InterfaceC1020p interfaceC1020p = this.f11280o;
                        if (interfaceC1020p != null) {
                            interfaceC1020p.k(Integer.valueOf(cVar.a()), Integer.valueOf(cVar.k()));
                        }
                    }
                }
            }
        }
        return true;
    }

    public final void g(List list, int i4, cab.shashki.app.db.entities.a aVar) {
        m.e(list, "list");
        this.f11287v = 0.0f;
        this.f11281p = i4;
        this.f11279n = aVar;
        this.f11289x = (aVar == null || !aVar.is3()) ? (aVar == null || !aVar.is4()) ? (aVar == null || !aVar.is6()) ? 2 : 6 : 4 : 3;
        this.f11267b.clear();
        this.f11267b.addAll(list);
        postInvalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) throws Throwable {
        BoardPreview boardPreview;
        Canvas canvas2 = canvas;
        m.e(canvas2, "canvas");
        if (this.f11267b.isEmpty()) {
            return;
        }
        if (this.f11287v == 0.0f) {
            f();
        }
        canvas2.drawColor(this.f11283r);
        canvas2.save();
        float f4 = this.f11287v;
        canvas2.scale(f4, f4);
        for (c cVar : this.f11267b) {
            canvas2.save();
            canvas2.translate(cVar.f() - this.f11272g.x, cVar.g() - this.f11272g.y);
            this.f11270e.setStrokeWidth(cVar.j() ? 4 * this.f11282q : this.f11282q);
            String strI = cVar.i();
            if (strI != null) {
                BoardPreview boardPreview2 = this.f11277l;
                BoardPreview boardPreview3 = null;
                if (boardPreview2 == null) {
                    m.r("preview");
                    boardPreview = null;
                } else {
                    boardPreview = boardPreview2;
                }
                BoardPreview.b0(boardPreview, this.f11281p, strI, null, this.f11279n, null, 16, null);
                BoardPreview boardPreview4 = this.f11277l;
                if (boardPreview4 == null) {
                    m.r("preview");
                } else {
                    boardPreview3 = boardPreview4;
                }
                boardPreview3.M(canvas2);
            } else if (Build.VERSION.SDK_INT >= 21) {
                float f5 = this.f11284s;
                float f6 = this.f11286u;
                canvas2.drawRoundRect(0.0f, 0.0f, f5, f5, f6, f6, this.f11270e);
                canvas2 = canvas;
            } else {
                float f7 = this.f11284s;
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, f7, f7, this.f11270e);
            }
            String strE = cVar.e();
            if (strE != null) {
                n.f(this.f11276k);
                this.f11276k.append(((cVar.k() - 1) / this.f11289x) + 1);
                int iK = cVar.k();
                int i4 = this.f11289x;
                int i5 = iK % i4;
                if (i5 + (i4 & (((i5 ^ i4) & ((-i5) | i5)) >> 31)) != 1) {
                    this.f11276k.append(" … ");
                } else {
                    this.f11276k.append(". ");
                }
                if (strE.length() < 9) {
                    this.f11276k.append(strE);
                } else {
                    StringBuilder sb = this.f11276k;
                    String strSubstring = strE.substring(0, 8);
                    m.d(strSubstring, "substring(...)");
                    sb.append(strSubstring);
                    sb.append((char) 8230);
                }
                canvas2.drawText(this.f11276k.toString(), this.f11285t, (-4) * this.f11282q, this.f11269d);
            }
            c cVarH = cVar.h();
            if (cVarH != null) {
                this.f11271f.reset();
                this.f11271f.moveTo(this.f11285t, (-this.f11286u) - this.f11282q);
                this.f11271f.quadTo(this.f11285t + ((cVarH.f() - cVar.f()) * 0.5f), (cVarH.g() - cVar.g()) + this.f11284s + this.f11282q, (cVarH.f() - cVar.f()) + this.f11285t, (cVarH.g() - cVar.g()) + this.f11284s + this.f11282q);
                canvas2.drawPath(this.f11271f, this.f11270e);
                if (cVar.d().size() > 1) {
                    String str = (String) p.G(cVar.d());
                    n.f(this.f11276k);
                    if (str.length() < 9) {
                        this.f11276k.append(str);
                    } else {
                        StringBuilder sb2 = this.f11276k;
                        String strSubstring2 = str.substring(0, 8);
                        m.d(strSubstring2, "substring(...)");
                        sb2.append(strSubstring2);
                        sb2.append((char) 8230);
                    }
                    canvas2.drawText(this.f11276k.toString(), this.f11285t + ((cVarH.f() - cVar.f()) * 0.25f), (cVarH.g() - cVar.g()) + this.f11284s + this.f11286u, this.f11269d);
                }
            }
            canvas2.restore();
        }
        canvas2.restore();
        d(canvas);
    }

    public final void setListener(InterfaceC1020p interfaceC1020p) {
        this.f11280o = interfaceC1020p;
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f11292a;

        /* renamed from: b, reason: collision with root package name */
        private String f11293b;

        /* renamed from: c, reason: collision with root package name */
        private int f11294c;

        /* renamed from: d, reason: collision with root package name */
        private float f11295d;

        /* renamed from: e, reason: collision with root package name */
        private float f11296e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f11297f;

        /* renamed from: g, reason: collision with root package name */
        private c f11298g;

        /* renamed from: h, reason: collision with root package name */
        private final List f11299h;

        /* renamed from: i, reason: collision with root package name */
        private int f11300i;

        /* renamed from: j, reason: collision with root package name */
        private final int f11301j;

        /* renamed from: k, reason: collision with root package name */
        private final List f11302k;

        public c(String str, String str2, int i4, float f4, float f5, boolean z4, c cVar, List list, int i5, int i6, List list2) {
            m.e(list, "kids");
            m.e(list2, "moves");
            this.f11292a = str;
            this.f11293b = str2;
            this.f11294c = i4;
            this.f11295d = f4;
            this.f11296e = f5;
            this.f11297f = z4;
            this.f11298g = cVar;
            this.f11299h = list;
            this.f11300i = i5;
            this.f11301j = i6;
            this.f11302k = list2;
        }

        public final int a() {
            return this.f11301j;
        }

        public final int b() {
            return this.f11294c;
        }

        public final List c() {
            return this.f11299h;
        }

        public final List d() {
            return this.f11302k;
        }

        public final String e() {
            return this.f11293b;
        }

        public final float f() {
            return this.f11295d;
        }

        public final float g() {
            return this.f11296e;
        }

        public final c h() {
            return this.f11298g;
        }

        public final String i() {
            return this.f11292a;
        }

        public final boolean j() {
            return this.f11297f;
        }

        public final int k() {
            return this.f11300i;
        }

        public final void l(int i4) {
            this.f11294c = i4;
        }

        public final void m(float f4) {
            this.f11295d = f4;
        }

        public final void n(float f4) {
            this.f11296e = f4;
        }

        public final void o(boolean z4) {
            this.f11297f = z4;
        }

        public /* synthetic */ c(String str, String str2, int i4, float f4, float f5, boolean z4, c cVar, List list, int i5, int i6, List list2, int i7, h hVar) {
            this(str, (i7 & 2) != 0 ? null : str2, (i7 & 4) != 0 ? 0 : i4, (i7 & 8) != 0 ? 0.0f : f4, (i7 & 16) == 0 ? f5 : 0.0f, (i7 & 32) != 0 ? false : z4, (i7 & 64) == 0 ? cVar : null, (i7 & 128) != 0 ? new ArrayList() : list, (i7 & 256) != 0 ? 0 : i5, (i7 & 512) == 0 ? i6 : 0, (i7 & 1024) != 0 ? new ArrayList() : list2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HistoryGraphView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        this.f11267b = new ArrayList();
        this.f11268c = new Paint();
        this.f11269d = new Paint();
        this.f11270e = new Paint();
        this.f11271f = new Path();
        this.f11272g = new PointF();
        this.f11273h = new PointF();
        this.f11274i = new PointF();
        this.f11275j = new PointF();
        this.f11276k = new StringBuilder();
        this.f11282q = 1.0f;
        this.f11283r = -7829368;
        float f4 = 128 * 1.0f;
        this.f11284s = f4;
        this.f11285t = f4 * 0.5f;
        this.f11286u = 21 * 1.0f;
        this.f11289x = 2;
        e(context);
    }
}