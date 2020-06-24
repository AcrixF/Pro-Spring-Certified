package org.neoa.cems.beans.fi;

import org.neoa.cems.beans.ci.ComposedBean;
import org.neoa.cems.beans.ci.SimpleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BadComposedBean implements ComposedBean {

    @Autowired
    private SimpleBean simpleBean;

    private String code;
    private boolean complicated;

    public BadComposedBean(@Value("ABC123") String code, @Value("true") boolean complicated) {
        this.code = code;
        this.complicated = complicated;
    }

    @Override
    public SimpleBean getSimpleBean() {
        return simpleBean;
    }
    @Override
    public String getCode() {
        return code;
    }

    @Override
    public Boolean isComplicated() {
        return complicated;
    }
}
