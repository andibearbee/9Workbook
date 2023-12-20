package com.pluralsight.service;

import com.pluralsight.dao.ProductDAO;
import com.pluralsight.model.ProductObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

    @Component
    public class ProductService {

        private final ProductDAO productDAO;

        @Autowired
        public ProductService(ProductDAO simpleProductDAOImp) {
            this.productDAO = simpleProductDAOImp;
        }

        public List<ProductObject> getAllProducts() {
            return productDAO.getAll();
        }



    }




