package com.khahnm04.identityservice.controller;

import com.khahnm04.identityservice.dto.request.IntrospectRequest;
import com.khahnm04.identityservice.dto.response.ApiResponse;
import com.khahnm04.identityservice.dto.request.AuthenticationRequest;
import com.khahnm04.identityservice.dto.response.AuthenticationResponse;
import com.khahnm04.identityservice.dto.response.IntrospectResponse;
import com.khahnm04.identityservice.service.AuthenticationService;
import com.nimbusds.jose.JOSEException;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthenticationController {

    AuthenticationService authenticationService;

    @PostMapping("/token")
    ApiResponse<AuthenticationResponse> authenticate(
        @RequestBody AuthenticationRequest request
    ) {
        var result = authenticationService.authenticate(request);
        return ApiResponse.<AuthenticationResponse>builder()
                .result(result)
                .build();
    }

    @PostMapping("/introspect")
    ApiResponse<IntrospectResponse> authenticate(
        @RequestBody IntrospectRequest request
    ) throws ParseException, JOSEException {
        var result = authenticationService.introspect(request);
        return ApiResponse.<IntrospectResponse>builder()
                .result(result)
                .build();
    }

}
