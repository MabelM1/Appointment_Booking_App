package com.example.android.secondtry;

/**
 * Created by Mabel on 8/12/17.
 */


//This handles all appointment information.
public class Appointment {

    private String username = "ANONYMUS";
    private String month;
    private String day;
    private String year;
    private String time;
    private String name;
    private String address;
    private String contactNum;


    public Appointment() {
        username = "ANONYMUS";
        month = null;
        day = null;
        year = null;
        time = null;
        name = null;
        address = null;
        contactNum = null;
    }

    public Appointment(String month, String day, String year, String time, String name, String address, String contactNum) {
        username = "ANONYMUS";
        this.month = month;
        this.day = day;
        this.year = year;
        this.time = time;
        this.name = name;
        this.address = address;
        this.contactNum = contactNum;
    }

    public void setUsername() {

    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactNum(String contactNum){
        this.contactNum = contactNum;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public String getYear() {
        return year;
    }

    public String getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContactNum() {
        return contactNum;
    }


}