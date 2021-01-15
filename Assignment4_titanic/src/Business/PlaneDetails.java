/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import java.util.ArrayList;
import java.util.Date;


public class PlaneDetails {
    
    private int flightId;
    private Date depatureDate;
    private String depatureTime;
    private String depaturePort;
    private String destinationPort;
    private double priceOfSeat;
    private boolean cancelFlag;
    private ArrayList<Seat> listOfSeats;
    private Airplane airplane;

    public PlaneDetails() {
        cancelFlag = false;
        listOfSeats = new ArrayList<Seat>();
        seatsInitialization();
    }
    
    public void seatsInitialization()
    {
        byte j,i;
        char column;
        for (i=0;i<3;i++)
        {
            if (i==0)
                column='W';
            else if (i==1)
                column='M';
            else   
                column='A';
          
            for (j=1;j<26;j++)
            {
                Seat seat = new Seat();
                seat.setFlight(this);
                seat.setPosition(column+String.valueOf(j));
                listOfSeats.add(seat);
            }
                  
        }
    }
    
    public Seat bookingSeat(String seatNum)
    {
       for (Seat s: this.getListOfSeats())
       {
           if (seatNum.matches(s.getPosition()))
           {
               s.setBooked(true);
               return s;
           }
       }
       return null;
    }
    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public Date getDepatureDate() {
        return depatureDate;
    }

    public void setDepatureDate(Date depatureDate) {
        this.depatureDate = depatureDate;
    }

    public String getDepatureTime() {
        return depatureTime;
    }

    public void setDepatureTime(String depatureTime) {
        this.depatureTime = depatureTime;
    }

    public String getDepaturePort() {
        return depaturePort;
    }

    public void setDepaturePort(String depaturePort) {
        this.depaturePort = depaturePort;
    }

    public String getDestinationPort() {
        return destinationPort;
    }

    public void setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
    }

    public double getPriceOfSeat() {
        return priceOfSeat;
    }

    public void setPriceOfSeat(double priceOfSeat) {
        this.priceOfSeat = priceOfSeat;
    }

    public boolean isCancelFlag() {
        return cancelFlag;
    }

    public void setCancelFlag(boolean cancelFlag) {
        this.cancelFlag = cancelFlag;
    }

    public ArrayList<Seat> getListOfSeats() {
        return listOfSeats;
    }

    public void setListOfSeats(ArrayList<Seat> listOfSeats) {
        this.listOfSeats = listOfSeats;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
    
       public String toString()
   {
       return this.getAirplane().getAirline();
   }
    
    
}
