package cab.shashki.app.ui.imagebuilder;

import C2.e;
import N0.C0573k;
import T2.u;
import U2.p;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.B;
import androidx.recyclerview.widget.RecyclerView;
import cab.shashki.app.service.FairyRepository;
import cab.shashki.app.ui.GridAutoLayoutManager;
import cab.shashki.app.ui.custom.board.C0843z;
import cab.shashki.app.ui.imagebuilder.FairyCollectionActivity;
import e3.AbstractC0876b;
import e3.AbstractC0877c;
import e3.i;
import f0.AbstractC0888D;
import f0.AbstractC0918v;
import g0.C0983n;
import g0.C0998x;
import g3.InterfaceC1016l;
import h3.h;
import h3.m;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p3.n;
import x2.AbstractC1488f;
import z2.AbstractC1559a;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class FairyCollectionActivity extends cab.shashki.app.ui.imagebuilder.a {

    /* renamed from: M, reason: collision with root package name */
    private final String f11731M = "";

    /* renamed from: N, reason: collision with root package name */
    private List f11732N = p.g();

    /* renamed from: O, reason: collision with root package name */
    private a f11733O;

    /* renamed from: P, reason: collision with root package name */
    private FairyRepository.a f11734P;

    /* JADX INFO: Access modifiers changed from: private */
    final class a extends RecyclerView.h {
        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void I(FairyCollectionActivity fairyCollectionActivity, int i4, View view) {
            fairyCollectionActivity.Z2(i4 + fairyCollectionActivity.f11732N.size());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void J(FairyCollectionActivity fairyCollectionActivity, int i4, View view) {
            fairyCollectionActivity.Z2(i4);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public void u(c cVar, final int i4) {
            m.e(cVar, "holder");
            b bVar = (b) FairyCollectionActivity.this.f11732N.get(i4);
            cVar.O().f15924c.setText(bVar.b());
            Drawable drawableA = bVar.a();
            if (drawableA == null) {
                cVar.O().f15923b.setImageResource(AbstractC0918v.f14817n3);
            } else {
                cVar.O().f15923b.setImageDrawable(drawableA);
            }
            ImageView imageView = cVar.O().f15923b;
            final FairyCollectionActivity fairyCollectionActivity = FairyCollectionActivity.this;
            imageView.setOnClickListener(new View.OnClickListener() { // from class: cab.shashki.app.ui.imagebuilder.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FairyCollectionActivity.a.I(fairyCollectionActivity, i4, view);
                }
            });
            Drawable drawableC = bVar.c();
            if (drawableC == null) {
                cVar.O().f15925d.setImageResource(AbstractC0918v.f14822o3);
            } else {
                cVar.O().f15925d.setImageDrawable(drawableC);
            }
            ImageView imageView2 = cVar.O().f15925d;
            final FairyCollectionActivity fairyCollectionActivity2 = FairyCollectionActivity.this;
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: cab.shashki.app.ui.imagebuilder.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FairyCollectionActivity.a.J(fairyCollectionActivity2, i4, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public c w(ViewGroup viewGroup, int i4) {
            m.e(viewGroup, "parent");
            C0998x c0998xD = C0998x.d(FairyCollectionActivity.this.getLayoutInflater(), viewGroup, false);
            m.d(c0998xD, "inflate(...)");
            return new c(c0998xD);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            return FairyCollectionActivity.this.f11732N.size();
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f11736a;

        /* renamed from: b, reason: collision with root package name */
        private Drawable f11737b;

        /* renamed from: c, reason: collision with root package name */
        private Drawable f11738c;

        public b(String str, Drawable drawable, Drawable drawable2) {
            m.e(str, "l");
            this.f11736a = str;
            this.f11737b = drawable;
            this.f11738c = drawable2;
        }

        public final Drawable a() {
            return this.f11738c;
        }

        public final String b() {
            return this.f11736a;
        }

        public final Drawable c() {
            return this.f11737b;
        }

        public final void d(Drawable drawable) {
            this.f11738c = drawable;
        }

        public final void e(Drawable drawable) {
            this.f11737b = drawable;
        }

        public /* synthetic */ b(String str, Drawable drawable, Drawable drawable2, int i4, h hVar) {
            this(str, (i4 & 2) != 0 ? null : drawable, (i4 & 4) != 0 ? null : drawable2);
        }
    }

    public static final class c extends RecyclerView.D {

        /* renamed from: u, reason: collision with root package name */
        private final C0998x f11739u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0998x c0998x) {
            super(c0998x.a());
            m.e(c0998x, "binding");
            this.f11739u = c0998x;
        }

        public final C0998x O() {
            return this.f11739u;
        }
    }

    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            b bVar = (b) obj;
            b bVar2 = (b) obj2;
            return W2.a.d(Integer.valueOf((bVar.b().length() << 5) + n.C0(bVar.b())), Integer.valueOf((bVar2.b().length() << 5) + n.C0(bVar2.b())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable A3(FairyCollectionActivity fairyCollectionActivity, Uri uri, String str) {
        return fairyCollectionActivity.z3(uri, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u B3(boolean z4, FairyCollectionActivity fairyCollectionActivity, int i4, Drawable drawable) {
        if (z4) {
            ((b) fairyCollectionActivity.f11732N.get(i4)).e(drawable);
        } else {
            ((b) fairyCollectionActivity.f11732N.get(i4)).d(drawable);
        }
        a aVar = fairyCollectionActivity.f11733O;
        if (aVar == null) {
            m.r("adapter");
            aVar = null;
        }
        aVar.n(i4);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u D3(boolean z4, FairyCollectionActivity fairyCollectionActivity, int i4, Throwable th) {
        if (z4) {
            ((b) fairyCollectionActivity.f11732N.get(i4)).e(null);
        } else {
            ((b) fairyCollectionActivity.f11732N.get(i4)).d(null);
        }
        Toast.makeText(fairyCollectionActivity, AbstractC0888D.f14518n0, 0).show();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    private final void F3() {
        if (!q3()) {
            Toast.makeText(this, AbstractC0888D.f14376H0, 0).show();
            return;
        }
        FairyRepository fairyRepository = FairyRepository.f10588a;
        File fileC = fairyRepository.C();
        File fileK = fairyRepository.k();
        FairyRepository.a aVar = this.f11734P;
        FairyRepository.a aVar2 = null;
        if (aVar == null) {
            m.r("fairy");
            aVar = null;
        }
        File file = new File(fileK, aVar.a());
        final h3.u uVar = new h3.u();
        uVar.f16266d = new File(file, String.valueOf(1));
        int i4 = 1;
        while (((File) uVar.f16266d).exists()) {
            i4++;
            uVar.f16266d = new File(file, String.valueOf(i4));
        }
        if (!fileC.renameTo((File) uVar.f16266d)) {
            Toast.makeText(this, AbstractC0888D.f14518n0, 0).show();
            return;
        }
        FairyRepository.a aVar3 = this.f11734P;
        if (aVar3 == null) {
            m.r("fairy");
        } else {
            aVar2 = aVar3;
        }
        aVar2.c().setImageSet(((File) uVar.f16266d).getName());
        A2.c cVarC = AbstractC1488f.q(new Callable() { // from class: J0.P0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FairyCollectionActivity.G3(this.f1986d);
            }
        }).H(S2.a.c()).H(AbstractC1559a.a()).h(new C2.a() { // from class: J0.Q0
            @Override // C2.a
            public final void run() {
                FairyCollectionActivity.H3(this.f1989a, uVar);
            }
        }).C();
        m.d(cVarC, "subscribe(...)");
        R2.a.a(cVarC, S2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u G3(FairyCollectionActivity fairyCollectionActivity) {
        FairyRepository fairyRepository = FairyRepository.f10588a;
        FairyRepository.a aVar = fairyCollectionActivity.f11734P;
        if (aVar == null) {
            m.r("fairy");
            aVar = null;
        }
        fairyRepository.H(aVar);
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H3(FairyCollectionActivity fairyCollectionActivity, h3.u uVar) {
        String name = ((File) uVar.f16266d).getName();
        m.d(name, "getName(...)");
        fairyCollectionActivity.X2(name);
    }

    private final boolean q3() {
        List<b> list = this.f11732N;
        if (B.a(list) && list.isEmpty()) {
            return true;
        }
        for (b bVar : list) {
            if (bVar.c() == null || bVar.a() == null) {
                return false;
            }
        }
        return true;
    }

    private final void r3() {
        AbstractC1488f abstractC1488fW = AbstractC1488f.q(new Callable() { // from class: J0.R0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FairyCollectionActivity.s3(this.f1992d);
            }
        }).H(S2.a.c()).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: J0.S0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return FairyCollectionActivity.t3(this.f1995d, (T2.u) obj);
            }
        };
        e eVar = new e() { // from class: J0.H0
            @Override // C2.e
            public final void accept(Object obj) {
                FairyCollectionActivity.u3(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: J0.I0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return FairyCollectionActivity.v3(this.f1958d, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fW.D(eVar, new e() { // from class: J0.J0
            @Override // C2.e
            public final void accept(Object obj) {
                FairyCollectionActivity.w3(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, S2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u s3(FairyCollectionActivity fairyCollectionActivity) {
        File file;
        File file2;
        File[] fileArrListFiles = FairyRepository.f10588a.C().listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (b bVar : fairyCollectionActivity.f11732N) {
            int length = fileArrListFiles.length;
            int i4 = 0;
            while (true) {
                file = null;
                if (i4 >= length) {
                    file2 = null;
                    break;
                }
                file2 = fileArrListFiles[i4];
                String name = file2.getName();
                m.d(name, "getName(...)");
                if (n.x(name, "w" + bVar.b(), false, 2, null)) {
                    break;
                }
                i4++;
            }
            if (file2 != null) {
                bVar.e(C0843z.f11502a.m0(fairyCollectionActivity, i.n(file2, "svg"), file2));
            }
            int length2 = fileArrListFiles.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length2) {
                    break;
                }
                File file3 = fileArrListFiles[i5];
                String name2 = file3.getName();
                m.d(name2, "getName(...)");
                if (n.x(name2, "b" + bVar.b(), false, 2, null)) {
                    file = file3;
                    break;
                }
                i5++;
            }
            if (file != null) {
                bVar.d(C0843z.f11502a.m0(fairyCollectionActivity, i.n(file, "svg"), file));
            }
        }
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u t3(FairyCollectionActivity fairyCollectionActivity, u uVar) {
        a aVar = fairyCollectionActivity.f11733O;
        if (aVar == null) {
            m.r("adapter");
            aVar = null;
        }
        aVar.m();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u v3(FairyCollectionActivity fairyCollectionActivity, Throwable th) {
        Toast.makeText(fairyCollectionActivity, AbstractC0888D.f14518n0, 0).show();
        th.printStackTrace();
        return u.f3817a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(InterfaceC1016l interfaceC1016l, Object obj) {
        interfaceC1016l.o(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(FairyCollectionActivity fairyCollectionActivity, View view) {
        fairyCollectionActivity.F3();
    }

    private final Drawable z3(Uri uri, String str) {
        boolean zN = n.n(str, ".svg", false, 2, null);
        File file = new File(FairyRepository.f10588a.C(), str);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
            m.b(inputStreamOpenInputStream);
            try {
                AbstractC0876b.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                AbstractC0877c.a(inputStreamOpenInputStream, null);
                AbstractC0877c.a(fileOutputStream, null);
                return C0843z.f11502a.m0(this, zN, file);
            } finally {
            }
        } finally {
        }
    }

    @Override // cab.shashki.app.ui.imagebuilder.a
    protected String T2() {
        return this.f11731M;
    }

    @Override // cab.shashki.app.ui.imagebuilder.a
    protected void Y2(int i4, final Uri uri) {
        String strD0;
        m.e(uri, "uri");
        final boolean z4 = i4 < this.f11732N.size();
        final int size = i4 % this.f11732N.size();
        String strP = C0573k.f2973a.p(uri);
        if (strP == null || (strD0 = n.D0(strP, 4)) == null) {
            strD0 = ".png";
        }
        char c4 = z4 ? 'w' : 'b';
        final String str = c4 + ((b) this.f11732N.get(size)).b() + strD0;
        AbstractC1488f abstractC1488fW = AbstractC1488f.q(new Callable() { // from class: J0.G0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return FairyCollectionActivity.A3(this.f1950d, uri, str);
            }
        }).H(S2.a.c()).w(AbstractC1559a.a());
        final InterfaceC1016l interfaceC1016l = new InterfaceC1016l() { // from class: J0.K0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return FairyCollectionActivity.B3(z4, this, size, (Drawable) obj);
            }
        };
        e eVar = new e() { // from class: J0.L0
            @Override // C2.e
            public final void accept(Object obj) {
                FairyCollectionActivity.C3(interfaceC1016l, obj);
            }
        };
        final InterfaceC1016l interfaceC1016l2 = new InterfaceC1016l() { // from class: J0.M0
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return FairyCollectionActivity.D3(z4, this, size, (Throwable) obj);
            }
        };
        A2.c cVarD = abstractC1488fW.D(eVar, new e() { // from class: J0.N0
            @Override // C2.e
            public final void accept(Object obj) {
                FairyCollectionActivity.E3(interfaceC1016l2, obj);
            }
        });
        m.d(cVarD, "subscribe(...)");
        R2.a.a(cVarD, S2());
    }

    @Override // cab.shashki.app.ui.imagebuilder.a, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0573k c0573k = C0573k.f2973a;
        TextView textView = ((C0983n) R2()).f15783c;
        m.d(textView, "save");
        a aVar = null;
        C0573k.s(c0573k, textView, 0, 1, null);
        RecyclerView recyclerView = ((C0983n) R2()).f15782b;
        m.d(recyclerView, "list");
        C0573k.v(c0573k, recyclerView, 0, 1, null);
        b3("image/*");
        ArrayList arrayList = new ArrayList();
        FairyRepository.a aVarL = FairyRepository.f10588a.l();
        m.b(aVarL);
        this.f11734P = aVarL;
        if (aVarL == null) {
            m.r("fairy");
            aVarL = null;
        }
        Map<String, Integer> pieceMap = aVarL.c().getPieceMap();
        if (pieceMap != null) {
            for (Map.Entry<String, Integer> entry : pieceMap.entrySet()) {
                if (Character.isLowerCase(n.C0(entry.getKey()))) {
                    arrayList.add(new b(entry.getKey(), null, null, 6, null));
                }
            }
        }
        this.f11732N = p.X(arrayList, new d());
        this.f11733O = new a();
        ((C0983n) R2()).f15782b.setLayoutManager(new GridAutoLayoutManager(this, 150.0f, 0, 4, null));
        RecyclerView recyclerView2 = ((C0983n) R2()).f15782b;
        a aVar2 = this.f11733O;
        if (aVar2 == null) {
            m.r("adapter");
        } else {
            aVar = aVar2;
        }
        recyclerView2.setAdapter(aVar);
        ((C0983n) R2()).f15783c.setOnClickListener(new View.OnClickListener() { // from class: J0.O0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FairyCollectionActivity.y3(this.f1983b, view);
            }
        });
        r3();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cab.shashki.app.ui.imagebuilder.a
    /* renamed from: x3, reason: merged with bridge method [inline-methods] */
    public C0983n U2() {
        C0983n c0983nD = C0983n.d(getLayoutInflater());
        m.d(c0983nD, "inflate(...)");
        return c0983nD;
    }
}