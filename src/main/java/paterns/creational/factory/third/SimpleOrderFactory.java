package paterns.creational.factory.third;

import paterns.creational.factory.third.product.SimpleOrder;

public class SimpleOrderFactory extends AbstractOrderFactory <SimpleOrder> {
    @Override
    public SimpleOrder createOrder() {
        return new SimpleOrder();
    }
}
