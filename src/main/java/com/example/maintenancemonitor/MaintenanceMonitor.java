package com.example.maintenancemonitor;

public class MaintenanceMonitor {

    String message = null;
    String color = "limegreen";


    public String set(String set) {
        if(set != null && !set.trim().equals("")){
            message = set;
            color = "indianred";
        }
        return message;
    }

    public String reset(String reset) {
        if (reset.equals("yes") || reset.equals("ja")){
            message = null;
            color = "limegreen";
            return "reset successful";
        }
        return "reset unsuccessful";
    }

    public String deliver(){
         return this.message;
    }

    public String color(){
        return this.color;
    }
}