package com.teachme.se.lesson6.entity;

public class RAM {
     String ramTitle;
      int ramCapacity;

    public RAM () {
        this.ramTitle = "--";

    }

    public RAM (String ramTitle, int ramCapacity) {
        this.ramTitle = ramTitle;
        this.ramCapacity = ramCapacity;
    }

    public String toString () {
        return "RAM{" +
                "title=" + ramTitle +
                ", capacity=" + ramCapacity +
                '}';
    }
}
