package org.neoa.cems.beans.naming;

import org.neoa.cems.beans.ci.SimpleBean;
import org.neoa.cems.beans.ci.SimpleBeanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AliasesCfg {

    @Bean(name = {"beanOne", "beanTwo"})
    public SimpleBean simpleBean() {
        return new SimpleBeanImpl();
    }

}
