/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author vikram
 */
public class TravelAgency {
    CustomerDirectory customerDirectory;
    MasterFlightDirectory flightDirectory;
    UserDirectory userDirectory;
    AirlinerDirectory airlinerDirectory;

    public TravelAgency() {
        customerDirectory = new CustomerDirectory();
        flightDirectory = new MasterFlightDirectory();
        userDirectory = new UserDirectory();
        airlinerDirectory = new AirlinerDirectory();
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public MasterFlightDirectory getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(MasterFlightDirectory flightDirectory) {
        this.flightDirectory = flightDirectory;
    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    public void setUserDirectory(UserDirectory userDirectory) {
        this.userDirectory = userDirectory;
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }
    
    
}
