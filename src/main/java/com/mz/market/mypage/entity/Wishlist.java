package com.mz.market.mypage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Wishlist {
    @Id @GeneratedValue
    @Column(name = "wishlist_id")
    private Long id;


}
