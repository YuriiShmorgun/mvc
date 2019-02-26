package paterns.creational.factory.first;

import paterns.creational.factory.first.product.Product;

public abstract class Creator {

    protected abstract Product factoryMethod();

    protected void beforeOperation() {
        System.out.println("Before operation");
    }

    protected void  afterOperation (){
        System.out.println("After operation");
    }
}
