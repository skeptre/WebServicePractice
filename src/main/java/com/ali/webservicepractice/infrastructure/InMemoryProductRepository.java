package com.ali.webservicepractice.infrastructure;

import com.ali.webservicepractice.domain.Product;
import com.ali.webservicepractice.application.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class InMemoryProductRepository implements ProductRepository {

    private static final Map<String, Product> productStore = new ConcurrentHashMap<>();

    static {
        productStore.put("A", new Product("A", 100.0));
        productStore.put("B", new Product("B", 200.0));
        productStore.put("C", new Product("C", 300.0));
        productStore.put("D", new Product("D", 400.0));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productStore.values());
    }
}
