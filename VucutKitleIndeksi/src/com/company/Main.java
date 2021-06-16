package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double boy, kilo, indeks;
        System.out.println("Boyunuzu giriniz (Metre Cinsinden örn: 1,90) : ");
        boy = scan.nextDouble();
        System.out.println("Kilonuzu giriniz : ");
        kilo = scan.nextDouble();
        indeks = (kilo / (boy * boy));
        System.out.println("Vücut Kitle Endeksiniz : " + indeks);

    }
}
