package dk.cphbusiness.banking;

import dk.cphbusiness.dto.AccountDTO;
import dk.cphbusiness.dto.MovementDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class AccountDTOTest {

    private Account account;
    private Account account1;
    private AccountDTO accountDTO;

    @Before
    public void setup(){
        this.account = new Account();
        this.account1 = new Account();
        this.accountDTO = new AccountDTO();
        account1.setBalance(2000);
        account.addTransaction(account1, 1000L, 100000L);
        account.addTransaction(account1, 1200L, 120000L);
        account.addTransaction(account1, 1300L, 140000L);
        Bank bankMock = new BankMock();
        CustomerDummy customerDummy = new CustomerDummy();
        account.setBank(bankMock);
        account.setBalance(3000);
        account.setCustomer(customerDummy);
        accountDTO.setBank(bankMock);
        accountDTO.setBalance(3000);
        accountDTO.setCustomer(customerDummy);
    }


    @Test
    public void testAccount(){
        System.out.println(account.getTransactions());
        AccountDTO accountDTO = new AccountDTO(account);
        List<MovementDTO> movementList = accountDTO.getTransactions();
        for (int i = 0; i < movementList.size() -1 ; i++) {
            Assert.assertEquals(movementList.get(i).getAmount(), account.getTransactions().get(i).amount);
            Assert.assertEquals(movementList.get(i).getTimestamp(), account.getTransactions().get(i).timestamp);
        }

    }


    @Test
    public void testGetAccount(){
        Assert.assertEquals(account.getBalance(), accountDTO.getBalance());
        Assert.assertEquals(account.getBank().getCvr(), accountDTO.getBank().getCvr());
        Assert.assertEquals(account.getBank().getName(), accountDTO.getBank().getName());
        Assert.assertEquals(account.getCustomer().getCprNumber(), accountDTO.getCustomer().getCprNumber());
        Assert.assertEquals(account.getCustomer().getName(), accountDTO.getCustomer().getName());
    }





}
