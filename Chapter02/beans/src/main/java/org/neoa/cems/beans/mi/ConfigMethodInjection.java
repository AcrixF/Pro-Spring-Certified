package org.neoa.cems.beans.mi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = {"org.neoa.cems.beans.mi"})
public class ConfigMethodInjection {

    @Bean
    @Scope("prototype")
    public PrototypeBean prototypeBean() {
        String message = "Test Message";
        PrototypeBean prototypeBean = new PrototypeBean();
        prototypeBean.setMessage(message);
        return prototypeBean;
    }

    @Bean
    public SingletonBean singletonBean() {
       return null;
    }

}
