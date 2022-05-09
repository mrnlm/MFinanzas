package mariana.lzry.finanzas.presentation.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\b\u0010\u0015\u001a\u00020\u0012H\u0016J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lmariana/lzry/finanzas/presentation/view/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lmariana/lzry/finanzas/databinding/MainActivityBinding;", "detailsFragment", "Lmariana/lzry/finanzas/presentation/view/details/DetailsFragment;", "doubleBackToExitPressedOnce", "", "homeFragment", "Lmariana/lzry/finanzas/presentation/view/home/HomeFragment;", "incomeFragment", "Lmariana/lzry/finanzas/presentation/view/income/IncomeFragment;", "outcomeFragment", "Lmariana/lzry/finanzas/presentation/view/outcome/OutcomeFragment;", "settingsFragment", "Lmariana/lzry/finanzas/presentation/view/settings/SettingsFragment;", "initBottomNavigationView", "", "initFragmentView", "initView", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setFragment", "fragment", "Landroidx/fragment/app/Fragment;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private mariana.lzry.finanzas.databinding.MainActivityBinding binding;
    private mariana.lzry.finanzas.presentation.view.home.HomeFragment homeFragment;
    private mariana.lzry.finanzas.presentation.view.income.IncomeFragment incomeFragment;
    private mariana.lzry.finanzas.presentation.view.outcome.OutcomeFragment outcomeFragment;
    private mariana.lzry.finanzas.presentation.view.details.DetailsFragment detailsFragment;
    private mariana.lzry.finanzas.presentation.view.settings.SettingsFragment settingsFragment;
    private boolean doubleBackToExitPressedOnce = false;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void initView() {
    }
    
    private final void initFragmentView() {
    }
    
    private final void initBottomNavigationView() {
    }
    
    private final void setFragment(androidx.fragment.app.Fragment fragment) {
    }
}