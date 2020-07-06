package org.neoa.cems.beans.inheritance;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class FamilyAppConfigTest {

    private Logger logger = LoggerFactory.getLogger(FamilyAppConfig.class);

    @Test
    public void testInheritanceBeans() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(FamilyAppConfig.class);
        ctx.registerShutdownHook();

        ParentBean parentBean = ctx.getBean("parentBean", ParentBean.class);
        assertNotNull(parentBean);

        ChildBean childBean = ctx.getBean("childBean", ChildBean.class);
        assertNotNull(childBean);

        assertEquals(parentBean.getFamilyName(), childBean.getFamilyName());
        assertNotEquals(parentBean.getSurname(), childBean.getSurname());

        logger.info(parentBean.toString());
        logger.info(childBean.toString());
    }

}
