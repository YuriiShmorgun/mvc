package paterns.structyre.bridge.first.bank.account;

import paterns.structyre.bridge.first.bank.Action;

public abstract class Account {
    private int id;
    private double amount;
    private Action action;

    protected Account(Action action) {
        this.action = action;
    }

    public Action getAction() {
        return action;
    }

    protected void setAction(Action action) {
        this.action = action;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract boolean takeSum(double sum);
}
