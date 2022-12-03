package com.mz.market.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;

public class UserLoginDto {

    @Getter
    public static class Request {
        @NotNull
        @Email(regexp = ".+[@].+[\\.].+")
        @Size(min = 3, max = 50)
        private String email;

        @NotNull
        @Size(min = 3, max = 20)
        private String password;


    }
}
