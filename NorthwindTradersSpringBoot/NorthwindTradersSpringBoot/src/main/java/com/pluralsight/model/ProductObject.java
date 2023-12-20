package com.pluralsight.model;


import java.math.BigDecimal;
import java.util.Objects;

public class ProductObject {
        private int productId;
        private  String name, category;
        private BigDecimal price;

        public ProductObject() {
        }


    public ProductObject(int productId, String name, String category, BigDecimal price) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getProductId() {
            return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
            return name;
        }

        public String getCategory() {
            return category;
        }

        public BigDecimal getPrice() {
            return price;
        }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductObject)) return false;
        ProductObject product = (ProductObject  ) o;
        return getProductId() == product.getProductId() &&
                getPrice().compareTo(product.getPrice()) == 0 && // Use compareTo for BigDecimal comparison
                Objects.equals(getName(), product.getName()) &&
                Objects.equals(getCategory(), product.getCategory());
    }


    @Override
    public int hashCode() {
        return Objects.hash(getProductId(), getName(), getCategory(), getPrice());
    }

    @Override
    public String toString() {
        return
                "Product ID: " + productId +
                        "\nProduct:  " + name +
                        "\nCategory: " + category +
                        "\nPrice:    " + price +
                        "\n -------- ";
    }
}

