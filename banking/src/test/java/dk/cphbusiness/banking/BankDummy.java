package dk.cphbusiness.banking;

public class BankDummy implements Bank {

  @Override
  public Account getAccount(String number) {
    throw new UnsupportedOperationException();
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
    throw new UnsupportedOperationException();
    }

  @Override
  public String getCvr() {
    return null;
  }
}
