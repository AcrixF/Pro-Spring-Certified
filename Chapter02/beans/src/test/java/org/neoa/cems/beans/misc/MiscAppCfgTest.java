package org.neoa.cems.beans.misc;

import org.junit.jupiter.api.Test;
import org.neoa.cems.beans.mi.SingletonBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MiscAppCfgTest {

    private Logger logger = LoggerFactory.getLogger(MiscAppCfg.class);

    @Test
    public void testSimpleBeans() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(MiscAppCfg.class);
        SimpleSingleton simpleSingleton1 = ctx.getBean(SimpleSingleton.class);
        assertNotNull(simpleSingleton1);
        SimpleSingleton simpleSingleton2 = ctx.getBean(SimpleSingleton.class);
        assertNotNull(simpleSingleton2);
        assertEquals(simpleSingleton1, simpleSingleton2);
        ctx.close();
    }

}
