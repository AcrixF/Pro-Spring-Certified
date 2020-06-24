package org.neoa.cems.beans.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.neoa.cems.beans"})
public class HumanAppCfg {

    @Bean
    public Item item() {
        return new Book("Book Title");
    }

    @Bean
    public Human human() {
        return new Person(item());
    }
}
