package org.neoa.cems.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
@ComponentScan(basePackages = {"org.neoa.cems.scopes"})
public class AppConfig {
    @Bean
    //@Scope(value = "prototype", proxyMode = ScopedProxyMode.INTERFACES)
    @PaymentScope
    public Salary salary() {
        return new Salary();
    }
}
