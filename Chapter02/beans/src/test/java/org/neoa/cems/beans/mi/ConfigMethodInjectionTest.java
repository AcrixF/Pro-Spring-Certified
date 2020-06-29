package org.neoa.cems.beans.mi;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ConfigMethodInjectionTest {


    @Test
    public void methodInjectionSingletonPrototype() {

        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigMethodInjection.class);

        SingletonBean singletonBean = ctx.getBean(SingletonBean.class);

        assertNotNull(singletonBean);

        PrototypeBean prototypeBean = singletonBean.getPrototypeBean();

        PrototypeBean prototypeBean1 = singletonBean.getPrototypeBean();

        assertEquals(prototypeBean, prototypeBean1);

        ctx.close();

    }

}
