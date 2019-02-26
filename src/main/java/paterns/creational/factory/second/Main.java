package paterns.creational.factory.second;

import paterns.creational.factory.second.product.AbstractOrder;
import paterns.creational.factory.second.product.TypeOrder;

import java.lang.reflect.Constructor;

public class Main {


    public static void main(String[] args) {
        AbstractOrder order = OrderFactory.createOrderFromFactory(TypeOrder.EXTENDED);
        order.perform();

        Class someClass = order.getClass();
        Constructor[] constructors = someClass.getDeclaredConstructors();
    }
}
