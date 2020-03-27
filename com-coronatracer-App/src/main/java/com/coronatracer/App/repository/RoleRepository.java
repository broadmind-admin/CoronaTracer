package com.coronatracer.App.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.coronatracer.App.model.Role;

public interface RoleRepository extends MongoRepository<Role, Long> {

}
