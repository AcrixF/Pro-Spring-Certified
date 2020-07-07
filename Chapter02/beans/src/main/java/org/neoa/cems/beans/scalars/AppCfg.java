package org.neoa.cems.beans.scalars;

import org.neoa.cems.beans.ci.SimpleBean;
import org.neoa.cems.beans.ci.SimpleBeanImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.ConversionService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Configuration
@ComponentScan(basePackages = {"org.neoa.cems.beans.scalars"})
public class AppCfg {

    @Autowired
    private StringToLocalDate stringToLocalDateConverter;

    @Autowired
    private StringToDate stringToDate;

    @Bean
    public ConversionService conversionService(ConversionServiceFactoryBean factory) {
        return factory.getObject();
    }

    @Bean
    public ConversionServiceFactoryBean conversionServiceFactoryBean() {
        ConversionServiceFactoryBean factory = new ConversionServiceFactoryBean();
        factory.setConverters(Set.of(stringToLocalDateConverter, stringToDate));
        return factory;
    }

    @Bean
    public SimpleBean simpleBean() {
        return new SimpleBeanImpl();
    }

    @Bean
    public List<SimpleBean> simpleBeanList() {
        return List.of(simpleBean());
        //return new ArrayList<>();
    }

    @Bean
    public Set<SimpleBean> simpleBeanSet() {
        return Set.of(simpleBean());
        //return new HashSet<>();
    }

    @Bean
    public Map<String, SimpleBean> simpleBeanMap() {
        return Map.of("simpleBean",simpleBean());
        //return new HashMap<>();
    }

}
