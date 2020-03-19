package com.coronatracer.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coronatracer.App.model.UserDevice;
import com.coronatracer.App.model.token.RefreshToken;

import java.util.Optional;

public interface UserDeviceRepository extends JpaRepository<UserDevice, Long> {

    @Override
    Optional<UserDevice> findById(Long id);

    Optional<UserDevice> findByRefreshToken(RefreshToken refreshToken);

    Optional<UserDevice> findByUserId(Long userId);
}
