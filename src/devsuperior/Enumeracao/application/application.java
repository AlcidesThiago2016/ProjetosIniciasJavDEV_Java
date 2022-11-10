package devsuperior.Enumeracao.application;

import devsuperior.Enumeracao.entities.enums.OrderStatus;
import devsuperior.Enumeracao.entitiesp.Order;

import java.util.Date;

public class application {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;

        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        OrderStatus os3 = OrderStatus.SHIPPED;

        OrderStatus os4 = OrderStatus.PROCESSING;

        System.out.println(os1);
        System.out.println(os2);
        System.out.println(os3);
        System.out.println(os4);
    }
}
