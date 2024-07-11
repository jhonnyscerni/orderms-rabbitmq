package br.com.app.ordermsrabbitmq.controller.dto;


import br.com.app.ordermsrabbitmq.model.Order;

import java.math.BigDecimal;

public record OrderResponse(Long orderId,
                            Long customerId,
                            BigDecimal total) {

    public static OrderResponse fromEntity(Order entity) {
        return new OrderResponse(entity.getOrderId(), entity.getCustomerId(), entity.getTotal());
    }
}