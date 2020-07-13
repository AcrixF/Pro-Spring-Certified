package org.neoa.cems.config;

import org.neoa.cems.pojos.repos.DetectiveRepo;
import org.neoa.cems.repos.JdbcDetectiveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"org.neoa.cems.repos"})
public class RepositoryConfig {

    @Autowired
    private DataSource dataSource;

    @Bean
    public DetectiveRepo detectiveRepo() {
        return new JdbcDetectiveRepo(dataSource);
    }

}
