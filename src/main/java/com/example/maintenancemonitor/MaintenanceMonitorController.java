package com.example.maintenancemonitor;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@CrossOrigin
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

    @RequestMapping("/deliver")
    public String deliver(){
        return mon.deliver();
    }

    @RequestMapping("/color")
    public String color() {
        return mon.color();
    }

    @RequestMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    } // https://stackoverflow.com/a/47170750
}