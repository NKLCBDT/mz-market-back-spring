package com.mz.market.common.code;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public enum ResponseCode {

    // Board

    GET_ALL_BOARD("SUCCESS", "BO00", "Get all board", "모든 게시판 글 조회"),
    // Topic

    GET_USER_TOPICS("SUCCESS", "U000", "Get user topics", "모든 유저 토픽 조회"),

    // USER

    // ITEM

    GET_ITEMS("SUCCESS", "I000", "Get all items", "모든 아이템 조회"),
    GET_ITEM("SUCCESS", "I001", "Get single item", "단일 아이템 조회"),
    POST_ITEM("SUCCESS", "I002", "Post item", "아이템 등록"),
    UPDATE_ITEM("SUCCESS", "I003", "Update item", "아이템 수정"),
    DELETE_ITEM("SUCCESS", "I004", "Delete item", "아이템 삭제");
    private String status; // API response
    private String code; // API response
    @Setter
    private String message; // API response
    @JsonIgnore
    private String description; // 개발 편의를 위한 description
}
