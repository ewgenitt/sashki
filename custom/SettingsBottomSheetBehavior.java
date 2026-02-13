package cab.shashki.app.ui.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h3.m;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class SettingsBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* renamed from: Z, reason: collision with root package name */
    private float f11305Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f11306a0;

    public SettingsBottomSheetBehavior() {
        this.f11305Z = 48.0f;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        m.e(coordinatorLayout, "parent");
        m.e(view, "child");
        m.e(motionEvent, "event");
        if (this.f11306a0 || motionEvent.getX() > coordinatorLayout.getWidth() - this.f11305Z) {
            return super.D(coordinatorLayout, view, motionEvent);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        this.f11305Z = 48.0f;
        this.f11305Z = 48 * context.getResources().getDisplayMetrics().density;
        this.f11306a0 = context.getResources().getConfiguration().orientation == 1;
    }
}