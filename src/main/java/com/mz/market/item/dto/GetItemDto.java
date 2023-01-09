package com.mz.market.item.dto;

import lombok.Builder;
import lombok.Getter;

import java.awt.*;
import java.util.List;
import java.util.UUID;


public class GetItemDto {
    @Getter
    public static class Request {

    }
    @Getter
    @Builder
    public static class Response {
        private UUID itemId;
        private Image image;
        private Seller seller;
        private String categoryName;
        private String fromUploadTime;

        private String explanation;

        private Integer view;

        private List<SellerOtherItem> sellerOtherItems;

        private List<RelatedItem> relatedItems;

        @Getter
        @Builder
        public static class Seller {
            private String nickname;
            private String area;
            private String temperature;
        }
        @Getter
        @Builder
        public static class SellerOtherItem {
            private UUID otherItemId;
            private Image image;
            private String name;
            private String price;
        }
        @Getter
        @Builder
        public static class RelatedItem {
            private UUID relatedItemId;
            private Image image;
            private String name;
            private String price;
        }
    }
}
