package com.pluralsight.NorthwindTradersAPI.dao;

import com.pluralsight.NorthwindTradersAPI.Models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;

//Step 5 Create JDBC implementations of your interfaces. Both should be annotated with
//@Component, and both should require a DataSource as an input parameter

@Component
public class JdbcCategoryDao implements CategoryDao {

    private DataSource dataSource;

    //Constructor
    @Autowired
    public JdbcCategoryDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Category> getAll() {
        return List.of();
    }

    @Override
    public Category getById(int id) {
        return null;
    }
}
