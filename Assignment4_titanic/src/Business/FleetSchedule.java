/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.ArrayList;


public class FleetSchedule {
    private Airline airline;
    private ArrayList<PlaneDetails> listOfFlight;

    public FleetSchedule() {
        this.listOfFlight = new ArrayList<PlaneDetails>();
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public ArrayList<PlaneDetails> getListOfFlight() {
        return listOfFlight;
    }

    public void setListOfFlight(ArrayList<PlaneDetails> listOfFlight) {
        this.listOfFlight = listOfFlight;
    }
    
    public PlaneDetails addFlight()
    {
        PlaneDetails flight=new PlaneDetails();
        listOfFlight.add(flight);
        return flight;
    }
}
