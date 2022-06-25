package com.example.maintenancemonitor;

public class MaintenanceMonitor {

    String message = null;


    public String set(String set) {
        message = set;
        return message;
    }

    public String reset(String reset) {
        if (reset.equals("yes") || reset.equals("ja")){
            message = null;
            return "reset successful";
        }
        return "reset unsuccessful";
    }
}
