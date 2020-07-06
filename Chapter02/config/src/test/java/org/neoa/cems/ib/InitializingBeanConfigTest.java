package org.neoa.cems.ib;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class InitializingBeanConfigTest {

    @Test
    public void initializationBeanConfig() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(InitializingBeanConfig.class);
        ctx.registerShutdownHook();

        ComplexBean complexBean = ctx.getBean(ComplexBean.class);
        assertNotNull(complexBean);
        assertNotNull(complexBean);

    }

}
