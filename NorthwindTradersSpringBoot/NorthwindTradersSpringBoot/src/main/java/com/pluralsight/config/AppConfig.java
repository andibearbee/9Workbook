package com.pluralsight.config;

import com.pluralsight.dao.SimpleProductsDAOImp;
import com.pluralsight.dao.ProductDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
    public class AppConfig {
        @Bean
        public ProductDAO productDao(){
            return new SimpleProductsDAOImp();
        }
    }

