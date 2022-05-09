package mariana.lzry.finanzas.data.database;

import java.lang.System;

@androidx.room.Database(entities = {mariana.lzry.finanzas.data.database.entities.IncomeCategoryEntity.class, mariana.lzry.finanzas.data.database.entities.OutcomeCategoryEntity.class, mariana.lzry.finanzas.data.database.entities.IncomeEntryEntity.class, mariana.lzry.finanzas.data.database.entities.OutcomeEntryEntity.class}, version = 5, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lmariana/lzry/finanzas/data/database/FinanzasDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getAllIncomeEntriesDao", "Lmariana/lzry/finanzas/data/database/dao/IncomeEntriesReadingDao;", "getAllOutcomeEntriesDao", "Lmariana/lzry/finanzas/data/database/dao/OutcomeEntriesReadingDao;", "getIncomeCategoryDao", "Lmariana/lzry/finanzas/data/database/dao/CategoriesDao;", "insertIncomeEntryDao", "Lmariana/lzry/finanzas/data/database/dao/IncomeEntriesWritingDao;", "insertOutcomeEntryDao", "Lmariana/lzry/finanzas/data/database/dao/OutcomeEntriesWritingDao;", "app_debug"})
public abstract class FinanzasDatabase extends androidx.room.RoomDatabase {
    
    public FinanzasDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract mariana.lzry.finanzas.data.database.dao.CategoriesDao getIncomeCategoryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract mariana.lzry.finanzas.data.database.dao.IncomeEntriesWritingDao insertIncomeEntryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract mariana.lzry.finanzas.data.database.dao.IncomeEntriesReadingDao getAllIncomeEntriesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract mariana.lzry.finanzas.data.database.dao.OutcomeEntriesWritingDao insertOutcomeEntryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract mariana.lzry.finanzas.data.database.dao.OutcomeEntriesReadingDao getAllOutcomeEntriesDao();
}