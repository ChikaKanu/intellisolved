package com.intellidigest.example.intellisolved.repository.users;

import com.intellidigest.example.intellisolved.models.User;
import com.intellidigest.example.intellisolved.projections.UserProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = UserProjection.class)
public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {
}
