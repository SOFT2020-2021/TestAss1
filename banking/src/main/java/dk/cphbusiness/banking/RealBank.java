package dk.cphbusiness.banking;

import java.util.Map;

public class RealBank implements Bank {

    private String cvr;
    private String name;
    private Map<String, Account> bankAccounts;

    public RealBank(){
        //TODO
    }
    public RealBank(String cvr, String name, Map<String, Account> bankAccounts) {
        this.cvr = cvr;
        this.name = name;
        this.bankAccounts = bankAccounts;
    }

    @Override
    public Account getAccount(String number) {
        return bankAccounts.get(number);
    }

    @Override
    public void registerAccount(Account account) {
        bankAccounts.put(account.getCustomer().getCprNumber(), account);
    }

    @Override
    public Customer getCustomer(String number) {
        return bankAccounts.get(number).getCustomer();
    }

    @Override
    public void registerCustomer(Customer customer) {
        bankAccounts.put(customer.getCprNumber(), null);
    }

    @Override
    public String getName() {
     return this.name;
    }

}
