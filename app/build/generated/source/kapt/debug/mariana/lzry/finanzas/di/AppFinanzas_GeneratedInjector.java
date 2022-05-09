package mariana.lzry.finanzas.di;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = AppFinanzas.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface AppFinanzas_GeneratedInjector {
  void injectAppFinanzas(AppFinanzas appFinanzas);
}
