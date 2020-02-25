/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vikram
 */
public class Customer {
    private String customerName;
    private String customerAge;
    private String customerGender;
    private long PassportNum;

    public ArrayList<CustomerFlights> getCustFlights() {
        return custFlights;
    }

    public void setCustFlights(ArrayList<CustomerFlights> custFlights) {
        this.custFlights = custFlights;
    }
    
   
    private ArrayList<CustomerFlights> custFlights;
    
    Customer()
    {
        this.custFlights = new ArrayList<CustomerFlights>();
    }
public CustomerFlights addCustFlights(){
    CustomerFlights customerFlights = new CustomerFlights();
    custFlights.add(customerFlights);
    return customerFlights;
    
}
    
    public String getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(String customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    
    public String getCustomerName() {
        return customerName;
    }


    public long getPassportNum() {
        return PassportNum;
    }

    public void setPassportNum(long PassportNum) {
        this.PassportNum = PassportNum;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    
    
    
    
    
}
