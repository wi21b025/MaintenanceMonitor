package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.*;

@RestController
public class MaintenanceMonitorController {

    MaintenanceMonitor mon = new MaintenanceMonitor();

    @RequestMapping("/set")
    public void set(String message) {
        mon.set(message);
    }
}
