package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n = 0, total = 0;
        Scanner scan = new Scanner(System.in);

        while (n % 2 == 0) {
            System.out.print("Bir Sayi giriniz : ");
            n = scan.nextInt();
            if (n % 4 == 0) {
                total += n;
            }
        }
        System.out.println("Girilen Sayilarin 4'un katı olanların Toplami : " + total);
    }
}
