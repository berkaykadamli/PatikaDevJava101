package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, max = 0, min = 99999, sayi;
        System.out.print("Kaç Tane Sayı gireceksiniz : ");
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " . Sayıyı Giriniz : ");
            sayi = scan.nextInt();
            max = (sayi > max) ? sayi : max;
            min = (sayi < min) ? sayi : min;
        }
        System.out.println("Min : " + min + "\nMax : " + max);

    }
}
