package com.mz.market.user.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

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
    private String name;



}
