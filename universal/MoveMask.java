package cab.shashki.app.ui.universal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import cab.shashki.app.ui.universal.MoveMask;
import f0.AbstractC0920x;
import f0.AbstractC0922z;
import h3.m;
import java.util.ArrayList;
import java.util.List;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class MoveMask extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    private final List f11834b;

    /* renamed from: c, reason: collision with root package name */
    private int f11835c;

    /* renamed from: d, reason: collision with root package name */
    private a f11836d;

    public interface a {
        void a(int i4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoveMask(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        this.f11834b = new ArrayList();
        b(context);
    }

    private final void b(Context context) {
        View.inflate(context, AbstractC0922z.f15183c0, this);
        List list = this.f11834b;
        View viewFindViewById = findViewById(AbstractC0920x.y6);
        m.d(viewFindViewById, "findViewById(...)");
        list.add(viewFindViewById);
        List list2 = this.f11834b;
        View viewFindViewById2 = findViewById(AbstractC0920x.q6);
        m.d(viewFindViewById2, "findViewById(...)");
        list2.add(viewFindViewById2);
        List list3 = this.f11834b;
        View viewFindViewById3 = findViewById(AbstractC0920x.G6);
        m.d(viewFindViewById3, "findViewById(...)");
        list3.add(viewFindViewById3);
        List list4 = this.f11834b;
        View viewFindViewById4 = findViewById(AbstractC0920x.Q4);
        m.d(viewFindViewById4, "findViewById(...)");
        list4.add(viewFindViewById4);
        List list5 = this.f11834b;
        View viewFindViewById5 = findViewById(AbstractC0920x.f15108x0);
        m.d(viewFindViewById5, "findViewById(...)");
        list5.add(viewFindViewById5);
        List list6 = this.f11834b;
        View viewFindViewById6 = findViewById(AbstractC0920x.f14984Y);
        m.d(viewFindViewById6, "findViewById(...)");
        list6.add(viewFindViewById6);
        List list7 = this.f11834b;
        View viewFindViewById7 = findViewById(AbstractC0920x.f15033i0);
        m.d(viewFindViewById7, "findViewById(...)");
        list7.add(viewFindViewById7);
        List list8 = this.f11834b;
        View viewFindViewById8 = findViewById(AbstractC0920x.f14919H3);
        m.d(viewFindViewById8, "findViewById(...)");
        list8.add(viewFindViewById8);
        for (final int i4 = 0; i4 < 8; i4++) {
            ((ImageView) this.f11834b.get(i4)).setOnClickListener(new View.OnClickListener() { // from class: M0.B1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MoveMask.c(i4, this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(int i4, MoveMask moveMask, View view) {
        int i5 = 1 << i4;
        view.setSelected(true ^ view.isSelected());
        int i6 = moveMask.f11835c & (i5 ^ (-1));
        if (!view.isSelected()) {
            i5 = 0;
        }
        int i7 = i5 | i6;
        moveMask.f11835c = i7;
        a aVar = moveMask.f11836d;
        if (aVar != null) {
            aVar.a(i7);
        }
    }

    public final void d(int i4, boolean z4) {
        a aVar;
        this.f11835c = (z4 ? 119 : 255) & i4;
        for (int i5 = 0; i5 < 8; i5++) {
            ImageView imageView = (ImageView) this.f11834b.get(i5);
            boolean z5 = true;
            if (((1 << i5) & i4) == 0) {
                z5 = false;
            }
            imageView.setSelected(z5);
        }
        ((ImageView) this.f11834b.get(3)).setVisibility(z4 ? 4 : 0);
        ((ImageView) this.f11834b.get(7)).setVisibility(((ImageView) this.f11834b.get(3)).getVisibility());
        int i6 = this.f11835c;
        if (i4 == i6 || (aVar = this.f11836d) == null) {
            return;
        }
        aVar.a(i6);
    }

    public final int getMask() {
        return this.f11835c;
    }

    public final void setChangeListener(a aVar) {
        m.e(aVar, "listener");
        this.f11836d = aVar;
    }
}