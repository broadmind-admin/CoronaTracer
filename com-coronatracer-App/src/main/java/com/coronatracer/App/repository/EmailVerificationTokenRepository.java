package com.coronatracer.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coronatracer.App.model.token.EmailVerificationToken;

import java.util.Optional;

public interface EmailVerificationTokenRepository extends JpaRepository<EmailVerificationToken, Long> {

    Optional<EmailVerificationToken> findByToken(String token);
}
