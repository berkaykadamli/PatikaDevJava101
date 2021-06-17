package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String zodiac[] = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        System.out.print("Doğum Yılınızı Giriniz : ");
        int yil = scan.nextInt();
        System.out.println("Çin Zodyağı Burcunuz : " + zodiac[yil % 12]);
    }
}
