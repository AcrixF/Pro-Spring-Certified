package org.neoa.cems.lc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ComplexBean implements InitializingBean {

    private Logger logger = LoggerFactory.getLogger(ComplexBean.class);

    private SimpleBean simpleBean;

    private AnotherSimpleBean anotherSimpleBean;

    public ComplexBean() {
        logger.info("Stage 1: Calling the Constructor.");
    }

    @Autowired(required = false)
    public void setSimpleBean(SimpleBean simpleBean) {
        logger.info("Stage 2: Calling the setter.");
        this.simpleBean = simpleBean;
    }

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }

    public AnotherSimpleBean getAnotherSimpleBean() {
        return anotherSimpleBean;
    }

    /*
    @PostConstruct
    private void initMethod() {
        logger.info("Stage 3: Calling the initMethod");
        long ct = System.currentTimeMillis();
        if (ct % 2 == 0) {
            anotherSimpleBean = new AnotherSimpleBean();
        }
    }
     */

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("Stage 3: Calling the afterPropertiesSet.");
        long ct = System.currentTimeMillis();
        if (ct % 2 == 0) {
            anotherSimpleBean = new AnotherSimpleBean();
        }
    }
}
