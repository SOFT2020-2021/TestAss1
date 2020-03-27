package dk.cphbusiness.banking;

import java.util.ArrayList;
import java.util.List;

public class Account extends ModelBase{
    private Bank bank;
    private Customer customer;
    private String number;
    private long balance = 0;
    private List<Movement> transactions = new ArrayList();

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setTransactions(List<Movement> transactions) {
        this.transactions = transactions;
    }



    public Account(Bank bank, Customer customer, String number) {
        this.bank = bank;
        this.customer = customer;
        this.number = number;
    }

    public Account() {

    }

    public Bank getBank() {
        return bank;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getNumber() {
        return number;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long insertionAmount) {
        balance += insertionAmount;
    }

    private long getUnixTimestamp(){
        return System.currentTimeMillis() / 1000L;
    }

    public void transfer(long amount, Account target) {
        balance -= amount;
        target.balance += amount;
        target.addTransaction(this, amount, getUnixTimestamp());
        amount *= -1;
        addTransaction(target, amount, getUnixTimestamp());

    }

    public List<Movement> getTransactions(){
        return transactions;
    }

    public void addTransaction(Account acc, long amount, long datetime){
        transactions.add(new Movement(acc, amount, datetime));
    }

    public void transfer(long amount, String targetNumber) {
        Account target = bank.getAccount(targetNumber);
        transfer(amount, target);
        bank.getAccount(targetNumber).addTransaction(this, amount, getUnixTimestamp());
        amount *= -1;
        addTransaction(target, amount, getUnixTimestamp());
    }
}
