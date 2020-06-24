package org.neoa.cems.beans.db;

import org.neoa.cems.beans.ci.SimpleBean;
import org.neoa.cems.beans.ci.SimpleBeanImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class SimpleDependentCfg {

    private Logger logger = LoggerFactory.getLogger(SimpleDependentCfg.class);

    @Bean
    public SimpleBean simpleBean() {
        logger.info("---> Creating 'simpleBean' ");
        return new SimpleBeanImpl();
    }

    @Bean
    @Description("This bean depends on 'SimpleBean'")
    public DependentBean dependentBean() {
        return  new DependentBeanImpl(simpleBean());
    }
}
