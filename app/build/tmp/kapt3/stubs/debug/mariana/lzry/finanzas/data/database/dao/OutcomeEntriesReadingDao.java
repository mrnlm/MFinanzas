package mariana.lzry.finanzas.data.database.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0006"}, d2 = {"Lmariana/lzry/finanzas/data/database/dao/OutcomeEntriesReadingDao;", "", "getAllOutcomeEntries", "", "Lmariana/lzry/finanzas/data/database/entities/OutcomeEntryEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface OutcomeEntriesReadingDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM outcome_entries_table ORDER BY id DESC")
    public abstract java.lang.Object getAllOutcomeEntries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<mariana.lzry.finanzas.data.database.entities.OutcomeEntryEntity>> continuation);
}