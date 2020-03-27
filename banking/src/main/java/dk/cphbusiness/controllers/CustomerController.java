package dk.cphbusiness.controllers;

import dk.cphbusiness.banking.RealCustomer;
import dk.cphbusiness.dto.CustomerDTO;

public class CustomerController implements CustomerContract {


    @Override
    public CustomerDTO getDTO(RealCustomer realCustomer) {
        return new CustomerDTO(realCustomer);
    }

}
