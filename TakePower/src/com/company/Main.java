package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban sayı : ");
        int n = scan.nextInt();
        System.out.print("Kuvvet : ");
        int r = scan.nextInt();
        int total = 1;
        for (int i = 0; i < r; i++) {
            total *= n;
        }
        System.out.println("Kuvveti alınmış hali : " + total);

    }
}
