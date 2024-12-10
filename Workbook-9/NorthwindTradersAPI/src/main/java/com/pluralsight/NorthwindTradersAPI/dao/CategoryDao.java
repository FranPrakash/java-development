package com.pluralsight.NorthwindTradersAPI.dao;

//Step 4 Create DAO interfaces for both Product and Category.

import com.pluralsight.NorthwindTradersAPI.Models.Category;

import java.util.List;

public interface CategoryDao {
public List<Category> getAll();
public Category getById(int id);

}
