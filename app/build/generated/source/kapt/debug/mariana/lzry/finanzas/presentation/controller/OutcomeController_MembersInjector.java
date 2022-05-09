// Generated by Dagger (https://dagger.dev).
package mariana.lzry.finanzas.presentation.controller;

import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;
import mariana.lzry.finanzas.domain.usecases.GetCategoriesUseCase;
import mariana.lzry.finanzas.domain.usecases.WriteOutcomeEntryUseCase;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class OutcomeController_MembersInjector implements MembersInjector<OutcomeController> {
  private final Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider;

  private final Provider<WriteOutcomeEntryUseCase> writeOutcomeEntryUseCaseProvider;

  public OutcomeController_MembersInjector(
      Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider,
      Provider<WriteOutcomeEntryUseCase> writeOutcomeEntryUseCaseProvider) {
    this.getCategoriesUseCaseProvider = getCategoriesUseCaseProvider;
    this.writeOutcomeEntryUseCaseProvider = writeOutcomeEntryUseCaseProvider;
  }

  public static MembersInjector<OutcomeController> create(
      Provider<GetCategoriesUseCase> getCategoriesUseCaseProvider,
      Provider<WriteOutcomeEntryUseCase> writeOutcomeEntryUseCaseProvider) {
    return new OutcomeController_MembersInjector(getCategoriesUseCaseProvider, writeOutcomeEntryUseCaseProvider);
  }

  @Override
  public void injectMembers(OutcomeController instance) {
    injectGetCategoriesUseCase(instance, getCategoriesUseCaseProvider.get());
    injectWriteOutcomeEntryUseCase(instance, writeOutcomeEntryUseCaseProvider.get());
  }

  @InjectedFieldSignature("mariana.lzry.finanzas.presentation.controller.OutcomeController.getCategoriesUseCase")
  public static void injectGetCategoriesUseCase(OutcomeController instance,
      GetCategoriesUseCase getCategoriesUseCase) {
    instance.getCategoriesUseCase = getCategoriesUseCase;
  }

  @InjectedFieldSignature("mariana.lzry.finanzas.presentation.controller.OutcomeController.writeOutcomeEntryUseCase")
  public static void injectWriteOutcomeEntryUseCase(OutcomeController instance,
      WriteOutcomeEntryUseCase writeOutcomeEntryUseCase) {
    instance.writeOutcomeEntryUseCase = writeOutcomeEntryUseCase;
  }
}
