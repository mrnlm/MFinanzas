package mariana.lzry.finanzas.presentation.controller;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0010R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lmariana/lzry/finanzas/presentation/controller/HomeController;", "", "()V", "getIncomeEntriesUseCase", "Lmariana/lzry/finanzas/domain/usecases/GetIncomeEntriesUseCase;", "getGetIncomeEntriesUseCase", "()Lmariana/lzry/finanzas/domain/usecases/GetIncomeEntriesUseCase;", "setGetIncomeEntriesUseCase", "(Lmariana/lzry/finanzas/domain/usecases/GetIncomeEntriesUseCase;)V", "getOutcomeEntriesUseCase", "Lmariana/lzry/finanzas/domain/usecases/GetOutcomeEntriesUseCase;", "getGetOutcomeEntriesUseCase", "()Lmariana/lzry/finanzas/domain/usecases/GetOutcomeEntriesUseCase;", "setGetOutcomeEntriesUseCase", "(Lmariana/lzry/finanzas/domain/usecases/GetOutcomeEntriesUseCase;)V", "getAllIncomeEntries", "", "Lmariana/lzry/finanzas/presentation/model/IncomeEntry;", "getAllOutcomeEntries", "Lmariana/lzry/finanzas/presentation/model/OutcomeEntry;", "app_debug"})
@javax.inject.Singleton()
public final class HomeController {
    @javax.inject.Inject()
    public mariana.lzry.finanzas.domain.usecases.GetIncomeEntriesUseCase getIncomeEntriesUseCase;
    @javax.inject.Inject()
    public mariana.lzry.finanzas.domain.usecases.GetOutcomeEntriesUseCase getOutcomeEntriesUseCase;
    
    @javax.inject.Inject()
    public HomeController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mariana.lzry.finanzas.domain.usecases.GetIncomeEntriesUseCase getGetIncomeEntriesUseCase() {
        return null;
    }
    
    public final void setGetIncomeEntriesUseCase(@org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.domain.usecases.GetIncomeEntriesUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final mariana.lzry.finanzas.domain.usecases.GetOutcomeEntriesUseCase getGetOutcomeEntriesUseCase() {
        return null;
    }
    
    public final void setGetOutcomeEntriesUseCase(@org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.domain.usecases.GetOutcomeEntriesUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<mariana.lzry.finanzas.presentation.model.IncomeEntry> getAllIncomeEntries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<mariana.lzry.finanzas.presentation.model.OutcomeEntry> getAllOutcomeEntries() {
        return null;
    }
}