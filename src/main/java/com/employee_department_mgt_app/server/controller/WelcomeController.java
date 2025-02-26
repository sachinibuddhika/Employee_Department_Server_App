package com.employee_department_mgt_app.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/auth")
public class WelcomeController {

    @GetMapping("welcome")
    public String welcome() {
        return "Welcome to Employee_Department_Mgt_System";
    }
}
