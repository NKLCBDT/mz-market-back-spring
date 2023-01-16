package com.mz.market.user.entity;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Role {
    ROLE_ADMIN("관리자"), ROLE_MEMBER("일반 사용자");
    private String description;


}
