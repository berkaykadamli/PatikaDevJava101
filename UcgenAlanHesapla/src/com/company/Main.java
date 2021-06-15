package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.print("Birinci Kenar : ");
        a = scan.nextInt();
        System.out.print("Ikinci Kenar : ");
        b = scan.nextInt();
        System.out.print("Ucuncu Kenar : ");
        c = scan.nextInt();

        double cevre = (a + b + c) / 2;
        double alan = Math.sqrt(cevre * (cevre - a) * (cevre - b) * (cevre - c));
        System.out.println("Girmis oldugunuz kenarlara gore alan : " + alan);
    }
}
