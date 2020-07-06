package org.neoa.cems.beans.inheritance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ParentBean {
    @Value("Smith")
    protected String familyName;

    protected String surname;

    public ParentBean(@Value("John") String surname) {
        this.surname = surname;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "ParentBean {" +
                "  familyName='" + familyName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
