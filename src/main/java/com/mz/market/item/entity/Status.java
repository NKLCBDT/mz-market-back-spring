package com.mz.market.item.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Status {
    SALE("판매 중"),
    RESERVATION("예약 중"),
    COMPLETION("판매 완료");

    private final String status;
}
