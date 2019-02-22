package paterns.creationalPatterns.factory.first;

import paterns.creationalPatterns.factory.first.product.Product;

public abstract class Creator {

    protected abstract Product factoryMethod();

    protected void beforeOperation() {
        System.out.println("Before operation");
    }

    protected void  afterOperation (){
        System.out.println("After operation");
    }
}
