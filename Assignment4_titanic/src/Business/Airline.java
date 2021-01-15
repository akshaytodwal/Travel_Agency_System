/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;


public class Airline {
    
    private String nameOfAirline ;
    private String countryOfOperation ;
    private String mainHub;
    private String airlines;
    private AirplaneFleet  fleet;
    private FleetSchedule fleetschedule ;

    public Airline() {
        
        this.fleetschedule = new FleetSchedule();
    }

 
    
    public FleetSchedule getFleetschedule() {
        return fleetschedule;
    }

    public void setFleetschedule(FleetSchedule flighschedule) {
        this.fleetschedule = flighschedule;
    }
    
    public String getNameOfAirline() {
        return nameOfAirline;
    }
    
    public void setNameOfAirline(String nameOfAirline) {
        this.nameOfAirline = nameOfAirline;
    }

    public String getCountryOfOperation() {
        return countryOfOperation;
    }

    public void setCountryOfOperation(String countryOfOperation) {
        this.countryOfOperation = countryOfOperation;
    }

    public String getMainHub() {
        return mainHub;
    }

    public void setMainHub(String mainHub) {
        this.mainHub = mainHub;
    }


    public AirplaneFleet getFleet() {
        return fleet;
    }

    public void setFleet(AirplaneFleet fleet) {
        this.fleet = fleet;
    }
    

    @Override
    public String toString()
    {
        return this.nameOfAirline;
    }
}
