package mariana.lzry.finanzas.data.database.dao;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;
import mariana.lzry.finanzas.data.database.entities.IncomeCategoryEntity;
import mariana.lzry.finanzas.data.database.entities.OutcomeCategoryEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CategoriesDao_Impl implements CategoriesDao {
  private final RoomDatabase __db;

  public CategoriesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public Object getAllIncomeCategories(
      final Continuation<? super List<IncomeCategoryEntity>> continuation) {
    final String _sql = "SELECT * FROM categories_table ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<IncomeCategoryEntity>>() {
      @Override
      public List<IncomeCategoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final List<IncomeCategoryEntity> _result = new ArrayList<IncomeCategoryEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final IncomeCategoryEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new IncomeCategoryEntity(_tmpId,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllOutcomeCategories(
      final Continuation<? super List<OutcomeCategoryEntity>> continuation) {
    final String _sql = "SELECT * FROM outcome_categories_table ORDER BY id DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<OutcomeCategoryEntity>>() {
      @Override
      public List<OutcomeCategoryEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final List<OutcomeCategoryEntity> _result = new ArrayList<OutcomeCategoryEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final OutcomeCategoryEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            _item = new OutcomeCategoryEntity(_tmpId,_tmpTitle);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
