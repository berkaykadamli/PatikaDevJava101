package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        int yil = scan.nextInt();
        if (yil % 4 == 0 || yil % 400 == 0) {
            System.out.println(yil+" Bir artık yıldır !");
        }else
            System.out.println(yil+" Bir artık yıl değildir !");
    }
}
