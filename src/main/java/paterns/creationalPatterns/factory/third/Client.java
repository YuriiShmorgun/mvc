package paterns.creationalPatterns.factory.third;

import paterns.creationalPatterns.factory.third.product.AbstractOrder;

public class Client {
    public void someOperation(AbstractOrderFactory factory) {
        AbstractOrder order = factory.createOrder();
        order.perform();
    }
}
