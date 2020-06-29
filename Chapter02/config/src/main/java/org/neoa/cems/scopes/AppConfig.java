package org.neoa.cems.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(basePackages = {"org.neoa.cems.scopes"})
@Component
@Repository
public class AppConfig {


    //@Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    @SalaryScope
    @Bean
    public Salary salary() {
        return new Salary();
    }


}
