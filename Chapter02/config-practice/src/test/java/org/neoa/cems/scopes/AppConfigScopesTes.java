package org.neoa.cems.scopes;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppConfigScopesTes {

    private Logger logger = LoggerFactory.getLogger(AppConfigScopesTes.class);

    @Test
    public void testDynamicProxy() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        assertNotNull(ctx);

        Employee employee = ctx.getBean(Employee.class);

        assertNotNull(employee);
        assertNotNull(employee.getSalary());

        logger.info("--> Invoking Salary: " + employee.getSalary().getAmount());
        logger.info("--> Invoking Salary: " + employee.getSalary().getAmount());
        logger.info("--> instanceof Salary: " + employee.getSalary().getClass().getName() );

    }

}
