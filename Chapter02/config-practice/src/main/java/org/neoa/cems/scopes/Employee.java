package org.neoa.cems.scopes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private Payment payment;

    @Autowired
    public void setSalary(Payment payment) {
        this.payment = payment;
    }

    public Payment getSalary() {
        return this.payment;
    }

}
