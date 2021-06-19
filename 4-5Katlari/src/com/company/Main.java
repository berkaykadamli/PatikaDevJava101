package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, j = 1;
        System.out.print("Bir sayi giriniz : ");
        n = scan.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println("4'ün " + j + ". katı : " + i);
            j++;
        }
        System.out.println("----------------------------------------------");
        j = 1;
        System.out.println("5'in katları ");

        for (int i = 1; i <= n; i *= 5) {
            System.out.println("5'in  " + j + ". katı : " + i);
            j++;
        }
    }
}
