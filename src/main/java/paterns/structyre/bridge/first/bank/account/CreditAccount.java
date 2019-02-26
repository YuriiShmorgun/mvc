package paterns.structyre.bridge.first.bank.account;

import paterns.structyre.bridge.first.bank.Action;

public class CreditAccount extends Account {

    private double limitCredit;

    public double getLimitCredit() {
        return limitCredit;
    }
    public void setLimitCredit(double limitCredit) {
        this.limitCredit = limitCredit;
    }
    public CreditAccount(Action action) {
        super(action);
    }
    public boolean takeSum(double sum) {
        System.out.println("Performing by credit account:");
        double maxSum = getAction().defineMaxSum();
        double payment = getAction().increasePayment();
        System.out.print("accountID: "+ getId() +" increase monthly payments: "+ payment);
        System.out.print(": recording of changes in the state accounts");
        System.out.println(" : withdrawal :" + sum);
        return true;
    }
}
