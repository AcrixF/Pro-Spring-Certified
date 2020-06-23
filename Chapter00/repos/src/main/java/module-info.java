module org.neoa.cems.repos {
    requires org.neoa.cems.dao;
    requires spring.context;
    requires spring.beans;
    requires spring.jdbc;
    requires spring.tx;  // needed only for testing @Transactional on repo
    requires java.sql;
    requires org.apache.commons.lang3;
}
