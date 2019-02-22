package paterns.creationalPatterns.factory.first;

import paterns.creationalPatterns.factory.first.product.ConcreteProduct;
import paterns.creationalPatterns.factory.first.product.Product;

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
