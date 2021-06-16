package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String secimString = "1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme";

        System.out.print("İlk Sayi Giriniz : ");
        int a = scan.nextInt();
        System.out.print("İkinci Sayi Giriniz : ");
        int b = scan.nextInt();

        System.out.print(secimString + "\nSeçim : ");
        int secim = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplam : " + (a + b));
                break;
            case 2:
                System.out.println("Çıkarma : " + (a - b));
                break;
            case 3:
                System.out.println("Çarpma : " + (a * b));
                break;
            case 4:
                if (b == 0)
                    System.out.println("Bir sayi sıfıra bölünemez !!");
                else
                    System.out.println("Bölme : " + (a / b));
                break;
            default:
                System.out.println("Yanlış Seçim Yaptınız Tekrar Deneyiniz..");
                break;

        }
    }
}
