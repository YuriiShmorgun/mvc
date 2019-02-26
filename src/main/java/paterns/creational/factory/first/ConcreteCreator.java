package paterns.creational.factory.first;

import paterns.creational.factory.first.product.ConcreteProduct;
import paterns.creational.factory.first.product.Product;

public class ConcreteCreator extends Creator {
    @Override
    public Product factoryMethod() {
        // подготовительные действия
        this.beforeOperation();
        Product product = new ConcreteProduct();
        this.afterOperation();
        return product;
    }
}
