package org.neoa.cems.beans.db;

import org.neoa.cems.beans.ci.SimpleBean;

public class DependentBeanImpl implements DependentBean {

    private SimpleBean simpleBean;

    public DependentBeanImpl(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }
}
