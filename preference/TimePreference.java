package cab.shashki.app.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import f0.AbstractC0888D;
import f0.AbstractC0922z;
import h3.h;
import h3.m;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class TimePreference extends DialogPreference {

    /* renamed from: Z, reason: collision with root package name */
    public static final a f10586Z = new a(null);

    /* renamed from: Y, reason: collision with root package name */
    private int f10587Y;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimePreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        m.e(context, "context");
    }

    @Override // androidx.preference.DialogPreference
    public int I0() {
        return AbstractC0922z.f15145K0;
    }

    @Override // androidx.preference.Preference
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public String A() {
        String string = i().getString(AbstractC0888D.B4, Integer.valueOf(this.f10587Y / 1000), Integer.valueOf((this.f10587Y % 1000) / 10));
        m.d(string, "getString(...)");
        return string;
    }

    public final int O0() {
        return this.f10587Y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public Integer U(TypedArray typedArray, int i4) {
        m.e(typedArray, "a");
        return Integer.valueOf(typedArray.getInteger(i4, 200));
    }

    public final void Q0(int i4) {
        this.f10587Y = i4;
        f0(i4);
        K();
    }

    @Override // androidx.preference.Preference
    protected void b0(boolean z4, Object obj) {
        int iIntValue = 200;
        if (z4) {
            iIntValue = t(200);
        } else {
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        Q0(iIntValue);
    }

    public /* synthetic */ TimePreference(Context context, AttributeSet attributeSet, int i4, h hVar) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        this.f10587Y = 200;
    }
}