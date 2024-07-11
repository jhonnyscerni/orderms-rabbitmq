package br.com.app.ordermsrabbitmq.model;

import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;

import static org.springframework.data.mongodb.core.mapping.FieldType.DECIMAL128;

public class Item {

    private String product;
    private Integer quantity;
    @Field(targetType = DECIMAL128)
    private BigDecimal price;

    public Item() {
    }

    public Item(String product, Integer quantity, BigDecimal price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
