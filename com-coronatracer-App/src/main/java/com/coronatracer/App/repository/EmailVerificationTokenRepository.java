package com.coronatracer.App.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.coronatracer.App.model.token.EmailVerificationToken;

public interface EmailVerificationTokenRepository extends MongoRepository<EmailVerificationToken, Long> {

    Optional<EmailVerificationToken> findByToken(String token);
}
