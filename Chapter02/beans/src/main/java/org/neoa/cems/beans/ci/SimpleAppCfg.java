package org.neoa.cems.beans.ci;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.neoa.cems.beans.ci"})
public class SimpleAppCfg {


    /*
    @Bean
    public SimpleBean anotherSimpleBean() {
        return new SimpleBeanImpl();
    }
     */

}
