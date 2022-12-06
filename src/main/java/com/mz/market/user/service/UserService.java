package com.mz.market.user.service;

import com.mz.market.common.dto.ResponseDto;
import com.mz.market.user.dto.GetUserTopicDto;
import com.mz.market.user.entity.User;
import com.mz.market.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.mz.market.common.code.ResponseCode.GET_USER_TOPICS;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public ResponseDto<GetUserTopicDto.Response> getUserTopic(User user){
        
        return ResponseDto.<GetUserTopicDto.Response>builder()
                .responseCode(GET_USER_TOPICS)
                .data(GetUserTopicDto.Response.builder().build())
                .build();
    }

}
