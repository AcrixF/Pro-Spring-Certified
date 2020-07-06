package org.neoa.cems.im;

import org.neoa.cems.lc.SimpleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.neoa.cems.im"})
public class AcbConfig {

    @Bean(initMethod = "beanInitMethod", destroyMethod = "beanDestroyMethod")
    public AnotherComplexBean anotherComplexBean() {
        return new AnotherComplexBean();
    }

    @Bean
    public SimpleBean simpleBean() {
        return new SimpleBean();
    }
}
