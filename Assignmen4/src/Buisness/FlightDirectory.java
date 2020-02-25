/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import UserInterface.TravelAgency.ManageMasterFlightScheduleJPanel;
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
       // constantFlightSchedule();
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
                System.out.println("+++++++++++++++++++" +f.toString());
                
            }
        }
        System.out.println("++++++++++++++++++++++++++++" +destination +source + tod +date);
        System.out.println("++++++++++++++++++++++" +flightDirFiltered);
    return flightDirFiltered;
    
    }

/*public void constantFlightSchedule(){
    String[][] arr = {  {"British Airways","ba01","Boston","los angeles","01:30","4:30","100.0","Morning","3"},
                            {"British Airways","ba02","boston","las vegas","01:30","4:30","100.0","Afternoon","3"},
                            {"American Airways","aa01","boston","los angles","01:30","4:30","100.0","Morning","4"},
                            {"American Airways","aa02","boston","las vegas","01:30","4:30","100.0","Afternoon","4"},
                            {"Jet Airways","ja01","boston","los angles","01:30","4:30","100.0","Morning","4"},
                            {"Jet Airways","ja02","boston","las vegas","01:30","4:30","100.0","Afternoon","4"},
                            {"Indian Airways","ia01","boston","los angles","01:30","4:30","100.0","Morning","4"},
                            {"Indian Airways","ia02","boston","las vegas","01:30","4:30","100.0","Evening","4"},
                            {"Chineese Airways","ca01","boston","los angles","01:30","4:30","100.0","Night","4"},
                            {"Chineese Airways","ca02","boston","las vegas","01:30","4:30","100.0","Night","4"},
                            {"Aerlingus Airways","aea01","boston","los angles","01:30","4:30","100.0","Morning","4"},
                            {"Aerlingus Airways","aea02","boston","las vegas","01:30","4:30","100.0","Morning","4"}
                         };

        for(int i=0;i<arr.length;i++) {
            Flight temp = new Flight();

            temp.setAirline(arr[i][0]);
            temp.setFlightnumber(arr[i][1]);
            temp.setSource(arr[i][2]);
            temp.setDestination(arr[i][3]);
            temp.setDepTime(arr[i][4]);
            temp.setArrTime(arr[i][5]);
            temp.setPrice(Double.parseDouble(arr[i][6]));
            temp.setTime(arr[i][7]);
            temp.setDuration(Integer.parseInt(arr[i][8]));
            //SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            //Date date = formatter.parse(temp.setDate(arr[i][9]));
            //temp.setDate(arr[i][9]);
            // setting objects
            Seats seats = new Seats();
            temp.setSeats(seats);
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            String dateInString = "22/02/2020";

            try {

                Date date = formatter.parse(dateInString);
                //System.out.println(formatter.format(date));
                temp.setDate(date);
            } catch (ParseException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Please enter date in dd/mm/yyyy format");
                return;
            }
            flightdirectory.add(temp);
        }

    
}*/
}
