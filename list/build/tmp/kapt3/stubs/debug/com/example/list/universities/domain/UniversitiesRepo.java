package com.example.list.universities.domain;

import com.google.gson.Gson;
import com.example.network.network.AppAPis;
import com.example.list.universities.data.db.DataStoreManager;
import com.example.network.network.UniversityItem;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/list/universities/domain/UniversitiesRepo;", "", "appAPis", "Lcom/example/network/network/AppAPis;", "db", "Lcom/example/list/universities/data/db/DataStoreManager;", "(Lcom/example/network/network/AppAPis;Lcom/example/list/universities/data/db/DataStoreManager;)V", "getDataFromDB", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/list/universities/domain/UniversitiesUsecase$DataType;", "loadUniversitiesList", "", "Lcom/example/network/network/UniversityItem;", "list_debug"})
public final class UniversitiesRepo {
    @org.jetbrains.annotations.NotNull
    private final com.example.network.network.AppAPis appAPis = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.list.universities.data.db.DataStoreManager db = null;
    
    @javax.inject.Inject
    public UniversitiesRepo(@org.jetbrains.annotations.NotNull
    com.example.network.network.AppAPis appAPis, @org.jetbrains.annotations.NotNull
    com.example.list.universities.data.db.DataStoreManager db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.network.network.UniversityItem>> loadUniversitiesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.list.universities.domain.UniversitiesUsecase.DataType> getDataFromDB() {
        return null;
    }
}