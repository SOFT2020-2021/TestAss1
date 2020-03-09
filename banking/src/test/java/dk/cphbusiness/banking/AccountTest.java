package dk.cphbusiness.banking;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AccountTest {

    Bank bank;
    Customer customer;
    String number;
    Account account;
    Account target;

    @Before
    public void setup(){
        bank = new BankDummy();
        customer = new CustomerDummy();
        number = "ABC12345";
        account = new Account(bank, customer, number);
        target = new Account(bank, customer, "TGT12345");
    }

    @After
    public void teardown(){
        bank = null;
        customer = null;
        number = null;
        account = null;
        target = null;
    }

    @Test
    public void testCreateAccount() throws Exception {
        assertNotNull(account);
    }

    @Test
    public void testCreateAccountWithBank() {
        assertEquals(bank, account.getBank());
        assertNotNull(account.getBank());
    }

    @Test
    public void testCreateAccountWithNumber() {
        assertEquals(number, account.getNumber());
        assertNotNull(account.getNumber());
    }

    @Test
    public void testCreateAccountWithZeroBalance() {
        assertEquals(0L, account.getBalance());
    }

    @Test
    public void testTransferPositiveAmount() {
        int targetTransactionsSizeBefore = target.getTransactions().size();
        int sourceTransactionsSizeBefore = target.getTransactions().size();
        account.transfer(10000, target);

        assertEquals(targetTransactionsSizeBefore + 1, target.getTransactions().size());
        assertEquals(sourceTransactionsSizeBefore + 1, account.getTransactions().size());
        assertEquals(-10000, account.getBalance());
        assertEquals(10000, target.getBalance());
    }

    @Test
    public void testTransferPositiveAmountUsingNumber() {
        BankStub bank = new BankStub();
        String targetNumber = "TGT12345";
        Account target = new Account(bank, customer, targetNumber);
        Account source = new Account(bank, customer, number);
        bank.setAccount(target);

        source.transfer(10000, targetNumber);
        assertEquals(-10000, source.getBalance());
        assertEquals(10000, target.getBalance());
    }
}
