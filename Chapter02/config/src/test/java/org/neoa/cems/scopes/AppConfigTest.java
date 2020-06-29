package org.neoa.cems.scopes;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class AppConfigTest {

    private Logger logger = LoggerFactory.getLogger(AppConfigTest.class);

    @Test
    public void testProxyScopeWithoutProxy() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.registerShutdownHook();

        Employee employee = ctx.getBean(Employee.class);
        assertNotNull(employee);

        Salary salary = employee.getSalary();
        Salary salary_ = employee.getSalary();

        assertNotNull(salary);
        assertNotNull(salary_);

        assertEquals(salary, salary_);
    }

    @Test
    public void testBeanLifeCycle() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        ctx.registerShutdownHook();

        Employee employee = ctx.getBean(Employee.class);
        assertNotNull(employee);

        Salary salary = employee.getSalary();
        assertNotNull(salary);

        Salary salary_ = employee.getSalary();
        assertEquals(salary, salary_);

        logger.info("Salary bean actual type: {}", salary.getClass().toString());
        logger.info("Salary: {}", salary.description());
        logger.info("Salary: {}", salary.description());
        logger.info("Salary: {}", salary.description());

    }

}
