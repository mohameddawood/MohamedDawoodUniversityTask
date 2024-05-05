// Generated by Dagger (https://dagger.dev).
package com.example.network.di;

import com.example.network.network.AppAPis;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RetrofitModule_ProvideApiFactory implements Factory<AppAPis> {
  private final Provider<Retrofit.Builder> retrofitProvider;

  public RetrofitModule_ProvideApiFactory(Provider<Retrofit.Builder> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public AppAPis get() {
    return provideApi(retrofitProvider.get());
  }

  public static RetrofitModule_ProvideApiFactory create(
      Provider<Retrofit.Builder> retrofitProvider) {
    return new RetrofitModule_ProvideApiFactory(retrofitProvider);
  }

  public static AppAPis provideApi(Retrofit.Builder retrofit) {
    return Preconditions.checkNotNullFromProvides(RetrofitModule.INSTANCE.provideApi(retrofit));
  }
}