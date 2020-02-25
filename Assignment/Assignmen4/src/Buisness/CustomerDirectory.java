/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author patel
 */
public class CustomerDirectory {
    
    public static List<Customer> customerdirectory;
    

    public CustomerDirectory() {
        customerdirectory=new ArrayList<Customer>();
    }

    public static List<Customer> getCustomerdirectory() {
        return customerdirectory;
    }

    public static void setCustomerdirectory(List<Customer> customerdirectory) {
        CustomerDirectory.customerdirectory = customerdirectory;
    }
    
    public void addCustomer(Customer c){
        customerdirectory.add(c);
    }
}
