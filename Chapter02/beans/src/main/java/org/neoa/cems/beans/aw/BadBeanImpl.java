package org.neoa.cems.beans.aw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BadBeanImpl implements BadBean {

    private MissingBean missingBean;
    private BeanTwo beanTwo;

    @Override
    public MissingBean getMissingBean() {
        return missingBean;
    }

    @Autowired(required = false)
    public void setMissingBean(MissingBean missingBean) {
        this.missingBean = missingBean;
    }

    @Override
    public BeanTwo getBeanTwo() {
        return beanTwo;
    }

    @Autowired
    public void setBeanTwo(BeanTwo beanTwo) {
        this.beanTwo = beanTwo;
    }
}
