// Generated by Dagger (https://dagger.dev).
package com.example.list.universities.domain;

import com.example.list.universities.data.db.DataStoreManager;
import com.example.network.network.AppAPis;
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
public final class UniversitiesRepo_Factory implements Factory<UniversitiesRepo> {
  private final Provider<AppAPis> appAPisProvider;

  private final Provider<DataStoreManager> dbProvider;

  public UniversitiesRepo_Factory(Provider<AppAPis> appAPisProvider,
      Provider<DataStoreManager> dbProvider) {
    this.appAPisProvider = appAPisProvider;
    this.dbProvider = dbProvider;
  }

  @Override
  public UniversitiesRepo get() {
    return newInstance(appAPisProvider.get(), dbProvider.get());
  }

  public static UniversitiesRepo_Factory create(Provider<AppAPis> appAPisProvider,
      Provider<DataStoreManager> dbProvider) {
    return new UniversitiesRepo_Factory(appAPisProvider, dbProvider);
  }

  public static UniversitiesRepo newInstance(AppAPis appAPis, DataStoreManager db) {
    return new UniversitiesRepo(appAPis, db);
  }
}
