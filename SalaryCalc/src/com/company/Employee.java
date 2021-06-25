package com.company;


/*
 *Created by Berkay KADAMLI
 */
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return (salary * 0.03);
        }
    }

    int bonus() {
        int s = 0;
        if (workHours > 40) {
            int temp = workHours - 40;
            for (int i = 0; i < temp; i++) {
                s = temp + 30;
            }
        }
        return s;

    }

    int raiseSalary() {
        int year = 2021 - hireYear;
        if (year < 10) {
            return (int) (salary * 0.05);
        } else if (year < 20) {
            return (int) (salary * 0.1);
        } else {
            return (int) (salary * 0.15);
        }
    }

    @Override
    public String toString() {
        return "Name : " + this.name +
                "\nSalary : " + this.salary +
                "\nWork Hours : " + this.workHours +
                "\nHire Year : " + this.hireYear;
    }
}
