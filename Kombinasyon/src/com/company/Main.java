package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, r, c = 1, n1 = 1, r1 = 1;
        double total = 0;
        System.out.print("Kombinasyon için n : ");
        n = scan.nextInt();
        System.out.print("Kombinasyon için r : ");
        r = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            n1 *= i;
        }
        for (int i = 1; i <= r; i++) {
            r1 *= i;

        }
        for (int i = 1; i <= (n - r); i++) {
            c *= i;
        }
        total = n1 / (r1 * c);
        System.out.println("Kombinasyon : " + total);


    }
}
