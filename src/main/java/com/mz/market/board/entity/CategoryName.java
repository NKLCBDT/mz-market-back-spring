package com.mz.market.board.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CategoryName {
    ROUTINE("일상"),
    HOBBY("취미생활"),
    ACCIDENT("사건사고"),
    LOST("분실/실종센터"),
    AREA_QUESTION("동네질문");
    private String name;
}
