package org.neoa.cems.fun;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.neoa.cems.fun"})
public class FunBeanConfig {

    @Bean
    public DepBean depBean() {
        return new DepBean();
    }

    /*
    @Bean
    public FunBean funBean() {
        return new FunBean();
    }
     */

}
