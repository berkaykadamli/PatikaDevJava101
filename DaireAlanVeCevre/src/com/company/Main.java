package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pi = Math.PI, alan, a, dilimAlan;
        int r;
        System.out.println("Yaricap giriniz : ");
        r = scan.nextInt();
        System.out.println("Daire Diliminin acisini giriniz :");
        a = scan.nextDouble();
        alan = (r * r) * pi;
        dilimAlan = (alan * a) / 360;

        System.out.println("Dairenin Alani : " + alan);
        System.out.println("Dairenin Merkez aci olcusu " + a + " olan dilimin alani : " + dilimAlan);
    }
}
