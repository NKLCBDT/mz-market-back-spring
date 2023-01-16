package com.mz.market.security.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mz.market.security.dto.LoginDto;
import com.mz.market.security.manager.LoginManager;
import com.mz.market.user.dto.UserLoginDto;
import com.mz.market.user.entity.User;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import java.io.IOException;


public class LoginFilter extends AbstractAuthenticationProcessingFilter {
    private ObjectMapper objectMapper = new ObjectMapper();

    public LoginFilter(String defaultFilterProcessesUrl, LoginManager loginManager) {
        super(defaultFilterProcessesUrl, loginManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException {
        LoginDto loginInfo = objectMapper.readValue(request.getInputStream(), LoginDto.class);
        String email = loginInfo.getEmail();
        String password = loginInfo.getPassword();
        UsernamePasswordAuthenticationToken authRequest = UsernamePasswordAuthenticationToken.unauthenticated(email,
                password);
//        String remoteAddr = request.getRemoteAddr();
        return getAuthenticationManager().authenticate(authRequest);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response,
                                            FilterChain chain, Authentication authResult) throws IOException, ServletException {
        // 로그인 성공했을 때
        User user = (User) authResult.getPrincipal();


    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response, AuthenticationException failed) throws IOException, ServletException {

    }
}
