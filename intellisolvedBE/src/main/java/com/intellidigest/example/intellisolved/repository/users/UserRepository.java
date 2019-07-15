package com.intellidigest.example.intellisolved.repository.users;

import com.intellidigest.example.intellisolved.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
