package org.neoa.cems.lc;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ApplicationContextTest {

    private Logger logger = LoggerFactory.getLogger(ApplicationContextTest.class);

    @Test
    public void testSimpleBeans() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(DataSourceCfg.class);
        ctx.registerShutdownHook();
        logger.info(">> Init Done");
        DataSource dataSource = ctx.getBean(DataSource.class);
        assertNotNull(dataSource);
        logger.info(">> Usage Done");
    }


}
