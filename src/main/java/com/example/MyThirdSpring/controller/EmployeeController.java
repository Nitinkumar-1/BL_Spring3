package com.example.MyThirdSpring.controller;

//import com.example.app.model.EmployeeBean;
import com.example.MyThirdSpring.component.EmployeeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    private final EmployeeBean employeeBean;

    public EmployeeController(EmployeeBean employeeBean) {
        this.employeeBean = employeeBean;
    }

    @GetMapping("/employee")
    public String getEmployeeDetails() {
        return employeeBean.getEmployeeDetails();
    }
}