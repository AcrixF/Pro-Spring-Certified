package org.neoa.cems.scopes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.Random;

//@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE , proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Salary {

    private Logger logger = LoggerFactory.getLogger(Salary.class);

    private Integer amount;

    public Salary() {
        logger.info("-> Creating new Salary Bean");
        Random rand = new Random();
        this.amount = rand.nextInt(10_000) + 50_000;
    }

    public Integer getAmount() {
        return amount;
    }

    public String description() {
        return "This create  a new Instance of Salary " + hashCode();
    }
}
