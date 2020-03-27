package dk.cphbusiness.banking;

public class RealCustomer extends ModelBase implements Customer {

    private String cpr;

    private String name;

    public RealCustomer(String cpr, String name) {
        this.cpr = cpr;
        this.name = name;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RealCustomer() {

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
        return this.name;
    }
}
