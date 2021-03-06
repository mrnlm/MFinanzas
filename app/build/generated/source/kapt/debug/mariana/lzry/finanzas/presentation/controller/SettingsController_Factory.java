// Generated by Dagger (https://dagger.dev).
package mariana.lzry.finanzas.presentation.controller;

import dagger.internal.Factory;
import javax.inject.Provider;
import mariana.lzry.finanzas.domain.usecases.GetCategoriesUseCase;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingsController_Factory implements Factory<SettingsController> {
  private final Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider;

  public SettingsController_Factory(Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider) {
    this.getCategoriesUseCaseProvider = getCategoriesUseCaseProvider;
  }

  @Override
  public SettingsController get() {
    SettingsController instance = newInstance();
    SettingsController_MembersInjector.injectGetCategoriesUseCase(instance, getCategoriesUseCaseProvider.get());
    return instance;
  }

  public static SettingsController_Factory create(
      Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider) {
    return new SettingsController_Factory(getCategoriesUseCaseProvider);
  }

  public static SettingsController newInstance() {
    return new SettingsController();
  }
}
