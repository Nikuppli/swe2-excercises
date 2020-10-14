package ch.juventus.logging;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class BankTest {

    private Bank bank;

    @BeforeEach
    void setup(){
        bank = new Bank(500);
    }

    @Test
    void withdraw() throws Exception {
        // given
        assertEquals(490, this.bank.withdraw(10));
    }

    @Test
    void depostit() {
        assertThrows(Exception.class, () -> this.bank.withdraw(1000));
    }

    @Test
    void retrieveBalance() {
        assertEquals(510, this.bank.deposit(10));
    }

}