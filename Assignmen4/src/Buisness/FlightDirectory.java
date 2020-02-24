/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author patel
 */
public class FlightDirectory {
    
    public static ArrayList<Flight> flightdirectory;
    private Flight flight;
    private AirlinerDirectory airDirectory;

    
    public FlightDirectory() {
        flightdirectory = new ArrayList<Flight>();
    }
    
    public static ArrayList<Flight> getFlightdirectory() {
        return flightdirectory;
    }

    public static void setFlightdirectory(ArrayList<Flight> flightdirectory) {
        FlightDirectory.flightdirectory = flightdirectory;
    }
    
    public void addFlight(Flight f){
        flightdirectory.add(f);
    }
    
    public List<Flight> getflightlist(){
        return flightdirectory;
    }
    
    public void removeflight(Flight f){
        flightdirectory.remove(f);
    }
    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public AirlinerDirectory getAirDirectory() {
        return airDirectory;
    }

    public void setAirDirectory(AirlinerDirectory airDirectory) {
        this.airDirectory = airDirectory;
    }
public ArrayList<Flight> searchMaster(String destination, String source, String tod, Date date){
        ArrayList<Flight> flightDirFiltered= new ArrayList<Flight>();
        for(Flight f: flightdirectory)
        {
            if(f.getDestination().equalsIgnoreCase(destination) && f.getSource().equalsIgnoreCase(source) && f.getTime().equals(tod) && f.getDate().equals(date))
            {
                flightDirFiltered.add(f);
            }
        }
    return flightDirFiltered;
    }
}
