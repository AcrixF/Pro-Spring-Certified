package org.neoa.cems.beans.scalars;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppCfgTest {

    public Logger logger = LoggerFactory.getLogger(AppCfg.class);

    @Test
    public void scalarsBeanConverters() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppCfg.class);
        assertNotNull(ctx);

        MultipleTypesBean multipleTypesBean = ctx.getBean(MultipleTypesBean.class);
        assertNotNull(multipleTypesBean);
        logger.info("Multiple type Bean --> " + multipleTypesBean.toString());

        PersonBean personBean = ctx.getBean(PersonBean.class);
        assertNotNull(personBean);
        assertEquals(personBean.getName(), "John Mayer");
        assertEquals(personBean.getBirthDate(), LocalDate.parse("1977-10-16"));
        logger.info("PersonBean LocalDateConverter --> " + personBean.toString());

        EmptyCollectionHolder emptyCollectionHolder = ctx.getBean(EmptyCollectionHolder.class);
        assertNotNull(emptyCollectionHolder);
        logger.info("Collection Holder --> " + emptyCollectionHolder.toString());

    }
}
