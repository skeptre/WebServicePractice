package com.ali.webservicepractice.application;
import com.ali.webservicepractice.domain.Product;
import java.util.List;

    public interface ProductRepository {
        List<Product> findAll();
    }

