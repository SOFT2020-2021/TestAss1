package dk.cphbusiness.dto;

import dk.cphbusiness.banking.Account;
import dk.cphbusiness.banking.Bank;
import dk.cphbusiness.banking.Customer;
import dk.cphbusiness.banking.RealBank;

import java.util.Map;

public class BankDTO implements Bank{

    private String cvr;
    private String name;

    public BankDTO() {
    }



    public BankDTO(Bank bank){
        this.cvr = bank.getCvr();
        this.name = bank.getName();
    }

    public BankDTO(String cvr, String name, Map<String, AccountDTO> bankAccounts) {
        this.cvr = cvr;
        this.name = name;
    }

    public String getCvr() {
        return cvr;
    }

    public void setCvr(String cvr) {
        this.cvr = cvr;
    }

    @Override
    public Account getAccount(String number) {
        return null;
    }

    @Override
    public void registerAccount(Account account) {

    }

    @Override
    public Customer getCustomer(String number) {
        return null;
    }

    @Override
    public void registerCustomer(Customer customer) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
