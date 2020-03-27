package dk.cphbusiness.controllers;

import dk.cphbusiness.banking.RealCustomer;
import dk.cphbusiness.dto.CustomerDTO;

public interface CustomerContract {


    public CustomerDTO getDTO(RealCustomer realCustomer);

}
