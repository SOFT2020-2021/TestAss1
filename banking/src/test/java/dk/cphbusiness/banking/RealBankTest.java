package dk.cphbusiness.banking;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RealBankTest {

    private RealBank rb;
    private Account acc;

    @Before
    public void Setup(){
        // Arrange
        Map<String, Account> mockCollection = new HashMap<>();
        acc = new Account(new BankDummy(), new CustomerMock("4321"), "test");
        mockCollection.put(acc.getNumber(), acc);
        // Act
        rb = new RealBank("", "", mockCollection);
    }

    @Test
    public void testGetAccount() {
        // Assert
        Assert.assertEquals(rb.getAccount("test"), acc);
    }

    @Test
    public void registerAccountTest() {
        // Arrange
        acc = new Account(new BankDummy(), new CustomerMock("1234"), "test2");
        // Act
        Assert.assertEquals(null,rb.getAccount("1234"));
        rb.registerAccount(acc);
        // Assert
        Assert.assertEquals(rb.getAccount("1234"), acc);
    }

    @Test
    public void getCustomer() {
        acc = new Account(new BankDummy(), new CustomerMock("1234"), "test2");
        rb.registerAccount(acc);
        Assert.assertEquals(rb.getCustomer("1234"), acc.getCustomer());
    }

    @Test
    public void registerCustomerTest() {
        Customer customer = new CustomerMock("4321");
        acc = new Account(new BankDummy(), new CustomerMock("4321"), "test2");
        rb.registerCustomer(customer);
        Assert.assertEquals(rb.getCustomer("4321"), acc);
    }
}
