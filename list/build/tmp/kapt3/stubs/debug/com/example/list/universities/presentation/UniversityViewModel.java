package com.example.list.universities.presentation;

import androidx.lifecycle.ViewModel;
import com.example.list.universities.data.db.DataStoreManager;
import com.example.network.network.UniversityItem;
import com.example.list.universities.domain.UniversitiesUsecase;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0006\u0010\u0016\u001a\u00020\u0015R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/list/universities/presentation/UniversityViewModel;", "Landroidx/lifecycle/ViewModel;", "usecase", "Lcom/example/list/universities/domain/UniversitiesUsecase;", "db", "Lcom/example/list/universities/data/db/DataStoreManager;", "(Lcom/example/list/universities/domain/UniversitiesUsecase;Lcom/example/list/universities/data/db/DataStoreManager;)V", "_universities", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/example/network/network/UniversityItem;", "tempList", "getTempList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "universities", "", "getUniversities", "()Ljava/util/List;", "getEmptyState", "Landroidx/compose/runtime/MutableState;", "", "getUniversitiesList", "", "loadItems", "list_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class UniversityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.list.universities.domain.UniversitiesUsecase usecase = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.list.universities.data.db.DataStoreManager db = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.snapshots.SnapshotStateList<com.example.network.network.UniversityItem> _universities;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.example.network.network.UniversityItem> tempList = null;
    
    @javax.inject.Inject
    public UniversityViewModel(@org.jetbrains.annotations.NotNull
    com.example.list.universities.domain.UniversitiesUsecase usecase, @org.jetbrains.annotations.NotNull
    com.example.list.universities.data.db.DataStoreManager db) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.snapshots.SnapshotStateList<com.example.network.network.UniversityItem> getTempList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.network.network.UniversityItem> getUniversities() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> getEmptyState() {
        return null;
    }
    
    private final void getUniversitiesList() {
    }
    
    public final void loadItems() {
    }
}