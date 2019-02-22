package paterns.creationalPatterns.factory.second;

import paterns.creationalPatterns.factory.second.product.SimpleOrder;
import paterns.creationalPatterns.factory.second.product.AbstractOrder;
import paterns.creationalPatterns.factory.second.product.ExtendedOrder;
import paterns.creationalPatterns.factory.second.product.TypeOrder;

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
