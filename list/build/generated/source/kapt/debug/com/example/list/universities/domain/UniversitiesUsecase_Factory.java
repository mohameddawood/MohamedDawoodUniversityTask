// Generated by Dagger (https://dagger.dev).
package com.example.list.universities.domain;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class UniversitiesUsecase_Factory implements Factory<UniversitiesUsecase> {
  private final Provider<UniversitiesRepo> repoProvider;

  public UniversitiesUsecase_Factory(Provider<UniversitiesRepo> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public UniversitiesUsecase get() {
    return newInstance(repoProvider.get());
  }

  public static UniversitiesUsecase_Factory create(Provider<UniversitiesRepo> repoProvider) {
    return new UniversitiesUsecase_Factory(repoProvider);
  }

  public static UniversitiesUsecase newInstance(UniversitiesRepo repo) {
    return new UniversitiesUsecase(repo);
  }
}
