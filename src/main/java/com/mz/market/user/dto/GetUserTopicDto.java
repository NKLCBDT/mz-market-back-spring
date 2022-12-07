package com.mz.market.user.dto;


import lombok.Builder;

import java.util.List;

public class GetUserTopicDto {
    @Builder
    public static class Response {
        private List<String> defaultTopic;
        private List<String> interestTopic;
    }
}
