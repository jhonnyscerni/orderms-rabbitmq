package br.com.app.ordermsrabbitmq.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.math.BigDecimal;
import java.util.List;

import static org.springframework.data.mongodb.core.mapping.FieldType.DECIMAL128;

@Document(collection = "tb_orders")
public class Order {

    @MongoId
    private Long orderId;
    @Indexed(name = "customer_id_index")
    private Long customerId;
    @Field(targetType = DECIMAL128)
    private BigDecimal total;
    private List<Item> items;

    public Order() {
    }

    public Order(Long orderId, Long customerId, List<Item> items) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.items = items;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}