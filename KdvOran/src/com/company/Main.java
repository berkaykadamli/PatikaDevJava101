package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the price : ");
        double value = scan.nextDouble();
        double kdv = (value < 1000) ? 0.18 : 0.8;
        double kdvValue = value * kdv;
        System.out.println("KDV'siz Fiyat : " + value);
        System.out.println("KDV'li Fiyat : " + (value + kdvValue));
        System.out.println("KDV' Tutarı : " + kdvValue);
    }
}
