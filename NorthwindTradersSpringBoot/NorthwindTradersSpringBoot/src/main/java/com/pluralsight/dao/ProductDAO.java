package com.pluralsight.dao;

import com.pluralsight.model.ProductObject;

import java.util.List;

public interface ProductDAO {

        ProductObject add(ProductObject product);

        List<ProductObject> getAll();

}