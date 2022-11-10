package devsuperior.Enumeracao.application;

import devsuperior.Enumeracao.entities.enums.OrderStatus;
import devsuperior.Enumeracao.entitiesp.Order;

import java.util.Date;

public class application {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
    }
}
