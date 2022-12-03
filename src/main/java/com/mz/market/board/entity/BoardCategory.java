package com.mz.market.board.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardCategory {
    @Id
    @GeneratedValue
    @Column(name = "board_category_id")
    private Long id;

    private CategoryName categoryName;


}
