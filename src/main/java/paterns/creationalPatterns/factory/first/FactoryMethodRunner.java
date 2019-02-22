package paterns.creationalPatterns.factory.first;

import paterns.creationalPatterns.factory.first.product.Product;

public class FactoryMethodRunner {
    public static void main(String[ ] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
        product.check();
    }
}
