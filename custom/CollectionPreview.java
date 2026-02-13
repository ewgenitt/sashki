package cab.shashki.app.ui.custom;

import U2.E;
import U2.p;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import g0.C0978k0;
import h3.m;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m3.h;
import o0.C1217D;
import o0.s;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class CollectionPreview extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    private C0978k0 f11264b;

    /* renamed from: c, reason: collision with root package name */
    private List f11265c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionPreview(Context context) {
        super(context);
        m.e(context, "context");
        a(context);
    }

    private final void a(Context context) {
        C0978k0 c0978k0D = C0978k0.d(LayoutInflater.from(context), this, true);
        m.d(c0978k0D, "inflate(...)");
        this.f11265c = p.j(c0978k0D.f15724b, c0978k0D.f15725c, c0978k0D.f15726d, c0978k0D.f15727e, c0978k0D.f15728f, c0978k0D.f15729g);
        this.f11264b = c0978k0D;
    }

    public final void setCollection(s sVar) throws XmlPullParserException, Resources.NotFoundException, IOException {
        m.e(sVar, "collection");
        C1217D c1217d = C1217D.f18138a;
        Context context = getContext();
        m.d(context, "getContext(...)");
        List listE = c1217d.e(context, sVar);
        int size = listE.size();
        List list = this.f11265c;
        if (list == null) {
            m.r("imageViews");
            list = null;
        }
        if (size > list.size()) {
            String strB = sVar.b();
            int i4 = 0;
            for (int i5 = 0; i5 < strB.length(); i5++) {
                if (Character.isUpperCase(strB.charAt(i5))) {
                    i4++;
                }
            }
            if (i4 > 2) {
                ArrayList arrayList = new ArrayList();
                int i6 = 0;
                for (Object obj : listE) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        p.n();
                    }
                    if (Character.isUpperCase(sVar.b().charAt(i6))) {
                        arrayList.add(obj);
                    }
                    i6 = i7;
                }
                listE = arrayList;
            }
        }
        List list2 = this.f11265c;
        if (list2 == null) {
            m.r("imageViews");
            list2 = null;
        }
        int iMin = Math.min(list2.size(), listE.size());
        for (int i8 = 0; i8 < iMin; i8++) {
            List list3 = this.f11265c;
            if (list3 == null) {
                m.r("imageViews");
                list3 = null;
            }
            ((ImageView) list3.get(i8)).setImageDrawable((Drawable) listE.get(i8));
        }
        List list4 = this.f11265c;
        if (list4 == null) {
            m.r("imageViews");
            list4 = null;
        }
        Iterator it = h.j(iMin, list4.size()).iterator();
        while (it.hasNext()) {
            int iA = ((E) it).a();
            List list5 = this.f11265c;
            if (list5 == null) {
                m.r("imageViews");
                list5 = null;
            }
            ((ImageView) list5.get(iA)).setImageResource(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionPreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m.e(context, "context");
        a(context);
    }
}