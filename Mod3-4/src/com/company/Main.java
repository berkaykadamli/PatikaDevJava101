package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, cnt = 0, total = 0;
        System.out.print("Bir sayi giriniz :");
        n = scan.nextInt();
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                cnt++;
            }
        }
        total /= --cnt;// 0'ı da aldığı için cnt yi bir azalttım
        System.out.println("3'e ve 4'e Bölünen sayıların ortalaması : " + total);
    }
}
