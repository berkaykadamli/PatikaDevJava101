package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        Arrays.sort(arr);
        System.out.print("Girilen Sayı : ");
        int n = scan.nextInt();
        int min = arr[0], max;
        for (int i = 0; i < arr.length; i++) {
            if (n > arr[i]) {
                min = arr[i];
            }
        }
        max = arr[Arrays.binarySearch(arr, min) + 1];
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
