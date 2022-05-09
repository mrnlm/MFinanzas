// Generated by Dagger (https://dagger.dev).
package mariana.lzry.finanzas.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import mariana.lzry.finanzas.data.database.FinanzasDatabase;
import mariana.lzry.finanzas.data.database.dao.OutcomeEntriesWritingDao;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoomModule_ProvideWriteOutcomeEntityDaoFactory implements Factory<OutcomeEntriesWritingDao> {
  private final Provider<FinanzasDatabase> dbProvider;

  public RoomModule_ProvideWriteOutcomeEntityDaoFactory(Provider<FinanzasDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public OutcomeEntriesWritingDao get() {
    return provideWriteOutcomeEntityDao(dbProvider.get());
  }

  public static RoomModule_ProvideWriteOutcomeEntityDaoFactory create(
      Provider<FinanzasDatabase> dbProvider) {
    return new RoomModule_ProvideWriteOutcomeEntityDaoFactory(dbProvider);
  }

  public static OutcomeEntriesWritingDao provideWriteOutcomeEntityDao(FinanzasDatabase db) {
    return Preconditions.checkNotNullFromProvides(RoomModule.INSTANCE.provideWriteOutcomeEntityDao(db));
  }
}
