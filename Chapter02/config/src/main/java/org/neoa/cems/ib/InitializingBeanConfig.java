package org.neoa.cems.ib;

import org.neoa.cems.lc.AnotherSimpleBean;
import org.neoa.cems.lc.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.neoa.cems.ib"})
public class InitializingBeanConfig {

    @Bean
    public SimpleBean simpleBean() {
        return new SimpleBean();
    }

    @Bean
    public AnotherSimpleBean anotherSimpleBean() {
        return new AnotherSimpleBean();
    }
}
