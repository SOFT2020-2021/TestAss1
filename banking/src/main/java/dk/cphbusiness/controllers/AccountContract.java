package dk.cphbusiness.controllers;

import dk.cphbusiness.banking.Account;
import dk.cphbusiness.banking.ModelBase;
import dk.cphbusiness.dto.AccountDTO;
import dk.cphbusiness.dto.Base;
import dk.cphbusiness.dto.MovementDTO;

import java.util.List;

public interface AccountContract {

    public AccountDTO getAccount(Account account);

    public List<MovementDTO> getAccountTransactions(Account account);
}
