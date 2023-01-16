package com.mz.market.user.repository;

import com.mz.market.user.entity.UserLoginInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserLoginInfoRepository extends JpaRepository<UserLoginInfo, UUID> {
}
