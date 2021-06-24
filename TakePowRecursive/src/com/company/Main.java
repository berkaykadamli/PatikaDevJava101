package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban Sayı : ");
        int a = scan.nextInt();
        System.out.print("Üs Sayı : ");
        int b = scan.nextInt();

        System.out.println("Sonuç : " + recursive(a, b));
    }

    private static int recursive(int a, int b) {
        if (b == 0)
            return 1;
        return a * recursive(a, b - 1);
    }



}
