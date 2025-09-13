package com.khahnm04.identityservice.dto.response;

import java.time.LocalDate;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserResponse {

    String id;

    String username;

    String password;

    String firstName;

    String lastName;

    LocalDate dob;

}
