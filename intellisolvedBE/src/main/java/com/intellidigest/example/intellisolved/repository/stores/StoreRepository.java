package com.intellidigest.example.intellisolved.repository.stores;

import com.intellidigest.example.intellisolved.models.Store;
import com.intellidigest.example.intellisolved.projections.StoreProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = StoreProjection.class)
public interface StoreRepository extends JpaRepository<Store, Long> {
}
