package com.pluralsight.NorthwindTradersAPI.dao;

import com.pluralsight.NorthwindTradersAPI.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

//Step 5 Create JDBC implementations of your interfaces. Both should be annotated with
//@Component, and both should require a DataSource as an input parameter

@Component
public class JdbcProductDao implements ProductDao {

    private DataSource dataSource;

    //Constructor
    @Autowired
    public JdbcProductDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Product> getAll() {
        return List.of();
    }

    @Override
    public Product getById(int id) {
        return null;
    }
}
