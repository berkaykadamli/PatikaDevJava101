package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        int n = scan.nextInt();
        double total = 0;
        for (double i = 1; i <= n; i++) {
            total += (1 / i);
        }
        System.out.println("Harmonik : " + total);
    }
}

