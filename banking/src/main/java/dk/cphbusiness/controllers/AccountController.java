package dk.cphbusiness.controllers;

import dk.cphbusiness.banking.Account;
import dk.cphbusiness.banking.Customer;
import dk.cphbusiness.dto.AccountDTO;
import dk.cphbusiness.dto.BankDTO;
import dk.cphbusiness.dto.CustomerDTO;
import dk.cphbusiness.dto.MovementDTO;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountController implements AccountContract {




    @Override
    public AccountDTO getAccount(Account account) {
        AccountDTO accountDTO = new AccountDTO();

        BankDTO bankDTO = new BankDTO(account.getBank());
        accountDTO.setBank(bankDTO);

        CustomerDTO customer = new CustomerDTO(account.getCustomer());


        return accountDTO;
    }

    @Override
    public List<MovementDTO> getAccountTransactions(Account account) {
        AccountDTO accountDTO = new AccountDTO(account);
        return accountDTO.getTransactions();
    }

}
