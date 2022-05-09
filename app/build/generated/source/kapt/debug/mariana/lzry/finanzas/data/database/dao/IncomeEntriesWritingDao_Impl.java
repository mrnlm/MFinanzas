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
import mariana.lzry.finanzas.data.database.entities.IncomeEntryEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class IncomeEntriesWritingDao_Impl implements IncomeEntriesWritingDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<IncomeEntryEntity> __insertionAdapterOfIncomeEntryEntity;

  public IncomeEntriesWritingDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfIncomeEntryEntity = new EntityInsertionAdapter<IncomeEntryEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `income_entries_table` (`id`,`amount`,`category`,`date`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, IncomeEntryEntity value) {
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
  public Object insertIncomeEntry(final IncomeEntryEntity incomeEntryEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfIncomeEntryEntity.insert(incomeEntryEntity);
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
