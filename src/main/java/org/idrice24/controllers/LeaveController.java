package org.idrice24.controllers;

import org.idrice24.services.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LeaveController {
    private LeaveService leaveService;

    @Autowired
    public void setLeave(LeaveService leaveService){
        this.leaveService = leaveService;
    }

}
