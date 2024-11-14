package com.api.learning.repository;

import org.springframework.stereotype.Repository;

import com.api.learning.model.entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
