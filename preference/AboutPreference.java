package cab.shashki.app.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import f0.AbstractC0888D;
import f0.AbstractC0922z;
import h3.h;
import h3.m;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class AboutPreference extends DialogPreference {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AboutPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        m.e(context, "context");
    }

    @Override // androidx.preference.DialogPreference
    public int I0() {
        return AbstractC0922z.f15176a;
    }

    @Override // androidx.preference.Preference
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public String A() {
        return i().getString(AbstractC0888D.J6, "8.5");
    }

    public /* synthetic */ AboutPreference(Context context, AttributeSet attributeSet, int i4, h hVar) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AboutPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
    }
}