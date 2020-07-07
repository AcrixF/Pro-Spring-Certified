package org.neoa.cems.beans.scalars;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@Configuration
public class DataSourceConfig1 {

    @Bean
    public Properties dbProps() {
        Properties p = new Properties();
        p.setProperty("driverClassName", "org.h2.Driver");
        p.setProperty("url", "jdbc:h2:~/sample");
        p.setProperty("username", "sample");
        p.setProperty("password", "sample");
        return p;
    }

    @Bean
    public DataSource dataSource(@Value("#{dbProps.driverClassName}") String driverClassName,
                                 @Value("#{dbProps.url}") String url,
                                 @Value("#{dbProps.username}") String username,
                                 @Value("#{dbProps.password}") String password) throws SQLException {
        return null;
    }

}
