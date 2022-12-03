package com.mz.market.user.controller;

import com.mz.market.user.dto.UserLoginDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    @PostMapping("/login")
    public void login(@RequestBody UserLoginDto.Request dto){}
}
