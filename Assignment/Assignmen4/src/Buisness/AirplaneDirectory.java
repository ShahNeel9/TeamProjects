/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patel
 */
public class AirplaneDirectory {
    
    public static List<Airplane> airplanedirectory;

    public AirplaneDirectory() {
        airplanedirectory = new ArrayList<Airplane>();
    }
    
    

    public static List<Airplane> getAirplanedirectory() {
        return airplanedirectory;
    }

    public static void setAirplanedirectory(List<Airplane> airplanedirectory) {
        AirplaneDirectory.airplanedirectory = airplanedirectory;
    }
    
    public void addAirplane(Airplane a){
        airplanedirectory.add(a);
    }
}
