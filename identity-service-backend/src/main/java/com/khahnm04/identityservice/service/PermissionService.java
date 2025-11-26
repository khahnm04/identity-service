package com.khahnm04.identityservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.khahnm04.identityservice.dto.request.PermissionRequest;
import com.khahnm04.identityservice.dto.response.PermissionResponse;
import com.khahnm04.identityservice.entity.Permission;
import com.khahnm04.identityservice.mapper.PermissionMapper;
import com.khahnm04.identityservice.repository.PermissionRepository;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PermissionService {

    PermissionRepository permissionRepository;
    PermissionMapper permissionMapper;

    public PermissionResponse create(PermissionRequest request) {
        Permission permission = permissionMapper.toPermission(request);
        permission = permissionRepository.save(permission);
        return permissionMapper.toPermissionResponse(permission);
    }

    public List<PermissionResponse> getAll() {
        var permissions = permissionRepository.findAll();
        return permissions.stream().map(permissionMapper::toPermissionResponse).toList();
    }

    public void delete(String permission) {
        permissionRepository.deleteById(permission);
    }
}
