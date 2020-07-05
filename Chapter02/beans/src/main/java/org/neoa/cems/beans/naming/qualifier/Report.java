package org.neoa.cems.beans.naming.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Report {

    private Person person;
    private Employee employee;

    @Autowired
    public Report(@Qualifier("manager") Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    @Autowired(required = false)
    public void setEmployee(Employee employee)  {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

}
