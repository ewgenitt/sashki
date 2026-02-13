package cab.shashki.app.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import f0.AbstractC0922z;
import h3.h;
import h3.m;
import h3.x;
import java.util.Arrays;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class SeekPreference extends DialogPreference {

    /* renamed from: a0, reason: collision with root package name */
    public static final a f10581a0 = new a(null);

    /* renamed from: Y, reason: collision with root package name */
    private int f10582Y;

    /* renamed from: Z, reason: collision with root package name */
    private String f10583Z;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SeekPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        m.e(context, "context");
    }

    @Override // androidx.preference.Preference
    public CharSequence A() {
        String str = this.f10583Z;
        if (str == null) {
            return super.A();
        }
        x xVar = x.f16269a;
        String str2 = String.format(str, Arrays.copyOf(new Object[]{Integer.valueOf(this.f10582Y)}, 1));
        m.d(str2, "format(...)");
        return str2;
    }

    @Override // androidx.preference.DialogPreference
    public int I0() {
        return AbstractC0922z.f15135F0;
    }

    public final int N0() {
        return this.f10582Y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public Integer U(TypedArray typedArray, int i4) {
        m.e(typedArray, "a");
        return Integer.valueOf(typedArray.getInteger(i4, 8));
    }

    public final void P0(int i4) {
        this.f10582Y = i4;
        f0(i4);
        K();
    }

    @Override // androidx.preference.Preference
    protected void b0(boolean z4, Object obj) {
        int iIntValue = 8;
        if (z4) {
            iIntValue = t(8);
        } else {
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            if (num != null) {
                iIntValue = num.intValue();
            }
        }
        P0(iIntValue);
    }

    public /* synthetic */ SeekPreference(Context context, AttributeSet attributeSet, int i4, h hVar) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        this.f10582Y = 8;
        CharSequence charSequenceA = super.A();
        this.f10583Z = charSequenceA != null ? charSequenceA.toString() : null;
    }
}