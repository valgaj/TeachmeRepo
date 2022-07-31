package com.teachme.se.lesson7.employees;

public class Worker implements JobTitlePrintable  {
    public String jobTitle;

    public Worker(){
        this.jobTitle = "Worker";
    }

    @Override
    public void ShowJobTitle() {
        System.out.println(jobTitle);
    }
}
