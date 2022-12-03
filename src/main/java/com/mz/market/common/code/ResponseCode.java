package com.mz.market.common.code;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
public enum ResponseCode {

    GET_ALL_BOARD("SUCCESS", "BO000", "Get all board", "모든 게시판 글 조회");
    private String status; // API response
    private String code; // API response
    @Setter
    private String message; // API response
    @JsonIgnore
    private String description; // 개발 편의를 위한 description
}
