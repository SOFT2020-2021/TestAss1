package dk.cphbusiness.banking;

public class CustomerDummy implements Customer {
    @Override
    public boolean transfer(long money, Account account, Customer target) {
        return false;
    }

    @Override
    public String getCprNumber() {
        return null;
    }
}
