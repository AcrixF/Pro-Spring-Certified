package org.neoa.cems.beans.scalars;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class StringToLocalDate implements Converter<String, LocalDate> {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    @Override
    public LocalDate convert(String source) {
        return LocalDate.parse(source, formatter);
    }
}
