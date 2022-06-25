package com.example.maintenancemonitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorTest {

    MaintenanceMonitor mon = new MaintenanceMonitor();

    @Test
    void setTest1(){
        mon.set("");
        String res = mon.message;
        String expRes = "";

        assertEquals(expRes, res);
    }
    @Test
    void setTest2(){

        mon.set("We have a server problem until 2pm UTC+1");
        String res = mon.message;
        String expRes = "We have a server problem until 2pm UTC+1";

        assertEquals(expRes, res);
    }
}