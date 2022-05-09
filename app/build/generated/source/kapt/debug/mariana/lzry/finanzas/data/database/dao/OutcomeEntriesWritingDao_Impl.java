package mariana.lzry.finanzas.data.database.dao;

import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import mariana.lzry.finanzas.data.database.entities.OutcomeEntryEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OutcomeEntriesWritingDao_Impl implements OutcomeEntriesWritingDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<OutcomeEntryEntity> __insertionAdapterOfOutcomeEntryEntity;

  public OutcomeEntriesWritingDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOutcomeEntryEntity = new EntityInsertionAdapter<OutcomeEntryEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `outcome_entries_table` (`id`,`amount`,`category`,`date`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OutcomeEntryEntity value) {
        stmt.bindLong(1, value.getId());
        stmt.bindDouble(2, value.getAmount());
        if (value.getCategory() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getCategory());
        }
        if (value.getDate() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDate());
        }
      }
    };
  }

  @Override
  public Object insertOutcomeEntry(final OutcomeEntryEntity outcomeEntryEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfOutcomeEntryEntity.insert(outcomeEntryEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
