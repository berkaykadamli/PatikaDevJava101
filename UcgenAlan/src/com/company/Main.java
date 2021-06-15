package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int kenar1, kenar2, kenar3;
        double cevre, alan;
        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci Kenar :");
        kenar1 = scan.nextInt();
        System.out.println("Ikinci Kenar :");
        kenar2 = scan.nextInt();
        System.out.println("Ucuncu Kenar :");
        kenar3 = scan.nextInt();

        cevre = (kenar1 + kenar2 + kenar3)/2;

        alan = Math.sqrt(cevre * (cevre - kenar1) * (cevre - kenar2) * (cevre - kenar3));

        System.out.println("Girdiginiz ucgenin alani : " + alan);
    }
}
