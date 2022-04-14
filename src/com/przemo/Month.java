package com.przemo;

public class Month {
    private String name;
    private int days;

    public Month(String name, int days) {
        this.name = name;
        this.days = days;
    }
    public Month(String name,int days, boolean isLeap){

            this(name,days -(isLeap?1:0));
    }


    public String getData(){

        return name+"-"+days;
    }

}
