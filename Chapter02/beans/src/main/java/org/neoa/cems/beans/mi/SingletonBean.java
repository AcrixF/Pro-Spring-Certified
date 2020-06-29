package org.neoa.cems.beans.mi;

import org.springframework.beans.factory.annotation.Lookup;

public abstract class SingletonBean {

    public SingletonBean() {
        System.out.println("Singleton Bean Instantiated !!");
    }

    @Lookup
    public abstract PrototypeBean getPrototypeBean();

}
