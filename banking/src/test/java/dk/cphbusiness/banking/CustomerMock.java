package dk.cphbusiness.banking;

public class CustomerMock implements Customer {
    private String cpr;

    private String name;

    public CustomerMock(String cpr, String name) {
        this.cpr = cpr;
        this.name = name;
    }

    public CustomerMock(String s) {
        this.name = s;
    }

    @Override
    public boolean transfer(long money, Account account, Account target) {
        try {
            account.transfer(money, target);
            return true;
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String getCprNumber() {
        return this.cpr;
    }

    @Override
    public String getName() {
        return null;
    }
}
