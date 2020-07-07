package org.neoa.cems.beans.scalars;

import java.time.LocalDate;

public interface Creature {

    LocalDate getBirthDate();

    void setBirthDate(LocalDate birthDate);

    String getName();

    void setName(String name);
}
