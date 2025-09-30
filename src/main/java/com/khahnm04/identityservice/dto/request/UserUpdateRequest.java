package com.khahnm04.identityservice.dto.request;

import java.time.LocalDate;

import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserUpdateRequest {

    String password;

    String firstName;

    String lastName;

    LocalDate dob;

    List<String> roles;

}
