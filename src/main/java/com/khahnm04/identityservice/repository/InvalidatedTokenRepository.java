package com.khahnm04.identityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khahnm04.identityservice.entity.InvalidatedToken;

public interface InvalidatedTokenRepository extends JpaRepository<InvalidatedToken, String> {}
