package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayisini Giriniz : ");
        int n = scan.nextInt();
        System.out.print("Çıktısı : ");
        boolean isOk = true;
        rec_method(n, n, isOk);
    }

    private static void rec_method(int n, int b, boolean isOk) {

        if (n > 0 && isOk) {
            System.out.print(" " + n);
            rec_method(n - 5, b, isOk);
        } else {
            isOk = false;
            System.out.print(" " + n);
            if (n == b) {
                return;
            }
            rec_method(n + 5, b, isOk);
        }
    }


}
