/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;


public class Seat {
    private String position;
    private boolean booked;
   
    private PlaneDetails flight;
    private Person person;
    
    public Seat()
    {
        booked=false;
        position="";        
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public PlaneDetails getFlight() {
        return flight;
    }

    public void setFlight(PlaneDetails flight) {
        this.flight = flight;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    @Override
    public String toString()
    {
        return this.position;
    }
}
