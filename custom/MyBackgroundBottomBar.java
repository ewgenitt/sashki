package cab.shashki.app.ui.custom;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.bottomappbar.BottomAppBar;
import h3.m;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class MyBackgroundBottomBar extends BottomAppBar {

    /* renamed from: q0, reason: collision with root package name */
    private final String f11304q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyBackgroundBottomBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        this.f11304q0 = "http://schemas.android.com/apk/res/android";
        S0(attributeSet);
    }

    private final void S0(AttributeSet attributeSet) {
        int attributeResourceValue;
        if (attributeSet == null || (attributeResourceValue = attributeSet.getAttributeResourceValue(this.f11304q0, "background", 0)) == 0) {
            return;
        }
        setBackgroundResource(attributeResourceValue);
    }
}