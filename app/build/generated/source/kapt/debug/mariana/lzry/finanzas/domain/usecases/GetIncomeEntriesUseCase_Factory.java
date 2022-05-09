// Generated by Dagger (https://dagger.dev).
package mariana.lzry.finanzas.domain.usecases;

import dagger.internal.Factory;
import javax.inject.Provider;
import mariana.lzry.finanzas.data.repositories.Repository;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GetIncomeEntriesUseCase_Factory implements Factory<GetIncomeEntriesUseCase> {
  private final Provider<Repository> repositoryProvider;

  public GetIncomeEntriesUseCase_Factory(Provider<Repository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetIncomeEntriesUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetIncomeEntriesUseCase_Factory create(Provider<Repository> repositoryProvider) {
    return new GetIncomeEntriesUseCase_Factory(repositoryProvider);
  }

  public static GetIncomeEntriesUseCase newInstance(Repository repository) {
    return new GetIncomeEntriesUseCase(repository);
  }
}
