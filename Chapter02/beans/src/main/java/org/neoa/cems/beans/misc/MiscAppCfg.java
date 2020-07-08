package org.neoa.cems.beans.misc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.neoa.cems.beans.misc"})
public class MiscAppCfg {


    @Bean
    public SimpleSingleton simpleSingleton() {
        return SimpleSingleton.getInstance();
    }

    @Bean
    public TaxFormula taxFormula() {
        return new TaxFormulaFactory().getTaxFormula("S");
    }

}
