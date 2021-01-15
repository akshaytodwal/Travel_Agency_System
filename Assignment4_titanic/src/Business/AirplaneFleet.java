/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.ArrayList;


public class AirplaneFleet {
    private Airline airline;
    private ArrayList<Airplane> airplaneFleet ;

    public AirplaneFleet() {
        airplaneFleet = new ArrayList<Airplane>();
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public ArrayList<Airplane> getAirplaneFleet() {
        return airplaneFleet;
    }

    public void setAirplaneFleet(ArrayList<Airplane> airplaneFleet) {
        this.airplaneFleet = airplaneFleet;
    }
    
    public Airplane addAirplane()
    {
        Airplane airplane=new Airplane();
        airplaneFleet.add(airplane);
        return airplane;
    }
    
      public void delAirplane(Airplane a)
    {
        this.airplaneFleet.remove(a);
    }
    
}
