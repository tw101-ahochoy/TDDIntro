package com.thoughtworks.accountbalance;

/**
 * Created by ahochoy on 4/27/14.
 */
public class Account {


    private double balance;

    public Account(double v) {
        this.balance = v;
    }

    public void deposit(double v) {
        this.balance += v;
    }

    public void withdraw(double v) {
        if( v <= this.balance) this.balance -= v;
    }

    public double currentBalance(){
        return this.balance;
    }
}
