package com.coronatracer.App.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.coronatracer.App.model.UserDevice;
import com.coronatracer.App.model.token.RefreshToken;

public interface UserDeviceRepository extends MongoRepository<UserDevice, Long> {

    @Override
    Optional<UserDevice> findById(Long id);

    Optional<UserDevice> findByRefreshToken(RefreshToken refreshToken);

    Optional<UserDevice> findByUserId(Long userId);
}
