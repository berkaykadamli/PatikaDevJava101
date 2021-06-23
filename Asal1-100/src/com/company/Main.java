package com.company;

public class Main {


    public static void main(String[] args) {

        for (int sayi = 2; sayi <= 100; sayi++) {
            int cnt = 0;

            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    cnt = 1;
                    break;
                }
            }

            if (cnt == 0) {
                System.out.print(sayi + " ");

            }
        }
    }
}

