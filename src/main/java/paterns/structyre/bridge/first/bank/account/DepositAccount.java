package paterns.structyre.bridge.first.bank.account;

import paterns.structyre.bridge.first.bank.Action;

public class DepositAccount extends Account {

    protected DepositAccount(Action action) {
        super(action);
    }

    @Override
    public boolean takeSum(double sum) {
        System.out.println("Performing by deposit account:");
        double interest = getAction().chargeInterest();
        double maxSum = getAction().defineMaxSum();
        // check amount
        System.out.print("accountID: "+ getId() +" : interest is " + interest);
        System.out.print(" : recording of changes in the state accounts");
        System.out.println(": withdrawal : " + sum);
        return true;
    }
}
