package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isvalid = true;
        System.out.print("Mesafeyi KM türünden giriniz : ");
        int km = scan.nextInt();
        if (km <= 0)
            isvalid = false;
        System.out.print("Yaşınızı giriniz : ");
        int yas = scan.nextInt();
        if (yas <= 0)
            isvalid = false;
        System.out.print("Yolculuk tipini giriniz (1 -> Tek yön, 2-> Gidiş Dönüş): ");
        int secim = scan.nextInt();

        if (!(secim > 0 && secim < 3))
            isvalid = false;

        double total = km * 0.10;
        double indirim = 0;
        if (yas < 12)
            indirim = total * 0.5;
        if (yas < 24)
            indirim = total * 0.1;
        if (yas > 65)
            indirim = total * 0.3;
        total -= indirim;


        if (isvalid) {
            if (secim == 2) {
                indirim = total * 0.2;
                total = (total - indirim) * 2;
            }
            System.out.println("Toplam tutar : " + total);
        } else
            System.out.println("Hatalı Veri Girdiniz !");


    }
}
