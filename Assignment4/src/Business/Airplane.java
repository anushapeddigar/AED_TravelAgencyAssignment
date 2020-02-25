/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author 16175
 */
public class Airplane {
 
    private String planeId;
    private String airlinerName;
    private int seatRows;
    private int seatCols;
    private ArrayList<Flight> flightList;

    public Airplane() {
        this.flightList=new ArrayList<>();
    }
    
    

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }

   

    public String getPlaneId() {
        return planeId;
    }

    public void setPlaneId(String planeId) {
        this.planeId = planeId;
    }

   
public Flight addFlight(int rows,int cols){
        Flight flight = new Flight(rows,cols);
        flightList.add(flight);
        return flight;
    }
    
   

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public int getSeatRows() {
        return seatRows;
    }

    public void setSeatRows(int seatRows) {
        this.seatRows = seatRows;
    }

    public int getSeatCols() {
        return seatCols;
    }

    public void setSeatCols(int seatCols) {
        this.seatCols = seatCols;
    }

     @Override
    public String toString(){
        return planeId;
    }
}
