package com.khahnm04.identityservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.khahnm04.identityservice.dto.request.RoleRequest;
import com.khahnm04.identityservice.dto.response.RoleResponse;
import com.khahnm04.identityservice.entity.Role;

@Mapper(componentModel = "spring")
public interface RoleMapper {

    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);

    RoleResponse toRoleResponse(Role role);
}
