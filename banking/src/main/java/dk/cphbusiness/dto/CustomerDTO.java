package dk.cphbusiness.dto;

import dk.cphbusiness.banking.Customer;

public class CustomerDTO extends Base{

    private String cpr;

    private String name;


    public CustomerDTO(String cpr, String name) {
        this.cpr = cpr;
        this.name = name;
    }

    public CustomerDTO(Customer customer) {
        this.cpr = customer.getCprNumber();
        this.name = customer.getName();
    }

    public CustomerDTO() {

    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
