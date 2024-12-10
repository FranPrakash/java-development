package com.pluralsight.NorthwindTradersAPI.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//Step 3 Create a DatabaseConfiguration class and register a bean for your data source.

@Configuration
public class BbConfiguration {

    private BasicDataSource basicDataSource;
    @Bean
    public DataSource dataSource(){
        return basicDataSource;
    } //Return type ???
    public void DbConfiguration(@Value("${datasource.url}") String url,
                                @Value("${datasource.username}") String username,
                                @Value("${datasource.password}") String password
    ) {
        basicDataSource = new BasicDataSource();
        basicDataSource.setUrl(url);
        basicDataSource.setUsername(username);
        basicDataSource.setPassword(password);
    }


}
