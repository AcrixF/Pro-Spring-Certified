package org.neoa.cems.beans;

import org.junit.jupiter.api.Test;
import org.neoa.cems.beans.practice.Human;
import org.neoa.cems.beans.practice.HumanAppCfg;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class HumanAppCfgTest {

    @Test
    public void testHumanAndItem() {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(HumanAppCfg.class);

        Human humanBean = ctx.getBean(Human.class);

        assertNotNull(humanBean);
        assertNotNull(humanBean.getItem());
        assertNotNull(humanBean.getItem().getTitle());

        assertEquals(humanBean.getItem().getTitle(), "Book Title");

        ctx.close();
    }

}
