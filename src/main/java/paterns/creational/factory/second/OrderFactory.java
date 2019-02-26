package paterns.creational.factory.second;

import paterns.creational.factory.second.product.TypeOrder;
import paterns.creational.factory.second.product.SimpleOrder;
import paterns.creational.factory.second.product.AbstractOrder;
import paterns.creational.factory.second.product.ExtendedOrder;

public class OrderFactory {
    public static AbstractOrder createOrderFromFactory(TypeOrder type){
        switch(type) {
            case SIMPLE:
                return new SimpleOrder();
            case EXTENDED:
                return new ExtendedOrder();
            default:
                throw new EnumConstantNotPresentException(TypeOrder.class, type.name());
        }
    }
    public void anOperation() {
        System.out.println("operation");
    }
}
