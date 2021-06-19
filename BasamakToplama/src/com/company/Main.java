package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int n = scan.nextInt();
        int total = 0;
        while (n != 0) {
            total += (n % 10);
            n /= 10;
        }
        System.out.println("Girdiğiniz sayıların basamak toplamı : " + total);
    }
}
