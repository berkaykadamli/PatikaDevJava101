package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int n, total = 0;
        System.out.print("Bir sayı giriniz : ");
        n = scan.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }
        System.out.println((total == n) ? n + " Mükemmel sayıdır !" : n + " Mükemmel Sayı değildir !");
        // 28 = 1+ 2 +  4 +7+14+28


    }
}
