package com.klh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klh.model.Product;
import com.klh.reposerity.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    // Get products by category
    @GetMapping("/category/{category}")
    public List<Product> getByCategory(@PathVariable String category) {
        return repo.findByCategory(category);
    }

    // Filter products by price range
    @GetMapping("/filter")
    public List<Product> filterByPrice(@RequestParam double min, @RequestParam double max) {
        return repo.findByPriceBetween(min, max);
    }

    // Get products sorted by price
    @GetMapping("/sorted")
    public List<Product> sortedProducts() {
        return repo.getProductsSortedByPrice();
    }

    // Get expensive products
    @GetMapping("/expensive/{price}")
    public List<Product> expensiveProducts(@PathVariable double price) {
        return repo.getExpensiveProducts(price);
    }

    // JPQL category method
    @GetMapping("/category-jpql/{category}")
    public List<Product> getByCategoryJPQL(@PathVariable String category) {
        return repo.getProductsByCategoryJPQL(category);
    }
}