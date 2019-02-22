package paterns.creationalPatterns.factory.third;

import paterns.creationalPatterns.factory.third.product.AbstractOrder;
import paterns.creationalPatterns.factory.third.product.SimpleOrder;

public class SimpleOrderFactory extends AbstractOrderFactory <SimpleOrder> {
    @Override
    public SimpleOrder createOrder() {
        return new SimpleOrder();
    }
}
