package cab.shashki.app.ui;

import android.content.Context;
import android.util.TypedValue;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h3.m;
import m3.g;
import m3.h;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class GridAutoLayoutManager extends GridLayoutManager {

    /* renamed from: R, reason: collision with root package name */
    private int f10866R;

    /* renamed from: S, reason: collision with root package name */
    private int f10867S;

    /* renamed from: T, reason: collision with root package name */
    private int f10868T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f10869U;

    /* renamed from: V, reason: collision with root package name */
    private int f10870V;

    /* renamed from: W, reason: collision with root package name */
    private final Context f10871W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridAutoLayoutManager(Context context, float f4, int i4) {
        super(context, 1);
        m.e(context, "context");
        this.f10869U = true;
        this.f10871W = context;
        this.f10870V = i4;
        f3(e3(context, h.b((int) TypedValue.applyDimension(1, f4, context.getResources().getDisplayMetrics()), 1)));
    }

    private final int e3(Context context, int i4) {
        return i4 <= 0 ? (int) TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics()) : i4;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.v vVar, RecyclerView.A a4) {
        int iH0;
        int iE0;
        m.e(vVar, "recycler");
        m.e(a4, "state");
        int iP0 = p0();
        int iX = X();
        if (this.f10868T > 0 && iP0 > 0 && iX > 0 && (this.f10869U || this.f10866R != iP0 || this.f10867S != iX)) {
            if (m2() == 1) {
                iH0 = iP0 - g0();
                iE0 = f0();
            } else {
                iH0 = iX - h0();
                iE0 = e0();
            }
            c3(h.g((iH0 - iE0) / this.f10868T, new g(1, this.f10870V)));
            this.f10869U = false;
        }
        this.f10866R = iP0;
        this.f10867S = iX;
        super.Y0(vVar, a4);
    }

    public final void f3(int i4) {
        if (i4 <= 0 || i4 == this.f10868T) {
            return;
        }
        this.f10868T = i4;
        this.f10869U = true;
    }

    public /* synthetic */ GridAutoLayoutManager(Context context, float f4, int i4, int i5, h3.h hVar) {
        this(context, f4, (i5 & 4) != 0 ? 96 : i4);
    }
}