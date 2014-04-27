package com.thoughtworks.accountbalance;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account depositAccount = new Account(100.0);
        depositAccount.deposit(50.0);
        assertThat(depositAccount.currentBalance(), is(150.0));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account withdrawAccount = new Account(100.0);
        withdrawAccount.withdraw(50.0);
        assertThat(withdrawAccount.currentBalance(), is(50.0));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account faultAccount = new Account(50.0);
        faultAccount.withdraw(100.0);
        assertThat(faultAccount.currentBalance(), is(50.0));
    }
}
