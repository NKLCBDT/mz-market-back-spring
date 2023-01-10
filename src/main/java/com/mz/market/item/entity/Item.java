package com.mz.market.item.entity;

import com.mz.market.category.entity.Category;
import com.mz.market.user.entity.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.List;
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

    @Length(min = 20)
    @NotNull
    private String explanation;

    private String brand;
    @NotNull
    private Boolean isFree;

    private Long price;

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

    @OneToMany(mappedBy = "item")
    private List<ItemImage> itemImages;

    @OneToMany(mappedBy = "item")
    private List<ItemArea> itemAreas;
}
