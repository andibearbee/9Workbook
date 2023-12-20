package com.pluralsight.commandlLine;

import com.pluralsight.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class NorthwindApplication implements CommandLineRunner {
        private final ProductService productService;

    public NorthwindApplication(ProductService productService) {
        this.productService = productService;
    }

    @Override
    public void run(String... args) throws Exception {
      productService.getAllProducts();
    }

}
