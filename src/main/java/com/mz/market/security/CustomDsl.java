package com.mz.market.security;

import com.mz.market.security.filter.LoginFilter;
import com.mz.market.security.filter.SessionFilter;
import com.mz.market.security.manager.LoginManager;
import com.mz.market.security.utils.LoginUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class CustomDsl extends AbstractHttpConfigurer<CustomDsl, HttpSecurity> {
    private final LoginManager loginManager;
    private final SessionFilter sessionFilter;
    @Override
    public void configure(HttpSecurity http) throws Exception {
        LoginFilter loginFilter = new LoginFilter(LoginUtils.DEFAULT_FILTER_PROCESSING_URL, loginManager);
        http.addFilterAt(loginFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
