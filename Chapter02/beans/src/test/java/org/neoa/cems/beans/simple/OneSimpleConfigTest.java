package org.neoa.cems.beans.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.neoa.cems.beans.ci.SimpleBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class OneSimpleConfigTest {

    private Logger logger = LoggerFactory.getLogger(OneSimpleConfigTest.class);

    @Test
    public void testSimpleConfiguration() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SimpleConfig.class);
        for (String beanName: ctx.getBeanDefinitionNames()) {
            logger.info("Bean " + beanName);
        }
    }

    @Test
    public void testOneBeanConfiguration() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(OneBeanConfig.class);

        SimpleBean simpleBeanOne = ctx.getBean(SimpleBean.class);
        SimpleBean simpleBeanTwo = ctx.getBean(SimpleBean.class);

        Assertions.assertEquals(simpleBeanTwo, simpleBeanOne);

    }
}
