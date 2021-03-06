package org.neoa.cems.fun;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FunBeanConfigPracticeTest {

    @Test
    public void funBeanConfigTest() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(FunBeanConfig.class);
        ctx.registerShutdownHook();
        FunBean funBean = ctx.getBean(FunBean.class);
        assertNotNull(funBean);
    }
}
