package dk.cphbusiness.banking;

public interface Customer {
    
    public boolean transfer(long money, Account account, Customer target);

    public String getCprNumber();
}
