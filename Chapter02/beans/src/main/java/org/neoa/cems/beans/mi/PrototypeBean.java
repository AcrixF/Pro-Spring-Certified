package org.neoa.cems.beans.mi;

public class PrototypeBean {
    private String message;

    public PrototypeBean() {
        System.out.println("Prototype Bean Instantiated");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public PrototypeBean getPrototypeBean() {
        return this;
    }
}
