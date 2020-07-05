package org.neoa.cems.beans.naming.qualifier;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class ConfigQualifierTest {

    @Test
    public void testConfigQualifier() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigQualifier.class);
        assertNotNull(ctx);

        Report report = ctx.getBean(Report.class);
        assertNotNull(report);
        assertEquals(report.getPerson() instanceof Manager, true);
        assertNull(report.getEmployee());

        Employee employee = new Employee();
        report.setEmployee(employee);

        assertNotNull(report.getEmployee());
    }

}
