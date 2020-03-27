package dk.cphbusiness.miscellaneous;

import dk.cphbusiness.banking.Account;
import dk.cphbusiness.banking.Customer;

public class BaseCustomer implements Customer {
  public BaseCustomer(String number, String name) { }

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
