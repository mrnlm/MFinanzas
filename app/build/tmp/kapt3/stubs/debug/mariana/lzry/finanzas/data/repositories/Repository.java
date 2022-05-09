package mariana.lzry.finanzas.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lmariana/lzry/finanzas/data/repositories/Repository;", "", "categoriesDao", "Lmariana/lzry/finanzas/data/database/dao/CategoriesDao;", "incomeEntriesWritingDao", "Lmariana/lzry/finanzas/data/database/dao/IncomeEntriesWritingDao;", "incomeEntriesReadingDao", "Lmariana/lzry/finanzas/data/database/dao/IncomeEntriesReadingDao;", "outcomeEntriesWritingDao", "Lmariana/lzry/finanzas/data/database/dao/OutcomeEntriesWritingDao;", "outcomeEntriesReadingDao", "Lmariana/lzry/finanzas/data/database/dao/OutcomeEntriesReadingDao;", "(Lmariana/lzry/finanzas/data/database/dao/CategoriesDao;Lmariana/lzry/finanzas/data/database/dao/IncomeEntriesWritingDao;Lmariana/lzry/finanzas/data/database/dao/IncomeEntriesReadingDao;Lmariana/lzry/finanzas/data/database/dao/OutcomeEntriesWritingDao;Lmariana/lzry/finanzas/data/database/dao/OutcomeEntriesReadingDao;)V", "getAllIncomeCategoriesFromDB", "", "Lmariana/lzry/finanzas/presentation/model/Category;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllIncomeEntriesFromDB", "Lmariana/lzry/finanzas/presentation/model/IncomeEntry;", "getAllOutcomeCategoriesFromDB", "getAllOutcomeEntriesFromDB", "Lmariana/lzry/finanzas/presentation/model/OutcomeEntry;", "insertIncomeEntryIntoDB", "", "incomeEntry", "(Lmariana/lzry/finanzas/presentation/model/IncomeEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertOutcomeEntryIntoDB", "outcomeEntry", "(Lmariana/lzry/finanzas/presentation/model/OutcomeEntry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class Repository {
    private final mariana.lzry.finanzas.data.database.dao.CategoriesDao categoriesDao = null;
    private final mariana.lzry.finanzas.data.database.dao.IncomeEntriesWritingDao incomeEntriesWritingDao = null;
    private final mariana.lzry.finanzas.data.database.dao.IncomeEntriesReadingDao incomeEntriesReadingDao = null;
    private final mariana.lzry.finanzas.data.database.dao.OutcomeEntriesWritingDao outcomeEntriesWritingDao = null;
    private final mariana.lzry.finanzas.data.database.dao.OutcomeEntriesReadingDao outcomeEntriesReadingDao = null;
    
    @javax.inject.Inject()
    public Repository(@org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.data.database.dao.CategoriesDao categoriesDao, @org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.data.database.dao.IncomeEntriesWritingDao incomeEntriesWritingDao, @org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.data.database.dao.IncomeEntriesReadingDao incomeEntriesReadingDao, @org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.data.database.dao.OutcomeEntriesWritingDao outcomeEntriesWritingDao, @org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.data.database.dao.OutcomeEntriesReadingDao outcomeEntriesReadingDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllIncomeCategoriesFromDB(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<mariana.lzry.finanzas.presentation.model.Category>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllOutcomeCategoriesFromDB(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<mariana.lzry.finanzas.presentation.model.Category>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertIncomeEntryIntoDB(@org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.presentation.model.IncomeEntry incomeEntry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllIncomeEntriesFromDB(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<mariana.lzry.finanzas.presentation.model.IncomeEntry>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertOutcomeEntryIntoDB(@org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.presentation.model.OutcomeEntry outcomeEntry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllOutcomeEntriesFromDB(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<mariana.lzry.finanzas.presentation.model.OutcomeEntry>> continuation) {
        return null;
    }
}