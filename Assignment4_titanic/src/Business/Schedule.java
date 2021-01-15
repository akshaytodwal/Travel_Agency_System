/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;


public class Schedule {
    
     private ArrayList<FleetSchedule> listOfFlightSchedules;
      public Schedule()
    {
        listOfFlightSchedules = new ArrayList<FleetSchedule>();
    }

    public ArrayList<FleetSchedule> getListOfFlightSchedules() {
        return listOfFlightSchedules;
    }

    public void setListOfFlightSchedules(ArrayList<FleetSchedule> listOfFlightSchedules) {
        this.listOfFlightSchedules = listOfFlightSchedules;
    }
    
    public FleetSchedule addFleetSchedule(Airline a)
    {
        FleetSchedule flightSchedule=new FleetSchedule();
        flightSchedule.setAirline(a);
        listOfFlightSchedules.add(flightSchedule);
        return flightSchedule;
    }
}
