package com.mz.market.item.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

public class GetItemsDto {
    @Getter
    public static class Request { }
    @Getter
    @Builder
    public static class Response {
        private String name;
        private String area;
        private String fromUploadTime;

        @NotNull
        private String price;
    }
}
