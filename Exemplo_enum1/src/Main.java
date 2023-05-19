import entities.Order;
import entitiesEnum.OrderStatus;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Order order = new Order(1080, new Date(), OrderStatus.pending_payment);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.delivered;

        OrderStatus os2 = OrderStatus.valueOf("delivered");

        System.out.println(os1);
        System.out.println(os2);
    }
}