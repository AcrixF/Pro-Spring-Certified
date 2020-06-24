package org.neoa.cems.beans.ci;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComposedBeanImpl implements ComposedBean {

    private Logger logger = LoggerFactory.getLogger(ComposedBeanImpl.class);

    private SimpleBean simpleBean;
    private String code;
    private boolean complicated;

    /* Use Qualifier to define the Bean to use when more than one type exists.
    @Autowired
    public ComposedBeanImpl(@Qualifier("anotherSimpleBean") SimpleBean simpleBean) {
        this.simpleBean = simpleBean;
        logger.info("[ComposedBean instantiation]");
    }
     */

    @Autowired
    public void ComposedBeanImpl(SimpleBean simpleBean,
                                 @Value("AB123") String code,
                                 @Value("true") boolean complicated) {
        this.simpleBean = simpleBean;
        this.code = code;
        this.complicated = complicated;
    }

    public SimpleBean getSimpleBean() {
        return simpleBean;
    }

    public String getCode() {
        return code;
    }

    public boolean isComplicated() {
        return complicated;
    }
}
