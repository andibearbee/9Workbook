package com.pluralsight.dao;

import com.pluralsight.model.ProductObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SimpleProductsDAOImp implements ProductDAO {
    private final List<ProductObject> product = new ArrayList<>();

    public SimpleProductsDAOImp() {
        this.product.add(new ProductObject(1, "Chai", "Beverages", new BigDecimal("18.00")));
        this.product.add(new ProductObject(2, "Chang", "Beverages", new BigDecimal("19.00")));
        this.product.add(new ProductObject(3, "Aniseed Syrup", "Condiments", new BigDecimal("10.00")));
    }

    @Override
    public ProductObject add(ProductObject product) {
       // product.add(product);
        return product;
    }

    @Override
    public List<ProductObject> getAll() {
        return product;
    }
}
