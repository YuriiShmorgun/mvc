package paterns.creationalPatterns.factory.third;

import paterns.creationalPatterns.factory.third.product.AbstractOrder;
import paterns.creationalPatterns.factory.third.product.ExtendedOrder;

public class ExtendedOrderFactory extends AbstractOrderFactory <ExtendedOrder> {
    @Override
    public ExtendedOrder createOrder() {
        return new ExtendedOrder();
    }
}
