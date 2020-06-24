package org.neoa.cems.beans.practice;

import org.springframework.beans.factory.annotation.Value;

public class Book implements Item {

    private String title;

    public Book(@Value("Title") String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

}
