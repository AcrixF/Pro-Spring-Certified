package org.neoa.cems.beans.fi;

import org.neoa.cems.beans.ci.SimpleBean;
import org.neoa.cems.beans.ci.SimpleBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.neoa.cems.beans.fi"})
public class FiAppCfg {

    @Bean
    SimpleBean simpleBean(){
        return new SimpleBeanImpl();
    }
}
