package org.neoa.cems.beans.ci;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleAppCfgTest {

    private Logger logger = LoggerFactory.getLogger(SimpleAppCfgTest.class);

    @Test
    public void testBeanNames() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(SimpleAppCfg.class);
        SimpleBean simpleBean = ctx.getBean("simple", SimpleBean.class);

        for (String beanName: ctx.getBeanDefinitionNames()) {
            logger.info("Bean " + beanName + " of type " + ctx.getBean(beanName).getClass().getSimpleName());
        }

        assertNotNull(simpleBean);
        assertTrue(simpleBean instanceof SimpleBeanImpl);
    }
}
