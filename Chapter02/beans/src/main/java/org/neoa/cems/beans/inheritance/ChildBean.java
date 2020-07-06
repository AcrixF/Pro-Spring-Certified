package org.neoa.cems.beans.inheritance;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ChildBean extends ParentBean {
    private Boolean adult;

    public ChildBean(@Value("Lil John") String surname, @Value("false") Boolean adult) {
        super(surname);
        this.adult = adult;
    }

    public Boolean getAdult() {
        return adult;
    }

    public void setAdult(Boolean adult) {
        this.adult = adult;
    }

    @Override
    public String toString() {
        return "ChildBean {" +
                "  adult=" + adult +
                ", familyName='" + familyName + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
