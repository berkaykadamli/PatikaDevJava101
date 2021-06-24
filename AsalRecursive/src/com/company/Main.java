package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int n = scan.nextInt();
        System.out.println(asalMi(n, n) ? n + " Sayısı Asal Değildir !" : n + " Sayısı Asaldır !");
    }

    private static boolean asalMi(int n, int a) {
        if (a == 2)
            return false;
        if (a % 2 == 0)
            return true;
        if (n == 1)
            return false;
        if (a % n == 0 && n != a)
            return true;


        return asalMi(n - 1, a);
    }
}
