package com.coronatracer.App.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.coronatracer.App.model.User;

public interface UserRepository extends MongoRepository<User, Long> {

    Optional<User> findByUsername(String username);

    Boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);

    Boolean existsByUsername(String username);
}
