package org.neoa.cems.beans.db;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.neoa.cems.beans.ci.SimpleBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SimpleDependentCfgTest {

    @Test
    public void testSimpleBeans() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(SimpleDependentCfg.class);

        ctx.registerShutdownHook();

        SimpleDependentCfg simpleDependentCfg = ctx.getBean(SimpleDependentCfg.class);

        assertNotNull(simpleDependentCfg);

        SimpleBean simpleBean = simpleDependentCfg.simpleBean();

        assertNotNull(simpleBean);
    }

}
