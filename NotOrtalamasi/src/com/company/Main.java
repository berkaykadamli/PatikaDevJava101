package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int mat, turkce, sosyal, fizik, kimya;
        Scanner scan = new Scanner(System.in);
        System.out.println("Matematik Notunuz : ");
        mat = scan.nextInt();

        System.out.println("Turkce Notunuz : ");
        turkce = scan.nextInt();

        System.out.println("Sosyal Notunuz : ");
        sosyal = scan.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = scan.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = scan.nextInt();

        double average = (mat + turkce + sosyal + fizik + kimya) / 5;
        System.out.println((average >= 60) ? "Geçtiniz" : "Kaldiniz");
    }
}
