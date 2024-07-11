package br.com.app.ordermsrabbitmq.listener.dto;

import java.util.List;

public record OrderCreatedEvent(Long codigoPedido,
                                Long codigoCliente,
                                List<OrderItemEvent> itens) {
}