package com.example.MyThirdSpring.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {

    private String deptName = "Engineering";

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Department: " + deptName;
    }
}