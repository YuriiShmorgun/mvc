package paterns.creationalPatterns.factory.second.product;

import paterns.creationalPatterns.factory.second.product.AbstractOrder;

public class SimpleOrder extends AbstractOrder {

    private String hi;

    public String getHi() {
        return hi;
    }

    public void setHi(String hi) {
        this.hi = hi;
    }

    @Override
    public void perform() {
        System.out.println("Simple order");
    }

    public SimpleOrder() {
    }
}
