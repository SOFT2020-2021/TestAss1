package dk.cphbusiness.banking;


public class BankMock implements Bank {

    private long money;
    private Account account;

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

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getCvr() {
        return null;
    }
}
