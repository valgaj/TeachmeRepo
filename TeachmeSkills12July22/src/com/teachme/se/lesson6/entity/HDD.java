package com.teachme.se.lesson6.entity;

public class HDD {
    String hddTitle;
    int hddCapacity;
    String hddType; //external or internal) //

    public HDD() {

    }

    public HDD (String hddTitle, int hddCapacity,String hddType) {
        this.hddTitle = hddTitle;
        this.hddCapacity = hddCapacity;
        this.hddType = hddType;
    }

    public String toString () {
        return "HDD{" +
                "title=" + hddTitle +
                ", capacity=" + hddCapacity +
                ", type=" +hddType +
                '}';
    }
}
