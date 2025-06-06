    package com.ali.webservicepractice.domain;

    public class Product {
        private final String productCode;
        private final double price;


        public Product(String productCode, double price) {
            this.productCode = productCode;
            this.price = price;
        }

        public String getProductCode(){
            return productCode;
        }

        public double getPrice(){
            return price;
        }
    }
