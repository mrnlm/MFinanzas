// Generated by Dagger (https://dagger.dev).
package mariana.lzry.finanzas.presentation.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import mariana.lzry.finanzas.domain.usecases.GetCategoriesUseCase;
import mariana.lzry.finanzas.domain.usecases.WriteIncomeEntriesUseCase;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class IncomeController_Factory implements Factory<IncomeController> {
  private final Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider;

  private final Provider<WriteIncomeEntriesUseCase> writeIncomeEntriesUseCaseProvider;

  public IncomeController_Factory(Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider,
      Provider<WriteIncomeEntriesUseCase> writeIncomeEntriesUseCaseProvider) {
    this.getCategoriesUseCaseProvider = getCategoriesUseCaseProvider;
    this.writeIncomeEntriesUseCaseProvider = writeIncomeEntriesUseCaseProvider;
  }

  @Override
  public IncomeController get() {
    IncomeController instance = newInstance();
    IncomeController_MembersInjector.injectGetCategoriesUseCase(instance, getCategoriesUseCaseProvider.get());
    IncomeController_MembersInjector.injectWriteIncomeEntriesUseCase(instance, writeIncomeEntriesUseCaseProvider.get());
    return instance;
  }

  public static IncomeController_Factory create(
      Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider,
      Provider<WriteIncomeEntriesUseCase> writeIncomeEntriesUseCaseProvider) {
    return new IncomeController_Factory(getCategoriesUseCaseProvider, writeIncomeEntriesUseCaseProvider);
  }

  public static IncomeController newInstance() {
    return new IncomeController();
  }
}
