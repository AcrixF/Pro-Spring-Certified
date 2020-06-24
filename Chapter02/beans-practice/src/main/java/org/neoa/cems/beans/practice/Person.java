package org.neoa.cems.beans.practice;

import org.springframework.beans.factory.annotation.Autowired;

public class Person implements Human {

    private Item item;

    @Autowired
    public Person(Item item) {
        this.item = item;
    }

    @Override
    public Item getItem() {
        return item;
    }
}
