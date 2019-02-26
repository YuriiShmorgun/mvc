package paterns.creational.factory.third;

import paterns.creational.factory.third.product.ExtendedOrder;

public class ExtendedOrderFactory extends AbstractOrderFactory <ExtendedOrder> {
    @Override
    public ExtendedOrder createOrder() {
        return new ExtendedOrder();
    }
}
