package cab.shashki.app.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import f0.AbstractC0922z;
import h3.h;
import h3.m;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class FairyCollectionPreference extends DialogPreference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FairyCollectionPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        m.e(context, "context");
    }

    @Override // androidx.preference.DialogPreference
    public int I0() {
        return AbstractC0922z.f15224t0;
    }

    public final void N0(String str) {
        h0(str);
        K();
    }

    public /* synthetic */ FairyCollectionPreference(Context context, AttributeSet attributeSet, int i4, h hVar) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FairyCollectionPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
    }
}