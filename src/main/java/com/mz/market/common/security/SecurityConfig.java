package com.mz.market.common.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@RequiredArgsConstructor
@EnableWebSecurity
public class SecurityConfig {
    private final CustomDsl customDsl;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                // csrf λΉνμ±ν
                .csrf().disable()
                .sessionManagement()
                .and()
//                .authorizeHttpRequests((authz) -> authz
//                        .requestMatchers())
                // .cors(cors -> cors
                // 	.configurationSource(configurationSource()))
                .apply(customDsl).and()
                .build();
    }
}
