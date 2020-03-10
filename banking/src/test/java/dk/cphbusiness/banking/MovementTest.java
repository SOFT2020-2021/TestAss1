package dk.cphbusiness.banking;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MovementTest {
    Account acc;

    @Test
    public void createMovement(){
        // Arrange
        long amount =1000;
        long timestamp = 10000;
        acc = new Account(new BankDummy(), new CustomerMock("4321"), "test");

        // Act

        Movement movementTest = new Movement(acc,amount,timestamp);

        // Assert
        Assert.assertEquals(movementTest.getTimestamp(),timestamp  ) ;
        Assert.assertEquals(movementTest.getAmount(),amount);
        Assert.assertEquals(movementTest.getTarget(), acc);
    }
}
