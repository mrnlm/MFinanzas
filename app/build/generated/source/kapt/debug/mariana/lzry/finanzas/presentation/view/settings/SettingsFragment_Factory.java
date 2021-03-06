// Generated by Dagger (https://dagger.dev).
package mariana.lzry.finanzas.presentation.view.settings;

import dagger.internal.Factory;
import javax.inject.Provider;
import mariana.lzry.finanzas.presentation.controller.SettingsController;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingsFragment_Factory implements Factory<SettingsFragment> {
  private final Provider<SettingsController> settingsControllerProvider;

  public SettingsFragment_Factory(Provider<SettingsController> settingsControllerProvider) {
    this.settingsControllerProvider = settingsControllerProvider;
  }

  @Override
  public SettingsFragment get() {
    SettingsFragment instance = newInstance();
    SettingsFragment_MembersInjector.injectSettingsController(instance, settingsControllerProvider.get());
    return instance;
  }

  public static SettingsFragment_Factory create(
      Provider<SettingsController> settingsControllerProvider) {
    return new SettingsFragment_Factory(settingsControllerProvider);
  }

  public static SettingsFragment newInstance() {
    return new SettingsFragment();
  }
}
