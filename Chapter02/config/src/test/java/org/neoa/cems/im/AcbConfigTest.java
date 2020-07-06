package org.neoa.cems.im;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AcbConfigTest {

    @Test
    public void beanInitMethod() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AcbConfig.class);
        ctx.registerShutdownHook();

        AnotherComplexBean anotherComplexBean = ctx.getBean(AnotherComplexBean.class);
        assertNotNull(anotherComplexBean);
        assertNotNull(anotherComplexBean.getSimpleBean());
        //assertNotNull(anotherComplexBean.getAnotherSimpleBean());
    }
}
