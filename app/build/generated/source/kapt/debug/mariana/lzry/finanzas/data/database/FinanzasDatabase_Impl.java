package mariana.lzry.finanzas.data.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import mariana.lzry.finanzas.data.database.dao.CategoriesDao;
import mariana.lzry.finanzas.data.database.dao.CategoriesDao_Impl;
import mariana.lzry.finanzas.data.database.dao.IncomeEntriesReadingDao;
import mariana.lzry.finanzas.data.database.dao.IncomeEntriesReadingDao_Impl;
import mariana.lzry.finanzas.data.database.dao.IncomeEntriesWritingDao;
import mariana.lzry.finanzas.data.database.dao.IncomeEntriesWritingDao_Impl;
import mariana.lzry.finanzas.data.database.dao.OutcomeEntriesReadingDao;
import mariana.lzry.finanzas.data.database.dao.OutcomeEntriesReadingDao_Impl;
import mariana.lzry.finanzas.data.database.dao.OutcomeEntriesWritingDao;
import mariana.lzry.finanzas.data.database.dao.OutcomeEntriesWritingDao_Impl;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FinanzasDatabase_Impl extends FinanzasDatabase {
  private volatile CategoriesDao _categoriesDao;

  private volatile IncomeEntriesWritingDao _incomeEntriesWritingDao;

  private volatile IncomeEntriesReadingDao _incomeEntriesReadingDao;

  private volatile OutcomeEntriesWritingDao _outcomeEntriesWritingDao;

  private volatile OutcomeEntriesReadingDao _outcomeEntriesReadingDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(5) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `categories_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `outcome_categories_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `income_entries_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `amount` REAL NOT NULL, `category` TEXT NOT NULL, `date` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `outcome_entries_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `amount` REAL NOT NULL, `category` TEXT NOT NULL, `date` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '74e56b5f16bd3a30814c119c17688631')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `categories_table`");
        _db.execSQL("DROP TABLE IF EXISTS `outcome_categories_table`");
        _db.execSQL("DROP TABLE IF EXISTS `income_entries_table`");
        _db.execSQL("DROP TABLE IF EXISTS `outcome_entries_table`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCategoriesTable = new HashMap<String, TableInfo.Column>(2);
        _columnsCategoriesTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCategoriesTable.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCategoriesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCategoriesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCategoriesTable = new TableInfo("categories_table", _columnsCategoriesTable, _foreignKeysCategoriesTable, _indicesCategoriesTable);
        final TableInfo _existingCategoriesTable = TableInfo.read(_db, "categories_table");
        if (! _infoCategoriesTable.equals(_existingCategoriesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "categories_table(mariana.lzry.finanzas.data.database.entities.IncomeCategoryEntity).\n"
                  + " Expected:\n" + _infoCategoriesTable + "\n"
                  + " Found:\n" + _existingCategoriesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsOutcomeCategoriesTable = new HashMap<String, TableInfo.Column>(2);
        _columnsOutcomeCategoriesTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutcomeCategoriesTable.put("title", new TableInfo.Column("title", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOutcomeCategoriesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOutcomeCategoriesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOutcomeCategoriesTable = new TableInfo("outcome_categories_table", _columnsOutcomeCategoriesTable, _foreignKeysOutcomeCategoriesTable, _indicesOutcomeCategoriesTable);
        final TableInfo _existingOutcomeCategoriesTable = TableInfo.read(_db, "outcome_categories_table");
        if (! _infoOutcomeCategoriesTable.equals(_existingOutcomeCategoriesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "outcome_categories_table(mariana.lzry.finanzas.data.database.entities.OutcomeCategoryEntity).\n"
                  + " Expected:\n" + _infoOutcomeCategoriesTable + "\n"
                  + " Found:\n" + _existingOutcomeCategoriesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsIncomeEntriesTable = new HashMap<String, TableInfo.Column>(4);
        _columnsIncomeEntriesTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIncomeEntriesTable.put("amount", new TableInfo.Column("amount", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIncomeEntriesTable.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsIncomeEntriesTable.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysIncomeEntriesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesIncomeEntriesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoIncomeEntriesTable = new TableInfo("income_entries_table", _columnsIncomeEntriesTable, _foreignKeysIncomeEntriesTable, _indicesIncomeEntriesTable);
        final TableInfo _existingIncomeEntriesTable = TableInfo.read(_db, "income_entries_table");
        if (! _infoIncomeEntriesTable.equals(_existingIncomeEntriesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "income_entries_table(mariana.lzry.finanzas.data.database.entities.IncomeEntryEntity).\n"
                  + " Expected:\n" + _infoIncomeEntriesTable + "\n"
                  + " Found:\n" + _existingIncomeEntriesTable);
        }
        final HashMap<String, TableInfo.Column> _columnsOutcomeEntriesTable = new HashMap<String, TableInfo.Column>(4);
        _columnsOutcomeEntriesTable.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutcomeEntriesTable.put("amount", new TableInfo.Column("amount", "REAL", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutcomeEntriesTable.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOutcomeEntriesTable.put("date", new TableInfo.Column("date", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOutcomeEntriesTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOutcomeEntriesTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOutcomeEntriesTable = new TableInfo("outcome_entries_table", _columnsOutcomeEntriesTable, _foreignKeysOutcomeEntriesTable, _indicesOutcomeEntriesTable);
        final TableInfo _existingOutcomeEntriesTable = TableInfo.read(_db, "outcome_entries_table");
        if (! _infoOutcomeEntriesTable.equals(_existingOutcomeEntriesTable)) {
          return new RoomOpenHelper.ValidationResult(false, "outcome_entries_table(mariana.lzry.finanzas.data.database.entities.OutcomeEntryEntity).\n"
                  + " Expected:\n" + _infoOutcomeEntriesTable + "\n"
                  + " Found:\n" + _existingOutcomeEntriesTable);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "74e56b5f16bd3a30814c119c17688631", "d96b2136e2cae7c25e3b12aeb6edddb3");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "categories_table","outcome_categories_table","income_entries_table","outcome_entries_table");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `categories_table`");
      _db.execSQL("DELETE FROM `outcome_categories_table`");
      _db.execSQL("DELETE FROM `income_entries_table`");
      _db.execSQL("DELETE FROM `outcome_entries_table`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CategoriesDao.class, CategoriesDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(IncomeEntriesWritingDao.class, IncomeEntriesWritingDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(IncomeEntriesReadingDao.class, IncomeEntriesReadingDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(OutcomeEntriesWritingDao.class, OutcomeEntriesWritingDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(OutcomeEntriesReadingDao.class, OutcomeEntriesReadingDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public CategoriesDao getIncomeCategoryDao() {
    if (_categoriesDao != null) {
      return _categoriesDao;
    } else {
      synchronized(this) {
        if(_categoriesDao == null) {
          _categoriesDao = new CategoriesDao_Impl(this);
        }
        return _categoriesDao;
      }
    }
  }

  @Override
  public IncomeEntriesWritingDao insertIncomeEntryDao() {
    if (_incomeEntriesWritingDao != null) {
      return _incomeEntriesWritingDao;
    } else {
      synchronized(this) {
        if(_incomeEntriesWritingDao == null) {
          _incomeEntriesWritingDao = new IncomeEntriesWritingDao_Impl(this);
        }
        return _incomeEntriesWritingDao;
      }
    }
  }

  @Override
  public IncomeEntriesReadingDao getAllIncomeEntriesDao() {
    if (_incomeEntriesReadingDao != null) {
      return _incomeEntriesReadingDao;
    } else {
      synchronized(this) {
        if(_incomeEntriesReadingDao == null) {
          _incomeEntriesReadingDao = new IncomeEntriesReadingDao_Impl(this);
        }
        return _incomeEntriesReadingDao;
      }
    }
  }

  @Override
  public OutcomeEntriesWritingDao insertOutcomeEntryDao() {
    if (_outcomeEntriesWritingDao != null) {
      return _outcomeEntriesWritingDao;
    } else {
      synchronized(this) {
        if(_outcomeEntriesWritingDao == null) {
          _outcomeEntriesWritingDao = new OutcomeEntriesWritingDao_Impl(this);
        }
        return _outcomeEntriesWritingDao;
      }
    }
  }

  @Override
  public OutcomeEntriesReadingDao getAllOutcomeEntriesDao() {
    if (_outcomeEntriesReadingDao != null) {
      return _outcomeEntriesReadingDao;
    } else {
      synchronized(this) {
        if(_outcomeEntriesReadingDao == null) {
          _outcomeEntriesReadingDao = new OutcomeEntriesReadingDao_Impl(this);
        }
        return _outcomeEntriesReadingDao;
      }
    }
  }
}
