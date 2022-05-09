package mariana.lzry.finanzas.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0012\u0010\r\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lmariana/lzry/finanzas/di/RoomModule;", "", "()V", "INCOME_CATEGORIES_NAME", "", "provideIncomeCategoriesDao", "Lmariana/lzry/finanzas/data/database/dao/CategoriesDao;", "db", "Lmariana/lzry/finanzas/data/database/FinanzasDatabase;", "provideIncomeEntityDao", "Lmariana/lzry/finanzas/data/database/dao/IncomeEntriesWritingDao;", "provideReadOutcomeEntityDao", "Lmariana/lzry/finanzas/data/database/dao/OutcomeEntriesReadingDao;", "provideRoom", "context", "Landroid/content/Context;", "provideWriteOutcomeEntityDao", "Lmariana/lzry/finanzas/data/database/dao/OutcomeEntriesWritingDao;", "providegetIncomeEntityDao", "Lmariana/lzry/finanzas/data/database/dao/IncomeEntriesReadingDao;", "app_debug"})
@dagger.Module()
public final class RoomModule {
    @org.jetbrains.annotations.NotNull()
    public static final mariana.lzry.finanzas.di.RoomModule INSTANCE = null;
    private static final java.lang.String INCOME_CATEGORIES_NAME = "income_categories_database";
    
    private RoomModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final mariana.lzry.finanzas.data.database.FinanzasDatabase provideRoom(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final mariana.lzry.finanzas.data.database.dao.CategoriesDao provideIncomeCategoriesDao(@org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.data.database.FinanzasDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final mariana.lzry.finanzas.data.database.dao.IncomeEntriesWritingDao provideIncomeEntityDao(@org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.data.database.FinanzasDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final mariana.lzry.finanzas.data.database.dao.IncomeEntriesReadingDao providegetIncomeEntityDao(@org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.data.database.FinanzasDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final mariana.lzry.finanzas.data.database.dao.OutcomeEntriesWritingDao provideWriteOutcomeEntityDao(@org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.data.database.FinanzasDatabase db) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final mariana.lzry.finanzas.data.database.dao.OutcomeEntriesReadingDao provideReadOutcomeEntityDao(@org.jetbrains.annotations.NotNull()
    mariana.lzry.finanzas.data.database.FinanzasDatabase db) {
        return null;
    }
}