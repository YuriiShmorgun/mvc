package paterns.creational.factory.third;

import paterns.creational.factory.third.product.AbstractOrder;

public class Client {
    public void someOperation(AbstractOrderFactory factory) {
        AbstractOrder order = factory.createOrder();
        order.perform();
    }
}
