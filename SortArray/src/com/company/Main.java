package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Dizinin Boyutu : ");
        int n = scan.nextInt();
        int[] list = new int[n];
        System.out.println("Dizinin Elemanlarını Giriniz : ");
        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            list[i] = scan.nextInt();
        }
        Arrays.sort(list);
        System.out.print("Sıralama : ");
        for (int i : list)
            System.out.print(i + " ");
    }
}
