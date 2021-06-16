package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik;
        int gecmeNotu = 55;
        System.out.print("Matematik Notunuz: ");
        mat = araliktaMi(scan.nextInt());

        System.out.print("Fizik Notunuz: ");
        fizik = araliktaMi(scan.nextInt());

        System.out.print("Turkce Notunuz: ");
        turkce = araliktaMi(scan.nextInt());

        System.out.print("Kimya Notunuz: ");
        kimya = araliktaMi(scan.nextInt());

        System.out.print("Muzik Notunuz: ");
        muzik = araliktaMi(scan.nextInt());

        double ortalama = (mat + fizik + turkce + kimya + muzik) / 5;
        System.out.println((ortalama>=gecmeNotu)?"Geçtiniz, Ortalamanız : "+ortalama:"Kaldınız, Ortalamanız : "+ortalama);
    }

    public static int araliktaMi(int n) {
        if (n <= 100 || n >= 0) {
            return n;
        } else
            return 0;
    }
}
