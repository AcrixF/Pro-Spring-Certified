package org.neoa.cems.beans.simple;

import org.neoa.cems.beans.ci.SimpleBean;
import org.neoa.cems.beans.ci.SimpleBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OneBeanConfig {

    @Bean
    public SimpleBean simpleBean() {
        return new SimpleBeanImpl();
    }
}
