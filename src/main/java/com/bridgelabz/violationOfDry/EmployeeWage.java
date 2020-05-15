package com.bridgelabz.violationOfDry;

public class EmployeeWage {
    public static final int IsPresent = 1;

    public static void main(String[] args) {
        isGovtEmployeePresent();
        isPrivateEmployeePresent();
    }

    public static void isGovtEmployeePresent() {
        double empAttendance = Math.floor(Math.random() * 10) % 2;
        if (empAttendance == IsPresent) {
            System.out.println("govt employee is present today");
        } else
            System.out.println("govt employee is absent today");
    }

    public static void isPrivateEmployeePresent() {
        double empAttendance = Math.floor(Math.random() * 10) % 2;
        if (empAttendance == IsPresent) {
            System.out.println("employee of private Enterprise is present today");
        } else
            System.out.println("employee of private Enterprise is absent today");
    }


}