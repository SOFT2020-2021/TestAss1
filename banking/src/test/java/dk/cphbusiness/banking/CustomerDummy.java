package dk.cphbusiness.banking;

public class CustomerDummy implements Customer {

    @Override
    public boolean transfer(long money, Account account, Account target) {
        return false;
    }

    @Override
    public String getCprNumber() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }
}
