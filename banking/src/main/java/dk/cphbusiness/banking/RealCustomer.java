package dk.cphbusiness.banking;

public class RealCustomer implements Customer{

    private String cpr;

    private String name;

    @Override
    public boolean transfer(long money, Account account, Customer target) {
        return false;
    }

    @Override
    public String getCprNumber() {
        return this.cpr;
    }
}
