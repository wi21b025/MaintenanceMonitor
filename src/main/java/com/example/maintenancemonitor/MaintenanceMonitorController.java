package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.*;

@RestController
public class MaintenanceMonitorController {

    MaintenanceMonitor mon = new MaintenanceMonitor();

    @RequestMapping("/set")
    public String set(String message) {
        return "This is your set message: "
                + mon.set(message);
    }

    @RequestMapping("/reset")
    public String reset(String reset) {
        return mon.reset(reset);
    }
}
