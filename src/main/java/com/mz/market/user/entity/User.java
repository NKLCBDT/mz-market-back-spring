package com.mz.market.user.entity;

import com.mz.market.board.entity.BoardCategory;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id @GeneratedValue
    @Column(name = "user_id")
    private Long id;
    @Email
    private String email;
    @NonNull
    private String username;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
}
