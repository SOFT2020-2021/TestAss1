package dk.cphbusiness.banking;

import dk.cphbusiness.dto.CustomerDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CustomerDTOTest {

    private CustomerDTO customerDTO;
    private RealCustomer customer;
    private String mockString;
    private String mockString2;

    @Before
    public void setup(){
        this.customerDTO = new CustomerDTO();
        this.customer = new RealCustomer();
        mockString = new String("Jonas Thorhauge Grønbek");
        mockString2 = new String("Kristoffer 'kongen' Tølbøll");
        this.customerDTO.setName(mockString);
        this.customerDTO.setCpr("230495-1239");
        this.customer.setName(mockString2);
        this.customer.setCpr("290396-3423");
    }


    @Test
    public void testCustomerDTO(){
        Assert.assertNotEquals(customer.getName(), customerDTO.getName());
        Assert.assertNotEquals(customer.getCprNumber(), customerDTO.getCpr());
        Assert.assertNotEquals(mockString.hashCode(), mockString2.hashCode());
    }
}
