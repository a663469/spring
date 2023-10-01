package org.example.spring.security.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

// Без этого не будет запрашиваться форма для аутентификации
public class MySecurityInitializer extends AbstractSecurityWebApplicationInitializer {
}
