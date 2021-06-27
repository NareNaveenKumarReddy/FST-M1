package tests;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

import main.BankAccount;
import main.NotEnoughFundsException;

public class Activity2_Test {
	
	@Test
    public void notEnoughFunds() {
        // Create an object for BankAccount class
        BankAccount account = new BankAccount(9);
 
        // Assertion for exception
        assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10),
                "Balance must be greater than amount of withdrawal");
    }
 
    @Test
    public void enoughFunds() {
        // Create an object for BankAccount class
        BankAccount account = new BankAccount(100);
    
        // Assertion for no exceptions
        assertDoesNotThrow(() -> account.withdraw(100));
    }

}
