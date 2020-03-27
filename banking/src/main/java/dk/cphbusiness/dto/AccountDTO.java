package dk.cphbusiness.dto;

import dk.cphbusiness.banking.Account;
import dk.cphbusiness.banking.Bank;
import dk.cphbusiness.banking.Customer;
import dk.cphbusiness.banking.Movement;

import java.util.ArrayList;
import java.util.List;

public class AccountDTO extends Base{

    private Bank bank;
    private Customer customer;
    private String number;
    private long balance = 0;
    private List<MovementDTO> transactions = new ArrayList();


    public AccountDTO(Account account){
        List<MovementDTO> transactions = new ArrayList<>();
        for(Movement movement: account.getTransactions()){
            transactions.add(new MovementDTO(movement));
        }
        this.transactions = transactions;
    }


    public AccountDTO() {
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public List<MovementDTO> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<MovementDTO> transactions) {
        this.transactions = transactions;
    }

    public AccountDTO(BankDTO bank, Customer customer, String number, long balance) {
        this.bank = bank;
        this.customer = customer;
        this.number = number;
        this.balance = balance;
    }
}
