package com.khahnm04.identityservice.mapper;

import com.khahnm04.identityservice.dto.request.UserCreationRequest;
import com.khahnm04.identityservice.dto.request.UserUpdateRequest;
import com.khahnm04.identityservice.dto.response.UserResponse;
import com.khahnm04.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toUser(UserCreationRequest request);

    //@Mapping(source = "firstName", target = "lastName") // Mapping firstName (User) -> lastName (UserResponse)
    //@Mapping(target = "lastName", ignore = true) // Bỏ qua (không map) field lastName trong UserResponse
    UserResponse toUserResponse(User user);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);

}
