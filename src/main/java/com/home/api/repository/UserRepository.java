package com.home.api.repository;

import com.home.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    // Метод для проверки существования пользователя по имени (username)
    boolean existsByUsername(String username);

    // Метод для поиска пользователя по имени (username)
    Optional<User> findByUsername(String username);
}



