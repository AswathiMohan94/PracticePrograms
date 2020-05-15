package com.bridgelabz.dryPrinciple;

public class EmployeeWage {
    public static final int IsPresent = 1;

    public static void main(String[] args) {
        String govtEmployee = null;
        String pvtEmployee = null;
        isEmployeePresent(govtEmployee,1);
        isEmployeePresent(pvtEmployee,2);
    }

    public static void isEmployeePresent(String typeOfEmployee, int id) {
        double empAttendance = Math.floor(Math.random() * 10) % 2;
        if (empAttendance == IsPresent) {
            System.out.println("govt employee is present today and id is "+id);
        } else
            System.out.println("govt employee is absent today and id is"+id);
    }
}