package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int secim;
        do {
            System.out.println("---------------------------------------");
            System.out.println("1- Toplama İşlemi\n" +
                    "2- Çıkarma İşlemi\n" +
                    "3- Çarpma İşlemi\n" +
                    "4- Bölme İşlemi\n" +
                    "5- Üslü Sayı Bulma İşlemi\n" +
                    "6- Faktoriyel Hesaplama\n" +
                    "7- Mod Alma\n" +
                    "8- Dikdörtgen Alan ve Çevre Hesabı");
            System.out.print("Yapacağınız işlemi Seçiniz : ");
            secim = scan.nextInt();
            switch (secim) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikartma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    fact();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış Seçim Yaptınız, Tekrar Deneyiniz !");
                    break;
            }
        } while (secim != 0);

    }

    private static void rectangle() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kısa Kenar : ");
        int a = scan.nextInt();
        System.out.print("Uzun Kenar : ");
        int b = scan.nextInt();
        System.out.println("Alanı : " + (a * b) + "\nÇevresi : " + (2 * (a + b)));
    }

    private static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Modu Alınacak Sayı : ");
        int a = scan.nextInt();
        System.out.print("Mod : ");
        int b = scan.nextInt();
        System.out.println(a + " Sayısının " + b + " Sayısına Modu : " + (a % b));
    }


    private static void fact() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Faktoriyel Alınacak Sayı : ");
        int n = scan.nextInt();
        int total = 1;
        for (int i = 1; i <= n; i++) {
            total *= i;
        }
        System.out.println("Sonuç : " + total);

    }

    private static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban sayı : ");
        int n = scan.nextInt();
        System.out.print("Üs Sayı : ");
        int pow = scan.nextInt();
        int total = 1;
        for (int i = 1; i <= pow; i++) {
            total *= n;
        }
        System.out.println("Sonuc : " + total);
    }

    private static void bolme() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        double n, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı : ");
            n = scan.nextDouble();
            if (i != 1 && n == 0) {
                System.out.println("Bir Sayı 0'a Bölünemez.");
                continue;
            }
            if (i == 1) {
                result = n;
                continue;
            }
            result /= n;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void carpma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz : ");
        int n = scan.nextInt();
        int n1, total = 1;
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " . Sayi : ");
            n1 = scan.nextInt();
            total *= n1;
        }
        System.out.println("Çarpma işleminin Sonucu : " + total);
    }

    private static void cikartma() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı :");
            number = scan.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç : " + result);
    }

    private static void toplama() {
        Scanner scan = new Scanner(System.in);
        int total = 0, n, i = 0;
        System.out.print("Kaç Sayı Gireceksiniz : ");
        int k = scan.nextInt();
        while (i < k) {
            System.out.print((i + 1) + " . sayi : ");
            n = scan.nextInt();
            if (n == 0)
                break;
            total += n;
            i++;
        }
        System.out.println("Toplam : " + total);
    }
}
