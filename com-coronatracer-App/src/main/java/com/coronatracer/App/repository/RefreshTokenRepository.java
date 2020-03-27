package com.coronatracer.App.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.coronatracer.App.model.token.RefreshToken;

public interface RefreshTokenRepository extends MongoRepository<RefreshToken, Long> {

    @Override
    Optional<RefreshToken> findById(Long id);

    Optional<RefreshToken> findByToken(String token);

}
