package com.khahnm04.identityservice.mapper;

import org.mapstruct.Mapper;

import com.khahnm04.identityservice.dto.request.PermissionRequest;
import com.khahnm04.identityservice.dto.response.PermissionResponse;
import com.khahnm04.identityservice.entity.Permission;

@Mapper(componentModel = "spring")
public interface PermissionMapper {

    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);
}
