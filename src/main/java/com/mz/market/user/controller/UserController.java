package com.mz.market.user.controller;

import com.mz.market.common.dto.ResponseDto;
import com.mz.market.user.dto.GetUserTopicDto;
import com.mz.market.user.entity.User;
import com.mz.market.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/user")
public class UserController {
    private final UserService userService;

    public ResponseDto<GetUserTopicDto.Response> getUserTopic(@AuthenticationPrincipal User user){
        return userService.getUserTopic(user);
    }
}
