package org.neoa.cems.beans.scalars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class PersonBean implements Creature {

    private LocalDate birthDate;
    private String name;

    @Autowired
    public PersonBean(@Value("1977-10-16") LocalDate birthDate, @Value("John Mayer") String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    @Override
    public LocalDate getBirthDate() {
        return birthDate;
    }
    @Override
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
