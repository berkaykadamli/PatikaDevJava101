package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        int armutSayi, elmaSayi, domSayi, patlSayi, muzSayi;
        System.out.print("Kac kilo Armut :");
        armutSayi = scan.nextInt();

        System.out.print("Kac kilo Elma :");
        elmaSayi = scan.nextInt();

        System.out.print("Kac kilo Domates :");
        domSayi = scan.nextInt();

        System.out.print("Kac kilo Muz :");
        muzSayi = scan.nextInt();

        System.out.print("Kac kilo Patlican :");
        patlSayi = scan.nextInt();

        double toplam = (armut * armutSayi) + (elma * elmaSayi) + (domates * domSayi) + (muz * muzSayi) + (patlican * patlSayi);
        System.out.println("Toplam Odemeniz Gereken Tutar : " + toplam);

    }
}
