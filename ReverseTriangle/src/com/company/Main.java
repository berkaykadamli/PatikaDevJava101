package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Basamak sayısı :");
        int n = scan.nextInt() * 2;
        for (int i = 0; i < n; i++) {

            for (int j = n - i; j < n; j++) {//
                System.out.print(" ");
            }
            for (int j = n - i * 2 - 1; j > 0; j--) {
                System.out.print("*");
            }

            for (int j = n - i; j < n; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}