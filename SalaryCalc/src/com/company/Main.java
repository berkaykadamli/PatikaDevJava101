package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adı : ");
        String name = scanner.nextLine();
        System.out.print("Maaşı : ");
        double salary = scanner.nextDouble();
        System.out.print("Çalışma Saati : ");
        int workHours = scanner.nextInt();
        System.out.print("Başlangıç Tarihi : ");
        int hireYear = scanner.nextInt();
        Employee employee = new Employee(name, salary, workHours, hireYear);
        System.out.println("Vergi : " + employee.tax());
        System.out.println("Bonus : " + employee.bonus());
        System.out.println("Maaş Artışı : " + employee.raiseSalary());
        double taxAndBonus = (employee.salary + employee.tax() + employee.bonus());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + taxAndBonus);
        employee.salary = employee.salary + employee.tax() + employee.bonus() + employee.raiseSalary();
        System.out.println("Toplam Maaş : " + employee.salary);

    }
}
