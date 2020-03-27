package com.coronatracer.App.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.coronatracer.App.model.PasswordResetToken;

@Repository
public interface PasswordResetTokenRepository extends MongoRepository<PasswordResetToken, Long> {

    Optional<PasswordResetToken> findByToken(String token);
}