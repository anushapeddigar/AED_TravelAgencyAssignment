/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;


public class MasterFlightDirectory {
    
    ArrayList<Flight> flightList;

    public MasterFlightDirectory() {
        flightList = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    
    public Flight addFlight(int rows,int cols){
        Flight flight = new Flight(rows,cols);
        flightList.add(flight);
        return flight;
    }
    
    public void deleteFlight(Flight flight){
        flightList.remove(flight); 
    }
   
public ArrayList < Flight > searchFlight(String departureLocation, String arrivalLocation, String flightNo, String departureDate, String timeofDay) {
 ArrayList < Flight > result = new ArrayList < Flight > ();
 for (Flight flight: flightList) {
  if (departureLocation.equals("") && arrivalLocation.equals("") && flightNo.equals("") && departureDate.equals("") && timeofDay.equals("")) {
   result.add(flight);
  }
  if(flightNo.equals("")){
  if (timeofDay.equals("")) {
   if (flight.getDepartureLocation().toLowerCase().equals(departureLocation.toLowerCase()) && flight.getArrivalLocation().toLowerCase().equals(arrivalLocation.toLowerCase()) || flight.getTimeOfDay().equals(timeofDay) || flight.getDepartureDate().equals(departureDate) || flight.getFlightId().equals(flightNo)) {
    result.add(flight);
   }
  } else {
   if (flight.getDepartureLocation().toLowerCase().equals(departureLocation.toLowerCase()) && flight.getArrivalLocation().toLowerCase().equals(arrivalLocation.toLowerCase()) && flight.getTimeOfDay().equals(timeofDay) || flight.getDepartureDate().equals(departureDate) || flight.getFlightId().equals(flightNo)) {
    result.add(flight);
   }
  }
 }
  else{
      if (timeofDay.equals("")) {
   if (flight.getDepartureLocation().toLowerCase().equals(departureLocation.toLowerCase()) && flight.getArrivalLocation().toLowerCase().equals(arrivalLocation.toLowerCase())&& flight.getFlightId().equals(flightNo) || flight.getTimeOfDay().equals(timeofDay)  || flight.getDepartureDate().equals(departureDate) ) {
    result.add(flight);
   }
  } else {
   if (flight.getDepartureLocation().toLowerCase().equals(departureLocation.toLowerCase()) && flight.getArrivalLocation().toLowerCase().equals(arrivalLocation.toLowerCase()) && flight.getTimeOfDay().equals(timeofDay) && flight.getFlightId().equals(flightNo) || flight.getDepartureDate().equals(departureDate) ) {
    result.add(flight);
   }
  }
  }
 }
 return result;
}
    
public ArrayList<Flight> searchFlight1(String departureLocation, String arrivalLocation){
      
       ArrayList<Flight> result = new ArrayList<Flight>();
       ArrayList<Flight> result1 = new ArrayList<Flight>();
       ArrayList<Flight> result2 = new ArrayList<Flight>();
      for (Flight flight: flightList) {
if (departureLocation.equals("") && arrivalLocation.equals("")) {
             result.add(flight);
             return result;
          }
           if (flight.getDepartureLocation().toLowerCase().equals(departureLocation.toLowerCase()) && flight.getArrivalLocation().toLowerCase().equals(arrivalLocation.toLowerCase())) {
             result.add(flight);
             
          }
           else if (flight.getDepartureLocation().toLowerCase().equals(departureLocation.toLowerCase()) || flight.getArrivalLocation().toLowerCase().equals(arrivalLocation.toLowerCase())) {
             result1.add(flight);
          }
       }
      String tempArrival=null;
      for (Flight flight1 : result1){
          if(flight1.getDepartureLocation().toLowerCase().equals(departureLocation.toLowerCase()))
          {
              tempArrival = flight1.getArrivalLocation().toLowerCase();
              result.add(flight1);
              break;
          }
      }
      for(Flight flight2 : result1)
      {
          if(flight2.getArrivalLocation().toLowerCase().equals(arrivalLocation.toLowerCase())){
              if(flight2.getDepartureLocation().toLowerCase().equals(tempArrival))
          {
              result.add(flight2);
          }
          }
          
      }
      return result;
 }
    
public ArrayList<Flight> searchFlight1(String departureLocation, String arrivalLocation,String departureLocation1, String arrivalLocation1){
      
      ArrayList<Flight> result = new ArrayList<Flight>();
      for (Flight flight: flightList) {
           if (departureLocation.equals("") && arrivalLocation.equals("")) {
              result.add(flight);
           }
           if (flight.getDepartureLocation().toLowerCase().equals(departureLocation.toLowerCase()) && flight.getArrivalLocation().toLowerCase().equals(arrivalLocation.toLowerCase())) {
             result.add(flight);
          }
           if (flight.getDepartureLocation().toLowerCase().equals(departureLocation1.toLowerCase()) && flight.getArrivalLocation().toLowerCase().equals(arrivalLocation1.toLowerCase())) {
             result.add(flight);
          }
       }
      return result;
 }
    
//    public ArrayList<Flight> searchFlight(String preferredTime){
//        ArrayList<Flight> result = new ArrayList<Flight>();
//        for (Flight flight: flightList) {
//            if (flight.getTimeOfDay().equals(preferredTime)) {
//                result.add(flight);
//            }
//        }
//        return result;
//    }

   
    
}
