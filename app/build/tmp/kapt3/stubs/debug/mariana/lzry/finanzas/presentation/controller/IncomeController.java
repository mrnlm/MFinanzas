package mariana.lzry.finanzas.presentation.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\"J\u0006\u0010#\u001a\u00020$R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006%"}, d2 = {"Lmariana/lzry/finanzas/presentation/controller/IncomeController;", "", "()V", "amount", "", "categories", "", "Lmariana/lzry/finanzas/presentation/model/Category;", "getCategoriesUseCase", "Lmariana/lzry/finanzas/domain/usecases/GetCategoriesUseCase;", "getGetCategoriesUseCase", "()Lmariana/lzry/finanzas/domain/usecases/GetCategoriesUseCase;", "setGetCategoriesUseCase", "(Lmariana/lzry/finanzas/domain/usecases/GetCategoriesUseCase;)V", "selectedCategory", "textWatcher", "Landroid/text/TextWatcher;", "getTextWatcher", "()Landroid/text/TextWatcher;", "setTextWatcher", "(Landroid/text/TextWatcher;)V", "writeIncomeEntriesUseCase", "Lmariana/lzry/finanzas/domain/usecases/WriteIncomeEntriesUseCase;", "getWriteIncomeEntriesUseCase", "()Lmariana/lzry/finanzas/domain/usecases/WriteIncomeEntriesUseCase;", "setWriteIncomeEntriesUseCase", "(Lmariana/lzry/finanzas/domain/usecases/WriteIncomeEntriesUseCase;)V", "callWriteIncomeEntryUseCase", "", "incomeEntry", "Lmariana/lzry/finanzas/presentation/model/IncomeEntry;", "getAllCategories", "selectIncomeCategory", "spinnerSelection", "", "verifyAmountAndCategoryAreSet", "", "app_debug"})
@javax.inject.Singleton()
public final class IncomeController {
    @javax.inject.Inject()
    public mariana.lzry.finanzas.domain.usecases.GetCategoriesUseCase getCategoriesUseCase;
    @javax.inject.Inject()
    public mariana.lzry.finanzas.domain.usecases.WriteIncomeEntriesUseCase writeIncomeEntriesUseCase;
    private mariana.lzry.finanzas.presentation.model.Category selectedCategory;
    private double amount = 0.0;
    private java.util.List<mariana.lzry.finanzas.presentation.model.Category> categories;
    @org.jetbrains.annotations.NotNull()
    private android.text.TextWatcher textWatcher;
    
    @javax.inject.Inject()
    public IncomeController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mariana.lzry.finanzas.domain.usecases.GetCategoriesUseCase getGetCategoriesUseCase() {
        return null;
    }
    
    public final void setGetCategoriesUseCase(@org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.domain.usecases.GetCategoriesUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mariana.lzry.finanzas.domain.usecases.WriteIncomeEntriesUseCase getWriteIncomeEntriesUseCase() {
        return null;
    }
    
    public final void setWriteIncomeEntriesUseCase(@org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.domain.usecases.WriteIncomeEntriesUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<mariana.lzry.finanzas.presentation.model.Category> getAllCategories() {
        return null;
    }
    
    public final void selectIncomeCategory(int spinnerSelection) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.text.TextWatcher getTextWatcher() {
        return null;
    }
    
    public final void setTextWatcher(@org.jetbrains.annotations.NotNull()
    android.text.TextWatcher p0) {
    }
    
    public final boolean verifyAmountAndCategoryAreSet() {
        return false;
    }
    
    private final void callWriteIncomeEntryUseCase(mariana.lzry.finanzas.presentation.model.IncomeEntry incomeEntry) {
    }
}