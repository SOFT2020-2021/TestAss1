package dk.cphbusiness.banking;

public class CustomerMock implements Customer {
    private String cpr;
    @Override
    public boolean transfer(long money, Account account, Customer target) {
        return false;
    }

    public CustomerMock(String cpr) {
        this.cpr = cpr;
    }

    @Override
    public String getCprNumber() {
        return this.cpr;
    }
}
