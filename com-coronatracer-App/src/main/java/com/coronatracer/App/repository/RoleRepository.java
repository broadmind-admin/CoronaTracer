package com.coronatracer.App.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coronatracer.App.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
