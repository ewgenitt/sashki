package cab.shashki.app.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import f0.AbstractC0922z;
import h3.h;
import h3.m;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class PieceCollectionPreference extends DialogPreference {

    /* renamed from: Y, reason: collision with root package name */
    private String f10580Y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PieceCollectionPreference(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        m.e(context, "context");
    }

    @Override // androidx.preference.DialogPreference
    public int I0() {
        return AbstractC0922z.f15224t0;
    }

    public final String N0() {
        return this.f10580Y;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.preference.Preference
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public String U(TypedArray typedArray, int i4) {
        m.e(typedArray, "a");
        return typedArray.getString(i4);
    }

    public final void P0(String str) {
        this.f10580Y = str;
        h0(str);
        K();
    }

    @Override // androidx.preference.Preference
    protected void b0(boolean z4, Object obj) {
        String strV = null;
        if (z4) {
            strV = v(null);
        } else if (obj instanceof String) {
            strV = (String) obj;
        }
        P0(strV);
    }

    public /* synthetic */ PieceCollectionPreference(Context context, AttributeSet attributeSet, int i4, h hVar) {
        this(context, (i4 & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PieceCollectionPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
    }
}