// Generated by Dagger (https://dagger.dev).
package mariana.lzry.finanzas.domain.usecases;

import dagger.internal.Factory;
import javax.inject.Provider;
import mariana.lzry.finanzas.data.repositories.Repository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WriteIncomeEntriesUseCase_Factory implements Factory<WriteIncomeEntriesUseCase> {
  private final Provider<Repository> repositoryProvider;

  public WriteIncomeEntriesUseCase_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public WriteIncomeEntriesUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static WriteIncomeEntriesUseCase_Factory create(Provider<Repository> repositoryProvider) {
    return new WriteIncomeEntriesUseCase_Factory(repositoryProvider);
  }

  public static WriteIncomeEntriesUseCase newInstance(Repository repository) {
    return new WriteIncomeEntriesUseCase(repository);
  }
}
