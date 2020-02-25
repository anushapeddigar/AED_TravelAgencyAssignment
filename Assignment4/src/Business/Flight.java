/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;


public class Flight {
    private String flightId;
    private String airlinerName;
    private String airPlaneNumber;
    private String departureLocation;
    private String arrivalLocation;
    private String timeOfDay;
    private Date departureDate;
    private Date arrivalDate;
    private int pricePerSeat;
   // private int totalSeatsAvailable; //write function to calculate
    private ArrayList<Seat> seatList;
    private int duration;

    public Flight(int rows, int cols) {
      this.seatList=new ArrayList<Seat>();
        for(int i=1;i<=rows;i++){
          for(int j=1;j<=cols;j++)  {
              Seat seat = new Seat();
       // listOfSeats.add(seat);
             seatList.add(seat);
             seat.setSeatNumber((i*10)+j);
             seat.occupied=false;
          }
        }
    }
    
    public Seat searchSeat(int seatNum){
    for (Seat s:this.seatList){
        if(s.getSeatNumber()==seatNum){
            return s;
        }
       
    }
     return null;}
    

    public int getDuration() {
        return duration;
    }

    public ArrayList<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(ArrayList<Seat> seatList) {
        this.seatList = seatList;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getAirPlaneNumber() {
        return airPlaneNumber;
    }

    public void setAirPlaneNumber(String airPlaneNumber) {
        this.airPlaneNumber = airPlaneNumber;
    }

    
    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getPricePerSeat() {
        return pricePerSeat;
    }

    public void setPricePerSeat(int pricePerSeat) {
        this.pricePerSeat = pricePerSeat;
    }

   

    

    public int getPerSeatRate() {
        return pricePerSeat;
    }

    public void setPerSeatRate(int perSeatRate) {
        this.pricePerSeat = pricePerSeat;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }
    
    @Override
    public String toString(){
        return flightId;
    }
}
