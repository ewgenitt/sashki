package cab.shashki.app.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import f0.AbstractC0922z;
import h3.h;
import h3.m;
import p3.n;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class BoardColorsPreference extends DialogPreference {

    /* renamed from: b0, reason: collision with root package name */
    public static final a f10576b0 = new a(null);

    /* renamed from: Y, reason: collision with root package name */
    private final boolean f10577Y;

    /* renamed from: Z, reason: collision with root package name */
    private long f10578Z;

    /* renamed from: a0, reason: collision with root package name */
    private long f10579a0;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        public final int a(long j4) {
            return (int) (j4 >> 32);
        }

        public final int b(long j4) {
            return (int) (j4 & 4294967295L);
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardColorsPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        m.e(context, "context");
    }

    private final void P0(long j4) {
        a aVar = f10576b0;
        this.f10578Z = aVar.a(j4);
        this.f10579a0 = aVar.b(j4);
        g0(j4);
        K();
    }

    @Override // androidx.preference.DialogPreference
    public int I0() {
        return AbstractC0922z.f15207l;
    }

    public final long N0() {
        return this.f10578Z;
    }

    public final long O0() {
        return this.f10579a0;
    }

    public final void Q0(long j4, long j5) {
        this.f10578Z = j5;
        this.f10579a0 = j4;
        g0(j4 | (j5 << 32));
        K();
    }

    @Override // androidx.preference.Preference
    protected void b0(boolean z4, Object obj) {
        long jLongValue = this.f10577Y ? -72057589755198139L : -24625431216272996L;
        if (z4) {
            jLongValue = u(jLongValue);
        } else {
            Long l4 = obj instanceof Long ? (Long) obj : null;
            if (l4 != null) {
                jLongValue = l4.longValue();
            }
        }
        P0(jLongValue);
    }

    public /* synthetic */ BoardColorsPreference(Context context, AttributeSet attributeSet, int i4, h hVar) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardColorsPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        String strO = o();
        boolean z4 = false;
        if (strO != null && n.C(strO, "dark", false, 2, null)) {
            z4 = true;
        }
        this.f10577Y = z4;
        this.f10578Z = z4 ? 4278190080L : 4289233740L;
        this.f10579a0 = z4 ? 4282729797L : 4293511580L;
    }
}