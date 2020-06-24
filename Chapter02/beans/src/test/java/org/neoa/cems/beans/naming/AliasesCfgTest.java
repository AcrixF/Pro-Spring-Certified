package org.neoa.cems.beans.naming;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.neoa.cems.beans.ci.SimpleBean;
import org.neoa.cems.beans.ci.SimpleBeanImpl;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class AliasesCfgTest {

    private Logger logger = LoggerFactory.getLogger(AliasesCfgTest.class);

    @Test
    public void testSimpleBeans() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AliasesCfg.class);
        SimpleBean simpleBean = ctx.getBean("beanOne", SimpleBean.class);

        assertNotNull(simpleBean);
        assertTrue(simpleBean instanceof SimpleBeanImpl);

        SimpleBean simpleBean2 = ctx.getBean("beanTwo", SimpleBean.class);
        assertEquals(simpleBean2, simpleBean);

        assertThrows(NoSuchBeanDefinitionException.class, () -> ctx.getBean("simpleBean", SimpleBean.class));

        ctx.close();
    }

}
