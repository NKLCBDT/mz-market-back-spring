package com.mz.market.common.dto;


import lombok.Getter;

public class PostAreaBoardDto {
    @Getter
    public static class Request{
        private String topic;
        private String contents;
    }
}
