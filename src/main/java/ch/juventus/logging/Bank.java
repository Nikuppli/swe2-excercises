package ch.juventus.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Bank {
    final Logger logger = LoggerFactory.getLogger(Bank.class);

    double balance = 100;

    public Bank(double balance) {
        this.balance = balance;
    }

    public double withdraw(double quantity) throws Exception {
        logger.debug("Kontostand ist zu tief ({} Franken). Es kostet {}",
                balance, quantity);

        if (this.balance - quantity < 0) {
            throw new Exception("Kein Guthaben");
        }
        balance = this.balance - quantity;
        return balance;
    }

    public double deposit(double quantity) {
        return this.balance += quantity;
    }

    public double retrieveBalance() {
        return balance;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
