package org.neoa.cems.beans.aw;

import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

public class NotRequiredBeanCfgTest {

    @Test
    public void testAutowire() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(NotRequiredBeanCfg.class);
        assertNotNull(ctx);

        BadBean badBean = ctx.getBean(BadBean.class);
        assertNotNull(badBean.getBeanTwo());
        assertNull(badBean.getMissingBean());

    }
}
