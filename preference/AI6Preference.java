package cab.shashki.app.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import f0.AbstractC0922z;
import h3.h;
import h3.m;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class AI6Preference extends DialogPreference {

    /* renamed from: Z, reason: collision with root package name */
    public static final a f10574Z = new a(null);

    /* renamed from: Y, reason: collision with root package name */
    private int f10575Y;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        public final int a(int i4, int i5) {
            return (i4 << 6) | i5;
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AI6Preference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        m.e(context, "context");
    }

    @Override // androidx.preference.DialogPreference
    public int I0() {
        return AbstractC0922z.f15180b0;
    }

    public final int N0() {
        return this.f10575Y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public Integer U(TypedArray typedArray, int i4) {
        m.e(typedArray, "a");
        return Integer.valueOf(typedArray.getInt(i4, 3776));
    }

    public final void P0(int i4) {
        this.f10575Y = i4;
        f0(i4);
        K();
    }

    @Override // androidx.preference.Preference
    protected void b0(boolean z4, Object obj) {
        int iIntValue = 3776;
        if (z4) {
            iIntValue = t(3776);
        } else {
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        P0(iIntValue);
    }

    public /* synthetic */ AI6Preference(Context context, AttributeSet attributeSet, int i4, h hVar) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AI6Preference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        this.f10575Y = 3776;
    }
}