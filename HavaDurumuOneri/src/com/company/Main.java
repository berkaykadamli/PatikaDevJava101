package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int temp;
        System.out.println("Sıcaklık : ");
        temp = scan.nextInt();

        if (temp <= 5) {
            System.out.println("Kayak");
        } else if (temp <= 25) {
            if (temp <= 15)
                System.out.println("Sinema");
            if (temp >= 10)
                System.out.println("Piknik");
        } else {
            System.out.println("Yüzme");

        }

    }
}
