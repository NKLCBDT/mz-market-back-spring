package com.mz.market.security.manager;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.stereotype.Component;

@Component
public class LoginManager extends ProviderManager {
    public LoginManager(AuthenticationProvider... providers) {
        super(providers);
    }
}
