package org.neoa.cems.im;

import org.neoa.cems.lc.AnotherSimpleBean;
import org.neoa.cems.lc.SimpleBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AnotherComplexBean {

    private Logger logger = LoggerFactory.getLogger(AnotherSimpleBean.class);

    private SimpleBean simpleBean;
    private AnotherSimpleBean anotherSimpleBean;

    public AnotherComplexBean() {
        logger.info("Stage 1: Calling the constructor.");
    }

    @Autowired
    public void setSimpleBean(SimpleBean simpleBean) {
        logger.info("Stage 2: Calling the setter.");
        this.simpleBean = simpleBean;
    }

    public void beanInitMethod() {
        logger.info("Stage 3: Calling the beanInitMethod");
        long ct = System.currentTimeMillis();
        if (ct % 2 == 0) {
            anotherSimpleBean = new AnotherSimpleBean();
        }
    }

    public void beanDestroyMethod() {
        logger.info("Stage 4: Calling the beanDestroyMethod");
    }

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }

    public AnotherSimpleBean getAnotherSimpleBean() {
        return anotherSimpleBean;
    }
}
