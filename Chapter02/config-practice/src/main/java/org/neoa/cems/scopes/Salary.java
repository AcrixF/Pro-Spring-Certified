package org.neoa.cems.scopes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.Random;

@Description("Salary for an employee might change, so this is a suitable example for a prototype scoped bean")
@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.INTERFACES)
public class Salary implements Payment {

    private Logger logger = LoggerFactory.getLogger(Salary.class);
    private Integer amount;

    public Salary() {
        logger.info("-> Creating new Salary Bean");
        Random random = new Random();
        this.amount = random.nextInt(10_000) + 50_000;
    }

    @Override
    public Integer getAmount() {
        return amount;
    }
}
