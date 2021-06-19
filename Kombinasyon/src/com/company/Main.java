package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r, total;
        System.out.print("Kombinasyon için n : ");
        n = scan.nextInt();
        System.out.print("Kombinasyon için r : ");
        r = scan.nextInt();
        total = fact(n) / (fact(r) * fact(n - r));
        System.out.println("Kombinasyon : " + total);


    }

    static int fact(int n) {
        int j = 1;
        for (int i = 1; i <= n; i++) {
            j *= i;
        }
        return j;
    }
}
