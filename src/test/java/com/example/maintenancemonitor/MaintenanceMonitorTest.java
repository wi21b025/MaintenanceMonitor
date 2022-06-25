package com.example.maintenancemonitor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaintenanceMonitorTest {

    MaintenanceMonitor mon = new MaintenanceMonitor();

    @Test
    void setTest1(){
        String res = mon.set("");
        String expRes = "";

        assertEquals(expRes, res);
    }
    @Test
    void setTest2(){
        String res = mon.set("We have a server problem until 2pm UTC+1");
        String expRes = "We have a server problem until 2pm UTC+1";

        assertEquals(expRes, res);
    }

    @Test
    void resetTest1(){
        String res = mon.reset("yes");
        String expRes = "reset successful";

        assertEquals(expRes, res);
    }
    @Test
    void resetTest2(){
        String res = mon.reset("maybe");
        String expRes = "reset unsuccessful";

        assertEquals(expRes, res);
    }

    @Test
    void deliverTest1(){
        String res = mon.deliver();
        String expRes = null;

        assertEquals(expRes, res);
    }

    @Test
    void deliverTest2(){
        mon.set("We have a server problem until 2pm UTC+1");
        String res = mon.deliver();
        String expRes = "We have a server problem until 2pm UTC+1";

        assertEquals(expRes,res);
    }

}