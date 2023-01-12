package com.mz.market.item.dto;

import lombok.Builder;
import lombok.Getter;

public class PostItemDto {
    @Getter
    public static class Request {
        private String categoryName;
        private String itemName;
        private String explanation;
        private Long price;
        private String brand;
        private String area;

    }
    @Getter
    @Builder
    public static class Response {

    }
}
