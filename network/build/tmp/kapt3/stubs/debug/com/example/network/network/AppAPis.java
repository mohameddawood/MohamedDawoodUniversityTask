package com.example.network.network;

import retrofit2.http.GET;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0007"}, d2 = {"Lcom/example/network/network/AppAPis;", "", "getUniversitiesList", "", "Lcom/example/network/network/UniversityItem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "network_debug"})
public abstract interface AppAPis {
    @org.jetbrains.annotations.NotNull
    public static final com.example.network.network.AppAPis.Companion Companion = null;
    
    @retrofit2.http.GET(value = "search?country=United%20Arab%20Emirates")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUniversitiesList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.network.network.UniversityItem>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u00a8\u0006\u0005"}, d2 = {"Lcom/example/network/network/AppAPis$Companion;", "", "()V", "invoke", "", "network_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void invoke() {
        }
    }
}