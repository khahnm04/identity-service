package com.khahnm04.identityservice.mapper;

import com.khahnm04.identityservice.dto.request.PermissionRequest;
import com.khahnm04.identityservice.dto.response.PermissionResponse;
import com.khahnm04.identityservice.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {

    Permission toPermission(PermissionRequest request);

    PermissionResponse toPermissionResponse(Permission permission);

}
