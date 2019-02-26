package paterns.creational.factory.third;

import paterns.creational.factory.third.product.AbstractOrder;

public abstract class AbstractOrderFactory <T extends AbstractOrder> {
    public abstract T createOrder();
    public void anOperation() {
        System.out.println("operation");
    }
}
