/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.ArrayList;


public class Airplane {
    
    private int    airplaneId;
    private String airplaneName ;
    private String modelNumber;
    private String manufacturingCompany;
    private int    manufacturingYear;
    private int    totalSeats;
    private String airline ; 
    private ArrayList<PlaneDetails> airplaneListOfFlight;
    private AirplaneFleet airplaneFleet;

    public AirplaneFleet getAirplaneFleet() {
        return airplaneFleet;
    }

    public void setAirplaneFleet(AirplaneFleet airplaneFleet) {
        this.airplaneFleet = airplaneFleet;
    }
    

    public Airplane() {
        airplaneListOfFlight= new ArrayList<PlaneDetails>();
    }
    
    

    public ArrayList<PlaneDetails> getAirplaneListOfFlight() {
        return airplaneListOfFlight;
    }

    public void setAirplaneListOfFlight(ArrayList<PlaneDetails> airplaneListOfFlight) {
        this.airplaneListOfFlight = airplaneListOfFlight;
    }

    public String getAirline() {
        return airline;
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(int airplaneId) {
        this.airplaneId = airplaneId;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getManufacturingCompany() {
        return manufacturingCompany;
    }

    public void setManufacturingCompany(String manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }
    
     @Override
    public String toString()
    {
        return String.valueOf(this.airplaneId);
    }
}
