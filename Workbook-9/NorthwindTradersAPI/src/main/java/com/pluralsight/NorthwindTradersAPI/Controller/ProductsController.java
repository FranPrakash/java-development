package com.pluralsight.NorthwindTradersAPI.Controller;
//Step 6 Update your ProductsController to inject the ProductDao bean through
//constructor injection.

import com.pluralsight.NorthwindTradersAPI.Models.Product;
import com.pluralsight.NorthwindTradersAPI.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductsController {

    private ProductDao dao;

    //Constructor
    @Autowired
    public ProductsController(ProductDao dao) {
        this.dao = dao;
    }

    // respond to http://localhost:8080/products
    @RequestMapping(path="/products", method= RequestMethod.GET)
    public List<Product> getProducts() {
        List<Product> myProducts = dao.getAll();
        return myProducts;
    }

    // respond to http://localhost:8080/products/2
    @RequestMapping(path="/products/{id}",method=RequestMethod.GET)
    public Product getProducts(@PathVariable int id)
    {
        Product myProduct = dao.getById(id);
        return myProduct;
    }

}
