package org.neoa.cems.fun;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class FunBean implements InitializingBean, DisposableBean {

    private Logger logger = LoggerFactory.getLogger(FunBean.class);

    private DepBean depBean;

    public FunBean() {
        logger.info("Stage 1: Calling the constructor");
    }

    @Autowired
    public void setDepBean(DepBean depBean) {
        logger.info("Stage 2: Calling the setter");
        this.depBean = depBean;
    }

    @PostConstruct
    public void initMethod() {
        logger.info("Stage ??: Calling PostConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("Stage 3: Calling InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        logger.info("Stage 4: Calling DisposableBean");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("Stage ??: Calling PreDestroy");
    }
}
