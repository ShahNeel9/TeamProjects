/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisness;

/**
 *
 * @author patel
 */
public class Customer {
    
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String ssn;
    private int age;
    private String Seatnumber;
    private Flight flightBooked;
    private String seatBooked;
    private int price;

    public Flight getFlightBooked() {
        return flightBooked;
    }

    public void setFlightBooked(Flight flightBooked) {
        this.flightBooked = flightBooked;
    }

    public String getSeatBooked() {
        return seatBooked;
    }

    public void setSeatBooked(String seatBooked) {
        this.seatBooked = seatBooked;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSeatnumber() {
        return Seatnumber;
    }

    public void setSeatnumber(String Seatnumber) {
        this.Seatnumber = Seatnumber;
    }
    
    
    
}
