package com.mz.market.item.entity;

import com.mz.market.category.entity.Category;
import com.mz.market.user.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {
    @Id @GeneratedValue
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;
    @Column(length = 125)
    @NotNull
    private String name;
    @Builder.Default
    private Integer interest = 0;
    private String contents;

    @Builder.Default
    private Integer chatNum = 0;
    @Builder.Default
    private Integer view = 0;
    @NotNull
    private Status status;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
