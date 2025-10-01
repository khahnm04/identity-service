package com.khahnm04.identityservice.dto.request;

import com.khahnm04.identityservice.validator.DobConstraint;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserCreationRequest {

    @Size(min = 3, message = "USERNAME_INVALID")
    String username;

    @Size(min = 8, message = "INVALID_PASSWORD")
    String password;

    String firstName;

    String lastName;

    @DobConstraint(min = 18, message = "INVALID_DOB")
    LocalDate dob;

}
