package com.example.MyThirdSpring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    private String name = "Nitin";

    @Autowired
    private DepartmentBean departmentBean; // Injected via Spring

    public void setDepartmentBean(DepartmentBean departmentBean) {
        this.departmentBean = departmentBean;
    }

    public String getEmployeeDetails() {
        return "Employee: " + name + ", " + departmentBean.toString();
    }
}