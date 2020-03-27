package dk.cphbusiness.banking;

public interface Customer {

    public boolean transfer(long money, Account account, Account target);

    public String getCprNumber();

    public String getName();

}
