/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class AirlinerDirectory {
    
    private ArrayList<Airliner> airlinedirectory;

    public AirlinerDirectory() {
        airlinedirectory = new ArrayList<>();
    }

    public ArrayList<Airliner> getAirlinedirectory() {
        return airlinedirectory;
    }

    public void setAirlinedirectory(ArrayList<Airliner> airlinedirectory) {
        this.airlinedirectory = airlinedirectory;
    }
    
    public void addAirline(Airliner a){
        airlinedirectory.add(a);
    }
    
    public void removeAirline(Airliner a){
        airlinedirectory.remove(a);
    }
    
    public Airliner SearchAirliner(String name){
        for(Airliner airliner : this.airlinedirectory){
            if(airliner.getName().equals(name))
                return airliner;
        }
        return null;
    }
}
