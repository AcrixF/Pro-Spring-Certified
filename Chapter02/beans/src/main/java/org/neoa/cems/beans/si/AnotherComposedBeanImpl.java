package org.neoa.cems.beans.si;

import org.neoa.cems.beans.ci.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnotherComposedBeanImpl implements AnotherComposedBean {

    private SimpleBean simpleBean;

    private boolean complex;

    @Autowired
    public AnotherComposedBeanImpl(@Value("true") boolean complex) {
        this.complex = complex;
    }

    @Autowired(required = false)
    public void setSimpleBean(SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
    }

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }

    public boolean getComplex() {
        return complex;
    }
}
