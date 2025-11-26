package com.khahnm04.identityservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khahnm04.identityservice.entity.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, String> {}
