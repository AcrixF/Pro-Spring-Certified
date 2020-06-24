package org.neoa.cems.beans.fi;

import org.junit.jupiter.api.Test;
import org.neoa.cems.beans.ci.ComposedBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class FiAppCfgTest {

    @Test
    public void testSimpleBeans() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(FiAppCfg.class);
        ComposedBean composedBean = ctx.getBean(ComposedBean.class);
        assertNotNull(composedBean);
        assertNotNull(composedBean.getSimpleBean());
        assertEquals("ABC123", composedBean.getCode());
        assertTrue(composedBean.isComplicated());
        ctx.close();
    }
}
