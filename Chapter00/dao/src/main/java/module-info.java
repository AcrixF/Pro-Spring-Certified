module org.neoa.cems.dao {
    requires java.persistence;
    requires spring.context;
    requires java.validation;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.core;

    exports org.neoa.cems.ex;
    exports org.neoa.cems.util;
    exports org.neoa.cems.dto;
    exports org.neoa.cems.dao;
}