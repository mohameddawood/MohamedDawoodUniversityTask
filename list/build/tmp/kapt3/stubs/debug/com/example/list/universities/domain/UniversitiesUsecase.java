package com.example.list.universities.domain;

import com.example.network.network.UniversityItem;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/list/universities/domain/UniversitiesUsecase;", "", "repo", "Lcom/example/list/universities/domain/UniversitiesRepo;", "(Lcom/example/list/universities/domain/UniversitiesRepo;)V", "showEmptyFav", "Landroidx/compose/runtime/MutableState;", "", "getShowEmptyFav", "()Landroidx/compose/runtime/MutableState;", "getListFromDB", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/list/universities/domain/UniversitiesUsecase$DataType;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUniversities", "", "Lcom/example/network/network/UniversityItem;", "DataType", "list_debug"})
public final class UniversitiesUsecase {
    @org.jetbrains.annotations.NotNull
    private final com.example.list.universities.domain.UniversitiesRepo repo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> showEmptyFav = null;
    
    @javax.inject.Inject
    public UniversitiesUsecase(@org.jetbrains.annotations.NotNull
    com.example.list.universities.domain.UniversitiesRepo repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getShowEmptyFav() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.network.network.UniversityItem>> loadUniversities() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getListFromDB(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.list.universities.domain.UniversitiesUsecase.DataType>> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/list/universities/domain/UniversitiesUsecase$DataType;", "", "()V", "DBData", "NetworkData", "Lcom/example/list/universities/domain/UniversitiesUsecase$DataType$DBData;", "Lcom/example/list/universities/domain/UniversitiesUsecase$DataType$NetworkData;", "list_debug"})
    public static abstract class DataType {
        
        private DataType() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/list/universities/domain/UniversitiesUsecase$DataType$DBData;", "Lcom/example/list/universities/domain/UniversitiesUsecase$DataType;", "list", "", "Lcom/example/network/network/UniversityItem;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "list_debug"})
        public static final class DBData extends com.example.list.universities.domain.UniversitiesUsecase.DataType {
            @org.jetbrains.annotations.NotNull
            private final java.util.List<com.example.network.network.UniversityItem> list = null;
            
            public DBData(@org.jetbrains.annotations.NotNull
            java.util.List<com.example.network.network.UniversityItem> list) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.example.network.network.UniversityItem> getList() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.example.network.network.UniversityItem> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.example.list.universities.domain.UniversitiesUsecase.DataType.DBData copy(@org.jetbrains.annotations.NotNull
            java.util.List<com.example.network.network.UniversityItem> list) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/example/list/universities/domain/UniversitiesUsecase$DataType$NetworkData;", "Lcom/example/list/universities/domain/UniversitiesUsecase$DataType;", "list", "", "Lcom/example/network/network/UniversityItem;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "list_debug"})
        public static final class NetworkData extends com.example.list.universities.domain.UniversitiesUsecase.DataType {
            @org.jetbrains.annotations.NotNull
            private final java.util.List<com.example.network.network.UniversityItem> list = null;
            
            public NetworkData(@org.jetbrains.annotations.NotNull
            java.util.List<com.example.network.network.UniversityItem> list) {
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.example.network.network.UniversityItem> getList() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final java.util.List<com.example.network.network.UniversityItem> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.example.list.universities.domain.UniversitiesUsecase.DataType.NetworkData copy(@org.jetbrains.annotations.NotNull
            java.util.List<com.example.network.network.UniversityItem> list) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
        }
    }
}