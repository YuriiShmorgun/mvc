package paterns.creationalPatterns.factory.second;

import paterns.creationalPatterns.factory.second.product.AbstractOrder;
import paterns.creationalPatterns.factory.second.product.TypeOrder;

import java.lang.reflect.Constructor;

public class Main {


    public static void main(String[] args) {
        AbstractOrder order = OrderFactory.createOrderFromFactory(TypeOrder.EXTENDED);
        order.perform();

        Class someClass = order.getClass();
        Constructor[] constructors = someClass.getDeclaredConstructors();
    }
}
