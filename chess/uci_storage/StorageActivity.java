package cab.shashki.app.ui.chess.uci_storage;

import B0.x;
import B0.y;
import N0.C0573k;
import T2.u;
import android.R;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.O;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import cab.shashki.app.db.entities.HalmaParams;
import cab.shashki.app.ui.chess.uci_storage.StorageActivity;
import com.google.android.material.snackbar.Snackbar;
import f0.AbstractActivityC0911o;
import f0.AbstractC0888D;
import f0.AbstractC0920x;
import f0.AbstractC0922z;
import f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L;
import g0.H0;
import g3.InterfaceC1016l;
import g3.InterfaceC1020p;
import h3.h;
import h3.l;
import h3.m;
import java.io.File;
import java.util.List;
import p3.n;
import u0.C1402e;

/* loaded from: C:\Users\Admin\Desktop\228\classes.dex */
public final class StorageActivity extends AbstractActivityC0911o implements y {

    /* renamed from: L */
    public static final a f11197L = new a(null);

    /* renamed from: J */
    private C1402e f11198J;

    /* renamed from: K */
    private H0 f11199K;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    /* synthetic */ class b extends l implements InterfaceC1020p {
        b(Object obj) {
            super(2, obj, x.class, "onMenuClick", "onMenuClick(Ljava/io/File;Landroid/view/View;)V", 0);
        }

        @Override // g3.InterfaceC1020p
        public /* bridge */ /* synthetic */ Object k(Object obj, Object obj2) {
            m((File) obj, (View) obj2);
            return u.f3817a;
        }

        public final void m(File file, View view) {
            m.e(file, "p0");
            m.e(view, "p1");
            ((x) this.f16244e).f1(file, view);
        }
    }

    /* synthetic */ class c extends l implements InterfaceC1016l {
        c(Object obj) {
            super(1, obj, x.class, "onClick", "onClick(Ljava/io/File;)V", 0);
        }

        public final void m(File file) {
            m.e(file, "p0");
            ((x) this.f16244e).d1(file);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((File) obj);
            return u.f3817a;
        }
    }

    /* synthetic */ class d extends l implements InterfaceC1016l {
        d(Object obj) {
            super(1, obj, x.class, "addDir", "addDir(Ljava/lang/String;)V", 0);
        }

        public final void m(String str) {
            m.e(str, "p0");
            ((x) this.f16244e).M0(str);
        }

        @Override // g3.InterfaceC1016l
        public /* bridge */ /* synthetic */ Object o(Object obj) {
            m((String) obj);
            return u.f3817a;
        }
    }

    public static final void i3(StorageActivity storageActivity, View view) {
        storageActivity.l3();
    }

    public static final void j3(StorageActivity storageActivity, View view) {
        storageActivity.n3();
    }

    public static final void k3(StorageActivity storageActivity) {
        ((x) storageActivity.V2()).g1();
    }

    private final void l3() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        try {
            startActivityForResult(Intent.createChooser(intent, getString(AbstractC0888D.f14457b)), 3);
        } catch (Exception unused) {
            H0 h02 = this.f11199K;
            if (h02 == null) {
                m.r("binding");
                h02 = null;
            }
            Snackbar.b0(h02.f15374h, AbstractC0888D.f14518n0, -1).R();
        }
    }

    public static final u m3(File file, StorageActivity storageActivity, String str) {
        m.e(str, HalmaParams.NAME);
        if (!n.P(str) && !n.B(str, File.separatorChar, false, 2, null) && !n.B(str, File.pathSeparatorChar, false, 2, null)) {
            File file2 = new File(file.getParent(), str);
            if (!file2.exists()) {
                file.renameTo(file2);
                ((x) storageActivity.V2()).g1();
            }
        }
        return u.f3817a;
    }

    private final void n3() {
        p3("", AbstractC0888D.f14473e0, AbstractC0888D.f14477f, new d(V2()));
    }

    public static final boolean o3(StorageActivity storageActivity, File file, MenuItem menuItem) {
        return ((x) storageActivity.V2()).e1(file, menuItem.getItemId());
    }

    private final void p3(String str, int i4, int i5, final InterfaceC1016l interfaceC1016l) {
        View viewInflate = getLayoutInflater().inflate(AbstractC0922z.f15233y, (ViewGroup) null);
        final EditText editText = (EditText) viewInflate.findViewById(AbstractC0920x.i4);
        final androidx.appcompat.app.a aVarX = new a.C0075a(this).w(viewInflate).q(i5, new DialogInterface.OnClickListener() { // from class: B0.d
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i6) {
                StorageActivity.q3(interfaceC1016l, editText, dialogInterface, i6);
            }
        }).k(R.string.cancel, null).x();
        editText.setText(str);
        editText.setHint(i4);
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: B0.e
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                return StorageActivity.r3(interfaceC1016l, editText, aVarX, textView, i6, keyEvent);
            }
        });
        editText.postDelayed(new Runnable() { // from class: B0.f
            @Override // java.lang.Runnable
            public final void run() {
                StorageActivity.s3(editText, this);
            }
        }, 500L);
    }

    public static final void q3(InterfaceC1016l interfaceC1016l, EditText editText, DialogInterface dialogInterface, int i4) {
        interfaceC1016l.o(editText.getText().toString());
    }

    public static final boolean r3(InterfaceC1016l interfaceC1016l, EditText editText, androidx.appcompat.app.a aVar, TextView textView, int i4, KeyEvent keyEvent) {
        if (i4 != 6) {
            return false;
        }
        interfaceC1016l.o(editText.getText().toString());
        aVar.dismiss();
        return true;
    }

    public static final void s3(EditText editText, StorageActivity storageActivity) {
        editText.requestFocus();
        Object systemService = storageActivity.getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 1);
        }
    }

    @Override // B0.y
    public void O1(String str) {
        m.e(str, "path");
        setResult(-1, new Intent().putExtra("request_file", str));
        finish();
    }

    @Override // B0.y
    public void Q0(final File file) {
        m.e(file, "file");
        String name = file.getName();
        m.d(name, "getName(...)");
        p3(name, AbstractC0888D.f14485g2, R.string.ok, new InterfaceC1016l() { // from class: B0.h
            @Override // g3.InterfaceC1016l
            public final Object o(Object obj) {
                return StorageActivity.m3(file, this, (String) obj);
            }
        });
    }

    @Override // B0.y
    public void Z0(String str) {
        m.e(str, HalmaParams.NAME);
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.TITLE", str);
        intent.addCategory("android.intent.category.OPENABLE");
        try {
            startActivityForResult(Intent.createChooser(intent, getString(AbstractC0888D.f14406O1)), 4);
        } catch (Exception unused) {
            H0 h02 = this.f11199K;
            if (h02 == null) {
                m.r("binding");
                h02 = null;
            }
            Snackbar.b0(h02.f15374h, AbstractC0888D.f14518n0, -1).R();
        }
    }

    @Override // f0.AbstractActivityC0911o
    /* renamed from: g3 */
    public void S2(x xVar) {
        m.e(xVar, "presenter");
        super.S2(xVar);
        this.f11198J = new C1402e(new b(xVar), new c(xVar));
        H0 h02 = this.f11199K;
        C1402e c1402e = null;
        if (h02 == null) {
            m.r("binding");
            h02 = null;
        }
        RecyclerView recyclerView = h02.f15370d;
        C1402e c1402e2 = this.f11198J;
        if (c1402e2 == null) {
            m.r("adapter");
        } else {
            c1402e = c1402e2;
        }
        recyclerView.setAdapter(c1402e);
    }

    @Override // B0.y
    public void h(boolean z4) {
        H0 h02 = this.f11199K;
        if (h02 == null) {
            m.r("binding");
            h02 = null;
        }
        h02.f15372f.setVisibility(z4 ? 0 : 8);
    }

    @Override // f0.AbstractActivityC0911o
    /* renamed from: h3 */
    public x U2() {
        Intent intent = getIntent();
        boolean z4 = false;
        if (intent != null && intent.getBooleanExtra("request_file", false)) {
            z4 = true;
        }
        Intent intent2 = getIntent();
        return new x(z4, intent2 != null ? intent2.getIntExtra("type", -1) : -1);
    }

    @Override // B0.y
    public void o0(int i4) {
        Toast.makeText(this, i4, 0).show();
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i4, int i5, Intent intent) {
        Uri data;
        Uri data2;
        super.onActivityResult(i4, i5, intent);
        if (i5 != -1) {
            return;
        }
        if (i4 == 3) {
            x xVar = (x) V2();
            if (intent == null || (data = intent.getData()) == null) {
                return;
            }
            xVar.h1(data);
            return;
        }
        if (i4 != 4) {
            return;
        }
        x xVar2 = (x) V2();
        if (intent == null || (data2 = intent.getData()) == null) {
            return;
        }
        xVar2.V0(data2);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (((x) V2()).c1()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // f0.AbstractActivityC0911o, f0.AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L, androidx.fragment.app.AbstractActivityC0719f, androidx.activity.ComponentActivity, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H0 h0D = H0.d(getLayoutInflater());
        this.f11199K = h0D;
        H0 h02 = null;
        if (h0D == null) {
            m.r("binding");
            h0D = null;
        }
        setContentView(h0D.a());
        AbstractSharedPreferencesOnSharedPreferenceChangeListenerC0896L.H2(this, AbstractC0888D.I6, false, 2, null);
        C0573k c0573k = C0573k.f2973a;
        H0 h03 = this.f11199K;
        if (h03 == null) {
            m.r("binding");
            h03 = null;
        }
        RecyclerView recyclerView = h03.f15370d;
        m.d(recyclerView, "list");
        C0573k.v(c0573k, recyclerView, 0, 1, null);
        H0 h04 = this.f11199K;
        if (h04 == null) {
            m.r("binding");
            h04 = null;
        }
        LinearLayout linearLayout = h04.f15371e;
        m.d(linearLayout, "panel");
        C0573k.s(c0573k, linearLayout, 0, 1, null);
        H0 h05 = this.f11199K;
        if (h05 == null) {
            m.r("binding");
            h05 = null;
        }
        h05.f15368b.setOnClickListener(new View.OnClickListener() { // from class: B0.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StorageActivity.i3(this.f117b, view);
            }
        });
        H0 h06 = this.f11199K;
        if (h06 == null) {
            m.r("binding");
            h06 = null;
        }
        h06.f15369c.setOnClickListener(new View.OnClickListener() { // from class: B0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StorageActivity.j3(this.f118b, view);
            }
        });
        H0 h07 = this.f11199K;
        if (h07 == null) {
            m.r("binding");
        } else {
            h02 = h07;
        }
        h02.f15373g.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: B0.c
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                StorageActivity.k3(this.f119a);
            }
        });
        setResult(0);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onPause() {
        super.onPause();
        ((x) V2()).v0(this);
    }

    @Override // androidx.fragment.app.AbstractActivityC0719f, android.app.Activity
    protected void onResume() {
        super.onResume();
        ((x) V2()).N0(this);
    }

    @Override // B0.y
    public void w1(int i4, final File file, View view) {
        m.e(file, "file");
        m.e(view, "view");
        O o4 = new O(this, view);
        o4.c(i4);
        o4.e(new O.c() { // from class: B0.g
            @Override // androidx.appcompat.widget.O.c
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return StorageActivity.o3(this.f127a, file, menuItem);
            }
        });
        o4.d(true);
        o4.f();
    }

    @Override // B0.y
    public void y0(List list) {
        m.e(list, "files");
        C1402e c1402e = this.f11198J;
        H0 h02 = null;
        if (c1402e == null) {
            m.r("adapter");
            c1402e = null;
        }
        c1402e.L(list);
        H0 h03 = this.f11199K;
        if (h03 == null) {
            m.r("binding");
        } else {
            h02 = h03;
        }
        h02.f15373g.setRefreshing(false);
    }
}