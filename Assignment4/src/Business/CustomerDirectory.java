/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author vikram
 */
public class CustomerDirectory {
    ArrayList<Customer> customerList;

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }

    public CustomerDirectory() {
        customerList = new ArrayList<>();
    }
    
    public Customer addCustomer(){
        Customer customer = new Customer();
        customerList.add(customer);
        return customer;
    }    
    
    public Customer searchCustomer(long passportNum){
        for (Customer c:getCustomerList()){
            if (c.getPassportNum()==passportNum){
                return c;
            }
        }
        return null;
    }
}
