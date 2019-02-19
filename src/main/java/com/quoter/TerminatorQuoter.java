package com.quoter;

public class TerminatorQuoter implements Quoter {

    private String message;

    @InjectRandomInt(min=2, max=7)
    private int repeat;

    public void init(){
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public TerminatorQuoter() {
        System.out.println("Phase 1");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        for(int i=0; i<repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
