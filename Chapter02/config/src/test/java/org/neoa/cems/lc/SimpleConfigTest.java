package org.neoa.cems.lc;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SimpleConfigTest {

    @Test
    public void simpleConfig() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(SimpleConfig.class);
        ComplexBean complexBean = ctx.getBean(ComplexBean.class);
        assertNotNull(complexBean);
        assertNull(complexBean.getSimpleBean());
    }

}
