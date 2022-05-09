package mariana.lzry.finanzas.presentation.view.income;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u0000 \'2\u00020\u00012\u00020\u0002:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J$\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J0\u0010\u001a\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J\u0016\u0010\"\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001cH\u0016J\u001a\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010%\u001a\u00020\u0010H\u0002J\b\u0010&\u001a\u00020\u0010H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006("}, d2 = {"Lmariana/lzry/finanzas/presentation/view/income/IncomeFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "()V", "_binding", "Lmariana/lzry/finanzas/databinding/IncomeFragmentBinding;", "binding", "getBinding", "()Lmariana/lzry/finanzas/databinding/IncomeFragmentBinding;", "incomeController", "Lmariana/lzry/finanzas/presentation/controller/IncomeController;", "getIncomeController", "()Lmariana/lzry/finanzas/presentation/controller/IncomeController;", "setIncomeController", "(Lmariana/lzry/finanzas/presentation/controller/IncomeController;)V", "createIncomeCategorySpinner", "", "hideKeyboard", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onItemSelected", "p0", "Landroid/widget/AdapterView;", "p1", "p2", "", "p3", "", "onNothingSelected", "onViewCreated", "view", "setIncomeAmountTextWatcher", "setSaveIncomeClickListener", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class IncomeFragment extends androidx.fragment.app.Fragment implements android.widget.AdapterView.OnItemSelectedListener {
    @javax.inject.Inject()
    public mariana.lzry.finanzas.presentation.controller.IncomeController incomeController;
    private mariana.lzry.finanzas.databinding.IncomeFragmentBinding _binding;
    @org.jetbrains.annotations.NotNull()
    public static final mariana.lzry.finanzas.presentation.view.income.IncomeFragment.Companion Companion = null;
    
    public IncomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mariana.lzry.finanzas.presentation.controller.IncomeController getIncomeController() {
        return null;
    }
    
    public final void setIncomeController(@org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.presentation.controller.IncomeController p0) {
    }
    
    private final mariana.lzry.finanzas.databinding.IncomeFragmentBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void createIncomeCategorySpinner() {
    }
    
    private final void setIncomeAmountTextWatcher() {
    }
    
    private final void setSaveIncomeClickListener() {
    }
    
    private final void hideKeyboard() {
    }
    
    @java.lang.Override()
    public void onItemSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> p0, @org.jetbrains.annotations.Nullable()
    android.view.View p1, int p2, long p3) {
    }
    
    @java.lang.Override()
    public void onNothingSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lmariana/lzry/finanzas/presentation/view/income/IncomeFragment$Companion;", "", "()V", "newInstance", "Lmariana/lzry/finanzas/presentation/view/income/IncomeFragment;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final mariana.lzry.finanzas.presentation.view.income.IncomeFragment newInstance() {
            return null;
        }
    }
}