/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.HashMap;
import java.util.Map;


public class TravelAgency {
    
     private String agencyName;
    private Map<String,Airline> listOfAirline; 
    private Schedule schedule;
    private PersonDirectory personDirectory;
    
    public TravelAgency()
    {
        agencyName="FlyHigh";
        listOfAirline=new HashMap<String,Airline>();
        schedule = new Schedule();
        personDirectory = new PersonDirectory();
    }

    public Map<String, Airline> getListOfAirline() {
        return listOfAirline;
    }

    public void setListOfAirline(Map<String, Airline> listOfAirline) {
        this.listOfAirline = listOfAirline;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    
    public Airline addAirline(String s)
    {
        Airline airline=new Airline();
        airline.setNameOfAirline(s);
        listOfAirline.put(airline.getNameOfAirline(),airline);
        return airline;
    }
}
