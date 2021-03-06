// Generated by Dagger (https://dagger.dev).
package mariana.lzry.finanzas.presentation.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import mariana.lzry.finanzas.domain.usecases.GetIncomeEntriesUseCase;
import mariana.lzry.finanzas.domain.usecases.GetOutcomeEntriesUseCase;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeController_Factory implements Factory<HomeController> {
  private final Provider<GetIncomeEntriesUseCase> getIncomeEntriesUseCaseProvider;

  private final Provider<GetOutcomeEntriesUseCase> getOutcomeEntriesUseCaseProvider;

  public HomeController_Factory(Provider<GetIncomeEntriesUseCase> getIncomeEntriesUseCaseProvider,
      Provider<GetOutcomeEntriesUseCase> getOutcomeEntriesUseCaseProvider) {
    this.getIncomeEntriesUseCaseProvider = getIncomeEntriesUseCaseProvider;
    this.getOutcomeEntriesUseCaseProvider = getOutcomeEntriesUseCaseProvider;
  }

  @Override
  public HomeController get() {
    HomeController instance = newInstance();
    HomeController_MembersInjector.injectGetIncomeEntriesUseCase(instance, getIncomeEntriesUseCaseProvider.get());
    HomeController_MembersInjector.injectGetOutcomeEntriesUseCase(instance, getOutcomeEntriesUseCaseProvider.get());
    return instance;
  }

  public static HomeController_Factory create(
      Provider<GetIncomeEntriesUseCase> getIncomeEntriesUseCaseProvider,
      Provider<GetOutcomeEntriesUseCase> getOutcomeEntriesUseCaseProvider) {
    return new HomeController_Factory(getIncomeEntriesUseCaseProvider, getOutcomeEntriesUseCaseProvider);
  }

  public static HomeController newInstance() {
    return new HomeController();
  }
}
