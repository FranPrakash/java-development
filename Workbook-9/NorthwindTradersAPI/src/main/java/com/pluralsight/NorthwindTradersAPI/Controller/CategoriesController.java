package com.pluralsight.NorthwindTradersAPI.Controller;

import com.pluralsight.NorthwindTradersAPI.Models.Category;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


//Exercise Add public methods to the controllers to return all products and all categories
@RestController
public class CategoriesController {

    //respond to http://localhost:8080/categories
    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1, "Beverages"));
        categories.add(new Category(2, "Condiments"));
        categories.add(new Category(3, "Confections"));
        categories.add(new Category(4, "Dairy Products"));
        return categories;
    }
}

  /*  @RequestMapping(path="/categories/{id}", method=RequestMethod.GET)
    public List<Category> getCategory(@PathVariable int id)
    {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(1,"Beverages"));
        categories.add(new Category(2, "Condiments"));
        categories.add(new Category (3,"Confections"));
        categories.add(new Category(4, "Dairy Products"));
        List<Category> resultCategories = new ArrayList<Category>();
        for (Category myCategory: categories){
            if(myCategory.getCategoryID()== id) resultCategories.add(myCategory);
        }
        return resultCategories;
    }
} */
